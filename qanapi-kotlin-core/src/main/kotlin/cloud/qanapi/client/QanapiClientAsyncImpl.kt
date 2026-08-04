// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.client

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.getPackageVersion
import cloud.qanapi.services.async.V2ServiceAsync
import cloud.qanapi.services.async.V2ServiceAsyncImpl

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

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): QanapiClient = sync

    override fun withRawResponse(): QanapiClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QanapiClientAsync =
        QanapiClientAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun v2(): V2ServiceAsync = v2

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QanapiClientAsync.WithRawResponse {

        private val v2: V2ServiceAsync.WithRawResponse by lazy {
            V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QanapiClientAsync.WithRawResponse =
            QanapiClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun v2(): V2ServiceAsync.WithRawResponse = v2
    }
}
