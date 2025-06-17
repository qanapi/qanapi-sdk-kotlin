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
            .encryptedData(
                EncryptedData.builder()
                    .data(
                        EncryptedData.Data.UnionMember2.builder()
                            .putAdditionalProperty("password", JsonValue.from("bar"))
                            .build()
                    )
                    .access(EncryptedData.Access.builder().addAcl("admin").build())
                    .attributes(
                        EncryptedData.Attributes.builder()
                            .classification(EncryptedData.Attributes.Classification.CONFIDENTIAL)
                            .owner("alice@example.com")
                            .addTag("legal")
                            .build()
                    )
                    .addSensitiveField("password")
                    .build()
            )
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            EncryptEncryptDataParams.builder()
                .encryptedData(
                    EncryptedData.builder()
                        .data(
                            EncryptedData.Data.UnionMember2.builder()
                                .putAdditionalProperty("password", JsonValue.from("bar"))
                                .build()
                        )
                        .access(EncryptedData.Access.builder().addAcl("admin").build())
                        .attributes(
                            EncryptedData.Attributes.builder()
                                .classification(
                                    EncryptedData.Attributes.Classification.CONFIDENTIAL
                                )
                                .owner("alice@example.com")
                                .addTag("legal")
                                .build()
                        )
                        .addSensitiveField("password")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EncryptedData.builder()
                    .data(
                        EncryptedData.Data.UnionMember2.builder()
                            .putAdditionalProperty("password", JsonValue.from("bar"))
                            .build()
                    )
                    .access(EncryptedData.Access.builder().addAcl("admin").build())
                    .attributes(
                        EncryptedData.Attributes.builder()
                            .classification(EncryptedData.Attributes.Classification.CONFIDENTIAL)
                            .owner("alice@example.com")
                            .addTag("legal")
                            .build()
                    )
                    .addSensitiveField("password")
                    .build()
            )
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EncryptEncryptDataParams.builder()
                .encryptedData(
                    EncryptedData.builder()
                        .data(
                            EncryptedData.Data.UnionMember2.builder()
                                .putAdditionalProperty("password", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EncryptedData.builder()
                    .data(
                        EncryptedData.Data.UnionMember2.builder()
                            .putAdditionalProperty("password", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
    }
}
