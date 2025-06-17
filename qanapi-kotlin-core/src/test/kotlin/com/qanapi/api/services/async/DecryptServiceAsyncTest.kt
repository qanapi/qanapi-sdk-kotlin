// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.TestServerExtension
import com.qanapi.api.client.okhttp.QanapiOkHttpClientAsync
import com.qanapi.api.core.JsonValue
import com.qanapi.api.models.decrypt.DecryptDecryptPayloadParams
import com.qanapi.api.models.decrypt.DecryptedPayload
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
                    .decryptedPayload(
                        DecryptedPayload.builder()
                            .data(
                                DecryptedPayload.Data.UnionMember1.builder()
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
