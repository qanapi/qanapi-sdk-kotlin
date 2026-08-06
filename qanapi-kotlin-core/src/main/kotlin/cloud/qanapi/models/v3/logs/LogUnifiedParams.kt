// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.Enum
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.Params
import cloud.qanapi.core.http.Headers
import cloud.qanapi.core.http.QueryParams
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

/** Get unified logs */
class LogUnifiedParams
private constructor(
    private val action: String?,
    private val causerEmail: String?,
    private val description: String?,
    private val details: String?,
    private val logType: LogType?,
    private val page: Long?,
    private val perPage: Long?,
    private val requestId: String?,
    private val statusCode: Long?,
    private val userId: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun action(): String? = action

    fun causerEmail(): String? = causerEmail

    fun description(): String? = description

    fun details(): String? = details

    fun logType(): LogType? = logType

    fun page(): Long? = page

    fun perPage(): Long? = perPage

    fun requestId(): String? = requestId

    fun statusCode(): Long? = statusCode

    fun userId(): Long? = userId

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): LogUnifiedParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LogUnifiedParams]. */
        fun builder() = Builder()
    }

    /** A builder for [LogUnifiedParams]. */
    class Builder internal constructor() {

        private var action: String? = null
        private var causerEmail: String? = null
        private var description: String? = null
        private var details: String? = null
        private var logType: LogType? = null
        private var page: Long? = null
        private var perPage: Long? = null
        private var requestId: String? = null
        private var statusCode: Long? = null
        private var userId: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(logUnifiedParams: LogUnifiedParams) = apply {
            action = logUnifiedParams.action
            causerEmail = logUnifiedParams.causerEmail
            description = logUnifiedParams.description
            details = logUnifiedParams.details
            logType = logUnifiedParams.logType
            page = logUnifiedParams.page
            perPage = logUnifiedParams.perPage
            requestId = logUnifiedParams.requestId
            statusCode = logUnifiedParams.statusCode
            userId = logUnifiedParams.userId
            additionalHeaders = logUnifiedParams.additionalHeaders.toBuilder()
            additionalQueryParams = logUnifiedParams.additionalQueryParams.toBuilder()
        }

        fun action(action: String?) = apply { this.action = action }

        fun causerEmail(causerEmail: String?) = apply { this.causerEmail = causerEmail }

        fun description(description: String?) = apply { this.description = description }

        fun details(details: String?) = apply { this.details = details }

        fun logType(logType: LogType?) = apply { this.logType = logType }

        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        fun statusCode(statusCode: Long?) = apply { this.statusCode = statusCode }

        /**
         * Alias for [Builder.statusCode].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun statusCode(statusCode: Long) = statusCode(statusCode as Long?)

        fun userId(userId: Long?) = apply { this.userId = userId }

        /**
         * Alias for [Builder.userId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun userId(userId: Long) = userId(userId as Long?)

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
         * Returns an immutable instance of [LogUnifiedParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogUnifiedParams =
            LogUnifiedParams(
                action,
                causerEmail,
                description,
                details,
                logType,
                page,
                perPage,
                requestId,
                statusCode,
                userId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                action?.let { put("action", it) }
                causerEmail?.let { put("causer_email", it) }
                description?.let { put("description", it) }
                details?.let { put("details", it) }
                logType?.let { put("log_type", it.toString()) }
                page?.let { put("page", it.toString()) }
                perPage?.let { put("per_page", it.toString()) }
                requestId?.let { put("request_id", it) }
                statusCode?.let { put("status_code", it.toString()) }
                userId?.let { put("user_id", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class LogType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACTIVITY = of("activity")

            val API = of("api")

            val USAGE = of("usage")

            fun of(value: String) = LogType(JsonField.of(value))
        }

        /** An enum containing [LogType]'s known values. */
        enum class Known {
            ACTIVITY,
            API,
            USAGE,
        }

        /**
         * An enum containing [LogType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LogType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVITY,
            API,
            USAGE,
            /** An enum member indicating that [LogType] was instantiated with an unknown value. */
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
                ACTIVITY -> Value.ACTIVITY
                API -> Value.API
                USAGE -> Value.USAGE
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
                ACTIVITY -> Known.ACTIVITY
                API -> Known.API
                USAGE -> Known.USAGE
                else -> throw QanapiInvalidDataException("Unknown LogType: $value")
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
        fun validate(): LogType = apply {
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

            return other is LogType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogUnifiedParams &&
            action == other.action &&
            causerEmail == other.causerEmail &&
            description == other.description &&
            details == other.details &&
            logType == other.logType &&
            page == other.page &&
            perPage == other.perPage &&
            requestId == other.requestId &&
            statusCode == other.statusCode &&
            userId == other.userId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            action,
            causerEmail,
            description,
            details,
            logType,
            page,
            perPage,
            requestId,
            statusCode,
            userId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LogUnifiedParams{action=$action, causerEmail=$causerEmail, description=$description, details=$details, logType=$logType, page=$page, perPage=$perPage, requestId=$requestId, statusCode=$statusCode, userId=$userId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
