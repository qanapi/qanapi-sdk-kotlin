// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.models.v3.users.UserCreateParams
import cloud.qanapi.models.v3.users.UserPatchParams
import cloud.qanapi.models.v3.users.UserRestoreParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userServiceAsync = client.v3().users()

        val user =
            userServiceAsync.create(
                UserCreateParams.builder().email("dev@stainless.com").role("role").build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userServiceAsync = client.v3().users()

        val users = userServiceAsync.list()

        users.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userServiceAsync = client.v3().users()

        userServiceAsync.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun me() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userServiceAsync = client.v3().users()

        val response = userServiceAsync.me()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun patch() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userServiceAsync = client.v3().users()

        val response =
            userServiceAsync.patch(
                UserPatchParams.builder()
                    .user(0L)
                    .email("dev@stainless.com")
                    .name("name")
                    .role("role")
                    .twoFactorEnabled(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun restore() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userServiceAsync = client.v3().users()

        val response =
            userServiceAsync.restore(
                UserRestoreParams.builder()
                    .user(0L)
                    .email("dev@stainless.com")
                    .name("name")
                    .role("role")
                    .twoFactorEnabled(true)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun show() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userServiceAsync = client.v3().users()

        val response = userServiceAsync.show(0L)

        response.validate()
    }
}
