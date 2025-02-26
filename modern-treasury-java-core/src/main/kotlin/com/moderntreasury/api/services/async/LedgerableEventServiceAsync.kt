// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerableEvent
import com.moderntreasury.api.models.LedgerableEventCreateParams
import com.moderntreasury.api.models.LedgerableEventRetrieveParams
import java.util.concurrent.CompletableFuture

interface LedgerableEventServiceAsync {

    /** Create a ledgerable event. */
    @JvmOverloads
    fun create(
        params: LedgerableEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerableEvent>

    /** Get details on a single ledgerable event. */
    @JvmOverloads
    fun retrieve(
        params: LedgerableEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerableEvent>
}
