// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.qanapi.api.core.ClientOptions
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.http.HttpResponseFor
import com.qanapi.api.models.apikeys.ApiKeyRevokeParams
import com.qanapi.api.models.apikeys.ApiKeyRevokeResponse
import com.qanapi.api.models.apikeys.ApiKeyRotateParams
import com.qanapi.api.models.apikeys.ApiKeyRotateResponse
import com.qanapi.api.services.async.apikeys.ScopeServiceAsync

interface ApiKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiKeyServiceAsync

    fun scopes(): ScopeServiceAsync

    /** Revoke an API Key */
    suspend fun revoke(
        apiKey: String,
        params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRevokeResponse = revoke(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see [revoke] */
    suspend fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRevokeResponse

    /** @see [revoke] */
    suspend fun revoke(apiKey: String, requestOptions: RequestOptions): ApiKeyRevokeResponse =
        revoke(apiKey, ApiKeyRevokeParams.none(), requestOptions)

    /** Rotate an API Key */
    suspend fun rotate(
        apiKey: String,
        params: ApiKeyRotateParams = ApiKeyRotateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse = rotate(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see [rotate] */
    suspend fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse

    /** @see [rotate] */
    suspend fun rotate(apiKey: String, requestOptions: RequestOptions): ApiKeyRotateResponse =
        rotate(apiKey, ApiKeyRotateParams.none(), requestOptions)

    /**
     * A view of [ApiKeyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ApiKeyServiceAsync.WithRawResponse

        fun scopes(): ScopeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /api-keys/{apiKey}/revoke`, but is otherwise the
         * same as [ApiKeyServiceAsync.revoke].
         */
        @MustBeClosed
        suspend fun revoke(
            apiKey: String,
            params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see [revoke] */
        @MustBeClosed
        suspend fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRevokeResponse>

        /** @see [revoke] */
        @MustBeClosed
        suspend fun revoke(
            apiKey: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(apiKey, ApiKeyRevokeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api-keys/{apiKey}/rotate`, but is otherwise the
         * same as [ApiKeyServiceAsync.rotate].
         */
        @MustBeClosed
        suspend fun rotate(
            apiKey: String,
            params: ApiKeyRotateParams = ApiKeyRotateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRotateResponse> =
            rotate(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see [rotate] */
        @MustBeClosed
        suspend fun rotate(
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRotateResponse>

        /** @see [rotate] */
        @MustBeClosed
        suspend fun rotate(
            apiKey: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRotateResponse> =
            rotate(apiKey, ApiKeyRotateParams.none(), requestOptions)
    }
}
