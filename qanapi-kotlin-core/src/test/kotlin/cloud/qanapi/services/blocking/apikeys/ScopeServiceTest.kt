// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.apikeys

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.models.apikeys.scopes.ScopeAttachParams
import cloud.qanapi.models.apikeys.scopes.ScopeDetachParams
import cloud.qanapi.models.apikeys.scopes.ScopeSyncParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScopeServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun retrieve() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.apiKeys().scopes()

        val scopes = scopeService.retrieve(0L)

        scopes.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun attach() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.apiKeys().scopes()

        val response =
            scopeService.attach(ScopeAttachParams.builder().apiKey(0L).addScopeId(25L).build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun detach() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.apiKeys().scopes()

        val response =
            scopeService.detach(ScopeDetachParams.builder().apiKey(0L).addScopeId(1L).build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun sync() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeService = client.apiKeys().scopes()

        val response =
            scopeService.sync(ScopeSyncParams.builder().apiKey(0L).addScopeId(25L).build())

        response.validate()
    }
}
