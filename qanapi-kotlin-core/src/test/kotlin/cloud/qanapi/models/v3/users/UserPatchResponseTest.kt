// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserPatchResponseTest {

    @Test
    fun create() {
        val userPatchResponse =
            UserPatchResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserPatchResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserPatchResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userPatchResponse.id()).isEqualTo(0L)
        assertThat(userPatchResponse.email()).isEqualTo("dev@stainless.com")
        assertThat(userPatchResponse.name()).isEqualTo("name")
        assertThat(userPatchResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userPatchResponse.roles())
            .containsExactly(
                UserPatchResponse.Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(UserPatchResponse.Role.Permission.builder().name("name").build())
                    .build()
            )
        assertThat(userPatchResponse.twoFactorEnabled()).isEqualTo(true)
        assertThat(userPatchResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userPatchResponse =
            UserPatchResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserPatchResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserPatchResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserPatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userPatchResponse),
                jacksonTypeRef<UserPatchResponse>(),
            )

        assertThat(roundtrippedUserPatchResponse).isEqualTo(userPatchResponse)
    }
}
