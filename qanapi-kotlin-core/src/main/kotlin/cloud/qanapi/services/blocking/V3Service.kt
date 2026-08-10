// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.blocking.v3.ApiKeyService
import cloud.qanapi.services.blocking.v3.ConfigurationService
import cloud.qanapi.services.blocking.v3.EncryptionService
import cloud.qanapi.services.blocking.v3.LogService
import cloud.qanapi.services.blocking.v3.RoleService
import cloud.qanapi.services.blocking.v3.UserService

interface V3Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V3Service

    fun roles(): RoleService

    fun configurations(): ConfigurationService

    fun users(): UserService

    fun apiKeys(): ApiKeyService

    fun logs(): LogService

    fun encryption(): EncryptionService

    /** A view of [V3Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V3Service.WithRawResponse

        fun roles(): RoleService.WithRawResponse

        fun configurations(): ConfigurationService.WithRawResponse

        fun users(): UserService.WithRawResponse

        fun apiKeys(): ApiKeyService.WithRawResponse

        fun logs(): LogService.WithRawResponse

        fun encryption(): EncryptionService.WithRawResponse
    }
}
