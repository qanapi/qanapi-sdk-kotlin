// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.auth

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.qanapi.api.core.ExcludeMissing
import com.qanapi.api.core.JsonField
import com.qanapi.api.core.JsonMissing
import com.qanapi.api.core.JsonValue
import com.qanapi.api.errors.QanapiInvalidDataException
import java.util.Collections
import java.util.Objects

class AuthRefreshTokenResponse
private constructor(
    private val accessToken: JsonField<String>,
    private val expiresIn: JsonField<Long>,
    private val tokenType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("access_token")
        @ExcludeMissing
        accessToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_in") @ExcludeMissing expiresIn: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("token_type") @ExcludeMissing tokenType: JsonField<String> = JsonMissing.of(),
    ) : this(accessToken, expiresIn, tokenType, mutableMapOf())

    /**
     * JWT access token
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessToken(): String? = accessToken.getNullable("access_token")

    /**
     * Token expiration time in seconds
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresIn(): Long? = expiresIn.getNullable("expires_in")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenType(): String? = tokenType.getNullable("token_type")

    /**
     * Returns the raw JSON value of [accessToken].
     *
     * Unlike [accessToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_token")
    @ExcludeMissing
    fun _accessToken(): JsonField<String> = accessToken

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /**
     * Returns the raw JSON value of [tokenType].
     *
     * Unlike [tokenType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType(): JsonField<String> = tokenType

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [AuthRefreshTokenResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [AuthRefreshTokenResponse]. */
    class Builder internal constructor() {

        private var accessToken: JsonField<String> = JsonMissing.of()
        private var expiresIn: JsonField<Long> = JsonMissing.of()
        private var tokenType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authRefreshTokenResponse: AuthRefreshTokenResponse) = apply {
            accessToken = authRefreshTokenResponse.accessToken
            expiresIn = authRefreshTokenResponse.expiresIn
            tokenType = authRefreshTokenResponse.tokenType
            additionalProperties = authRefreshTokenResponse.additionalProperties.toMutableMap()
        }

        /** JWT access token */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /**
         * Sets [Builder.accessToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** Token expiration time in seconds */
        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        fun tokenType(tokenType: String) = tokenType(JsonField.of(tokenType))

        /**
         * Sets [Builder.tokenType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenType(tokenType: JsonField<String>) = apply { this.tokenType = tokenType }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [AuthRefreshTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthRefreshTokenResponse =
            AuthRefreshTokenResponse(
                accessToken,
                expiresIn,
                tokenType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthRefreshTokenResponse = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        expiresIn()
        tokenType()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: QanapiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (accessToken.asKnown() == null) 0 else 1) +
            (if (expiresIn.asKnown() == null) 0 else 1) +
            (if (tokenType.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRefreshTokenResponse && accessToken == other.accessToken && expiresIn == other.expiresIn && tokenType == other.tokenType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accessToken, expiresIn, tokenType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRefreshTokenResponse{accessToken=$accessToken, expiresIn=$expiresIn, tokenType=$tokenType, additionalProperties=$additionalProperties}"
}
