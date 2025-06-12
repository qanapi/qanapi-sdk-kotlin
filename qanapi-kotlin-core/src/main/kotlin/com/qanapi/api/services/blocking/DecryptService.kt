// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.http.HttpResponseFor
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadParams
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadResponse

interface DecryptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Decrypt encrypted payload */
    fun decryptPayload(
        params: DecryptDecryptPayloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecryptDecryptPayloadResponse

    /** A view of [DecryptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

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
