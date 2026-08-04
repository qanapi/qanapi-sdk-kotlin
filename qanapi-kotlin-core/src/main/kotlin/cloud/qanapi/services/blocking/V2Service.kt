// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.blocking.v2.ApiKeyService
import cloud.qanapi.services.blocking.v2.AuthService
import cloud.qanapi.services.blocking.v2.DecryptService
import cloud.qanapi.services.blocking.v2.EncryptService

interface V2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2Service

    fun auth(): AuthService

    fun encrypt(): EncryptService

    fun decrypt(): DecryptService

    fun apiKeys(): ApiKeyService

    /** A view of [V2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2Service.WithRawResponse

        fun auth(): AuthService.WithRawResponse

        fun encrypt(): EncryptService.WithRawResponse

        fun decrypt(): DecryptService.WithRawResponse

        fun apiKeys(): ApiKeyService.WithRawResponse
    }
}
