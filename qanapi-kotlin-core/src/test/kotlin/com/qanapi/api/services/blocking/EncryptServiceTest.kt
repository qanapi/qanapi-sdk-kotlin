// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.blocking

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClient
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.encrypt.EncryptEncryptDataParams
import com.qanapi.api.models.encrypt.EncryptedData
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
                    .encryptedData(
                        EncryptedData.builder()
                            .data(
                                EncryptedData.Data.UnionMember2.builder()
                                    .putAdditionalProperty("password", JsonValue.from("bar"))
                                    .build()
                            )
                            .access(EncryptedData.Access.builder().addAcl("admin").build())
                            .attributes(
                                EncryptedData.Attributes.builder()
                                    .classification(
                                        EncryptedData.Attributes.Classification.CONFIDENTIAL
                                    )
                                    .owner("alice@example.com")
                                    .addTag("legal")
                                    .build()
                            )
                            .addSensitiveField("password")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
