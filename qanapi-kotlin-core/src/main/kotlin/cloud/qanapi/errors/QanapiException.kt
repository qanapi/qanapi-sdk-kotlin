package cloud.qanapi.errors

open class QanapiException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
