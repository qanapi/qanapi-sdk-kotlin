// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.models.auth.AuthLoginParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun login() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authService = client.auth()

        val response =
            authService.login(
                AuthLoginParams.builder().email("valid@email.com").password("secret1234").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun logout() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authService = client.auth()

        val response = authService.logout()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refreshToken() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authService = client.auth()

        val response = authService.refreshToken()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveUserDetails() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authService = client.auth()

        val response = authService.retrieveUserDetails()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revokeToken() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authService = client.auth()

        val response = authService.revokeToken()

        response.validate()
    }
}
