// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PermissionTest {

    @Test
    fun create() {
        val permission = Permission.builder().name("name").build()

        assertThat(permission.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val permission = Permission.builder().name("name").build()

        val roundtrippedPermission =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(permission),
                jacksonTypeRef<Permission>(),
            )

        assertThat(roundtrippedPermission).isEqualTo(permission)
    }
}
