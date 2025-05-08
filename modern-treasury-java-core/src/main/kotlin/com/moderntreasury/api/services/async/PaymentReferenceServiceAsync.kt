// File generated from our OpenAPI spec by Stainless.

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
    fun retrieve(id: String): CompletableFuture<PaymentReference> =
        retrieve(id, PaymentReferenceRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReference> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
    ): CompletableFuture<PaymentReference> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReference>

    /** @see [retrieve] */
    fun retrieve(params: PaymentReferenceRetrieveParams): CompletableFuture<PaymentReference> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<PaymentReference> =
        retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

    /** list payment_references */
    fun list(): CompletableFuture<PaymentReferenceListPageAsync> =
        list(PaymentReferenceListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReferenceListPageAsync>

    /** @see [list] */
    fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none()
    ): CompletableFuture<PaymentReferenceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentReferenceListPageAsync> =
        list(PaymentReferenceListParams.none(), requestOptions)

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    fun retireve(id: String): CompletableFuture<PaymentReference> =
        retireve(id, PaymentReferenceRetireveParams.none())

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        id: String,
        params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReference> =
        retireve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        id: String,
        params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
    ): CompletableFuture<PaymentReference> = retireve(id, params, RequestOptions.none())

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentReference>

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(params: PaymentReferenceRetireveParams): CompletableFuture<PaymentReference> =
        retireve(params, RequestOptions.none())

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(id: String, requestOptions: RequestOptions): CompletableFuture<PaymentReference> =
        retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)

    /**
     * A view of [PaymentReferenceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retrieve(id, PaymentReferenceRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentReferenceRetrieveParams
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references`, but is otherwise the same
         * as [PaymentReferenceServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PaymentReferenceListPageAsync>> =
            list(PaymentReferenceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReferenceListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentReferenceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
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
        @MustBeClosed
        fun retireve(id: String): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retireve(id, PaymentReferenceRetireveParams.none())

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retireve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retireve(id, params, RequestOptions.none())

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentReference>>

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            params: PaymentReferenceRetireveParams
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retireve(params, RequestOptions.none())

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentReference>> =
            retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)
    }
}
