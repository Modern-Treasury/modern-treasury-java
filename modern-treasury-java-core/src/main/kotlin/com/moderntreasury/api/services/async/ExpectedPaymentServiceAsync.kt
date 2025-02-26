// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPageAsync
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams
import java.util.concurrent.CompletableFuture

interface ExpectedPaymentServiceAsync {

    /** create expected payment */
    @JvmOverloads
    fun create(
        params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** create expected payment */
    fun create(requestOptions: RequestOptions): CompletableFuture<ExpectedPayment> =
        create(ExpectedPaymentCreateParams.none(), requestOptions)

    /** get expected payment */
    @JvmOverloads
    fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** update expected payment */
    @JvmOverloads
    fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** list expected_payments */
    @JvmOverloads
    fun list(
        params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPaymentListPageAsync>

    /** list expected_payments */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExpectedPaymentListPageAsync> =
        list(ExpectedPaymentListParams.none(), requestOptions)

    /** delete expected payment */
    @JvmOverloads
    fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>
}
