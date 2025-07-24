// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Transaction
import com.moderntreasury.api.models.TransactionCreateParams
import com.moderntreasury.api.models.TransactionDeleteParams
import com.moderntreasury.api.models.TransactionListPageAsync
import com.moderntreasury.api.models.TransactionListParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.services.async.transactions.LineItemServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionServiceAsync

    fun lineItems(): LineItemServiceAsync

    /** create transaction */
    fun create(params: TransactionCreateParams): CompletableFuture<Transaction> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** Get details on a single transaction. */
    fun retrieve(id: String): CompletableFuture<Transaction> =
        retrieve(id, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): CompletableFuture<Transaction> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** @see retrieve */
    fun retrieve(params: TransactionRetrieveParams): CompletableFuture<Transaction> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Transaction> =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** Update a single transaction. */
    fun update(id: String): CompletableFuture<Transaction> =
        update(id, TransactionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: TransactionUpdateParams = TransactionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: TransactionUpdateParams = TransactionUpdateParams.none(),
    ): CompletableFuture<Transaction> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** @see update */
    fun update(params: TransactionUpdateParams): CompletableFuture<Transaction> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Transaction> =
        update(id, TransactionUpdateParams.none(), requestOptions)

    /** Get a list of all transactions. */
    fun list(): CompletableFuture<TransactionListPageAsync> = list(TransactionListParams.none())

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionListPageAsync>

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none()
    ): CompletableFuture<TransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransactionListPageAsync> =
        list(TransactionListParams.none(), requestOptions)

    /** delete transaction */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, TransactionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: TransactionDeleteParams = TransactionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: TransactionDeleteParams = TransactionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TransactionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TransactionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, TransactionDeleteParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        fun lineItems(): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.create].
         */
        fun create(
            params: TransactionCreateParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>

        /**
         * Returns a raw HTTP response for `get /api/transactions/{id}`, but is otherwise the same
         * as [TransactionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(id, TransactionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/transactions/{id}`, but is otherwise the same
         * as [TransactionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Transaction>> =
            update(id, TransactionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: TransactionUpdateParams = TransactionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: TransactionUpdateParams = TransactionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>

        /** @see update */
        fun update(
            params: TransactionUpdateParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            update(id, TransactionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(TransactionListParams.none())

        /** @see list */
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>>

        /** @see list */
        fun list(
            params: TransactionListParams = TransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/transactions/{id}`, but is otherwise the
         * same as [TransactionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, TransactionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: TransactionDeleteParams = TransactionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: TransactionDeleteParams = TransactionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TransactionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TransactionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, TransactionDeleteParams.none(), requestOptions)
    }
}
