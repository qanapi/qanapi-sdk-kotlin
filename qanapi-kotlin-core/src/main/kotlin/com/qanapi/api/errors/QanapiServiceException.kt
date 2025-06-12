// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.errors

import com.qanapi.api.core.JsonValue
import com.qanapi.api.core.http.Headers

abstract class QanapiServiceException
protected constructor(message: String, cause: Throwable? = null) : QanapiException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
