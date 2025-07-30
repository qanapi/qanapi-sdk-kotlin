// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeDetachResponseTest {

    @Test
    fun create() {
        val scopeDetachResponse =
            ScopeDetachResponse.builder().message("Scopes detached successfully").build()

        assertThat(scopeDetachResponse.message()).isEqualTo("Scopes detached successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeDetachResponse =
            ScopeDetachResponse.builder().message("Scopes detached successfully").build()

        val roundtrippedScopeDetachResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeDetachResponse),
                jacksonTypeRef<ScopeDetachResponse>(),
            )

        assertThat(roundtrippedScopeDetachResponse).isEqualTo(scopeDetachResponse)
    }
}
