// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ApiKeyServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
