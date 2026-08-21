// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.encryption

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EncryptionEncryptParamsTest {

    @Test
    fun create() {
        EncryptionEncryptParams.builder()
            .proxy("proxy")
            .xQanapiFields("x-qanapi-fields")
            .xQanapiClassification("x-qanapi-classification")
            .xQanapiDestination("x-qanapi-destination")
            .data(
                EncryptionEncryptParams.Data.builder()
                    .putAdditionalProperty("name", JsonValue.from("bar"))
                    .putAdditionalProperty("email", JsonValue.from("bar"))
                    .putAdditionalProperty("ssn", JsonValue.from("bar"))
                    .putAdditionalProperty("dob", JsonValue.from("bar"))
                    .putAdditionalProperty("address", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EncryptionEncryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .data(
                    EncryptionEncryptParams.Data.builder()
                        .putAdditionalProperty("name", JsonValue.from("bar"))
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("ssn", JsonValue.from("bar"))
                        .putAdditionalProperty("dob", JsonValue.from("bar"))
                        .putAdditionalProperty("address", JsonValue.from("bar"))
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
            EncryptionEncryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .xQanapiClassification("x-qanapi-classification")
                .xQanapiDestination("x-qanapi-destination")
                .data(
                    EncryptionEncryptParams.Data.builder()
                        .putAdditionalProperty("name", JsonValue.from("bar"))
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("ssn", JsonValue.from("bar"))
                        .putAdditionalProperty("dob", JsonValue.from("bar"))
                        .putAdditionalProperty("address", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("x-qanapi-fields", "x-qanapi-fields")
                    .put("x-qanapi-classification", "x-qanapi-classification")
                    .put("x-qanapi-destination", "x-qanapi-destination")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            EncryptionEncryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .data(
                    EncryptionEncryptParams.Data.builder()
                        .putAdditionalProperty("name", JsonValue.from("bar"))
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("ssn", JsonValue.from("bar"))
                        .putAdditionalProperty("dob", JsonValue.from("bar"))
                        .putAdditionalProperty("address", JsonValue.from("bar"))
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
            EncryptionEncryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .xQanapiClassification("x-qanapi-classification")
                .xQanapiDestination("x-qanapi-destination")
                .data(
                    EncryptionEncryptParams.Data.builder()
                        .putAdditionalProperty("name", JsonValue.from("bar"))
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("ssn", JsonValue.from("bar"))
                        .putAdditionalProperty("dob", JsonValue.from("bar"))
                        .putAdditionalProperty("address", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EncryptionEncryptParams.Data.builder()
                    .putAdditionalProperty("name", JsonValue.from("bar"))
                    .putAdditionalProperty("email", JsonValue.from("bar"))
                    .putAdditionalProperty("ssn", JsonValue.from("bar"))
                    .putAdditionalProperty("dob", JsonValue.from("bar"))
                    .putAdditionalProperty("address", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EncryptionEncryptParams.builder()
                .proxy("proxy")
                .xQanapiFields("x-qanapi-fields")
                .data(
                    EncryptionEncryptParams.Data.builder()
                        .putAdditionalProperty("name", JsonValue.from("bar"))
                        .putAdditionalProperty("email", JsonValue.from("bar"))
                        .putAdditionalProperty("ssn", JsonValue.from("bar"))
                        .putAdditionalProperty("dob", JsonValue.from("bar"))
                        .putAdditionalProperty("address", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                EncryptionEncryptParams.Data.builder()
                    .putAdditionalProperty("name", JsonValue.from("bar"))
                    .putAdditionalProperty("email", JsonValue.from("bar"))
                    .putAdditionalProperty("ssn", JsonValue.from("bar"))
                    .putAdditionalProperty("dob", JsonValue.from("bar"))
                    .putAdditionalProperty("address", JsonValue.from("bar"))
                    .build()
            )
    }
}
