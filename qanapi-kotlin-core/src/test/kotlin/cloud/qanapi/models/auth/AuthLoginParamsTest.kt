// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.auth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthLoginParamsTest {

    @Test
    fun create() {
        AuthLoginParams.builder().email("valid@email.com").password("secret1234").build()
    }

    @Test
    fun body() {
        val params =
            AuthLoginParams.builder().email("valid@email.com").password("secret1234").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("valid@email.com")
        assertThat(body.password()).isEqualTo("secret1234")
    }
}
