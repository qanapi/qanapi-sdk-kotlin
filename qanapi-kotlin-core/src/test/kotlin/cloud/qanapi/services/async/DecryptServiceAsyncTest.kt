// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DecryptServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun decryptPayload() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val decryptServiceAsync = client.decrypt()

        val response =
            decryptServiceAsync.decryptPayload(
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
