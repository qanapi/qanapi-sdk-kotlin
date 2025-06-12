// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.http.HttpResponseFor
import com.qanapi.api.models.scopes.ScopeCreateParams
import com.qanapi.api.models.scopes.ScopeCreateResponse
import com.qanapi.api.models.scopes.ScopeDeleteParams
import com.qanapi.api.models.scopes.ScopeDeleteResponse
import com.qanapi.api.models.scopes.ScopeListParams
import com.qanapi.api.models.scopes.ScopeListResponse
import com.qanapi.api.models.scopes.ScopeRetrieveParams
import com.qanapi.api.models.scopes.ScopeRetrieveResponse
import com.qanapi.api.models.scopes.ScopeUpdateParams
import com.qanapi.api.models.scopes.ScopeUpdateResponse

interface ScopeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new scope */
    suspend fun create(
        params: ScopeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeCreateResponse

    /** Get a specific scope */
    suspend fun retrieve(
        id: Long,
        params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ScopeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeRetrieveResponse

    /** @see [retrieve] */
    suspend fun retrieve(id: Long, requestOptions: RequestOptions): ScopeRetrieveResponse =
        retrieve(id, ScopeRetrieveParams.none(), requestOptions)

    /** Update a scope */
    suspend fun update(
        id: Long,
        params: ScopeUpdateParams = ScopeUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: ScopeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeUpdateResponse

    /** @see [update] */
    suspend fun update(id: Long, requestOptions: RequestOptions): ScopeUpdateResponse =
        update(id, ScopeUpdateParams.none(), requestOptions)

    /** List all scopes */
    suspend fun list(
        params: ScopeListParams = ScopeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScopeListResponse>

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): List<ScopeListResponse> =
        list(ScopeListParams.none(), requestOptions)

    /** Delete a scope */
    suspend fun delete(
        id: Long,
        params: ScopeDeleteParams = ScopeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: ScopeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDeleteResponse

    /** @see [delete] */
    suspend fun delete(id: Long, requestOptions: RequestOptions): ScopeDeleteResponse =
        delete(id, ScopeDeleteParams.none(), requestOptions)

    /** A view of [ScopeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /scopes`, but is otherwise the same as
         * [ScopeServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ScopeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeCreateResponse>

        /**
         * Returns a raw HTTP response for `get /scopes/{id}`, but is otherwise the same as
         * [ScopeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: Long,
            params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ScopeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeRetrieveResponse> =
            retrieve(id, ScopeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /scopes/{id}`, but is otherwise the same as
         * [ScopeServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: Long,
            params: ScopeUpdateParams = ScopeUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: ScopeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeUpdateResponse> =
            update(id, ScopeUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /scopes`, but is otherwise the same as
         * [ScopeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ScopeListParams = ScopeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScopeListResponse>>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<ScopeListResponse>> =
            list(ScopeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /scopes/{id}`, but is otherwise the same as
         * [ScopeServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: Long,
            params: ScopeDeleteParams = ScopeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: ScopeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            id: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScopeDeleteResponse> =
            delete(id, ScopeDeleteParams.none(), requestOptions)
    }
}
