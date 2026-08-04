// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v2

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.v2.encrypt.EncryptEncryptDataParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun encryptData() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val encryptService = client.v2().encrypt()

        val response =
            encryptService.encryptData(
                EncryptEncryptDataParams.builder()
                    .data(
                        EncryptEncryptDataParams.Data.EncryptEncryptDataResponseVariant2.builder()
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
