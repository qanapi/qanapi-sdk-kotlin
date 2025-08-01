package cloud.qanapi.core

import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.BeanProperty
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.node.JsonNodeType.ARRAY
import com.fasterxml.jackson.databind.node.JsonNodeType.BINARY
import com.fasterxml.jackson.databind.node.JsonNodeType.BOOLEAN
import com.fasterxml.jackson.databind.node.JsonNodeType.MISSING
import com.fasterxml.jackson.databind.node.JsonNodeType.NULL
import com.fasterxml.jackson.databind.node.JsonNodeType.NUMBER
import com.fasterxml.jackson.databind.node.JsonNodeType.OBJECT
import com.fasterxml.jackson.databind.node.JsonNodeType.POJO
import com.fasterxml.jackson.databind.node.JsonNodeType.STRING
import com.fasterxml.jackson.databind.ser.std.NullSerializer
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.io.InputStream
import java.util.*
import kotlin.reflect.KClass

/**
 * A class representing a serializable JSON field.
 *
 * It can either be a [KnownValue] value of type [T], matching the type the SDK expects, or an
 * arbitrary JSON value that bypasses the type system (via [JsonValue]).
 */
@JsonDeserialize(using = JsonField.Deserializer::class)
sealed class JsonField<out T : Any> {

    /**
     * Returns whether this field is missing, which means it will be omitted from the serialized
     * JSON entirely.
     */
    fun isMissing(): Boolean = this is JsonMissing

    /** Whether this field is explicitly set to `null`. */
    fun isNull(): Boolean = this is JsonNull

    /**
     * Returns this field's "known" value, meaning it matches the type the SDK expects, or null if
     * this field contains an arbitrary [JsonValue].
     *
     * This is the opposite of [asUnknown].
     */
    fun asKnown(): T? = (this as? KnownValue)?.value

    /**
     * Returns this field's arbitrary [JsonValue], meaning it mismatches the type the SDK expects,
     * or null if this field contains a "known" value.
     *
     * This is the opposite of [asKnown].
     */
    fun asUnknown(): JsonValue? = this as? JsonValue

    /**
     * Returns this field's boolean value, or null if it doesn't contain a boolean.
     *
     * This method checks for both a [KnownValue] containing a boolean and for [JsonBoolean].
     */
    fun asBoolean(): Boolean? =
        when (this) {
            is JsonBoolean -> value
            is KnownValue -> value as? Boolean
            else -> null
        }

    /**
     * Returns this field's numerical value, or null if it doesn't contain a number.
     *
     * This method checks for both a [KnownValue] containing a number and for [JsonNumber].
     */
    fun asNumber(): Number? =
        when (this) {
            is JsonNumber -> value
            is KnownValue -> value as? Number
            else -> null
        }

    /**
     * Returns this field's string value, or null if it doesn't contain a string.
     *
     * This method checks for both a [KnownValue] containing a string and for [JsonString].
     */
    fun asString(): String? =
        when (this) {
            is JsonString -> value
            is KnownValue -> value as? String
            else -> null
        }

    fun asStringOrThrow(): String =
        asString() ?: throw QanapiInvalidDataException("Value is not a string")

    /**
     * Returns this field's list value, or null if it doesn't contain a list.
     *
     * This method checks for both a [KnownValue] containing a list and for [JsonArray].
     */
    fun asArray(): List<JsonValue>? =
        when (this) {
            is JsonArray -> values
            is KnownValue ->
                (value as? List<*>)?.map {
                    try {
                        JsonValue.from(it)
                    } catch (e: IllegalArgumentException) {
                        // The known value is a list, but not all items are convertible to
                        // `JsonValue`.
                        return null
                    }
                }
            else -> null
        }

    /**
     * Returns this field's map value, or null if it doesn't contain a map.
     *
     * This method checks for both a [KnownValue] containing a map and for [JsonObject].
     */
    fun asObject(): Map<String, JsonValue>? =
        when (this) {
            is JsonObject -> values
            is KnownValue ->
                (value as? Map<*, *>)
                    ?.map { (key, value) ->
                        if (key !is String) {
                            return null
                        }

                        val jsonValue =
                            try {
                                JsonValue.from(value)
                            } catch (e: IllegalArgumentException) {
                                // The known value is a map, but not all values are convertible to
                                // `JsonValue`.
                                return null
                            }

                        key to jsonValue
                    }
                    ?.toMap()
            else -> null
        }

    internal fun getRequired(name: String): T =
        when (this) {
            is KnownValue -> value
            is JsonMissing -> throw QanapiInvalidDataException("`$name` is not set")
            is JsonNull -> throw QanapiInvalidDataException("`$name` is null")
            else -> throw QanapiInvalidDataException("`$name` is invalid, received $this")
        }

