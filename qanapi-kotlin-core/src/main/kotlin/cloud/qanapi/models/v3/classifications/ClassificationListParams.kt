// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.classifications

import cloud.qanapi.core.Enum
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.Params
import cloud.qanapi.core.http.Headers
import cloud.qanapi.core.http.QueryParams
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects

/** List classifications */
class ClassificationListParams
private constructor(
    private val direction: Direction?,
    private val perPage: Long?,
    private val providers: List<Long>?,
    private val roles: List<Long>?,
    private val search: String?,
    private val sort: String?,
    private val user: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun direction(): Direction? = direction

    fun perPage(): Long? = perPage

    fun providers(): List<Long>? = providers

    fun roles(): List<Long>? = roles

    fun search(): String? = search

    fun sort(): String? = sort

    fun user(): Long? = user

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ClassificationListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ClassificationListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ClassificationListParams]. */
    class Builder internal constructor() {

        private var direction: Direction? = null
        private var perPage: Long? = null
        private var providers: MutableList<Long>? = null
        private var roles: MutableList<Long>? = null
        private var search: String? = null
        private var sort: String? = null
        private var user: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(classificationListParams: ClassificationListParams) = apply {
            direction = classificationListParams.direction
            perPage = classificationListParams.perPage
            providers = classificationListParams.providers?.toMutableList()
            roles = classificationListParams.roles?.toMutableList()
            search = classificationListParams.search
            sort = classificationListParams.sort
            user = classificationListParams.user
            additionalHeaders = classificationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = classificationListParams.additionalQueryParams.toBuilder()
        }

        fun direction(direction: Direction?) = apply { this.direction = direction }

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        fun providers(providers: List<Long>?) = apply {
            this.providers = providers?.toMutableList()
        }

        /**
         * Adds a single [Long] to [providers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProvider(provider: Long) = apply {
            providers = (providers ?: mutableListOf()).apply { add(provider) }
        }

        fun roles(roles: List<Long>?) = apply { this.roles = roles?.toMutableList() }

        /**
         * Adds a single [Long] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: Long) = apply { roles = (roles ?: mutableListOf()).apply { add(role) } }

        fun search(search: String?) = apply { this.search = search }

        fun sort(sort: String?) = apply { this.sort = sort }

        fun user(user: Long?) = apply { this.user = user }

        /**
         * Alias for [Builder.user].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun user(user: Long) = user(user as Long?)

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
         * Returns an immutable instance of [ClassificationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClassificationListParams =
            ClassificationListParams(
                direction,
                perPage,
                providers?.toImmutable(),
                roles?.toImmutable(),
                search,
                sort,
                user,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                direction?.let { put("direction", it.toString()) }
                perPage?.let { put("per_page", it.toString()) }
                providers?.let { put("providers", it.joinToString(",") { it.toString() }) }
                roles?.let { put("roles", it.joinToString(",") { it.toString() }) }
                search?.let { put("search", it) }
                sort?.let { put("sort", it) }
                user?.let { put("user", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ASC = of("asc")

            val DESC = of("desc")

            fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
             */
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
                ASC -> Value.ASC
                DESC -> Value.DESC
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
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw QanapiInvalidDataException("Unknown Direction: $value")
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
        fun validate(): Direction = apply {
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

            return other is Direction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClassificationListParams &&
            direction == other.direction &&
            perPage == other.perPage &&
            providers == other.providers &&
            roles == other.roles &&
            search == other.search &&
            sort == other.sort &&
            user == other.user &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            direction,
            perPage,
            providers,
            roles,
            search,
            sort,
            user,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ClassificationListParams{direction=$direction, perPage=$perPage, providers=$providers, roles=$roles, search=$search, sort=$sort, user=$user, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
