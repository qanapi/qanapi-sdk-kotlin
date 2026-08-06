// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3

import cloud.qanapi.core.Enum
import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.checkKnown
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ApiKey
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val prefix: JsonField<String>,
    private val status: JsonField<Status>,
    private val configurations: JsonField<List<Configuration>>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val permissions: JsonField<List<Permission>>,
    private val revokedAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val user: JsonField<User>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("configurations")
        @ExcludeMissing
        configurations: JsonField<List<Configuration>> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("permissions")
        @ExcludeMissing
        permissions: JsonField<List<Permission>> = JsonMissing.of(),
        @JsonProperty("revoked_at")
        @ExcludeMissing
        revokedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
    ) : this(
        id,
        prefix,
        status,
        configurations,
        createdAt,
        permissions,
        revokedAt,
        updatedAt,
        user,
        mutableMapOf(),
    )

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prefix(): String = prefix.getRequired("prefix")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurations(): List<Configuration>? = configurations.getNullable("configurations")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissions(): List<Permission>? = permissions.getNullable("permissions")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revokedAt(): OffsetDateTime? = revokedAt.getNullable("revoked_at")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): User? = user.getNullable("user")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [configurations].
     *
     * Unlike [configurations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configurations")
    @ExcludeMissing
    fun _configurations(): JsonField<List<Configuration>> = configurations

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permissions")
    @ExcludeMissing
    fun _permissions(): JsonField<List<Permission>> = permissions

    /**
     * Returns the raw JSON value of [revokedAt].
     *
     * Unlike [revokedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revoked_at")
    @ExcludeMissing
    fun _revokedAt(): JsonField<OffsetDateTime> = revokedAt

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

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
         * Returns a mutable builder for constructing an instance of [ApiKey].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .prefix()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ApiKey]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var prefix: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var configurations: JsonField<MutableList<Configuration>>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var permissions: JsonField<MutableList<Permission>>? = null
        private var revokedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var user: JsonField<User> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(apiKey: ApiKey) = apply {
            id = apiKey.id
            prefix = apiKey.prefix
            status = apiKey.status
            configurations = apiKey.configurations.map { it.toMutableList() }
            createdAt = apiKey.createdAt
            permissions = apiKey.permissions.map { it.toMutableList() }
            revokedAt = apiKey.revokedAt
            updatedAt = apiKey.updatedAt
            user = apiKey.user
            additionalProperties = apiKey.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun configurations(configurations: List<Configuration>) =
            configurations(JsonField.of(configurations))

        /**
         * Sets [Builder.configurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurations] with a well-typed `List<Configuration>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun configurations(configurations: JsonField<List<Configuration>>) = apply {
            this.configurations = configurations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Configuration] to [configurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConfiguration(configuration: Configuration) = apply {
            configurations =
                (configurations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("configurations", it).add(configuration)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun permissions(permissions: List<Permission>) = permissions(JsonField.of(permissions))

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed `List<Permission>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissions(permissions: JsonField<List<Permission>>) = apply {
            this.permissions = permissions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Permission] to [permissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermission(permission: Permission) = apply {
            permissions =
                (permissions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("permissions", it).add(permission)
                }
        }

        fun revokedAt(revokedAt: OffsetDateTime?) = revokedAt(JsonField.ofNullable(revokedAt))

        /**
         * Sets [Builder.revokedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revokedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun revokedAt(revokedAt: JsonField<OffsetDateTime>) = apply { this.revokedAt = revokedAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun user(user: User) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [User] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<User>) = apply { this.user = user }

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
         * Returns an immutable instance of [ApiKey].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .prefix()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiKey =
            ApiKey(
                checkRequired("id", id),
                checkRequired("prefix", prefix),
                checkRequired("status", status),
                (configurations ?: JsonMissing.of()).map { it.toImmutable() },
                createdAt,
                (permissions ?: JsonMissing.of()).map { it.toImmutable() },
                revokedAt,
                updatedAt,
                user,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws QanapiInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ApiKey = apply {
        if (validated) {
            return@apply
        }

        id()
        prefix()
        status().validate()
        configurations()?.forEach { it.validate() }
        createdAt()
        permissions()?.forEach { it.validate() }
        revokedAt()
        updatedAt()
        user()?.validate()
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
            (if (prefix.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (configurations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (permissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (revokedAt.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (user.asKnown()?.validity() ?: 0)

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("active")

            val REVOKED = of("revoked")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            REVOKED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            REVOKED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                REVOKED -> Value.REVOKED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws QanapiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                REVOKED -> Known.REVOKED
                else -> throw QanapiInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws QanapiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw QanapiInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws QanapiInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKey &&
            id == other.id &&
            prefix == other.prefix &&
            status == other.status &&
            configurations == other.configurations &&
            createdAt == other.createdAt &&
            permissions == other.permissions &&
            revokedAt == other.revokedAt &&
            updatedAt == other.updatedAt &&
            user == other.user &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            prefix,
            status,
            configurations,
            createdAt,
            permissions,
            revokedAt,
            updatedAt,
            user,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiKey{id=$id, prefix=$prefix, status=$status, configurations=$configurations, createdAt=$createdAt, permissions=$permissions, revokedAt=$revokedAt, updatedAt=$updatedAt, user=$user, additionalProperties=$additionalProperties}"
}
