// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClientAsync
import com.qanapi.api.models.auth.AuthLoginParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun login() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val authServiceAsync = client.auth()

        val response =
            authServiceAsync.login(
                AuthLoginParams.builder().email("valid@email.com").password("secret1234").build()
            )

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun logout() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val authServiceAsync = client.auth()

        val response = authServiceAsync.logout()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun refreshToken() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val authServiceAsync = client.auth()

        val response = authServiceAsync.refreshToken()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieveUserDetails() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val authServiceAsync = client.auth()

        val response = authServiceAsync.retrieveUserDetails()

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun revokeToken() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val authServiceAsync = client.auth()

        val response = authServiceAsync.revokeToken()

        response.validate()
    }
}
