// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.configurations

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationUpdateResponseTest {

    @Test
    fun create() {
        val configurationUpdateResponse =
            ConfigurationUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationUpdateResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        assertThat(configurationUpdateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configurationUpdateResponse.name()).isEqualTo("name")
        assertThat(configurationUpdateResponse.type()).isEqualTo("type")
        assertThat(configurationUpdateResponse.values())
            .containsExactly(
                ConfigurationUpdateResponse.Value.builder().key("key").value("value").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationUpdateResponse =
            ConfigurationUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationUpdateResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        val roundtrippedConfigurationUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationUpdateResponse),
                jacksonTypeRef<ConfigurationUpdateResponse>(),
            )

        assertThat(roundtrippedConfigurationUpdateResponse).isEqualTo(configurationUpdateResponse)
    }
}
