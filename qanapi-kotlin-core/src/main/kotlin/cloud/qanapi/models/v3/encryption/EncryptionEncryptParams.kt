// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.encryption

import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.Params
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.http.Headers
import cloud.qanapi.core.http.QueryParams
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

/** Encrypt data */
class EncryptionEncryptParams
private constructor(
    private val proxy: String?,
    private val xQanapiFields: String,
    private val xQanapiClassification: String?,
    private val xQanapiDestination: String?,
    private val data: Data,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun proxy(): String? = proxy

    fun xQanapiFields(): String = xQanapiFields

    fun xQanapiClassification(): String? = xQanapiClassification

    fun xQanapiDestination(): String? = xQanapiDestination

    /** A JSON object to encrypt fields on. A maximum depth of 32 is allowed. */
    fun data(): Data = data

    fun _additionalBodyProperties(): Map<String, JsonValue> = data._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EncryptionEncryptParams].
         *
         * The following fields are required:
         * ```kotlin
         * .xQanapiFields()
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EncryptionEncryptParams]. */
    class Builder internal constructor() {

        private var proxy: String? = null
        private var xQanapiFields: String? = null
        private var xQanapiClassification: String? = null
        private var xQanapiDestination: String? = null
        private var data: Data? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(encryptionEncryptParams: EncryptionEncryptParams) = apply {
            proxy = encryptionEncryptParams.proxy
            xQanapiFields = encryptionEncryptParams.xQanapiFields
            xQanapiClassification = encryptionEncryptParams.xQanapiClassification
            xQanapiDestination = encryptionEncryptParams.xQanapiDestination
            data = encryptionEncryptParams.data
            additionalHeaders = encryptionEncryptParams.additionalHeaders.toBuilder()
            additionalQueryParams = encryptionEncryptParams.additionalQueryParams.toBuilder()
        }

        fun proxy(proxy: String?) = apply { this.proxy = proxy }

        fun xQanapiFields(xQanapiFields: String) = apply { this.xQanapiFields = xQanapiFields }

        fun xQanapiClassification(xQanapiClassification: String?) = apply {
            this.xQanapiClassification = xQanapiClassification
        }

        fun xQanapiDestination(xQanapiDestination: String?) = apply {
            this.xQanapiDestination = xQanapiDestination
        }

        /** A JSON object to encrypt fields on. A maximum depth of 32 is allowed. */
        fun data(data: Data) = apply { this.data = data }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [EncryptionEncryptParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .xQanapiFields()
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EncryptionEncryptParams =
            EncryptionEncryptParams(
                proxy,
                checkRequired("xQanapiFields", xQanapiFields),
                xQanapiClassification,
                xQanapiDestination,
                checkRequired("data", data),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Data = data

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> proxy ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                put("x-qanapi-fields", xQanapiFields)
                xQanapiClassification?.let { put("x-qanapi-classification", it) }
                xQanapiDestination?.let { put("x-qanapi-destination", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** A JSON object to encrypt fields on. A maximum depth of 32 is allowed. */
    class Data
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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(additionalProperties.toImmutable())
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
        fun validate(): Data = apply {
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

            return other is Data && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EncryptionEncryptParams &&
            proxy == other.proxy &&
            xQanapiFields == other.xQanapiFields &&
            xQanapiClassification == other.xQanapiClassification &&
            xQanapiDestination == other.xQanapiDestination &&
            data == other.data &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            proxy,
            xQanapiFields,
            xQanapiClassification,
            xQanapiDestination,
            data,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "EncryptionEncryptParams{proxy=$proxy, xQanapiFields=$xQanapiFields, xQanapiClassification=$xQanapiClassification, xQanapiDestination=$xQanapiDestination, data=$data, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
