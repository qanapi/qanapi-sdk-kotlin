// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.models.v3.logs.LogActivityParams
import cloud.qanapi.models.v3.logs.LogApiParams
import cloud.qanapi.models.v3.logs.LogQanapiFlowParams
import cloud.qanapi.models.v3.logs.LogUnifiedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun activity() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logService = client.v3().logs()

        val response =
            logService.activity(
                LogActivityParams.builder()
                    .logName("logName")
                    .page(0L)
                    .perPage(0L)
                    .user(0L)
                    .userId(0L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun api() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logService = client.v3().logs()

        val response =
            logService.api(LogApiParams.builder().apiKey(0L).page(0L).perPage(0L).build())

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun qanapiFlow() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logService = client.v3().logs()

        val response =
            logService.qanapiFlow(
                LogQanapiFlowParams.builder().page(0L).perPage(0L).type("type").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unified() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logService = client.v3().logs()

        val response =
            logService.unified(
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
            )

        response.validate()
    }
}