    internal fun getNullable(name: String): T? =
        when (this) {
            is KnownValue -> value
            is JsonMissing -> null
            is JsonNull -> null
            else -> throw QanapiInvalidDataException("`$name` is invalid, received $this")
        }

    internal fun <R : Any> map(transform: (T) -> R): JsonField<R> =
        when (this) {
            is KnownValue -> KnownValue.of(transform(value))
            is JsonValue -> this
        }

    internal fun accept(consume: (T) -> Unit) {
        asKnown()?.let(consume)
    }

    /** Returns the result of calling the [visitor] method corresponding to this field's state. */
    fun <R> accept(visitor: Visitor<T, R>): R =
        when (this) {
            is KnownValue -> visitor.visitKnown(value)
            is JsonValue -> accept(visitor as JsonValue.Visitor<R>)
        }

    /**
     * An interface that defines how to map each possible state of a `JsonField<T>` to a value of
     * type [R].
     */
    interface Visitor<in T, out R> : JsonValue.Visitor<R> {

        fun visitKnown(value: T): R = visitDefault()
    }

    companion object {

        /** Returns a [JsonField] containing the given "known" [value]. */
        fun <T : Any> of(value: T): JsonField<T> = KnownValue.of(value)

        /**
         * Returns a [JsonField] containing the given "known" [value], or [JsonNull] if [value] is
         * null.
         */
        fun <T : Any> ofNullable(value: T?): JsonField<T> =
            when (value) {
                null -> JsonNull.of()
                else -> KnownValue.of(value)
            }
    }

    /**
     * This class is a Jackson filter that can be used to exclude missing properties from objects.
     * This filter should not be used directly and should instead use the @ExcludeMissing
     * annotation.
     */
    class IsMissing {

        override fun equals(other: Any?): Boolean = other is JsonMissing

        override fun hashCode(): Int = Objects.hash()
    }

    class Deserializer(private val type: JavaType? = null) :
        BaseDeserializer<JsonField<*>>(JsonField::class) {

        override fun createContextual(
            context: DeserializationContext,
            property: BeanProperty?,
        ): JsonDeserializer<JsonField<*>> = Deserializer(context.contextualType?.containedType(0))

        override fun ObjectCodec.deserialize(node: JsonNode): JsonField<*> =
            type?.let { tryDeserialize<Any>(node, type) }?.let { of(it) }
                ?: JsonValue.fromJsonNode(node)

        override fun getNullValue(context: DeserializationContext): JsonField<*> = JsonNull.of()
    }
}

/**
 * A class representing an arbitrary JSON value.
 *
 * It is immutable and assignable to any [JsonField], regardless of its expected type (i.e. its
 * generic type argument).
 */
@JsonDeserialize(using = JsonValue.Deserializer::class)
sealed class JsonValue : JsonField<Nothing>() {

    inline fun <reified R : Any> convert(): R? = convert(jacksonTypeRef())

    fun <R : Any> convert(type: TypeReference<R>): R? = JSON_MAPPER.convertValue(this, type)

    fun <R : Any> convert(type: KClass<R>): R? = JSON_MAPPER.convertValue(this, type.java)

    /** Returns the result of calling the [visitor] method corresponding to this value's variant. */
    fun <R> accept(visitor: Visitor<R>): R =
        when (this) {
            is JsonMissing -> visitor.visitMissing()
            is JsonNull -> visitor.visitNull()
            is JsonBoolean -> visitor.visitBoolean(value)
            is JsonNumber -> visitor.visitNumber(value)
            is JsonString -> visitor.visitString(value)
            is JsonArray -> visitor.visitArray(values)
            is JsonObject -> visitor.visitObject(values)
        }

    /**
     * An interface that defines how to map each variant state of a [JsonValue] to a value of type
     * [R].
     */
    interface Visitor<out R> {

        fun visitNull(): R = visitDefault()

        fun visitMissing(): R = visitDefault()

        fun visitBoolean(value: Boolean): R = visitDefault()

        fun visitNumber(value: Number): R = visitDefault()

        fun visitString(value: String): R = visitDefault()

        fun visitArray(values: List<JsonValue>): R = visitDefault()

        fun visitObject(values: Map<String, JsonValue>): R = visitDefault()

        /**
         * The default implementation for unimplemented visitor methods.
         *
         * @throws IllegalArgumentException in the default implementation.
         */
        fun visitDefault(): R = throw IllegalArgumentException("Unexpected value")
    }

