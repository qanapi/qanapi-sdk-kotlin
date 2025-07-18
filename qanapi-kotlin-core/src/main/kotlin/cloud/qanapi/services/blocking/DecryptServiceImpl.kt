// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
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
import cloud.qanapi.core.prepare
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadParams
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadResponse

class DecryptServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DecryptService {

    private val withRawResponse: DecryptService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DecryptService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DecryptService =
        DecryptServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun decryptPayload(
        params: DecryptDecryptPayloadParams,
        requestOptions: RequestOptions,
    ): DecryptDecryptPayloadResponse =
        // post /decrypt
        withRawResponse().decryptPayload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DecryptService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DecryptService.WithRawResponse =
            DecryptServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val decryptPayloadHandler: Handler<DecryptDecryptPayloadResponse> =
            jsonHandler<DecryptDecryptPayloadResponse>(clientOptions.jsonMapper)

        override fun decryptPayload(
            params: DecryptDecryptPayloadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DecryptDecryptPayloadResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("decrypt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { decryptPayloadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
