// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserListResponseTest {

    @Test
    fun create() {
        val userListResponse =
            UserListResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserListResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserListResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userListResponse.id()).isEqualTo(0L)
        assertThat(userListResponse.email()).isEqualTo("dev@stainless.com")
        assertThat(userListResponse.name()).isEqualTo("name")
        assertThat(userListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userListResponse.roles())
            .containsExactly(
                UserListResponse.Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(UserListResponse.Role.Permission.builder().name("name").build())
                    .build()
            )
        assertThat(userListResponse.twoFactorEnabled()).isEqualTo(true)
        assertThat(userListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userListResponse =
            UserListResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserListResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserListResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userListResponse),
                jacksonTypeRef<UserListResponse>(),
            )

        assertThat(roundtrippedUserListResponse).isEqualTo(userListResponse)
    }
}
