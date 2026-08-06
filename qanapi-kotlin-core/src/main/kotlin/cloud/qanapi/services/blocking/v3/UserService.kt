// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.users.UserCreateParams
import cloud.qanapi.models.v3.users.UserCreateResponse
import cloud.qanapi.models.v3.users.UserDeleteParams
import cloud.qanapi.models.v3.users.UserListParams
import cloud.qanapi.models.v3.users.UserListResponse
import cloud.qanapi.models.v3.users.UserMeParams
import cloud.qanapi.models.v3.users.UserMeResponse
import cloud.qanapi.models.v3.users.UserPatchParams
import cloud.qanapi.models.v3.users.UserPatchResponse
import cloud.qanapi.models.v3.users.UserRestoreParams
import cloud.qanapi.models.v3.users.UserRestoreResponse
import cloud.qanapi.models.v3.users.UserShowParams
import cloud.qanapi.models.v3.users.UserShowResponse
import com.google.errorprone.annotations.MustBeClosed

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    /** Create user */
    fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateResponse

    /** List users */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<UserListResponse>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<UserListResponse> =
        list(UserListParams.none(), requestOptions)

    /** Delete user */
    fun delete(
        user: Long,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().user(user).build(), requestOptions)

    /** @see delete */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(user: Long, requestOptions: RequestOptions) =
        delete(user, UserDeleteParams.none(), requestOptions)

    /** Get current user */
    fun me(
        params: UserMeParams = UserMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserMeResponse

    /** @see me */
    fun me(requestOptions: RequestOptions): UserMeResponse = me(UserMeParams.none(), requestOptions)

    /** Update user */
    fun patch(
        user: Long,
        params: UserPatchParams = UserPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserPatchResponse = patch(params.toBuilder().user(user).build(), requestOptions)

    /** @see patch */
    fun patch(
        params: UserPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserPatchResponse

    /** @see patch */
    fun patch(user: Long, requestOptions: RequestOptions): UserPatchResponse =
        patch(user, UserPatchParams.none(), requestOptions)

    /** Update user */
    fun restore(
        user: Long,
        params: UserRestoreParams = UserRestoreParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRestoreResponse = restore(params.toBuilder().user(user).build(), requestOptions)

    /** @see restore */
    fun restore(
        params: UserRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserRestoreResponse

    /** @see restore */
    fun restore(user: Long, requestOptions: RequestOptions): UserRestoreResponse =
        restore(user, UserRestoreParams.none(), requestOptions)

    /** Get user */
    fun show(
        user: Long,
        params: UserShowParams = UserShowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserShowResponse = show(params.toBuilder().user(user).build(), requestOptions)

    /** @see show */
    fun show(
        params: UserShowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserShowResponse

    /** @see show */
    fun show(user: Long, requestOptions: RequestOptions): UserShowResponse =
        show(user, UserShowParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v3/users`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v3/users`, but is otherwise the same as
         * [UserService.list].
         */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<UserListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<UserListResponse>> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v3/users/{user}`, but is otherwise the same as
         * [UserService.delete].
         */
        @MustBeClosed
        fun delete(
            user: Long,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().user(user).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(user: Long, requestOptions: RequestOptions): HttpResponse =
            delete(user, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/users/me`, but is otherwise the same as
         * [UserService.me].
         */
        @MustBeClosed
        fun me(
            params: UserMeParams = UserMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserMeResponse>

        /** @see me */
        @MustBeClosed
        fun me(requestOptions: RequestOptions): HttpResponseFor<UserMeResponse> =
            me(UserMeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v3/users/{user}`, but is otherwise the same as
         * [UserService.patch].
         */
        @MustBeClosed
        fun patch(
            user: Long,
            params: UserPatchParams = UserPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserPatchResponse> =
            patch(params.toBuilder().user(user).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        fun patch(
            params: UserPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserPatchResponse>

        /** @see patch */
        @MustBeClosed
        fun patch(user: Long, requestOptions: RequestOptions): HttpResponseFor<UserPatchResponse> =
            patch(user, UserPatchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v3/users/{user}`, but is otherwise the same as
         * [UserService.restore].
         */
        @MustBeClosed
        fun restore(
            user: Long,
            params: UserRestoreParams = UserRestoreParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRestoreResponse> =
            restore(params.toBuilder().user(user).build(), requestOptions)

        /** @see restore */
        @MustBeClosed
        fun restore(
            params: UserRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserRestoreResponse>

        /** @see restore */
        @MustBeClosed
        fun restore(
            user: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserRestoreResponse> =
            restore(user, UserRestoreParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/users/{user}`, but is otherwise the same as
         * [UserService.show].
         */
        @MustBeClosed
        fun show(
            user: Long,
            params: UserShowParams = UserShowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserShowResponse> =
            show(params.toBuilder().user(user).build(), requestOptions)

        /** @see show */
        @MustBeClosed
        fun show(
            params: UserShowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserShowResponse>

        /** @see show */
        @MustBeClosed
        fun show(user: Long, requestOptions: RequestOptions): HttpResponseFor<UserShowResponse> =
            show(user, UserShowParams.none(), requestOptions)
    }
}
