package cloud.qanapi.client.okhttp

import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.Timeout
import cloud.qanapi.core.http.Headers
import cloud.qanapi.core.http.HttpClient
import cloud.qanapi.core.http.HttpMethod
import cloud.qanapi.core.http.HttpRequest
import cloud.qanapi.core.http.HttpRequestBody
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.errors.QanapiIoException
import java.io.IOException
import java.io.InputStream
import java.net.Proxy
import java.time.Duration
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.X509TrustManager
import kotlinx.coroutines.suspendCancellableCoroutine
import okhttp3.Call
import okhttp3.Callback
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import okio.BufferedSink

class OkHttpClient private constructor(private val okHttpClient: okhttp3.OkHttpClient) :
    HttpClient {

    override fun execute(request: HttpRequest, requestOptions: RequestOptions): HttpResponse {
        val call = newCall(request, requestOptions)

        return try {
            call.execute().toResponse()
        } catch (e: IOException) {
            throw QanapiIoException("Request failed", e)
        } finally {
            request.body?.close()
        }
    }

    override suspend fun executeAsync(
        request: HttpRequest,
        requestOptions: RequestOptions,
    ): HttpResponse {
        val call = newCall(request, requestOptions)

        return try {
            call.executeAsync().toResponse()
        } catch (e: IOException) {
            throw QanapiIoException("Request failed", e)
        } finally {
            request.body?.close()
        }
    }

    override fun close() {
        okHttpClient.dispatcher.executorService.shutdown()
        okHttpClient.connectionPool.evictAll()
        okHttpClient.cache?.close()
    }

    private fun newCall(request: HttpRequest, requestOptions: RequestOptions): Call {
        val clientBuilder = okHttpClient.newBuilder()

        val logLevel =
            when (System.getenv("QANAPI_LOG")?.lowercase()) {
                "info" -> HttpLoggingInterceptor.Level.BASIC
                "debug" -> HttpLoggingInterceptor.Level.BODY
                else -> null
            }
        if (logLevel != null) {
            clientBuilder.addNetworkInterceptor(
                HttpLoggingInterceptor().setLevel(logLevel).apply {
                    redactHeader("x-qanapi-authorization")
                    redactHeader("Authorization")
                }
            )
        }

        requestOptions.timeout?.let {
            clientBuilder
                .connectTimeout(it.connect())
                .readTimeout(it.read())
                .writeTimeout(it.write())
                .callTimeout(it.request())
        }

        val client = clientBuilder.build()
        return client.newCall(request.toRequest(client))
    }

    private suspend fun Call.executeAsync(): Response =
        suspendCancellableCoroutine { continuation ->
            continuation.invokeOnCancellation { this.cancel() }

            enqueue(
                object : Callback {
                    override fun onFailure(call: Call, e: IOException) {
                        continuation.resumeWith(Result.failure(e))
                    }

                    override fun onResponse(call: Call, response: Response) {
                        continuation.resumeWith(Result.success(response))
                    }
                }
            )
        }

    private fun HttpRequest.toRequest(client: okhttp3.OkHttpClient): Request {
        var body: RequestBody? = body?.toRequestBody()
        if (body == null && requiresBody(method)) {
            body = "".toRequestBody()
        }

        val builder = Request.Builder().url(toUrl()).method(method.name, body)
        headers.names().forEach { name ->
            headers.values(name).forEach { builder.header(name, it) }
        }

        if (
            !headers.names().contains("X-Stainless-Read-Timeout") && client.readTimeoutMillis != 0
        ) {
            builder.header(
                "X-Stainless-Read-Timeout",
                Duration.ofMillis(client.readTimeoutMillis.toLong()).seconds.toString(),
            )
        }
        if (!headers.names().contains("X-Stainless-Timeout") && client.callTimeoutMillis != 0) {
            builder.header(
                "X-Stainless-Timeout",
                Duration.ofMillis(client.callTimeoutMillis.toLong()).seconds.toString(),
            )
        }

        return builder.build()
    }

    /** `OkHttpClient` always requires a request body for some methods. */
    private fun requiresBody(method: HttpMethod): Boolean =
        when (method) {
            HttpMethod.POST,
            HttpMethod.PUT,
            HttpMethod.PATCH -> true
            else -> false
        }

    private fun HttpRequest.toUrl(): String {
        val builder = baseUrl.toHttpUrl().newBuilder()
        pathSegments.forEach(builder::addPathSegment)
        queryParams.keys().forEach { key ->
            queryParams.values(key).forEach { builder.addQueryParameter(key, it) }
        }

        return builder.toString()
    }

    private fun HttpRequestBody.toRequestBody(): RequestBody {
        val mediaType = contentType()?.toMediaType()
        val length = contentLength()

        return object : RequestBody() {
            override fun contentType(): MediaType? = mediaType

            override fun contentLength(): Long = length

            override fun isOneShot(): Boolean = !repeatable()

            override fun writeTo(sink: BufferedSink) = writeTo(sink.outputStream())
        }
    }

    private fun Response.toResponse(): HttpResponse {
        val headers = headers.toHeaders()

        return object : HttpResponse {
            override fun statusCode(): Int = code

            override fun headers(): Headers = headers

            override fun body(): InputStream = body!!.byteStream()

            override fun close() = body!!.close()
        }
    }

    private fun okhttp3.Headers.toHeaders(): Headers {
        val headersBuilder = Headers.builder()
        forEach { (name, value) -> headersBuilder.put(name, value) }
        return headersBuilder.build()
    }

    companion object {
        fun builder() = Builder()
    }

    class Builder internal constructor() {

        private var timeout: Timeout = Timeout.default()
        private var proxy: Proxy? = null
        private var sslSocketFactory: SSLSocketFactory? = null
        private var trustManager: X509TrustManager? = null
        private var hostnameVerifier: HostnameVerifier? = null

        fun timeout(timeout: Timeout) = apply { this.timeout = timeout }

        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        fun proxy(proxy: Proxy?) = apply { this.proxy = proxy }

        fun sslSocketFactory(sslSocketFactory: SSLSocketFactory?) = apply {
            this.sslSocketFactory = sslSocketFactory
        }

        fun trustManager(trustManager: X509TrustManager?) = apply {
            this.trustManager = trustManager
        }

        fun hostnameVerifier(hostnameVerifier: HostnameVerifier?) = apply {
            this.hostnameVerifier = hostnameVerifier
        }

        fun build(): OkHttpClient =
            OkHttpClient(
                okhttp3.OkHttpClient.Builder()
                    .connectTimeout(timeout.connect())
                    .readTimeout(timeout.read())
                    .writeTimeout(timeout.write())
                    .callTimeout(timeout.request())
                    .proxy(proxy)
                    .apply {
                        val sslSocketFactory = sslSocketFactory
                        val trustManager = trustManager
                        if (sslSocketFactory != null && trustManager != null) {
                            sslSocketFactory(sslSocketFactory, trustManager)
                        } else {
                            check((sslSocketFactory != null) == (trustManager != null)) {
                                "Both or none of `sslSocketFactory` and `trustManager` must be set, but only one was set"
                            }
                        }

                        hostnameVerifier?.let(::hostnameVerifier)
                    }
                    .build()
                    .apply {
                        // We usually make all our requests to the same host so it makes sense to
                        // raise the per-host limit to the overall limit.
                        dispatcher.maxRequestsPerHost = dispatcher.maxRequests
                    }
            )
    }
}
