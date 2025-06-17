// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.encrypt.EncryptEncryptDataParams
import cloud.qanapi.models.encrypt.EncryptEncryptDataResponse
import com.google.errorprone.annotations.MustBeClosed

interface EncryptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EncryptService

    /** Encrypt data with optional ACL */
    fun encryptData(
        params: EncryptEncryptDataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EncryptEncryptDataResponse

    /** A view of [EncryptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EncryptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /encrypt`, but is otherwise the same as
         * [EncryptService.encryptData].
         */
        @MustBeClosed
        fun encryptData(
            params: EncryptEncryptDataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EncryptEncryptDataResponse>
    }
}
