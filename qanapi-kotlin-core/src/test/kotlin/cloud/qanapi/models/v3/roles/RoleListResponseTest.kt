// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.roles

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleListResponseTest {

    @Test
    fun create() {
        val roleListResponse =
            RoleListResponse.builder()
                .name("name")
                .description("description")
                .addPermission(RoleListResponse.Permission.builder().name("name").build())
                .build()

        assertThat(roleListResponse.name()).isEqualTo("name")
        assertThat(roleListResponse.description()).isEqualTo("description")
        assertThat(roleListResponse.permissions())
            .containsExactly(RoleListResponse.Permission.builder().name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roleListResponse =
            RoleListResponse.builder()
                .name("name")
                .description("description")
                .addPermission(RoleListResponse.Permission.builder().name("name").build())
                .build()

        val roundtrippedRoleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roleListResponse),
                jacksonTypeRef<RoleListResponse>(),
            )

        assertThat(roundtrippedRoleListResponse).isEqualTo(roleListResponse)
    }
}
