// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPage
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService

interface LedgerTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun versions(): VersionService

    /** Create a ledger transaction. */
    fun create(params: LedgerTransactionCreateParams): LedgerTransaction =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Get details on a single ledger transaction. */
    fun retrieve(params: LedgerTransactionRetrieveParams): LedgerTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Update the details of a ledger transaction. */
    fun update(params: LedgerTransactionUpdateParams): LedgerTransaction =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Get a list of ledger transactions. */
    fun list(): LedgerTransactionListPage = list(LedgerTransactionListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransactionListPage

    /** @see [list] */
    fun list(
        params: LedgerTransactionListParams = LedgerTransactionListParams.none()
    ): LedgerTransactionListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerTransactionListPage =
        list(LedgerTransactionListParams.none(), requestOptions)

    /** Create a ledger transaction that partially posts another ledger transaction. */
    fun createPartialPost(params: LedgerTransactionCreatePartialPostParams): LedgerTransaction =
        createPartialPost(params, RequestOptions.none())

    /** @see [createPartialPost] */
    fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Create a ledger transaction reversal. */
    fun createReversal(params: LedgerTransactionCreateReversalParams): LedgerTransaction =
        createReversal(params, RequestOptions.none())

    /** @see [createReversal] */
    fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /**
     * A view of [LedgerTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun versions(): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions`, but is otherwise the
         * same as [LedgerTransactionService.create].
         */
        @MustBeClosed
        fun create(params: LedgerTransactionCreateParams): HttpResponseFor<LedgerTransaction> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions/{id}`, but is otherwise the
         * same as [LedgerTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LedgerTransactionRetrieveParams): HttpResponseFor<LedgerTransaction> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_transactions/{id}`, but is otherwise
         * the same as [LedgerTransactionService.update].
         */
        @MustBeClosed
        fun update(params: LedgerTransactionUpdateParams): HttpResponseFor<LedgerTransaction> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerTransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions`, but is otherwise the same
         * as [LedgerTransactionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LedgerTransactionListPage> =
            list(LedgerTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerTransactionListParams = LedgerTransactionListParams.none()
        ): HttpResponseFor<LedgerTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerTransactionListPage> =
            list(LedgerTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/partial_post`, but is
         * otherwise the same as [LedgerTransactionService.createPartialPost].
         */
        @MustBeClosed
        fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams
        ): HttpResponseFor<LedgerTransaction> = createPartialPost(params, RequestOptions.none())

        /** @see [createPartialPost] */
        @MustBeClosed
        fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/reversal`, but is
         * otherwise the same as [LedgerTransactionService.createReversal].
         */
        @MustBeClosed
        fun createReversal(
            params: LedgerTransactionCreateReversalParams
        ): HttpResponseFor<LedgerTransaction> = createReversal(params, RequestOptions.none())

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            params: LedgerTransactionCreateReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>
    }
}
