// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.jsonMapper
import cloud.qanapi.models.v3.Configuration
import cloud.qanapi.models.v3.Permission
import cloud.qanapi.models.v3.Role
import cloud.qanapi.models.v3.User
import cloud.qanapi.models.v3.Value
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogUnifiedResponseTest {

    @Test
    fun create() {
        val logUnifiedResponse =
            LogUnifiedResponse.builder()
                .currentPage(0L)
                .addData(
                    LogUnifiedResponse.Data.builder()
                        .action("action")
                        .causerEmail("dev@stainless.com")
                        .configuration(
                            Configuration.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .type("type")
                                .addValue(Value.builder().key("key").value("value").build())
                                .build()
                        )
                        .description("description")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .fullLog(
                            LogUnifiedResponse.Data.FullLog.ActivityLog.builder()
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
                                                .addPermission(
                                                    Permission.builder().name("name").build()
                                                )
                                                .build()
                                        )
                                        .twoFactorEnabled(true)
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .when_("when")
                                .build()
                        )
                        .logType(LogUnifiedResponse.Data.LogType.ACTIVITY)
                        .requestId("request_id")
                        .statusCode(0L)
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
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogUnifiedResponse.Link.builder()
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

        assertThat(logUnifiedResponse.currentPage()).isEqualTo(0L)
        assertThat(logUnifiedResponse.data())
            .containsExactly(
                LogUnifiedResponse.Data.builder()
                    .action("action")
                    .causerEmail("dev@stainless.com")
                    .configuration(
                        Configuration.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .type("type")
                            .addValue(Value.builder().key("key").value("value").build())
                            .build()
                    )
                    .description("description")
                    .details(JsonValue.from(mapOf<String, Any>()))
                    .fullLog(
                        LogUnifiedResponse.Data.FullLog.ActivityLog.builder()
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
                                            .addPermission(
                                                Permission.builder().name("name").build()
                                            )
                                            .build()
                                    )
                                    .twoFactorEnabled(true)
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .when_("when")
                            .build()
                    )
                    .logType(LogUnifiedResponse.Data.LogType.ACTIVITY)
                    .requestId("request_id")
                    .statusCode(0L)
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
                    .build()
            )
        assertThat(logUnifiedResponse.firstPageUrl()).isEqualTo("https://example.com")
        assertThat(logUnifiedResponse.from()).isEqualTo(0L)
        assertThat(logUnifiedResponse.lastPage()).isEqualTo(0L)
        assertThat(logUnifiedResponse.lastPageUrl()).isEqualTo("https://example.com")
        assertThat(logUnifiedResponse.links())
            .containsExactly(
                LogUnifiedResponse.Link.builder()
                    .active(true)
                    .label("label")
                    .page(0L)
                    .url("url")
                    .build()
            )
        assertThat(logUnifiedResponse.nextPageUrl()).isEqualTo("https://example.com")
        assertThat(logUnifiedResponse.path()).isEqualTo("path")
        assertThat(logUnifiedResponse.perPage()).isEqualTo(0L)
        assertThat(logUnifiedResponse.prevPageUrl()).isEqualTo("https://example.com")
        assertThat(logUnifiedResponse.to()).isEqualTo(0L)
        assertThat(logUnifiedResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logUnifiedResponse =
            LogUnifiedResponse.builder()
                .currentPage(0L)
                .addData(
                    LogUnifiedResponse.Data.builder()
                        .action("action")
                        .causerEmail("dev@stainless.com")
                        .configuration(
                            Configuration.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .type("type")
                                .addValue(Value.builder().key("key").value("value").build())
                                .build()
                        )
                        .description("description")
                        .details(JsonValue.from(mapOf<String, Any>()))
                        .fullLog(
                            LogUnifiedResponse.Data.FullLog.ActivityLog.builder()
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
                                                .addPermission(
                                                    Permission.builder().name("name").build()
                                                )
                                                .build()
                                        )
                                        .twoFactorEnabled(true)
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .when_("when")
                                .build()
                        )
                        .logType(LogUnifiedResponse.Data.LogType.ACTIVITY)
                        .requestId("request_id")
                        .statusCode(0L)
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
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogUnifiedResponse.Link.builder()
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

        val roundtrippedLogUnifiedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logUnifiedResponse),
                jacksonTypeRef<LogUnifiedResponse>(),
            )

        assertThat(roundtrippedLogUnifiedResponse).isEqualTo(logUnifiedResponse)
    }
}
