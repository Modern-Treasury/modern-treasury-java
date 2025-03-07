// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPageAsync
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerAccountBalanceMonitorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account balance monitor. */
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** Get details on a single ledger account balance monitor. */
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** Update a ledger account balance monitor. */
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /** Get a list of ledger account balance monitors. */
    fun list(): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        list(LedgerAccountBalanceMonitorListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountBalanceMonitorListParams =
            LedgerAccountBalanceMonitorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerAccountBalanceMonitorListParams = LedgerAccountBalanceMonitorListParams.none()
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountBalanceMonitorListPageAsync> =
        list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

    /** Delete a ledger account balance monitor. */
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams
    ): CompletableFuture<LedgerAccountBalanceMonitor> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountBalanceMonitor>

    /**
     * A view of [LedgerAccountBalanceMonitorServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountBalanceMonitorCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountBalanceMonitorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountBalanceMonitorUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountBalanceMonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>> =
            list(LedgerAccountBalanceMonitorListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>> =
            list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_balance_monitors/{id}`, but
         * is otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountBalanceMonitor>>
    }
}
