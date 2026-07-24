// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DecryptServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun decryptPayload() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val decryptService = client.decrypt()

        val response =
            decryptService.decryptPayload(
                DecryptDecryptPayloadParams.builder()
                    .data(
                        DecryptDecryptPayloadParams.Data.DecryptDecryptPayloadResponseVariant1
                            .builder()
                            .putAdditionalProperty("password", JsonValue.from("bar"))
                            .build()
                    )
                    .addSensitiveField("password")
                    .build()
            )

        response.validate()
    }
}
