// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.models.scopes.ScopeCreateParams
import cloud.qanapi.models.scopes.ScopeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScopeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.scopes()

        val scope =
            scopeServiceAsync.create(
                ScopeCreateParams.builder().name("read:secrets").route("decrypt").build()
            )

        scope.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.scopes()

        val scope = scopeServiceAsync.retrieve(0L)

        scope.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.scopes()

        val scope =
            scopeServiceAsync.update(
                ScopeUpdateParams.builder().id(0L).name("read:secrets").route("decrypt").build()
            )

        scope.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.scopes()

        val scopes = scopeServiceAsync.list()

        scopes.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.scopes()

        val scope = scopeServiceAsync.delete(0L)

        scope.validate()
    }
}
