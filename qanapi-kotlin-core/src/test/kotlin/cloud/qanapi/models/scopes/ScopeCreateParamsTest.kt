// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.scopes

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopeCreateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ScopeCreateParams.builder().name("read:secrets").route("decrypt").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params = ScopeCreateParams.builder().name("read:secrets").route("decrypt").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("read:secrets")
        assertThat(body.route()).isEqualTo("decrypt")
    }
}
