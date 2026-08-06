// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.logs

import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.checkKnown
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class LogQanapiFlowResponse
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

        /** Returns a mutable builder for constructing an instance of [LogQanapiFlowResponse]. */
        fun builder() = Builder()
    }

    /** A builder for [LogQanapiFlowResponse]. */
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

        internal fun from(logQanapiFlowResponse: LogQanapiFlowResponse) = apply {
            currentPage = logQanapiFlowResponse.currentPage
            data = logQanapiFlowResponse.data.map { it.toMutableList() }
            firstPageUrl = logQanapiFlowResponse.firstPageUrl
            from = logQanapiFlowResponse.from
            lastPage = logQanapiFlowResponse.lastPage
            lastPageUrl = logQanapiFlowResponse.lastPageUrl
            links = logQanapiFlowResponse.links.map { it.toMutableList() }
            nextPageUrl = logQanapiFlowResponse.nextPageUrl
            path = logQanapiFlowResponse.path
            perPage = logQanapiFlowResponse.perPage
            prevPageUrl = logQanapiFlowResponse.prevPageUrl
            to = logQanapiFlowResponse.to
            total = logQanapiFlowResponse.total
            additionalProperties = logQanapiFlowResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [LogQanapiFlowResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LogQanapiFlowResponse =
            LogQanapiFlowResponse(
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
    fun validate(): LogQanapiFlowResponse = apply {
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
        private val configurationId: JsonField<Long>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val email: JsonField<String>,
        private val requestId: JsonField<String>,
        private val type: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("action") @ExcludeMissing action: JsonField<String> = JsonMissing.of(),
            @JsonProperty("configuration_id")
            @ExcludeMissing
            configurationId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("request_id")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        ) : this(action, configurationId, createdAt, email, requestId, type, mutableMapOf())

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun action(): String? = action.getNullable("action")

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
        fun email(): String? = email.getNullable("email")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun requestId(): String? = requestId.getNullable("request_id")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): String? = type.getNullable("type")

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

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
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var action: JsonField<String> = JsonMissing.of()
            private var configurationId: JsonField<Long> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var requestId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                action = data.action
                configurationId = data.configurationId
                createdAt = data.createdAt
                email = data.email
                requestId = data.requestId
                type = data.type
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

            fun email(email: String?) = email(JsonField.ofNullable(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun requestId(requestId: String?) = requestId(JsonField.ofNullable(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

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

            return other is Data &&
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
            "Data{action=$action, configurationId=$configurationId, createdAt=$createdAt, email=$email, requestId=$requestId, type=$type, additionalProperties=$additionalProperties}"
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

        return other is LogQanapiFlowResponse &&
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
        "LogQanapiFlowResponse{currentPage=$currentPage, data=$data, firstPageUrl=$firstPageUrl, from=$from, lastPage=$lastPage, lastPageUrl=$lastPageUrl, links=$links, nextPageUrl=$nextPageUrl, path=$path, perPage=$perPage, prevPageUrl=$prevPageUrl, to=$to, total=$total, additionalProperties=$additionalProperties}"
}
