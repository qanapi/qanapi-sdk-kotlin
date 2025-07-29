// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.proguard

import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.jsonMapper
import cloud.qanapi.models.auth.AuthLoginResponse
import cloud.qanapi.models.encrypt.EncryptEncryptDataResponse
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
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
        assertThat(client.auth()).isNotNull()
        assertThat(client.encrypt()).isNotNull()
        assertThat(client.decrypt()).isNotNull()
        assertThat(client.apiKeys()).isNotNull()
        assertThat(client.scopes()).isNotNull()
    }

    @Disabled("skipped: tests are disabled for the time being")
    @Test
    fun authLoginResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val authLoginResponse =
            AuthLoginResponse.builder()
                .accessToken("access_token")
                .expiresIn(0L)
                .tokenType("token_type")
                .build()

        val roundtrippedAuthLoginResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authLoginResponse),
                jacksonTypeRef<AuthLoginResponse>(),
            )

        assertThat(roundtrippedAuthLoginResponse).isEqualTo(authLoginResponse)
    }

    @Disabled("skipped: tests are disabled for the time being")
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
