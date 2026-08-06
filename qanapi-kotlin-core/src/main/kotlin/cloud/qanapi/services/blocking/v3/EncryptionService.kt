// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.encryption.EncryptionDecryptParams
import cloud.qanapi.models.v3.encryption.EncryptionDecryptResponse
import cloud.qanapi.models.v3.encryption.EncryptionEncryptParams
import cloud.qanapi.models.v3.encryption.EncryptionEncryptResponse
import com.google.errorprone.annotations.MustBeClosed

interface EncryptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EncryptionService

    /** Decrypt data */
    fun decrypt(
        proxy: String,
        params: EncryptionDecryptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EncryptionDecryptResponse = decrypt(params.toBuilder().proxy(proxy).build(), requestOptions)

    /** @see decrypt */
    fun decrypt(
        params: EncryptionDecryptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EncryptionDecryptResponse

    /** Encrypt data */
    fun encrypt(
        proxy: String,
        params: EncryptionEncryptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EncryptionEncryptResponse = encrypt(params.toBuilder().proxy(proxy).build(), requestOptions)

    /** @see encrypt */
    fun encrypt(
        params: EncryptionEncryptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EncryptionEncryptResponse

    /** A view of [EncryptionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EncryptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v3/encryption/{proxy}/decrypt`, but is otherwise
         * the same as [EncryptionService.decrypt].
         */
        @MustBeClosed
        fun decrypt(
            proxy: String,
            params: EncryptionDecryptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EncryptionDecryptResponse> =
            decrypt(params.toBuilder().proxy(proxy).build(), requestOptions)

        /** @see decrypt */
        @MustBeClosed
        fun decrypt(
            params: EncryptionDecryptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EncryptionDecryptResponse>

        /**
         * Returns a raw HTTP response for `post /v3/encryption/{proxy}/encrypt`, but is otherwise
         * the same as [EncryptionService.encrypt].
         */
        @MustBeClosed
        fun encrypt(
            proxy: String,
            params: EncryptionEncryptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EncryptionEncryptResponse> =
            encrypt(params.toBuilder().proxy(proxy).build(), requestOptions)

        /** @see encrypt */
        @MustBeClosed
        fun encrypt(
            params: EncryptionEncryptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EncryptionEncryptResponse>
    }
}
