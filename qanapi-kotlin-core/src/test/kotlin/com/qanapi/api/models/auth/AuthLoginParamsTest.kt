// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.auth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthLoginParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        AuthLoginParams.builder().email("valid@email.com").password("secret1234").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun body() {
        val params =
            AuthLoginParams.builder().email("valid@email.com").password("secret1234").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("valid@email.com")
        assertThat(body.password()).isEqualTo("secret1234")
    }
}
