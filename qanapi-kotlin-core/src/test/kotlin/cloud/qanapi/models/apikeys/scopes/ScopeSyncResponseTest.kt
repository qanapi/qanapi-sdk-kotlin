// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys.scopes

import cloud.qanapi.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScopeSyncResponseTest {

    @Test
    fun create() {
        val scopeSyncResponse =
            ScopeSyncResponse.builder().message("API Key scopes synced successfully").build()

        assertThat(scopeSyncResponse.message()).isEqualTo("API Key scopes synced successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scopeSyncResponse =
            ScopeSyncResponse.builder().message("API Key scopes synced successfully").build()

        val roundtrippedScopeSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scopeSyncResponse),
                jacksonTypeRef<ScopeSyncResponse>(),
            )

        assertThat(roundtrippedScopeSyncResponse).isEqualTo(scopeSyncResponse)
    }
}