    companion object {

        private val JSON_MAPPER = jsonMapper()

        /**
         * Converts the given [value] to a [JsonValue].
         *
         * This method works best on primitive types, [List] values, [Map] values, and nested
         * combinations of these. For example:
         * ```kotlin
         * // Create primitive JSON values
         * val nullValue: JsonValue = JsonValue.from(null)
         * val booleanValue: JsonValue = JsonValue.from(true)
         * val numberValue: JsonValue = JsonValue.from(42)
         * val stringValue: JsonValue = JsonValue.from("Hello World!")
         *
         * // Create a JSON array value equivalent to `["Hello", "World"]`
         * val arrayValue: JsonValue = JsonValue.from(listOf("Hello", "World"))
         *
         * // Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
         * val objectValue: JsonValue = JsonValue.from(mapOf(
         *   "a" to 1,
         *   "b" to 2,
         * ))
         *
         * // Create an arbitrarily nested JSON equivalent to:
         * // {
         * //   "a": [1, 2],
         * //   "b": [3, 4]
         * // }
         * val complexValue: JsonValue = JsonValue.from(mapOf(
         *   "a" to listOf(1, 2),
         *   "b" to listOf(3, 4),
         * ))
         * ```
         *
         * @throws IllegalArgumentException if [value] is not JSON serializable.
         */
        fun from(value: Any?): JsonValue =
            when (value) {
                null -> JsonNull.of()
                is JsonValue -> value
                else -> JSON_MAPPER.convertValue(value, JsonValue::class.java)
            }

        /**
         * Returns a [JsonValue] converted from the given Jackson [JsonNode].
         *
         * @throws IllegalStateException for unsupported node types.
         */
        fun fromJsonNode(node: JsonNode): JsonValue =
            when (node.nodeType) {
                MISSING -> JsonMissing.of()
                NULL -> JsonNull.of()
                BOOLEAN -> JsonBoolean.of(node.booleanValue())
                NUMBER -> JsonNumber.of(node.numberValue())
                STRING -> JsonString.of(node.textValue())
                ARRAY ->
                    JsonArray.of(node.elements().asSequence().map { fromJsonNode(it) }.toList())
                OBJECT ->
                    JsonObject.of(
                        node.fields().asSequence().map { it.key to fromJsonNode(it.value) }.toMap()
                    )
                BINARY,
                POJO,
                null -> throw IllegalStateException("Unexpected JsonNode type: ${node.nodeType}")
            }
    }

    class Deserializer : BaseDeserializer<JsonValue>(JsonValue::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): JsonValue = fromJsonNode(node)

        override fun getNullValue(context: DeserializationContext?): JsonValue = JsonNull.of()
    }
}

/**
 * A class representing a "known" JSON serializable value of type [T], matching the type the SDK
 * expects.
 *
 * It is assignable to `JsonField<T>`.
 */
class KnownValue<T : Any>
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: T
) : JsonField<T>() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KnownValue<*> && value contentEquals other.value
    }

    override fun hashCode() = contentHash(value)

    override fun toString() = value.contentToString()

    companion object {

        /** Returns a [KnownValue] containing the given [value]. */
        @JsonCreator fun <T : Any> of(value: T) = KnownValue(value)
    }
}

/**
 * A [JsonValue] representing an omitted JSON field.
 *
 * An instance of this class will cause a JSON field to be omitted from the serialized JSON
 * entirely.
 */
@JsonSerialize(using = JsonMissing.Serializer::class)
class JsonMissing : JsonValue() {

    override fun toString() = ""

    companion object {

        private val INSTANCE: JsonMissing = JsonMissing()

        /** Returns the singleton instance of [JsonMissing]. */
        fun of() = INSTANCE
    }

    class Serializer : BaseSerializer<JsonMissing>(JsonMissing::class) {

        override fun serialize(
            value: JsonMissing,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            throw IllegalStateException("JsonMissing cannot be serialized")
        }
    }
}

/** A [JsonValue] representing a JSON `null` value. */
@JsonSerialize(using = NullSerializer::class)
class JsonNull : JsonValue() {

    override fun toString() = "null"

    companion object {

        private val INSTANCE: JsonNull = JsonNull()

        /** Returns the singleton instance of [JsonMissing]. */
        @JsonCreator fun of() = INSTANCE
    }
}

/** A [JsonValue] representing a JSON boolean value. */
class JsonBoolean
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: Boolean
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonBoolean && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        /** Returns a [JsonBoolean] containing the given [value]. */
        @JsonCreator fun of(value: Boolean) = JsonBoolean(value)
    }
}

/** A [JsonValue] representing a JSON number value. */
class JsonNumber
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: Number
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonNumber && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()

    companion object {

        /** Returns a [JsonNumber] containing the given [value]. */
        @JsonCreator fun of(value: Number) = JsonNumber(value)
    }
}

