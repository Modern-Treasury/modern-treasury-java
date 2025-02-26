// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPageAsync
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsync
import java.util.concurrent.CompletableFuture

interface LedgerAccountSettlementServiceAsync {

    fun accountEntries(): AccountEntryServiceAsync

    /** Create a ledger account settlement. */
    @JvmOverloads
    fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** Get details on a single ledger account settlement. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** Update the details of a ledger account settlement. */
    @JvmOverloads
    fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** Get a list of ledger account settlements. */
    @JvmOverloads
    fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlementListPageAsync>

    /** Get a list of ledger account settlements. */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountSettlementListPageAsync> =
        list(LedgerAccountSettlementListParams.none(), requestOptions)
}
