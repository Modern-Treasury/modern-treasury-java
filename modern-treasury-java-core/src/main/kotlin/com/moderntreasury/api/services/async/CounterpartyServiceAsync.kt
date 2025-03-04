// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPageAsync
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterpartyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new counterparty. */
    @JvmOverloads
    fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** Get details on a single counterparty. */
    @JvmOverloads
    fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** Updates a given counterparty with new information. */
    @JvmOverloads
    fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** Get a paginated list of all counterparties. */
    @JvmOverloads
    fun list(
        params: CounterpartyListParams = CounterpartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterpartyListPageAsync>

    /** Get a paginated list of all counterparties. */
    fun list(requestOptions: RequestOptions): CompletableFuture<CounterpartyListPageAsync> =
        list(CounterpartyListParams.none(), requestOptions)

    /** Deletes a given counterparty. */
    @JvmOverloads
    fun delete(
        params: CounterpartyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Send an email requesting account details. */
    @JvmOverloads
    fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterpartyCollectAccountResponse>

    /**
     * A view of [CounterpartyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CounterpartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /**
         * Returns a raw HTTP response for `get /api/counterparties/{id}`, but is otherwise the same
         * as [CounterpartyServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CounterpartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /**
         * Returns a raw HTTP response for `patch /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CounterpartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /**
         * Returns a raw HTTP response for `get /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CounterpartyListParams = CounterpartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>> =
            list(CounterpartyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CounterpartyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /api/counterparties/{id}/collect_account`, but is
         * otherwise the same as [CounterpartyServiceAsync.collectAccount].
         */
        @JvmOverloads
        @MustBeClosed
        fun collectAccount(
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterpartyCollectAccountResponse>>
    }
}
