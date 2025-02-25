// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPageAsync
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams
import java.util.concurrent.CompletableFuture

interface ReturnServiceAsync {

    /** Create a return. */
    @JvmOverloads
    fun create(
        params: ReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReturnObject>

    /** Get a single return. */
    @JvmOverloads
    fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReturnObject>

    /** Get a list of returns. */
    @JvmOverloads
    fun list(
        params: ReturnListParams = ReturnListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReturnListPageAsync>

    /** Get a list of returns. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ReturnListPageAsync> =
        list(ReturnListParams.none(), requestOptions)
}
