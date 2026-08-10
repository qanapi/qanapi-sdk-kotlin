// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.models.v3.configurations.ConfigurationCreateParams
import cloud.qanapi.models.v3.configurations.ConfigurationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigurationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationService = client.v3().configurations()

        val configuration =
            configurationService.create(
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
    fun update() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationService = client.v3().configurations()

        val configuration =
            configurationService.update(
                ConfigurationUpdateParams.builder()
                    .configuration("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )

        configuration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationService = client.v3().configurations()

        val configurations = configurationService.list()

        configurations.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationService = client.v3().configurations()

        configurationService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun show() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val configurationService = client.v3().configurations()

        val configuration = configurationService.show("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        configuration.validate()
    }
}
