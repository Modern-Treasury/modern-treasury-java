// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.ledgerAccountSettlements

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryDeleteParams
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryUpdateParams

interface AccountEntryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Add ledger entries to a draft ledger account settlement. */
    fun update(params: LedgerAccountSettlementAccountEntryUpdateParams) =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountSettlementAccountEntryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Remove ledger entries from a draft ledger account settlement. */
    fun delete(params: LedgerAccountSettlementAccountEntryDeleteParams) =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerAccountSettlementAccountEntryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [AccountEntryService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `patch
         * /api/ledger_account_settlements/{id}/ledger_entries`, but is otherwise the same as
         * [AccountEntryService.update].
         */
        @MustBeClosed
        fun update(params: LedgerAccountSettlementAccountEntryUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountSettlementAccountEntryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_settlements/{id}/ledger_entries`, but is otherwise the same as
         * [AccountEntryService.delete].
         */
        @MustBeClosed
        fun delete(params: LedgerAccountSettlementAccountEntryDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerAccountSettlementAccountEntryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
