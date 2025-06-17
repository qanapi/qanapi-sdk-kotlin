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
import cloud.qanapi.models.scopes.ScopeCreateParams
import cloud.qanapi.models.scopes.ScopeCreateResponse
import cloud.qanapi.models.scopes.ScopeDeleteParams
import cloud.qanapi.models.scopes.ScopeDeleteResponse
import cloud.qanapi.models.scopes.ScopeListParams
import cloud.qanapi.models.scopes.ScopeListResponse
import cloud.qanapi.models.scopes.ScopeRetrieveParams
import cloud.qanapi.models.scopes.ScopeRetrieveResponse
import cloud.qanapi.models.scopes.ScopeUpdateParams
import cloud.qanapi.models.scopes.ScopeUpdateResponse

class ScopeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScopeServiceAsync {

    private val withRawResponse: ScopeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScopeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScopeServiceAsync =
        ScopeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: ScopeCreateParams,
        requestOptions: RequestOptions,
    ): ScopeCreateResponse =
        // post /scopes
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ScopeRetrieveParams,
        requestOptions: RequestOptions,
    ): ScopeRetrieveResponse =
        // get /scopes/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: ScopeUpdateParams,
        requestOptions: RequestOptions,
    ): ScopeUpdateResponse =
        // put /scopes/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: ScopeListParams,
        requestOptions: RequestOptions,
    ): List<ScopeListResponse> =
        // get /scopes
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: ScopeDeleteParams,
        requestOptions: RequestOptions,
    ): ScopeDeleteResponse =
        // delete /scopes/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScopeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ScopeServiceAsync.WithRawResponse =
            ScopeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ScopeCreateResponse> =
            jsonHandler<ScopeCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: ScopeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scopes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ScopeRetrieveResponse> =
            jsonHandler<ScopeRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ScopeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scopes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ScopeUpdateResponse> =
            jsonHandler<ScopeUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: ScopeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scopes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<ScopeListResponse>> =
            jsonHandler<List<ScopeListResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ScopeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ScopeListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scopes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val deleteHandler: Handler<ScopeDeleteResponse> =
            jsonHandler<ScopeDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: ScopeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("scopes", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
