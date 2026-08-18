// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.classifications

import cloud.qanapi.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassificationListParamsTest {

    @Test
    fun create() {
        ClassificationListParams.builder()
            .direction(ClassificationListParams.Direction.ASC)
            .perPage(0L)
            .addProvider(0L)
            .addRole(0L)
            .search("search")
            .sort("sort")
            .user(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ClassificationListParams.builder()
                .direction(ClassificationListParams.Direction.ASC)
                .perPage(0L)
                .addProvider(0L)
                .addRole(0L)
                .search("search")
                .sort("sort")
                .user(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("direction", "asc")
                    .put("per_page", "0")
                    .put("providers", listOf("0").joinToString(","))
                    .put("roles", listOf("0").joinToString(","))
                    .put("search", "search")
                    .put("sort", "sort")
                    .put("user", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ClassificationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
