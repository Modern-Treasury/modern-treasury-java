// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPageAsync
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerServiceAsync {

    /** Create a ledger. */
    @JvmOverloads
    fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** Get details on a single ledger. */
    @JvmOverloads
    fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** Update the details of a ledger. */
    @JvmOverloads
    fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>

    /** Get a list of ledgers. */
    @JvmOverloads
    fun list(
        params: LedgerListParams = LedgerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerListPageAsync>

    /** Get a list of ledgers. */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerListPageAsync> =
        list(LedgerListParams.none(), requestOptions)

    /** Delete a ledger. */
    @JvmOverloads
    fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Ledger>
}
