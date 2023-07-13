@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPageAsync
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import java.util.concurrent.CompletableFuture

interface PaymentReferenceServiceAsync {

    /** list payment_references */
    @JvmOverloads
    fun list(
        params: PaymentReferenceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentReferenceListPageAsync>

    /** get payment_reference */
    @JvmOverloads
    fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentReference>
}
