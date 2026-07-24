// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.decrypt

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.jsonMapper
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class DecryptDecryptPayloadResponseTest {

    @Test
    fun ofString() {
        val string = "string"

        val decryptDecryptPayloadResponse = DecryptDecryptPayloadResponse.ofString(string)

        assertThat(decryptDecryptPayloadResponse.string()).isEqualTo(string)
        assertThat(decryptDecryptPayloadResponse.variant1()).isNull()
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
    fun ofVariant1() {
        val variant1 =
            DecryptDecryptPayloadResponse.DecryptDecryptPayloadResponseVariant1.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val decryptDecryptPayloadResponse = DecryptDecryptPayloadResponse.ofVariant1(variant1)

        assertThat(decryptDecryptPayloadResponse.string()).isNull()
        assertThat(decryptDecryptPayloadResponse.variant1()).isEqualTo(variant1)
        assertThat(decryptDecryptPayloadResponse.jsonValues()).isNull()
    }

    @Test
    fun ofVariant1Roundtrip() {
        val jsonMapper = jsonMapper()
        val decryptDecryptPayloadResponse =
            DecryptDecryptPayloadResponse.ofVariant1(
                DecryptDecryptPayloadResponse.DecryptDecryptPayloadResponseVariant1.builder()
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
        assertThat(decryptDecryptPayloadResponse.variant1()).isNull()
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

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val decryptDecryptPayloadResponse =
            jsonMapper()
                .convertValue(testCase.value, jacksonTypeRef<DecryptDecryptPayloadResponse>())

        val e =
            assertThrows<QanapiInvalidDataException> { decryptDecryptPayloadResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
