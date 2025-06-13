// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.client

import com.qanapi.api.core.ClientOptions
import com.qanapi.api.core.getPackageVersion
import com.qanapi.api.services.blocking.ApiKeyService
import com.qanapi.api.services.blocking.ApiKeyServiceImpl
import com.qanapi.api.services.blocking.AuthService
import com.qanapi.api.services.blocking.AuthServiceImpl
import com.qanapi.api.services.blocking.DecryptService
import com.qanapi.api.services.blocking.DecryptServiceImpl
import com.qanapi.api.services.blocking.EncryptService
import com.qanapi.api.services.blocking.EncryptServiceImpl
import com.qanapi.api.services.blocking.ScopeService
import com.qanapi.api.services.blocking.ScopeServiceImpl

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
