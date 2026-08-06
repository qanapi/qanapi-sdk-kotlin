// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogQanapiFlowParamsTest {

    @Test
    fun create() {
        LogQanapiFlowParams.builder().page(0L).perPage(0L).type("type").build()
    }

    @Test
    fun queryParams() {
        val params = LogQanapiFlowParams.builder().page(0L).perPage(0L).type("type").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "0")
                    .put("per_page", "0")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LogQanapiFlowParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
