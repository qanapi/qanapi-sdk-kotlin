// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.auth

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthRetrieveUserDetailsResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val authRetrieveUserDetailsResponse =
            AuthRetrieveUserDetailsResponse.builder()
                .id(123L)
                .email("fake.user@example.com")
                .emailVerifiedAt(null)
                .firstLogin(0L)
                .gravatarUrl("https://www.gravatar.com/avatar/00000000000000000000000000000000")
                .name("Fake User")
                .roles(listOf("admin", "user", "readonly", "audit"))
                .build()

        assertThat(authRetrieveUserDetailsResponse.id()).isEqualTo(123L)
        assertThat(authRetrieveUserDetailsResponse.email()).isEqualTo("fake.user@example.com")
        assertThat(authRetrieveUserDetailsResponse.emailVerifiedAt()).isNull()
        assertThat(authRetrieveUserDetailsResponse.firstLogin()).isEqualTo(0L)
        assertThat(authRetrieveUserDetailsResponse.gravatarUrl())
            .isEqualTo("https://www.gravatar.com/avatar/00000000000000000000000000000000")
        assertThat(authRetrieveUserDetailsResponse.name()).isEqualTo("Fake User")
        assertThat(authRetrieveUserDetailsResponse.roles())
            .containsExactly("admin", "user", "readonly", "audit")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authRetrieveUserDetailsResponse =
            AuthRetrieveUserDetailsResponse.builder()
                .id(123L)
                .email("fake.user@example.com")
                .emailVerifiedAt(null)
                .firstLogin(0L)
                .gravatarUrl("https://www.gravatar.com/avatar/00000000000000000000000000000000")
                .name("Fake User")
                .roles(listOf("admin", "user", "readonly", "audit"))
                .build()

        val roundtrippedAuthRetrieveUserDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authRetrieveUserDetailsResponse),
                jacksonTypeRef<AuthRetrieveUserDetailsResponse>(),
            )

        assertThat(roundtrippedAuthRetrieveUserDetailsResponse)
            .isEqualTo(authRetrieveUserDetailsResponse)
    }
}
