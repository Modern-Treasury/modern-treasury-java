// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync
import java.util.concurrent.CompletableFuture

interface LedgerTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun versions(): VersionServiceAsync

    /** Create a ledger transaction. */
    fun create(params: LedgerTransactionCreateParams): CompletableFuture<LedgerTransaction> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction>

    /** Get details on a single ledger transaction. */
    fun retrieve(id: String): CompletableFuture<LedgerTransaction> =
        retrieve(id, LedgerTransactionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
    ): CompletableFuture<LedgerTransaction> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction>

    /** @see [retrieve] */
    fun retrieve(params: LedgerTransactionRetrieveParams): CompletableFuture<LedgerTransaction> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerTransaction> =
        retrieve(id, LedgerTransactionRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger transaction. */
    fun update(id: String): CompletableFuture<LedgerTransaction> =
        update(id, LedgerTransactionUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
    ): CompletableFuture<LedgerTransaction> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction>

    /** @see [update] */
    fun update(params: LedgerTransactionUpdateParams): CompletableFuture<LedgerTransaction> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<LedgerTransaction> =
        update(id, LedgerTransactionUpdateParams.none(), requestOptions)

    /** Get a list of ledger transactions. */
    fun list(): CompletableFuture<LedgerTransactionListPageAsync> =
        list(LedgerTransactionListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransactionListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerTransactionListParams = LedgerTransactionListParams.none()
    ): CompletableFuture<LedgerTransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LedgerTransactionListPageAsync> =
        list(LedgerTransactionListParams.none(), requestOptions)

    /** Create a ledger transaction that partially posts another ledger transaction. */
    fun createPartialPost(
        id: String,
        params: LedgerTransactionCreatePartialPostParams,
    ): CompletableFuture<LedgerTransaction> = createPartialPost(id, params, RequestOptions.none())

    /** @see [createPartialPost] */
    fun createPartialPost(
        id: String,
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction> =
        createPartialPost(params.toBuilder().id(id).build(), requestOptions)

    /** @see [createPartialPost] */
    fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams
    ): CompletableFuture<LedgerTransaction> = createPartialPost(params, RequestOptions.none())

    /** @see [createPartialPost] */
    fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction>

    /** Create a ledger transaction reversal. */
    fun createReversal(id: String): CompletableFuture<LedgerTransaction> =
        createReversal(id, LedgerTransactionCreateReversalParams.none())

    /** @see [createReversal] */
    fun createReversal(
        id: String,
        params: LedgerTransactionCreateReversalParams =
            LedgerTransactionCreateReversalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction> =
        createReversal(params.toBuilder().id(id).build(), requestOptions)

    /** @see [createReversal] */
    fun createReversal(
        id: String,
        params: LedgerTransactionCreateReversalParams = LedgerTransactionCreateReversalParams.none(),
    ): CompletableFuture<LedgerTransaction> = createReversal(id, params, RequestOptions.none())

    /** @see [createReversal] */
    fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransaction>

    /** @see [createReversal] */
    fun createReversal(
        params: LedgerTransactionCreateReversalParams
    ): CompletableFuture<LedgerTransaction> = createReversal(params, RequestOptions.none())

    /** @see [createReversal] */
    fun createReversal(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerTransaction> =
        createReversal(id, LedgerTransactionCreateReversalParams.none(), requestOptions)

    /**
     * A view of [LedgerTransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun versions(): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions`, but is otherwise the
         * same as [LedgerTransactionServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerTransactionCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions/{id}`, but is otherwise the
         * same as [LedgerTransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            retrieve(id, LedgerTransactionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            retrieve(id, LedgerTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_transactions/{id}`, but is otherwise
         * the same as [LedgerTransactionServiceAsync.update].
         */
        @MustBeClosed
        fun update(id: String): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            update(id, LedgerTransactionUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerTransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerTransactionUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            update(id, LedgerTransactionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions`, but is otherwise the same
         * as [LedgerTransactionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerTransactionListPageAsync>> =
            list(LedgerTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransactionListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerTransactionListParams = LedgerTransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerTransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerTransactionListPageAsync>> =
            list(LedgerTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/partial_post`, but is
         * otherwise the same as [LedgerTransactionServiceAsync.createPartialPost].
         */
        @MustBeClosed
        fun createPartialPost(
            id: String,
            params: LedgerTransactionCreatePartialPostParams,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createPartialPost(id, params, RequestOptions.none())

        /** @see [createPartialPost] */
        @MustBeClosed
        fun createPartialPost(
            id: String,
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createPartialPost(params.toBuilder().id(id).build(), requestOptions)

        /** @see [createPartialPost] */
        @MustBeClosed
        fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createPartialPost(params, RequestOptions.none())

        /** @see [createPartialPost] */
        @MustBeClosed
        fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>>

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/reversal`, but is
         * otherwise the same as [LedgerTransactionServiceAsync.createReversal].
         */
        @MustBeClosed
        fun createReversal(id: String): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createReversal(id, LedgerTransactionCreateReversalParams.none())

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            id: String,
            params: LedgerTransactionCreateReversalParams =
                LedgerTransactionCreateReversalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createReversal(params.toBuilder().id(id).build(), requestOptions)

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            id: String,
            params: LedgerTransactionCreateReversalParams =
                LedgerTransactionCreateReversalParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createReversal(id, params, RequestOptions.none())

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            params: LedgerTransactionCreateReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>>

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            params: LedgerTransactionCreateReversalParams
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createReversal(params, RequestOptions.none())

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerTransaction>> =
            createReversal(id, LedgerTransactionCreateReversalParams.none(), requestOptions)
    }
}
