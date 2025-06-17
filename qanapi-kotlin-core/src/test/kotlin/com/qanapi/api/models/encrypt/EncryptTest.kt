// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.encrypt

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val encrypt =
            Encrypt.builder()
                .data("string")
                .access(Encrypt.Access.builder().addAcl("admin").addAcl("auditor").build())
                .attributes(
                    Encrypt.Attributes.builder()
                        .classification(Encrypt.Attributes.Classification.CONFIDENTIAL)
                        .owner("jane@example.com")
                        .addTag("pii")
                        .addTag("finance")
                        .build()
                )
                .addSensitiveField("string")
                .build()

        assertThat(encrypt.data()).isEqualTo(Encrypt.Data.ofString("string"))
        assertThat(encrypt.access())
            .isEqualTo(Encrypt.Access.builder().addAcl("admin").addAcl("auditor").build())
        assertThat(encrypt.attributes())
            .isEqualTo(
                Encrypt.Attributes.builder()
                    .classification(Encrypt.Attributes.Classification.CONFIDENTIAL)
                    .owner("jane@example.com")
                    .addTag("pii")
                    .addTag("finance")
                    .build()
            )
        assertThat(encrypt.sensitiveFields()).containsExactly("string")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val encrypt =
            Encrypt.builder()
                .data("string")
                .access(Encrypt.Access.builder().addAcl("admin").addAcl("auditor").build())
                .attributes(
                    Encrypt.Attributes.builder()
                        .classification(Encrypt.Attributes.Classification.CONFIDENTIAL)
                        .owner("jane@example.com")
                        .addTag("pii")
                        .addTag("finance")
                        .build()
                )
                .addSensitiveField("string")
                .build()

        val roundtrippedEncrypt =
            jsonMapper.readValue(jsonMapper.writeValueAsString(encrypt), jacksonTypeRef<Encrypt>())

        assertThat(roundtrippedEncrypt).isEqualTo(encrypt)
    }
}
