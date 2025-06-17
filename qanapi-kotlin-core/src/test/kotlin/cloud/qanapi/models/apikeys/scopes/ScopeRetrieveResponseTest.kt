// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ScopeRetrieveResponseTest {

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun create() {
        val scopeRetrieveResponse =
            ScopeRetrieveResponse.builder()
                .id(1L)
                .createdAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .name("Encrypt")
                .pivot(ScopeRetrieveResponse.Pivot.builder().apiKeyId(3L).scopeId(1L).build())
                .route("api/v2/encrypt")
                .updatedAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .build()

        assertThat(scopeRetrieveResponse.id()).isEqualTo(1L)
        assertThat(scopeRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
        assertThat(scopeRetrieveResponse.name()).isEqualTo("Encrypt")
        assertThat(scopeRetrieveResponse.pivot())
            .isEqualTo(ScopeRetrieveResponse.Pivot.builder().apiKeyId(3L).scopeId(1L).build())
        assertThat(scopeRetrieveResponse.route()).isEqualTo("api/v2/encrypt")
        assertThat(scopeRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeRetrieveResponse =
            ScopeRetrieveResponse.builder()
                .id(1L)
                .createdAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .name("Encrypt")
                .pivot(ScopeRetrieveResponse.Pivot.builder().apiKeyId(3L).scopeId(1L).build())
                .route("api/v2/encrypt")
                .updatedAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .build()

        val roundtrippedScopeRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeRetrieveResponse),
                jacksonTypeRef<ScopeRetrieveResponse>(),
            )

        assertThat(roundtrippedScopeRetrieveResponse).isEqualTo(scopeRetrieveResponse)
    }
}
