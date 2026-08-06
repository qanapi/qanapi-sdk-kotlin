// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.configurations

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationListResponseTest {

    @Test
    fun create() {
        val configurationListResponse =
            ConfigurationListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationListResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        assertThat(configurationListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configurationListResponse.name()).isEqualTo("name")
        assertThat(configurationListResponse.type()).isEqualTo("type")
        assertThat(configurationListResponse.values())
            .containsExactly(
                ConfigurationListResponse.Value.builder().key("key").value("value").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configurationListResponse =
            ConfigurationListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(
                    ConfigurationListResponse.Value.builder().key("key").value("value").build()
                )
                .build()

        val roundtrippedConfigurationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configurationListResponse),
                jacksonTypeRef<ConfigurationListResponse>(),
            )

        assertThat(roundtrippedConfigurationListResponse).isEqualTo(configurationListResponse)
    }
}
