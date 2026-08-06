// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.blocking.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.configurations.ConfigurationCreateParams
import cloud.qanapi.models.v3.configurations.ConfigurationCreateResponse
import cloud.qanapi.models.v3.configurations.ConfigurationDeleteParams
import cloud.qanapi.models.v3.configurations.ConfigurationListParams
import cloud.qanapi.models.v3.configurations.ConfigurationListResponse
import cloud.qanapi.models.v3.configurations.ConfigurationShowParams
import cloud.qanapi.models.v3.configurations.ConfigurationShowResponse
import cloud.qanapi.models.v3.configurations.ConfigurationUpdateParams
import cloud.qanapi.models.v3.configurations.ConfigurationUpdateResponse
import com.google.errorprone.annotations.MustBeClosed

interface ConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationService

    /** Create configuration */
    fun create(
        params: ConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationCreateResponse

    /** Update configuration */
    fun update(
        configuration: String,
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationUpdateResponse =
        update(params.toBuilder().configuration(configuration).build(), requestOptions)

    /** @see update */
    fun update(
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationUpdateResponse

    /** List configurations */
    fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ConfigurationListResponse>

    /** @see list */
    fun list(requestOptions: RequestOptions): List<ConfigurationListResponse> =
        list(ConfigurationListParams.none(), requestOptions)

    /** Delete configuration */
    fun delete(
        configuration: String,
        params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().configuration(configuration).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(configuration: String, requestOptions: RequestOptions) =
        delete(configuration, ConfigurationDeleteParams.none(), requestOptions)

    /** Get configuration */
    fun show(
        configuration: String,
        params: ConfigurationShowParams = ConfigurationShowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationShowResponse =
        show(params.toBuilder().configuration(configuration).build(), requestOptions)

    /** @see show */
    fun show(
        params: ConfigurationShowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConfigurationShowResponse

    /** @see show */
    fun show(configuration: String, requestOptions: RequestOptions): ConfigurationShowResponse =
        show(configuration, ConfigurationShowParams.none(), requestOptions)

    /**
     * A view of [ConfigurationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ConfigurationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v3/configurations`, but is otherwise the same as
         * [ConfigurationService.create].
         */
        @MustBeClosed
        fun create(
            params: ConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationCreateResponse>

        /**
         * Returns a raw HTTP response for `put /v3/configurations/{configuration}`, but is
         * otherwise the same as [ConfigurationService.update].
         */
        @MustBeClosed
        fun update(
            configuration: String,
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationUpdateResponse> =
            update(params.toBuilder().configuration(configuration).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v3/configurations`, but is otherwise the same as
         * [ConfigurationService.list].
         */
        @MustBeClosed
        fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ConfigurationListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<ConfigurationListResponse>> =
            list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v3/configurations/{configuration}`, but is
         * otherwise the same as [ConfigurationService.delete].
         */
        @MustBeClosed
        fun delete(
            configuration: String,
            params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().configuration(configuration).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(configuration: String, requestOptions: RequestOptions): HttpResponse =
            delete(configuration, ConfigurationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/configurations/{configuration}`, but is
         * otherwise the same as [ConfigurationService.show].
         */
        @MustBeClosed
        fun show(
            configuration: String,
            params: ConfigurationShowParams = ConfigurationShowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationShowResponse> =
            show(params.toBuilder().configuration(configuration).build(), requestOptions)

        /** @see show */
        @MustBeClosed
        fun show(
            params: ConfigurationShowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConfigurationShowResponse>

        /** @see show */
        @MustBeClosed
        fun show(
            configuration: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConfigurationShowResponse> =
            show(configuration, ConfigurationShowParams.none(), requestOptions)
    }
}
