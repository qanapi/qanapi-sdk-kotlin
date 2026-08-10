// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleTest {

    @Test
    fun create() {
        val role =
            Role.builder()
                .name("name")
                .description("description")
                .addPermission(Permission.builder().name("name").build())
                .build()

        assertThat(role.name()).isEqualTo("name")
        assertThat(role.description()).isEqualTo("description")
        assertThat(role.permissions()).containsExactly(Permission.builder().name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val role =
            Role.builder()
                .name("name")
                .description("description")
                .addPermission(Permission.builder().name("name").build())
                .build()

        val roundtrippedRole =
            jsonMapper.readValue(jsonMapper.writeValueAsString(role), jacksonTypeRef<Role>())

        assertThat(roundtrippedRole).isEqualTo(role)
    }
}
