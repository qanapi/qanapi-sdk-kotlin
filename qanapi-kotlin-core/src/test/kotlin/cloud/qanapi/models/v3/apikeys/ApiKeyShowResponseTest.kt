// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.apikeys

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyShowResponseTest {

    @Test
    fun create() {
        val apiKeyShowResponse =
            ApiKeyShowResponse.builder()
                .id("1")
                .prefix("qapi_")
                .status(ApiKeyShowResponse.Status.ACTIVE)
                .addConfiguration(
                    ApiKeyShowResponse.Configuration.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .type("type")
                        .addValue(
                            ApiKeyShowResponse.Configuration.Value.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPermission(ApiKeyShowResponse.Permission.builder().name("name").build())
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(
                    ApiKeyShowResponse.User.builder()
                        .id(0L)
                        .email("dev@stainless.com")
                        .name("name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRole(
                            ApiKeyShowResponse.User.Role.builder()
                                .name("name")
                                .description("description")
                                .addPermission(
                                    ApiKeyShowResponse.User.Role.Permission.builder()
                                        .name("name")
                                        .build()
                                )
                                .build()
                        )
                        .twoFactorEnabled(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(apiKeyShowResponse.id()).isEqualTo("1")
        assertThat(apiKeyShowResponse.prefix()).isEqualTo("qapi_")
        assertThat(apiKeyShowResponse.status()).isEqualTo(ApiKeyShowResponse.Status.ACTIVE)
        assertThat(apiKeyShowResponse.configurations())
            .containsExactly(
                ApiKeyShowResponse.Configuration.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .type("type")
                    .addValue(
                        ApiKeyShowResponse.Configuration.Value.builder()
                            .key("key")
                            .value("value")
                            .build()
                    )
                    .build()
            )
        assertThat(apiKeyShowResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyShowResponse.permissions())
            .containsExactly(ApiKeyShowResponse.Permission.builder().name("name").build())
        assertThat(apiKeyShowResponse.revokedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyShowResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyShowResponse.user())
            .isEqualTo(
                ApiKeyShowResponse.User.builder()
                    .id(0L)
                    .email("dev@stainless.com")
                    .name("name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addRole(
                        ApiKeyShowResponse.User.Role.builder()
                            .name("name")
                            .description("description")
                            .addPermission(
                                ApiKeyShowResponse.User.Role.Permission.builder()
                                    .name("name")
                                    .build()
                            )
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
        val apiKeyShowResponse =
            ApiKeyShowResponse.builder()
                .id("1")
                .prefix("qapi_")
                .status(ApiKeyShowResponse.Status.ACTIVE)
                .addConfiguration(
                    ApiKeyShowResponse.Configuration.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .type("type")
                        .addValue(
                            ApiKeyShowResponse.Configuration.Value.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPermission(ApiKeyShowResponse.Permission.builder().name("name").build())
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(
                    ApiKeyShowResponse.User.builder()
                        .id(0L)
                        .email("dev@stainless.com")
                        .name("name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRole(
                            ApiKeyShowResponse.User.Role.builder()
                                .name("name")
                                .description("description")
                                .addPermission(
                                    ApiKeyShowResponse.User.Role.Permission.builder()
                                        .name("name")
                                        .build()
                                )
                                .build()
                        )
                        .twoFactorEnabled(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedApiKeyShowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyShowResponse),
                jacksonTypeRef<ApiKeyShowResponse>(),
            )

        assertThat(roundtrippedApiKeyShowResponse).isEqualTo(apiKeyShowResponse)
    }
}
