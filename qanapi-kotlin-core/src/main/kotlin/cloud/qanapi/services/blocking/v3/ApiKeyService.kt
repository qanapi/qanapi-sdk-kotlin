// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.apikeys.ApiKeyListParams
import cloud.qanapi.models.v3.apikeys.ApiKeyListResponse
import cloud.qanapi.models.v3.apikeys.ApiKeyRevokeParams
import cloud.qanapi.models.v3.apikeys.ApiKeyRotateParams
import cloud.qanapi.models.v3.apikeys.ApiKeyRotateResponse
import cloud.qanapi.models.v3.apikeys.ApiKeyShowParams
import cloud.qanapi.models.v3.apikeys.ApiKeyShowResponse
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

    /** List API Keys */
    fun list(
        params: ApiKeyListParams = ApiKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ApiKeyListResponse>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<ApiKeyListResponse> =
        list(ApiKeyListParams.none(), requestOptions)

    /** Revoke API Key */
    fun revoke(
        apiKey: Long,
        params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = revoke(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see revoke */
    fun revoke(params: ApiKeyRevokeParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see revoke */
    fun revoke(apiKey: Long, requestOptions: RequestOptions) =
        revoke(apiKey, ApiKeyRevokeParams.none(), requestOptions)

    /** Rotate API Key */
    fun rotate(
        apiKey: Long,
        params: ApiKeyRotateParams = ApiKeyRotateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse = rotate(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see rotate */
    fun rotate(
        params: ApiKeyRotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyRotateResponse

    /** @see rotate */
    fun rotate(apiKey: Long, requestOptions: RequestOptions): ApiKeyRotateResponse =
        rotate(apiKey, ApiKeyRotateParams.none(), requestOptions)

    /** Get API Key */
    fun show(
        apiKey: Long,
        params: ApiKeyShowParams = ApiKeyShowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyShowResponse = show(params.toBuilder().apiKey(apiKey).build(), requestOptions)

    /** @see show */
    fun show(
        params: ApiKeyShowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiKeyShowResponse

    /** @see show */
    fun show(apiKey: Long, requestOptions: RequestOptions): ApiKeyShowResponse =
        show(apiKey, ApiKeyShowParams.none(), requestOptions)

    /** A view of [ApiKeyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ApiKeyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v3/api-keys`, but is otherwise the same as
         * [ApiKeyService.list].
         */
        @MustBeClosed
        fun list(
            params: ApiKeyListParams = ApiKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ApiKeyListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ApiKeyListResponse>> =
            list(ApiKeyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v3/api-keys/{apiKey}/revoke`, but is otherwise the
         * same as [ApiKeyService.revoke].
         */
        @MustBeClosed
        fun revoke(
            apiKey: Long,
            params: ApiKeyRevokeParams = ApiKeyRevokeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = revoke(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see revoke */
        @MustBeClosed
        fun revoke(
            params: ApiKeyRevokeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see revoke */
        @MustBeClosed
        fun revoke(apiKey: Long, requestOptions: RequestOptions): HttpResponse =
            revoke(apiKey, ApiKeyRevokeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v3/api-keys/{apiKey}/rotate`, but is otherwise the
         * same as [ApiKeyService.rotate].
         */
        @MustBeClosed
        fun rotate(
            apiKey: Long,
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
            apiKey: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyRotateResponse> =
            rotate(apiKey, ApiKeyRotateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/api-keys/{apiKey}`, but is otherwise the same as
         * [ApiKeyService.show].
         */
        @MustBeClosed
        fun show(
            apiKey: Long,
            params: ApiKeyShowParams = ApiKeyShowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyShowResponse> =
            show(params.toBuilder().apiKey(apiKey).build(), requestOptions)

        /** @see show */
        @MustBeClosed
        fun show(
            params: ApiKeyShowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiKeyShowResponse>

        /** @see show */
        @MustBeClosed
        fun show(
            apiKey: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiKeyShowResponse> =
            show(apiKey, ApiKeyShowParams.none(), requestOptions)
    }
}
