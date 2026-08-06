// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogUnifiedParamsTest {

    @Test
    fun create() {
        LogUnifiedParams.builder()
            .action("action")
            .causerEmail("causer_email")
            .description("description")
            .details("details")
            .logType(LogUnifiedParams.LogType.ACTIVITY)
            .page(0L)
            .perPage(0L)
            .requestId("request_id")
            .statusCode(0L)
            .userId(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LogUnifiedParams.builder()
                .action("action")
                .causerEmail("causer_email")
                .description("description")
                .details("details")
                .logType(LogUnifiedParams.LogType.ACTIVITY)
                .page(0L)
                .perPage(0L)
                .requestId("request_id")
                .statusCode(0L)
                .userId(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("action", "action")
                    .put("causer_email", "causer_email")
                    .put("description", "description")
                    .put("details", "details")
                    .put("log_type", "activity")
                    .put("page", "0")
                    .put("per_page", "0")
                    .put("request_id", "request_id")
                    .put("status_code", "0")
                    .put("user_id", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LogUnifiedParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
