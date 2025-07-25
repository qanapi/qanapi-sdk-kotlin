// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.apikeys

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

interface ScopeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ScopeServiceAsync

    /** Retrieve scopes associated with an API Key */
    suspend fun retrieve(
        apiKey: Long,
        params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScopeRetrieveResponse> =
        retrieve(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ScopeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ScopeRetrieveResponse>

    /** @see retrieve */
    suspend fun retrieve(
        apiKey: Long,
        requestOptions: RequestOptions,
    ): List<ScopeRetrieveResponse> = retrieve(apiKey, ScopeRetrieveParams.none(), requestOptions)

    /** Attach scopes to an API Key */
    suspend fun attach(
        apiKey: Long,
        params: ScopeAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeAttachResponse = attach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see attach */
    suspend fun attach(
        params: ScopeAttachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeAttachResponse

    /** Detach scopes from an API Key */
    suspend fun detach(
        apiKey: Long,
        params: ScopeDetachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDetachResponse = detach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see detach */
    suspend fun detach(
        params: ScopeDetachParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeDetachResponse

    /** Sync scopes of an API Key */
    suspend fun sync(
        apiKey: Long,
        params: ScopeSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeSyncResponse = sync(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see sync */
    suspend fun sync(
        params: ScopeSyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScopeSyncResponse

    /** A view of [ScopeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ScopeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api-keys/{apiKey}/scopes`, but is otherwise the
         * same as [ScopeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            apiKey: Long,
            params: ScopeRetrieveParams = ScopeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScopeRetrieveResponse>> =
            retrieve(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ScopeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ScopeRetrieveResponse>>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            apiKey: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ScopeRetrieveResponse>> =
            retrieve(apiKey, ScopeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api-keys/{apiKey}/scopes/attach`, but is otherwise
         * the same as [ScopeServiceAsync.attach].
         */
        @MustBeClosed
        suspend fun attach(
            apiKey: Long,
            params: ScopeAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeAttachResponse> =
            attach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see attach */
        @MustBeClosed
        suspend fun attach(
            params: ScopeAttachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeAttachResponse>

        /**
         * Returns a raw HTTP response for `post /api-keys/{apiKey}/scopes/detach`, but is otherwise
         * the same as [ScopeServiceAsync.detach].
         */
        @MustBeClosed
        suspend fun detach(
            apiKey: Long,
            params: ScopeDetachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDetachResponse> =
            detach(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see detach */
        @MustBeClosed
        suspend fun detach(
            params: ScopeDetachParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeDetachResponse>

        /**
         * Returns a raw HTTP response for `post /api-keys/{apiKey}/scopes/sync`, but is otherwise
         * the same as [ScopeServiceAsync.sync].
         */
        @MustBeClosed
        suspend fun sync(
            apiKey: Long,
            params: ScopeSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeSyncResponse> =
            sync(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see sync */
        @MustBeClosed
        suspend fun sync(
            params: ScopeSyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScopeSyncResponse>
    }
}
