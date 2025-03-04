// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Get details on a single ledger transaction. */
    @JvmOverloads
    fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Update the details of a ledger transaction. */
    @JvmOverloads
    fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Get a list of ledger transactions. */
    @JvmOverloads
    fun list(
        params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransactionListPage

    /** Get a list of ledger transactions. */
    fun list(requestOptions: RequestOptions): LedgerTransactionListPage =
        list(LedgerTransactionListParams.none(), requestOptions)

    /** Create a ledger transaction that partially posts another ledger transaction. */
    @JvmOverloads
    fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Create a ledger transaction reversal. */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: LedgerTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions/{id}`, but is otherwise the
         * same as [LedgerTransactionService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LedgerTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_transactions/{id}`, but is otherwise
         * the same as [LedgerTransactionService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: LedgerTransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions`, but is otherwise the same
         * as [LedgerTransactionService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransactionListPage>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions`, but is otherwise the same
         * as [LedgerTransactionService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerTransactionListPage> =
            list(LedgerTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/partial_post`, but is
         * otherwise the same as [LedgerTransactionService.createPartialPost].
         */
        @JvmOverloads
        @MustBeClosed
        fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/reversal`, but is
         * otherwise the same as [LedgerTransactionService.createReversal].
         */
        @JvmOverloads
        @MustBeClosed
        fun createReversal(
            params: LedgerTransactionCreateReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>
    }
}
