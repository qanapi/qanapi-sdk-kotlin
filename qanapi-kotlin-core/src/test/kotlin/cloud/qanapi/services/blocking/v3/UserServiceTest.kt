// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.models.v3.users.UserCreateParams
import cloud.qanapi.models.v3.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userService = client.v3().users()

        val user =
            userService.create(
                UserCreateParams.builder().email("dev@stainless.com").role("role").build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userService = client.v3().users()

        val user =
            userService.update(
                UserUpdateParams.builder()
                    .user(0L)
                    .email("dev@stainless.com")
                    .name("name")
                    .role("role")
                    .twoFactorEnabled(true)
                    .build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userService = client.v3().users()

        val users = userService.list()

        users.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userService = client.v3().users()

        userService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun me() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userService = client.v3().users()

        val user = userService.me()

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restore() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userService = client.v3().users()

        val user = userService.restore(0L)

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun show() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val userService = client.v3().users()

        val user = userService.show(0L)

        user.validate()
    }
}
