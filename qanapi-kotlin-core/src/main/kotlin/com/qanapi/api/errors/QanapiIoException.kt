package com.qanapi.api.errors

class QanapiIoException(message: String? = null, cause: Throwable? = null) :
    QanapiException(message, cause)
