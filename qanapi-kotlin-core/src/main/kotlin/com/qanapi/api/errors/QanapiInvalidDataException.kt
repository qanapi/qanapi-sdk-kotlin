package com.qanapi.api.errors

class QanapiInvalidDataException(message: String? = null, cause: Throwable? = null) :
    QanapiException(message, cause)
