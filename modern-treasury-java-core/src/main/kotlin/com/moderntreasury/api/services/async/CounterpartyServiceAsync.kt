// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: CounterpartyCreateParams): CompletableFuture<Counterparty> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** Get details on a single counterparty. */
    fun retrieve(params: CounterpartyRetrieveParams): CompletableFuture<Counterparty> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** Updates a given counterparty with new information. */
    fun update(params: CounterpartyUpdateParams): CompletableFuture<Counterparty> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** Get a paginated list of all counterparties. */
    fun list(): CompletableFuture<CounterpartyListPageAsync> = list(CounterpartyListParams.none())

    /** @see [list] */
    fun list(
        params: CounterpartyListParams = CounterpartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterpartyListPageAsync>

    /** @see [list] */
    fun list(
        params: CounterpartyListParams = CounterpartyListParams.none()
    ): CompletableFuture<CounterpartyListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CounterpartyListPageAsync> =
        list(CounterpartyListParams.none(), requestOptions)

    /** Deletes a given counterparty. */
    fun delete(params: CounterpartyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterpartyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Send an email requesting account details. */
    fun collectAccount(
        params: CounterpartyCollectAccountParams
    ): CompletableFuture<CounterpartyCollectAccountResponse> =
        collectAccount(params, RequestOptions.none())

    /** @see [collectAccount] */
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
        @MustBeClosed
        fun create(
            params: CounterpartyCreateParams
        ): CompletableFuture<HttpResponseFor<Counterparty>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CounterpartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /**
         * Returns a raw HTTP response for `get /api/counterparties/{id}`, but is otherwise the same
         * as [CounterpartyServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CounterpartyRetrieveParams
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterpartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /**
         * Returns a raw HTTP response for `patch /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CounterpartyUpdateParams
        ): CompletableFuture<HttpResponseFor<Counterparty>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CounterpartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /**
         * Returns a raw HTTP response for `get /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>> =
            list(CounterpartyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterpartyListParams = CounterpartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterpartyListParams = CounterpartyListParams.none()
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>> =
            list(CounterpartyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: CounterpartyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CounterpartyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /api/counterparties/{id}/collect_account`, but is
         * otherwise the same as [CounterpartyServiceAsync.collectAccount].
         */
        @MustBeClosed
        fun collectAccount(
            params: CounterpartyCollectAccountParams
        ): CompletableFuture<HttpResponseFor<CounterpartyCollectAccountResponse>> =
            collectAccount(params, RequestOptions.none())

        /** @see [collectAccount] */
        @MustBeClosed
        fun collectAccount(
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterpartyCollectAccountResponse>>
    }
}
