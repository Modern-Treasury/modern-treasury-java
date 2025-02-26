// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerEventHandler
import com.moderntreasury.api.models.LedgerEventHandlerCreateParams
import com.moderntreasury.api.models.LedgerEventHandlerDeleteParams
import com.moderntreasury.api.models.LedgerEventHandlerListPageAsync
import com.moderntreasury.api.models.LedgerEventHandlerListParams
import com.moderntreasury.api.models.LedgerEventHandlerRetrieveParams
import java.util.concurrent.CompletableFuture

interface LedgerEventHandlerServiceAsync {

    /** create ledger_event_handler */
    @JvmOverloads
    fun create(
        params: LedgerEventHandlerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>

    /** Get details on a single ledger event handler. */
    @JvmOverloads
    fun retrieve(
        params: LedgerEventHandlerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>

    /** Get a list of ledger event handlers. */
    @JvmOverloads
    fun list(
        params: LedgerEventHandlerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandlerListPageAsync>

    /** Archive a ledger event handler. */
    @JvmOverloads
    fun delete(
        params: LedgerEventHandlerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEventHandler>
}
