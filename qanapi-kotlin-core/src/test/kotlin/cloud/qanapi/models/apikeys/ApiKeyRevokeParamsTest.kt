// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRevokeParamsTest {

    @Test
    fun create() {
        ApiKeyRevokeParams.builder().apiKey("apiKey").build()
    }

    @Test
    fun pathParams() {
        val params = ApiKeyRevokeParams.builder().apiKey("apiKey").build()

        assertThat(params._pathParam(0)).isEqualTo("apiKey")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
