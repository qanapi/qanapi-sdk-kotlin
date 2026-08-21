// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.models.v3.GoogleGroup
import cloud.qanapi.models.v3.classifications.ClassificationCreateParams
import cloud.qanapi.models.v3.classifications.ClassificationListParams
import cloud.qanapi.models.v3.classifications.ClassificationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClassificationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationService = client.v3().classifications()

        val classification =
            classificationService.create(
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
            )

        classification.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationService = client.v3().classifications()

        val classification =
            classificationService.update(
                ClassificationUpdateParams.builder()
                    .classification(0L)
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
            )

        classification.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationService = client.v3().classifications()

        val classifications =
            classificationService.list(
                ClassificationListParams.builder()
                    .direction(ClassificationListParams.Direction.ASC)
                    .perPage(0L)
                    .addProvider(0L)
                    .addRole(0L)
                    .search("search")
                    .sort("sort")
                    .user(0L)
                    .build()
            )

        classifications.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationService = client.v3().classifications()

        classificationService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun show() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationService = client.v3().classifications()

        val response = classificationService.show(0L)

        response.validate()
    }
}
