// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v2

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun revoke() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyServiceAsync = client.v2().apiKeys()

        val response = apiKeyServiceAsync.revoke("apiKey")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun rotate() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val apiKeyServiceAsync = client.v2().apiKeys()

        val response = apiKeyServiceAsync.rotate("apiKey")

        response.validate()
    }
}
