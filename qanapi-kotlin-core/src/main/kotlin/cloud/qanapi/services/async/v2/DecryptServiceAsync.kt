// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v2

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v2.decrypt.DecryptDecryptPayloadParams
import cloud.qanapi.models.v2.decrypt.DecryptDecryptPayloadResponse
import com.google.errorprone.annotations.MustBeClosed

interface DecryptServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DecryptServiceAsync

    /** Decrypt encrypted payload */
    suspend fun decryptPayload(
        params: DecryptDecryptPayloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecryptDecryptPayloadResponse

    /**
     * A view of [DecryptServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DecryptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/decrypt`, but is otherwise the same as
         * [DecryptServiceAsync.decryptPayload].
         */
        @MustBeClosed
        suspend fun decryptPayload(
            params: DecryptDecryptPayloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecryptDecryptPayloadResponse>
    }
}
