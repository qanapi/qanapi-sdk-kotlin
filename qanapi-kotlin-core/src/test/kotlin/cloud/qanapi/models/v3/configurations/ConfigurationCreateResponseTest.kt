// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.configurations

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationCreateResponseTest {

    @Test
    fun create() {
        val configurationCreateResponse =
            ConfigurationCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationCreateResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        assertThat(configurationCreateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configurationCreateResponse.name()).isEqualTo("name")
        assertThat(configurationCreateResponse.type()).isEqualTo("type")
        assertThat(configurationCreateResponse.values())
            .containsExactly(
                ConfigurationCreateResponse.Value.builder().key("key").value("value").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationCreateResponse =
            ConfigurationCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationCreateResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        val roundtrippedConfigurationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationCreateResponse),
                jacksonTypeRef<ConfigurationCreateResponse>(),
            )

        assertThat(roundtrippedConfigurationCreateResponse).isEqualTo(configurationCreateResponse)
    }
}
