// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountStatement
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import java.util.function.Consumer

interface LedgerAccountStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerAccountStatementService

    /** Create a ledger account statement. */
    fun create(params: LedgerAccountStatementCreateParams): LedgerAccountStatement =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatement

    /** Get details on a single ledger account statement. */
    fun retrieve(id: String): LedgerAccountStatement =
        retrieve(id, LedgerAccountStatementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountStatementRetrieveParams = LedgerAccountStatementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatement = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountStatementRetrieveParams = LedgerAccountStatementRetrieveParams.none(),
    ): LedgerAccountStatement = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatement

    /** @see retrieve */
    fun retrieve(params: LedgerAccountStatementRetrieveParams): LedgerAccountStatement =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): LedgerAccountStatement =
        retrieve(id, LedgerAccountStatementRetrieveParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountStatementService] that provides access to raw HTTP responses for each
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
        ): LedgerAccountStatementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_statements`, but is otherwise
         * the same as [LedgerAccountStatementService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountStatementCreateParams
        ): HttpResponseFor<LedgerAccountStatement> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatement>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_statements/{id}`, but is
         * otherwise the same as [LedgerAccountStatementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LedgerAccountStatement> =
            retrieve(id, LedgerAccountStatementRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerAccountStatementRetrieveParams =
                LedgerAccountStatementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatement> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerAccountStatementRetrieveParams =
                LedgerAccountStatementRetrieveParams.none(),
        ): HttpResponseFor<LedgerAccountStatement> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountStatement>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountStatementRetrieveParams
        ): HttpResponseFor<LedgerAccountStatement> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountStatement> =
            retrieve(id, LedgerAccountStatementRetrieveParams.none(), requestOptions)
    }
}
