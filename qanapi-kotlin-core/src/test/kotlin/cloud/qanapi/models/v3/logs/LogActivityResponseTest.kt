// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.jsonMapper
import cloud.qanapi.models.v3.Permission
import cloud.qanapi.models.v3.Role
import cloud.qanapi.models.v3.User
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogActivityResponseTest {

    @Test
    fun create() {
        val logActivityResponse =
            LogActivityResponse.builder()
                .currentPage(0L)
                .addData(
                    LogActivityResponse.Data.builder()
                        .action("action")
                        .description("description")
                        .ip("ip")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .when_("when")
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogActivityResponse.Link.builder()
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

        assertThat(logActivityResponse.currentPage()).isEqualTo(0L)
        assertThat(logActivityResponse.data())
            .containsExactly(
                LogActivityResponse.Data.builder()
                    .action("action")
                    .description("description")
                    .ip("ip")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .when_("when")
                    .build()
            )
        assertThat(logActivityResponse.firstPageUrl()).isEqualTo("https://example.com")
        assertThat(logActivityResponse.from()).isEqualTo(0L)
        assertThat(logActivityResponse.lastPage()).isEqualTo(0L)
        assertThat(logActivityResponse.lastPageUrl()).isEqualTo("https://example.com")
        assertThat(logActivityResponse.links())
            .containsExactly(
                LogActivityResponse.Link.builder()
                    .active(true)
                    .label("label")
                    .page(0L)
                    .url("url")
                    .build()
            )
        assertThat(logActivityResponse.nextPageUrl()).isEqualTo("https://example.com")
        assertThat(logActivityResponse.path()).isEqualTo("path")
        assertThat(logActivityResponse.perPage()).isEqualTo(0L)
        assertThat(logActivityResponse.prevPageUrl()).isEqualTo("https://example.com")
        assertThat(logActivityResponse.to()).isEqualTo(0L)
        assertThat(logActivityResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logActivityResponse =
            LogActivityResponse.builder()
                .currentPage(0L)
                .addData(
                    LogActivityResponse.Data.builder()
                        .action("action")
                        .description("description")
                        .ip("ip")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .when_("when")
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogActivityResponse.Link.builder()
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

        val roundtrippedLogActivityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logActivityResponse),
                jacksonTypeRef<LogActivityResponse>(),
            )

        assertThat(roundtrippedLogActivityResponse).isEqualTo(logActivityResponse)
    }
}
