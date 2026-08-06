// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

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

interface LogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LogServiceAsync

    /** Get activity logs */
    suspend fun activity(
        params: LogActivityParams = LogActivityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogActivityResponse

    /** @see activity */
    suspend fun activity(requestOptions: RequestOptions): LogActivityResponse =
        activity(LogActivityParams.none(), requestOptions)

    /** Get API logs */
    suspend fun api(
        params: LogApiParams = LogApiParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogApiResponse

    /** @see api */
    suspend fun api(requestOptions: RequestOptions): LogApiResponse =
        api(LogApiParams.none(), requestOptions)

    /** Get Qanapi Flow logs */
    suspend fun qanapiFlow(
        params: LogQanapiFlowParams = LogQanapiFlowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogQanapiFlowResponse

    /** @see qanapiFlow */
    suspend fun qanapiFlow(requestOptions: RequestOptions): LogQanapiFlowResponse =
        qanapiFlow(LogQanapiFlowParams.none(), requestOptions)

    /** Get unified logs */
    suspend fun unified(
        params: LogUnifiedParams = LogUnifiedParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogUnifiedResponse

    /** @see unified */
    suspend fun unified(requestOptions: RequestOptions): LogUnifiedResponse =
        unified(LogUnifiedParams.none(), requestOptions)

    /** A view of [LogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v3/logs/activity`, but is otherwise the same as
         * [LogServiceAsync.activity].
         */
        @MustBeClosed
        suspend fun activity(
            params: LogActivityParams = LogActivityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogActivityResponse>

        /** @see activity */
        @MustBeClosed
        suspend fun activity(requestOptions: RequestOptions): HttpResponseFor<LogActivityResponse> =
            activity(LogActivityParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/logs/api`, but is otherwise the same as
         * [LogServiceAsync.api].
         */
        @MustBeClosed
        suspend fun api(
            params: LogApiParams = LogApiParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogApiResponse>

        /** @see api */
        @MustBeClosed
        suspend fun api(requestOptions: RequestOptions): HttpResponseFor<LogApiResponse> =
            api(LogApiParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/logs/qanapi-flow`, but is otherwise the same as
         * [LogServiceAsync.qanapiFlow].
         */
        @MustBeClosed
        suspend fun qanapiFlow(
            params: LogQanapiFlowParams = LogQanapiFlowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogQanapiFlowResponse>

        /** @see qanapiFlow */
        @MustBeClosed
        suspend fun qanapiFlow(
            requestOptions: RequestOptions
        ): HttpResponseFor<LogQanapiFlowResponse> =
            qanapiFlow(LogQanapiFlowParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/logs/unified`, but is otherwise the same as
         * [LogServiceAsync.unified].
         */
        @MustBeClosed
        suspend fun unified(
            params: LogUnifiedParams = LogUnifiedParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogUnifiedResponse>

        /** @see unified */
        @MustBeClosed
        suspend fun unified(requestOptions: RequestOptions): HttpResponseFor<LogUnifiedResponse> =
            unified(LogUnifiedParams.none(), requestOptions)
    }
}
