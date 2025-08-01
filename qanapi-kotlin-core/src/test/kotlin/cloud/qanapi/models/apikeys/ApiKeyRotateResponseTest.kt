// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRotateResponseTest {

    @Test
    fun create() {
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder()
                .apiKey("cd_FAKE1234567890EXAMPLEKEY0987654321FAKEEXAMPLEKEY")
                .message("API key rotated successfully.")
                .build()

        assertThat(apiKeyRotateResponse.apiKey())
            .isEqualTo("cd_FAKE1234567890EXAMPLEKEY0987654321FAKEEXAMPLEKEY")
        assertThat(apiKeyRotateResponse.message()).isEqualTo("API key rotated successfully.")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder()
                .apiKey("cd_FAKE1234567890EXAMPLEKEY0987654321FAKEEXAMPLEKEY")
                .message("API key rotated successfully.")
                .build()

        val roundtrippedApiKeyRotateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyRotateResponse),
                jacksonTypeRef<ApiKeyRotateResponse>(),
            )

        assertThat(roundtrippedApiKeyRotateResponse).isEqualTo(apiKeyRotateResponse)
    }
}
