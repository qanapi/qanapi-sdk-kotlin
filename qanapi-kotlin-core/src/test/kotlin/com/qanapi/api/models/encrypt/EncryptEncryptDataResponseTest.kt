// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.encrypt

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.JsonValue
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EncryptEncryptDataResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun ofString() {
        val string = "string"

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofString(string)

        assertThat(encryptEncryptDataResponse.string()).isEqualTo(string)
        assertThat(encryptEncryptDataResponse.double()).isNull()
        assertThat(encryptEncryptDataResponse.unionMember2()).isNull()
        assertThat(encryptEncryptDataResponse.jsonValues()).isNull()
    }

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun ofDouble() {
        val double = 0.0

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofDouble(double)

        assertThat(encryptEncryptDataResponse.string()).isNull()
        assertThat(encryptEncryptDataResponse.double()).isEqualTo(double)
        assertThat(encryptEncryptDataResponse.unionMember2()).isNull()
        assertThat(encryptEncryptDataResponse.jsonValues()).isNull()
    }

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
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

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun ofJsonValues() {
        val jsonValues = listOf(JsonValue.from(mapOf<String, Any>()))

        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofJsonValues(jsonValues)

        assertThat(encryptEncryptDataResponse.string()).isNull()
        assertThat(encryptEncryptDataResponse.double()).isNull()
        assertThat(encryptEncryptDataResponse.unionMember2()).isNull()
        assertThat(encryptEncryptDataResponse.jsonValues()).isEqualTo(jsonValues)
    }

    @Disabled("skipped: tests are disabled for the time being")
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
