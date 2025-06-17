// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopeUpdateResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val scopeUpdateResponse =
            ScopeUpdateResponse.builder()
                .id(1L)
                .createdAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .name("test3")
                .route("api/v2/")
                .updatedAt(OffsetDateTime.parse("2025-06-05T15:47:13.000000Z"))
                .build()

        assertThat(scopeUpdateResponse.id()).isEqualTo(1L)
        assertThat(scopeUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
        assertThat(scopeUpdateResponse.name()).isEqualTo("test3")
        assertThat(scopeUpdateResponse.route()).isEqualTo("api/v2/")
        assertThat(scopeUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-06-05T15:47:13.000000Z"))
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeUpdateResponse =
            ScopeUpdateResponse.builder()
                .id(1L)
                .createdAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .name("test3")
                .route("api/v2/")
                .updatedAt(OffsetDateTime.parse("2025-06-05T15:47:13.000000Z"))
                .build()

        val roundtrippedScopeUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeUpdateResponse),
                jacksonTypeRef<ScopeUpdateResponse>(),
            )

        assertThat(roundtrippedScopeUpdateResponse).isEqualTo(scopeUpdateResponse)
    }
}
