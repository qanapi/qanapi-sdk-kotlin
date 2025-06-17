// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.apikeys.ApiKeyRevokeParams
import cloud.qanapi.models.apikeys.ApiKeyRevokeResponse
import cloud.qanapi.models.apikeys.ApiKeyRotateParams
import cloud.qanapi.models.apikeys.ApiKeyRotateResponse
import cloud.qanapi.services.async.apikeys.ScopeServiceAsync
import com.google.errorprone.annotations.MustBeClosed

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
