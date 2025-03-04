// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** create expected payment */
    fun create(requestOptions: RequestOptions): CompletableFuture<ExpectedPayment> =
        create(ExpectedPaymentCreateParams.none(), requestOptions)

    /** get expected payment */
    @JvmOverloads
    fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** update expected payment */
    @JvmOverloads
    fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** list expected_payments */
    @JvmOverloads
    fun list(
        params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPaymentListPageAsync>

    /** list expected_payments */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExpectedPaymentListPageAsync> =
        list(ExpectedPaymentListParams.none(), requestOptions)

    /** delete expected payment */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /**
         * Returns a raw HTTP response for `post /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            create(ExpectedPaymentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExpectedPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /**
         * Returns a raw HTTP response for `patch /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ExpectedPaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /**
         * Returns a raw HTTP response for `get /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> =
            list(ExpectedPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/expected_payments/{id}`, but is otherwise
         * the same as [ExpectedPaymentServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ExpectedPaymentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>
    }
}
