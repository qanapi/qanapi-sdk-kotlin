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

internal class ClassificationShowResponseTest {

    @Test
    fun create() {
        val classificationShowResponse =
            ClassificationShowResponse.builder()
                .id(0L)
                .bgColor("#e1cb97")
                .fgColor("#e1cb97")
                .name("name")
                .slug("slug")
                .description("description")
                .emoji("emoji")
                .addProvider(
                    ClassificationShowResponse.Provider.builder()
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

        assertThat(classificationShowResponse.id()).isEqualTo(0L)
        assertThat(classificationShowResponse.bgColor()).isEqualTo("#e1cb97")
        assertThat(classificationShowResponse.fgColor()).isEqualTo("#e1cb97")
        assertThat(classificationShowResponse.name()).isEqualTo("name")
        assertThat(classificationShowResponse.slug()).isEqualTo("slug")
        assertThat(classificationShowResponse.description()).isEqualTo("description")
        assertThat(classificationShowResponse.emoji()).isEqualTo("emoji")
        assertThat(classificationShowResponse.providers())
            .containsExactly(
                ClassificationShowResponse.Provider.builder()
                    .addGwsGroup(GoogleGroup.builder().id("id").email("email").name("name").build())
                    .name("name")
                    .uuid("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(classificationShowResponse.roles())
            .containsExactly(
                Role.builder()
                    .name("name")
                    .description("description")
                    .addPermission(Permission.builder().name("name").build())
                    .build()
            )
        assertThat(classificationShowResponse.users())
            .containsExactly(
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
        val classificationShowResponse =
            ClassificationShowResponse.builder()
                .id(0L)
                .bgColor("#e1cb97")
                .fgColor("#e1cb97")
                .name("name")
                .slug("slug")
                .description("description")
                .emoji("emoji")
                .addProvider(
                    ClassificationShowResponse.Provider.builder()
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

        val roundtrippedClassificationShowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(classificationShowResponse),
                jacksonTypeRef<ClassificationShowResponse>(),
            )

        assertThat(roundtrippedClassificationShowResponse).isEqualTo(classificationShowResponse)
    }
}
