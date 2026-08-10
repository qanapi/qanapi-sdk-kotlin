// File generated from our OpenAPI spec by Stainless.

package cloud.qanapi.services.async.v3

import cloud.qanapi.core.ClientOptions
import cloud.qanapi.core.RequestOptions
import cloud.qanapi.core.http.HttpResponse
import cloud.qanapi.core.http.HttpResponseFor
import cloud.qanapi.models.v3.Configuration
import cloud.qanapi.models.v3.configurations.ConfigurationCreateParams
import cloud.qanapi.models.v3.configurations.ConfigurationDeleteParams
import cloud.qanapi.models.v3.configurations.ConfigurationListParams
import cloud.qanapi.models.v3.configurations.ConfigurationShowParams
import cloud.qanapi.models.v3.configurations.ConfigurationUpdateParams
import com.google.errorprone.annotations.MustBeClosed

interface ConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConfigurationServiceAsync

    /** Create configuration */
    suspend fun create(
        params: ConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Configuration

    /** Update configuration */
    suspend fun update(
        configuration: String,
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Configuration =
        update(params.toBuilder().configuration(configuration).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Configuration

    /** List configurations */
    suspend fun list(
        params: ConfigurationListParams = ConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Configuration>

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): List<Configuration> =
        list(ConfigurationListParams.none(), requestOptions)

    /** Delete configuration */
    suspend fun delete(
        configuration: String,
        params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().configuration(configuration).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(configuration: String, requestOptions: RequestOptions) =
        delete(configuration, ConfigurationDeleteParams.none(), requestOptions)

    /** Get configuration */
    suspend fun show(
        configuration: String,
        params: ConfigurationShowParams = ConfigurationShowParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Configuration = show(params.toBuilder().configuration(configuration).build(), requestOptions)

    /** @see show */
    suspend fun show(
        params: ConfigurationShowParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Configuration

    /** @see show */
    suspend fun show(configuration: String, requestOptions: RequestOptions): Configuration =
        show(configuration, ConfigurationShowParams.none(), requestOptions)

    /**
     * A view of [ConfigurationServiceAsync] that provides access to raw HTTP responses for each
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
        ): ConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v3/configurations`, but is otherwise the same as
         * [ConfigurationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Configuration>

        /**
         * Returns a raw HTTP response for `put /v3/configurations/{configuration}`, but is
         * otherwise the same as [ConfigurationServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            configuration: String,
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Configuration> =
            update(params.toBuilder().configuration(configuration).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Configuration>

        /**
         * Returns a raw HTTP response for `get /v3/configurations`, but is otherwise the same as
         * [ConfigurationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ConfigurationListParams = ConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Configuration>>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<List<Configuration>> =
            list(ConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v3/configurations/{configuration}`, but is
         * otherwise the same as [ConfigurationServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            configuration: String,
            params: ConfigurationDeleteParams = ConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().configuration(configuration).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(configuration: String, requestOptions: RequestOptions): HttpResponse =
            delete(configuration, ConfigurationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v3/configurations/{configuration}`, but is
         * otherwise the same as [ConfigurationServiceAsync.show].
         */
        @MustBeClosed
        suspend fun show(
            configuration: String,
            params: ConfigurationShowParams = ConfigurationShowParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Configuration> =
            show(params.toBuilder().configuration(configuration).build(), requestOptions)

        /** @see show */
        @MustBeClosed
        suspend fun show(
            params: ConfigurationShowParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Configuration>

        /** @see show */
        @MustBeClosed
        suspend fun show(
            configuration: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Configuration> =
            show(configuration, ConfigurationShowParams.none(), requestOptions)
    }
}
