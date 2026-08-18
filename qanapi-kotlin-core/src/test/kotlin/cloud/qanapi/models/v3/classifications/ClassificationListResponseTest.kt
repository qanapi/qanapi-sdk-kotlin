// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.classifications

import cloud.qanapi.core.jsonMapper
import cloud.qanapi.models.v3.GoogleGroup
import cloud.qanapi.models.v3.Permission
import cloud.qanapi.models.v3.Role
import cloud.qanapi.models.v3.User
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassificationListResponseTest {

    @Test
    fun create() {
        val classificationListResponse =
            ClassificationListResponse.builder()
                .currentPage(0L)
                .addData(
                    ClassificationListResponse.Data.builder()
                        .id(0L)
                        .bgColor("#e1cb97")
                        .fgColor("#e1cb97")
                        .name("name")
                        .slug("slug")
                        .description("description")
                        .emoji("emoji")
                        .addProvider(
                            ClassificationListResponse.Data.Provider.builder()
                                .addGwsGroup(
                                    GoogleGroup.builder()
                                        .id("id")
                                        .email("email")
                                        .name("name")
                                        .build()
                                )
                                .name("name")
                                .uuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addRole(
                            Role.builder()
                                .name("name")
                                .description("description")
                                .addPermission(Permission.builder().name("name").build())
                                .build()
                        )
                        .addUser(
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
                    ClassificationListResponse.Link.builder()
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

        assertThat(classificationListResponse.currentPage()).isEqualTo(0L)
        assertThat(classificationListResponse.data())
            .containsExactly(
                ClassificationListResponse.Data.builder()
                    .id(0L)
                    .bgColor("#e1cb97")
                    .fgColor("#e1cb97")
                    .name("name")
                    .slug("slug")
                    .description("description")
                    .emoji("emoji")
                    .addProvider(
                        ClassificationListResponse.Data.Provider.builder()
                            .addGwsGroup(
                                GoogleGroup.builder().id("id").email("email").name("name").build()
                            )
                            .name("name")
                            .uuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .addRole(
                        Role.builder()
                            .name("name")
                            .description("description")
                            .addPermission(Permission.builder().name("name").build())
                            .build()
                    )
                    .addUser(
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
        assertThat(classificationListResponse.firstPageUrl()).isEqualTo("https://example.com")
        assertThat(classificationListResponse.from()).isEqualTo(0L)
        assertThat(classificationListResponse.lastPage()).isEqualTo(0L)
        assertThat(classificationListResponse.lastPageUrl()).isEqualTo("https://example.com")
        assertThat(classificationListResponse.links())
            .containsExactly(
                ClassificationListResponse.Link.builder()
                    .active(true)
                    .label("label")
                    .page(0L)
                    .url("url")
                    .build()
            )
        assertThat(classificationListResponse.nextPageUrl()).isEqualTo("https://example.com")
        assertThat(classificationListResponse.path()).isEqualTo("path")
        assertThat(classificationListResponse.perPage()).isEqualTo(0L)
        assertThat(classificationListResponse.prevPageUrl()).isEqualTo("https://example.com")
        assertThat(classificationListResponse.to()).isEqualTo(0L)
        assertThat(classificationListResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val classificationListResponse =
            ClassificationListResponse.builder()
                .currentPage(0L)
                .addData(
                    ClassificationListResponse.Data.builder()
                        .id(0L)
                        .bgColor("#e1cb97")
                        .fgColor("#e1cb97")
                        .name("name")
                        .slug("slug")
                        .description("description")
                        .emoji("emoji")
                        .addProvider(
                            ClassificationListResponse.Data.Provider.builder()
                                .addGwsGroup(
                                    GoogleGroup.builder()
                                        .id("id")
                                        .email("email")
                                        .name("name")
                                        .build()
                                )
                                .name("name")
                                .uuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .addRole(
                            Role.builder()
                                .name("name")
                                .description("description")
                                .addPermission(Permission.builder().name("name").build())
                                .build()
                        )
                        .addUser(
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
                    ClassificationListResponse.Link.builder()
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

        val roundtrippedClassificationListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classificationListResponse),
                jacksonTypeRef<ClassificationListResponse>(),
            )

        assertThat(roundtrippedClassificationListResponse).isEqualTo(classificationListResponse)
    }
}
