// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.decrypt.DecryptDecryptPayloadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DecryptServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun decryptPayload() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val decryptService = client.decrypt()

        val response =
            decryptService.decryptPayload(
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
