// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val roleService = client.v3().roles()

        val roles = roleService.list()

        roles.forEach { it.validate() }
    }
}
