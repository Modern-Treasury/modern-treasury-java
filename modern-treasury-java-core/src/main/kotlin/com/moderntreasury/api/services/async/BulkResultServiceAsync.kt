// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPageAsync
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams
import java.util.concurrent.CompletableFuture

interface BulkResultServiceAsync {

    /** get bulk_result */
    @JvmOverloads
    fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkResult>

    /** list bulk_results */
    @JvmOverloads
    fun list(
        params: BulkResultListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkResultListPageAsync>
}
