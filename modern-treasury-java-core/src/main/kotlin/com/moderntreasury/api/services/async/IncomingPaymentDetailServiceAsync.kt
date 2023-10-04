// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPageAsync
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams
import java.util.concurrent.CompletableFuture

interface IncomingPaymentDetailServiceAsync {

    /** Get an existing Incoming Payment Detail. */
    @JvmOverloads
    fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IncomingPaymentDetail>

    /** Update an existing Incoming Payment Detail. */
    @JvmOverloads
    fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IncomingPaymentDetail>

    /** Get a list of Incoming Payment Details. */
    @JvmOverloads
    fun list(
        params: IncomingPaymentDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<IncomingPaymentDetailListPageAsync>

    /** Simulate Incoming Payment Detail */
    @JvmOverloads
    fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AsyncResponse>
}
