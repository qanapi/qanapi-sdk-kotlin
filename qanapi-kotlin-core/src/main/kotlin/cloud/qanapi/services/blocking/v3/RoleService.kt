// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.Role
import cloud.qanapi.models.v3.roles.RoleListParams
import com.google.errorprone.annotations.MustBeClosed

interface RoleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoleService

    /** List roles */
    fun list(
        params: RoleListParams = RoleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Role>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<Role> =
        list(RoleListParams.none(), requestOptions)

    /** A view of [RoleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RoleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v3/roles`, but is otherwise the same as
         * [RoleService.list].
         */
        @MustBeClosed
        fun list(
            params: RoleListParams = RoleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Role>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<Role>> =
            list(RoleListParams.none(), requestOptions)
    }
}
