// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.errors

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.checkRequired
import cloud.qanapi.core.http.Headers

class BadRequestException
private constructor(private val headers: Headers, private val body: JsonValue, cause: Throwable?) :
    QanapiServiceException("400: $body", cause) {

    override fun statusCode(): Int = 400

    override fun headers(): Headers = headers

    override fun body(): JsonValue = body

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BadRequestException].
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BadRequestException]. */
    class Builder internal constructor() {

        private var headers: Headers? = null
        private var body: JsonValue? = null
        private var cause: Throwable? = null

        internal fun from(badRequestException: BadRequestException) = apply {
            headers = badRequestException.headers
            body = badRequestException.body
            cause = badRequestException.cause
        }

        fun headers(headers: Headers) = apply { this.headers = headers }

        fun body(body: JsonValue) = apply { this.body = body }

        fun cause(cause: Throwable?) = apply { this.cause = cause }

        /**
         * Returns an immutable instance of [BadRequestException].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .headers()
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BadRequestException =
            BadRequestException(
                checkRequired("headers", headers),
                checkRequired("body", body),
                cause,
            )
    }
}
