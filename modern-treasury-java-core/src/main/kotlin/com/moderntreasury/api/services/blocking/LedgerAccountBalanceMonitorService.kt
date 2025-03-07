// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPage
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams

interface LedgerAccountBalanceMonitorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account balance monitor. */
    fun create(params: LedgerAccountBalanceMonitorCreateParams): LedgerAccountBalanceMonitor =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get details on a single ledger account balance monitor. */
    fun retrieve(params: LedgerAccountBalanceMonitorRetrieveParams): LedgerAccountBalanceMonitor =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Update a ledger account balance monitor. */
    fun update(params: LedgerAccountBalanceMonitorUpdateParams): LedgerAccountBalanceMonitor =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get a list of ledger account balance monitors. */
    fun list(): LedgerAccountBalanceMonitorListPage =
        list(LedgerAccountBalanceMonitorListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountBalanceMonitorListParams =
            LedgerAccountBalanceMonitorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitorListPage

    /** @see [list] */
    fun list(
        params: LedgerAccountBalanceMonitorListParams = LedgerAccountBalanceMonitorListParams.none()
    ): LedgerAccountBalanceMonitorListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerAccountBalanceMonitorListPage =
        list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

    /** Delete a ledger account balance monitor. */
    fun delete(params: LedgerAccountBalanceMonitorDeleteParams): LedgerAccountBalanceMonitor =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /**
     * A view of [LedgerAccountBalanceMonitorService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountBalanceMonitorCreateParams
        ): HttpResponseFor<LedgerAccountBalanceMonitor> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountBalanceMonitorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams
        ): HttpResponseFor<LedgerAccountBalanceMonitor> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountBalanceMonitorUpdateParams
        ): HttpResponseFor<LedgerAccountBalanceMonitor> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountBalanceMonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LedgerAccountBalanceMonitorListPage> =
            list(LedgerAccountBalanceMonitorListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitorListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none()
        ): HttpResponseFor<LedgerAccountBalanceMonitorListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerAccountBalanceMonitorListPage> =
            list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_balance_monitors/{id}`, but
         * is otherwise the same as [LedgerAccountBalanceMonitorService.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams
        ): HttpResponseFor<LedgerAccountBalanceMonitor> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>
    }
}
