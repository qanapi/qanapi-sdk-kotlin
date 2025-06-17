// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.decrypt

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DecryptTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val decrypt = Decrypt.builder().data("string").addSensitiveField("string").build()

        assertThat(decrypt.data()).isEqualTo(Decrypt.Data.ofString("string"))
        assertThat(decrypt.sensitiveFields()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val decrypt = Decrypt.builder().data("string").addSensitiveField("string").build()

        val roundtrippedDecrypt =
            jsonMapper.readValue(jsonMapper.writeValueAsString(decrypt), jacksonTypeRef<Decrypt>())

        assertThat(roundtrippedDecrypt).isEqualTo(decrypt)
    }
}
