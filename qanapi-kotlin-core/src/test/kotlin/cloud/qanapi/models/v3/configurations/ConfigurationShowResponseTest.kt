// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.configurations

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationShowResponseTest {

    @Test
    fun create() {
        val configurationShowResponse =
            ConfigurationShowResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationShowResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        assertThat(configurationShowResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configurationShowResponse.name()).isEqualTo("name")
        assertThat(configurationShowResponse.type()).isEqualTo("type")
        assertThat(configurationShowResponse.values())
            .containsExactly(
                ConfigurationShowResponse.Value.builder().key("key").value("value").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationShowResponse =
            ConfigurationShowResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationShowResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        val roundtrippedConfigurationShowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationShowResponse),
                jacksonTypeRef<ConfigurationShowResponse>(),
            )

        assertThat(roundtrippedConfigurationShowResponse).isEqualTo(configurationShowResponse)
    }
}
