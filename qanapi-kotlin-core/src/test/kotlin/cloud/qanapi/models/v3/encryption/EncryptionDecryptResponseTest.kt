// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.encryption

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EncryptionDecryptResponseTest {

    @Test
    fun create() {
        val encryptionDecryptResponse =
            EncryptionDecryptResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val encryptionDecryptResponse =
            EncryptionDecryptResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedEncryptionDecryptResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptionDecryptResponse),
                jacksonTypeRef<EncryptionDecryptResponse>(),
            )

        assertThat(roundtrippedEncryptionDecryptResponse).isEqualTo(encryptionDecryptResponse)
    }
}
