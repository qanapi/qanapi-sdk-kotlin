// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking

import cloud.qanapi.TestServerExtension
import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.encrypt.EncryptEncryptDataParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EncryptServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun encryptData() {
        val client =
            QanapiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val encryptService = client.encrypt()

        val response =
            encryptService.encryptData(
                EncryptEncryptDataParams.builder()
                    .data(
                        EncryptEncryptDataParams.Data.UnionMember2.builder()
                            .putAdditionalProperty("password", JsonValue.from("bar"))
                            .build()
                    )
                    .access(EncryptEncryptDataParams.Access.builder().addAcl("admin").build())
                    .attributes(
                        EncryptEncryptDataParams.Attributes.builder()
                            .classification(
                                EncryptEncryptDataParams.Attributes.Classification.CONFIDENTIAL
                            )
                            .owner("alice@example.com")
                            .addTag("legal")
                            .build()
                    )
                    .addSensitiveField("password")
                    .build()
            )

        response.validate()
    }
}
