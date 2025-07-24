// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.decrypt

import cloud.qanapi.core.BaseDeserializer
import cloud.qanapi.core.BaseSerializer
import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.allMaxBy
import cloud.qanapi.core.getOrThrow
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects

/**
 * The encrypted payload to decrypt.
 * - Can be a string or an object/array with encrypted fields.
 * - Decryption is selective if `sensitiveFields` is provided.
 */
@JsonDeserialize(using = DecryptDecryptPayloadResponse.Deserializer::class)
@JsonSerialize(using = DecryptDecryptPayloadResponse.Serializer::class)
class DecryptDecryptPayloadResponse
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

    fun validate(): DecryptDecryptPayloadResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitString(string: String) = 1

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DecryptDecryptPayloadResponse && string == other.string && unionMember1 == other.unionMember1 && jsonValues == other.jsonValues /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(string, unionMember1, jsonValues) /* spotless:on */

    override fun toString(): String =
        when {
            string != null -> "DecryptDecryptPayloadResponse{string=$string}"
            unionMember1 != null -> "DecryptDecryptPayloadResponse{unionMember1=$unionMember1}"
            jsonValues != null -> "DecryptDecryptPayloadResponse{jsonValues=$jsonValues}"
            _json != null -> "DecryptDecryptPayloadResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DecryptDecryptPayloadResponse")
        }

    companion object {

        fun ofString(string: String) = DecryptDecryptPayloadResponse(string = string)

        fun ofUnionMember1(unionMember1: UnionMember1) =
            DecryptDecryptPayloadResponse(unionMember1 = unionMember1)

        fun ofJsonValues(jsonValues: List<JsonValue>) =
            DecryptDecryptPayloadResponse(jsonValues = jsonValues.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [DecryptDecryptPayloadResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitUnionMember1(unionMember1: UnionMember1): T

        fun visitJsonValues(jsonValues: List<JsonValue>): T

        /**
         * Maps an unknown variant of [DecryptDecryptPayloadResponse] to a value of type [T].
         *
         * An instance of [DecryptDecryptPayloadResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws QanapiInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw QanapiInvalidDataException("Unknown DecryptDecryptPayloadResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DecryptDecryptPayloadResponse>(DecryptDecryptPayloadResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): DecryptDecryptPayloadResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            DecryptDecryptPayloadResponse(unionMember1 = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            DecryptDecryptPayloadResponse(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                            DecryptDecryptPayloadResponse(jsonValues = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants.
                0 -> DecryptDecryptPayloadResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<DecryptDecryptPayloadResponse>(DecryptDecryptPayloadResponse::class) {

        override fun serialize(
            value: DecryptDecryptPayloadResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value.jsonValues != null -> generator.writeObject(value.jsonValues)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DecryptDecryptPayloadResponse")
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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
