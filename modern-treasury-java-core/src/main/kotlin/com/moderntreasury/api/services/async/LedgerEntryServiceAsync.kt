// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerEntry
import com.moderntreasury.api.models.LedgerEntryListPageAsync
import com.moderntreasury.api.models.LedgerEntryListParams
import com.moderntreasury.api.models.LedgerEntryRetrieveParams
import com.moderntreasury.api.models.LedgerEntryUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details on a single ledger entry. */
    fun retrieve(id: String): CompletableFuture<LedgerEntry> =
        retrieve(id, LedgerEntryRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntry> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
    ): CompletableFuture<LedgerEntry> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntry>

    /** @see [retrieve] */
    fun retrieve(params: LedgerEntryRetrieveParams): CompletableFuture<LedgerEntry> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerEntry> =
        retrieve(id, LedgerEntryRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger entry. */
    fun update(id: String): CompletableFuture<LedgerEntry> =
        update(id, LedgerEntryUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntry> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
    ): CompletableFuture<LedgerEntry> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerEntryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntry>

    /** @see [update] */
    fun update(params: LedgerEntryUpdateParams): CompletableFuture<LedgerEntry> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerEntry> =
        update(id, LedgerEntryUpdateParams.none(), requestOptions)

    /** Get a list of all ledger entries. */
    fun list(): CompletableFuture<LedgerEntryListPageAsync> = list(LedgerEntryListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerEntryListParams = LedgerEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntryListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerEntryListParams = LedgerEntryListParams.none()
    ): CompletableFuture<LedgerEntryListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerEntryListPageAsync> =
        list(LedgerEntryListParams.none(), requestOptions)

    /**
     * A view of [LedgerEntryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/ledger_entries/{id}`, but is otherwise the same
         * as [LedgerEntryServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            retrieve(id, LedgerEntryRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerEntryRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            retrieve(id, LedgerEntryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_entries/{id}`, but is otherwise the
         * same as [LedgerEntryServiceAsync.update].
         */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            update(id, LedgerEntryUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerEntryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerEntryUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerEntry>> =
            update(id, LedgerEntryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_entries`, but is otherwise the same as
         * [LedgerEntryServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(LedgerEntryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerEntryListParams = LedgerEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerEntryListParams = LedgerEntryListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(LedgerEntryListParams.none(), requestOptions)
    }
}
