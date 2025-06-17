// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClientAsync
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.encrypt.EncryptEncryptDataParams
import com.qanapi.api.models.encrypt.EncryptedData
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EncryptServiceAsyncTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    suspend fun encryptData() {
        val client =
            QanapiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
        val encryptServiceAsync = client.encrypt()

        val response =
            encryptServiceAsync.encryptData(
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
