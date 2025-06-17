// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.auth

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthLoginResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val authLoginResponse =
            AuthLoginResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType("token_type")
                .build()

        assertThat(authLoginResponse.accessToken()).isEqualTo("access_token")
        assertThat(authLoginResponse.expiresIn()).isEqualTo(0L)
        assertThat(authLoginResponse.tokenType()).isEqualTo("token_type")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authLoginResponse =
            AuthLoginResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType("token_type")
                .build()

        val roundtrippedAuthLoginResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authLoginResponse),
                jacksonTypeRef<AuthLoginResponse>(),
            )

        assertThat(roundtrippedAuthLoginResponse).isEqualTo(authLoginResponse)
    }
}
