@file:JvmName("EmptyHandler")

package cloud.qanapi.core.handlers

import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponse.Handler

internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
