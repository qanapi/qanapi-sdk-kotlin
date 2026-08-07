// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.encryption

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EncryptionDecryptParamsTest {

    @Test
    fun create() {
        EncryptionDecryptParams.builder()
            .proxy("proxy")
            .xQanapiFields("x-qanapi-fields")
            .data(
                EncryptionDecryptParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EncryptionDecryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .data(
                    EncryptionDecryptParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("proxy")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            EncryptionDecryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .data(
                    EncryptionDecryptParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("x-qanapi-fields", "x-qanapi-fields").build())
    }

    @Test
    fun body() {
        val params =
            EncryptionDecryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .data(
                    EncryptionDecryptParams.Data.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EncryptionDecryptParams.Data.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }
}
