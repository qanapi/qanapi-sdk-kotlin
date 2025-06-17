// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.decrypt

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DescryptTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val descrypt = Descrypt.builder().data("string").addSensitiveField("string").build()

        assertThat(descrypt.data()).isEqualTo(Descrypt.Data.ofString("string"))
        assertThat(descrypt.sensitiveFields()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val descrypt = Descrypt.builder().data("string").addSensitiveField("string").build()

        val roundtrippedDescrypt =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(descrypt),
                jacksonTypeRef<Descrypt>(),
            )

        assertThat(roundtrippedDescrypt).isEqualTo(descrypt)
    }
}
