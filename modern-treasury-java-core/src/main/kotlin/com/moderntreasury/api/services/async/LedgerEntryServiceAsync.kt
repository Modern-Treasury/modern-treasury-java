// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun retrieve(
        params: LedgerEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntry>

    /** Update the details of a ledger entry. */
    @JvmOverloads
    fun update(
        params: LedgerEntryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntry>

    /** Get a list of all ledger entries. */
    @JvmOverloads
    fun list(
        params: LedgerEntryListParams = LedgerEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntryListPageAsync>

    /** Get a list of all ledger entries. */
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LedgerEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_entries/{id}`, but is otherwise the
         * same as [LedgerEntryServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: LedgerEntryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntry>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_entries`, but is otherwise the same as
         * [LedgerEntryServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LedgerEntryListParams = LedgerEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_entries`, but is otherwise the same as
         * [LedgerEntryServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(LedgerEntryListParams.none(), requestOptions)
    }
}
