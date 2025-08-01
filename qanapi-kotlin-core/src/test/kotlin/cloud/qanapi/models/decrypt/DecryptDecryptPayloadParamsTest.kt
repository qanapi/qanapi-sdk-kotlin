// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.decrypt

import cloud.qanapi.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DecryptDecryptPayloadParamsTest {

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
