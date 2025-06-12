// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.apikeys.scopes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopeSyncParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ScopeSyncParams.builder().apiKey(0L).addScopeId(25L).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = ScopeSyncParams.builder().apiKey(0L).addScopeId(25L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = ScopeSyncParams.builder().apiKey(0L).addScopeId(25L).build()

        val body = params._body()

        assertThat(body.scopeIds()).containsExactly(25L)
    }
}
