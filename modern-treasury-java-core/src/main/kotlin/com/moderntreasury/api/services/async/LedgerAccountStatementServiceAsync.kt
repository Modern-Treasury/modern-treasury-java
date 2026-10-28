// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountStatement
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LedgerAccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerAccountStatementServiceAsync

    /** Create a ledger account statement. */
    fun create(
        params: LedgerAccountStatementCreateParams
    ): CompletableFuture<LedgerAccountStatement> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountStatement>

    /** Get details on a single ledger account statement. */
    fun retrieve(id: String): CompletableFuture<LedgerAccountStatement> =
        retrieve(id, LedgerAccountStatementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountStatementRetrieveParams = LedgerAccountStatementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountStatement> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountStatementRetrieveParams = LedgerAccountStatementRetrieveParams.none(),
    ): CompletableFuture<LedgerAccountStatement> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountStatement>

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountStatementRetrieveParams
    ): CompletableFuture<LedgerAccountStatement> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountStatement> =
        retrieve(id, LedgerAccountStatementRetrieveParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountStatementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountStatementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_statements`, but is otherwise
         * the same as [LedgerAccountStatementServiceAsync.create].
         */
        fun create(
            params: LedgerAccountStatementCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatement>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatement>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_statements/{id}`, but is
         * otherwise the same as [LedgerAccountStatementServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerAccountStatement>> =
            retrieve(id, LedgerAccountStatementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountStatementRetrieveParams =
                LedgerAccountStatementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatement>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountStatementRetrieveParams =
                LedgerAccountStatementRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatement>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatement>>

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountStatementRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatement>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountStatement>> =
            retrieve(id, LedgerAccountStatementRetrieveParams.none(), requestOptions)
    }
}
