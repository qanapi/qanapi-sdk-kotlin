// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.User
import cloud.qanapi.models.v3.users.UserCreateParams
import cloud.qanapi.models.v3.users.UserDeleteParams
import cloud.qanapi.models.v3.users.UserListParams
import cloud.qanapi.models.v3.users.UserMeParams
import cloud.qanapi.models.v3.users.UserPatchParams
import cloud.qanapi.models.v3.users.UserRestoreParams
import cloud.qanapi.models.v3.users.UserShowParams
import com.google.errorprone.annotations.MustBeClosed

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync

    /** Create user */
    suspend fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** List users */
    suspend fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<User>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<User> =
        list(UserListParams.none(), requestOptions)

    /** Delete user */
    suspend fun delete(
        user: Long,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().user(user).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(user: Long, requestOptions: RequestOptions) =
        delete(user, UserDeleteParams.none(), requestOptions)

    /** Get current user */
    suspend fun me(
        params: UserMeParams = UserMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see me */
    suspend fun me(requestOptions: RequestOptions): User = me(UserMeParams.none(), requestOptions)

    /** Update user */
    suspend fun patch(
        user: Long,
        params: UserPatchParams = UserPatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = patch(params.toBuilder().user(user).build(), requestOptions)

    /** @see patch */
    suspend fun patch(
        params: UserPatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see patch */
    suspend fun patch(user: Long, requestOptions: RequestOptions): User =
        patch(user, UserPatchParams.none(), requestOptions)

    /** Restore user */
    suspend fun restore(
        user: Long,
        params: UserRestoreParams = UserRestoreParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = restore(params.toBuilder().user(user).build(), requestOptions)

    /** @see restore */
    suspend fun restore(
        params: UserRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see restore */
    suspend fun restore(user: Long, requestOptions: RequestOptions): User =
        restore(user, UserRestoreParams.none(), requestOptions)

    /** Get user */
    suspend fun show(
        user: Long,
        params: UserShowParams = UserShowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = show(params.toBuilder().user(user).build(), requestOptions)

    /** @see show */
    suspend fun show(
        params: UserShowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see show */
    suspend fun show(user: Long, requestOptions: RequestOptions): User =
        show(user, UserShowParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v3/users`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /**
         * Returns a raw HTTP response for `get /v3/users`, but is otherwise the same as
         * [UserServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<User>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<User>> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v3/users/{user}`, but is otherwise the same as
         * [UserServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            user: Long,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().user(user).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(user: Long, requestOptions: RequestOptions): HttpResponse =
            delete(user, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/users/me`, but is otherwise the same as
         * [UserServiceAsync.me].
         */
        @MustBeClosed
        suspend fun me(
            params: UserMeParams = UserMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see me */
        @MustBeClosed
        suspend fun me(requestOptions: RequestOptions): HttpResponseFor<User> =
            me(UserMeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v3/users/{user}`, but is otherwise the same as
         * [UserServiceAsync.patch].
         */
        @MustBeClosed
        suspend fun patch(
            user: Long,
            params: UserPatchParams = UserPatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> = patch(params.toBuilder().user(user).build(), requestOptions)

        /** @see patch */
        @MustBeClosed
        suspend fun patch(
            params: UserPatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see patch */
        @MustBeClosed
        suspend fun patch(user: Long, requestOptions: RequestOptions): HttpResponseFor<User> =
            patch(user, UserPatchParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v3/users/{user}/restore`, but is otherwise the
         * same as [UserServiceAsync.restore].
         */
        @MustBeClosed
        suspend fun restore(
            user: Long,
            params: UserRestoreParams = UserRestoreParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> = restore(params.toBuilder().user(user).build(), requestOptions)

        /** @see restore */
        @MustBeClosed
        suspend fun restore(
            params: UserRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see restore */
        @MustBeClosed
        suspend fun restore(user: Long, requestOptions: RequestOptions): HttpResponseFor<User> =
            restore(user, UserRestoreParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/users/{user}`, but is otherwise the same as
         * [UserServiceAsync.show].
         */
        @MustBeClosed
        suspend fun show(
            user: Long,
            params: UserShowParams = UserShowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> = show(params.toBuilder().user(user).build(), requestOptions)

        /** @see show */
        @MustBeClosed
        suspend fun show(
            params: UserShowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see show */
        @MustBeClosed
        suspend fun show(user: Long, requestOptions: RequestOptions): HttpResponseFor<User> =
            show(user, UserShowParams.none(), requestOptions)
    }
}