/** A [JsonValue] representing a JSON string value. */
class JsonString
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue @get:JvmName("value") val value: String
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonString && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value

    companion object {

        /** Returns a [JsonString] containing the given [value]. */
        @JsonCreator fun of(value: String) = JsonString(value)
    }
}

/** A [JsonValue] representing a JSON array value. */
class JsonArray
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue
    @get:JvmName("values")
    val values: List<JsonValue>
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonArray && values == other.values
    }

    override fun hashCode() = values.hashCode()

    override fun toString() = values.toString()

    companion object {

        /** Returns a [JsonArray] containing the given [values]. */
        @JsonCreator fun of(values: List<JsonValue>) = JsonArray(values.toImmutable())
    }
}

/** A [JsonValue] representing a JSON object value. */
class JsonObject
private constructor(
    @get:com.fasterxml.jackson.annotation.JsonValue
    @get:JvmName("values")
    val values: Map<String, JsonValue>
) : JsonValue() {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is JsonObject && values == other.values
    }

    override fun hashCode() = values.hashCode()

    override fun toString() = values.toString()

    companion object {

        /** Returns a [JsonObject] containing the given [values]. */
        @JsonCreator fun of(values: Map<String, JsonValue>) = JsonObject(values.toImmutable())
    }
}

/** A Jackson annotation for excluding fields set to [JsonMissing] from the serialized JSON. */
@JacksonAnnotationsInside
@JsonInclude(JsonInclude.Include.CUSTOM, valueFilter = JsonField.IsMissing::class)
annotation class ExcludeMissing

/** A class representing a field in a `multipart/form-data` request. */
class MultipartField<T : Any>
private constructor(
    /** A [JsonField] value, which will be serialized to zero or more parts. */
    @get:com.fasterxml.jackson.annotation.JsonValue val value: JsonField<T>,
    /** A content type for the serialized parts. */
    val contentType: String,
    /** Returns the filename directive that will be included in the serialized field. */
    val filename: String?,
) {

    companion object {

        /**
         * Returns a [MultipartField] containing the given [value] as a [KnownValue].
         *
         * [contentType] will be set to `application/octet-stream` if [value] is binary data, or
         * `text/plain; charset=utf-8` otherwise.
         */
        fun <T : Any> of(value: T?) = builder<T>().value(value).build()

        /**
         * Returns a [MultipartField] containing the given [value].
         *
         * [contentType] will be set to `application/octet-stream` if [value] is binary data, or
         * `text/plain; charset=utf-8` otherwise.
         */
        fun <T : Any> of(value: JsonField<T>) = builder<T>().value(value).build()

        /**
         * Returns a mutable builder for constructing an instance of [MultipartField].
         *
         * The following fields are required:
         * ```kotlin
         * .value()
         * ```
         *
         * If [contentType] is unset, then it will be set to `application/octet-stream` if [value]
         * is binary data, or `text/plain; charset=utf-8` otherwise.
         */
        fun <T : Any> builder() = Builder<T>()
    }

    internal fun <R : Any> map(transform: (T) -> R): MultipartField<R> =
        builder<R>().value(value.map(transform)).contentType(contentType).filename(filename).build()

    /** A builder for [MultipartField]. */
    class Builder<T : Any> internal constructor() {

        private var value: JsonField<T>? = null
        private var contentType: String? = null
        private var filename: String? = null

        fun value(value: JsonField<T>) = apply { this.value = value }

        fun value(value: T?) = value(JsonField.ofNullable(value))

        fun contentType(contentType: String) = apply { this.contentType = contentType }

        fun filename(filename: String?) = apply { this.filename = filename }

        /**
         * Returns an immutable instance of [MultipartField].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .value()
         * ```
         *
         * If [contentType] is unset, then it will be set to `application/octet-stream` if [value]
         * is binary data, or `text/plain; charset=utf-8` otherwise.
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MultipartField<T> {
            val value = checkRequired("value", value)
            return MultipartField(
                value,
                contentType
                    ?: if (
                        value is KnownValue &&
                            (value.value is InputStream || value.value is ByteArray)
                    )
                        "application/octet-stream"
                    else "text/plain; charset=utf-8",
                filename,
            )
        }
    }

    private val hashCode: Int by lazy { contentHash(value, contentType, filename) }

    override fun hashCode(): Int = hashCode

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultipartField<*> &&
            value == other.value &&
            contentType == other.contentType &&
            filename == other.filename
    }

    override fun toString(): String =
        "MultipartField{value=$value, contentType=$contentType, filename=$filename}"
}
