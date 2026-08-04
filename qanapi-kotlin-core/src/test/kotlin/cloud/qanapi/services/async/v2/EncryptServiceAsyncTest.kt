// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v2

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.core.JsonValue
import cloud.qanapi.models.v2.encrypt.EncryptEncryptDataParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun encryptData() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val encryptServiceAsync = client.v2().encrypt()

        val response =
            encryptServiceAsync.encryptData(
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
