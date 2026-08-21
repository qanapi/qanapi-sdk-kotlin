// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.User
import cloud.qanapi.models.v3.users.UserCreateParams
import cloud.qanapi.models.v3.users.UserDeleteParams
import cloud.qanapi.models.v3.users.UserListParams
import cloud.qanapi.models.v3.users.UserMeParams
import cloud.qanapi.models.v3.users.UserRestoreParams
import cloud.qanapi.models.v3.users.UserShowParams
import cloud.qanapi.models.v3.users.UserUpdateParams
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
    ): User

    /** Update user */
    fun update(
        user: Long,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = update(params.toBuilder().user(user).build(), requestOptions)

    /** @see update */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see update */
    fun update(user: Long, requestOptions: RequestOptions): User =
        update(user, UserUpdateParams.none(), requestOptions)

    /** List users */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<User>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<User> =
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
    ): User

    /** @see me */
    fun me(requestOptions: RequestOptions): User = me(UserMeParams.none(), requestOptions)

    /** Restore user */
    fun restore(
        user: Long,
        params: UserRestoreParams = UserRestoreParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = restore(params.toBuilder().user(user).build(), requestOptions)

    /** @see restore */
    fun restore(
        params: UserRestoreParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see restore */
    fun restore(user: Long, requestOptions: RequestOptions): User =
        restore(user, UserRestoreParams.none(), requestOptions)

    /** Get user */
    fun show(
        user: Long,
        params: UserShowParams = UserShowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = show(params.toBuilder().user(user).build(), requestOptions)

    /** @see show */
    fun show(params: UserShowParams, requestOptions: RequestOptions = RequestOptions.none()): User

    /** @see show */
    fun show(user: Long, requestOptions: RequestOptions): User =
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
        ): HttpResponseFor<User>

        /**
         * Returns a raw HTTP response for `patch /v3/users/{user}`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(
            user: Long,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> = update(params.toBuilder().user(user).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see update */
        @MustBeClosed
        fun update(user: Long, requestOptions: RequestOptions): HttpResponseFor<User> =
            update(user, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/users`, but is otherwise the same as
         * [UserService.list].
         */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<User>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<User>> =
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
        ): HttpResponseFor<User>

        /** @see me */
        @MustBeClosed
        fun me(requestOptions: RequestOptions): HttpResponseFor<User> =
            me(UserMeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v3/users/{user}/restore`, but is otherwise the
         * same as [UserService.restore].
         */
        @MustBeClosed
        fun restore(
            user: Long,
            params: UserRestoreParams = UserRestoreParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> = restore(params.toBuilder().user(user).build(), requestOptions)

        /** @see restore */
        @MustBeClosed
        fun restore(
            params: UserRestoreParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see restore */
        @MustBeClosed
        fun restore(user: Long, requestOptions: RequestOptions): HttpResponseFor<User> =
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
        ): HttpResponseFor<User> = show(params.toBuilder().user(user).build(), requestOptions)

        /** @see show */
        @MustBeClosed
        fun show(
            params: UserShowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see show */
        @MustBeClosed
        fun show(user: Long, requestOptions: RequestOptions): HttpResponseFor<User> =
            show(user, UserShowParams.none(), requestOptions)
    }
}
