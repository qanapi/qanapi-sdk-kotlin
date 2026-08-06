// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.Enum
import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.checkKnown
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LogApiResponse
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

        /** Returns a mutable builder for constructing an instance of [LogApiResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [LogApiResponse]. */
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

        internal fun from(logApiResponse: LogApiResponse) = apply {
            currentPage = logApiResponse.currentPage
            data = logApiResponse.data.map { it.toMutableList() }
            firstPageUrl = logApiResponse.firstPageUrl
            from = logApiResponse.from
            lastPage = logApiResponse.lastPage
            lastPageUrl = logApiResponse.lastPageUrl
            links = logApiResponse.links.map { it.toMutableList() }
            nextPageUrl = logApiResponse.nextPageUrl
            path = logApiResponse.path
            perPage = logApiResponse.perPage
            prevPageUrl = logApiResponse.prevPageUrl
            to = logApiResponse.to
            total = logApiResponse.total
            additionalProperties = logApiResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [LogApiResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogApiResponse =
            LogApiResponse(
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
    fun validate(): LogApiResponse = apply {
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
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<ApiKey> = JsonMissing.of(),
            @JsonProperty("api_key_id")
            @ExcludeMissing
            apiKeyId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("configuration_id")
            @ExcludeMissing
            configurationId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("domain") @ExcludeMissing domain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endpoint")
            @ExcludeMissing
            endpoint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proxied") @ExcludeMissing proxied: JsonField<Boolean> = JsonMissing.of(),
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
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKey(): ApiKey? = apiKey.getNullable("api_key")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun apiKeyId(): Long? = apiKeyId.getNullable("api_key_id")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun configurationId(): Long? = configurationId.getNullable("configuration_id")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun domain(): String? = domain.getNullable("domain")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endpoint(): String? = endpoint.getNullable("endpoint")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun method(): String? = method.getNullable("method")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun proxied(): Boolean? = proxied.getNullable("proxied")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun proxiedTo(): String? = proxiedTo.getNullable("proxied_to")

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
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

        /**
         * Returns the raw JSON value of [apiKeyId].
         *
         * Unlike [apiKeyId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key_id") @ExcludeMissing fun _apiKeyId(): JsonField<Long> = apiKeyId

        /**
         * Returns the raw JSON value of [configurationId].
         *
         * Unlike [configurationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration_id")
        @ExcludeMissing
        fun _configurationId(): JsonField<Long> = configurationId

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [domain].
         *
         * Unlike [domain], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("domain") @ExcludeMissing fun _domain(): JsonField<String> = domain

        /**
         * Returns the raw JSON value of [endpoint].
         *
         * Unlike [endpoint], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endpoint") @ExcludeMissing fun _endpoint(): JsonField<String> = endpoint

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<String> = method

        /**
         * Returns the raw JSON value of [proxied].
         *
         * Unlike [proxied], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proxied") @ExcludeMissing fun _proxied(): JsonField<Boolean> = proxied

        /**
         * Returns the raw JSON value of [proxiedTo].
         *
         * Unlike [proxiedTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("proxied_to") @ExcludeMissing fun _proxiedTo(): JsonField<String> = proxiedTo

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

            internal fun from(data: Data) = apply {
                apiKey = data.apiKey
                apiKeyId = data.apiKeyId
                configurationId = data.configurationId
                createdAt = data.createdAt
                domain = data.domain
                endpoint = data.endpoint
                method = data.method
                proxied = data.proxied
                proxiedTo = data.proxiedTo
                requestId = data.requestId
                statusCode = data.statusCode
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun apiKey(apiKey: ApiKey) = apiKey(JsonField.of(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [ApiKey] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            fun apiKeyId(apiKeyId: Long) = apiKeyId(JsonField.of(apiKeyId))

            /**
             * Sets [Builder.apiKeyId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKeyId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKeyId(apiKeyId: JsonField<Long>) = apply { this.apiKeyId = apiKeyId }

            fun configurationId(configurationId: Long?) =
                configurationId(JsonField.ofNullable(configurationId))

            /**
             * Alias for [Builder.configurationId].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun configurationId(configurationId: Long) = configurationId(configurationId as Long?)

            /**
             * Sets [Builder.configurationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configurationId] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun configurationId(configurationId: JsonField<Long>) = apply {
                this.configurationId = configurationId
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun domain(domain: String) = domain(JsonField.of(domain))

            /**
             * Sets [Builder.domain] to an arbitrary JSON value.
             *
             * You should usually call [Builder.domain] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun domain(domain: JsonField<String>) = apply { this.domain = domain }

            fun endpoint(endpoint: String) = endpoint(JsonField.of(endpoint))

            /**
             * Sets [Builder.endpoint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endpoint] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endpoint(endpoint: JsonField<String>) = apply { this.endpoint = endpoint }

            fun method(method: String) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<String>) = apply { this.method = method }

            fun proxied(proxied: Boolean) = proxied(JsonField.of(proxied))

            /**
             * Sets [Builder.proxied] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proxied] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proxied(proxied: JsonField<Boolean>) = apply { this.proxied = proxied }

            fun proxiedTo(proxiedTo: String?) = proxiedTo(JsonField.ofNullable(proxiedTo))

            /**
             * Sets [Builder.proxiedTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proxiedTo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun proxiedTo(proxiedTo: JsonField<String>) = apply { this.proxiedTo = proxiedTo }

            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            fun statusCode(statusCode: Long) = statusCode(JsonField.of(statusCode))

            /**
             * Sets [Builder.statusCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statusCode] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statusCode(statusCode: JsonField<Long>) = apply { this.statusCode = statusCode }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws QanapiInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Data = apply {
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

        class ApiKey
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val prefix: JsonField<String>,
            private val status: JsonField<Status>,
            private val configurations: JsonField<List<Configuration>>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val permissions: JsonField<List<Permission>>,
            private val revokedAt: JsonField<OffsetDateTime>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val user: JsonField<User>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("prefix")
                @ExcludeMissing
                prefix: JsonField<String> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                status: JsonField<Status> = JsonMissing.of(),
                @JsonProperty("configurations")
                @ExcludeMissing
                configurations: JsonField<List<Configuration>> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("permissions")
                @ExcludeMissing
                permissions: JsonField<List<Permission>> = JsonMissing.of(),
                @JsonProperty("revoked_at")
                @ExcludeMissing
                revokedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("updated_at")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
            ) : this(
                id,
                prefix,
                status,
                configurations,
                createdAt,
                permissions,
                revokedAt,
                updatedAt,
                user,
                mutableMapOf(),
            )

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun prefix(): String = prefix.getRequired("prefix")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun status(): Status = status.getRequired("status")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun configurations(): List<Configuration>? =
                configurations.getNullable("configurations")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun permissions(): List<Permission>? = permissions.getNullable("permissions")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun revokedAt(): OffsetDateTime? = revokedAt.getNullable("revoked_at")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun user(): User? = user.getNullable("user")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [prefix].
             *
             * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

            /**
             * Returns the raw JSON value of [status].
             *
             * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * Returns the raw JSON value of [configurations].
             *
             * Unlike [configurations], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("configurations")
            @ExcludeMissing
            fun _configurations(): JsonField<List<Configuration>> = configurations

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
             * Returns the raw JSON value of [permissions].
             *
             * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("permissions")
            @ExcludeMissing
            fun _permissions(): JsonField<List<Permission>> = permissions

            /**
             * Returns the raw JSON value of [revokedAt].
             *
             * Unlike [revokedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("revoked_at")
            @ExcludeMissing
            fun _revokedAt(): JsonField<OffsetDateTime> = revokedAt

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updated_at")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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

                /**
                 * Returns a mutable builder for constructing an instance of [ApiKey].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .prefix()
                 * .status()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ApiKey]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var prefix: JsonField<String>? = null
                private var status: JsonField<Status>? = null
                private var configurations: JsonField<MutableList<Configuration>>? = null
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var permissions: JsonField<MutableList<Permission>>? = null
                private var revokedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var user: JsonField<User> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(apiKey: ApiKey) = apply {
                    id = apiKey.id
                    prefix = apiKey.prefix
                    status = apiKey.status
                    configurations = apiKey.configurations.map { it.toMutableList() }
                    createdAt = apiKey.createdAt
                    permissions = apiKey.permissions.map { it.toMutableList() }
                    revokedAt = apiKey.revokedAt
                    updatedAt = apiKey.updatedAt
                    user = apiKey.user
                    additionalProperties = apiKey.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun prefix(prefix: String) = prefix(JsonField.of(prefix))

                /**
                 * Sets [Builder.prefix] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.prefix] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * Sets [Builder.status] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.status] with a well-typed [Status] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun configurations(configurations: List<Configuration>) =
                    configurations(JsonField.of(configurations))

                /**
                 * Sets [Builder.configurations] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.configurations] with a well-typed
                 * `List<Configuration>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun configurations(configurations: JsonField<List<Configuration>>) = apply {
                    this.configurations = configurations.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Configuration] to [configurations].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addConfiguration(configuration: Configuration) = apply {
                    configurations =
                        (configurations ?: JsonField.of(mutableListOf())).also {
                            checkKnown("configurations", it).add(configuration)
                        }
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun permissions(permissions: List<Permission>) =
                    permissions(JsonField.of(permissions))

                /**
                 * Sets [Builder.permissions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.permissions] with a well-typed
                 * `List<Permission>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun permissions(permissions: JsonField<List<Permission>>) = apply {
                    this.permissions = permissions.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Permission] to [permissions].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPermission(permission: Permission) = apply {
                    permissions =
                        (permissions ?: JsonField.of(mutableListOf())).also {
                            checkKnown("permissions", it).add(permission)
                        }
                }

                fun revokedAt(revokedAt: OffsetDateTime?) =
                    revokedAt(JsonField.ofNullable(revokedAt))

                /**
                 * Sets [Builder.revokedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.revokedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun revokedAt(revokedAt: JsonField<OffsetDateTime>) = apply {
                    this.revokedAt = revokedAt
                }

                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun user(user: User) = user(JsonField.of(user))

                /**
                 * Sets [Builder.user] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.user] with a well-typed [User] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun user(user: JsonField<User>) = apply { this.user = user }

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
                 * Returns an immutable instance of [ApiKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .prefix()
                 * .status()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApiKey =
                    ApiKey(
                        checkRequired("id", id),
                        checkRequired("prefix", prefix),
                        checkRequired("status", status),
                        (configurations ?: JsonMissing.of()).map { it.toImmutable() },
                        createdAt,
                        (permissions ?: JsonMissing.of()).map { it.toImmutable() },
                        revokedAt,
                        updatedAt,
                        user,
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
             * @throws QanapiInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ApiKey = apply {
                if (validated) {
                    return@apply
                }

                id()
                prefix()
                status().validate()
                configurations()?.forEach { it.validate() }
                createdAt()
                permissions()?.forEach { it.validate() }
                revokedAt()
                updatedAt()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (if (prefix.asKnown() == null) 0 else 1) +
                    (status.asKnown()?.validity() ?: 0) +
                    (configurations.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (permissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (revokedAt.asKnown() == null) 0 else 1) +
                    (if (updatedAt.asKnown() == null) 0 else 1) +
                    (user.asKnown()?.validity() ?: 0)

            class Status @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACTIVE = of("active")

                    val REVOKED = of("revoked")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                /** An enum containing [Status]'s known values. */
                enum class Known {
                    ACTIVE,
                    REVOKED,
                }

                /**
                 * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Status] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACTIVE,
                    REVOKED,
                    /**
                     * An enum member indicating that [Status] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACTIVE -> Value.ACTIVE
                        REVOKED -> Value.REVOKED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws QanapiInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACTIVE -> Known.ACTIVE
                        REVOKED -> Known.REVOKED
                        else -> throw QanapiInvalidDataException("Unknown Status: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws QanapiInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
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
                 * @throws QanapiInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Status = apply {
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

                    return other is Status && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Configuration
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val type: JsonField<String>,
                private val values: JsonField<List<Value>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<Value>> = JsonMissing.of(),
                ) : this(id, name, type, values, mutableMapOf())

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun type(): String = type.getRequired("type")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun values(): List<Value>? = values.getNullable("values")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<Value>> = values

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
                     * Returns a mutable builder for constructing an instance of [Configuration].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .name()
                     * .type()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Configuration]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var type: JsonField<String>? = null
                    private var values: JsonField<MutableList<Value>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(configuration: Configuration) = apply {
                        id = configuration.id
                        name = configuration.name
                        type = configuration.type
                        values = configuration.values.map { it.toMutableList() }
                        additionalProperties = configuration.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun type(type: String) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<String>) = apply { this.type = type }

                    fun values(values: List<Value>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<Value>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<Value>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Value] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: Value) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
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
                     * Returns an immutable instance of [Configuration].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .name()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Configuration =
                        Configuration(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            checkRequired("type", type),
                            (values ?: JsonMissing.of()).map { it.toImmutable() },
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
                fun validate(): Configuration = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    type()
                    values()?.forEach { it.validate() }
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
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (type.asKnown() == null) 0 else 1) +
                        (values.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class Value
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val key: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("key")
                        @ExcludeMissing
                        key: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of(),
                    ) : this(key, value, mutableMapOf())

                    /**
                     * @throws QanapiInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun key(): String = key.getRequired("key")

                    /**
                     * @throws QanapiInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun value(): String = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [key].
                     *
                     * Unlike [key], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [Value].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .key()
                         * .value()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Value]. */
                    class Builder internal constructor() {

                        private var key: JsonField<String>? = null
                        private var value: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(value: Value) = apply {
                            key = value.key
                            this.value = value.value
                            additionalProperties = value.additionalProperties.toMutableMap()
                        }

                        fun key(key: String) = key(JsonField.of(key))

                        /**
                         * Sets [Builder.key] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.key] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Value].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .key()
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Value =
                            Value(
                                checkRequired("key", key),
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws QanapiInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Value = apply {
                        if (validated) {
                            return@apply
                        }

                        key()
                        value()
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
                        (if (key.asKnown() == null) 0 else 1) +
                            (if (value.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Value &&
                            key == other.key &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(key, value, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Value{key=$key, value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Configuration &&
                        id == other.id &&
                        name == other.name &&
                        type == other.type &&
                        values == other.values &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, name, type, values, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Configuration{id=$id, name=$name, type=$type, values=$values, additionalProperties=$additionalProperties}"
            }

            class Permission
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
                ) : this(name, mutableMapOf())

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                     * Returns a mutable builder for constructing an instance of [Permission].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Permission]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(permission: Permission) = apply {
                        name = permission.name
                        additionalProperties = permission.additionalProperties.toMutableMap()
                    }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                     * Returns an immutable instance of [Permission].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Permission =
                        Permission(checkRequired("name", name), additionalProperties.toMutableMap())
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
                fun validate(): Permission = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
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
                internal fun validity(): Int = (if (name.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Permission &&
                        name == other.name &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Permission{name=$name, additionalProperties=$additionalProperties}"
            }

            class User
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<Long>,
                private val email: JsonField<String>,
                private val name: JsonField<String>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val roles: JsonField<List<Role>>,
                private val twoFactorEnabled: JsonField<Boolean>,
                private val updatedAt: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("roles")
                    @ExcludeMissing
                    roles: JsonField<List<Role>> = JsonMissing.of(),
                    @JsonProperty("two_factor_enabled")
                    @ExcludeMissing
                    twoFactorEnabled: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("updated_at")
                    @ExcludeMissing
                    updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(
                    id,
                    email,
                    name,
                    createdAt,
                    roles,
                    twoFactorEnabled,
                    updatedAt,
                    mutableMapOf(),
                )

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): Long = id.getRequired("id")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun email(): String = email.getRequired("email")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun createdAt(): OffsetDateTime? = createdAt.getNullable("created_at")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun roles(): List<Role>? = roles.getNullable("roles")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun twoFactorEnabled(): Boolean? =
                    twoFactorEnabled.getNullable("two_factor_enabled")

                /**
                 * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updated_at")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns the raw JSON value of [roles].
                 *
                 * Unlike [roles], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<Role>> = roles

                /**
                 * Returns the raw JSON value of [twoFactorEnabled].
                 *
                 * Unlike [twoFactorEnabled], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("two_factor_enabled")
                @ExcludeMissing
                fun _twoFactorEnabled(): JsonField<Boolean> = twoFactorEnabled

                /**
                 * Returns the raw JSON value of [updatedAt].
                 *
                 * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("updated_at")
                @ExcludeMissing
                fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                     * Returns a mutable builder for constructing an instance of [User].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .email()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [User]. */
                class Builder internal constructor() {

                    private var id: JsonField<Long>? = null
                    private var email: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var roles: JsonField<MutableList<Role>>? = null
                    private var twoFactorEnabled: JsonField<Boolean> = JsonMissing.of()
                    private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(user: User) = apply {
                        id = user.id
                        email = user.email
                        name = user.name
                        createdAt = user.createdAt
                        roles = user.roles.map { it.toMutableList() }
                        twoFactorEnabled = user.twoFactorEnabled
                        updatedAt = user.updatedAt
                        additionalProperties = user.additionalProperties.toMutableMap()
                    }

                    fun id(id: Long) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [Long] value instead.
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun id(id: JsonField<Long>) = apply { this.id = id }

                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun roles(roles: List<Role>) = roles(JsonField.of(roles))

                    /**
                     * Sets [Builder.roles] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roles] with a well-typed `List<Role>` value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun roles(roles: JsonField<List<Role>>) = apply {
                        this.roles = roles.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Role] to [roles].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addRole(role: Role) = apply {
                        roles =
                            (roles ?: JsonField.of(mutableListOf())).also {
                                checkKnown("roles", it).add(role)
                            }
                    }

                    fun twoFactorEnabled(twoFactorEnabled: Boolean) =
                        twoFactorEnabled(JsonField.of(twoFactorEnabled))

                    /**
                     * Sets [Builder.twoFactorEnabled] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.twoFactorEnabled] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun twoFactorEnabled(twoFactorEnabled: JsonField<Boolean>) = apply {
                        this.twoFactorEnabled = twoFactorEnabled
                    }

                    fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                    /**
                     * Sets [Builder.updatedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.updatedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                        this.updatedAt = updatedAt
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
                     * Returns an immutable instance of [User].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .email()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): User =
                        User(
                            checkRequired("id", id),
                            checkRequired("email", email),
                            checkRequired("name", name),
                            createdAt,
                            (roles ?: JsonMissing.of()).map { it.toImmutable() },
                            twoFactorEnabled,
                            updatedAt,
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
                fun validate(): User = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    email()
                    name()
                    createdAt()
                    roles()?.forEach { it.validate() }
                    twoFactorEnabled()
                    updatedAt()
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
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (createdAt.asKnown() == null) 0 else 1) +
                        (roles.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (if (twoFactorEnabled.asKnown() == null) 0 else 1) +
                        (if (updatedAt.asKnown() == null) 0 else 1)

                class Role
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val name: JsonField<String>,
                    private val description: JsonField<String>,
                    private val permissions: JsonField<List<Permission>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("description")
                        @ExcludeMissing
                        description: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("permissions")
                        @ExcludeMissing
                        permissions: JsonField<List<Permission>> = JsonMissing.of(),
                    ) : this(name, description, permissions, mutableMapOf())

                    /**
                     * @throws QanapiInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * @throws QanapiInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun description(): String? = description.getNullable("description")

                    /**
                     * @throws QanapiInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun permissions(): List<Permission>? = permissions.getNullable("permissions")

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                     * Returns the raw JSON value of [permissions].
                     *
                     * Unlike [permissions], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("permissions")
                    @ExcludeMissing
                    fun _permissions(): JsonField<List<Permission>> = permissions

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
                         * Returns a mutable builder for constructing an instance of [Role].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .name()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Role]. */
                    class Builder internal constructor() {

                        private var name: JsonField<String>? = null
                        private var description: JsonField<String> = JsonMissing.of()
                        private var permissions: JsonField<MutableList<Permission>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(role: Role) = apply {
                            name = role.name
                            description = role.description
                            permissions = role.permissions.map { it.toMutableList() }
                            additionalProperties = role.additionalProperties.toMutableMap()
                        }

                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        fun description(description: String?) =
                            description(JsonField.ofNullable(description))

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

                        fun permissions(permissions: List<Permission>) =
                            permissions(JsonField.of(permissions))

                        /**
                         * Sets [Builder.permissions] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.permissions] with a well-typed
                         * `List<Permission>` value instead. This method is primarily for setting
                         * the field to an undocumented or not yet supported value.
                         */
                        fun permissions(permissions: JsonField<List<Permission>>) = apply {
                            this.permissions = permissions.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Permission] to [permissions].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addPermission(permission: Permission) = apply {
                            permissions =
                                (permissions ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("permissions", it).add(permission)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Role].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Role =
                            Role(
                                checkRequired("name", name),
                                description,
                                (permissions ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws QanapiInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Role = apply {
                        if (validated) {
                            return@apply
                        }

                        name()
                        description()
                        permissions()?.forEach { it.validate() }
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
                        (if (name.asKnown() == null) 0 else 1) +
                            (if (description.asKnown() == null) 0 else 1) +
                            (permissions.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                    class Permission
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val name: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("name")
                            @ExcludeMissing
                            name: JsonField<String> = JsonMissing.of()
                        ) : this(name, mutableMapOf())

                        /**
                         * @throws QanapiInvalidDataException if the JSON field has an unexpected
                         *   type or is unexpectedly missing or null (e.g. if the server responded
                         *   with an unexpected value).
                         */
                        fun name(): String = name.getRequired("name")

                        /**
                         * Returns the raw JSON value of [name].
                         *
                         * Unlike [name], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                             * Returns a mutable builder for constructing an instance of
                             * [Permission].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .name()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Permission]. */
                        class Builder internal constructor() {

                            private var name: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(permission: Permission) = apply {
                                name = permission.name
                                additionalProperties =
                                    permission.additionalProperties.toMutableMap()
                            }

                            fun name(name: String) = name(JsonField.of(name))

                            /**
                             * Sets [Builder.name] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.name] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun name(name: JsonField<String>) = apply { this.name = name }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Permission].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .name()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Permission =
                                Permission(
                                    checkRequired("name", name),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws QanapiInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Permission = apply {
                            if (validated) {
                                return@apply
                            }

                            name()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int = (if (name.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Permission &&
                                name == other.name &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(name, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Permission{name=$name, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Role &&
                            name == other.name &&
                            description == other.description &&
                            permissions == other.permissions &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(name, description, permissions, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Role{name=$name, description=$description, permissions=$permissions, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is User &&
                        id == other.id &&
                        email == other.email &&
                        name == other.name &&
                        createdAt == other.createdAt &&
                        roles == other.roles &&
                        twoFactorEnabled == other.twoFactorEnabled &&
                        updatedAt == other.updatedAt &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        email,
                        name,
                        createdAt,
                        roles,
                        twoFactorEnabled,
                        updatedAt,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "User{id=$id, email=$email, name=$name, createdAt=$createdAt, roles=$roles, twoFactorEnabled=$twoFactorEnabled, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApiKey &&
                    id == other.id &&
                    prefix == other.prefix &&
                    status == other.status &&
                    configurations == other.configurations &&
                    createdAt == other.createdAt &&
                    permissions == other.permissions &&
                    revokedAt == other.revokedAt &&
                    updatedAt == other.updatedAt &&
                    user == other.user &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    prefix,
                    status,
                    configurations,
                    createdAt,
                    permissions,
                    revokedAt,
                    updatedAt,
                    user,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApiKey{id=$id, prefix=$prefix, status=$status, configurations=$configurations, createdAt=$createdAt, permissions=$permissions, revokedAt=$revokedAt, updatedAt=$updatedAt, user=$user, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
            "Data{apiKey=$apiKey, apiKeyId=$apiKeyId, configurationId=$configurationId, createdAt=$createdAt, domain=$domain, endpoint=$endpoint, method=$method, proxied=$proxied, proxiedTo=$proxiedTo, requestId=$requestId, statusCode=$statusCode, additionalProperties=$additionalProperties}"
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

        return other is LogApiResponse &&
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
        "LogApiResponse{currentPage=$currentPage, data=$data, firstPageUrl=$firstPageUrl, from=$from, lastPage=$lastPage, lastPageUrl=$lastPageUrl, links=$links, nextPageUrl=$nextPageUrl, path=$path, perPage=$perPage, prevPageUrl=$prevPageUrl, to=$to, total=$total, additionalProperties=$additionalProperties}"
}
