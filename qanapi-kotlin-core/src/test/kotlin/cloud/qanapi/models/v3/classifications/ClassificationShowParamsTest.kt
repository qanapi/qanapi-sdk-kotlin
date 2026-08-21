// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.classifications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassificationShowParamsTest {

    @Test
    fun create() {
        ClassificationShowParams.builder().classification(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ClassificationShowParams.builder().classification(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
