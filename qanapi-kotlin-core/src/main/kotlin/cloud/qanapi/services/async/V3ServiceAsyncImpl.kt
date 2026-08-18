// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.async.v3.ApiKeyServiceAsync
import cloud.qanapi.services.async.v3.ApiKeyServiceAsyncImpl
import cloud.qanapi.services.async.v3.ClassificationServiceAsync
import cloud.qanapi.services.async.v3.ClassificationServiceAsyncImpl
import cloud.qanapi.services.async.v3.ConfigurationServiceAsync
import cloud.qanapi.services.async.v3.ConfigurationServiceAsyncImpl
import cloud.qanapi.services.async.v3.EncryptionServiceAsync
import cloud.qanapi.services.async.v3.EncryptionServiceAsyncImpl
import cloud.qanapi.services.async.v3.LogServiceAsync
import cloud.qanapi.services.async.v3.LogServiceAsyncImpl
import cloud.qanapi.services.async.v3.RoleServiceAsync
import cloud.qanapi.services.async.v3.RoleServiceAsyncImpl
import cloud.qanapi.services.async.v3.UserServiceAsync
import cloud.qanapi.services.async.v3.UserServiceAsyncImpl

class V3ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V3ServiceAsync {

    private val withRawResponse: V3ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val roles: RoleServiceAsync by lazy { RoleServiceAsyncImpl(clientOptions) }

    private val configurations: ConfigurationServiceAsync by lazy {
        ConfigurationServiceAsyncImpl(clientOptions)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptions) }

    private val apiKeys: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    private val logs: LogServiceAsync by lazy { LogServiceAsyncImpl(clientOptions) }

    private val encryption: EncryptionServiceAsync by lazy {
        EncryptionServiceAsyncImpl(clientOptions)
    }

    private val classifications: ClassificationServiceAsync by lazy {
        ClassificationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V3ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V3ServiceAsync =
        V3ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun roles(): RoleServiceAsync = roles

    override fun configurations(): ConfigurationServiceAsync = configurations

    override fun users(): UserServiceAsync = users

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    override fun logs(): LogServiceAsync = logs

    override fun encryption(): EncryptionServiceAsync = encryption

    override fun classifications(): ClassificationServiceAsync = classifications

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V3ServiceAsync.WithRawResponse {

        private val roles: RoleServiceAsync.WithRawResponse by lazy {
            RoleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val configurations: ConfigurationServiceAsync.WithRawResponse by lazy {
            ConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyServiceAsync.WithRawResponse by lazy {
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val logs: LogServiceAsync.WithRawResponse by lazy {
            LogServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val encryption: EncryptionServiceAsync.WithRawResponse by lazy {
            EncryptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val classifications: ClassificationServiceAsync.WithRawResponse by lazy {
            ClassificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V3ServiceAsync.WithRawResponse =
            V3ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun roles(): RoleServiceAsync.WithRawResponse = roles

        override fun configurations(): ConfigurationServiceAsync.WithRawResponse = configurations

        override fun users(): UserServiceAsync.WithRawResponse = users

        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys

        override fun logs(): LogServiceAsync.WithRawResponse = logs

        override fun encryption(): EncryptionServiceAsync.WithRawResponse = encryption

        override fun classifications(): ClassificationServiceAsync.WithRawResponse = classifications
    }
}
