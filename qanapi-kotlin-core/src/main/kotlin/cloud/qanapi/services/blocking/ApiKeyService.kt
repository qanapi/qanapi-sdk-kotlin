// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.apikeys.ApiKeyRevokeParams
import cloud.qanapi.models.apikeys.ApiKeyRevokeResponse
import cloud.qanapi.models.apikeys.ApiKeyRotateParams
import cloud.qanapi.models.apikeys.ApiKeyRotateResponse
import cloud.qanapi.services.blocking.apikeys.ScopeService
import com.google.errorprone.annotations.MustBeClosed

interface ApiKeyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiKeyService

    fun scopes(): ScopeService

    /** Revoke an API Key */
    fun revoke(
        apiKey: String,
        params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRevokeResponse = revoke(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see revoke */
    fun revoke(
        params: ApiKeyRevokeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRevokeResponse

    /** @see revoke */
    fun revoke(apiKey: String, requestOptions: RequestOptions): ApiKeyRevokeResponse =
        revoke(apiKey, ApiKeyRevokeParams.none(), requestOptions)

    /** Rotate an API Key */
    fun rotate(
        apiKey: String,
        params: ApiKeyRotateParams = ApiKeyRotateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse = rotate(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see rotate */
    fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse

    /** @see rotate */
    fun rotate(apiKey: String, requestOptions: RequestOptions): ApiKeyRotateResponse =
        rotate(apiKey, ApiKeyRotateParams.none(), requestOptions)

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiKeyService.WithRawResponse

        fun scopes(): ScopeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /api-keys/{apiKey}/revoke`, but is otherwise the
         * same as [ApiKeyService.revoke].
         */
        @MustBeClosed
        fun revoke(
            apiKey: String,
            params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRevokeResponse>

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            apiKey: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRevokeResponse> =
            revoke(apiKey, ApiKeyRevokeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api-keys/{apiKey}/rotate`, but is otherwise the
         * same as [ApiKeyService.rotate].
         */
        @MustBeClosed
        fun rotate(
            apiKey: String,
            params: ApiKeyRotateParams = ApiKeyRotateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRotateResponse> =
            rotate(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            params: ApiKeyRotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyRotateResponse>

        /** @see rotate */
        @MustBeClosed
        fun rotate(
            apiKey: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRotateResponse> =
            rotate(apiKey, ApiKeyRotateParams.none(), requestOptions)
    }
}
