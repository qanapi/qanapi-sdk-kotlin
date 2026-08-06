// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.configurations

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
import java.util.Collections
import java.util.Objects

class ConfigurationListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val type: JsonField<String>,
    private val values: JsonField<List<Value>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<List<Value>> = JsonMissing.of(),
    ) : this(id, name, type, values, mutableMapOf())

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun values(): List<Value>? = values.getNullable("values")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<Value>> = values

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
         * Returns a mutable builder for constructing an instance of [ConfigurationListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .name()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ConfigurationListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var values: JsonField<MutableList<Value>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(configurationListResponse: ConfigurationListResponse) = apply {
            id = configurationListResponse.id
            name = configurationListResponse.name
            type = configurationListResponse.type
            values = configurationListResponse.values.map { it.toMutableList() }
            additionalProperties = configurationListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun values(values: List<Value>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<Value>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<List<Value>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [Value] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: Value) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
                }
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
         * Returns an immutable instance of [ConfigurationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ConfigurationListResponse =
            ConfigurationListResponse(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("type", type),
                (values ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): ConfigurationListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        type()
        values()?.forEach { it.validate() }
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
            (if (name.asKnown() == null) 0 else 1) +
            (if (type.asKnown() == null) 0 else 1) +
            (values.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Value
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(key, value, mutableMapOf())

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [Value].
             *
             * The following fields are required:
             * ```kotlin
             * .key()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Value]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(value: Value) = apply {
                key = value.key
                this.value = value.value
                additionalProperties = value.additionalProperties.toMutableMap()
            }

            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Value].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .key()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Value =
                Value(
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            key()
            value()
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
            (if (key.asKnown() == null) 0 else 1) + (if (value.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value &&
                key == other.key &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Value{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ConfigurationListResponse &&
            id == other.id &&
            name == other.name &&
            type == other.type &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, name, type, values, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ConfigurationListResponse{id=$id, name=$name, type=$type, values=$values, additionalProperties=$additionalProperties}"
}
