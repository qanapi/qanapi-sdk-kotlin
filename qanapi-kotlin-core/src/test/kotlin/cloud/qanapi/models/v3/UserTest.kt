// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun create() {
        val user =
            User.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(Permission.builder().name("name").build())
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(user.id()).isEqualTo(0L)
        assertThat(user.email()).isEqualTo("dev@stainless.com")
        assertThat(user.name()).isEqualTo("name")
        assertThat(user.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(user.roles())
            .containsExactly(
                Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(Permission.builder().name("name").build())
                    .build()
            )
        assertThat(user.twoFactorEnabled()).isEqualTo(true)
        assertThat(user.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
            User.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(Permission.builder().name("name").build())
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}
