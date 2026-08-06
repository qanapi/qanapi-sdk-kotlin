// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.client

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.getPackageVersion
import cloud.qanapi.services.blocking.V2Service
import cloud.qanapi.services.blocking.V2ServiceImpl
import cloud.qanapi.services.blocking.V3Service
import cloud.qanapi.services.blocking.V3ServiceImpl

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

    private val v2: V2Service by lazy { V2ServiceImpl(clientOptionsWithUserAgent) }

    private val v3: V3Service by lazy { V3ServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): QanapiClientAsync = async

    override fun withRawResponse(): QanapiClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QanapiClient =
        QanapiClientImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun v2(): V2Service = v2

    override fun v3(): V3Service = v3

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QanapiClient.WithRawResponse {

        private val v2: V2Service.WithRawResponse by lazy {
            V2ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val v3: V3Service.WithRawResponse by lazy {
            V3ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): QanapiClient.WithRawResponse =
            QanapiClientImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        override fun v2(): V2Service.WithRawResponse = v2

        override fun v3(): V3Service.WithRawResponse = v3
    }
}
