// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.classifications

import cloud.qanapi.models.v3.GoogleGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ClassificationCreateParamsTest {

    @Test
    fun create() {
        ClassificationCreateParams.builder()
            .bgColor("#e1cb97")
            .fgColor("#e1cb97")
            .name("name")
            .description("description")
            .emoji("emoji")
            .addGwsGroup(GoogleGroup.builder().id("id").email("email").name("name").build())
            .providerContainerId(0L)
            .addRole(0L)
            .addUser(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ClassificationCreateParams.builder()
                .bgColor("#e1cb97")
                .fgColor("#e1cb97")
                .name("name")
                .description("description")
                .emoji("emoji")
                .addGwsGroup(GoogleGroup.builder().id("id").email("email").name("name").build())
                .providerContainerId(0L)
                .addRole(0L)
                .addUser(0L)
                .build()

        val body = params._body()

        assertThat(body.bgColor()).isEqualTo("#e1cb97")
        assertThat(body.fgColor()).isEqualTo("#e1cb97")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.emoji()).isEqualTo("emoji")
        assertThat(body.gwsGroups())
            .containsExactly(GoogleGroup.builder().id("id").email("email").name("name").build())
        assertThat(body.providerContainerId()).isEqualTo(0L)
        assertThat(body.roles()).containsExactly(0L)
        assertThat(body.users()).containsExactly(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ClassificationCreateParams.builder()
                .bgColor("#e1cb97")
                .fgColor("#e1cb97")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.bgColor()).isEqualTo("#e1cb97")
        assertThat(body.fgColor()).isEqualTo("#e1cb97")
        assertThat(body.name()).isEqualTo("name")
    }
}
