// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.apikeys.scopes

import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class ScopeRetrieveResponse
private constructor(
    private val id: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val pivot: JsonField<Pivot>,
    private val route: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pivot") @ExcludeMissing pivot: JsonField<Pivot> = JsonMissing.of(),
        @JsonProperty("route") @ExcludeMissing route: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, createdAt, name, pivot, route, updatedAt, mutableMapOf())

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Long? = id.getNullable("id")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): String? = name.getNullable("name")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pivot(): Pivot? = pivot.getNullable("pivot")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun route(): String? = route.getNullable("route")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [pivot].
     *
     * Unlike [pivot], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pivot") @ExcludeMissing fun _pivot(): JsonField<Pivot> = pivot

    /**
     * Returns the raw JSON value of [route].
     *
     * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<String> = route

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

        /** Returns a mutable builder for constructing an instance of [ScopeRetrieveResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [ScopeRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var pivot: JsonField<Pivot> = JsonMissing.of()
        private var route: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(scopeRetrieveResponse: ScopeRetrieveResponse) = apply {
            id = scopeRetrieveResponse.id
            createdAt = scopeRetrieveResponse.createdAt
            name = scopeRetrieveResponse.name
            pivot = scopeRetrieveResponse.pivot
            route = scopeRetrieveResponse.route
            updatedAt = scopeRetrieveResponse.updatedAt
            additionalProperties = scopeRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun pivot(pivot: Pivot) = pivot(JsonField.of(pivot))

        /**
         * Sets [Builder.pivot] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pivot] with a well-typed [Pivot] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pivot(pivot: JsonField<Pivot>) = apply { this.pivot = pivot }

        fun route(route: String) = route(JsonField.of(route))

        /**
         * Sets [Builder.route] to an arbitrary JSON value.
         *
         * You should usually call [Builder.route] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun route(route: JsonField<String>) = apply { this.route = route }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [ScopeRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ScopeRetrieveResponse =
            ScopeRetrieveResponse(
                id,
                createdAt,
                name,
                pivot,
                route,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ScopeRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        name()
        pivot()?.validate()
        route()
        updatedAt()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (pivot.asKnown()?.validity() ?: 0) +
            (if (route.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    class Pivot
    private constructor(
        private val apiKeyId: JsonField<Long>,
        private val scopeId: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_key_id")
            @ExcludeMissing
            apiKeyId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("scope_id") @ExcludeMissing scopeId: JsonField<Long> = JsonMissing.of(),
        ) : this(apiKeyId, scopeId, mutableMapOf())

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKeyId(): Long? = apiKeyId.getNullable("api_key_id")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun scopeId(): Long? = scopeId.getNullable("scope_id")

        /**
         * Returns the raw JSON value of [apiKeyId].
         *
         * Unlike [apiKeyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key_id") @ExcludeMissing fun _apiKeyId(): JsonField<Long> = apiKeyId

        /**
         * Returns the raw JSON value of [scopeId].
         *
         * Unlike [scopeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scope_id") @ExcludeMissing fun _scopeId(): JsonField<Long> = scopeId

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

            /** Returns a mutable builder for constructing an instance of [Pivot]. */
            fun builder() = Builder()
        }

        /** A builder for [Pivot]. */
        class Builder internal constructor() {

            private var apiKeyId: JsonField<Long> = JsonMissing.of()
            private var scopeId: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(pivot: Pivot) = apply {
                apiKeyId = pivot.apiKeyId
                scopeId = pivot.scopeId
                additionalProperties = pivot.additionalProperties.toMutableMap()
            }

            fun apiKeyId(apiKeyId: Long) = apiKeyId(JsonField.of(apiKeyId))

            /**
             * Sets [Builder.apiKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKeyId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKeyId(apiKeyId: JsonField<Long>) = apply { this.apiKeyId = apiKeyId }

            fun scopeId(scopeId: Long) = scopeId(JsonField.of(scopeId))

            /**
             * Sets [Builder.scopeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scopeId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scopeId(scopeId: JsonField<Long>) = apply { this.scopeId = scopeId }

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
             * Returns an immutable instance of [Pivot].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Pivot = Pivot(apiKeyId, scopeId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Pivot = apply {
            if (validated) {
                return@apply
            }

            apiKeyId()
            scopeId()
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
        internal fun validity(): Int =
            (if (apiKeyId.asKnown() == null) 0 else 1) + (if (scopeId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pivot &&
                apiKeyId == other.apiKeyId &&
                scopeId == other.scopeId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(apiKeyId, scopeId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pivot{apiKeyId=$apiKeyId, scopeId=$scopeId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ScopeRetrieveResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            name == other.name &&
            pivot == other.pivot &&
            route == other.route &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, name, pivot, route, updatedAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScopeRetrieveResponse{id=$id, createdAt=$createdAt, name=$name, pivot=$pivot, route=$route, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
