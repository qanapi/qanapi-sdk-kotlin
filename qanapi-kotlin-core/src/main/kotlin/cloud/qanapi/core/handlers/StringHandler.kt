@file:JvmName("StringHandler")

package cloud.qanapi.core.handlers

import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponse.Handler

internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
