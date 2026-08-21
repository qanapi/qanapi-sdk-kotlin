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

class ClassificationCreateResponse
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
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
         * Returns a mutable builder for constructing an instance of [ClassificationCreateResponse].
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

    /** A builder for [ClassificationCreateResponse]. */
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

        internal fun from(classificationCreateResponse: ClassificationCreateResponse) = apply {
            id = classificationCreateResponse.id
            bgColor = classificationCreateResponse.bgColor
            fgColor = classificationCreateResponse.fgColor
            name = classificationCreateResponse.name
            slug = classificationCreateResponse.slug
            description = classificationCreateResponse.description
            emoji = classificationCreateResponse.emoji
            providers = classificationCreateResponse.providers.map { it.toMutableList() }
            roles = classificationCreateResponse.roles.map { it.toMutableList() }
            users = classificationCreateResponse.users.map { it.toMutableList() }
            additionalProperties = classificationCreateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun bgColor(bgColor: String) = bgColor(JsonField.of(bgColor))

        /**
         * Sets [Builder.bgColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bgColor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bgColor(bgColor: JsonField<String>) = apply { this.bgColor = bgColor }

        fun fgColor(fgColor: String) = fgColor(JsonField.of(fgColor))

        /**
         * Sets [Builder.fgColor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fgColor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fgColor(fgColor: JsonField<String>) = apply { this.fgColor = fgColor }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun emoji(emoji: String?) = emoji(JsonField.ofNullable(emoji))

        /**
         * Sets [Builder.emoji] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emoji] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (roles ?: JsonField.of(mutableListOf())).also { checkKnown("roles", it).add(role) }
        }

        fun users(users: List<User>) = users(JsonField.of(users))

        /**
         * Sets [Builder.users] to an arbitrary JSON value.
         *
         * You should usually call [Builder.users] with a well-typed `List<User>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (users ?: JsonField.of(mutableListOf())).also { checkKnown("users", it).add(user) }
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
         * Returns an immutable instance of [ClassificationCreateResponse].
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
        fun build(): ClassificationCreateResponse =
            ClassificationCreateResponse(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws QanapiInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ClassificationCreateResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun gwsGroups(): List<GoogleGroup>? = gwsGroups.getNullable("gws_groups")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * @throws QanapiInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun uuid(): String? = uuid.getNullable("uuid")

        /**
         * Returns the raw JSON value of [gwsGroups].
         *
         * Unlike [gwsGroups], this method doesn't throw if the JSON field has an unexpected type.
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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun uuid(uuid: String) = uuid(JsonField.of(uuid))

            /**
             * Sets [Builder.uuid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
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

        return other is ClassificationCreateResponse &&
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
        "ClassificationCreateResponse{id=$id, bgColor=$bgColor, fgColor=$fgColor, name=$name, slug=$slug, description=$description, emoji=$emoji, providers=$providers, roles=$roles, users=$users, additionalProperties=$additionalProperties}"
}
