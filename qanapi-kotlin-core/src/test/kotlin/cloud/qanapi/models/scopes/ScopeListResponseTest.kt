// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeListResponseTest {

    @Test
    fun create() {
        val scopeListResponse =
            ScopeListResponse.builder()
                .id(1L)
                .createdAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .name("Encrypt")
                .route("api/v2/encrypt")
                .updatedAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .build()

        assertThat(scopeListResponse.id()).isEqualTo(1L)
        assertThat(scopeListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
        assertThat(scopeListResponse.name()).isEqualTo("Encrypt")
        assertThat(scopeListResponse.route()).isEqualTo("api/v2/encrypt")
        assertThat(scopeListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeListResponse =
            ScopeListResponse.builder()
                .id(1L)
                .createdAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .name("Encrypt")
                .route("api/v2/encrypt")
                .updatedAt(OffsetDateTime.parse("2025-05-21T21:01:37.000000Z"))
                .build()

        val roundtrippedScopeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeListResponse),
                jacksonTypeRef<ScopeListResponse>(),
            )

        assertThat(roundtrippedScopeListResponse).isEqualTo(scopeListResponse)
    }
}
