// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRestoreResponseTest {

    @Test
    fun create() {
        val userRestoreResponse =
            UserRestoreResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserRestoreResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserRestoreResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userRestoreResponse.id()).isEqualTo(0L)
        assertThat(userRestoreResponse.email()).isEqualTo("dev@stainless.com")
        assertThat(userRestoreResponse.name()).isEqualTo("name")
        assertThat(userRestoreResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userRestoreResponse.roles())
            .containsExactly(
                UserRestoreResponse.Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(
                        UserRestoreResponse.Role.Permission.builder().name("name").build()
                    )
                    .build()
            )
        assertThat(userRestoreResponse.twoFactorEnabled()).isEqualTo(true)
        assertThat(userRestoreResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userRestoreResponse =
            UserRestoreResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserRestoreResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserRestoreResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserRestoreResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userRestoreResponse),
                jacksonTypeRef<UserRestoreResponse>(),
            )

        assertThat(roundtrippedUserRestoreResponse).isEqualTo(userRestoreResponse)
    }
}
