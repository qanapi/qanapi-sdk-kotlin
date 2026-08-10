// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.encryption

import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

class EncryptionDecryptResponse
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
         * Returns a mutable builder for constructing an instance of [EncryptionDecryptResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [EncryptionDecryptResponse]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(encryptionDecryptResponse: EncryptionDecryptResponse) = apply {
            additionalProperties = encryptionDecryptResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [EncryptionDecryptResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EncryptionDecryptResponse =
            EncryptionDecryptResponse(additionalProperties.toImmutable())
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
    fun validate(): EncryptionDecryptResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EncryptionDecryptResponse &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EncryptionDecryptResponse{additionalProperties=$additionalProperties}"
}
