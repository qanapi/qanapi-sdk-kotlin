// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ApiKeyRotateParamsTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        ApiKeyRotateParams.builder().apiKey("apiKey").build()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun pathParams() {
        val params = ApiKeyRotateParams.builder().apiKey("apiKey").build()

        assertThat(params._pathParam(0)).isEqualTo("apiKey")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
