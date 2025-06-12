// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.client

import com.qanapi.api.core.ClientOptions
import com.qanapi.api.core.getPackageVersion
import com.qanapi.api.services.async.ApiKeyServiceAsync
import com.qanapi.api.services.async.ApiKeyServiceAsyncImpl
import com.qanapi.api.services.async.AuthServiceAsync
import com.qanapi.api.services.async.AuthServiceAsyncImpl
import com.qanapi.api.services.async.DecryptServiceAsync
import com.qanapi.api.services.async.DecryptServiceAsyncImpl
import com.qanapi.api.services.async.EncryptServiceAsync
import com.qanapi.api.services.async.EncryptServiceAsyncImpl
import com.qanapi.api.services.async.ScopeServiceAsync
import com.qanapi.api.services.async.ScopeServiceAsyncImpl

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

        override fun auth(): AuthServiceAsync.WithRawResponse = auth

        override fun encrypt(): EncryptServiceAsync.WithRawResponse = encrypt

        override fun decrypt(): DecryptServiceAsync.WithRawResponse = decrypt

        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys

        override fun scopes(): ScopeServiceAsync.WithRawResponse = scopes
    }
}
