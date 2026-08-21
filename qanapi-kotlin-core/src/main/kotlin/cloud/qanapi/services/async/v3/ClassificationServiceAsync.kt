// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.classifications.ClassificationCreateParams
import cloud.qanapi.models.v3.classifications.ClassificationCreateResponse
import cloud.qanapi.models.v3.classifications.ClassificationDeleteParams
import cloud.qanapi.models.v3.classifications.ClassificationListParams
import cloud.qanapi.models.v3.classifications.ClassificationListResponse
import cloud.qanapi.models.v3.classifications.ClassificationShowParams
import cloud.qanapi.models.v3.classifications.ClassificationShowResponse
import cloud.qanapi.models.v3.classifications.ClassificationUpdateParams
import cloud.qanapi.models.v3.classifications.ClassificationUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface ClassificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ClassificationServiceAsync

    /** Create classification */
    suspend fun create(
        params: ClassificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassificationCreateResponse

    /** Update classification */
    suspend fun update(
        classification: Long,
        params: ClassificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassificationUpdateResponse =
        update(params.toBuilder().classification(classification).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ClassificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassificationUpdateResponse

    /** List classifications */
    suspend fun list(
        params: ClassificationListParams = ClassificationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassificationListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ClassificationListResponse =
        list(ClassificationListParams.none(), requestOptions)

    /** Delete classification */
    suspend fun delete(
        classification: Long,
        params: ClassificationDeleteParams = ClassificationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().classification(classification).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ClassificationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(classification: Long, requestOptions: RequestOptions) =
        delete(classification, ClassificationDeleteParams.none(), requestOptions)

    /** Get classification */
    suspend fun show(
        classification: Long,
        params: ClassificationShowParams = ClassificationShowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassificationShowResponse =
        show(params.toBuilder().classification(classification).build(), requestOptions)

    /** @see show */
    suspend fun show(
        params: ClassificationShowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ClassificationShowResponse

    /** @see show */
    suspend fun show(
        classification: Long,
        requestOptions: RequestOptions,
    ): ClassificationShowResponse =
        show(classification, ClassificationShowParams.none(), requestOptions)

    /**
     * A view of [ClassificationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ClassificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v3/classifications`, but is otherwise the same as
         * [ClassificationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ClassificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassificationCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /v3/classifications/{classification}`, but is
         * otherwise the same as [ClassificationServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            classification: Long,
            params: ClassificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassificationUpdateResponse> =
            update(params.toBuilder().classification(classification).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ClassificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassificationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v3/classifications`, but is otherwise the same as
         * [ClassificationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ClassificationListParams = ClassificationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassificationListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ClassificationListResponse> =
            list(ClassificationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v3/classifications/{classification}`, but is
         * otherwise the same as [ClassificationServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            classification: Long,
            params: ClassificationDeleteParams = ClassificationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().classification(classification).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ClassificationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(classification: Long, requestOptions: RequestOptions): HttpResponse =
            delete(classification, ClassificationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/classifications/{classification}`, but is
         * otherwise the same as [ClassificationServiceAsync.show].
         */
        @MustBeClosed
        suspend fun show(
            classification: Long,
            params: ClassificationShowParams = ClassificationShowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassificationShowResponse> =
            show(params.toBuilder().classification(classification).build(), requestOptions)

        /** @see show */
        @MustBeClosed
        suspend fun show(
            params: ClassificationShowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ClassificationShowResponse>

        /** @see show */
        @MustBeClosed
        suspend fun show(
            classification: Long,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ClassificationShowResponse> =
            show(classification, ClassificationShowParams.none(), requestOptions)
    }
}
