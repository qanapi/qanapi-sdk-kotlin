// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun revoke() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val apiKeyService = client.apiKeys()

        val response = apiKeyService.revoke("apiKey")

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun rotate() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val apiKeyService = client.apiKeys()

        val response = apiKeyService.rotate("apiKey")

        response.validate()
    }
}
