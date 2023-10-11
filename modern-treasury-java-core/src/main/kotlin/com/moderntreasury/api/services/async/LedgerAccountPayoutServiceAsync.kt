// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountPayout
import com.moderntreasury.api.models.LedgerAccountPayoutCreateParams
import com.moderntreasury.api.models.LedgerAccountPayoutListPageAsync
import com.moderntreasury.api.models.LedgerAccountPayoutListParams
import com.moderntreasury.api.models.LedgerAccountPayoutRetireveParams
import com.moderntreasury.api.models.LedgerAccountPayoutRetrieveParams
import com.moderntreasury.api.models.LedgerAccountPayoutUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerAccountPayoutServiceAsync {

    /** Create a ledger account payout. */
    @JvmOverloads
    fun create(
        params: LedgerAccountPayoutCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountPayout>

    /** Get details on a single ledger account payout. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountPayoutRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountPayout>

    /** Update the details of a ledger account payout. */
    @JvmOverloads
    fun update(
        params: LedgerAccountPayoutUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountPayout>

    /** Get a list of ledger account payouts. */
    @JvmOverloads
    fun list(
        params: LedgerAccountPayoutListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountPayoutListPageAsync>

    /** Get details on a single ledger account payout. */
    @JvmOverloads
    @Deprecated("use `retrieve` instead")
    fun retireve(
        params: LedgerAccountPayoutRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerAccountPayout>
}
