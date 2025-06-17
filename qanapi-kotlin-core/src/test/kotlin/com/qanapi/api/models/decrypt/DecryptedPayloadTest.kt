// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.decrypt

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DecryptedPayloadTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val decryptedPayload =
            DecryptedPayload.builder().data("string").addSensitiveField("string").build()

        assertThat(decryptedPayload.data()).isEqualTo(DecryptedPayload.Data.ofString("string"))
        assertThat(decryptedPayload.sensitiveFields()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val decryptedPayload =
            DecryptedPayload.builder().data("string").addSensitiveField("string").build()

        val roundtrippedDecryptedPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(decryptedPayload),
                jacksonTypeRef<DecryptedPayload>(),
            )

        assertThat(roundtrippedDecryptedPayload).isEqualTo(decryptedPayload)
    }
}
