// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateResponseTest {

    @Test
    fun create() {
        val userCreateResponse =
            UserCreateResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserCreateResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserCreateResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userCreateResponse.id()).isEqualTo(0L)
        assertThat(userCreateResponse.email()).isEqualTo("dev@stainless.com")
        assertThat(userCreateResponse.name()).isEqualTo("name")
        assertThat(userCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userCreateResponse.roles())
            .containsExactly(
                UserCreateResponse.Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(
                        UserCreateResponse.Role.Permission.builder().name("name").build()
                    )
                    .build()
            )
        assertThat(userCreateResponse.twoFactorEnabled()).isEqualTo(true)
        assertThat(userCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userCreateResponse =
            UserCreateResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserCreateResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserCreateResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userCreateResponse),
                jacksonTypeRef<UserCreateResponse>(),
            )

        assertThat(roundtrippedUserCreateResponse).isEqualTo(userCreateResponse)
    }
}
