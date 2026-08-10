// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v2.apikeys

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRevokeResponseTest {

    @Test
    fun create() {
        val apiKeyRevokeResponse =
            ApiKeyRevokeResponse.builder()
                .id("id")
                .message("message")
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(apiKeyRevokeResponse.id()).isEqualTo("id")
        assertThat(apiKeyRevokeResponse.message()).isEqualTo("message")
        assertThat(apiKeyRevokeResponse.revokedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyRevokeResponse =
            ApiKeyRevokeResponse.builder()
                .id("id")
                .message("message")
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedApiKeyRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyRevokeResponse),
                jacksonTypeRef<ApiKeyRevokeResponse>(),
            )

        assertThat(roundtrippedApiKeyRevokeResponse).isEqualTo(apiKeyRevokeResponse)
    }
}
