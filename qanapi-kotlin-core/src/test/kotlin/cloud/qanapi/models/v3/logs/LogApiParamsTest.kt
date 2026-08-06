// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogApiParamsTest {

    @Test
    fun create() {
        LogApiParams.builder().apiKey(0L).page(0L).perPage(0L).build()
    }

    @Test
    fun queryParams() {
        val params = LogApiParams.builder().apiKey(0L).page(0L).perPage(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("apiKey", "0")
                    .put("page", "0")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LogApiParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
