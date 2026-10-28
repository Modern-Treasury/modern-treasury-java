// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentAction
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionListPage
import com.moderntreasury.api.models.PaymentActionListParams
import com.moderntreasury.api.models.PaymentActionRetrieveParams
import com.moderntreasury.api.models.PaymentActionUpdateParams
import java.util.function.Consumer

interface PaymentActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentActionService

    /** Create a payment action. */
    fun create(params: PaymentActionCreateParams): PaymentAction =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PaymentActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** Get details on a single payment action. */
    fun retrieve(id: String): PaymentAction = retrieve(id, PaymentActionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
    ): PaymentAction = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PaymentActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** @see retrieve */
    fun retrieve(params: PaymentActionRetrieveParams): PaymentAction =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PaymentAction =
        retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

    /** Update a single payment action. */
    fun update(id: String, params: PaymentActionUpdateParams): PaymentAction =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: PaymentActionUpdateParams): PaymentAction =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** Get a list of all payment actions. */
    fun list(): PaymentActionListPage = list(PaymentActionListParams.none())

    /** @see list */
    fun list(
        params: PaymentActionListParams = PaymentActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentActionListPage

    /** @see list */
    fun list(
        params: PaymentActionListParams = PaymentActionListParams.none()
    ): PaymentActionListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PaymentActionListPage =
        list(PaymentActionListParams.none(), requestOptions)

    /**
     * A view of [PaymentActionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_actions`, but is otherwise the same as
         * [PaymentActionService.create].
         */
        @MustBeClosed
        fun create(params: PaymentActionCreateParams): HttpResponseFor<PaymentAction> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PaymentActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PaymentAction> =
            retrieve(id, PaymentActionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
        ): HttpResponseFor<PaymentAction> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PaymentActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PaymentActionRetrieveParams): HttpResponseFor<PaymentAction> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<PaymentAction> =
            retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionService.update].
         */
        @MustBeClosed
        fun update(id: String, params: PaymentActionUpdateParams): HttpResponseFor<PaymentAction> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PaymentActionUpdateParams): HttpResponseFor<PaymentAction> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions`, but is otherwise the same as
         * [PaymentActionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PaymentActionListPage> = list(PaymentActionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PaymentActionListParams = PaymentActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentActionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PaymentActionListParams = PaymentActionListParams.none()
        ): HttpResponseFor<PaymentActionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentActionListPage> =
            list(PaymentActionListParams.none(), requestOptions)
    }
}
