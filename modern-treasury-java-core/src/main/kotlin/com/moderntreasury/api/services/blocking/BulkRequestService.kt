// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPage
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams

interface BulkRequestService {

    /** create bulk_request */
    @JvmOverloads
    fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** get bulk_request */
    @JvmOverloads
    fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** list bulk_requests */
    @JvmOverloads
    fun list(
        params: BulkRequestListParams = BulkRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequestListPage

    /** list bulk_requests */
    fun list(requestOptions: RequestOptions): BulkRequestListPage =
        list(BulkRequestListParams.none(), requestOptions)
}
