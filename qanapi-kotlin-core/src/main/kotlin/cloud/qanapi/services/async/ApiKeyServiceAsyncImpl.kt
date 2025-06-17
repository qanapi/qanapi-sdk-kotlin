// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.checkRequired
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
import cloud.qanapi.models.apikeys.ApiKeyRevokeParams
import cloud.qanapi.models.apikeys.ApiKeyRevokeResponse
import cloud.qanapi.models.apikeys.ApiKeyRotateParams
import cloud.qanapi.models.apikeys.ApiKeyRotateResponse
import cloud.qanapi.services.async.apikeys.ScopeServiceAsync
import cloud.qanapi.services.async.apikeys.ScopeServiceAsyncImpl

class ApiKeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiKeyServiceAsync {

    private val withRawResponse: ApiKeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val scopes: ScopeServiceAsync by lazy { ScopeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ApiKeyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiKeyServiceAsync =
        ApiKeyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun scopes(): ScopeServiceAsync = scopes

    override suspend fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions,
    ): ApiKeyRevokeResponse =
        // patch /api-keys/{apiKey}/revoke
        withRawResponse().revoke(params, requestOptions).parse()

    override suspend fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions,
    ): ApiKeyRotateResponse =
        // patch /api-keys/{apiKey}/rotate
        withRawResponse().rotate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiKeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val scopes: ScopeServiceAsync.WithRawResponse by lazy {
            ScopeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApiKeyServiceAsync.WithRawResponse =
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun scopes(): ScopeServiceAsync.WithRawResponse = scopes

        private val revokeHandler: Handler<ApiKeyRevokeResponse> =
            jsonHandler<ApiKeyRevokeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun revoke(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun rotate(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
