// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v2

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v2.auth.AuthLoginParams
import cloud.qanapi.models.v2.auth.AuthLoginResponse
import cloud.qanapi.models.v2.auth.AuthLogoutParams
import cloud.qanapi.models.v2.auth.AuthLogoutResponse
import cloud.qanapi.models.v2.auth.AuthRefreshTokenParams
import cloud.qanapi.models.v2.auth.AuthRefreshTokenResponse
import cloud.qanapi.models.v2.auth.AuthRevokeTokenParams
import cloud.qanapi.models.v2.auth.AuthRevokeTokenResponse
import cloud.qanapi.models.v2.auth.AuthUserDetailsParams
import cloud.qanapi.models.v2.auth.AuthUserDetailsResponse
import com.google.errorprone.annotations.MustBeClosed

interface AuthService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService

    /** Login */
    fun login(
        params: AuthLoginParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthLoginResponse

    /** Logout */
    fun logout(
        params: AuthLogoutParams = AuthLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthLogoutResponse

    /** @see logout */
    fun logout(requestOptions: RequestOptions): AuthLogoutResponse =
        logout(AuthLogoutParams.none(), requestOptions)

    /** Refresh token */
    fun refreshToken(
        params: AuthRefreshTokenParams = AuthRefreshTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRefreshTokenResponse

    /** @see refreshToken */
    fun refreshToken(requestOptions: RequestOptions): AuthRefreshTokenResponse =
        refreshToken(AuthRefreshTokenParams.none(), requestOptions)

    /** Revoke token */
    fun revokeToken(
        params: AuthRevokeTokenParams = AuthRevokeTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRevokeTokenResponse

    /** @see revokeToken */
    fun revokeToken(requestOptions: RequestOptions): AuthRevokeTokenResponse =
        revokeToken(AuthRevokeTokenParams.none(), requestOptions)

    /** Get user details */
    fun userDetails(
        params: AuthUserDetailsParams = AuthUserDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthUserDetailsResponse

    /** @see userDetails */
    fun userDetails(requestOptions: RequestOptions): AuthUserDetailsResponse =
        userDetails(AuthUserDetailsParams.none(), requestOptions)

    /** A view of [AuthService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuthService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/auth/login`, but is otherwise the same as
         * [AuthService.login].
         */
        @MustBeClosed
        fun login(
            params: AuthLoginParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthLoginResponse>

        /**
         * Returns a raw HTTP response for `post /v2/auth/logout`, but is otherwise the same as
         * [AuthService.logout].
         */
        @MustBeClosed
        fun logout(
            params: AuthLogoutParams = AuthLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthLogoutResponse>

        /** @see logout */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): HttpResponseFor<AuthLogoutResponse> =
            logout(AuthLogoutParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/auth/refresh`, but is otherwise the same as
         * [AuthService.refreshToken].
         */
        @MustBeClosed
        fun refreshToken(
            params: AuthRefreshTokenParams = AuthRefreshTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRefreshTokenResponse>

        /** @see refreshToken */
        @MustBeClosed
        fun refreshToken(
            requestOptions: RequestOptions
        ): HttpResponseFor<AuthRefreshTokenResponse> =
            refreshToken(AuthRefreshTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/auth/revoke`, but is otherwise the same as
         * [AuthService.revokeToken].
         */
        @MustBeClosed
        fun revokeToken(
            params: AuthRevokeTokenParams = AuthRevokeTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRevokeTokenResponse>

        /** @see revokeToken */
        @MustBeClosed
        fun revokeToken(requestOptions: RequestOptions): HttpResponseFor<AuthRevokeTokenResponse> =
            revokeToken(AuthRevokeTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/auth/userdetails`, but is otherwise the same as
         * [AuthService.userDetails].
         */
        @MustBeClosed
        fun userDetails(
            params: AuthUserDetailsParams = AuthUserDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthUserDetailsResponse>

        /** @see userDetails */
        @MustBeClosed
        fun userDetails(requestOptions: RequestOptions): HttpResponseFor<AuthUserDetailsResponse> =
            userDetails(AuthUserDetailsParams.none(), requestOptions)
    }
}
