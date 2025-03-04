// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Invoice
import com.moderntreasury.api.models.InvoiceAddPaymentOrderParams
import com.moderntreasury.api.models.InvoiceCreateParams
import com.moderntreasury.api.models.InvoiceListPage
import com.moderntreasury.api.models.InvoiceListParams
import com.moderntreasury.api.models.InvoiceRetrieveParams
import com.moderntreasury.api.models.InvoiceUpdateParams
import com.moderntreasury.api.services.blocking.invoices.LineItemService

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lineItems(): LineItemService

    /** create invoice */
    @JvmOverloads
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** get invoice */
    @JvmOverloads
    fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** update invoice */
    @JvmOverloads
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** list invoices */
    @JvmOverloads
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPage

    /** list invoices */
    fun list(requestOptions: RequestOptions): InvoiceListPage =
        list(InvoiceListParams.none(), requestOptions)

    /** Add a payment order to an invoice. */
    @JvmOverloads
    fun addPaymentOrder(
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun lineItems(): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/invoices`, but is otherwise the same as
         * [InvoiceService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{id}`, but is otherwise the same as
         * [InvoiceService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `patch /api/invoices/{id}`, but is otherwise the same as
         * [InvoiceService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /api/invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPage>

        /**
         * Returns a raw HTTP response for `get /api/invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPage> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /api/invoices/{id}/payment_orders/{payment_order_id}`, but is otherwise the same as
         * [InvoiceService.addPaymentOrder].
         */
        @JvmOverloads
        @MustBeClosed
        fun addPaymentOrder(
            params: InvoiceAddPaymentOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
