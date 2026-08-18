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
import cloud.qanapi.models.v3.classifications.ClassificationCreateParams
import cloud.qanapi.models.v3.classifications.ClassificationCreateResponse
import cloud.qanapi.models.v3.classifications.ClassificationDeleteParams
import cloud.qanapi.models.v3.classifications.ClassificationListParams
import cloud.qanapi.models.v3.classifications.ClassificationListResponse
import cloud.qanapi.models.v3.classifications.ClassificationShowParams
import cloud.qanapi.models.v3.classifications.ClassificationShowResponse
import cloud.qanapi.models.v3.classifications.ClassificationUpdateParams
import cloud.qanapi.models.v3.classifications.ClassificationUpdateResponse

class ClassificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ClassificationService {

    private val withRawResponse: ClassificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ClassificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ClassificationService =
        ClassificationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: ClassificationCreateParams,
        requestOptions: RequestOptions,
    ): ClassificationCreateResponse =
        // post /v3/classifications
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: ClassificationUpdateParams,
        requestOptions: RequestOptions,
    ): ClassificationUpdateResponse =
        // patch /v3/classifications/{classification}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ClassificationListParams,
        requestOptions: RequestOptions,
    ): ClassificationListResponse =
        // get /v3/classifications
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ClassificationDeleteParams, requestOptions: RequestOptions) {
        // delete /v3/classifications/{classification}
        withRawResponse().delete(params, requestOptions)
    }

    override fun show(
        params: ClassificationShowParams,
        requestOptions: RequestOptions,
    ): ClassificationShowResponse =
        // get /v3/classifications/{classification}
        withRawResponse().show(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClassificationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ClassificationService.WithRawResponse =
            ClassificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<ClassificationCreateResponse> =
            jsonHandler<ClassificationCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ClassificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassificationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "classifications")
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

        private val updateHandler: Handler<ClassificationUpdateResponse> =
            jsonHandler<ClassificationUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ClassificationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassificationUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("classification", params.classification())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "classifications", params._pathParam(0))
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

        private val listHandler: Handler<ClassificationListResponse> =
            jsonHandler<ClassificationListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ClassificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassificationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "classifications")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ClassificationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("classification", params.classification())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "classifications", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val showHandler: Handler<ClassificationShowResponse> =
            jsonHandler<ClassificationShowResponse>(clientOptions.jsonMapper)

        override fun show(
            params: ClassificationShowParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassificationShowResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("classification", params.classification())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v3", "classifications", params._pathParam(0))
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
