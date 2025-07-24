// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPageAsync
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LedgerAccountSettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerAccountSettlementServiceAsync

    fun accountEntries(): AccountEntryServiceAsync

    /** Create a ledger account settlement. */
    fun create(
        params: LedgerAccountSettlementCreateParams
    ): CompletableFuture<LedgerAccountSettlement> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** Get details on a single ledger account settlement. */
    fun retrieve(id: String): CompletableFuture<LedgerAccountSettlement> =
        retrieve(id, LedgerAccountSettlementRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountSettlementRetrieveParams =
            LedgerAccountSettlementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountSettlementRetrieveParams = LedgerAccountSettlementRetrieveParams.none(),
    ): CompletableFuture<LedgerAccountSettlement> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountSettlementRetrieveParams
    ): CompletableFuture<LedgerAccountSettlement> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountSettlement> =
        retrieve(id, LedgerAccountSettlementRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account settlement. */
    fun update(id: String): CompletableFuture<LedgerAccountSettlement> =
        update(id, LedgerAccountSettlementUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: LedgerAccountSettlementUpdateParams = LedgerAccountSettlementUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: LedgerAccountSettlementUpdateParams = LedgerAccountSettlementUpdateParams.none(),
    ): CompletableFuture<LedgerAccountSettlement> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlement>

    /** @see update */
    fun update(
        params: LedgerAccountSettlementUpdateParams
    ): CompletableFuture<LedgerAccountSettlement> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountSettlement> =
        update(id, LedgerAccountSettlementUpdateParams.none(), requestOptions)

    /** Get a list of ledger account settlements. */
    fun list(): CompletableFuture<LedgerAccountSettlementListPageAsync> =
        list(LedgerAccountSettlementListParams.none())

    /** @see list */
    fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountSettlementListPageAsync>

    /** @see list */
    fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none()
    ): CompletableFuture<LedgerAccountSettlementListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountSettlementListPageAsync> =
        list(LedgerAccountSettlementListParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountSettlementServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountSettlementServiceAsync.WithRawResponse

        fun accountEntries(): AccountEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.create].
         */
        fun create(
            params: LedgerAccountSettlementCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LedgerAccountSettlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            retrieve(id, LedgerAccountSettlementRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountSettlementRetrieveParams =
                LedgerAccountSettlementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountSettlementRetrieveParams =
                LedgerAccountSettlementRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountSettlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>>

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountSettlementRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            retrieve(id, LedgerAccountSettlementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            update(id, LedgerAccountSettlementUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: LedgerAccountSettlementUpdateParams =
                LedgerAccountSettlementUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: LedgerAccountSettlementUpdateParams = LedgerAccountSettlementUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LedgerAccountSettlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>>

        /** @see update */
        fun update(
            params: LedgerAccountSettlementUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlement>> =
            update(id, LedgerAccountSettlementUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>> =
            list(LedgerAccountSettlementListParams.none())

        /** @see list */
        fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>>

        /** @see list */
        fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountSettlementListPageAsync>> =
            list(LedgerAccountSettlementListParams.none(), requestOptions)
    }
}
