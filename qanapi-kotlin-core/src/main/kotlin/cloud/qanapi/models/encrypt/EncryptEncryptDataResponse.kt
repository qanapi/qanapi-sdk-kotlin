// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.encrypt

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
 * The actual data to encrypt.
 * - Can be a scalar (string/number), object, or array.
 * - If the value is an object or array, only the specified `sensitiveFields` are encrypted.
 */
@JsonDeserialize(using = EncryptEncryptDataResponse.Deserializer::class)
@JsonSerialize(using = EncryptEncryptDataResponse.Serializer::class)
class EncryptEncryptDataResponse
private constructor(
    private val string: String? = null,
    private val double: Double? = null,
    private val variant2: EncryptEncryptDataResponseVariant2? = null,
    private val jsonValues: List<JsonValue>? = null,
    private val _json: JsonValue? = null,
) {

    fun string(): String? = string

    fun double(): Double? = double

    fun variant2(): EncryptEncryptDataResponseVariant2? = variant2

    fun jsonValues(): List<JsonValue>? = jsonValues

    fun isString(): Boolean = string != null

    fun isDouble(): Boolean = double != null

    fun isVariant2(): Boolean = variant2 != null

    fun isJsonValues(): Boolean = jsonValues != null

    fun asString(): String = string.getOrThrow("string")

    fun asDouble(): Double = double.getOrThrow("double")

    fun asVariant2(): EncryptEncryptDataResponseVariant2 = variant2.getOrThrow("variant2")

    fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import cloud.qanapi.core.JsonValue
     *
     * val result: String? = encryptEncryptDataResponse.accept(object : EncryptEncryptDataResponse.Visitor<String?> {
     *     override fun visitString(string: String): String? = string.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws QanapiInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and
     *   the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            string != null -> visitor.visitString(string)
            double != null -> visitor.visitDouble(double)
            variant2 != null -> visitor.visitVariant2(variant2)
            jsonValues != null -> visitor.visitJsonValues(jsonValues)
            else -> visitor.unknown(_json)
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
    fun validate(): EncryptEncryptDataResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitString(string: String) {}

                override fun visitDouble(double: Double) {}

                override fun visitVariant2(variant2: EncryptEncryptDataResponseVariant2) {
                    variant2.validate()
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

                override fun visitDouble(double: Double) = 1

                override fun visitVariant2(variant2: EncryptEncryptDataResponseVariant2) =
                    variant2.validity()

                override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EncryptEncryptDataResponse &&
            string == other.string &&
            double == other.double &&
            variant2 == other.variant2 &&
            jsonValues == other.jsonValues
    }

    override fun hashCode(): Int = Objects.hash(string, double, variant2, jsonValues)

    override fun toString(): String =
        when {
            string != null -> "EncryptEncryptDataResponse{string=$string}"
            double != null -> "EncryptEncryptDataResponse{double=$double}"
            variant2 != null -> "EncryptEncryptDataResponse{variant2=$variant2}"
            jsonValues != null -> "EncryptEncryptDataResponse{jsonValues=$jsonValues}"
            _json != null -> "EncryptEncryptDataResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid EncryptEncryptDataResponse")
        }

    companion object {

        fun ofString(string: String) = EncryptEncryptDataResponse(string = string)

        fun ofDouble(double: Double) = EncryptEncryptDataResponse(double = double)

        fun ofVariant2(variant2: EncryptEncryptDataResponseVariant2) =
            EncryptEncryptDataResponse(variant2 = variant2)

        fun ofJsonValues(jsonValues: List<JsonValue>) =
            EncryptEncryptDataResponse(jsonValues = jsonValues.toImmutable())
    }

    /**
     * An interface that defines how to map each variant of [EncryptEncryptDataResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        fun visitString(string: String): T

        fun visitDouble(double: Double): T

        fun visitVariant2(variant2: EncryptEncryptDataResponseVariant2): T

        fun visitJsonValues(jsonValues: List<JsonValue>): T

        /**
         * Maps an unknown variant of [EncryptEncryptDataResponse] to a value of type [T].
         *
         * An instance of [EncryptEncryptDataResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws QanapiInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw QanapiInvalidDataException("Unknown EncryptEncryptDataResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<EncryptEncryptDataResponse>(EncryptEncryptDataResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): EncryptEncryptDataResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<EncryptEncryptDataResponseVariant2>())
                            ?.let { EncryptEncryptDataResponse(variant2 = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<String>())?.let {
                            EncryptEncryptDataResponse(string = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                            EncryptEncryptDataResponse(double = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                            EncryptEncryptDataResponse(jsonValues = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> EncryptEncryptDataResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<EncryptEncryptDataResponse>(EncryptEncryptDataResponse::class) {

        override fun serialize(
            value: EncryptEncryptDataResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.string != null -> generator.writeObject(value.string)
                value.double != null -> generator.writeObject(value.double)
                value.variant2 != null -> generator.writeObject(value.variant2)
                value.jsonValues != null -> generator.writeObject(value.jsonValues)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid EncryptEncryptDataResponse")
            }
        }
    }

    class EncryptEncryptDataResponseVariant2
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

            /**
             * Returns a mutable builder for constructing an instance of
             * [EncryptEncryptDataResponseVariant2].
             */
            fun builder() = Builder()
        }

        /** A builder for [EncryptEncryptDataResponseVariant2]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                encryptEncryptDataResponseVariant2: EncryptEncryptDataResponseVariant2
            ) = apply {
                additionalProperties =
                    encryptEncryptDataResponseVariant2.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [EncryptEncryptDataResponseVariant2].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EncryptEncryptDataResponseVariant2 =
                EncryptEncryptDataResponseVariant2(additionalProperties.toImmutable())
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
        fun validate(): EncryptEncryptDataResponseVariant2 = apply {
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

            return other is EncryptEncryptDataResponseVariant2 &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EncryptEncryptDataResponseVariant2{additionalProperties=$additionalProperties}"
    }
}
