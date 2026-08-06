// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserShowResponseTest {

    @Test
    fun create() {
        val userShowResponse =
            UserShowResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserShowResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserShowResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(userShowResponse.id()).isEqualTo(0L)
        assertThat(userShowResponse.email()).isEqualTo("dev@stainless.com")
        assertThat(userShowResponse.name()).isEqualTo("name")
        assertThat(userShowResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(userShowResponse.roles())
            .containsExactly(
                UserShowResponse.Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(UserShowResponse.Role.Permission.builder().name("name").build())
                    .build()
            )
        assertThat(userShowResponse.twoFactorEnabled()).isEqualTo(true)
        assertThat(userShowResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userShowResponse =
            UserShowResponse.builder()
                .id(0L)
                .email("dev@stainless.com")
                .name("name")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addRole(
                    UserShowResponse.Role.builder()
                        .name("name")
                        .description("description")
                        .addPermission(
                            UserShowResponse.Role.Permission.builder().name("name").build()
                        )
                        .build()
                )
                .twoFactorEnabled(true)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedUserShowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userShowResponse),
                jacksonTypeRef<UserShowResponse>(),
            )

        assertThat(roundtrippedUserShowResponse).isEqualTo(userShowResponse)
    }
}
