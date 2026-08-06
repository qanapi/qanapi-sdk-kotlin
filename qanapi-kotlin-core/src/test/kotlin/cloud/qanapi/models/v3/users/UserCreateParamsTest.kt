// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateParamsTest {

    @Test
    fun create() {
        UserCreateParams.builder().email("dev@stainless.com").role("role").build()
    }

    @Test
    fun body() {
        val params = UserCreateParams.builder().email("dev@stainless.com").role("role").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.role()).isEqualTo("role")
    }
}
