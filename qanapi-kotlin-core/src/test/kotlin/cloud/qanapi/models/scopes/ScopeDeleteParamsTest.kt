// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.scopes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeDeleteParamsTest {

    @Test
    fun create() {
        ScopeDeleteParams.builder().id(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ScopeDeleteParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
