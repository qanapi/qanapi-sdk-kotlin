// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.handlers.errorBodyHandler
import cloud.qanapi.core.handlers.errorHandler
import cloud.qanapi.core.handlers.jsonHandler
import cloud.qanapi.core.http.HttpMethod
import cloud.qanapi.core.http.HttpRequest
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponse.Handler
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.core.http.parseable
import cloud.qanapi.core.prepareAsync
import cloud.qanapi.models.v3.roles.RoleListParams
import cloud.qanapi.models.v3.roles.RoleListResponse

class RoleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RoleServiceAsync {

    private val withRawResponse: RoleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoleServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoleServiceAsync =
        RoleServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun list(
        params: RoleListParams,
        requestOptions: RequestOptions,
    ): List<RoleListResponse> =
        // get /v3/roles
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoleServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RoleServiceAsync.WithRawResponse =
            RoleServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val listHandler: Handler<List<RoleListResponse>> =
            jsonHandler<List<RoleListResponse>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: RoleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<RoleListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "roles")
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
    }
}
