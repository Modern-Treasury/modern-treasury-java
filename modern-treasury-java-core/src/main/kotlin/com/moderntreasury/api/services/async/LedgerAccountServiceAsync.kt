// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPageAsync
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerAccountServiceAsync {

    /** Create a ledger account. */
    @JvmOverloads
    fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** Get details on a single ledger account. */
    @JvmOverloads
    fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** Update the details of a ledger account. */
    @JvmOverloads
    fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>

    /** Get a list of ledger accounts. */
    @JvmOverloads
    fun list(
        params: LedgerAccountListParams = LedgerAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountListPageAsync>

    /** Get a list of ledger accounts. */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerAccountListPageAsync> =
        list(LedgerAccountListParams.none(), requestOptions)

    /** Delete a ledger account. */
    @JvmOverloads
    fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccount>
}
