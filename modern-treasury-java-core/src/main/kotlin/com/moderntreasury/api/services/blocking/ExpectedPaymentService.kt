// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPage
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams

interface ExpectedPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create expected payment */
    fun create(): ExpectedPayment = create(ExpectedPaymentCreateParams.none())

    /** @see [create] */
    fun create(
        params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** @see [create] */
    fun create(
        params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none()
    ): ExpectedPayment = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ExpectedPayment =
        create(ExpectedPaymentCreateParams.none(), requestOptions)

    /** get expected payment */
    fun retrieve(params: ExpectedPaymentRetrieveParams): ExpectedPayment =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** update expected payment */
    fun update(params: ExpectedPaymentUpdateParams): ExpectedPayment =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** list expected_payments */
    fun list(): ExpectedPaymentListPage = list(ExpectedPaymentListParams.none())

    /** @see [list] */
    fun list(
        params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPaymentListPage

    /** @see [list] */
    fun list(
        params: ExpectedPaymentListParams = ExpectedPaymentListParams.none()
    ): ExpectedPaymentListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ExpectedPaymentListPage =
        list(ExpectedPaymentListParams.none(), requestOptions)

    /** delete expected payment */
    fun delete(params: ExpectedPaymentDeleteParams): ExpectedPayment =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /**
     * A view of [ExpectedPaymentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ExpectedPayment> = create(ExpectedPaymentCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none()
        ): HttpResponseFor<ExpectedPayment> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ExpectedPayment> =
            create(ExpectedPaymentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ExpectedPaymentRetrieveParams): HttpResponseFor<ExpectedPayment> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExpectedPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment>

        /**
         * Returns a raw HTTP response for `patch /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentService.update].
         */
        @MustBeClosed
        fun update(params: ExpectedPaymentUpdateParams): HttpResponseFor<ExpectedPayment> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExpectedPaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment>

        /**
         * Returns a raw HTTP response for `get /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExpectedPaymentListPage> =
            list(ExpectedPaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPaymentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExpectedPaymentListParams = ExpectedPaymentListParams.none()
        ): HttpResponseFor<ExpectedPaymentListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExpectedPaymentListPage> =
            list(ExpectedPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/expected_payments/{id}`, but is otherwise
         * the same as [ExpectedPaymentService.delete].
         */
        @MustBeClosed
        fun delete(params: ExpectedPaymentDeleteParams): HttpResponseFor<ExpectedPayment> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExpectedPaymentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment>
    }
}
