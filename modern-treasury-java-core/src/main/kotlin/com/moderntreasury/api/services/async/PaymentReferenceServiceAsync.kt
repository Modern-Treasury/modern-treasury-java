// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPageAsync
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams
import java.util.concurrent.CompletableFuture

interface PaymentReferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** get payment_reference */
    @JvmOverloads
    fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReference>

    /** list payment_references */
    @JvmOverloads
    fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReferenceListPageAsync>

    /** list payment_references */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentReferenceListPageAsync> =
        list(PaymentReferenceListParams.none(), requestOptions)

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    @JvmOverloads
    fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReference>

    /**
     * A view of [PaymentReferenceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>>

        /**
         * Returns a raw HTTP response for `get /api/payment_references`, but is otherwise the same
         * as [PaymentReferenceServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReferenceListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/payment_references`, but is otherwise the same
         * as [PaymentReferenceServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentReferenceListPageAsync>> =
            list(PaymentReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceServiceAsync.retireve].
         */
        @Deprecated("use `retrieve` instead")
        @JvmOverloads
        @MustBeClosed
        fun retireve(
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>>
    }
}
