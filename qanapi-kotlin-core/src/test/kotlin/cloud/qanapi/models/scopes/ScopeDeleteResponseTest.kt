// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopeDeleteResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val scopeDeleteResponse =
            ScopeDeleteResponse.builder().message("Scope deleted successfully").build()

        assertThat(scopeDeleteResponse.message()).isEqualTo("Scope deleted successfully")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeDeleteResponse =
            ScopeDeleteResponse.builder().message("Scope deleted successfully").build()

        val roundtrippedScopeDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeDeleteResponse),
                jacksonTypeRef<ScopeDeleteResponse>(),
            )

        assertThat(roundtrippedScopeDeleteResponse).isEqualTo(scopeDeleteResponse)
    }
}
