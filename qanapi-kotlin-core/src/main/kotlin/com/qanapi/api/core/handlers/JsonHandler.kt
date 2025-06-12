@file:JvmName("JsonHandler")

package com.qanapi.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.qanapi.api.core.http.HttpResponse
import com.qanapi.api.core.http.HttpResponse.Handler
import com.qanapi.api.errors.QanapiInvalidDataException

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw QanapiInvalidDataException("Error reading response", e)
            }
        }
    }
