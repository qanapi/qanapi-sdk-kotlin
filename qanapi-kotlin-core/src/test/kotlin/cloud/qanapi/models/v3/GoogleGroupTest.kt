// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GoogleGroupTest {

    @Test
    fun create() {
        val googleGroup = GoogleGroup.builder().id("id").email("email").name("name").build()

        assertThat(googleGroup.id()).isEqualTo("id")
        assertThat(googleGroup.email()).isEqualTo("email")
        assertThat(googleGroup.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val googleGroup = GoogleGroup.builder().id("id").email("email").name("name").build()

        val roundtrippedGoogleGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(googleGroup),
                jacksonTypeRef<GoogleGroup>(),
            )

        assertThat(roundtrippedGoogleGroup).isEqualTo(googleGroup)
    }
}
