// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.apikeys

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.apikeys.scopes.ScopeAttachParams
import cloud.qanapi.models.apikeys.scopes.ScopeAttachResponse
import cloud.qanapi.models.apikeys.scopes.ScopeDetachParams
import cloud.qanapi.models.apikeys.scopes.ScopeDetachResponse
import cloud.qanapi.models.apikeys.scopes.ScopeRetrieveParams
import cloud.qanapi.models.apikeys.scopes.ScopeRetrieveResponse
import cloud.qanapi.models.apikeys.scopes.ScopeSyncParams
import cloud.qanapi.models.apikeys.scopes.ScopeSyncResponse
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

    /** Retrieve scopes associated with an API Key */
    fun retrieve(
        apiKey: Long,
        params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScopeRetrieveResponse> =
        retrieve(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ScopeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScopeRetrieveResponse>

    /** @see retrieve */
    fun retrieve(apiKey: Long, requestOptions: RequestOptions): List<ScopeRetrieveResponse> =
        retrieve(apiKey, ScopeRetrieveParams.none(), requestOptions)

    /** Attach scopes to an API Key */
    fun attach(
        apiKey: Long,
        params: ScopeAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeAttachResponse = attach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see attach */
    fun attach(
        params: ScopeAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeAttachResponse

    /** Detach scopes from an API Key */
    fun detach(
        apiKey: Long,
        params: ScopeDetachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDetachResponse = detach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see detach */
    fun detach(
        params: ScopeDetachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDetachResponse

    /** Sync scopes of an API Key */
    fun sync(
        apiKey: Long,
        params: ScopeSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeSyncResponse = sync(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see sync */
    fun sync(
        params: ScopeSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeSyncResponse

    /** A view of [ScopeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScopeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api-keys/{apiKey}/scopes`, but is otherwise the
         * same as [ScopeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            apiKey: Long,
            params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScopeRetrieveResponse>> =
            retrieve(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ScopeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScopeRetrieveResponse>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            apiKey: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ScopeRetrieveResponse>> =
            retrieve(apiKey, ScopeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api-keys/{apiKey}/scopes/attach`, but is otherwise
         * the same as [ScopeService.attach].
         */
        @MustBeClosed
        fun attach(
            apiKey: Long,
            params: ScopeAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeAttachResponse> =
            attach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see attach */
        @MustBeClosed
        fun attach(
            params: ScopeAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeAttachResponse>

        /**
         * Returns a raw HTTP response for `post /api-keys/{apiKey}/scopes/detach`, but is otherwise
         * the same as [ScopeService.detach].
         */
        @MustBeClosed
        fun detach(
            apiKey: Long,
            params: ScopeDetachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDetachResponse> =
            detach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see detach */
        @MustBeClosed
        fun detach(
            params: ScopeDetachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDetachResponse>

        /**
         * Returns a raw HTTP response for `post /api-keys/{apiKey}/scopes/sync`, but is otherwise
         * the same as [ScopeService.sync].
         */
        @MustBeClosed
        fun sync(
            apiKey: Long,
            params: ScopeSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeSyncResponse> =
            sync(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see sync */
        @MustBeClosed
        fun sync(
            params: ScopeSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeSyncResponse>
    }
}
