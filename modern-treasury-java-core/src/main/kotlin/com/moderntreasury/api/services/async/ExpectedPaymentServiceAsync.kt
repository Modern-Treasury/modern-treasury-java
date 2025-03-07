// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPageAsync
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams
import java.util.concurrent.CompletableFuture

interface ExpectedPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create expected payment */
    fun create(): CompletableFuture<ExpectedPayment> = create(ExpectedPaymentCreateParams.none())

    /** @see [create] */
    fun create(
        params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** @see [create] */
    fun create(
        params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none()
    ): CompletableFuture<ExpectedPayment> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<ExpectedPayment> =
        create(ExpectedPaymentCreateParams.none(), requestOptions)

    /** get expected payment */
    fun retrieve(params: ExpectedPaymentRetrieveParams): CompletableFuture<ExpectedPayment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** update expected payment */
    fun update(params: ExpectedPaymentUpdateParams): CompletableFuture<ExpectedPayment> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** list expected_payments */
    fun list(): CompletableFuture<ExpectedPaymentListPageAsync> =
        list(ExpectedPaymentListParams.none())

    /** @see [list] */
    fun list(
        params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPaymentListPageAsync>

    /** @see [list] */
    fun list(
        params: ExpectedPaymentListParams = ExpectedPaymentListParams.none()
    ): CompletableFuture<ExpectedPaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExpectedPaymentListPageAsync> =
        list(ExpectedPaymentListParams.none(), requestOptions)

    /** delete expected payment */
    fun delete(params: ExpectedPaymentDeleteParams): CompletableFuture<ExpectedPayment> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /**
     * A view of [ExpectedPaymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            create(ExpectedPaymentCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            create(ExpectedPaymentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExpectedPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExpectedPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /**
         * Returns a raw HTTP response for `patch /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: ExpectedPaymentUpdateParams
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExpectedPaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /**
         * Returns a raw HTTP response for `get /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> =
            list(ExpectedPaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExpectedPaymentListParams = ExpectedPaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> =
            list(ExpectedPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/expected_payments/{id}`, but is otherwise
         * the same as [ExpectedPaymentServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: ExpectedPaymentDeleteParams
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExpectedPaymentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>
    }
}
