// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

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
import cloud.qanapi.core.prepare
import cloud.qanapi.models.v3.configurations.ConfigurationCreateParams
import cloud.qanapi.models.v3.configurations.ConfigurationCreateResponse
import cloud.qanapi.models.v3.configurations.ConfigurationDeleteParams
import cloud.qanapi.models.v3.configurations.ConfigurationListParams
import cloud.qanapi.models.v3.configurations.ConfigurationListResponse
import cloud.qanapi.models.v3.configurations.ConfigurationShowParams
import cloud.qanapi.models.v3.configurations.ConfigurationShowResponse
import cloud.qanapi.models.v3.configurations.ConfigurationUpdateParams
import cloud.qanapi.models.v3.configurations.ConfigurationUpdateResponse

class ConfigurationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ConfigurationService {

    private val withRawResponse: ConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConfigurationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationService =
        ConfigurationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: ConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): ConfigurationCreateResponse =
        // post /v3/configurations
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): ConfigurationUpdateResponse =
        // put /v3/configurations/{configuration}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ConfigurationListParams,
        requestOptions: RequestOptions,
    ): List<ConfigurationListResponse> =
        // get /v3/configurations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ConfigurationDeleteParams, requestOptions: RequestOptions) {
        // delete /v3/configurations/{configuration}
        withRawResponse().delete(params, requestOptions)
    }

    override fun show(
        params: ConfigurationShowParams,
        requestOptions: RequestOptions,
    ): ConfigurationShowResponse =
        // get /v3/configurations/{configuration}
        withRawResponse().show(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConfigurationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationService.WithRawResponse =
            ConfigurationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ConfigurationCreateResponse> =
            jsonHandler<ConfigurationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ConfigurationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "configurations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ConfigurationUpdateResponse> =
            jsonHandler<ConfigurationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configuration", params.configuration())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "configurations", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<ConfigurationListResponse>> =
            jsonHandler<List<ConfigurationListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: ConfigurationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ConfigurationListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "configurations")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ConfigurationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configuration", params.configuration())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "configurations", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val showHandler: Handler<ConfigurationShowResponse> =
            jsonHandler<ConfigurationShowResponse>(clientOptions.jsonMapper)

        override fun show(
            params: ConfigurationShowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationShowResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configuration", params.configuration())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "configurations", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
