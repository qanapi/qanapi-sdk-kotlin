// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.client

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.getPackageVersion
import cloud.qanapi.services.blocking.ApiKeyService
import cloud.qanapi.services.blocking.ApiKeyServiceImpl
import cloud.qanapi.services.blocking.AuthService
import cloud.qanapi.services.blocking.AuthServiceImpl
import cloud.qanapi.services.blocking.DecryptService
import cloud.qanapi.services.blocking.DecryptServiceImpl
import cloud.qanapi.services.blocking.EncryptService
import cloud.qanapi.services.blocking.EncryptServiceImpl
import cloud.qanapi.services.blocking.ScopeService
import cloud.qanapi.services.blocking.ScopeServiceImpl

class QanapiClientImpl(private val clientOptions: ClientOptions) : QanapiClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: QanapiClientAsync by lazy { QanapiClientAsyncImpl(clientOptions) }

    private val withRawResponse: QanapiClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auth: AuthService by lazy { AuthServiceImpl(clientOptionsWithUserAgent) }

    private val encrypt: EncryptService by lazy { EncryptServiceImpl(clientOptionsWithUserAgent) }

    private val decrypt: DecryptService by lazy { DecryptServiceImpl(clientOptionsWithUserAgent) }

    private val apiKeys: ApiKeyService by lazy { ApiKeyServiceImpl(clientOptionsWithUserAgent) }

    private val scopes: ScopeService by lazy { ScopeServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): QanapiClientAsync = async

    override fun withRawResponse(): QanapiClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QanapiClient =
        QanapiClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun auth(): AuthService = auth

    override fun encrypt(): EncryptService = encrypt

    override fun decrypt(): DecryptService = decrypt

    override fun apiKeys(): ApiKeyService = apiKeys

    override fun scopes(): ScopeService = scopes

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QanapiClient.WithRawResponse {

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

        private val scopes: ScopeService.WithRawResponse by lazy {
            ScopeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QanapiClient.WithRawResponse =
            QanapiClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun auth(): AuthService.WithRawResponse = auth

        override fun encrypt(): EncryptService.WithRawResponse = encrypt

        override fun decrypt(): DecryptService.WithRawResponse = decrypt

        override fun apiKeys(): ApiKeyService.WithRawResponse = apiKeys

        override fun scopes(): ScopeService.WithRawResponse = scopes
    }
}
