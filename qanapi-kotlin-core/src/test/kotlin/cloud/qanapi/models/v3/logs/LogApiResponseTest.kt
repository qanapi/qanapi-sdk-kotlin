// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.jsonMapper
import cloud.qanapi.models.v3.ApiKey
import cloud.qanapi.models.v3.Configuration
import cloud.qanapi.models.v3.Permission
import cloud.qanapi.models.v3.Role
import cloud.qanapi.models.v3.User
import cloud.qanapi.models.v3.Value
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogApiResponseTest {

    @Test
    fun create() {
        val logApiResponse =
            LogApiResponse.builder()
                .currentPage(0L)
                .addData(
                    LogApiResponse.Data.builder()
                        .apiKey(
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
                                                .addPermission(
                                                    Permission.builder().name("name").build()
                                                )
                                                .build()
                                        )
                                        .twoFactorEnabled(true)
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .apiKeyId(0L)
                        .configurationId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("domain")
                        .endpoint("endpoint")
                        .method("method")
                        .proxied(true)
                        .proxiedTo("proxied_to")
                        .requestId("request_id")
                        .statusCode(0L)
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogApiResponse.Link.builder()
                        .active(true)
                        .label("label")
                        .page(0L)
                        .url("url")
                        .build()
                )
                .nextPageUrl("https://example.com")
                .path("path")
                .perPage(0L)
                .prevPageUrl("https://example.com")
                .to(0L)
                .total(0L)
                .build()

        assertThat(logApiResponse.currentPage()).isEqualTo(0L)
        assertThat(logApiResponse.data())
            .containsExactly(
                LogApiResponse.Data.builder()
                    .apiKey(
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
                                            .addPermission(
                                                Permission.builder().name("name").build()
                                            )
                                            .build()
                                    )
                                    .twoFactorEnabled(true)
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .build()
                    )
                    .apiKeyId(0L)
                    .configurationId(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .domain("domain")
                    .endpoint("endpoint")
                    .method("method")
                    .proxied(true)
                    .proxiedTo("proxied_to")
                    .requestId("request_id")
                    .statusCode(0L)
                    .build()
            )
        assertThat(logApiResponse.firstPageUrl()).isEqualTo("https://example.com")
        assertThat(logApiResponse.from()).isEqualTo(0L)
        assertThat(logApiResponse.lastPage()).isEqualTo(0L)
        assertThat(logApiResponse.lastPageUrl()).isEqualTo("https://example.com")
        assertThat(logApiResponse.links())
            .containsExactly(
                LogApiResponse.Link.builder()
                    .active(true)
                    .label("label")
                    .page(0L)
                    .url("url")
                    .build()
            )
        assertThat(logApiResponse.nextPageUrl()).isEqualTo("https://example.com")
        assertThat(logApiResponse.path()).isEqualTo("path")
        assertThat(logApiResponse.perPage()).isEqualTo(0L)
        assertThat(logApiResponse.prevPageUrl()).isEqualTo("https://example.com")
        assertThat(logApiResponse.to()).isEqualTo(0L)
        assertThat(logApiResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logApiResponse =
            LogApiResponse.builder()
                .currentPage(0L)
                .addData(
                    LogApiResponse.Data.builder()
                        .apiKey(
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
                                                .addPermission(
                                                    Permission.builder().name("name").build()
                                                )
                                                .build()
                                        )
                                        .twoFactorEnabled(true)
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .build()
                        )
                        .apiKeyId(0L)
                        .configurationId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .domain("domain")
                        .endpoint("endpoint")
                        .method("method")
                        .proxied(true)
                        .proxiedTo("proxied_to")
                        .requestId("request_id")
                        .statusCode(0L)
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogApiResponse.Link.builder()
                        .active(true)
                        .label("label")
                        .page(0L)
                        .url("url")
                        .build()
                )
                .nextPageUrl("https://example.com")
                .path("path")
                .perPage(0L)
                .prevPageUrl("https://example.com")
                .to(0L)
                .total(0L)
                .build()

        val roundtrippedLogApiResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logApiResponse),
                jacksonTypeRef<LogApiResponse>(),
            )

        assertThat(roundtrippedLogApiResponse).isEqualTo(logApiResponse)
    }
}
