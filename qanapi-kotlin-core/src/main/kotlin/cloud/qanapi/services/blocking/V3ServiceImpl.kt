// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.blocking.v3.ApiKeyService
import cloud.qanapi.services.blocking.v3.ApiKeyServiceImpl
import cloud.qanapi.services.blocking.v3.ConfigurationService
import cloud.qanapi.services.blocking.v3.ConfigurationServiceImpl
import cloud.qanapi.services.blocking.v3.EncryptionService
import cloud.qanapi.services.blocking.v3.EncryptionServiceImpl
import cloud.qanapi.services.blocking.v3.LogService
import cloud.qanapi.services.blocking.v3.LogServiceImpl
import cloud.qanapi.services.blocking.v3.RoleService
import cloud.qanapi.services.blocking.v3.RoleServiceImpl
import cloud.qanapi.services.blocking.v3.UserService
import cloud.qanapi.services.blocking.v3.UserServiceImpl

class V3ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V3Service {

    private val withRawResponse: V3Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val roles: RoleService by lazy { RoleServiceImpl(clientOptions) }

    private val configurations: ConfigurationService by lazy {
        ConfigurationServiceImpl(clientOptions)
    }

    private val users: UserService by lazy { UserServiceImpl(clientOptions) }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptions) }

    private val logs: LogService by lazy { LogServiceImpl(clientOptions) }

    private val encryption: EncryptionService by lazy { EncryptionServiceImpl(clientOptions) }

    override fun withRawResponse(): V3Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V3Service =
        V3ServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun roles(): RoleService = roles

    override fun configurations(): ConfigurationService = configurations

    override fun users(): UserService = users

    override fun apiKeys(): ApiKeyService = apiKeys

    override fun logs(): LogService = logs

    override fun encryption(): EncryptionService = encryption

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V3Service.WithRawResponse {

        private val roles: RoleService.WithRawResponse by lazy {
            RoleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val configurations: ConfigurationService.WithRawResponse by lazy {
            ConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyService.WithRawResponse by lazy {
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val logs: LogService.WithRawResponse by lazy {
            LogServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val encryption: EncryptionService.WithRawResponse by lazy {
            EncryptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V3Service.WithRawResponse =
            V3ServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun roles(): RoleService.WithRawResponse = roles

        override fun configurations(): ConfigurationService.WithRawResponse = configurations

        override fun users(): UserService.WithRawResponse = users

        override fun apiKeys(): ApiKeyService.WithRawResponse = apiKeys

        override fun logs(): LogService.WithRawResponse = logs

        override fun encryption(): EncryptionService.WithRawResponse = encryption
    }
}
