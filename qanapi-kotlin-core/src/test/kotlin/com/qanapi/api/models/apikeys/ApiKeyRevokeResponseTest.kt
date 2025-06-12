// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.apikeys

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyRevokeResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val apiKeyRevokeResponse =
            ApiKeyRevokeResponse.builder().message("API key has been revoked.").build()

        assertThat(apiKeyRevokeResponse.message()).isEqualTo("API key has been revoked.")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyRevokeResponse =
            ApiKeyRevokeResponse.builder().message("API key has been revoked.").build()

        val roundtrippedApiKeyRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyRevokeResponse),
                jacksonTypeRef<ApiKeyRevokeResponse>(),
            )

        assertThat(roundtrippedApiKeyRevokeResponse).isEqualTo(apiKeyRevokeResponse)
    }
}
