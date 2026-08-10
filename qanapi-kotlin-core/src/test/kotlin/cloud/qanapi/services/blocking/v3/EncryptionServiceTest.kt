// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.v3.encryption.EncryptionDecryptParams
import cloud.qanapi.models.v3.encryption.EncryptionEncryptParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun decrypt() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val encryptionService = client.v3().encryption()

        val response =
            encryptionService.decrypt(
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
    fun encrypt() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val encryptionService = client.v3().encryption()

        val response =
            encryptionService.encrypt(
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
