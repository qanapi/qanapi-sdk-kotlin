// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.logs.LogActivityParams
import cloud.qanapi.models.v3.logs.LogActivityResponse
import cloud.qanapi.models.v3.logs.LogApiParams
import cloud.qanapi.models.v3.logs.LogApiResponse
import cloud.qanapi.models.v3.logs.LogQanapiFlowParams
import cloud.qanapi.models.v3.logs.LogQanapiFlowResponse
import cloud.qanapi.models.v3.logs.LogUnifiedParams
import cloud.qanapi.models.v3.logs.LogUnifiedResponse
import com.google.errorprone.annotations.MustBeClosed

interface LogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LogService

    /** Get activity logs */
    fun activity(
        params: LogActivityParams = LogActivityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogActivityResponse

    /** @see activity */
    fun activity(requestOptions: RequestOptions): LogActivityResponse =
        activity(LogActivityParams.none(), requestOptions)

    /** Get API logs */
    fun api(
        params: LogApiParams = LogApiParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogApiResponse

    /** @see api */
    fun api(requestOptions: RequestOptions): LogApiResponse =
        api(LogApiParams.none(), requestOptions)

    /** Get Qanapi Flow logs */
    fun qanapiFlow(
        params: LogQanapiFlowParams = LogQanapiFlowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogQanapiFlowResponse

    /** @see qanapiFlow */
    fun qanapiFlow(requestOptions: RequestOptions): LogQanapiFlowResponse =
        qanapiFlow(LogQanapiFlowParams.none(), requestOptions)

    /** Get unified logs */
    fun unified(
        params: LogUnifiedParams = LogUnifiedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogUnifiedResponse

    /** @see unified */
    fun unified(requestOptions: RequestOptions): LogUnifiedResponse =
        unified(LogUnifiedParams.none(), requestOptions)

    /** A view of [LogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v3/logs/activity`, but is otherwise the same as
         * [LogService.activity].
         */
        @MustBeClosed
        fun activity(
            params: LogActivityParams = LogActivityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogActivityResponse>

        /** @see activity */
        @MustBeClosed
        fun activity(requestOptions: RequestOptions): HttpResponseFor<LogActivityResponse> =
            activity(LogActivityParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/logs/api`, but is otherwise the same as
         * [LogService.api].
         */
        @MustBeClosed
        fun api(
            params: LogApiParams = LogApiParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogApiResponse>

        /** @see api */
        @MustBeClosed
        fun api(requestOptions: RequestOptions): HttpResponseFor<LogApiResponse> =
            api(LogApiParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/logs/qanapi-flow`, but is otherwise the same as
         * [LogService.qanapiFlow].
         */
        @MustBeClosed
        fun qanapiFlow(
            params: LogQanapiFlowParams = LogQanapiFlowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogQanapiFlowResponse>

        /** @see qanapiFlow */
        @MustBeClosed
        fun qanapiFlow(requestOptions: RequestOptions): HttpResponseFor<LogQanapiFlowResponse> =
            qanapiFlow(LogQanapiFlowParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/logs/unified`, but is otherwise the same as
         * [LogService.unified].
         */
        @MustBeClosed
        fun unified(
            params: LogUnifiedParams = LogUnifiedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogUnifiedResponse>

        /** @see unified */
        @MustBeClosed
        fun unified(requestOptions: RequestOptions): HttpResponseFor<LogUnifiedResponse> =
            unified(LogUnifiedParams.none(), requestOptions)
    }
}
