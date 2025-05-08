// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPage
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams

interface PaymentReferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** get payment_reference */
    fun retrieve(id: String): PaymentReference = retrieve(id, PaymentReferenceRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
    ): PaymentReference = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /** @see [retrieve] */
    fun retrieve(params: PaymentReferenceRetrieveParams): PaymentReference =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PaymentReference =
        retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

    /** list payment_references */
    fun list(): PaymentReferenceListPage = list(PaymentReferenceListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReferenceListPage

    /** @see [list] */
    fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none()
    ): PaymentReferenceListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PaymentReferenceListPage =
        list(PaymentReferenceListParams.none(), requestOptions)

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    fun retireve(id: String): PaymentReference = retireve(id, PaymentReferenceRetireveParams.none())

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        id: String,
        params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference = retireve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        id: String,
        params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
    ): PaymentReference = retireve(id, params, RequestOptions.none())

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(params: PaymentReferenceRetireveParams): PaymentReference =
        retireve(params, RequestOptions.none())

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(id: String, requestOptions: RequestOptions): PaymentReference =
        retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)

    /**
     * A view of [PaymentReferenceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PaymentReference> =
            retrieve(id, PaymentReferenceRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
        ): HttpResponseFor<PaymentReference> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PaymentReferenceRetrieveParams): HttpResponseFor<PaymentReference> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> =
            retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references`, but is otherwise the same
         * as [PaymentReferenceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PaymentReferenceListPage> =
            list(PaymentReferenceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReferenceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none()
        ): HttpResponseFor<PaymentReferenceListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentReferenceListPage> =
            list(PaymentReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceService.retireve].
         */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(id: String): HttpResponseFor<PaymentReference> =
            retireve(id, PaymentReferenceRetireveParams.none())

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference> =
            retireve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
        ): HttpResponseFor<PaymentReference> = retireve(id, params, RequestOptions.none())

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(params: PaymentReferenceRetireveParams): HttpResponseFor<PaymentReference> =
            retireve(params, RequestOptions.none())

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> =
            retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)
    }
}
