// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogQanapiFlowResponseTest {

    @Test
    fun create() {
        val logQanapiFlowResponse =
            LogQanapiFlowResponse.builder()
                .currentPage(0L)
                .addData(
                    LogQanapiFlowResponse.Data.builder()
                        .action("action")
                        .configurationId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("dev@stainless.com")
                        .requestId("request_id")
                        .type("type")
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogQanapiFlowResponse.Link.builder()
                        .active(true)
                        .label("label")
                        .page(0L)
                        .url("url")
                        .build()
                )
                .nextPageUrl("https://example.com")
                .path("path")
                .perPage(0L)
                .prevPageUrl("https://example.com")
                .to(0L)
                .total(0L)
                .build()

        assertThat(logQanapiFlowResponse.currentPage()).isEqualTo(0L)
        assertThat(logQanapiFlowResponse.data())
            .containsExactly(
                LogQanapiFlowResponse.Data.builder()
                    .action("action")
                    .configurationId(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("dev@stainless.com")
                    .requestId("request_id")
                    .type("type")
                    .build()
            )
        assertThat(logQanapiFlowResponse.firstPageUrl()).isEqualTo("https://example.com")
        assertThat(logQanapiFlowResponse.from()).isEqualTo(0L)
        assertThat(logQanapiFlowResponse.lastPage()).isEqualTo(0L)
        assertThat(logQanapiFlowResponse.lastPageUrl()).isEqualTo("https://example.com")
        assertThat(logQanapiFlowResponse.links())
            .containsExactly(
                LogQanapiFlowResponse.Link.builder()
                    .active(true)
                    .label("label")
                    .page(0L)
                    .url("url")
                    .build()
            )
        assertThat(logQanapiFlowResponse.nextPageUrl()).isEqualTo("https://example.com")
        assertThat(logQanapiFlowResponse.path()).isEqualTo("path")
        assertThat(logQanapiFlowResponse.perPage()).isEqualTo(0L)
        assertThat(logQanapiFlowResponse.prevPageUrl()).isEqualTo("https://example.com")
        assertThat(logQanapiFlowResponse.to()).isEqualTo(0L)
        assertThat(logQanapiFlowResponse.total()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logQanapiFlowResponse =
            LogQanapiFlowResponse.builder()
                .currentPage(0L)
                .addData(
                    LogQanapiFlowResponse.Data.builder()
                        .action("action")
                        .configurationId(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("dev@stainless.com")
                        .requestId("request_id")
                        .type("type")
                        .build()
                )
                .firstPageUrl("https://example.com")
                .from(0L)
                .lastPage(0L)
                .lastPageUrl("https://example.com")
                .addLink(
                    LogQanapiFlowResponse.Link.builder()
                        .active(true)
                        .label("label")
                        .page(0L)
                        .url("url")
                        .build()
                )
                .nextPageUrl("https://example.com")
                .path("path")
                .perPage(0L)
                .prevPageUrl("https://example.com")
                .to(0L)
                .total(0L)
                .build()

        val roundtrippedLogQanapiFlowResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logQanapiFlowResponse),
                jacksonTypeRef<LogQanapiFlowResponse>(),
            )

        assertThat(roundtrippedLogQanapiFlowResponse).isEqualTo(logQanapiFlowResponse)
    }
}
