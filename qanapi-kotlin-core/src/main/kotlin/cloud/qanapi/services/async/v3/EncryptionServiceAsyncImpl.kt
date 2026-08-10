// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.handlers.errorBodyHandler
import cloud.qanapi.core.handlers.errorHandler
import cloud.qanapi.core.handlers.jsonHandler
import cloud.qanapi.core.http.HttpMethod
import cloud.qanapi.core.http.HttpRequest
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponse.Handler
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.core.http.json
import cloud.qanapi.core.http.parseable
import cloud.qanapi.core.prepareAsync
import cloud.qanapi.models.v3.encryption.EncryptionDecryptParams
import cloud.qanapi.models.v3.encryption.EncryptionDecryptResponse
import cloud.qanapi.models.v3.encryption.EncryptionEncryptParams
import cloud.qanapi.models.v3.encryption.EncryptionEncryptResponse

class EncryptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EncryptionServiceAsync {

    private val withRawResponse: EncryptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EncryptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EncryptionServiceAsync =
        EncryptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun decrypt(
        params: EncryptionDecryptParams,
        requestOptions: RequestOptions,
    ): EncryptionDecryptResponse =
        // post /v3/encryption/{proxy}/decrypt
        withRawResponse().decrypt(params, requestOptions).parse()

    override suspend fun encrypt(
        params: EncryptionEncryptParams,
        requestOptions: RequestOptions,
    ): EncryptionEncryptResponse =
        // post /v3/encryption/{proxy}/encrypt
        withRawResponse().encrypt(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EncryptionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EncryptionServiceAsync.WithRawResponse =
            EncryptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val decryptHandler: Handler<EncryptionDecryptResponse> =
            jsonHandler<EncryptionDecryptResponse>(clientOptions.jsonMapper)

        override suspend fun decrypt(
            params: EncryptionDecryptParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EncryptionDecryptResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("proxy", params.proxy())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "encryption", params._pathParam(0), "decrypt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { decryptHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val encryptHandler: Handler<EncryptionEncryptResponse> =
            jsonHandler<EncryptionEncryptResponse>(clientOptions.jsonMapper)

        override suspend fun encrypt(
            params: EncryptionEncryptParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EncryptionEncryptResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("proxy", params.proxy())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "encryption", params._pathParam(0), "encrypt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { encryptHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
