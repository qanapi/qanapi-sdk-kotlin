// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.qanapi.api.core.ClientOptions
import com.qanapi.api.core.RequestOptions
import com.qanapi.api.core.http.HttpResponseFor
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

interface AuthServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthServiceAsync

    /** Authenticate user and return JWT */
    suspend fun login(
        params: AuthLoginParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthLoginResponse

    /** Log out the current user */
    suspend fun logout(
        params: AuthLogoutParams = AuthLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthLogoutResponse

    /** @see [logout] */
    suspend fun logout(requestOptions: RequestOptions): AuthLogoutResponse =
        logout(AuthLogoutParams.none(), requestOptions)

    /** Refresh access token using refresh token */
    suspend fun refreshToken(
        params: AuthRefreshTokenParams = AuthRefreshTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRefreshTokenResponse

    /** @see [refreshToken] */
    suspend fun refreshToken(requestOptions: RequestOptions): AuthRefreshTokenResponse =
        refreshToken(AuthRefreshTokenParams.none(), requestOptions)

    /** Retrieve user profile and roles */
    suspend fun retrieveUserDetails(
        params: AuthRetrieveUserDetailsParams = AuthRetrieveUserDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRetrieveUserDetailsResponse

    /** @see [retrieveUserDetails] */
    suspend fun retrieveUserDetails(
        requestOptions: RequestOptions
    ): AuthRetrieveUserDetailsResponse =
        retrieveUserDetails(AuthRetrieveUserDetailsParams.none(), requestOptions)

    /** Revoke the current token */
    suspend fun revokeToken(
        params: AuthRevokeTokenParams = AuthRevokeTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRevokeTokenResponse

    /** @see [revokeToken] */
    suspend fun revokeToken(requestOptions: RequestOptions): AuthRevokeTokenResponse =
        revokeToken(AuthRevokeTokenParams.none(), requestOptions)

    /** A view of [AuthServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /auth/login`, but is otherwise the same as
         * [AuthServiceAsync.login].
         */
        @MustBeClosed
        suspend fun login(
            params: AuthLoginParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthLoginResponse>

        /**
         * Returns a raw HTTP response for `post /auth/logout`, but is otherwise the same as
         * [AuthServiceAsync.logout].
         */
        @MustBeClosed
        suspend fun logout(
            params: AuthLogoutParams = AuthLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthLogoutResponse>

        /** @see [logout] */
        @MustBeClosed
        suspend fun logout(requestOptions: RequestOptions): HttpResponseFor<AuthLogoutResponse> =
            logout(AuthLogoutParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/refresh`, but is otherwise the same as
         * [AuthServiceAsync.refreshToken].
         */
        @MustBeClosed
        suspend fun refreshToken(
            params: AuthRefreshTokenParams = AuthRefreshTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRefreshTokenResponse>

        /** @see [refreshToken] */
        @MustBeClosed
        suspend fun refreshToken(
            requestOptions: RequestOptions
        ): HttpResponseFor<AuthRefreshTokenResponse> =
            refreshToken(AuthRefreshTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /auth/userdetails`, but is otherwise the same as
         * [AuthServiceAsync.retrieveUserDetails].
         */
        @MustBeClosed
        suspend fun retrieveUserDetails(
            params: AuthRetrieveUserDetailsParams = AuthRetrieveUserDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRetrieveUserDetailsResponse>

        /** @see [retrieveUserDetails] */
        @MustBeClosed
        suspend fun retrieveUserDetails(
            requestOptions: RequestOptions
        ): HttpResponseFor<AuthRetrieveUserDetailsResponse> =
            retrieveUserDetails(AuthRetrieveUserDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/revoke`, but is otherwise the same as
         * [AuthServiceAsync.revokeToken].
         */
        @MustBeClosed
        suspend fun revokeToken(
            params: AuthRevokeTokenParams = AuthRevokeTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRevokeTokenResponse>

        /** @see [revokeToken] */
        @MustBeClosed
        suspend fun revokeToken(
            requestOptions: RequestOptions
        ): HttpResponseFor<AuthRevokeTokenResponse> =
            revokeToken(AuthRevokeTokenParams.none(), requestOptions)
    }
}
