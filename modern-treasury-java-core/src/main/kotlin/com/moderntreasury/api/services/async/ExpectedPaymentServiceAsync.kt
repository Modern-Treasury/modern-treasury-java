// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import java.util.function.Consumer

interface ExpectedPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExpectedPaymentServiceAsync

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
    fun retrieve(id: String): CompletableFuture<ExpectedPayment> =
        retrieve(id, ExpectedPaymentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
    ): CompletableFuture<ExpectedPayment> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** @see [retrieve] */
    fun retrieve(params: ExpectedPaymentRetrieveParams): CompletableFuture<ExpectedPayment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ExpectedPayment> =
        retrieve(id, ExpectedPaymentRetrieveParams.none(), requestOptions)

    /** update expected payment */
    fun update(id: String): CompletableFuture<ExpectedPayment> =
        update(id, ExpectedPaymentUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
    ): CompletableFuture<ExpectedPayment> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** @see [update] */
    fun update(params: ExpectedPaymentUpdateParams): CompletableFuture<ExpectedPayment> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<ExpectedPayment> =
        update(id, ExpectedPaymentUpdateParams.none(), requestOptions)

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
    fun delete(id: String): CompletableFuture<ExpectedPayment> =
        delete(id, ExpectedPaymentDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
    ): CompletableFuture<ExpectedPayment> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExpectedPayment>

    /** @see [delete] */
    fun delete(params: ExpectedPaymentDeleteParams): CompletableFuture<ExpectedPayment> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<ExpectedPayment> =
        delete(id, ExpectedPaymentDeleteParams.none(), requestOptions)

    /**
     * A view of [ExpectedPaymentServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExpectedPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            create(ExpectedPaymentCreateParams.none())

        /** @see [create] */
        fun create(
            params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /** @see [create] */
        fun create(
            params: ExpectedPaymentCreateParams = ExpectedPaymentCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            create(ExpectedPaymentCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            retrieve(id, ExpectedPaymentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ExpectedPaymentRetrieveParams = ExpectedPaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ExpectedPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /** @see [retrieve] */
        fun retrieve(
            params: ExpectedPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            retrieve(id, ExpectedPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/expected_payments/{id}`, but is otherwise the
         * same as [ExpectedPaymentServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            update(id, ExpectedPaymentUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: ExpectedPaymentUpdateParams = ExpectedPaymentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: ExpectedPaymentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /** @see [update] */
        fun update(
            params: ExpectedPaymentUpdateParams
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            update(id, ExpectedPaymentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/expected_payments`, but is otherwise the same
         * as [ExpectedPaymentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> =
            list(ExpectedPaymentListParams.none())

        /** @see [list] */
        fun list(
            params: ExpectedPaymentListParams = ExpectedPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>>

        /** @see [list] */
        fun list(
            params: ExpectedPaymentListParams = ExpectedPaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExpectedPaymentListPageAsync>> =
            list(ExpectedPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/expected_payments/{id}`, but is otherwise
         * the same as [ExpectedPaymentServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            delete(id, ExpectedPaymentDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: ExpectedPaymentDeleteParams = ExpectedPaymentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: ExpectedPaymentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>>

        /** @see [delete] */
        fun delete(
            params: ExpectedPaymentDeleteParams
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExpectedPayment>> =
            delete(id, ExpectedPaymentDeleteParams.none(), requestOptions)
    }
}
