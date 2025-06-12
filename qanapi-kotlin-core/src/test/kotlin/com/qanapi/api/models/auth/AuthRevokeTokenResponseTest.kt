// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.auth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthRevokeTokenResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val authRevokeTokenResponse =
            AuthRevokeTokenResponse.builder().message("Token successfully revoked.").build()

        assertThat(authRevokeTokenResponse.message()).isEqualTo("Token successfully revoked.")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRevokeTokenResponse =
            AuthRevokeTokenResponse.builder().message("Token successfully revoked.").build()

        val roundtrippedAuthRevokeTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRevokeTokenResponse),
                jacksonTypeRef<AuthRevokeTokenResponse>(),
            )

        assertThat(roundtrippedAuthRevokeTokenResponse).isEqualTo(authRevokeTokenResponse)
    }
}
