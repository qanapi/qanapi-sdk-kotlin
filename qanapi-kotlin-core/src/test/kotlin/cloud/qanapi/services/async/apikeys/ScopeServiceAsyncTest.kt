// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.apikeys

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.models.apikeys.scopes.ScopeAttachParams
import cloud.qanapi.models.apikeys.scopes.ScopeDetachParams
import cloud.qanapi.models.apikeys.scopes.ScopeSyncParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScopeServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun retrieve() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.apiKeys().scopes()

        val scopes = scopeServiceAsync.retrieve(0L)

        scopes.forEach { it.validate() }
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun attach() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.apiKeys().scopes()

        val response =
            scopeServiceAsync.attach(ScopeAttachParams.builder().apiKey(0L).addScopeId(25L).build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun detach() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.apiKeys().scopes()

        val response =
            scopeServiceAsync.detach(ScopeDetachParams.builder().apiKey(0L).addScopeId(1L).build())

        response.validate()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun sync() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val scopeServiceAsync = client.apiKeys().scopes()

        val response =
            scopeServiceAsync.sync(ScopeSyncParams.builder().apiKey(0L).addScopeId(25L).build())

        response.validate()
    }
}
