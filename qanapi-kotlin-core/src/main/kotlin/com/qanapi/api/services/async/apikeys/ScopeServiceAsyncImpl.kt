// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async.apikeys

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
import com.qanapi.api.core.prepareAsync
import com.qanapi.api.models.apikeys.scopes.ScopeAttachParams
import com.qanapi.api.models.apikeys.scopes.ScopeAttachResponse
import com.qanapi.api.models.apikeys.scopes.ScopeDetachParams
import com.qanapi.api.models.apikeys.scopes.ScopeDetachResponse
import com.qanapi.api.models.apikeys.scopes.ScopeRetrieveParams
import com.qanapi.api.models.apikeys.scopes.ScopeRetrieveResponse
import com.qanapi.api.models.apikeys.scopes.ScopeSyncParams
import com.qanapi.api.models.apikeys.scopes.ScopeSyncResponse

class ScopeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScopeServiceAsync {

    private val withRawResponse: ScopeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScopeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScopeServiceAsync =
        ScopeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: ScopeRetrieveParams,
        requestOptions: RequestOptions,
    ): List<ScopeRetrieveResponse> =
        // get /api-keys/{apiKey}/scopes
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun attach(
        params: ScopeAttachParams,
        requestOptions: RequestOptions,
    ): ScopeAttachResponse =
        // post /api-keys/{apiKey}/scopes/attach
        withRawResponse().attach(params, requestOptions).parse()

    override suspend fun detach(
        params: ScopeDetachParams,
        requestOptions: RequestOptions,
    ): ScopeDetachResponse =
        // post /api-keys/{apiKey}/scopes/detach
        withRawResponse().detach(params, requestOptions).parse()

    override suspend fun sync(
        params: ScopeSyncParams,
        requestOptions: RequestOptions,
    ): ScopeSyncResponse =
        // post /api-keys/{apiKey}/scopes/sync
        withRawResponse().sync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScopeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ScopeServiceAsync.WithRawResponse =
            ScopeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<List<ScopeRetrieveResponse>> =
            jsonHandler<List<ScopeRetrieveResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ScopeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ScopeRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api-keys", params._pathParam(0), "scopes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val attachHandler: Handler<ScopeAttachResponse> =
            jsonHandler<ScopeAttachResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun attach(
            params: ScopeAttachParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeAttachResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api-keys", params._pathParam(0), "scopes", "attach")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { attachHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val detachHandler: Handler<ScopeDetachResponse> =
            jsonHandler<ScopeDetachResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun detach(
            params: ScopeDetachParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeDetachResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api-keys", params._pathParam(0), "scopes", "detach")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { detachHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val syncHandler: Handler<ScopeSyncResponse> =
            jsonHandler<ScopeSyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun sync(
            params: ScopeSyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeSyncResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("apiKey", params.apiKey())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api-keys", params._pathParam(0), "scopes", "sync")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { syncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
