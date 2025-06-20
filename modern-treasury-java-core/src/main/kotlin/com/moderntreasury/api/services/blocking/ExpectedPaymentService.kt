// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPage
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams
import java.util.function.Consumer

interface ExpectedPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExpectedPaymentService

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
    fun retrieve(id: String): ExpectedPayment = retrieve(id, ExpectedPaymentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
    ): ExpectedPayment = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** @see [retrieve] */
    fun retrieve(params: ExpectedPaymentRetrieveParams): ExpectedPayment =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): ExpectedPayment =
        retrieve(id, ExpectedPaymentRetrieveParams.none(), requestOptions)

    /** update expected payment */
    fun update(id: String): ExpectedPayment = update(id, ExpectedPaymentUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
    ): ExpectedPayment = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** @see [update] */
    fun update(params: ExpectedPaymentUpdateParams): ExpectedPayment =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): ExpectedPayment =
        update(id, ExpectedPaymentUpdateParams.none(), requestOptions)

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
    fun delete(id: String): ExpectedPayment = delete(id, ExpectedPaymentDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
    ): ExpectedPayment = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExpectedPayment

    /** @see [delete] */
    fun delete(params: ExpectedPaymentDeleteParams): ExpectedPayment =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): ExpectedPayment =
        delete(id, ExpectedPaymentDeleteParams.none(), requestOptions)

    /**
     * A view of [ExpectedPaymentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExpectedPaymentService.WithRawResponse

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
        fun retrieve(id: String): HttpResponseFor<ExpectedPayment> =
            retrieve(id, ExpectedPaymentRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
        ): HttpResponseFor<ExpectedPayment> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExpectedPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ExpectedPaymentRetrieveParams): HttpResponseFor<ExpectedPayment> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<ExpectedPayment> =
            retrieve(id, ExpectedPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<ExpectedPayment> =
            update(id, ExpectedPaymentUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
        ): HttpResponseFor<ExpectedPayment> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExpectedPaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment>

        /** @see [update] */
        @MustBeClosed
        fun update(params: ExpectedPaymentUpdateParams): HttpResponseFor<ExpectedPayment> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<ExpectedPayment> =
            update(id, ExpectedPaymentUpdateParams.none(), requestOptions)

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
        fun delete(id: String): HttpResponseFor<ExpectedPayment> =
            delete(id, ExpectedPaymentDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
        ): HttpResponseFor<ExpectedPayment> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExpectedPaymentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExpectedPayment>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ExpectedPaymentDeleteParams): HttpResponseFor<ExpectedPayment> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<ExpectedPayment> =
            delete(id, ExpectedPaymentDeleteParams.none(), requestOptions)
    }
}
