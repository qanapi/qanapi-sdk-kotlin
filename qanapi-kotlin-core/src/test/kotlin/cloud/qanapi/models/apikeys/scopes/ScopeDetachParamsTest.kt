// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys.scopes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeDetachParamsTest {

    @Test
    fun create() {
        ScopeDetachParams.builder().apiKey(0L).addScopeId(1L).build()
    }

    @Test
    fun pathParams() {
        val params = ScopeDetachParams.builder().apiKey(0L).addScopeId(1L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = ScopeDetachParams.builder().apiKey(0L).addScopeId(1L).build()

        val body = params._body()

        assertThat(body.scopeIds()).containsExactly(1L)
    }
}
