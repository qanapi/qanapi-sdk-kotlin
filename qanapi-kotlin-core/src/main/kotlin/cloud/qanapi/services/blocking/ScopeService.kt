// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.scopes.ScopeCreateParams
import cloud.qanapi.models.scopes.ScopeCreateResponse
import cloud.qanapi.models.scopes.ScopeDeleteParams
import cloud.qanapi.models.scopes.ScopeDeleteResponse
import cloud.qanapi.models.scopes.ScopeListParams
import cloud.qanapi.models.scopes.ScopeListResponse
import cloud.qanapi.models.scopes.ScopeRetrieveParams
import cloud.qanapi.models.scopes.ScopeRetrieveResponse
import cloud.qanapi.models.scopes.ScopeUpdateParams
import cloud.qanapi.models.scopes.ScopeUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface ScopeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScopeService

    /** Create a new scope */
    fun create(
        params: ScopeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeCreateResponse

    /** Get a specific scope */
    fun retrieve(
        id: Long,
        params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ScopeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: Long, requestOptions: RequestOptions): ScopeRetrieveResponse =
        retrieve(id, ScopeRetrieveParams.none(), requestOptions)

    /** Update a scope */
    fun update(
        id: Long,
        params: ScopeUpdateParams = ScopeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: ScopeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeUpdateResponse

    /** @see update */
    fun update(id: Long, requestOptions: RequestOptions): ScopeUpdateResponse =
        update(id, ScopeUpdateParams.none(), requestOptions)

    /** List all scopes */
    fun list(
        params: ScopeListParams = ScopeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScopeListResponse>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<ScopeListResponse> =
        list(ScopeListParams.none(), requestOptions)

    /** Delete a scope */
    fun delete(
        id: Long,
        params: ScopeDeleteParams = ScopeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ScopeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDeleteResponse

    /** @see delete */
    fun delete(id: Long, requestOptions: RequestOptions): ScopeDeleteResponse =
        delete(id, ScopeDeleteParams.none(), requestOptions)

    /** A view of [ScopeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScopeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /scopes`, but is otherwise the same as
         * [ScopeService.create].
         */
        @MustBeClosed
        fun create(
            params: ScopeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeCreateResponse>

        /**
         * Returns a raw HTTP response for `get /scopes/{id}`, but is otherwise the same as
         * [ScopeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: Long,
            params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ScopeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeRetrieveResponse> =
            retrieve(id, ScopeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /scopes/{id}`, but is otherwise the same as
         * [ScopeService.update].
         */
        @MustBeClosed
        fun update(
            id: Long,
            params: ScopeUpdateParams = ScopeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ScopeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(id: Long, requestOptions: RequestOptions): HttpResponseFor<ScopeUpdateResponse> =
            update(id, ScopeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scopes`, but is otherwise the same as
         * [ScopeService.list].
         */
        @MustBeClosed
        fun list(
            params: ScopeListParams = ScopeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScopeListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ScopeListResponse>> =
            list(ScopeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /scopes/{id}`, but is otherwise the same as
         * [ScopeService.delete].
         */
        @MustBeClosed
        fun delete(
            id: Long,
            params: ScopeDeleteParams = ScopeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ScopeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(id: Long, requestOptions: RequestOptions): HttpResponseFor<ScopeDeleteResponse> =
            delete(id, ScopeDeleteParams.none(), requestOptions)
    }
}
