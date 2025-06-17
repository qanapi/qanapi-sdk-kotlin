// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.client

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.getPackageVersion
import cloud.qanapi.services.async.ApiKeyServiceAsync
import cloud.qanapi.services.async.ApiKeyServiceAsyncImpl
import cloud.qanapi.services.async.AuthServiceAsync
import cloud.qanapi.services.async.AuthServiceAsyncImpl
import cloud.qanapi.services.async.DecryptServiceAsync
import cloud.qanapi.services.async.DecryptServiceAsyncImpl
import cloud.qanapi.services.async.EncryptServiceAsync
import cloud.qanapi.services.async.EncryptServiceAsyncImpl
import cloud.qanapi.services.async.ScopeServiceAsync
import cloud.qanapi.services.async.ScopeServiceAsyncImpl

class QanapiClientAsyncImpl(private val clientOptions: ClientOptions) : QanapiClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Kotlin ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: QanapiClient by lazy { QanapiClientImpl(clientOptions) }

    private val withRawResponse: QanapiClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val encrypt: EncryptServiceAsync by lazy {
        EncryptServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val decrypt: DecryptServiceAsync by lazy {
        DecryptServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val apiKeys: ApiKeyServiceAsync by lazy {
        ApiKeyServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val scopes: ScopeServiceAsync by lazy {
        ScopeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): QanapiClient = sync

    override fun withRawResponse(): QanapiClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QanapiClientAsync =
        QanapiClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun auth(): AuthServiceAsync = auth

    override fun encrypt(): EncryptServiceAsync = encrypt

    override fun decrypt(): DecryptServiceAsync = decrypt

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    override fun scopes(): ScopeServiceAsync = scopes

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QanapiClientAsync.WithRawResponse {

        private val auth: AuthServiceAsync.WithRawResponse by lazy {
            AuthServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val encrypt: EncryptServiceAsync.WithRawResponse by lazy {
            EncryptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val decrypt: DecryptServiceAsync.WithRawResponse by lazy {
            DecryptServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val apiKeys: ApiKeyServiceAsync.WithRawResponse by lazy {
            ApiKeyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val scopes: ScopeServiceAsync.WithRawResponse by lazy {
            ScopeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QanapiClientAsync.WithRawResponse =
            QanapiClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun auth(): AuthServiceAsync.WithRawResponse = auth

        override fun encrypt(): EncryptServiceAsync.WithRawResponse = encrypt

        override fun decrypt(): DecryptServiceAsync.WithRawResponse = decrypt

        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys

        override fun scopes(): ScopeServiceAsync.WithRawResponse = scopes
    }
}
