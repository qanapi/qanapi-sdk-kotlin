// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.auth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthLogoutResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val authLogoutResponse =
            AuthLogoutResponse.builder()
                .message("Successfully logged out")
                .user("user@example.com")
                .build()

        assertThat(authLogoutResponse.message()).isEqualTo("Successfully logged out")
        assertThat(authLogoutResponse.user()).isEqualTo("user@example.com")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authLogoutResponse =
            AuthLogoutResponse.builder()
                .message("Successfully logged out")
                .user("user@example.com")
                .build()

        val roundtrippedAuthLogoutResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authLogoutResponse),
                jacksonTypeRef<AuthLogoutResponse>(),
            )

        assertThat(roundtrippedAuthLogoutResponse).isEqualTo(authLogoutResponse)
    }
}
