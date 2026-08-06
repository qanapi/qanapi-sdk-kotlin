// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.configurations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConfigurationCreateParamsTest {

    @Test
    fun create() {
        ConfigurationCreateParams.builder()
            .name("name")
            .type(ConfigurationCreateParams.Type.PROVIDER)
            .provider(ConfigurationCreateParams.Provider.GOOGLE)
            .build()
    }

    @Test
    fun body() {
        val params =
            ConfigurationCreateParams.builder()
                .name("name")
                .type(ConfigurationCreateParams.Type.PROVIDER)
                .provider(ConfigurationCreateParams.Provider.GOOGLE)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(ConfigurationCreateParams.Type.PROVIDER)
        assertThat(body.provider()).isEqualTo(ConfigurationCreateParams.Provider.GOOGLE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConfigurationCreateParams.builder()
                .name("name")
                .type(ConfigurationCreateParams.Type.PROVIDER)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(ConfigurationCreateParams.Type.PROVIDER)
    }
}
