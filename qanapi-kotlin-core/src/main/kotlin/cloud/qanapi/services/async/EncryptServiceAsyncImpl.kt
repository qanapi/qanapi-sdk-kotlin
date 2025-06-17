// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.handlers.errorHandler
import cloud.qanapi.core.handlers.jsonHandler
import cloud.qanapi.core.handlers.withErrorHandler
import cloud.qanapi.core.http.HttpMethod
import cloud.qanapi.core.http.HttpRequest
import cloud.qanapi.core.http.HttpResponse.Handler
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.core.http.json
import cloud.qanapi.core.http.parseable
import cloud.qanapi.core.prepareAsync
import cloud.qanapi.models.encrypt.EncryptEncryptDataParams
import cloud.qanapi.models.encrypt.EncryptEncryptDataResponse

class EncryptServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EncryptServiceAsync {

    private val withRawResponse: EncryptServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EncryptServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EncryptServiceAsync =
        EncryptServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun encryptData(
        params: EncryptEncryptDataParams,
        requestOptions: RequestOptions,
    ): EncryptEncryptDataResponse =
        // post /encrypt
        withRawResponse().encryptData(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EncryptServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EncryptServiceAsync.WithRawResponse =
            EncryptServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val encryptDataHandler: Handler<EncryptEncryptDataResponse> =
            jsonHandler<EncryptEncryptDataResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun encryptData(
            params: EncryptEncryptDataParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EncryptEncryptDataResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("encrypt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { encryptDataHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
