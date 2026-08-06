// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services

import cloud.qanapi.client.QanapiClient
import cloud.qanapi.client.okhttp.QanapiOkHttpClient
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.http.Headers
import cloud.qanapi.core.jsonMapper
import cloud.qanapi.errors.BadRequestException
import cloud.qanapi.errors.InternalServerException
import cloud.qanapi.errors.NotFoundException
import cloud.qanapi.errors.PermissionDeniedException
import cloud.qanapi.errors.QanapiException
import cloud.qanapi.errors.RateLimitException
import cloud.qanapi.errors.UnauthorizedException
import cloud.qanapi.errors.UnexpectedStatusCodeException
import cloud.qanapi.errors.UnprocessableEntityException
import cloud.qanapi.models.v3.encryption.EncryptionEncryptParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: QanapiClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            QanapiOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .subdomain("My-Subdomain")
                .build()
    }

    @Test
    fun encryptionEncrypt400() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt400WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt401() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt401WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt403() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt403WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt404() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt404WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt422() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt422WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt429() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt429WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt500() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt500WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt999() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncrypt999WithRawResponse() {
        val encryptionService = client.v3().encryption().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun encryptionEncryptInvalidJsonBody() {
        val encryptionService = client.v3().encryption()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<QanapiException> {
                encryptionService.encrypt(
                    EncryptionEncryptParams.builder()
                        .proxy("proxy")
                        .xQanapiFields("x-qanapi-fields")
                        .xQanapiDestination("x-qanapi-destination")
                        .data(
                            EncryptionEncryptParams.Data.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
