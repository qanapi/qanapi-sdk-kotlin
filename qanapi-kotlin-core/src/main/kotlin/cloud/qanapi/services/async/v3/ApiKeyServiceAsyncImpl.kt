// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.handlers.emptyHandler
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
import cloud.qanapi.models.v3.ApiKey
import cloud.qanapi.models.v3.apikeys.ApiKeyListParams
import cloud.qanapi.models.v3.apikeys.ApiKeyRevokeParams
import cloud.qanapi.models.v3.apikeys.ApiKeyRotateParams
import cloud.qanapi.models.v3.apikeys.ApiKeyRotateResponse
import cloud.qanapi.models.v3.apikeys.ApiKeyShowParams

class ApiKeyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ApiKeyServiceAsync {

    private val withRawResponse: ApiKeyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ApiKeyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiKeyServiceAsync =
        ApiKeyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: ApiKeyListParams,
        requestOptions: RequestOptions,
    ): List<ApiKey> =
        // get /v3/api-keys
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun revoke(params: ApiKeyRevokeParams, requestOptions: RequestOptions) {
        // post /v3/api-keys/{apiKey}/revoke
        withRawResponse().revoke(params, requestOptions)
    }

    override suspend fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions,
    ): ApiKeyRotateResponse =
        // post /v3/api-keys/{apiKey}/rotate
        withRawResponse().rotate(params, requestOptions).parse()

    override suspend fun show(params: ApiKeyShowParams, requestOptions: RequestOptions): ApiKey =
        // get /v3/api-keys/{apiKey}
        withRawResponse().show(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApiKeyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApiKeyServiceAsync.WithRawResponse =
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<List<ApiKey>> =
            jsonHandler<List<ApiKey>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: ApiKeyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ApiKey>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "api-keys")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val revokeHandler: Handler<Void?> = emptyHandler()

        override suspend fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "api-keys", params._pathParam(0), "revoke")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { revokeHandler.handle(it) }
            }
        }

        private val rotateHandler: Handler<ApiKeyRotateResponse> =
            jsonHandler<ApiKeyRotateResponse>(clientOptions.jsonMapper)

        override suspend fun rotate(
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRotateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "api-keys", params._pathParam(0), "rotate")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val showHandler: Handler<ApiKey> = jsonHandler<ApiKey>(clientOptions.jsonMapper)

        override suspend fun show(
            params: ApiKeyShowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKey> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "api-keys", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { showHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
