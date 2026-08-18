// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.classifications

import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.checkKnown
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import cloud.qanapi.models.v3.GoogleGroup
import cloud.qanapi.models.v3.Role
import cloud.qanapi.models.v3.User
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

class ClassificationListResponse
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

        /**
         * Returns a mutable builder for constructing an instance of [ClassificationListResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [ClassificationListResponse]. */
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

        internal fun from(classificationListResponse: ClassificationListResponse) = apply {
            currentPage = classificationListResponse.currentPage
            data = classificationListResponse.data.map { it.toMutableList() }
            firstPageUrl = classificationListResponse.firstPageUrl
            from = classificationListResponse.from
            lastPage = classificationListResponse.lastPage
            lastPageUrl = classificationListResponse.lastPageUrl
            links = classificationListResponse.links.map { it.toMutableList() }
            nextPageUrl = classificationListResponse.nextPageUrl
            path = classificationListResponse.path
            perPage = classificationListResponse.perPage
            prevPageUrl = classificationListResponse.prevPageUrl
            to = classificationListResponse.to
            total = classificationListResponse.total
            additionalProperties = classificationListResponse.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [ClassificationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ClassificationListResponse =
            ClassificationListResponse(
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
    fun validate(): ClassificationListResponse = apply {
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
        private val id: JsonField<Long>,
        private val bgColor: JsonField<String>,
        private val fgColor: JsonField<String>,
        private val name: JsonField<String>,
        private val slug: JsonField<String>,
        private val description: JsonField<String>,
        private val emoji: JsonField<String>,
        private val providers: JsonField<List<Provider>>,
        private val roles: JsonField<List<Role>>,
        private val users: JsonField<List<User>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("bg_color") @ExcludeMissing bgColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fg_color") @ExcludeMissing fgColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emoji") @ExcludeMissing emoji: JsonField<String> = JsonMissing.of(),
            @JsonProperty("providers")
            @ExcludeMissing
            providers: JsonField<List<Provider>> = JsonMissing.of(),
            @JsonProperty("roles") @ExcludeMissing roles: JsonField<List<Role>> = JsonMissing.of(),
            @JsonProperty("users") @ExcludeMissing users: JsonField<List<User>> = JsonMissing.of(),
        ) : this(
            id,
            bgColor,
            fgColor,
            name,
            slug,
            description,
            emoji,
            providers,
            roles,
            users,
            mutableMapOf(),
        )

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): Long = id.getRequired("id")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bgColor(): String = bgColor.getRequired("bg_color")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fgColor(): String = fgColor.getRequired("fg_color")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun slug(): String = slug.getRequired("slug")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emoji(): String? = emoji.getNullable("emoji")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providers(): List<Provider>? = providers.getNullable("providers")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun roles(): List<Role>? = roles.getNullable("roles")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun users(): List<User>? = users.getNullable("users")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

        /**
         * Returns the raw JSON value of [bgColor].
         *
         * Unlike [bgColor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bg_color") @ExcludeMissing fun _bgColor(): JsonField<String> = bgColor

        /**
         * Returns the raw JSON value of [fgColor].
         *
         * Unlike [fgColor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fg_color") @ExcludeMissing fun _fgColor(): JsonField<String> = fgColor

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [slug].
         *
         * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [emoji].
         *
         * Unlike [emoji], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("emoji") @ExcludeMissing fun _emoji(): JsonField<String> = emoji

        /**
         * Returns the raw JSON value of [providers].
         *
         * Unlike [providers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("providers")
        @ExcludeMissing
        fun _providers(): JsonField<List<Provider>> = providers

        /**
         * Returns the raw JSON value of [roles].
         *
         * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<Role>> = roles

        /**
         * Returns the raw JSON value of [users].
         *
         * Unlike [users], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("users") @ExcludeMissing fun _users(): JsonField<List<User>> = users

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .bgColor()
             * .fgColor()
             * .name()
             * .slug()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<Long>? = null
            private var bgColor: JsonField<String>? = null
            private var fgColor: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var slug: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var emoji: JsonField<String> = JsonMissing.of()
            private var providers: JsonField<MutableList<Provider>>? = null
            private var roles: JsonField<MutableList<Role>>? = null
            private var users: JsonField<MutableList<User>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                bgColor = data.bgColor
                fgColor = data.fgColor
                name = data.name
                slug = data.slug
                description = data.description
                emoji = data.emoji
                providers = data.providers.map { it.toMutableList() }
                roles = data.roles.map { it.toMutableList() }
                users = data.users.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: Long) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<Long>) = apply { this.id = id }

            fun bgColor(bgColor: String) = bgColor(JsonField.of(bgColor))

            /**
             * Sets [Builder.bgColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bgColor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bgColor(bgColor: JsonField<String>) = apply { this.bgColor = bgColor }

            fun fgColor(fgColor: String) = fgColor(JsonField.of(fgColor))

            /**
             * Sets [Builder.fgColor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fgColor] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fgColor(fgColor: JsonField<String>) = apply { this.fgColor = fgColor }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun slug(slug: String) = slug(JsonField.of(slug))

            /**
             * Sets [Builder.slug] to an arbitrary JSON value.
             *
             * You should usually call [Builder.slug] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun slug(slug: JsonField<String>) = apply { this.slug = slug }

            fun description(description: String?) = description(JsonField.ofNullable(description))

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

            fun emoji(emoji: String?) = emoji(JsonField.ofNullable(emoji))

            /**
             * Sets [Builder.emoji] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emoji] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emoji(emoji: JsonField<String>) = apply { this.emoji = emoji }

            fun providers(providers: List<Provider>) = providers(JsonField.of(providers))

            /**
             * Sets [Builder.providers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providers] with a well-typed `List<Provider>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providers(providers: JsonField<List<Provider>>) = apply {
                this.providers = providers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Provider] to [providers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProvider(provider: Provider) = apply {
                providers =
                    (providers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("providers", it).add(provider)
                    }
            }

            fun roles(roles: List<Role>) = roles(JsonField.of(roles))

            /**
             * Sets [Builder.roles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roles] with a well-typed `List<Role>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun users(users: List<User>) = users(JsonField.of(users))

            /**
             * Sets [Builder.users] to an arbitrary JSON value.
             *
             * You should usually call [Builder.users] with a well-typed `List<User>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun users(users: JsonField<List<User>>) = apply {
                this.users = users.map { it.toMutableList() }
            }

            /**
             * Adds a single [User] to [users].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUser(user: User) = apply {
                users =
                    (users ?: JsonField.of(mutableListOf())).also {
                        checkKnown("users", it).add(user)
                    }
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
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .bgColor()
             * .fgColor()
             * .name()
             * .slug()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("bgColor", bgColor),
                    checkRequired("fgColor", fgColor),
                    checkRequired("name", name),
                    checkRequired("slug", slug),
                    description,
                    emoji,
                    (providers ?: JsonMissing.of()).map { it.toImmutable() },
                    (roles ?: JsonMissing.of()).map { it.toImmutable() },
                    (users ?: JsonMissing.of()).map { it.toImmutable() },
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

            id()
            bgColor()
            fgColor()
            name()
            slug()
            description()
            emoji()
            providers()?.forEach { it.validate() }
            roles()?.forEach { it.validate() }
            users()?.forEach { it.validate() }
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
                (if (bgColor.asKnown() == null) 0 else 1) +
                (if (fgColor.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (slug.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (emoji.asKnown() == null) 0 else 1) +
                (providers.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (roles.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (users.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class Provider
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val gwsGroups: JsonField<List<GoogleGroup>>,
            private val name: JsonField<String>,
            private val uuid: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("gws_groups")
                @ExcludeMissing
                gwsGroups: JsonField<List<GoogleGroup>> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
            ) : this(gwsGroups, name, uuid, mutableMapOf())

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun gwsGroups(): List<GoogleGroup>? = gwsGroups.getNullable("gws_groups")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun uuid(): String? = uuid.getNullable("uuid")

            /**
             * Returns the raw JSON value of [gwsGroups].
             *
             * Unlike [gwsGroups], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gws_groups")
            @ExcludeMissing
            fun _gwsGroups(): JsonField<List<GoogleGroup>> = gwsGroups

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [uuid].
             *
             * Unlike [uuid], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("uuid") @ExcludeMissing fun _uuid(): JsonField<String> = uuid

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

                /** Returns a mutable builder for constructing an instance of [Provider]. */
                fun builder() = Builder()
            }

            /** A builder for [Provider]. */
            class Builder internal constructor() {

                private var gwsGroups: JsonField<MutableList<GoogleGroup>>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var uuid: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(provider: Provider) = apply {
                    gwsGroups = provider.gwsGroups.map { it.toMutableList() }
                    name = provider.name
                    uuid = provider.uuid
                    additionalProperties = provider.additionalProperties.toMutableMap()
                }

                fun gwsGroups(gwsGroups: List<GoogleGroup>) = gwsGroups(JsonField.of(gwsGroups))

                /**
                 * Sets [Builder.gwsGroups] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gwsGroups] with a well-typed `List<GoogleGroup>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun gwsGroups(gwsGroups: JsonField<List<GoogleGroup>>) = apply {
                    this.gwsGroups = gwsGroups.map { it.toMutableList() }
                }

                /**
                 * Adds a single [GoogleGroup] to [gwsGroups].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addGwsGroup(gwsGroup: GoogleGroup) = apply {
                    gwsGroups =
                        (gwsGroups ?: JsonField.of(mutableListOf())).also {
                            checkKnown("gwsGroups", it).add(gwsGroup)
                        }
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun uuid(uuid: String) = uuid(JsonField.of(uuid))

                /**
                 * Sets [Builder.uuid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.uuid] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

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
                 * Returns an immutable instance of [Provider].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Provider =
                    Provider(
                        (gwsGroups ?: JsonMissing.of()).map { it.toImmutable() },
                        name,
                        uuid,
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
            fun validate(): Provider = apply {
                if (validated) {
                    return@apply
                }

                gwsGroups()?.forEach { it.validate() }
                name()
                uuid()
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
                (gwsGroups.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (uuid.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Provider &&
                    gwsGroups == other.gwsGroups &&
                    name == other.name &&
                    uuid == other.uuid &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(gwsGroups, name, uuid, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Provider{gwsGroups=$gwsGroups, name=$name, uuid=$uuid, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                bgColor == other.bgColor &&
                fgColor == other.fgColor &&
                name == other.name &&
                slug == other.slug &&
                description == other.description &&
                emoji == other.emoji &&
                providers == other.providers &&
                roles == other.roles &&
                users == other.users &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                bgColor,
                fgColor,
                name,
                slug,
                description,
                emoji,
                providers,
                roles,
                users,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, bgColor=$bgColor, fgColor=$fgColor, name=$name, slug=$slug, description=$description, emoji=$emoji, providers=$providers, roles=$roles, users=$users, additionalProperties=$additionalProperties}"
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

        return other is ClassificationListResponse &&
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
        "ClassificationListResponse{currentPage=$currentPage, data=$data, firstPageUrl=$firstPageUrl, from=$from, lastPage=$lastPage, lastPageUrl=$lastPageUrl, links=$links, nextPageUrl=$nextPageUrl, path=$path, perPage=$perPage, prevPageUrl=$prevPageUrl, to=$to, total=$total, additionalProperties=$additionalProperties}"
}
