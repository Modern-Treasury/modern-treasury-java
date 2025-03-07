// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse
import java.util.concurrent.CompletableFuture

interface LedgerAccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account statement. */
    fun create(
        params: LedgerAccountStatementCreateParams
    ): CompletableFuture<LedgerAccountStatementCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountStatementCreateResponse>

    /** Get details on a single ledger account statement. */
    fun retrieve(
        params: LedgerAccountStatementRetrieveParams
    ): CompletableFuture<LedgerAccountStatementRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountStatementRetrieveResponse>

    /**
     * A view of [LedgerAccountStatementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_statements`, but is otherwise
         * the same as [LedgerAccountStatementServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountStatementCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatementCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatementCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_statements/{id}`, but is
         * otherwise the same as [LedgerAccountStatementServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountStatementRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatementRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatementRetrieveResponse>>
    }
}
