// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DecryptServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun decryptPayload() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val decryptServiceAsync = client.decrypt()

        val response =
            decryptServiceAsync.decryptPayload(
                DecryptDecryptPayloadParams.builder()
                    .data(
                        DecryptDecryptPayloadParams.Data.UnionMember1.builder()
                            .putAdditionalProperty("password", JsonValue.from("bar"))
                            .build()
                    )
                    .addSensitiveField("password")
                    .build()
            )

        response.validate()
    }
}
