// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.apikeys

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyListResponseTest {

    @Test
    fun create() {
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .id("1")
                .prefix("qapi_")
                .status(ApiKeyListResponse.Status.ACTIVE)
                .addConfiguration(
                    ApiKeyListResponse.Configuration.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .type("type")
                        .addValue(
                            ApiKeyListResponse.Configuration.Value.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPermission(ApiKeyListResponse.Permission.builder().name("name").build())
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(
                    ApiKeyListResponse.User.builder()
                        .id(0L)
                        .email("dev@stainless.com")
                        .name("name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRole(
                            ApiKeyListResponse.User.Role.builder()
                                .name("name")
                                .description("description")
                                .addPermission(
                                    ApiKeyListResponse.User.Role.Permission.builder()
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

        assertThat(apiKeyListResponse.id()).isEqualTo("1")
        assertThat(apiKeyListResponse.prefix()).isEqualTo("qapi_")
        assertThat(apiKeyListResponse.status()).isEqualTo(ApiKeyListResponse.Status.ACTIVE)
        assertThat(apiKeyListResponse.configurations())
            .containsExactly(
                ApiKeyListResponse.Configuration.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .type("type")
                    .addValue(
                        ApiKeyListResponse.Configuration.Value.builder()
                            .key("key")
                            .value("value")
                            .build()
                    )
                    .build()
            )
        assertThat(apiKeyListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.permissions())
            .containsExactly(ApiKeyListResponse.Permission.builder().name("name").build())
        assertThat(apiKeyListResponse.revokedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(apiKeyListResponse.user())
            .isEqualTo(
                ApiKeyListResponse.User.builder()
                    .id(0L)
                    .email("dev@stainless.com")
                    .name("name")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addRole(
                        ApiKeyListResponse.User.Role.builder()
                            .name("name")
                            .description("description")
                            .addPermission(
                                ApiKeyListResponse.User.Role.Permission.builder()
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
        val apiKeyListResponse =
            ApiKeyListResponse.builder()
                .id("1")
                .prefix("qapi_")
                .status(ApiKeyListResponse.Status.ACTIVE)
                .addConfiguration(
                    ApiKeyListResponse.Configuration.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .type("type")
                        .addValue(
                            ApiKeyListResponse.Configuration.Value.builder()
                                .key("key")
                                .value("value")
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPermission(ApiKeyListResponse.Permission.builder().name("name").build())
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(
                    ApiKeyListResponse.User.builder()
                        .id(0L)
                        .email("dev@stainless.com")
                        .name("name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRole(
                            ApiKeyListResponse.User.Role.builder()
                                .name("name")
                                .description("description")
                                .addPermission(
                                    ApiKeyListResponse.User.Role.Permission.builder()
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

        val roundtrippedApiKeyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyListResponse),
                jacksonTypeRef<ApiKeyListResponse>(),
            )

        assertThat(roundtrippedApiKeyListResponse).isEqualTo(apiKeyListResponse)
    }
}
