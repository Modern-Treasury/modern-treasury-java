// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionCreateResponse
import com.moderntreasury.api.models.PaymentActionListPageAsync
import com.moderntreasury.api.models.PaymentActionListParams
import com.moderntreasury.api.models.PaymentActionRetrieveParams
import com.moderntreasury.api.models.PaymentActionRetrieveResponse
import com.moderntreasury.api.models.PaymentActionUpdateParams
import com.moderntreasury.api.models.PaymentActionUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PaymentActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentActionServiceAsync

    /** Create a payment action. */
    fun create(params: PaymentActionCreateParams): CompletableFuture<PaymentActionCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentActionCreateResponse>

    /** Get details on a single payment action. */
    fun retrieve(id: String): CompletableFuture<PaymentActionRetrieveResponse> =
        retrieve(id, PaymentActionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentActionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
    ): CompletableFuture<PaymentActionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentActionRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentActionRetrieveParams
    ): CompletableFuture<PaymentActionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentActionRetrieveResponse> =
        retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

    /** Update a single payment action. */
    fun update(
        id: String,
        params: PaymentActionUpdateParams,
    ): CompletableFuture<PaymentActionUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentActionUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PaymentActionUpdateParams): CompletableFuture<PaymentActionUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentActionUpdateResponse>

    /** Get a list of all payment actions. */
    fun list(): CompletableFuture<PaymentActionListPageAsync> = list(PaymentActionListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentActionListParams = PaymentActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentActionListPageAsync>

    /** @see [list] */
    fun list(
        params: PaymentActionListParams = PaymentActionListParams.none()
    ): CompletableFuture<PaymentActionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentActionListPageAsync> =
        list(PaymentActionListParams.none(), requestOptions)

    /**
     * A view of [PaymentActionServiceAsync] that provides access to raw HTTP responses for each
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
        ): PaymentActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_actions`, but is otherwise the same as
         * [PaymentActionServiceAsync.create].
         */
        fun create(
            params: PaymentActionCreateParams
        ): CompletableFuture<HttpResponseFor<PaymentActionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PaymentActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentActionCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<PaymentActionRetrieveResponse>> =
            retrieve(id, PaymentActionRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentActionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentActionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PaymentActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentActionRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: PaymentActionRetrieveParams
        ): CompletableFuture<HttpResponseFor<PaymentActionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentActionRetrieveResponse>> =
            retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionServiceAsync.update].
         */
        fun update(
            id: String,
            params: PaymentActionUpdateParams,
        ): CompletableFuture<HttpResponseFor<PaymentActionUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentActionUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: PaymentActionUpdateParams
        ): CompletableFuture<HttpResponseFor<PaymentActionUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentActionUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions`, but is otherwise the same as
         * [PaymentActionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PaymentActionListPageAsync>> =
            list(PaymentActionListParams.none())

        /** @see [list] */
        fun list(
            params: PaymentActionListParams = PaymentActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentActionListPageAsync>>

        /** @see [list] */
        fun list(
            params: PaymentActionListParams = PaymentActionListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentActionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentActionListPageAsync>> =
            list(PaymentActionListParams.none(), requestOptions)
    }
}
