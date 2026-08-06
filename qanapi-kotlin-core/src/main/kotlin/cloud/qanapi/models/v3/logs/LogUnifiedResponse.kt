// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.BaseDeserializer
import cloud.qanapi.core.BaseSerializer
import cloud.qanapi.core.Enum
import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.allMaxBy
import cloud.qanapi.core.checkKnown
import cloud.qanapi.core.getOrThrow
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import cloud.qanapi.models.v3.ApiKey
import cloud.qanapi.models.v3.Configuration
import cloud.qanapi.models.v3.User
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LogUnifiedResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currentPage: JsonField<Long>,
    private val data: JsonField<List<Data>>,
    private val firstPageUrl: JsonField<String>,
    private val from: JsonField<Long>,
    private val lastPage: JsonField<Long>,
    private val lastPageUrl: JsonField<String>,
    private val links: JsonField<List<Link>>,
    private val nextPageUrl: JsonField<String>,
    private val path: JsonField<String>,
    private val perPage: JsonField<Long>,
    private val prevPageUrl: JsonField<String>,
    private val to: JsonField<Long>,
    private val total: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("current_page")
        @ExcludeMissing
        currentPage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("first_page_url")
        @ExcludeMissing
        firstPageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("last_page") @ExcludeMissing lastPage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("last_page_url")
        @ExcludeMissing
        lastPageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("links") @ExcludeMissing links: JsonField<List<Link>> = JsonMissing.of(),
        @JsonProperty("next_page_url")
        @ExcludeMissing
        nextPageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("per_page") @ExcludeMissing perPage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("prev_page_url")
        @ExcludeMissing
        prevPageUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
    ) : this(
        currentPage,
        data,
        firstPageUrl,
        from,
        lastPage,
        lastPageUrl,
        links,
        nextPageUrl,
        path,
        perPage,
        prevPageUrl,
        to,
        total,
        mutableMapOf(),
    )

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentPage(): Long? = currentPage.getNullable("current_page")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): List<Data>? = data.getNullable("data")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstPageUrl(): String? = firstPageUrl.getNullable("first_page_url")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Long? = from.getNullable("from")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastPage(): Long? = lastPage.getNullable("last_page")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastPageUrl(): String? = lastPageUrl.getNullable("last_page_url")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun links(): List<Link>? = links.getNullable("links")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextPageUrl(): String? = nextPageUrl.getNullable("next_page_url")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): String? = path.getNullable("path")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun perPage(): Long? = perPage.getNullable("per_page")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prevPageUrl(): String? = prevPageUrl.getNullable("prev_page_url")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun to(): Long? = to.getNullable("to")

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun total(): Long? = total.getNullable("total")

    /**
     * Returns the raw JSON value of [currentPage].
     *
     * Unlike [currentPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_page") @ExcludeMissing fun _currentPage(): JsonField<Long> = currentPage

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [firstPageUrl].
     *
     * Unlike [firstPageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_page_url")
    @ExcludeMissing
    fun _firstPageUrl(): JsonField<String> = firstPageUrl

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<Long> = from

    /**
     * Returns the raw JSON value of [lastPage].
     *
     * Unlike [lastPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_page") @ExcludeMissing fun _lastPage(): JsonField<Long> = lastPage

    /**
     * Returns the raw JSON value of [lastPageUrl].
     *
     * Unlike [lastPageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_page_url")
    @ExcludeMissing
    fun _lastPageUrl(): JsonField<String> = lastPageUrl

    /**
     * Returns the raw JSON value of [links].
     *
     * Unlike [links], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("links") @ExcludeMissing fun _links(): JsonField<List<Link>> = links

    /**
     * Returns the raw JSON value of [nextPageUrl].
     *
     * Unlike [nextPageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_page_url")
    @ExcludeMissing
    fun _nextPageUrl(): JsonField<String> = nextPageUrl

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [perPage].
     *
     * Unlike [perPage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("per_page") @ExcludeMissing fun _perPage(): JsonField<Long> = perPage

    /**
     * Returns the raw JSON value of [prevPageUrl].
     *
     * Unlike [prevPageUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prev_page_url")
    @ExcludeMissing
    fun _prevPageUrl(): JsonField<String> = prevPageUrl

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<Long> = to

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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

        /** Returns a mutable builder for constructing an instance of [LogUnifiedResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [LogUnifiedResponse]. */
    class Builder internal constructor() {

        private var currentPage: JsonField<Long> = JsonMissing.of()
        private var data: JsonField<MutableList<Data>>? = null
        private var firstPageUrl: JsonField<String> = JsonMissing.of()
        private var from: JsonField<Long> = JsonMissing.of()
        private var lastPage: JsonField<Long> = JsonMissing.of()
        private var lastPageUrl: JsonField<String> = JsonMissing.of()
        private var links: JsonField<MutableList<Link>>? = null
        private var nextPageUrl: JsonField<String> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var perPage: JsonField<Long> = JsonMissing.of()
        private var prevPageUrl: JsonField<String> = JsonMissing.of()
        private var to: JsonField<Long> = JsonMissing.of()
        private var total: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(logUnifiedResponse: LogUnifiedResponse) = apply {
            currentPage = logUnifiedResponse.currentPage
            data = logUnifiedResponse.data.map { it.toMutableList() }
            firstPageUrl = logUnifiedResponse.firstPageUrl
            from = logUnifiedResponse.from
            lastPage = logUnifiedResponse.lastPage
            lastPageUrl = logUnifiedResponse.lastPageUrl
            links = logUnifiedResponse.links.map { it.toMutableList() }
            nextPageUrl = logUnifiedResponse.nextPageUrl
            path = logUnifiedResponse.path
            perPage = logUnifiedResponse.perPage
            prevPageUrl = logUnifiedResponse.prevPageUrl
            to = logUnifiedResponse.to
            total = logUnifiedResponse.total
            additionalProperties = logUnifiedResponse.additionalProperties.toMutableMap()
        }

        fun currentPage(currentPage: Long) = currentPage(JsonField.of(currentPage))

        /**
         * Sets [Builder.currentPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPage] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currentPage(currentPage: JsonField<Long>) = apply { this.currentPage = currentPage }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun firstPageUrl(firstPageUrl: String) = firstPageUrl(JsonField.of(firstPageUrl))

        /**
         * Sets [Builder.firstPageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstPageUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstPageUrl(firstPageUrl: JsonField<String>) = apply {
            this.firstPageUrl = firstPageUrl
        }

        fun from(from: Long?) = from(JsonField.ofNullable(from))

        /**
         * Alias for [Builder.from].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun from(from: Long) = from(from as Long?)

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<Long>) = apply { this.from = from }

        fun lastPage(lastPage: Long) = lastPage(JsonField.of(lastPage))

        /**
         * Sets [Builder.lastPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastPage] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastPage(lastPage: JsonField<Long>) = apply { this.lastPage = lastPage }

        fun lastPageUrl(lastPageUrl: String) = lastPageUrl(JsonField.of(lastPageUrl))

        /**
         * Sets [Builder.lastPageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastPageUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastPageUrl(lastPageUrl: JsonField<String>) = apply { this.lastPageUrl = lastPageUrl }

        fun links(links: List<Link>) = links(JsonField.of(links))

        /**
         * Sets [Builder.links] to an arbitrary JSON value.
         *
         * You should usually call [Builder.links] with a well-typed `List<Link>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun links(links: JsonField<List<Link>>) = apply {
            this.links = links.map { it.toMutableList() }
        }

        /**
         * Adds a single [Link] to [links].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLink(link: Link) = apply {
            links =
                (links ?: JsonField.of(mutableListOf())).also { checkKnown("links", it).add(link) }
        }

        fun nextPageUrl(nextPageUrl: String?) = nextPageUrl(JsonField.ofNullable(nextPageUrl))

        /**
         * Sets [Builder.nextPageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextPageUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextPageUrl(nextPageUrl: JsonField<String>) = apply { this.nextPageUrl = nextPageUrl }

        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        fun perPage(perPage: Long) = perPage(JsonField.of(perPage))

        /**
         * Sets [Builder.perPage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.perPage] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun perPage(perPage: JsonField<Long>) = apply { this.perPage = perPage }

        fun prevPageUrl(prevPageUrl: String?) = prevPageUrl(JsonField.ofNullable(prevPageUrl))

        /**
         * Sets [Builder.prevPageUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prevPageUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun prevPageUrl(prevPageUrl: JsonField<String>) = apply { this.prevPageUrl = prevPageUrl }

        fun to(to: Long?) = to(JsonField.ofNullable(to))

        /**
         * Alias for [Builder.to].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun to(to: Long) = to(to as Long?)

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<Long>) = apply { this.to = to }

        fun total(total: Long) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Long>) = apply { this.total = total }

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
         * Returns an immutable instance of [LogUnifiedResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogUnifiedResponse =
            LogUnifiedResponse(
                currentPage,
                (data ?: JsonMissing.of()).map { it.toImmutable() },
                firstPageUrl,
                from,
                lastPage,
                lastPageUrl,
                (links ?: JsonMissing.of()).map { it.toImmutable() },
                nextPageUrl,
                path,
                perPage,
                prevPageUrl,
                to,
                total,
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
    fun validate(): LogUnifiedResponse = apply {
        if (validated) {
            return@apply
        }

        currentPage()
        data()?.forEach { it.validate() }
        firstPageUrl()
        from()
        lastPage()
        lastPageUrl()
        links()?.forEach { it.validate() }
        nextPageUrl()
        path()
        perPage()
        prevPageUrl()
        to()
        total()
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
        (if (currentPage.asKnown() == null) 0 else 1) +
            (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (firstPageUrl.asKnown() == null) 0 else 1) +
            (if (from.asKnown() == null) 0 else 1) +
            (if (lastPage.asKnown() == null) 0 else 1) +
            (if (lastPageUrl.asKnown() == null) 0 else 1) +
            (links.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextPageUrl.asKnown() == null) 0 else 1) +
            (if (path.asKnown() == null) 0 else 1) +
            (if (perPage.asKnown() == null) 0 else 1) +
            (if (prevPageUrl.asKnown() == null) 0 else 1) +
            (if (to.asKnown() == null) 0 else 1) +
            (if (total.asKnown() == null) 0 else 1)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val action: JsonField<String>,
        private val causerEmail: JsonField<String>,
        private val configuration: JsonField<Configuration>,
        private val description: JsonField<String>,
        private val details: JsonValue,
        private val fullLog: JsonField<FullLog>,
        private val logType: JsonField<LogType>,
        private val requestId: JsonField<String>,
        private val statusCode: JsonField<Long>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val user: JsonField<User>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<String> = JsonMissing.of(),
            @JsonProperty("causer_email")
            @ExcludeMissing
            causerEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("details") @ExcludeMissing details: JsonValue = JsonMissing.of(),
            @JsonProperty("full_log")
            @ExcludeMissing
            fullLog: JsonField<FullLog> = JsonMissing.of(),
            @JsonProperty("log_type")
            @ExcludeMissing
            logType: JsonField<LogType> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status_code")
            @ExcludeMissing
            statusCode: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
        ) : this(
            action,
            causerEmail,
            configuration,
            description,
            details,
            fullLog,
            logType,
            requestId,
            statusCode,
            timestamp,
            user,
            mutableMapOf(),
        )

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun action(): String? = action.getNullable("action")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun causerEmail(): String? = causerEmail.getNullable("causer_email")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun configuration(): Configuration? = configuration.getNullable("configuration")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = data.details().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("details") @ExcludeMissing fun _details(): JsonValue = details

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fullLog(): FullLog? = fullLog.getNullable("full_log")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun logType(): LogType? = logType.getNullable("log_type")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): String? = requestId.getNullable("request_id")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statusCode(): Long? = statusCode.getNullable("status_code")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun timestamp(): OffsetDateTime? = timestamp.getNullable("timestamp")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun user(): User? = user.getNullable("user")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

        /**
         * Returns the raw JSON value of [causerEmail].
         *
         * Unlike [causerEmail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("causer_email")
        @ExcludeMissing
        fun _causerEmail(): JsonField<String> = causerEmail

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [fullLog].
         *
         * Unlike [fullLog], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("full_log") @ExcludeMissing fun _fullLog(): JsonField<FullLog> = fullLog

        /**
         * Returns the raw JSON value of [logType].
         *
         * Unlike [logType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("log_type") @ExcludeMissing fun _logType(): JsonField<LogType> = logType

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

        /**
         * Returns the raw JSON value of [statusCode].
         *
         * Unlike [statusCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status_code") @ExcludeMissing fun _statusCode(): JsonField<Long> = statusCode

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var action: JsonField<String> = JsonMissing.of()
            private var causerEmail: JsonField<String> = JsonMissing.of()
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var details: JsonValue = JsonMissing.of()
            private var fullLog: JsonField<FullLog> = JsonMissing.of()
            private var logType: JsonField<LogType> = JsonMissing.of()
            private var requestId: JsonField<String> = JsonMissing.of()
            private var statusCode: JsonField<Long> = JsonMissing.of()
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var user: JsonField<User> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                action = data.action
                causerEmail = data.causerEmail
                configuration = data.configuration
                description = data.description
                details = data.details
                fullLog = data.fullLog
                logType = data.logType
                requestId = data.requestId
                statusCode = data.statusCode
                timestamp = data.timestamp
                user = data.user
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun action(action: String) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<String>) = apply { this.action = action }

            fun causerEmail(causerEmail: String?) = causerEmail(JsonField.ofNullable(causerEmail))

            /**
             * Sets [Builder.causerEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.causerEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun causerEmail(causerEmail: JsonField<String>) = apply {
                this.causerEmail = causerEmail
            }

            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun details(details: JsonValue) = apply { this.details = details }

            fun fullLog(fullLog: FullLog) = fullLog(JsonField.of(fullLog))

            /**
             * Sets [Builder.fullLog] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullLog] with a well-typed [FullLog] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullLog(fullLog: JsonField<FullLog>) = apply { this.fullLog = fullLog }

            /** Alias for calling [fullLog] with `FullLog.ofActivity(activity)`. */
            fun fullLog(activity: FullLog.ActivityLog) = fullLog(FullLog.ofActivity(activity))

            /** Alias for calling [fullLog] with `FullLog.ofApi(api)`. */
            fun fullLog(api: FullLog.ApiLog) = fullLog(FullLog.ofApi(api))

            /** Alias for calling [fullLog] with `FullLog.ofQanapiFlow(qanapiFlow)`. */
            fun fullLog(qanapiFlow: FullLog.QanapiFlowLog) =
                fullLog(FullLog.ofQanapiFlow(qanapiFlow))

            fun logType(logType: LogType) = logType(JsonField.of(logType))

            /**
             * Sets [Builder.logType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logType] with a well-typed [LogType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logType(logType: JsonField<LogType>) = apply { this.logType = logType }

            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            fun statusCode(statusCode: Long?) = statusCode(JsonField.ofNullable(statusCode))

            /**
             * Alias for [Builder.statusCode].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun statusCode(statusCode: Long) = statusCode(statusCode as Long?)

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
            }

            fun user(user: User) = user(JsonField.of(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [User] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<User>) = apply { this.user = user }

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
            fun build(): Data =
                Data(
                    action,
                    causerEmail,
                    configuration,
                    description,
                    details,
                    fullLog,
                    logType,
                    requestId,
                    statusCode,
                    timestamp,
                    user,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            action()
            causerEmail()
            configuration()?.validate()
            description()
            fullLog()?.validate()
            logType()?.validate()
            requestId()
            statusCode()
            timestamp()
            user()?.validate()
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
            (if (action.asKnown() == null) 0 else 1) +
                (if (causerEmail.asKnown() == null) 0 else 1) +
                (configuration.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (fullLog.asKnown()?.validity() ?: 0) +
                (logType.asKnown()?.validity() ?: 0) +
                (if (requestId.asKnown() == null) 0 else 1) +
                (if (statusCode.asKnown() == null) 0 else 1) +
                (if (timestamp.asKnown() == null) 0 else 1) +
                (user.asKnown()?.validity() ?: 0)

        @JsonDeserialize(using = FullLog.Deserializer::class)
        @JsonSerialize(using = FullLog.Serializer::class)
        class FullLog
        private constructor(
            private val activity: ActivityLog? = null,
            private val api: ApiLog? = null,
            private val qanapiFlow: QanapiFlowLog? = null,
            private val _json: JsonValue? = null,
        ) {

            fun activity(): ActivityLog? = activity

            fun api(): ApiLog? = api

            fun qanapiFlow(): QanapiFlowLog? = qanapiFlow

            fun isActivity(): Boolean = activity != null

            fun isApi(): Boolean = api != null

            fun isQanapiFlow(): Boolean = qanapiFlow != null

            fun asActivity(): ActivityLog = activity.getOrThrow("activity")

            fun asApi(): ApiLog = api.getOrThrow("api")

            fun asQanapiFlow(): QanapiFlowLog = qanapiFlow.getOrThrow("qanapiFlow")

            fun _json(): JsonValue? = _json

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```kotlin
             * import cloud.qanapi.core.JsonValue
             *
             * val result: String? = fullLog.accept(object : FullLog.Visitor<String?> {
             *     override fun visitActivity(activity: ActivityLog): String? = activity.toString()
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
             * @throws QanapiInvalidDataException if [Visitor.unknown] is not overridden in
             *   [visitor] and the current variant is unknown.
             */
            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    activity != null -> visitor.visitActivity(activity)
                    api != null -> visitor.visitApi(api)
                    qanapiFlow != null -> visitor.visitQanapiFlow(qanapiFlow)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws QanapiInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): FullLog = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitActivity(activity: ActivityLog) {
                            activity.validate()
                        }

                        override fun visitApi(api: ApiLog) {
                            api.validate()
                        }

                        override fun visitQanapiFlow(qanapiFlow: QanapiFlowLog) {
                            qanapiFlow.validate()
                        }
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
                        override fun visitActivity(activity: ActivityLog) = activity.validity()

                        override fun visitApi(api: ApiLog) = api.validity()

                        override fun visitQanapiFlow(qanapiFlow: QanapiFlowLog) =
                            qanapiFlow.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FullLog &&
                    activity == other.activity &&
                    api == other.api &&
                    qanapiFlow == other.qanapiFlow
            }

            override fun hashCode(): Int = Objects.hash(activity, api, qanapiFlow)

            override fun toString(): String =
                when {
                    activity != null -> "FullLog{activity=$activity}"
                    api != null -> "FullLog{api=$api}"
                    qanapiFlow != null -> "FullLog{qanapiFlow=$qanapiFlow}"
                    _json != null -> "FullLog{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid FullLog")
                }

            companion object {

                fun ofActivity(activity: ActivityLog) = FullLog(activity = activity)

                fun ofApi(api: ApiLog) = FullLog(api = api)

                fun ofQanapiFlow(qanapiFlow: QanapiFlowLog) = FullLog(qanapiFlow = qanapiFlow)
            }

            /**
             * An interface that defines how to map each variant of [FullLog] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitActivity(activity: ActivityLog): T

                fun visitApi(api: ApiLog): T

                fun visitQanapiFlow(qanapiFlow: QanapiFlowLog): T

                /**
                 * Maps an unknown variant of [FullLog] to a value of type [T].
                 *
                 * An instance of [FullLog] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws QanapiInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw QanapiInvalidDataException("Unknown FullLog: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<FullLog>(FullLog::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): FullLog {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<ActivityLog>())?.let {
                                    FullLog(activity = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<ApiLog>())?.let {
                                    FullLog(api = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<QanapiFlowLog>())?.let {
                                    FullLog(qanapiFlow = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> FullLog(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<FullLog>(FullLog::class) {

                override fun serialize(
                    value: FullLog,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.activity != null -> generator.writeObject(value.activity)
                        value.api != null -> generator.writeObject(value.api)
                        value.qanapiFlow != null -> generator.writeObject(value.qanapiFlow)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid FullLog")
                    }
                }
            }

            class ActivityLog
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<String>,
                private val description: JsonField<String>,
                private val ip: JsonField<String>,
                private val timestamp: JsonField<OffsetDateTime>,
                private val user: JsonField<User>,
                private val when_: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
                    @JsonProperty("when")
                    @ExcludeMissing
                    when_: JsonField<String> = JsonMissing.of(),
                ) : this(action, description, ip, timestamp, user, when_, mutableMapOf())

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun action(): String? = action.getNullable("action")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun description(): String? = description.getNullable("description")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun ip(): String? = ip.getNullable("ip")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun timestamp(): OffsetDateTime? = timestamp.getNullable("timestamp")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun user(): User? = user.getNullable("user")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun when_(): String? = when_.getNullable("when")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

                /**
                 * Returns the raw JSON value of [description].
                 *
                 * Unlike [description], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Returns the raw JSON value of [ip].
                 *
                 * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [user].
                 *
                 * Unlike [user], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

                /**
                 * Returns the raw JSON value of [when_].
                 *
                 * Unlike [when_], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("when") @ExcludeMissing fun _when_(): JsonField<String> = when_

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

                    /** Returns a mutable builder for constructing an instance of [ActivityLog]. */
                    fun builder() = Builder()
                }

                /** A builder for [ActivityLog]. */
                class Builder internal constructor() {

                    private var action: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var ip: JsonField<String> = JsonMissing.of()
                    private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var user: JsonField<User> = JsonMissing.of()
                    private var when_: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(activityLog: ActivityLog) = apply {
                        action = activityLog.action
                        description = activityLog.description
                        ip = activityLog.ip
                        timestamp = activityLog.timestamp
                        user = activityLog.user
                        when_ = activityLog.when_
                        additionalProperties = activityLog.additionalProperties.toMutableMap()
                    }

                    fun action(action: String) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<String>) = apply { this.action = action }

                    fun description(description: String) = description(JsonField.of(description))

                    /**
                     * Sets [Builder.description] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.description] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    fun ip(ip: String?) = ip(JsonField.ofNullable(ip))

                    /**
                     * Sets [Builder.ip] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ip] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ip(ip: JsonField<String>) = apply { this.ip = ip }

                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    fun user(user: User) = user(JsonField.of(user))

                    /**
                     * Sets [Builder.user] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.user] with a well-typed [User] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun user(user: JsonField<User>) = apply { this.user = user }

                    fun when_(when_: String) = when_(JsonField.of(when_))

                    /**
                     * Sets [Builder.when_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.when_] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun when_(when_: JsonField<String>) = apply { this.when_ = when_ }

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
                     * Returns an immutable instance of [ActivityLog].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ActivityLog =
                        ActivityLog(
                            action,
                            description,
                            ip,
                            timestamp,
                            user,
                            when_,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws QanapiInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ActivityLog = apply {
                    if (validated) {
                        return@apply
                    }

                    action()
                    description()
                    ip()
                    timestamp()
                    user()?.validate()
                    when_()
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
                    (if (action.asKnown() == null) 0 else 1) +
                        (if (description.asKnown() == null) 0 else 1) +
                        (if (ip.asKnown() == null) 0 else 1) +
                        (if (timestamp.asKnown() == null) 0 else 1) +
                        (user.asKnown()?.validity() ?: 0) +
                        (if (when_.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ActivityLog &&
                        action == other.action &&
                        description == other.description &&
                        ip == other.ip &&
                        timestamp == other.timestamp &&
                        user == other.user &&
                        when_ == other.when_ &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        action,
                        description,
                        ip,
                        timestamp,
                        user,
                        when_,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ActivityLog{action=$action, description=$description, ip=$ip, timestamp=$timestamp, user=$user, when_=$when_, additionalProperties=$additionalProperties}"
            }

            class ApiLog
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val apiKey: JsonField<ApiKey>,
                private val apiKeyId: JsonField<Long>,
                private val configurationId: JsonField<Long>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val domain: JsonField<String>,
                private val endpoint: JsonField<String>,
                private val method: JsonField<String>,
                private val proxied: JsonField<Boolean>,
                private val proxiedTo: JsonField<String>,
                private val requestId: JsonField<String>,
                private val statusCode: JsonField<Long>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("api_key")
                    @ExcludeMissing
                    apiKey: JsonField<ApiKey> = JsonMissing.of(),
                    @JsonProperty("api_key_id")
                    @ExcludeMissing
                    apiKeyId: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("configuration_id")
                    @ExcludeMissing
                    configurationId: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("domain")
                    @ExcludeMissing
                    domain: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("endpoint")
                    @ExcludeMissing
                    endpoint: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("method")
                    @ExcludeMissing
                    method: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("proxied")
                    @ExcludeMissing
                    proxied: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("proxied_to")
                    @ExcludeMissing
                    proxiedTo: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("request_id")
                    @ExcludeMissing
                    requestId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("status_code")
                    @ExcludeMissing
                    statusCode: JsonField<Long> = JsonMissing.of(),
                ) : this(
                    apiKey,
                    apiKeyId,
                    configurationId,
                    createdAt,
                    domain,
                    endpoint,
                    method,
                    proxied,
                    proxiedTo,
                    requestId,
                    statusCode,
                    mutableMapOf(),
                )

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun apiKey(): ApiKey? = apiKey.getNullable("api_key")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun apiKeyId(): Long? = apiKeyId.getNullable("api_key_id")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun configurationId(): Long? = configurationId.getNullable("configuration_id")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun domain(): String? = domain.getNullable("domain")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun endpoint(): String? = endpoint.getNullable("endpoint")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun method(): String? = method.getNullable("method")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun proxied(): Boolean? = proxied.getNullable("proxied")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun proxiedTo(): String? = proxiedTo.getNullable("proxied_to")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun requestId(): String? = requestId.getNullable("request_id")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun statusCode(): Long? = statusCode.getNullable("status_code")

                /**
                 * Returns the raw JSON value of [apiKey].
                 *
                 * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

                /**
                 * Returns the raw JSON value of [apiKeyId].
                 *
                 * Unlike [apiKeyId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("api_key_id")
                @ExcludeMissing
                fun _apiKeyId(): JsonField<Long> = apiKeyId

                /**
                 * Returns the raw JSON value of [configurationId].
                 *
                 * Unlike [configurationId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("configuration_id")
                @ExcludeMissing
                fun _configurationId(): JsonField<Long> = configurationId

                /**
                 * Returns the raw JSON value of [createdAt].
                 *
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

                /**
                 * Returns the raw JSON value of [domain].
                 *
                 * Unlike [domain], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

                /**
                 * Returns the raw JSON value of [endpoint].
                 *
                 * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("endpoint")
                @ExcludeMissing
                fun _endpoint(): JsonField<String> = endpoint

                /**
                 * Returns the raw JSON value of [method].
                 *
                 * Unlike [method], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

                /**
                 * Returns the raw JSON value of [proxied].
                 *
                 * Unlike [proxied], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("proxied")
                @ExcludeMissing
                fun _proxied(): JsonField<Boolean> = proxied

                /**
                 * Returns the raw JSON value of [proxiedTo].
                 *
                 * Unlike [proxiedTo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("proxied_to")
                @ExcludeMissing
                fun _proxiedTo(): JsonField<String> = proxiedTo

                /**
                 * Returns the raw JSON value of [requestId].
                 *
                 * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("request_id")
                @ExcludeMissing
                fun _requestId(): JsonField<String> = requestId

                /**
                 * Returns the raw JSON value of [statusCode].
                 *
                 * Unlike [statusCode], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("status_code")
                @ExcludeMissing
                fun _statusCode(): JsonField<Long> = statusCode

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

                    /** Returns a mutable builder for constructing an instance of [ApiLog]. */
                    fun builder() = Builder()
                }

                /** A builder for [ApiLog]. */
                class Builder internal constructor() {

                    private var apiKey: JsonField<ApiKey> = JsonMissing.of()
                    private var apiKeyId: JsonField<Long> = JsonMissing.of()
                    private var configurationId: JsonField<Long> = JsonMissing.of()
                    private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var domain: JsonField<String> = JsonMissing.of()
                    private var endpoint: JsonField<String> = JsonMissing.of()
                    private var method: JsonField<String> = JsonMissing.of()
                    private var proxied: JsonField<Boolean> = JsonMissing.of()
                    private var proxiedTo: JsonField<String> = JsonMissing.of()
                    private var requestId: JsonField<String> = JsonMissing.of()
                    private var statusCode: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(apiLog: ApiLog) = apply {
                        apiKey = apiLog.apiKey
                        apiKeyId = apiLog.apiKeyId
                        configurationId = apiLog.configurationId
                        createdAt = apiLog.createdAt
                        domain = apiLog.domain
                        endpoint = apiLog.endpoint
                        method = apiLog.method
                        proxied = apiLog.proxied
                        proxiedTo = apiLog.proxiedTo
                        requestId = apiLog.requestId
                        statusCode = apiLog.statusCode
                        additionalProperties = apiLog.additionalProperties.toMutableMap()
                    }

                    fun apiKey(apiKey: ApiKey) = apiKey(JsonField.of(apiKey))

                    /**
                     * Sets [Builder.apiKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.apiKey] with a well-typed [ApiKey] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

                    fun apiKeyId(apiKeyId: Long) = apiKeyId(JsonField.of(apiKeyId))

                    /**
                     * Sets [Builder.apiKeyId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.apiKeyId] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun apiKeyId(apiKeyId: JsonField<Long>) = apply { this.apiKeyId = apiKeyId }

                    fun configurationId(configurationId: Long?) =
                        configurationId(JsonField.ofNullable(configurationId))

                    /**
                     * Alias for [Builder.configurationId].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun configurationId(configurationId: Long) =
                        configurationId(configurationId as Long?)

                    /**
                     * Sets [Builder.configurationId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.configurationId] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun configurationId(configurationId: JsonField<Long>) = apply {
                        this.configurationId = configurationId
                    }

                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    fun domain(domain: String) = domain(JsonField.of(domain))

                    /**
                     * Sets [Builder.domain] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.domain] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun domain(domain: JsonField<String>) = apply { this.domain = domain }

                    fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

                    /**
                     * Sets [Builder.endpoint] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endpoint] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

                    fun method(method: String) = method(JsonField.of(method))

                    /**
                     * Sets [Builder.method] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.method] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun method(method: JsonField<String>) = apply { this.method = method }

                    fun proxied(proxied: Boolean) = proxied(JsonField.of(proxied))

                    /**
                     * Sets [Builder.proxied] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.proxied] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun proxied(proxied: JsonField<Boolean>) = apply { this.proxied = proxied }

                    fun proxiedTo(proxiedTo: String?) = proxiedTo(JsonField.ofNullable(proxiedTo))

                    /**
                     * Sets [Builder.proxiedTo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.proxiedTo] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun proxiedTo(proxiedTo: JsonField<String>) = apply {
                        this.proxiedTo = proxiedTo
                    }

                    fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

                    /**
                     * Sets [Builder.requestId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requestId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun requestId(requestId: JsonField<String>) = apply {
                        this.requestId = requestId
                    }

                    fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

                    /**
                     * Sets [Builder.statusCode] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.statusCode] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun statusCode(statusCode: JsonField<Long>) = apply {
                        this.statusCode = statusCode
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
                     * Returns an immutable instance of [ApiLog].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): ApiLog =
                        ApiLog(
                            apiKey,
                            apiKeyId,
                            configurationId,
                            createdAt,
                            domain,
                            endpoint,
                            method,
                            proxied,
                            proxiedTo,
                            requestId,
                            statusCode,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws QanapiInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ApiLog = apply {
                    if (validated) {
                        return@apply
                    }

                    apiKey()?.validate()
                    apiKeyId()
                    configurationId()
                    createdAt()
                    domain()
                    endpoint()
                    method()
                    proxied()
                    proxiedTo()
                    requestId()
                    statusCode()
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
                    (apiKey.asKnown()?.validity() ?: 0) +
                        (if (apiKeyId.asKnown() == null) 0 else 1) +
                        (if (configurationId.asKnown() == null) 0 else 1) +
                        (if (createdAt.asKnown() == null) 0 else 1) +
                        (if (domain.asKnown() == null) 0 else 1) +
                        (if (endpoint.asKnown() == null) 0 else 1) +
                        (if (method.asKnown() == null) 0 else 1) +
                        (if (proxied.asKnown() == null) 0 else 1) +
                        (if (proxiedTo.asKnown() == null) 0 else 1) +
                        (if (requestId.asKnown() == null) 0 else 1) +
                        (if (statusCode.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ApiLog &&
                        apiKey == other.apiKey &&
                        apiKeyId == other.apiKeyId &&
                        configurationId == other.configurationId &&
                        createdAt == other.createdAt &&
                        domain == other.domain &&
                        endpoint == other.endpoint &&
                        method == other.method &&
                        proxied == other.proxied &&
                        proxiedTo == other.proxiedTo &&
                        requestId == other.requestId &&
                        statusCode == other.statusCode &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        apiKey,
                        apiKeyId,
                        configurationId,
                        createdAt,
                        domain,
                        endpoint,
                        method,
                        proxied,
                        proxiedTo,
                        requestId,
                        statusCode,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ApiLog{apiKey=$apiKey, apiKeyId=$apiKeyId, configurationId=$configurationId, createdAt=$createdAt, domain=$domain, endpoint=$endpoint, method=$method, proxied=$proxied, proxiedTo=$proxiedTo, requestId=$requestId, statusCode=$statusCode, additionalProperties=$additionalProperties}"
            }

            class QanapiFlowLog
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val action: JsonField<String>,
                private val configurationId: JsonField<Long>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val email: JsonField<String>,
                private val requestId: JsonField<String>,
                private val type: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("action")
                    @ExcludeMissing
                    action: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("configuration_id")
                    @ExcludeMissing
                    configurationId: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("request_id")
                    @ExcludeMissing
                    requestId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
                ) : this(action, configurationId, createdAt, email, requestId, type, mutableMapOf())

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun action(): String? = action.getNullable("action")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun configurationId(): Long? = configurationId.getNullable("configuration_id")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun requestId(): String? = requestId.getNullable("request_id")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun type(): String? = type.getNullable("type")

                /**
                 * Returns the raw JSON value of [action].
                 *
                 * Unlike [action], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

                /**
                 * Returns the raw JSON value of [configurationId].
                 *
                 * Unlike [configurationId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("configuration_id")
                @ExcludeMissing
                fun _configurationId(): JsonField<Long> = configurationId

                /**
                 * Returns the raw JSON value of [createdAt].
                 *
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [requestId].
                 *
                 * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("request_id")
                @ExcludeMissing
                fun _requestId(): JsonField<String> = requestId

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

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
                     * Returns a mutable builder for constructing an instance of [QanapiFlowLog].
                     */
                    fun builder() = Builder()
                }

                /** A builder for [QanapiFlowLog]. */
                class Builder internal constructor() {

                    private var action: JsonField<String> = JsonMissing.of()
                    private var configurationId: JsonField<Long> = JsonMissing.of()
                    private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var requestId: JsonField<String> = JsonMissing.of()
                    private var type: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(qanapiFlowLog: QanapiFlowLog) = apply {
                        action = qanapiFlowLog.action
                        configurationId = qanapiFlowLog.configurationId
                        createdAt = qanapiFlowLog.createdAt
                        email = qanapiFlowLog.email
                        requestId = qanapiFlowLog.requestId
                        type = qanapiFlowLog.type
                        additionalProperties = qanapiFlowLog.additionalProperties.toMutableMap()
                    }

                    fun action(action: String) = action(JsonField.of(action))

                    /**
                     * Sets [Builder.action] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.action] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun action(action: JsonField<String>) = apply { this.action = action }

                    fun configurationId(configurationId: Long?) =
                        configurationId(JsonField.ofNullable(configurationId))

                    /**
                     * Alias for [Builder.configurationId].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun configurationId(configurationId: Long) =
                        configurationId(configurationId as Long?)

                    /**
                     * Sets [Builder.configurationId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.configurationId] with a well-typed [Long]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun configurationId(configurationId: JsonField<Long>) = apply {
                        this.configurationId = configurationId
                    }

                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    fun email(email: String?) = email(JsonField.ofNullable(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

                    /**
                     * Sets [Builder.requestId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.requestId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun requestId(requestId: JsonField<String>) = apply {
                        this.requestId = requestId
                    }

                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

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
                     * Returns an immutable instance of [QanapiFlowLog].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): QanapiFlowLog =
                        QanapiFlowLog(
                            action,
                            configurationId,
                            createdAt,
                            email,
                            requestId,
                            type,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws QanapiInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): QanapiFlowLog = apply {
                    if (validated) {
                        return@apply
                    }

                    action()
                    configurationId()
                    createdAt()
                    email()
                    requestId()
                    type()
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
                    (if (action.asKnown() == null) 0 else 1) +
                        (if (configurationId.asKnown() == null) 0 else 1) +
                        (if (createdAt.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (requestId.asKnown() == null) 0 else 1) +
                        (if (type.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is QanapiFlowLog &&
                        action == other.action &&
                        configurationId == other.configurationId &&
                        createdAt == other.createdAt &&
                        email == other.email &&
                        requestId == other.requestId &&
                        type == other.type &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        action,
                        configurationId,
                        createdAt,
                        email,
                        requestId,
                        type,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "QanapiFlowLog{action=$action, configurationId=$configurationId, createdAt=$createdAt, email=$email, requestId=$requestId, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        class LogType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVITY,
                API,
                USAGE,
                /**
                 * An enum member indicating that [LogType] was instantiated with an unknown value.
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
                    ACTIVITY -> Value.ACTIVITY
                    API -> Value.API
                    USAGE -> Value.USAGE
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
                    ACTIVITY -> Known.ACTIVITY
                    API -> Known.API
                    USAGE -> Known.USAGE
                    else -> throw QanapiInvalidDataException("Unknown LogType: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
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

            return other is Data &&
                action == other.action &&
                causerEmail == other.causerEmail &&
                configuration == other.configuration &&
                description == other.description &&
                details == other.details &&
                fullLog == other.fullLog &&
                logType == other.logType &&
                requestId == other.requestId &&
                statusCode == other.statusCode &&
                timestamp == other.timestamp &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                action,
                causerEmail,
                configuration,
                description,
                details,
                fullLog,
                logType,
                requestId,
                statusCode,
                timestamp,
                user,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{action=$action, causerEmail=$causerEmail, configuration=$configuration, description=$description, details=$details, fullLog=$fullLog, logType=$logType, requestId=$requestId, statusCode=$statusCode, timestamp=$timestamp, user=$user, additionalProperties=$additionalProperties}"
    }

    class Link
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val active: JsonField<Boolean>,
        private val label: JsonField<String>,
        private val page: JsonField<Long>,
        private val url: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("active") @ExcludeMissing active: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            @JsonProperty("page") @ExcludeMissing page: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        ) : this(active, label, page, url, mutableMapOf())

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun active(): Boolean? = active.getNullable("active")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun label(): String? = label.getNullable("label")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun page(): Long? = page.getNullable("page")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun url(): String? = url.getNullable("url")

        /**
         * Returns the raw JSON value of [active].
         *
         * Unlike [active], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

        /**
         * Returns the raw JSON value of [label].
         *
         * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

        /**
         * Returns the raw JSON value of [page].
         *
         * Unlike [page], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page") @ExcludeMissing fun _page(): JsonField<Long> = page

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

            /** Returns a mutable builder for constructing an instance of [Link]. */
            fun builder() = Builder()
        }

        /** A builder for [Link]. */
        class Builder internal constructor() {

            private var active: JsonField<Boolean> = JsonMissing.of()
            private var label: JsonField<String> = JsonMissing.of()
            private var page: JsonField<Long> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(link: Link) = apply {
                active = link.active
                label = link.label
                page = link.page
                url = link.url
                additionalProperties = link.additionalProperties.toMutableMap()
            }

            fun active(active: Boolean) = active(JsonField.of(active))

            /**
             * Sets [Builder.active] to an arbitrary JSON value.
             *
             * You should usually call [Builder.active] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun active(active: JsonField<Boolean>) = apply { this.active = active }

            fun label(label: String) = label(JsonField.of(label))

            /**
             * Sets [Builder.label] to an arbitrary JSON value.
             *
             * You should usually call [Builder.label] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun label(label: JsonField<String>) = apply { this.label = label }

            fun page(page: Long?) = page(JsonField.ofNullable(page))

            /**
             * Alias for [Builder.page].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun page(page: Long) = page(page as Long?)

            /**
             * Sets [Builder.page] to an arbitrary JSON value.
             *
             * You should usually call [Builder.page] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun page(page: JsonField<Long>) = apply { this.page = page }

            fun url(url: String?) = url(JsonField.ofNullable(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

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
             * Returns an immutable instance of [Link].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Link = Link(active, label, page, url, additionalProperties.toMutableMap())
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
        fun validate(): Link = apply {
            if (validated) {
                return@apply
            }

            active()
            label()
            page()
            url()
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
            (if (active.asKnown() == null) 0 else 1) +
                (if (label.asKnown() == null) 0 else 1) +
                (if (page.asKnown() == null) 0 else 1) +
                (if (url.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Link &&
                active == other.active &&
                label == other.label &&
                page == other.page &&
                url == other.url &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(active, label, page, url, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Link{active=$active, label=$label, page=$page, url=$url, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LogUnifiedResponse &&
            currentPage == other.currentPage &&
            data == other.data &&
            firstPageUrl == other.firstPageUrl &&
            from == other.from &&
            lastPage == other.lastPage &&
            lastPageUrl == other.lastPageUrl &&
            links == other.links &&
            nextPageUrl == other.nextPageUrl &&
            path == other.path &&
            perPage == other.perPage &&
            prevPageUrl == other.prevPageUrl &&
            to == other.to &&
            total == other.total &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            currentPage,
            data,
            firstPageUrl,
            from,
            lastPage,
            lastPageUrl,
            links,
            nextPageUrl,
            path,
            perPage,
            prevPageUrl,
            to,
            total,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LogUnifiedResponse{currentPage=$currentPage, data=$data, firstPageUrl=$firstPageUrl, from=$from, lastPage=$lastPage, lastPageUrl=$lastPageUrl, links=$links, nextPageUrl=$nextPageUrl, path=$path, perPage=$perPage, prevPageUrl=$prevPageUrl, to=$to, total=$total, additionalProperties=$additionalProperties}"
}
