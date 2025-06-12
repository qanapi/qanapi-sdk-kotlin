// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.apikeys.scopes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopeAttachResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val scopeAttachResponse =
            ScopeAttachResponse.builder().message("Scopes attached successfully").build()

        assertThat(scopeAttachResponse.message()).isEqualTo("Scopes attached successfully")
    }

    @Disabled("skipped: tests are disabled for the time being")
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
