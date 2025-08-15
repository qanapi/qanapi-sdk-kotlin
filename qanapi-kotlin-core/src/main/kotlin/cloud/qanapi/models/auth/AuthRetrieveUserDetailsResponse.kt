// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.auth

import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.checkKnown
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AuthRetrieveUserDetailsResponse
private constructor(
    private val id: JsonField<Long>,
    private val email: JsonField<String>,
    private val emailVerifiedAt: JsonField<OffsetDateTime>,
    private val firstLogin: JsonField<Long>,
    private val gravatarUrl: JsonField<String>,
    private val name: JsonField<String>,
    private val roles: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email_verified_at")
        @ExcludeMissing
        emailVerifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("first_login") @ExcludeMissing firstLogin: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("gravatar_url")
        @ExcludeMissing
        gravatarUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roles") @ExcludeMissing roles: JsonField<List<String>> = JsonMissing.of(),
    ) : this(id, email, emailVerifiedAt, firstLogin, gravatarUrl, name, roles, mutableMapOf())

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailVerifiedAt(): OffsetDateTime? = emailVerifiedAt.getNullable("email_verified_at")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstLogin(): Long? = firstLogin.getNullable("first_login")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gravatarUrl(): String? = gravatarUrl.getNullable("gravatar_url")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roles(): List<String>? = roles.getNullable("roles")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [emailVerifiedAt].
     *
     * Unlike [emailVerifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_verified_at")
    @ExcludeMissing
    fun _emailVerifiedAt(): JsonField<OffsetDateTime> = emailVerifiedAt

    /**
     * Returns the raw JSON value of [firstLogin].
     *
     * Unlike [firstLogin], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_login") @ExcludeMissing fun _firstLogin(): JsonField<Long> = firstLogin

    /**
     * Returns the raw JSON value of [gravatarUrl].
     *
     * Unlike [gravatarUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gravatar_url")
    @ExcludeMissing
    fun _gravatarUrl(): JsonField<String> = gravatarUrl

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [roles].
     *
     * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<String>> = roles

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthRetrieveUserDetailsResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthRetrieveUserDetailsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var emailVerifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var firstLogin: JsonField<Long> = JsonMissing.of()
        private var gravatarUrl: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var roles: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authRetrieveUserDetailsResponse: AuthRetrieveUserDetailsResponse) =
            apply {
                id = authRetrieveUserDetailsResponse.id
                email = authRetrieveUserDetailsResponse.email
                emailVerifiedAt = authRetrieveUserDetailsResponse.emailVerifiedAt
                firstLogin = authRetrieveUserDetailsResponse.firstLogin
                gravatarUrl = authRetrieveUserDetailsResponse.gravatarUrl
                name = authRetrieveUserDetailsResponse.name
                roles = authRetrieveUserDetailsResponse.roles.map { it.toMutableList() }
                additionalProperties =
                    authRetrieveUserDetailsResponse.additionalProperties.toMutableMap()
            }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun emailVerifiedAt(emailVerifiedAt: OffsetDateTime?) =
            emailVerifiedAt(JsonField.ofNullable(emailVerifiedAt))

        /**
         * Sets [Builder.emailVerifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailVerifiedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun emailVerifiedAt(emailVerifiedAt: JsonField<OffsetDateTime>) = apply {
            this.emailVerifiedAt = emailVerifiedAt
        }

        fun firstLogin(firstLogin: Long) = firstLogin(JsonField.of(firstLogin))

        /**
         * Sets [Builder.firstLogin] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstLogin] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun firstLogin(firstLogin: JsonField<Long>) = apply { this.firstLogin = firstLogin }

        fun gravatarUrl(gravatarUrl: String) = gravatarUrl(JsonField.of(gravatarUrl))

        /**
         * Sets [Builder.gravatarUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gravatarUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun gravatarUrl(gravatarUrl: JsonField<String>) = apply { this.gravatarUrl = gravatarUrl }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun roles(roles: List<String>) = roles(JsonField.of(roles))

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roles(roles: JsonField<List<String>>) = apply {
            this.roles = roles.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: String) = apply {
            roles =
                (roles ?: JsonField.of(mutableListOf())).also { checkKnown("roles", it).add(role) }
        }

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
         * Returns an immutable instance of [AuthRetrieveUserDetailsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthRetrieveUserDetailsResponse =
            AuthRetrieveUserDetailsResponse(
                id,
                email,
                emailVerifiedAt,
                firstLogin,
                gravatarUrl,
                name,
                (roles ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthRetrieveUserDetailsResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        email()
        emailVerifiedAt()
        firstLogin()
        gravatarUrl()
        name()
        roles()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (emailVerifiedAt.asKnown() == null) 0 else 1) +
            (if (firstLogin.asKnown() == null) 0 else 1) +
            (if (gravatarUrl.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (roles.asKnown()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRetrieveUserDetailsResponse &&
            id == other.id &&
            email == other.email &&
            emailVerifiedAt == other.emailVerifiedAt &&
            firstLogin == other.firstLogin &&
            gravatarUrl == other.gravatarUrl &&
            name == other.name &&
            roles == other.roles &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            email,
            emailVerifiedAt,
            firstLogin,
            gravatarUrl,
            name,
            roles,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRetrieveUserDetailsResponse{id=$id, email=$email, emailVerifiedAt=$emailVerifiedAt, firstLogin=$firstLogin, gravatarUrl=$gravatarUrl, name=$name, roles=$roles, additionalProperties=$additionalProperties}"
}
