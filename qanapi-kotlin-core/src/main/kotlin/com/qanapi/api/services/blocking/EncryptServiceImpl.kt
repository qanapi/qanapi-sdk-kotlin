// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.blocking

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
import com.qanapi.api.core.prepare
import com.qanapi.api.models.encrypt.EncryptEncryptDataParams
import com.qanapi.api.models.encrypt.EncryptEncryptDataResponse

class EncryptServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EncryptService {

    private val withRawResponse: EncryptService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EncryptService.WithRawResponse = withRawResponse

    override fun encryptData(
        params: EncryptEncryptDataParams,
        requestOptions: RequestOptions,
    ): EncryptEncryptDataResponse =
        // post /encrypt
        withRawResponse().encryptData(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EncryptService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val encryptDataHandler: Handler<EncryptEncryptDataResponse> =
            jsonHandler<EncryptEncryptDataResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun encryptData(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
