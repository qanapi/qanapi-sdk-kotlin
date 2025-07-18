// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

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
import cloud.qanapi.core.prepare
import cloud.qanapi.models.apikeys.ApiKeyRevokeParams
import cloud.qanapi.models.apikeys.ApiKeyRevokeResponse
import cloud.qanapi.models.apikeys.ApiKeyRotateParams
import cloud.qanapi.models.apikeys.ApiKeyRotateResponse
import cloud.qanapi.services.blocking.apikeys.ScopeService
import cloud.qanapi.services.blocking.apikeys.ScopeServiceImpl

class ApiKeyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiKeyService {

    private val withRawResponse: ApiKeyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val scopes: ScopeService by lazy { ScopeServiceImpl(clientOptions) }

    override fun withRawResponse(): ApiKeyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiKeyService =
        ApiKeyServiceImpl(clientOptions.toBuilder().apply(modifier).build())

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

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val scopes: ScopeService.WithRawResponse by lazy {
            ScopeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApiKeyService.WithRawResponse =
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun scopes(): ScopeService.WithRawResponse = scopes

        private val revokeHandler: Handler<ApiKeyRevokeResponse> =
            jsonHandler<ApiKeyRevokeResponse>(clientOptions.jsonMapper)

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
            return errorHandler.handle(response).parseable {
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
            return errorHandler.handle(response).parseable {
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
