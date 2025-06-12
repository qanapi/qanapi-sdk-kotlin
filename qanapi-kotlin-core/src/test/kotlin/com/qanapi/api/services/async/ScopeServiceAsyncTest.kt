// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClientAsync
import com.qanapi.api.models.scopes.ScopeCreateParams
import com.qanapi.api.models.scopes.ScopeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScopeServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
