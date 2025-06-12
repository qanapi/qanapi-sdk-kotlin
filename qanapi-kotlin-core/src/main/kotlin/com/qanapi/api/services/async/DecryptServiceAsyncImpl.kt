// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.core.ClientOptions
import com.qanapi.api.core.JsonValue
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.handlers.errorHandler
import com.qanapi.api.core.handlers.jsonHandler
import com.qanapi.api.core.handlers.withErrorHandler
import com.qanapi.api.core.http.HttpMethod
import com.qanapi.api.core.http.HttpRequest
import com.qanapi.api.core.http.HttpResponse.Handler
import com.qanapi.api.core.http.HttpResponseFor
import com.qanapi.api.core.http.json
import com.qanapi.api.core.http.parseable
import com.qanapi.api.core.prepareAsync
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadParams
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadResponse

class DecryptServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DecryptServiceAsync {

    private val withRawResponse: DecryptServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DecryptServiceAsync.WithRawResponse = withRawResponse

    override suspend fun decryptPayload(
        params: DecryptDecryptPayloadParams,
        requestOptions: RequestOptions,
    ): DecryptDecryptPayloadResponse =
        // post /decrypt
        withRawResponse().decryptPayload(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DecryptServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val decryptPayloadHandler: Handler<DecryptDecryptPayloadResponse> =
            jsonHandler<DecryptDecryptPayloadResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun decryptPayload(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
