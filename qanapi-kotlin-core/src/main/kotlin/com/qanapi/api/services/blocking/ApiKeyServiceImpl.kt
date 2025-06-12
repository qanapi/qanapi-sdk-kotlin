// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.blocking

import com.qanapi.api.core.ClientOptions
import com.qanapi.api.core.JsonValue
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.checkRequired
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
import com.qanapi.api.models.apikeys.ApiKeyRevokeParams
import com.qanapi.api.models.apikeys.ApiKeyRevokeResponse
import com.qanapi.api.models.apikeys.ApiKeyRotateParams
import com.qanapi.api.models.apikeys.ApiKeyRotateResponse
import com.qanapi.api.services.blocking.apikeys.ScopeService
import com.qanapi.api.services.blocking.apikeys.ScopeServiceImpl

class ApiKeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiKeyService {

    private val withRawResponse: ApiKeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val scopes: ScopeService by lazy { ScopeServiceImpl(clientOptions) }

    override fun withRawResponse(): ApiKeyService.WithRawResponse = withRawResponse

    override fun scopes(): ScopeService = scopes

    override fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions,
    ): ApiKeyRevokeResponse =
        // patch /api-keys/{apiKey}/revoke
        withRawResponse().revoke(params, requestOptions).parse()

    override fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions,
    ): ApiKeyRotateResponse =
        // patch /api-keys/{apiKey}/rotate
        withRawResponse().rotate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiKeyService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val scopes: ScopeService.WithRawResponse by lazy {
            ScopeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun scopes(): ScopeService.WithRawResponse = scopes

        private val revokeHandler: Handler<ApiKeyRevokeResponse> =
            jsonHandler<ApiKeyRevokeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRevokeResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api-keys", params._pathParam(0), "revoke")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { revokeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rotateHandler: Handler<ApiKeyRotateResponse> =
            jsonHandler<ApiKeyRotateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun rotate(
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRotateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api-keys", params._pathParam(0), "rotate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { rotateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
