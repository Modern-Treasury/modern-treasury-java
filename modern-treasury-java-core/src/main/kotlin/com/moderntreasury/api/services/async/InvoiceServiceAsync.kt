// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Invoice
import com.moderntreasury.api.models.InvoiceAddPaymentOrderParams
import com.moderntreasury.api.models.InvoiceCreateParams
import com.moderntreasury.api.models.InvoiceListPageAsync
import com.moderntreasury.api.models.InvoiceListParams
import com.moderntreasury.api.models.InvoiceRetrieveParams
import com.moderntreasury.api.models.InvoiceUpdateParams
import com.moderntreasury.api.services.async.invoices.LineItemServiceAsync
import java.util.concurrent.CompletableFuture

interface InvoiceServiceAsync {

    fun lineItems(): LineItemServiceAsync

    /** create invoice */
    @JvmOverloads
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Invoice>

    /** get invoice */
    @JvmOverloads
    fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Invoice>

    /** update invoice */
    @JvmOverloads
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Invoice>

    /** list invoices */
    @JvmOverloads
    fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<InvoiceListPageAsync>

    /** Add a payment order to an invoice. */
    @JvmOverloads
    fun addPaymentOrder(
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void?>
}
