// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogActivityParamsTest {

    @Test
    fun create() {
        LogActivityParams.builder()
            .logName("logName")
            .page(0L)
            .perPage(0L)
            .user(0L)
            .userId(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LogActivityParams.builder()
                .logName("logName")
                .page(0L)
                .perPage(0L)
                .user(0L)
                .userId(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("logName", "logName")
                    .put("page", "0")
                    .put("per_page", "0")
                    .put("user", "0")
                    .put("user_id", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LogActivityParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
