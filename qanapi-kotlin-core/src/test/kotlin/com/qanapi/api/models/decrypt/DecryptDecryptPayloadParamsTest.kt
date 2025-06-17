// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.decrypt

import com.qanapi.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DecryptDecryptPayloadParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        DecryptDecryptPayloadParams.builder()
            .data(
                DecryptDecryptPayloadParams.Data.UnionMember1.builder()
                    .putAdditionalProperty("password", JsonValue.from("bar"))
                    .build()
            )
            .addSensitiveField("password")
            .build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            DecryptDecryptPayloadParams.builder()
                .data(
                    DecryptDecryptPayloadParams.Data.UnionMember1.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
                .addSensitiveField("password")
                .build()

        val body = params._body()

        assertThat(body.data())
            .isEqualTo(
                DecryptDecryptPayloadParams.Data.ofUnionMember1(
                    DecryptDecryptPayloadParams.Data.UnionMember1.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
            )
        assertThat(body.sensitiveFields()).containsExactly("password")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DecryptDecryptPayloadParams.builder()
                .data(
                    DecryptDecryptPayloadParams.Data.UnionMember1.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.data())
            .isEqualTo(
                DecryptDecryptPayloadParams.Data.ofUnionMember1(
                    DecryptDecryptPayloadParams.Data.UnionMember1.builder()
                        .putAdditionalProperty("password", JsonValue.from("bar"))
                        .build()
                )
            )
    }
}
