// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPageAsync
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams
import java.util.concurrent.CompletableFuture

interface BulkRequestServiceAsync {

    /** create bulk_request */
    @JvmOverloads
    fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BulkRequest>

    /** get bulk_request */
    @JvmOverloads
    fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BulkRequest>

    /** list bulk_requests */
    @JvmOverloads
    fun list(
        params: BulkRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BulkRequestListPageAsync>
}
