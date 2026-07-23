// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.auth

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthLogoutResponseTest {

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
