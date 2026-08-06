// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationTest {

    @Test
    fun create() {
        val configuration =
            Configuration.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(Value.builder().key("key").value("value").build())
                .build()

        assertThat(configuration.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(configuration.name()).isEqualTo("name")
        assertThat(configuration.type()).isEqualTo("type")
        assertThat(configuration.values())
            .containsExactly(Value.builder().key("key").value("value").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val configuration =
            Configuration.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .type("type")
                .addValue(Value.builder().key("key").value("value").build())
                .build()

        val roundtrippedConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(configuration),
                jacksonTypeRef<Configuration>(),
            )

        assertThat(roundtrippedConfiguration).isEqualTo(configuration)
    }
}
