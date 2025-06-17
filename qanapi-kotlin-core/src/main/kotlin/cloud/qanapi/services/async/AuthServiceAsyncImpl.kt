// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.JsonValue
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.handlers.errorHandler
import cloud.qanapi.core.handlers.jsonHandler
import cloud.qanapi.core.handlers.withErrorHandler
import cloud.qanapi.core.http.HttpMethod
import cloud.qanapi.core.http.HttpRequest
import cloud.qanapi.core.http.HttpResponse.Handler
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.core.http.json
import cloud.qanapi.core.http.parseable
import cloud.qanapi.core.prepareAsync
import cloud.qanapi.models.auth.AuthLoginParams
import cloud.qanapi.models.auth.AuthLoginResponse
import cloud.qanapi.models.auth.AuthLogoutParams
import cloud.qanapi.models.auth.AuthLogoutResponse
import cloud.qanapi.models.auth.AuthRefreshTokenParams
import cloud.qanapi.models.auth.AuthRefreshTokenResponse
import cloud.qanapi.models.auth.AuthRetrieveUserDetailsParams
import cloud.qanapi.models.auth.AuthRetrieveUserDetailsResponse
import cloud.qanapi.models.auth.AuthRevokeTokenParams
import cloud.qanapi.models.auth.AuthRevokeTokenResponse

class AuthServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthServiceAsync {

    private val withRawResponse: AuthServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthServiceAsync =
        AuthServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

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

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuthServiceAsync.WithRawResponse =
            AuthServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

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
