// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.auth

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRefreshTokenResponseTest {

    @Test
    fun create() {
        val authRefreshTokenResponse =
            AuthRefreshTokenResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType("bearer")
                .build()

        assertThat(authRefreshTokenResponse.accessToken()).isEqualTo("access_token")
        assertThat(authRefreshTokenResponse.expiresIn()).isEqualTo(0L)
        assertThat(authRefreshTokenResponse.tokenType()).isEqualTo("bearer")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRefreshTokenResponse =
            AuthRefreshTokenResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType("bearer")
                .build()

        val roundtrippedAuthRefreshTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRefreshTokenResponse),
                jacksonTypeRef<AuthRefreshTokenResponse>(),
            )

        assertThat(roundtrippedAuthRefreshTokenResponse).isEqualTo(authRefreshTokenResponse)
    }
}
