// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.http.HttpResponseFor
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadParams
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadResponse

interface DecryptServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
         * Returns a raw HTTP response for `post /decrypt`, but is otherwise the same as
         * [DecryptServiceAsync.decryptPayload].
         */
        @MustBeClosed
        suspend fun decryptPayload(
            params: DecryptDecryptPayloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecryptDecryptPayloadResponse>
    }
}
