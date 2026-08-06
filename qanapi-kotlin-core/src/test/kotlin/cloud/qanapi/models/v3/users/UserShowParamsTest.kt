// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserShowParamsTest {

    @Test
    fun create() {
        UserShowParams.builder().user(0L).build()
    }

    @Test
    fun pathParams() {
        val params = UserShowParams.builder().user(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
