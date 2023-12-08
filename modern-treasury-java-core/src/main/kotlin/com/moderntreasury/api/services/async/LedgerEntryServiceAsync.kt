// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerEntry
import com.moderntreasury.api.models.LedgerEntryListPageAsync
import com.moderntreasury.api.models.LedgerEntryListParams
import com.moderntreasury.api.models.LedgerEntryRetrieveParams
import com.moderntreasury.api.models.LedgerEntryUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerEntryServiceAsync {

    /** Get details on a single ledger entry. */
    @JvmOverloads
    fun retrieve(
        params: LedgerEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerEntry>

    /** Update the details of a ledger entry. */
    @JvmOverloads
    fun update(
        params: LedgerEntryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerEntry>

    /** Get a list of all ledger entries. */
    @JvmOverloads
    fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<LedgerEntryListPageAsync>
}
