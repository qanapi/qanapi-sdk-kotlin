// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ValueTest {

    @Test
    fun create() {
        val value = Value.builder().key("key").value("value").build()

        assertThat(value.key()).isEqualTo("key")
        assertThat(value.value()).isEqualTo("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val value = Value.builder().key("key").value("value").build()

        val roundtrippedValue =
            jsonMapper.readValue(jsonMapper.writeValueAsString(value), jacksonTypeRef<Value>())

        assertThat(roundtrippedValue).isEqualTo(value)
    }
}
