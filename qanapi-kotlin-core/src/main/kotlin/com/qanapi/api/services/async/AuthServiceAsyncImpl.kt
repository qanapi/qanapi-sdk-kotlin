// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.qanapi.api.core.ClientOptions
import com.qanapi.api.core.JsonValue
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.handlers.errorHandler
import com.qanapi.api.core.handlers.jsonHandler
import com.qanapi.api.core.handlers.withErrorHandler
import com.qanapi.api.core.http.HttpMethod
import com.qanapi.api.core.http.HttpRequest
import com.qanapi.api.core.http.HttpResponse.Handler
import com.qanapi.api.core.http.HttpResponseFor
import com.qanapi.api.core.http.json
import com.qanapi.api.core.http.parseable
import com.qanapi.api.core.prepareAsync
import com.qanapi.api.models.auth.AuthLoginParams
import com.qanapi.api.models.auth.AuthLoginResponse
import com.qanapi.api.models.auth.AuthLogoutParams
import com.qanapi.api.models.auth.AuthLogoutResponse
import com.qanapi.api.models.auth.AuthRefreshTokenParams
import com.qanapi.api.models.auth.AuthRefreshTokenResponse
import com.qanapi.api.models.auth.AuthRetrieveUserDetailsParams
import com.qanapi.api.models.auth.AuthRetrieveUserDetailsResponse
import com.qanapi.api.models.auth.AuthRevokeTokenParams
import com.qanapi.api.models.auth.AuthRevokeTokenResponse

class AuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthServiceAsync {

    private val withRawResponse: AuthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthServiceAsync.WithRawResponse = withRawResponse

    override suspend fun login(
        params: AuthLoginParams,
        requestOptions: RequestOptions,
    ): AuthLoginResponse =
        // post /auth/login
        withRawResponse().login(params, requestOptions).parse()

    override suspend fun logout(
        params: AuthLogoutParams,
        requestOptions: RequestOptions,
    ): AuthLogoutResponse =
        // post /auth/logout
        withRawResponse().logout(params, requestOptions).parse()

    override suspend fun refreshToken(
        params: AuthRefreshTokenParams,
        requestOptions: RequestOptions,
    ): AuthRefreshTokenResponse =
        // post /auth/refresh
        withRawResponse().refreshToken(params, requestOptions).parse()

    override suspend fun retrieveUserDetails(
        params: AuthRetrieveUserDetailsParams,
        requestOptions: RequestOptions,
    ): AuthRetrieveUserDetailsResponse =
        // get /auth/userdetails
        withRawResponse().retrieveUserDetails(params, requestOptions).parse()

    override suspend fun revokeToken(
        params: AuthRevokeTokenParams,
        requestOptions: RequestOptions,
    ): AuthRevokeTokenResponse =
        // post /auth/revoke
        withRawResponse().revokeToken(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val loginHandler: Handler<AuthLoginResponse> =
            jsonHandler<AuthLoginResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun login(
            params: AuthLoginParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthLoginResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "login")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { loginHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val logoutHandler: Handler<AuthLogoutResponse> =
            jsonHandler<AuthLogoutResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun logout(
            params: AuthLogoutParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthLogoutResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "logout")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { logoutHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val refreshTokenHandler: Handler<AuthRefreshTokenResponse> =
            jsonHandler<AuthRefreshTokenResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun refreshToken(
            params: AuthRefreshTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthRefreshTokenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "refresh")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { refreshTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveUserDetailsHandler: Handler<AuthRetrieveUserDetailsResponse> =
            jsonHandler<AuthRetrieveUserDetailsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieveUserDetails(
            params: AuthRetrieveUserDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthRetrieveUserDetailsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "userdetails")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveUserDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val revokeTokenHandler: Handler<AuthRevokeTokenResponse> =
            jsonHandler<AuthRevokeTokenResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun revokeToken(
            params: AuthRevokeTokenParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthRevokeTokenResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("auth", "revoke")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { revokeTokenHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
