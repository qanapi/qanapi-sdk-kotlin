// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.async.v3.ApiKeyServiceAsync
import cloud.qanapi.services.async.v3.ConfigurationServiceAsync
import cloud.qanapi.services.async.v3.EncryptionServiceAsync
import cloud.qanapi.services.async.v3.LogServiceAsync
import cloud.qanapi.services.async.v3.RoleServiceAsync
import cloud.qanapi.services.async.v3.UserServiceAsync

interface V3ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V3ServiceAsync

    fun roles(): RoleServiceAsync

    fun configurations(): ConfigurationServiceAsync

    fun users(): UserServiceAsync

    fun apiKeys(): ApiKeyServiceAsync

    fun logs(): LogServiceAsync

    fun encryption(): EncryptionServiceAsync

    /** A view of [V3ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V3ServiceAsync.WithRawResponse

        fun roles(): RoleServiceAsync.WithRawResponse

        fun configurations(): ConfigurationServiceAsync.WithRawResponse

        fun users(): UserServiceAsync.WithRawResponse

        fun apiKeys(): ApiKeyServiceAsync.WithRawResponse

        fun logs(): LogServiceAsync.WithRawResponse

        fun encryption(): EncryptionServiceAsync.WithRawResponse
    }
}
