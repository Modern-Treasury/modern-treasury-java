// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalReportListParams
import com.moderntreasury.api.models.JournalReportRetrieveParams
import com.moderntreasury.api.models.JournalReportUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JournalReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalReportServiceAsync

    /** Retrieve a specific journal report */
    fun retrieve(id: String): CompletableFuture<Void?> =
        retrieve(id, JournalReportRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JournalReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: JournalReportRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, JournalReportRetrieveParams.none(), requestOptions)

    /** Update a journal report */
    fun update(id: String): CompletableFuture<Void?> = update(id, JournalReportUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: JournalReportUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: JournalReportUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, JournalReportUpdateParams.none(), requestOptions)

    /** Retrieve a list of journal reports */
    fun list(): CompletableFuture<Void?> = list(JournalReportListParams.none())

    /** @see list */
    fun list(
        params: JournalReportListParams = JournalReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(
        params: JournalReportListParams = JournalReportListParams.none()
    ): CompletableFuture<Void?> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(JournalReportListParams.none(), requestOptions)

    /**
     * A view of [JournalReportServiceAsync] that provides access to raw HTTP responses for each
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
        ): JournalReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_reports/{id}`, but is otherwise the
         * same as [JournalReportServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, JournalReportRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JournalReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: JournalReportRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, JournalReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/journal_reports/{id}`, but is otherwise the
         * same as [JournalReportServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> =
            update(id, JournalReportUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: JournalReportUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: JournalReportUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, JournalReportUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_reports`, but is otherwise the same as
         * [JournalReportServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(JournalReportListParams.none())

        /** @see list */
        fun list(
            params: JournalReportListParams = JournalReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: JournalReportListParams = JournalReportListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(JournalReportListParams.none(), requestOptions)
    }
}
