// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v2.auth

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthUserDetailsResponseTest {

    @Test
    fun create() {
        val authUserDetailsResponse =
            AuthUserDetailsResponse.builder()
                .id(123L)
                .email("fake.user@example.com")
                .emailVerifiedAt(null)
                .firstLogin(0L)
                .gravatarUrl("https://www.gravatar.com/avatar/00000000000000000000000000000000")
                .name("Fake User")
                .roles(listOf("admin", "user", "readonly", "audit"))
                .build()

        assertThat(authUserDetailsResponse.id()).isEqualTo(123L)
        assertThat(authUserDetailsResponse.email()).isEqualTo("fake.user@example.com")
        assertThat(authUserDetailsResponse.emailVerifiedAt()).isNull()
        assertThat(authUserDetailsResponse.firstLogin()).isEqualTo(0L)
        assertThat(authUserDetailsResponse.gravatarUrl())
            .isEqualTo("https://www.gravatar.com/avatar/00000000000000000000000000000000")
        assertThat(authUserDetailsResponse.name()).isEqualTo("Fake User")
        assertThat(authUserDetailsResponse.roles())
            .containsExactly("admin", "user", "readonly", "audit")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authUserDetailsResponse =
            AuthUserDetailsResponse.builder()
                .id(123L)
                .email("fake.user@example.com")
                .emailVerifiedAt(null)
                .firstLogin(0L)
                .gravatarUrl("https://www.gravatar.com/avatar/00000000000000000000000000000000")
                .name("Fake User")
                .roles(listOf("admin", "user", "readonly", "audit"))
                .build()

        val roundtrippedAuthUserDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authUserDetailsResponse),
                jacksonTypeRef<AuthUserDetailsResponse>(),
            )

        assertThat(roundtrippedAuthUserDetailsResponse).isEqualTo(authUserDetailsResponse)
    }
}
