// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyService = client.v3().apiKeys()

        val apiKeys = apiKeyService.list()

        apiKeys.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyService = client.v3().apiKeys()

        apiKeyService.revoke(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotate() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyService = client.v3().apiKeys()

        val response = apiKeyService.rotate(0L)

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun show() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyService = client.v3().apiKeys()

        val response = apiKeyService.show(0L)

        response.validate()
    }
}
