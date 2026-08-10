// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.models.v3.configurations.ConfigurationCreateParams
import cloud.qanapi.models.v3.configurations.ConfigurationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigurationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationServiceAsync = client.v3().configurations()

        val configuration =
            configurationServiceAsync.create(
                ConfigurationCreateParams.builder()
                    .name("name")
                    .type(ConfigurationCreateParams.Type.PROVIDER)
                    .provider(ConfigurationCreateParams.Provider.GOOGLE)
                    .build()
            )

        configuration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationServiceAsync = client.v3().configurations()

        val configuration =
            configurationServiceAsync.update(
                ConfigurationUpdateParams.builder()
                    .configuration("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        configuration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationServiceAsync = client.v3().configurations()

        val configurations = configurationServiceAsync.list()

        configurations.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationServiceAsync = client.v3().configurations()

        configurationServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun show() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationServiceAsync = client.v3().configurations()

        val configuration = configurationServiceAsync.show("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        configuration.validate()
    }
}
