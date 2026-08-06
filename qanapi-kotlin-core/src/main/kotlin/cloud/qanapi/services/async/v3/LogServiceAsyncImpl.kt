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
import cloud.qanapi.models.v3.logs.LogActivityParams
import cloud.qanapi.models.v3.logs.LogActivityResponse
import cloud.qanapi.models.v3.logs.LogApiParams
import cloud.qanapi.models.v3.logs.LogApiResponse
import cloud.qanapi.models.v3.logs.LogQanapiFlowParams
import cloud.qanapi.models.v3.logs.LogQanapiFlowResponse
import cloud.qanapi.models.v3.logs.LogUnifiedParams
import cloud.qanapi.models.v3.logs.LogUnifiedResponse

class LogServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LogServiceAsync {

    private val withRawResponse: LogServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LogServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LogServiceAsync =
        LogServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun activity(
        params: LogActivityParams,
        requestOptions: RequestOptions,
    ): LogActivityResponse =
        // get /v3/logs/activity
        withRawResponse().activity(params, requestOptions).parse()

    override suspend fun api(params: LogApiParams, requestOptions: RequestOptions): LogApiResponse =
        // get /v3/logs/api
        withRawResponse().api(params, requestOptions).parse()

    override suspend fun qanapiFlow(
        params: LogQanapiFlowParams,
        requestOptions: RequestOptions,
    ): LogQanapiFlowResponse =
        // get /v3/logs/qanapi-flow
        withRawResponse().qanapiFlow(params, requestOptions).parse()

    override suspend fun unified(
        params: LogUnifiedParams,
        requestOptions: RequestOptions,
    ): LogUnifiedResponse =
        // get /v3/logs/unified
        withRawResponse().unified(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LogServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LogServiceAsync.WithRawResponse =
            LogServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val activityHandler: Handler<LogActivityResponse> =
            jsonHandler<LogActivityResponse>(clientOptions.jsonMapper)

        override suspend fun activity(
            params: LogActivityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogActivityResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "logs", "activity")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { activityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val apiHandler: Handler<LogApiResponse> =
            jsonHandler<LogApiResponse>(clientOptions.jsonMapper)

        override suspend fun api(
            params: LogApiParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogApiResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "logs", "api")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { apiHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val qanapiFlowHandler: Handler<LogQanapiFlowResponse> =
            jsonHandler<LogQanapiFlowResponse>(clientOptions.jsonMapper)

        override suspend fun qanapiFlow(
            params: LogQanapiFlowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogQanapiFlowResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "logs", "qanapi-flow")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { qanapiFlowHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unifiedHandler: Handler<LogUnifiedResponse> =
            jsonHandler<LogUnifiedResponse>(clientOptions.jsonMapper)

        override suspend fun unified(
            params: LogUnifiedParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LogUnifiedResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "logs", "unified")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { unifiedHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
