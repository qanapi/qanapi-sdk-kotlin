// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.apikeys.scopes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopeRetrieveParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ScopeRetrieveParams.builder().apiKey(0L).build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = ScopeRetrieveParams.builder().apiKey(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
