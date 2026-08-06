// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.roles.RoleListParams
import cloud.qanapi.models.v3.roles.RoleListResponse
import com.google.errorprone.annotations.MustBeClosed

interface RoleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoleServiceAsync

    /** List roles */
    suspend fun list(
        params: RoleListParams = RoleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<RoleListResponse>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<RoleListResponse> =
        list(RoleListParams.none(), requestOptions)

    /** A view of [RoleServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v3/roles`, but is otherwise the same as
         * [RoleServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RoleListParams = RoleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<RoleListResponse>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<RoleListResponse>> =
            list(RoleListParams.none(), requestOptions)
    }
}
