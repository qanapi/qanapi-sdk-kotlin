// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.errors

import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.http.Headers

abstract class QanapiServiceException
protected constructor(message: String, cause: Throwable? = null) : QanapiException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
