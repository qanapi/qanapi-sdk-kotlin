// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v2

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.models.v2.auth.AuthLoginParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun login() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authServiceAsync = client.v2().auth()

        val response =
            authServiceAsync.login(
                AuthLoginParams.builder().email("valid@email.com").password("secret1234").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun logout() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authServiceAsync = client.v2().auth()

        val response = authServiceAsync.logout()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun refreshToken() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authServiceAsync = client.v2().auth()

        val response = authServiceAsync.refreshToken()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun revokeToken() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authServiceAsync = client.v2().auth()

        val response = authServiceAsync.revokeToken()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun userDetails() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val authServiceAsync = client.v2().auth()

        val response = authServiceAsync.userDetails()

        response.validate()
    }
}
