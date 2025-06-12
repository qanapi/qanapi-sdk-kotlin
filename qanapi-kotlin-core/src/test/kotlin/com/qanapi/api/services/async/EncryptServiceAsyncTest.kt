// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClientAsync
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.encrypt.EncryptEncryptDataParams
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
