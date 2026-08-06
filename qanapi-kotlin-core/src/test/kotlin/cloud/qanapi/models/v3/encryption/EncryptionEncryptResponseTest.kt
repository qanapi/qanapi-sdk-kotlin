// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.encryption

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EncryptionEncryptResponseTest {

    @Test
    fun create() {
        val encryptionEncryptResponse =
            EncryptionEncryptResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val encryptionEncryptResponse =
            EncryptionEncryptResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedEncryptionEncryptResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptionEncryptResponse),
                jacksonTypeRef<EncryptionEncryptResponse>(),
            )

        assertThat(roundtrippedEncryptionEncryptResponse).isEqualTo(encryptionEncryptResponse)
    }
}
