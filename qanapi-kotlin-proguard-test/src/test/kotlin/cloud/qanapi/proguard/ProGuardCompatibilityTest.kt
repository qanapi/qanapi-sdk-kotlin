// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.proguard

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.jsonMapper
import cloud.qanapi.models.v2.encrypt.EncryptEncryptDataResponse
import cloud.qanapi.models.v3.ApiKey
import cloud.qanapi.models.v3.Configuration
import cloud.qanapi.models.v3.Permission
import cloud.qanapi.models.v3.Role
import cloud.qanapi.models.v3.User
import cloud.qanapi.models.v3.Value
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/qanapi-kotlin-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            QanapiOkHttpClient.builder().apiKey("My API Key").subdomain("My-Subdomain").build()

        assertThat(client).isNotNull()
        assertThat(client.v3()).isNotNull()
        assertThat(client.v2()).isNotNull()
    }

    @Test
    fun apiKeyRoundtrip() {
        val jsonMapper = jsonMapper()
        val apiKey =
            ApiKey.builder()
                .id("1")
                .prefix("qapi_")
                .status(ApiKey.Status.ACTIVE)
                .addConfiguration(
                    Configuration.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .type("type")
                        .addValue(Value.builder().key("key").value("value").build())
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addPermission(Permission.builder().name("name").build())
                .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(
                    User.builder()
                        .id(0L)
                        .email("dev@stainless.com")
                        .name("name")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addRole(
                            Role.builder()
                                .name("name")
                                .description("description")
                                .addPermission(Permission.builder().name("name").build())
                                .build()
                        )
                        .twoFactorEnabled(true)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedApiKey =
            jsonMapper.readValue(jsonMapper.writeValueAsString(apiKey), jacksonTypeRef<ApiKey>())

        assertThat(roundtrippedApiKey).isEqualTo(apiKey)
    }

    @Test
    fun encryptEncryptDataResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val encryptEncryptDataResponse = EncryptEncryptDataResponse.ofString("string")

        val roundtrippedEncryptEncryptDataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(encryptEncryptDataResponse),
                jacksonTypeRef<EncryptEncryptDataResponse>(),
            )

        assertThat(roundtrippedEncryptEncryptDataResponse).isEqualTo(encryptEncryptDataResponse)
    }
}
