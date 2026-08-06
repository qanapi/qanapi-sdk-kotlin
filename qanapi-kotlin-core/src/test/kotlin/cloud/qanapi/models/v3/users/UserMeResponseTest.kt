// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserMeResponseTest {

    @Test
    fun create() {
        val userMeResponse =
            UserMeResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserMeResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserMeResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userMeResponse.id()).isEqualTo(0L)
        assertThat(userMeResponse.email()).isEqualTo("dev@stainless.com")
        assertThat(userMeResponse.name()).isEqualTo("name")
        assertThat(userMeResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userMeResponse.roles())
            .containsExactly(
                UserMeResponse.Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(UserMeResponse.Role.Permission.builder().name("name").build())
                    .build()
            )
        assertThat(userMeResponse.twoFactorEnabled()).isEqualTo(true)
        assertThat(userMeResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userMeResponse =
            UserMeResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserMeResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserMeResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserMeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userMeResponse),
                jacksonTypeRef<UserMeResponse>(),
            )

        assertThat(roundtrippedUserMeResponse).isEqualTo(userMeResponse)
    }
}
