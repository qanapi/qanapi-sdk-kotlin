// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoleServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val roleServiceAsync = client.v3().roles()

        val roles = roleServiceAsync.list()

        roles.forEach { it.validate() }
    }
}
