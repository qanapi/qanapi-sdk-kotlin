// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeCreateResponseTest {

    @Test
    fun create() {
        val scopeCreateResponse =
            ScopeCreateResponse.builder()
                .id(14L)
                .createdAt(OffsetDateTime.parse("2025-06-05T15:45:07.000000Z"))
                .name("Test 123")
                .route("api/v1/api-keys/{apiKey}/test")
                .updatedAt(OffsetDateTime.parse("2025-06-05T15:45:07.000000Z"))
                .build()

        assertThat(scopeCreateResponse.id()).isEqualTo(14L)
        assertThat(scopeCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-06-05T15:45:07.000000Z"))
        assertThat(scopeCreateResponse.name()).isEqualTo("Test 123")
        assertThat(scopeCreateResponse.route()).isEqualTo("api/v1/api-keys/{apiKey}/test")
        assertThat(scopeCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-06-05T15:45:07.000000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeCreateResponse =
            ScopeCreateResponse.builder()
                .id(14L)
                .createdAt(OffsetDateTime.parse("2025-06-05T15:45:07.000000Z"))
                .name("Test 123")
                .route("api/v1/api-keys/{apiKey}/test")
                .updatedAt(OffsetDateTime.parse("2025-06-05T15:45:07.000000Z"))
                .build()

        val roundtrippedScopeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeCreateResponse),
                jacksonTypeRef<ScopeCreateResponse>(),
            )

        assertThat(roundtrippedScopeCreateResponse).isEqualTo(scopeCreateResponse)
    }
}
