// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.decrypt

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DecryptDecryptPayloadResponseTest {

    @Test
    fun ofString() {
        val string = "string"

        val decryptDecryptPayloadResponse = DecryptDecryptPayloadResponse.ofString(string)

        assertThat(decryptDecryptPayloadResponse.string()).isEqualTo(string)
        assertThat(decryptDecryptPayloadResponse.unionMember1()).isNull()
        assertThat(decryptDecryptPayloadResponse.jsonValues()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val decryptDecryptPayloadResponse = DecryptDecryptPayloadResponse.ofString("string")

        val roundtrippedDecryptDecryptPayloadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(decryptDecryptPayloadResponse),
                jacksonTypeRef<DecryptDecryptPayloadResponse>(),
            )

        assertThat(roundtrippedDecryptDecryptPayloadResponse)
            .isEqualTo(decryptDecryptPayloadResponse)
    }

    @Test
    fun ofUnionMember1() {
        val unionMember1 =
            DecryptDecryptPayloadResponse.UnionMember1.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val decryptDecryptPayloadResponse =
            DecryptDecryptPayloadResponse.ofUnionMember1(unionMember1)

        assertThat(decryptDecryptPayloadResponse.string()).isNull()
        assertThat(decryptDecryptPayloadResponse.unionMember1()).isEqualTo(unionMember1)
        assertThat(decryptDecryptPayloadResponse.jsonValues()).isNull()
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val decryptDecryptPayloadResponse =
            DecryptDecryptPayloadResponse.ofUnionMember1(
                DecryptDecryptPayloadResponse.UnionMember1.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedDecryptDecryptPayloadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(decryptDecryptPayloadResponse),
                jacksonTypeRef<DecryptDecryptPayloadResponse>(),
            )

        assertThat(roundtrippedDecryptDecryptPayloadResponse)
            .isEqualTo(decryptDecryptPayloadResponse)
    }

    @Test
    fun ofJsonValues() {
        val jsonValues = listOf(JsonValue.from(mapOf<String, Any>()))

        val decryptDecryptPayloadResponse = DecryptDecryptPayloadResponse.ofJsonValues(jsonValues)

        assertThat(decryptDecryptPayloadResponse.string()).isNull()
        assertThat(decryptDecryptPayloadResponse.unionMember1()).isNull()
        assertThat(decryptDecryptPayloadResponse.jsonValues()).isEqualTo(jsonValues)
    }

    @Test
    fun ofJsonValuesRoundtrip() {
        val jsonMapper = jsonMapper()
        val decryptDecryptPayloadResponse =
            DecryptDecryptPayloadResponse.ofJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))

        val roundtrippedDecryptDecryptPayloadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(decryptDecryptPayloadResponse),
                jacksonTypeRef<DecryptDecryptPayloadResponse>(),
            )

        assertThat(roundtrippedDecryptDecryptPayloadResponse)
            .isEqualTo(decryptDecryptPayloadResponse)
    }
}
