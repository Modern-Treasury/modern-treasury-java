// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalSourceListParams
import com.moderntreasury.api.models.JournalSourceRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JournalSourceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalSourceServiceAsync

    /** Retrieve a specific journal source */
    fun retrieve(id: String): CompletableFuture<Void?> =
        retrieve(id, JournalSourceRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JournalSourceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: JournalSourceRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, JournalSourceRetrieveParams.none(), requestOptions)

    /** Retrieve a list of journal sources */
    fun list(): CompletableFuture<Void?> = list(JournalSourceListParams.none())

    /** @see list */
    fun list(
        params: JournalSourceListParams = JournalSourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(
        params: JournalSourceListParams = JournalSourceListParams.none()
    ): CompletableFuture<Void?> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(JournalSourceListParams.none(), requestOptions)

    /**
     * A view of [JournalSourceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JournalSourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_sources/{id}`, but is otherwise the
         * same as [JournalSourceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, JournalSourceRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JournalSourceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: JournalSourceRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, JournalSourceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_sources`, but is otherwise the same as
         * [JournalSourceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(JournalSourceListParams.none())

        /** @see list */
        fun list(
            params: JournalSourceListParams = JournalSourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: JournalSourceListParams = JournalSourceListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(JournalSourceListParams.none(), requestOptions)
    }
}
