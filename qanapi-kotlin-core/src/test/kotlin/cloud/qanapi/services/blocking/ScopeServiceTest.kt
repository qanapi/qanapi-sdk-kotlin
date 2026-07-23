// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.models.scopes.ScopeCreateParams
import cloud.qanapi.models.scopes.ScopeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScopeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.scopes()

        val scope =
            scopeService.create(
                ScopeCreateParams.builder().name("read:secrets").route("decrypt").build()
            )

        scope.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.scopes()

        val scope = scopeService.retrieve(0L)

        scope.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.scopes()

        val scope =
            scopeService.update(
                ScopeUpdateParams.builder().id(0L).name("read:secrets").route("decrypt").build()
            )

        scope.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.scopes()

        val scopes = scopeService.list()

        scopes.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.scopes()

        val scope = scopeService.delete(0L)

        scope.validate()
    }
}
