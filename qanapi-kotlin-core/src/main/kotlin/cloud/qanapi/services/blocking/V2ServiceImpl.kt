// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.blocking.v2.ApiKeyService
import cloud.qanapi.services.blocking.v2.ApiKeyServiceImpl
import cloud.qanapi.services.blocking.v2.AuthService
import cloud.qanapi.services.blocking.v2.AuthServiceImpl
import cloud.qanapi.services.blocking.v2.DecryptService
import cloud.qanapi.services.blocking.v2.DecryptServiceImpl
import cloud.qanapi.services.blocking.v2.EncryptService
import cloud.qanapi.services.blocking.v2.EncryptServiceImpl

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptions) }

    private val encrypt: EncryptService by lazy { EncryptServiceImpl(clientOptions) }

    private val decrypt: DecryptService by lazy { DecryptServiceImpl(clientOptions) }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptions) }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun auth(): AuthService = auth

    override fun encrypt(): EncryptService = encrypt

    override fun decrypt(): DecryptService = decrypt

    override fun apiKeys(): ApiKeyService = apiKeys

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val auth: AuthService.WithRawResponse by lazy {
            AuthServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val encrypt: EncryptService.WithRawResponse by lazy {
            EncryptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val decrypt: DecryptService.WithRawResponse by lazy {
            DecryptServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyService.WithRawResponse by lazy {
            ApiKeyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun auth(): AuthService.WithRawResponse = auth

        override fun encrypt(): EncryptService.WithRawResponse = encrypt

        override fun decrypt(): DecryptService.WithRawResponse = decrypt

        override fun apiKeys(): ApiKeyService.WithRawResponse = apiKeys
    }
}
