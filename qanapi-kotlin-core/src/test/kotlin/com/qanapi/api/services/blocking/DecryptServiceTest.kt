// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.blocking

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClient
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadParams
import com.qanapi.api.models.decrypt.Descrypt
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DecryptServiceTest {

    @Disabled("skipped: tests are disabled for the time being")
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
                    .descrypt(
                        Descrypt.builder()
                            .data(
                                Descrypt.Data.UnionMember1.builder()
                                    .putAdditionalProperty("password", JsonValue.from("bar"))
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
