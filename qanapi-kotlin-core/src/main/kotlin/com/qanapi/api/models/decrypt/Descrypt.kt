// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.decrypt

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.BaseDeserializer
import com.qanapi.api.core.BaseSerializer
import com.qanapi.api.core.ExcludeMissing
import com.qanapi.api.core.JsonField
import com.qanapi.api.core.JsonMissing
import com.qanapi.api.core.JsonValue
import com.qanapi.api.core.allMaxBy
import com.qanapi.api.core.checkKnown
import com.qanapi.api.core.checkRequired
import com.qanapi.api.core.getOrThrow
import com.qanapi.api.core.toImmutable
import com.qanapi.api.errors.QanapiInvalidDataException
import java.util.Collections
import java.util.Objects

class Descrypt
private constructor(
    private val data: JsonField<Data>,
    private val sensitiveFields: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("sensitiveFields")
        @ExcludeMissing
        sensitiveFields: JsonField<List<String>> = JsonMissing.of(),
    ) : this(data, sensitiveFields, mutableMapOf())

    /**
     * The encrypted payload to decrypt.
     * - Can be a string or an object/array with encrypted fields.
     * - Decryption is selective if `sensitiveFields` is provided.
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * Laravel-style dot-notated paths to fields to decrypt.
     * - Same syntax and behavior as in EncryptRequest.
     * - If omitted, all string values matching encryption prefix are attempted.
     *
     * Examples:
     * - `user.ssn`
     * - `employees.*.payroll.token`
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sensitiveFields(): List<String>? = sensitiveFields.getNullable("sensitiveFields")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [sensitiveFields].
     *
     * Unlike [sensitiveFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sensitiveFields")
    @ExcludeMissing
    fun _sensitiveFields(): JsonField<List<String>> = sensitiveFields

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
         * Returns a mutable builder for constructing an instance of [Descrypt].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Descrypt]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var sensitiveFields: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(descrypt: Descrypt) = apply {
            data = descrypt.data
            sensitiveFields = descrypt.sensitiveFields.map { it.toMutableList() }
            additionalProperties = descrypt.additionalProperties.toMutableMap()
        }

        /**
         * The encrypted payload to decrypt.
         * - Can be a string or an object/array with encrypted fields.
         * - Decryption is selective if `sensitiveFields` is provided.
         */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** Alias for calling [data] with `Data.ofString(string)`. */
        fun data(string: String) = data(Data.ofString(string))

        /** Alias for calling [data] with `Data.ofUnionMember1(unionMember1)`. */
        fun data(unionMember1: Data.UnionMember1) = data(Data.ofUnionMember1(unionMember1))

        /** Alias for calling [data] with `Data.ofJsonValues(jsonValues)`. */
        fun dataOfJsonValues(jsonValues: List<JsonValue>) = data(Data.ofJsonValues(jsonValues))

        /**
         * Laravel-style dot-notated paths to fields to decrypt.
         * - Same syntax and behavior as in EncryptRequest.
         * - If omitted, all string values matching encryption prefix are attempted.
         *
         * Examples:
         * - `user.ssn`
         * - `employees.*.payroll.token`
         */
        fun sensitiveFields(sensitiveFields: List<String>) =
            sensitiveFields(JsonField.of(sensitiveFields))

        /**
         * Sets [Builder.sensitiveFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sensitiveFields] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sensitiveFields(sensitiveFields: JsonField<List<String>>) = apply {
            this.sensitiveFields = sensitiveFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [sensitiveFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSensitiveField(sensitiveField: String) = apply {
            sensitiveFields =
                (sensitiveFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sensitiveFields", it).add(sensitiveField)
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
         * Returns an immutable instance of [Descrypt].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Descrypt =
            Descrypt(
                checkRequired("data", data),
                (sensitiveFields ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Descrypt = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        sensitiveFields()
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
        (data.asKnown()?.validity() ?: 0) + (sensitiveFields.asKnown()?.size ?: 0)

    /**
     * The encrypted payload to decrypt.
     * - Can be a string or an object/array with encrypted fields.
     * - Decryption is selective if `sensitiveFields` is provided.
     */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val string: String? = null,
        private val unionMember1: UnionMember1? = null,
        private val jsonValues: List<JsonValue>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun unionMember1(): UnionMember1? = unionMember1

        fun jsonValues(): List<JsonValue>? = jsonValues

        fun isString(): Boolean = string != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun isJsonValues(): Boolean = jsonValues != null

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }

                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitUnionMember1(unionMember1: UnionMember1) =
                        unionMember1.validity()

                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && string == other.string && unionMember1 == other.unionMember1 && jsonValues == other.jsonValues /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, unionMember1, jsonValues) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Data{string=$string}"
                unionMember1 != null -> "Data{unionMember1=$unionMember1}"
                jsonValues != null -> "Data{jsonValues=$jsonValues}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            fun ofString(string: String) = Data(string = string)

            fun ofUnionMember1(unionMember1: UnionMember1) = Data(unionMember1 = unionMember1)

            fun ofJsonValues(jsonValues: List<JsonValue>) = Data(jsonValues = jsonValues)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws QanapiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw QanapiInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                                Data(unionMember1 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Data(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                Data(jsonValues = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Data(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        class UnionMember1
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember1: UnionMember1) = apply {
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember1].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Descrypt && data == other.data && sensitiveFields == other.sensitiveFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, sensitiveFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Descrypt{data=$data, sensitiveFields=$sensitiveFields, additionalProperties=$additionalProperties}"
}
