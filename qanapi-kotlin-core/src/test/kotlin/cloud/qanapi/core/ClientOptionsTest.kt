// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.core

import cloud.qanapi.core.http.HttpClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify

@ExtendWith(MockitoExtension::class)
internal class ClientOptionsTest {

    private val httpClient = mock<HttpClient>()

    @Test
    fun baseUrl_production_substitutesTemplateVariables() {
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()

        val baseUrl = clientOptions.baseUrl()

        assertThat(baseUrl).isEqualTo("https://My-Subdomain.qanapi.cloud/api/v2")
    }

    @Test
    fun toBuilder_whenOriginalClientOptionsGarbageCollected_doesNotCloseOriginalClient() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        verify(httpClient, never()).close()

        // Overwrite the `clientOptions` variable so that the original `ClientOptions` is GC'd.
        clientOptions = clientOptions.toBuilder().build()
        System.gc()
        Thread.sleep(100)

        verify(httpClient, never()).close()
        // This exists so that `clientOptions` is still reachable.
        assertThat(clientOptions).isEqualTo(clientOptions)
    }
}
