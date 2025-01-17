// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPageAsync
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams
import java.util.concurrent.CompletableFuture

interface PaymentReferenceServiceAsync {

    /** get payment_reference */
    @JvmOverloads
    fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentReference>

    /** list payment_references */
    @JvmOverloads
    fun list(
        params: PaymentReferenceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentReferenceListPageAsync>

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    @JvmOverloads
    fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentReference>
}
