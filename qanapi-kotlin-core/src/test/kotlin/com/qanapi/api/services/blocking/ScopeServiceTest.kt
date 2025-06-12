// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.blocking

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClient
import com.qanapi.api.models.scopes.ScopeCreateParams
import com.qanapi.api.models.scopes.ScopeUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ScopeServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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
