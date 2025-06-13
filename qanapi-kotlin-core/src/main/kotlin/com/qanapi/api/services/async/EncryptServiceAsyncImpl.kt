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
import com.qanapi.api.models.encrypt.EncryptEncryptDataParams
import com.qanapi.api.models.encrypt.EncryptEncryptDataResponse

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
