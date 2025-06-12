package com.qanapi.api.errors

open class QanapiException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
