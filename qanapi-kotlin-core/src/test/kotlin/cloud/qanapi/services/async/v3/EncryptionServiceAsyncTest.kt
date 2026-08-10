// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.v3.encryption.EncryptionDecryptParams
import cloud.qanapi.models.v3.encryption.EncryptionEncryptParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun decrypt() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val encryptionServiceAsync = client.v3().encryption()

        val response =
            encryptionServiceAsync.decrypt(
                EncryptionDecryptParams.builder()
                    .proxy("proxy")
                    .xQanapiFields("x-qanapi-fields")
                    .data(
                        EncryptionDecryptParams.Data.builder()
                            .putAdditionalProperty("name", JsonValue.from("bar"))
                            .putAdditionalProperty("email", JsonValue.from("bar"))
                            .putAdditionalProperty("ssn", JsonValue.from("bar"))
                            .putAdditionalProperty("dob", JsonValue.from("bar"))
                            .putAdditionalProperty("address", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun encrypt() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val encryptionServiceAsync = client.v3().encryption()

        val response =
            encryptionServiceAsync.encrypt(
                EncryptionEncryptParams.builder()
                    .proxy("proxy")
                    .xQanapiFields("x-qanapi-fields")
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
            )

        response.validate()
    }
}
