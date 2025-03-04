// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async.ledgerTransactions

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerTransactionVersionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionVersionListParams
import java.util.concurrent.CompletableFuture

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of ledger transaction versions. */
    @JvmOverloads
    fun list(
        params: LedgerTransactionVersionListParams = LedgerTransactionVersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerTransactionVersionListPageAsync>

    /** Get a list of ledger transaction versions. */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerTransactionVersionListPageAsync> =
        list(LedgerTransactionVersionListParams.none(), requestOptions)

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/ledger_transaction_versions`, but is otherwise
         * the same as [VersionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LedgerTransactionVersionListParams = LedgerTransactionVersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerTransactionVersionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transaction_versions`, but is otherwise
         * the same as [VersionServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerTransactionVersionListPageAsync>> =
            list(LedgerTransactionVersionListParams.none(), requestOptions)
    }
}
