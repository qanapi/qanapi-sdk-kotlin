// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.models.encrypt

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
import com.qanapi.api.core.Enum
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

class Encrypt
private constructor(
    private val data: JsonField<Data>,
    private val access: JsonField<Access>,
    private val attributes: JsonField<Attributes>,
    private val sensitiveFields: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("access") @ExcludeMissing access: JsonField<Access> = JsonMissing.of(),
        @JsonProperty("attributes")
        @ExcludeMissing
        attributes: JsonField<Attributes> = JsonMissing.of(),
        @JsonProperty("sensitiveFields")
        @ExcludeMissing
        sensitiveFields: JsonField<List<String>> = JsonMissing.of(),
    ) : this(data, access, attributes, sensitiveFields, mutableMapOf())

    /**
     * The actual data to encrypt.
     * - Can be a scalar (string/number), object, or array.
     * - If the value is an object or array, only the specified `sensitiveFields` are encrypted.
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun access(): Access? = access.getNullable("access")

    /**
     * Optional metadata describing the data's context.
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attributes(): Attributes? = attributes.getNullable("attributes")

    /**
     * Laravel-style dot-notated paths to fields that should be encrypted.
     *
     * Supports:
     * - Dot notation for nested fields: `user.profile.ssn`
     * - Wildcard `*` for arrays or dynamic keys: `users.*.token`
     *
     * Examples:
     * - `password`
     * - `user.credentials.secret`
     * - `accounts.*.secret`
     * - `teams.*.members.*.email`
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
     * Returns the raw JSON value of [access].
     *
     * Unlike [access], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access") @ExcludeMissing fun _access(): JsonField<Access> = access

    /**
     * Returns the raw JSON value of [attributes].
     *
     * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attributes")
    @ExcludeMissing
    fun _attributes(): JsonField<Attributes> = attributes

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
         * Returns a mutable builder for constructing an instance of [Encrypt].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Encrypt]. */
    class Builder internal constructor() {

        private var data: JsonField<Data>? = null
        private var access: JsonField<Access> = JsonMissing.of()
        private var attributes: JsonField<Attributes> = JsonMissing.of()
        private var sensitiveFields: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(encrypt: Encrypt) = apply {
            data = encrypt.data
            access = encrypt.access
            attributes = encrypt.attributes
            sensitiveFields = encrypt.sensitiveFields.map { it.toMutableList() }
            additionalProperties = encrypt.additionalProperties.toMutableMap()
        }

        /**
         * The actual data to encrypt.
         * - Can be a scalar (string/number), object, or array.
         * - If the value is an object or array, only the specified `sensitiveFields` are encrypted.
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

        /** Alias for calling [data] with `Data.ofDouble(double)`. */
        fun data(double: Double) = data(Data.ofDouble(double))

        /** Alias for calling [data] with `Data.ofUnionMember2(unionMember2)`. */
        fun data(unionMember2: Data.UnionMember2) = data(Data.ofUnionMember2(unionMember2))

        /** Alias for calling [data] with `Data.ofJsonValues(jsonValues)`. */
        fun dataOfJsonValues(jsonValues: List<JsonValue>) = data(Data.ofJsonValues(jsonValues))

        fun access(access: Access) = access(JsonField.of(access))

        /**
         * Sets [Builder.access] to an arbitrary JSON value.
         *
         * You should usually call [Builder.access] with a well-typed [Access] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun access(access: JsonField<Access>) = apply { this.access = access }

        /** Optional metadata describing the data's context. */
        fun attributes(attributes: Attributes) = attributes(JsonField.of(attributes))

        /**
         * Sets [Builder.attributes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attributes] with a well-typed [Attributes] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attributes(attributes: JsonField<Attributes>) = apply { this.attributes = attributes }

        /**
         * Laravel-style dot-notated paths to fields that should be encrypted.
         *
         * Supports:
         * - Dot notation for nested fields: `user.profile.ssn`
         * - Wildcard `*` for arrays or dynamic keys: `users.*.token`
         *
         * Examples:
         * - `password`
         * - `user.credentials.secret`
         * - `accounts.*.secret`
         * - `teams.*.members.*.email`
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
         * Returns an immutable instance of [Encrypt].
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
        fun build(): Encrypt =
            Encrypt(
                checkRequired("data", data),
                access,
                attributes,
                (sensitiveFields ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Encrypt = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        access()?.validate()
        attributes()?.validate()
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
        (data.asKnown()?.validity() ?: 0) +
            (access.asKnown()?.validity() ?: 0) +
            (attributes.asKnown()?.validity() ?: 0) +
            (sensitiveFields.asKnown()?.size ?: 0)

    /**
     * The actual data to encrypt.
     * - Can be a scalar (string/number), object, or array.
     * - If the value is an object or array, only the specified `sensitiveFields` are encrypted.
     */
    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val string: String? = null,
        private val double: Double? = null,
        private val unionMember2: UnionMember2? = null,
        private val jsonValues: List<JsonValue>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): String? = string

        fun double(): Double? = double

        fun unionMember2(): UnionMember2? = unionMember2

        fun jsonValues(): List<JsonValue>? = jsonValues

        fun isString(): Boolean = string != null

        fun isDouble(): Boolean = double != null

        fun isUnionMember2(): Boolean = unionMember2 != null

        fun isJsonValues(): Boolean = jsonValues != null

        fun asString(): String = string.getOrThrow("string")

        fun asDouble(): Double = double.getOrThrow("double")

        fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                double != null -> visitor.visitDouble(double)
                unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
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

                    override fun visitDouble(double: Double) {}

                    override fun visitUnionMember2(unionMember2: UnionMember2) {
                        unionMember2.validate()
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

                    override fun visitDouble(double: Double) = 1

                    override fun visitUnionMember2(unionMember2: UnionMember2) =
                        unionMember2.validity()

                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && string == other.string && double == other.double && unionMember2 == other.unionMember2 && jsonValues == other.jsonValues /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, double, unionMember2, jsonValues) /* spotless:on */

        override fun toString(): String =
            when {
                string != null -> "Data{string=$string}"
                double != null -> "Data{double=$double}"
                unionMember2 != null -> "Data{unionMember2=$unionMember2}"
                jsonValues != null -> "Data{jsonValues=$jsonValues}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            fun ofString(string: String) = Data(string = string)

            fun ofDouble(double: Double) = Data(double = double)

            fun ofUnionMember2(unionMember2: UnionMember2) = Data(unionMember2 = unionMember2)

            fun ofJsonValues(jsonValues: List<JsonValue>) = Data(jsonValues = jsonValues)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitDouble(double: Double): T

            fun visitUnionMember2(unionMember2: UnionMember2): T

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
                            tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                                Data(unionMember2 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Data(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Data(double = it, _json = json)
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
                    value.double != null -> generator.writeObject(value.double)
                    value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        class UnionMember2
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

                /** Returns a mutable builder for constructing an instance of [UnionMember2]. */
                fun builder() = Builder()
            }

            /** A builder for [UnionMember2]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unionMember2: UnionMember2) = apply {
                    additionalProperties = unionMember2.additionalProperties.toMutableMap()
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
                 * Returns an immutable instance of [UnionMember2].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember2 = UnionMember2(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember2 = apply {
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

                return /* spotless:off */ other is UnionMember2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember2{additionalProperties=$additionalProperties}"
        }
    }

    class Access
    private constructor(
        private val acl: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("acl") @ExcludeMissing acl: JsonField<List<String>> = JsonMissing.of()
        ) : this(acl, mutableMapOf())

        /**
         * Access control list — list of user roles authorized to decrypt this data.
         *
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun acl(): List<String>? = acl.getNullable("acl")

        /**
         * Returns the raw JSON value of [acl].
         *
         * Unlike [acl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("acl") @ExcludeMissing fun _acl(): JsonField<List<String>> = acl

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

            /** Returns a mutable builder for constructing an instance of [Access]. */
            fun builder() = Builder()
        }

        /** A builder for [Access]. */
        class Builder internal constructor() {

            private var acl: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(access: Access) = apply {
                acl = access.acl.map { it.toMutableList() }
                additionalProperties = access.additionalProperties.toMutableMap()
            }

            /** Access control list — list of user roles authorized to decrypt this data. */
            fun acl(acl: List<String>) = acl(JsonField.of(acl))

            /**
             * Sets [Builder.acl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acl] with a well-typed `List<String>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun acl(acl: JsonField<List<String>>) = apply {
                this.acl = acl.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.acl].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAcl(acl: String) = apply {
                this.acl =
                    (this.acl ?: JsonField.of(mutableListOf())).also {
                        checkKnown("acl", it).add(acl)
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
             * Returns an immutable instance of [Access].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Access =
                Access(
                    (acl ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Access = apply {
            if (validated) {
                return@apply
            }

            acl()
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
        internal fun validity(): Int = (acl.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Access && acl == other.acl && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(acl, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Access{acl=$acl, additionalProperties=$additionalProperties}"
    }

    /** Optional metadata describing the data's context. */
    class Attributes
    private constructor(
        private val classification: JsonField<Classification>,
        private val owner: JsonField<String>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("classification")
            @ExcludeMissing
            classification: JsonField<Classification> = JsonMissing.of(),
            @JsonProperty("owner") @ExcludeMissing owner: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(classification, owner, tags, mutableMapOf())

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun classification(): Classification? = classification.getNullable("classification")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun owner(): String? = owner.getNullable("owner")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun tags(): List<String>? = tags.getNullable("tags")

        /**
         * Returns the raw JSON value of [classification].
         *
         * Unlike [classification], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("classification")
        @ExcludeMissing
        fun _classification(): JsonField<Classification> = classification

        /**
         * Returns the raw JSON value of [owner].
         *
         * Unlike [owner], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("owner") @ExcludeMissing fun _owner(): JsonField<String> = owner

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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

            /** Returns a mutable builder for constructing an instance of [Attributes]. */
            fun builder() = Builder()
        }

        /** A builder for [Attributes]. */
        class Builder internal constructor() {

            private var classification: JsonField<Classification> = JsonMissing.of()
            private var owner: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(attributes: Attributes) = apply {
                classification = attributes.classification
                owner = attributes.owner
                tags = attributes.tags.map { it.toMutableList() }
                additionalProperties = attributes.additionalProperties.toMutableMap()
            }

            fun classification(classification: Classification) =
                classification(JsonField.of(classification))

            /**
             * Sets [Builder.classification] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classification] with a well-typed [Classification]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun classification(classification: JsonField<Classification>) = apply {
                this.classification = classification
            }

            fun owner(owner: String) = owner(JsonField.of(owner))

            /**
             * Sets [Builder.owner] to an arbitrary JSON value.
             *
             * You should usually call [Builder.owner] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun owner(owner: JsonField<String>) = apply { this.owner = owner }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             * Returns an immutable instance of [Attributes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Attributes =
                Attributes(
                    classification,
                    owner,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Attributes = apply {
            if (validated) {
                return@apply
            }

            classification()?.validate()
            owner()
            tags()
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
            (classification.asKnown()?.validity() ?: 0) +
                (if (owner.asKnown() == null) 0 else 1) +
                (tags.asKnown()?.size ?: 0)

        class Classification
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PUBLIC = of("public")

                val INTERNAL = of("internal")

                val CONFIDENTIAL = of("confidential")

                val RESTRICTED = of("restricted")

                fun of(value: String) = Classification(JsonField.of(value))
            }

            /** An enum containing [Classification]'s known values. */
            enum class Known {
                PUBLIC,
                INTERNAL,
                CONFIDENTIAL,
                RESTRICTED,
            }

            /**
             * An enum containing [Classification]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Classification] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PUBLIC,
                INTERNAL,
                CONFIDENTIAL,
                RESTRICTED,
                /**
                 * An enum member indicating that [Classification] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PUBLIC -> Value.PUBLIC
                    INTERNAL -> Value.INTERNAL
                    CONFIDENTIAL -> Value.CONFIDENTIAL
                    RESTRICTED -> Value.RESTRICTED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws QanapiInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PUBLIC -> Known.PUBLIC
                    INTERNAL -> Known.INTERNAL
                    CONFIDENTIAL -> Known.CONFIDENTIAL
                    RESTRICTED -> Known.RESTRICTED
                    else -> throw QanapiInvalidDataException("Unknown Classification: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws QanapiInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw QanapiInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): Classification = apply {
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

                return /* spotless:off */ other is Classification && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Attributes && classification == other.classification && owner == other.owner && tags == other.tags && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(classification, owner, tags, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Attributes{classification=$classification, owner=$owner, tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Encrypt && data == other.data && access == other.access && attributes == other.attributes && sensitiveFields == other.sensitiveFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, access, attributes, sensitiveFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Encrypt{data=$data, access=$access, attributes=$attributes, sensitiveFields=$sensitiveFields, additionalProperties=$additionalProperties}"
}
