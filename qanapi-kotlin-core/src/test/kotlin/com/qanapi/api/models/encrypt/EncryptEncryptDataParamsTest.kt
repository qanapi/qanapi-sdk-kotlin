// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.encrypt

import com.qanapi.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptEncryptDataParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        EncryptEncryptDataParams.builder()
            .data(
                EncryptEncryptDataParams.Data.UnionMember2.builder()
                    .putAdditionalProperty("password", JsonValue.from("bar"))
                    .build()
            )
            .access(EncryptEncryptDataParams.Access.builder().addAcl("admin").build())
            .attributes(
                EncryptEncryptDataParams.Attributes.builder()
                    .classification(EncryptEncryptDataParams.Attributes.Classification.CONFIDENTIAL)
                    .owner("alice@example.com")
                    .addTag("legal")
                    .build()
            )
            .addSensitiveField("password")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            EncryptEncryptDataParams.builder()
                .data(
                    EncryptEncryptDataParams.Data.UnionMember2.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
                .access(EncryptEncryptDataParams.Access.builder().addAcl("admin").build())
                .attributes(
                    EncryptEncryptDataParams.Attributes.builder()
                        .classification(
                            EncryptEncryptDataParams.Attributes.Classification.CONFIDENTIAL
                        )
                        .owner("alice@example.com")
                        .addTag("legal")
                        .build()
                )
                .addSensitiveField("password")
                .build()

        val body = params._body()

        assertThat(body.data())
            .isEqualTo(
                EncryptEncryptDataParams.Data.ofUnionMember2(
                    EncryptEncryptDataParams.Data.UnionMember2.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.access())
            .isEqualTo(EncryptEncryptDataParams.Access.builder().addAcl("admin").build())
        assertThat(body.attributes())
            .isEqualTo(
                EncryptEncryptDataParams.Attributes.builder()
                    .classification(EncryptEncryptDataParams.Attributes.Classification.CONFIDENTIAL)
                    .owner("alice@example.com")
                    .addTag("legal")
                    .build()
            )
        assertThat(body.sensitiveFields()).containsExactly("password")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EncryptEncryptDataParams.builder()
                .data(
                    EncryptEncryptDataParams.Data.UnionMember2.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.data())
            .isEqualTo(
                EncryptEncryptDataParams.Data.ofUnionMember2(
                    EncryptEncryptDataParams.Data.UnionMember2.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
            )
    }
}
