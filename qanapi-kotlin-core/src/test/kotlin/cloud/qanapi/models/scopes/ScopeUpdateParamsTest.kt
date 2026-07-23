// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.scopes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeUpdateParamsTest {

    @Test
    fun create() {
        ScopeUpdateParams.builder().id(0L).name("read:secrets").route("decrypt").build()
    }

    @Test
    fun pathParams() {
        val params = ScopeUpdateParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ScopeUpdateParams.builder().id(0L).name("read:secrets").route("decrypt").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("read:secrets")
        assertThat(body.route()).isEqualTo("decrypt")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ScopeUpdateParams.builder().id(0L).build()

        val body = params._body()
    }
}
