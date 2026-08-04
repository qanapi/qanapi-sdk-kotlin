// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.services.async.v2.ApiKeyServiceAsync
import cloud.qanapi.services.async.v2.ApiKeyServiceAsyncImpl
import cloud.qanapi.services.async.v2.AuthServiceAsync
import cloud.qanapi.services.async.v2.AuthServiceAsyncImpl
import cloud.qanapi.services.async.v2.DecryptServiceAsync
import cloud.qanapi.services.async.v2.DecryptServiceAsyncImpl
import cloud.qanapi.services.async.v2.EncryptServiceAsync
import cloud.qanapi.services.async.v2.EncryptServiceAsyncImpl

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val auth: AuthServiceAsync by lazy { AuthServiceAsyncImpl(clientOptions) }

    private val encrypt: EncryptServiceAsync by lazy { EncryptServiceAsyncImpl(clientOptions) }

    private val decrypt: DecryptServiceAsync by lazy { DecryptServiceAsyncImpl(clientOptions) }

    private val apiKeys: ApiKeyServiceAsync by lazy { ApiKeyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): V2ServiceAsync =
        V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun auth(): AuthServiceAsync = auth

    override fun encrypt(): EncryptServiceAsync = encrypt

    override fun decrypt(): DecryptServiceAsync = decrypt

    override fun apiKeys(): ApiKeyServiceAsync = apiKeys

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): V2ServiceAsync.WithRawResponse =
            V2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun auth(): AuthServiceAsync.WithRawResponse = auth

        override fun encrypt(): EncryptServiceAsync.WithRawResponse = encrypt

        override fun decrypt(): DecryptServiceAsync.WithRawResponse = decrypt

        override fun apiKeys(): ApiKeyServiceAsync.WithRawResponse = apiKeys
    }
}
