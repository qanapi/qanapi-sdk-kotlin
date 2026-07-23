// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun revoke() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val apiKeyServiceAsync = client.apiKeys()

        val response = apiKeyServiceAsync.revoke("apiKey")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun rotate() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val apiKeyServiceAsync = client.apiKeys()

        val response = apiKeyServiceAsync.rotate("apiKey")

        response.validate()
    }
}
