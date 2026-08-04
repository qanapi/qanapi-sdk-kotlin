// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.async.v2.ApiKeyServiceAsync
import cloud.qanapi.services.async.v2.AuthServiceAsync
import cloud.qanapi.services.async.v2.DecryptServiceAsync
import cloud.qanapi.services.async.v2.EncryptServiceAsync

interface V2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2ServiceAsync

    fun auth(): AuthServiceAsync

    fun encrypt(): EncryptServiceAsync

    fun decrypt(): DecryptServiceAsync

    fun apiKeys(): ApiKeyServiceAsync

    /** A view of [V2ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2ServiceAsync.WithRawResponse

        fun auth(): AuthServiceAsync.WithRawResponse

        fun encrypt(): EncryptServiceAsync.WithRawResponse

        fun decrypt(): DecryptServiceAsync.WithRawResponse

        fun apiKeys(): ApiKeyServiceAsync.WithRawResponse
    }
}
