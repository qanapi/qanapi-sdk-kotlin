// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadParams
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadResponse
import com.google.errorprone.annotations.MustBeClosed

interface DecryptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DecryptService

    /** Decrypt encrypted payload */
    fun decryptPayload(
        params: DecryptDecryptPayloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecryptDecryptPayloadResponse

    /** A view of [DecryptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DecryptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /decrypt`, but is otherwise the same as
         * [DecryptService.decryptPayload].
         */
        @MustBeClosed
        fun decryptPayload(
            params: DecryptDecryptPayloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecryptDecryptPayloadResponse>
    }
}
