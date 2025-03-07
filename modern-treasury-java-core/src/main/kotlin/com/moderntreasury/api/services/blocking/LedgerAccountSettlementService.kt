// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPage
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.blocking.ledgerAccountSettlements.AccountEntryService

interface LedgerAccountSettlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun accountEntries(): AccountEntryService

    /** Create a ledger account settlement. */
    fun create(params: LedgerAccountSettlementCreateParams): LedgerAccountSettlement =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Get details on a single ledger account settlement. */
    fun retrieve(params: LedgerAccountSettlementRetrieveParams): LedgerAccountSettlement =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Update the details of a ledger account settlement. */
    fun update(params: LedgerAccountSettlementUpdateParams): LedgerAccountSettlement =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Get a list of ledger account settlements. */
    fun list(): LedgerAccountSettlementListPage = list(LedgerAccountSettlementListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlementListPage

    /** @see [list] */
    fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none()
    ): LedgerAccountSettlementListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerAccountSettlementListPage =
        list(LedgerAccountSettlementListParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountSettlementService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        fun accountEntries(): AccountEntryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountSettlementCreateParams
        ): HttpResponseFor<LedgerAccountSettlement> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountSettlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountSettlementRetrieveParams
        ): HttpResponseFor<LedgerAccountSettlement> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountSettlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementService.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountSettlementUpdateParams
        ): HttpResponseFor<LedgerAccountSettlement> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountSettlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LedgerAccountSettlementListPage> =
            list(LedgerAccountSettlementListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlementListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none()
        ): HttpResponseFor<LedgerAccountSettlementListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerAccountSettlementListPage> =
            list(LedgerAccountSettlementListParams.none(), requestOptions)
    }
}
