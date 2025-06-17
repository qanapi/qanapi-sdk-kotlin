// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.encrypt

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptedDataTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val encryptedData =
            EncryptedData.builder()
                .data("string")
                .access(EncryptedData.Access.builder().addAcl("admin").addAcl("auditor").build())
                .attributes(
                    EncryptedData.Attributes.builder()
                        .classification(EncryptedData.Attributes.Classification.CONFIDENTIAL)
                        .owner("jane@example.com")
                        .addTag("pii")
                        .addTag("finance")
                        .build()
                )
                .addSensitiveField("string")
                .build()

        assertThat(encryptedData.data()).isEqualTo(EncryptedData.Data.ofString("string"))
        assertThat(encryptedData.access())
            .isEqualTo(EncryptedData.Access.builder().addAcl("admin").addAcl("auditor").build())
        assertThat(encryptedData.attributes())
            .isEqualTo(
                EncryptedData.Attributes.builder()
                    .classification(EncryptedData.Attributes.Classification.CONFIDENTIAL)
                    .owner("jane@example.com")
                    .addTag("pii")
                    .addTag("finance")
                    .build()
            )
        assertThat(encryptedData.sensitiveFields()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val encryptedData =
            EncryptedData.builder()
                .data("string")
                .access(EncryptedData.Access.builder().addAcl("admin").addAcl("auditor").build())
                .attributes(
                    EncryptedData.Attributes.builder()
                        .classification(EncryptedData.Attributes.Classification.CONFIDENTIAL)
                        .owner("jane@example.com")
                        .addTag("pii")
                        .addTag("finance")
                        .build()
                )
                .addSensitiveField("string")
                .build()

        val roundtrippedEncryptedData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptedData),
                jacksonTypeRef<EncryptedData>(),
            )

        assertThat(roundtrippedEncryptedData).isEqualTo(encryptedData)
    }
}
