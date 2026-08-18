// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.client.okhttp.QanapiOkHttpClientAsync
import cloud.qanapi.models.v3.GoogleGroup
import cloud.qanapi.models.v3.classifications.ClassificationCreateParams
import cloud.qanapi.models.v3.classifications.ClassificationListParams
import cloud.qanapi.models.v3.classifications.ClassificationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ClassificationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationServiceAsync = client.v3().classifications()

        val classification =
            classificationServiceAsync.create(
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
    suspend fun update() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationServiceAsync = client.v3().classifications()

        val classification =
            classificationServiceAsync.update(
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
    suspend fun list() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationServiceAsync = client.v3().classifications()

        val classifications =
            classificationServiceAsync.list(
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
    suspend fun delete() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationServiceAsync = client.v3().classifications()

        classificationServiceAsync.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun show() {
        val client =
            QanapiOkHttpClientAsync.builder().apiKey("My API Key").subdomain("My-Subdomain").build()
        val classificationServiceAsync = client.v3().classifications()

        val response = classificationServiceAsync.show(0L)

        response.validate()
    }
}
