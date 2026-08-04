// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v2.encrypt

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.jsonMapper
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class EncryptEncryptDataResponseTest {

    @Test
    fun ofString() {
        val string = "string"

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofString(string)

        assertThat(encryptEncryptDataResponse.string()).isEqualTo(string)
        assertThat(encryptEncryptDataResponse.double()).isNull()
        assertThat(encryptEncryptDataResponse.variant2()).isNull()
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
        assertThat(encryptEncryptDataResponse.variant2()).isNull()
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
    fun ofVariant2() {
        val variant2 =
            EncryptEncryptDataResponse.EncryptEncryptDataResponseVariant2.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofVariant2(variant2)

        assertThat(encryptEncryptDataResponse.string()).isNull()
        assertThat(encryptEncryptDataResponse.double()).isNull()
        assertThat(encryptEncryptDataResponse.variant2()).isEqualTo(variant2)
        assertThat(encryptEncryptDataResponse.jsonValues()).isNull()
    }

    @Test
    fun ofVariant2Roundtrip() {
        val jsonMapper = jsonMapper()
        val encryptEncryptDataResponse =
            EncryptEncryptDataResponse.ofVariant2(
                EncryptEncryptDataResponse.EncryptEncryptDataResponseVariant2.builder()
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
        assertThat(encryptEncryptDataResponse.variant2()).isNull()
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

    @Test
    fun incompatibleJsonShapeDeserializesToUnknown() {
        val value = JsonValue.from(false)
        val encryptEncryptDataResponse =
            jsonMapper().convertValue(value, jacksonTypeRef<EncryptEncryptDataResponse>())

        val e = assertThrows<QanapiInvalidDataException> { encryptEncryptDataResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
