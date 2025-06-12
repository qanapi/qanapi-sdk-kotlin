// File generated from our OpenAPI spec by Stainless.

package com.qanapi.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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

interface AuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Authenticate user and return JWT */
    fun login(
        params: AuthLoginParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthLoginResponse

    /** Log out the current user */
    fun logout(
        params: AuthLogoutParams = AuthLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthLogoutResponse

    /** @see [logout] */
    fun logout(requestOptions: RequestOptions): AuthLogoutResponse =
        logout(AuthLogoutParams.none(), requestOptions)

    /** Refresh access token using refresh token */
    fun refreshToken(
        params: AuthRefreshTokenParams = AuthRefreshTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRefreshTokenResponse

    /** @see [refreshToken] */
    fun refreshToken(requestOptions: RequestOptions): AuthRefreshTokenResponse =
        refreshToken(AuthRefreshTokenParams.none(), requestOptions)

    /** Retrieve user profile and roles */
    fun retrieveUserDetails(
        params: AuthRetrieveUserDetailsParams = AuthRetrieveUserDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRetrieveUserDetailsResponse

    /** @see [retrieveUserDetails] */
    fun retrieveUserDetails(requestOptions: RequestOptions): AuthRetrieveUserDetailsResponse =
        retrieveUserDetails(AuthRetrieveUserDetailsParams.none(), requestOptions)

    /** Revoke the current token */
    fun revokeToken(
        params: AuthRevokeTokenParams = AuthRevokeTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRevokeTokenResponse

    /** @see [revokeToken] */
    fun revokeToken(requestOptions: RequestOptions): AuthRevokeTokenResponse =
        revokeToken(AuthRevokeTokenParams.none(), requestOptions)

    /** A view of [AuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /auth/login`, but is otherwise the same as
         * [AuthService.login].
         */
        @MustBeClosed
        fun login(
            params: AuthLoginParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthLoginResponse>

        /**
         * Returns a raw HTTP response for `post /auth/logout`, but is otherwise the same as
         * [AuthService.logout].
         */
        @MustBeClosed
        fun logout(
            params: AuthLogoutParams = AuthLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthLogoutResponse>

        /** @see [logout] */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): HttpResponseFor<AuthLogoutResponse> =
            logout(AuthLogoutParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/refresh`, but is otherwise the same as
         * [AuthService.refreshToken].
         */
        @MustBeClosed
        fun refreshToken(
            params: AuthRefreshTokenParams = AuthRefreshTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRefreshTokenResponse>

        /** @see [refreshToken] */
        @MustBeClosed
        fun refreshToken(
            requestOptions: RequestOptions
        ): HttpResponseFor<AuthRefreshTokenResponse> =
            refreshToken(AuthRefreshTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /auth/userdetails`, but is otherwise the same as
         * [AuthService.retrieveUserDetails].
         */
        @MustBeClosed
        fun retrieveUserDetails(
            params: AuthRetrieveUserDetailsParams = AuthRetrieveUserDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRetrieveUserDetailsResponse>

        /** @see [retrieveUserDetails] */
        @MustBeClosed
        fun retrieveUserDetails(
            requestOptions: RequestOptions
        ): HttpResponseFor<AuthRetrieveUserDetailsResponse> =
            retrieveUserDetails(AuthRetrieveUserDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /auth/revoke`, but is otherwise the same as
         * [AuthService.revokeToken].
         */
        @MustBeClosed
        fun revokeToken(
            params: AuthRevokeTokenParams = AuthRevokeTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRevokeTokenResponse>

        /** @see [revokeToken] */
        @MustBeClosed
        fun revokeToken(requestOptions: RequestOptions): HttpResponseFor<AuthRevokeTokenResponse> =
            revokeToken(AuthRevokeTokenParams.none(), requestOptions)
    }
}
