// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRestoreParamsTest {

    @Test
    fun create() {
        UserRestoreParams.builder()
            .user(0L)
            .email("dev@stainless.com")
            .name("name")
            .role("role")
            .twoFactorEnabled(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = UserRestoreParams.builder().user(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UserRestoreParams.builder()
                .user(0L)
                .email("dev@stainless.com")
                .name("name")
                .role("role")
                .twoFactorEnabled(true)
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("dev@stainless.com")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.role()).isEqualTo("role")
        assertThat(body.twoFactorEnabled()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserRestoreParams.builder().user(0L).build()

        val body = params._body()
    }
}
