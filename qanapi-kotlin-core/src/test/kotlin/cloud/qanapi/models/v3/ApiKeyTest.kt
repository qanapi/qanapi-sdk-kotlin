// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyTest {

    @Test
    fun create() {
        val apiKey =
            ApiKey.builder()
                .id("1")
                .prefix("qapi_")
                .status(ApiKey.Status.ACTIVE)
                .addConfiguration(
                    Configuration.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .type("type")
                        .addValue(Value.builder().key("key").value("value").build())
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPermission(Permission.builder().name("name").build())
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(
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
                )
                .build()

        assertThat(apiKey.id()).isEqualTo("1")
        assertThat(apiKey.prefix()).isEqualTo("qapi_")
        assertThat(apiKey.status()).isEqualTo(ApiKey.Status.ACTIVE)
        assertThat(apiKey.configurations())
            .containsExactly(
                Configuration.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .type("type")
                    .addValue(Value.builder().key("key").value("value").build())
                    .build()
            )
        assertThat(apiKey.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKey.permissions()).containsExactly(Permission.builder().name("name").build())
        assertThat(apiKey.revokedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKey.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKey.user())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKey =
            ApiKey.builder()
                .id("1")
                .prefix("qapi_")
                .status(ApiKey.Status.ACTIVE)
                .addConfiguration(
                    Configuration.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .type("type")
                        .addValue(Value.builder().key("key").value("value").build())
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPermission(Permission.builder().name("name").build())
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(
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
                )
                .build()

        val roundtrippedApiKey =
            jsonMapper.readValue(jsonMapper.writeValueAsString(apiKey), jacksonTypeRef<ApiKey>())

        assertThat(roundtrippedApiKey).isEqualTo(apiKey)
    }
}
