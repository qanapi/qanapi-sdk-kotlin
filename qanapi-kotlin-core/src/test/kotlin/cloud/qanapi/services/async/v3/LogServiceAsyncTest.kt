// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.models.v3.logs.LogActivityParams
import cloud.qanapi.models.v3.logs.LogApiParams
import cloud.qanapi.models.v3.logs.LogQanapiFlowParams
import cloud.qanapi.models.v3.logs.LogUnifiedParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LogServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun activity() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logServiceAsync = client.v3().logs()

        val response =
            logServiceAsync.activity(
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
    suspend fun api() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logServiceAsync = client.v3().logs()

        val response =
            logServiceAsync.api(LogApiParams.builder().apiKey(0L).page(0L).perPage(0L).build())

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun qanapiFlow() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logServiceAsync = client.v3().logs()

        val response =
            logServiceAsync.qanapiFlow(
                LogQanapiFlowParams.builder().page(0L).perPage(0L).type("type").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun unified() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val logServiceAsync = client.v3().logs()

        val response =
            logServiceAsync.unified(
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
