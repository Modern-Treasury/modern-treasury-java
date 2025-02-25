// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ConnectionListPageAsync
import com.moderntreasury.api.models.ConnectionListParams
import java.util.concurrent.CompletableFuture

interface ConnectionServiceAsync {

    /** Get a list of all connections. */
    @JvmOverloads
    fun list(
        params: ConnectionListParams = ConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionListPageAsync>

    /** Get a list of all connections. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConnectionListPageAsync> =
        list(ConnectionListParams.none(), requestOptions)
}
