// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyService = client.apiKeys()

        val response = apiKeyService.revoke("apiKey")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotate() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyService = client.apiKeys()

        val response = apiKeyService.rotate("apiKey")

        response.validate()
    }
}
