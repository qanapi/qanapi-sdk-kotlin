// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.apikeys

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiKeyRotateResponseTest {

    @Test
    fun create() {
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder().key("qapi_1234567890abcdef1234567890abcdef").build()

        assertThat(apiKeyRotateResponse.key()).isEqualTo("qapi_1234567890abcdef1234567890abcdef")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiKeyRotateResponse =
            ApiKeyRotateResponse.builder().key("qapi_1234567890abcdef1234567890abcdef").build()

        val roundtrippedApiKeyRotateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiKeyRotateResponse),
                jacksonTypeRef<ApiKeyRotateResponse>(),
            )

        assertThat(roundtrippedApiKeyRotateResponse).isEqualTo(apiKeyRotateResponse)
    }
}
