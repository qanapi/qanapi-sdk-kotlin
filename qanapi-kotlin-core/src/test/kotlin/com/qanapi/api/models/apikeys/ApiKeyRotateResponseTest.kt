// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyRotateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder()
                .apiKey("cd_FAKE1234567890EXAMPLEKEY0987654321FAKEEXAMPLEKEY")
                .message("API key rotated successfully.")
                .build()

        assertThat(apiKeyRotateResponse.apiKey())
            .isEqualTo("cd_FAKE1234567890EXAMPLEKEY0987654321FAKEEXAMPLEKEY")
        assertThat(apiKeyRotateResponse.message()).isEqualTo("API key rotated successfully.")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder()
                .apiKey("cd_FAKE1234567890EXAMPLEKEY0987654321FAKEEXAMPLEKEY")
                .message("API key rotated successfully.")
                .build()

        val roundtrippedApiKeyRotateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyRotateResponse),
                jacksonTypeRef<ApiKeyRotateResponse>(),
            )

        assertThat(roundtrippedApiKeyRotateResponse).isEqualTo(apiKeyRotateResponse)
    }
}
