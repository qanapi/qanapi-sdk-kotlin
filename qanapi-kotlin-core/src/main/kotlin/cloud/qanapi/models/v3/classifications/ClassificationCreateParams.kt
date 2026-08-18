// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.models.v3.classifications

import cloud.qanapi.core.ExcludeMissing
import cloud.qanapi.core.JsonField
import cloud.qanapi.core.JsonMissing
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.Params
import cloud.qanapi.core.checkKnown
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.http.Headers
import cloud.qanapi.core.http.QueryParams
import cloud.qanapi.core.toImmutable
import cloud.qanapi.errors.QanapiInvalidDataException
import cloud.qanapi.models.v3.GoogleGroup
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Create classification */
class ClassificationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bgColor(): String = body.bgColor()

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fgColor(): String = body.fgColor()

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emoji(): String? = body.emoji()

    /**
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun gwsGroups(): List<GoogleGroup>? = body.gwsGroups()

    /**
     * Required if gws_groups is provided.
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun providerContainerId(): Long? = body.providerContainerId()

    /**
     * Array of role IDs.
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roles(): List<Long>? = body.roles()

    /**
     * Array of user IDs.
     *
     * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun users(): List<Long>? = body.users()

    /**
     * Returns the raw JSON value of [bgColor].
     *
     * Unlike [bgColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _bgColor(): JsonField<String> = body._bgColor()

    /**
     * Returns the raw JSON value of [fgColor].
     *
     * Unlike [fgColor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fgColor(): JsonField<String> = body._fgColor()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [emoji].
     *
     * Unlike [emoji], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _emoji(): JsonField<String> = body._emoji()

    /**
     * Returns the raw JSON value of [gwsGroups].
     *
     * Unlike [gwsGroups], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _gwsGroups(): JsonField<List<GoogleGroup>> = body._gwsGroups()

    /**
     * Returns the raw JSON value of [providerContainerId].
     *
     * Unlike [providerContainerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _providerContainerId(): JsonField<Long> = body._providerContainerId()

    /**
     * Returns the raw JSON value of [roles].
     *
     * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _roles(): JsonField<List<Long>> = body._roles()

    /**
     * Returns the raw JSON value of [users].
     *
     * Unlike [users], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _users(): JsonField<List<Long>> = body._users()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ClassificationCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .bgColor()
         * .fgColor()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ClassificationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(classificationCreateParams: ClassificationCreateParams) = apply {
            body = classificationCreateParams.body.toBuilder()
            additionalHeaders = classificationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = classificationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [bgColor]
         * - [fgColor]
         * - [name]
         * - [description]
         * - [emoji]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun bgColor(bgColor: String) = apply { body.bgColor(bgColor) }

        /**
         * Sets [Builder.bgColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bgColor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bgColor(bgColor: JsonField<String>) = apply { body.bgColor(bgColor) }

        fun fgColor(fgColor: String) = apply { body.fgColor(fgColor) }

        /**
         * Sets [Builder.fgColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fgColor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fgColor(fgColor: JsonField<String>) = apply { body.fgColor(fgColor) }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun emoji(emoji: String?) = apply { body.emoji(emoji) }

        /**
         * Sets [Builder.emoji] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emoji] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun emoji(emoji: JsonField<String>) = apply { body.emoji(emoji) }

        fun gwsGroups(gwsGroups: List<GoogleGroup>) = apply { body.gwsGroups(gwsGroups) }

        /**
         * Sets [Builder.gwsGroups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gwsGroups] with a well-typed `List<GoogleGroup>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gwsGroups(gwsGroups: JsonField<List<GoogleGroup>>) = apply { body.gwsGroups(gwsGroups) }

        /**
         * Adds a single [GoogleGroup] to [gwsGroups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGwsGroup(gwsGroup: GoogleGroup) = apply { body.addGwsGroup(gwsGroup) }

        /** Required if gws_groups is provided. */
        fun providerContainerId(providerContainerId: Long) = apply {
            body.providerContainerId(providerContainerId)
        }

        /**
         * Sets [Builder.providerContainerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerContainerId] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun providerContainerId(providerContainerId: JsonField<Long>) = apply {
            body.providerContainerId(providerContainerId)
        }

        /** Array of role IDs. */
        fun roles(roles: List<Long>) = apply { body.roles(roles) }

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roles(roles: JsonField<List<Long>>) = apply { body.roles(roles) }

        /**
         * Adds a single [Long] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: Long) = apply { body.addRole(role) }

        /** Array of user IDs. */
        fun users(users: List<Long>) = apply { body.users(users) }

        /**
         * Sets [Builder.users] to an arbitrary JSON value.
         *
         * You should usually call [Builder.users] with a well-typed `List<Long>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun users(users: JsonField<List<Long>>) = apply { body.users(users) }

        /**
         * Adds a single [Long] to [users].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUser(user: Long) = apply { body.addUser(user) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [ClassificationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .bgColor()
         * .fgColor()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClassificationCreateParams =
            ClassificationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val bgColor: JsonField<String>,
        private val fgColor: JsonField<String>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val emoji: JsonField<String>,
        private val gwsGroups: JsonField<List<GoogleGroup>>,
        private val providerContainerId: JsonField<Long>,
        private val roles: JsonField<List<Long>>,
        private val users: JsonField<List<Long>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("bg_color") @ExcludeMissing bgColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fg_color") @ExcludeMissing fgColor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("emoji") @ExcludeMissing emoji: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gws_groups")
            @ExcludeMissing
            gwsGroups: JsonField<List<GoogleGroup>> = JsonMissing.of(),
            @JsonProperty("provider_container_id")
            @ExcludeMissing
            providerContainerId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("roles") @ExcludeMissing roles: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("users") @ExcludeMissing users: JsonField<List<Long>> = JsonMissing.of(),
        ) : this(
            bgColor,
            fgColor,
            name,
            description,
            emoji,
            gwsGroups,
            providerContainerId,
            roles,
            users,
            mutableMapOf(),
        )

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
        fun gwsGroups(): List<GoogleGroup>? = gwsGroups.getNullable("gws_groups")

        /**
         * Required if gws_groups is provided.
         *
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerContainerId(): Long? = providerContainerId.getNullable("provider_container_id")

        /**
         * Array of role IDs.
         *
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun roles(): List<Long>? = roles.getNullable("roles")

        /**
         * Array of user IDs.
         *
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun users(): List<Long>? = users.getNullable("users")

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
         * Returns the raw JSON value of [gwsGroups].
         *
         * Unlike [gwsGroups], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gws_groups")
        @ExcludeMissing
        fun _gwsGroups(): JsonField<List<GoogleGroup>> = gwsGroups

        /**
         * Returns the raw JSON value of [providerContainerId].
         *
         * Unlike [providerContainerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provider_container_id")
        @ExcludeMissing
        fun _providerContainerId(): JsonField<Long> = providerContainerId

        /**
         * Returns the raw JSON value of [roles].
         *
         * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<Long>> = roles

        /**
         * Returns the raw JSON value of [users].
         *
         * Unlike [users], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("users") @ExcludeMissing fun _users(): JsonField<List<Long>> = users

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .bgColor()
             * .fgColor()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var bgColor: JsonField<String>? = null
            private var fgColor: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var emoji: JsonField<String> = JsonMissing.of()
            private var gwsGroups: JsonField<MutableList<GoogleGroup>>? = null
            private var providerContainerId: JsonField<Long> = JsonMissing.of()
            private var roles: JsonField<MutableList<Long>>? = null
            private var users: JsonField<MutableList<Long>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                bgColor = body.bgColor
                fgColor = body.fgColor
                name = body.name
                description = body.description
                emoji = body.emoji
                gwsGroups = body.gwsGroups.map { it.toMutableList() }
                providerContainerId = body.providerContainerId
                roles = body.roles.map { it.toMutableList() }
                users = body.users.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

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

            fun gwsGroups(gwsGroups: List<GoogleGroup>) = gwsGroups(JsonField.of(gwsGroups))

            /**
             * Sets [Builder.gwsGroups] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gwsGroups] with a well-typed `List<GoogleGroup>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Required if gws_groups is provided. */
            fun providerContainerId(providerContainerId: Long) =
                providerContainerId(JsonField.of(providerContainerId))

            /**
             * Sets [Builder.providerContainerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerContainerId] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerContainerId(providerContainerId: JsonField<Long>) = apply {
                this.providerContainerId = providerContainerId
            }

            /** Array of role IDs. */
            fun roles(roles: List<Long>) = roles(JsonField.of(roles))

            /**
             * Sets [Builder.roles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roles] with a well-typed `List<Long>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roles(roles: JsonField<List<Long>>) = apply {
                this.roles = roles.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [roles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRole(role: Long) = apply {
                roles =
                    (roles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("roles", it).add(role)
                    }
            }

            /** Array of user IDs. */
            fun users(users: List<Long>) = users(JsonField.of(users))

            /**
             * Sets [Builder.users] to an arbitrary JSON value.
             *
             * You should usually call [Builder.users] with a well-typed `List<Long>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun users(users: JsonField<List<Long>>) = apply {
                this.users = users.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [users].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUser(user: Long) = apply {
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .bgColor()
             * .fgColor()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("bgColor", bgColor),
                    checkRequired("fgColor", fgColor),
                    checkRequired("name", name),
                    description,
                    emoji,
                    (gwsGroups ?: JsonMissing.of()).map { it.toImmutable() },
                    providerContainerId,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            bgColor()
            fgColor()
            name()
            description()
            emoji()
            gwsGroups()?.forEach { it.validate() }
            providerContainerId()
            roles()
            users()
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
            (if (bgColor.asKnown() == null) 0 else 1) +
                (if (fgColor.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (emoji.asKnown() == null) 0 else 1) +
                (gwsGroups.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (providerContainerId.asKnown() == null) 0 else 1) +
                (roles.asKnown()?.size ?: 0) +
                (users.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                bgColor == other.bgColor &&
                fgColor == other.fgColor &&
                name == other.name &&
                description == other.description &&
                emoji == other.emoji &&
                gwsGroups == other.gwsGroups &&
                providerContainerId == other.providerContainerId &&
                roles == other.roles &&
                users == other.users &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                bgColor,
                fgColor,
                name,
                description,
                emoji,
                gwsGroups,
                providerContainerId,
                roles,
                users,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{bgColor=$bgColor, fgColor=$fgColor, name=$name, description=$description, emoji=$emoji, gwsGroups=$gwsGroups, providerContainerId=$providerContainerId, roles=$roles, users=$users, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClassificationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ClassificationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
