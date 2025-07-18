// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.apikeys

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
import cloud.qanapi.models.apikeys.scopes.ScopeAttachParams
import cloud.qanapi.models.apikeys.scopes.ScopeAttachResponse
import cloud.qanapi.models.apikeys.scopes.ScopeDetachParams
import cloud.qanapi.models.apikeys.scopes.ScopeDetachResponse
import cloud.qanapi.models.apikeys.scopes.ScopeRetrieveParams
import cloud.qanapi.models.apikeys.scopes.ScopeRetrieveResponse
import cloud.qanapi.models.apikeys.scopes.ScopeSyncParams
import cloud.qanapi.models.apikeys.scopes.ScopeSyncResponse

class ScopeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScopeService {

    private val withRawResponse: ScopeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScopeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScopeService =
        ScopeServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: ScopeRetrieveParams,
        requestOptions: RequestOptions,
    ): List<ScopeRetrieveResponse> =
        // get /api-keys/{apiKey}/scopes
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun attach(
        params: ScopeAttachParams,
        requestOptions: RequestOptions,
    ): ScopeAttachResponse =
        // post /api-keys/{apiKey}/scopes/attach
        withRawResponse().attach(params, requestOptions).parse()

    override fun detach(
        params: ScopeDetachParams,
        requestOptions: RequestOptions,
    ): ScopeDetachResponse =
        // post /api-keys/{apiKey}/scopes/detach
        withRawResponse().detach(params, requestOptions).parse()

    override fun sync(params: ScopeSyncParams, requestOptions: RequestOptions): ScopeSyncResponse =
        // post /api-keys/{apiKey}/scopes/sync
        withRawResponse().sync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScopeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ScopeService.WithRawResponse =
            ScopeServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val retrieveHandler: Handler<List<ScopeRetrieveResponse>> =
            jsonHandler<List<ScopeRetrieveResponse>>(clientOptions.jsonMapper)

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun attach(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

        override fun detach(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
            jsonHandler<ScopeSyncResponse>(clientOptions.jsonMapper)

        override fun sync(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
