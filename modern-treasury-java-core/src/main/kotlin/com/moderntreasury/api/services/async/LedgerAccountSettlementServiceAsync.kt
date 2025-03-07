// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPageAsync
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsync
import java.util.concurrent.CompletableFuture

interface LedgerAccountSettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun accountEntries(): AccountEntryServiceAsync

    /** Create a ledger account settlement. */
    fun create(
        params: LedgerAccountSettlementCreateParams
    ): CompletableFuture<LedgerAccountSettlement> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** Get details on a single ledger account settlement. */
    fun retrieve(
        params: LedgerAccountSettlementRetrieveParams
    ): CompletableFuture<LedgerAccountSettlement> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** Update the details of a ledger account settlement. */
    fun update(
        params: LedgerAccountSettlementUpdateParams
    ): CompletableFuture<LedgerAccountSettlement> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** Get a list of ledger account settlements. */
    fun list(): CompletableFuture<LedgerAccountSettlementListPageAsync> =
        list(LedgerAccountSettlementListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlementListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none()
    ): CompletableFuture<LedgerAccountSettlementListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountSettlementListPageAsync> =
        list(LedgerAccountSettlementListParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountSettlementServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        fun accountEntries(): AccountEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountSettlementCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountSettlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountSettlementRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountSettlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountSettlementUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountSettlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>> =
            list(LedgerAccountSettlementListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>> =
            list(LedgerAccountSettlementListParams.none(), requestOptions)
    }
}
