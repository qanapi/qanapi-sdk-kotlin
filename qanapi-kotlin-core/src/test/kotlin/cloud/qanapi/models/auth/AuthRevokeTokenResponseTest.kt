// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.auth

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthRevokeTokenResponseTest {

    @Test
    fun create() {
        val authRevokeTokenResponse =
            AuthRevokeTokenResponse.builder().message("Token successfully revoked.").build()

        assertThat(authRevokeTokenResponse.message()).isEqualTo("Token successfully revoked.")
    }

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
