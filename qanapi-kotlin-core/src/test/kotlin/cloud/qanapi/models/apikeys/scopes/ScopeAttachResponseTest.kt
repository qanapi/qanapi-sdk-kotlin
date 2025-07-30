// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeAttachResponseTest {

    @Test
    fun create() {
        val scopeAttachResponse =
            ScopeAttachResponse.builder().message("Scopes attached successfully").build()

        assertThat(scopeAttachResponse.message()).isEqualTo("Scopes attached successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeAttachResponse =
            ScopeAttachResponse.builder().message("Scopes attached successfully").build()

        val roundtrippedScopeAttachResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeAttachResponse),
                jacksonTypeRef<ScopeAttachResponse>(),
            )

        assertThat(roundtrippedScopeAttachResponse).isEqualTo(scopeAttachResponse)
    }
}
