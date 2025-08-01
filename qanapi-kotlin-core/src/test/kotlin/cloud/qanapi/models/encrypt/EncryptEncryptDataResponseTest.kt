// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.encrypt

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EncryptEncryptDataResponseTest {

    @Test
    fun ofString() {
        val string = "string"

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofString(string)

        assertThat(encryptEncryptDataResponse.string()).isEqualTo(string)
        assertThat(encryptEncryptDataResponse.double()).isNull()
        assertThat(encryptEncryptDataResponse.unionMember2()).isNull()
        assertThat(encryptEncryptDataResponse.jsonValues()).isNull()
    }

    @Test
    fun ofStringRoundtrip() {
        val jsonMapper = jsonMapper()
        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofString("string")

        val roundtrippedEncryptEncryptDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptEncryptDataResponse),
                jacksonTypeRef<EncryptEncryptDataResponse>(),
            )

        assertThat(roundtrippedEncryptEncryptDataResponse).isEqualTo(encryptEncryptDataResponse)
    }

    @Test
    fun ofDouble() {
        val double = 0.0

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofDouble(double)

        assertThat(encryptEncryptDataResponse.string()).isNull()
        assertThat(encryptEncryptDataResponse.double()).isEqualTo(double)
        assertThat(encryptEncryptDataResponse.unionMember2()).isNull()
        assertThat(encryptEncryptDataResponse.jsonValues()).isNull()
    }

    @Test
    fun ofDoubleRoundtrip() {
        val jsonMapper = jsonMapper()
        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofDouble(0.0)

        val roundtrippedEncryptEncryptDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptEncryptDataResponse),
                jacksonTypeRef<EncryptEncryptDataResponse>(),
            )

        assertThat(roundtrippedEncryptEncryptDataResponse).isEqualTo(encryptEncryptDataResponse)
    }

    @Test
    fun ofUnionMember2() {
        val unionMember2 =
            EncryptEncryptDataResponse.UnionMember2.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofUnionMember2(unionMember2)

        assertThat(encryptEncryptDataResponse.string()).isNull()
        assertThat(encryptEncryptDataResponse.double()).isNull()
        assertThat(encryptEncryptDataResponse.unionMember2()).isEqualTo(unionMember2)
        assertThat(encryptEncryptDataResponse.jsonValues()).isNull()
    }

    @Test
    fun ofUnionMember2Roundtrip() {
        val jsonMapper = jsonMapper()
        val encryptEncryptDataResponse =
            EncryptEncryptDataResponse.ofUnionMember2(
                EncryptEncryptDataResponse.UnionMember2.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )

        val roundtrippedEncryptEncryptDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptEncryptDataResponse),
                jacksonTypeRef<EncryptEncryptDataResponse>(),
            )

        assertThat(roundtrippedEncryptEncryptDataResponse).isEqualTo(encryptEncryptDataResponse)
    }

    @Test
    fun ofJsonValues() {
        val jsonValues = listOf(JsonValue.from(mapOf<String, Any>()))

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofJsonValues(jsonValues)

        assertThat(encryptEncryptDataResponse.string()).isNull()
        assertThat(encryptEncryptDataResponse.double()).isNull()
        assertThat(encryptEncryptDataResponse.unionMember2()).isNull()
        assertThat(encryptEncryptDataResponse.jsonValues()).isEqualTo(jsonValues)
    }

    @Test
    fun ofJsonValuesRoundtrip() {
        val jsonMapper = jsonMapper()
        val encryptEncryptDataResponse =
            EncryptEncryptDataResponse.ofJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))

        val roundtrippedEncryptEncryptDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptEncryptDataResponse),
                jacksonTypeRef<EncryptEncryptDataResponse>(),
            )

        assertThat(roundtrippedEncryptEncryptDataResponse).isEqualTo(encryptEncryptDataResponse)
    }
}
