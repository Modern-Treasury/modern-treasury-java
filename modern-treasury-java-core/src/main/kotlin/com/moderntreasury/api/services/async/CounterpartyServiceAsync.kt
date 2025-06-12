// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import java.util.function.Consumer

interface CounterpartyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CounterpartyServiceAsync

    /** Create a new counterparty. */
    fun create(params: CounterpartyCreateParams): CompletableFuture<Counterparty> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** Get details on a single counterparty. */
    fun retrieve(id: String): CompletableFuture<Counterparty> =
        retrieve(id, CounterpartyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterpartyRetrieveParams = CounterpartyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterpartyRetrieveParams = CounterpartyRetrieveParams.none(),
    ): CompletableFuture<Counterparty> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** @see [retrieve] */
    fun retrieve(params: CounterpartyRetrieveParams): CompletableFuture<Counterparty> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Counterparty> =
        retrieve(id, CounterpartyRetrieveParams.none(), requestOptions)

    /** Updates a given counterparty with new information. */
    fun update(id: String): CompletableFuture<Counterparty> =
        update(id, CounterpartyUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CounterpartyUpdateParams = CounterpartyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: CounterpartyUpdateParams = CounterpartyUpdateParams.none(),
    ): CompletableFuture<Counterparty> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Counterparty>

    /** @see [update] */
    fun update(params: CounterpartyUpdateParams): CompletableFuture<Counterparty> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Counterparty> =
        update(id, CounterpartyUpdateParams.none(), requestOptions)

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
    fun delete(id: String): CompletableFuture<Void?> = delete(id, CounterpartyDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterpartyDeleteParams = CounterpartyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterpartyDeleteParams = CounterpartyDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterpartyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: CounterpartyDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, CounterpartyDeleteParams.none(), requestOptions)

    /** Send an email requesting account details. */
    fun collectAccount(
        id: String,
        params: CounterpartyCollectAccountParams,
    ): CompletableFuture<CounterpartyCollectAccountResponse> =
        collectAccount(id, params, RequestOptions.none())

    /** @see [collectAccount] */
    fun collectAccount(
        id: String,
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterpartyCollectAccountResponse> =
        collectAccount(params.toBuilder().id(id).build(), requestOptions)

    /** @see [collectAccount] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CounterpartyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.create].
         */
        fun create(
            params: CounterpartyCreateParams
        ): CompletableFuture<HttpResponseFor<Counterparty>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CounterpartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /**
         * Returns a raw HTTP response for `get /api/counterparties/{id}`, but is otherwise the same
         * as [CounterpartyServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Counterparty>> =
            retrieve(id, CounterpartyRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CounterpartyRetrieveParams = CounterpartyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CounterpartyRetrieveParams = CounterpartyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CounterpartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /** @see [retrieve] */
        fun retrieve(
            params: CounterpartyRetrieveParams
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            retrieve(id, CounterpartyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Counterparty>> =
            update(id, CounterpartyUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: CounterpartyUpdateParams = CounterpartyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: CounterpartyUpdateParams = CounterpartyUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: CounterpartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Counterparty>>

        /** @see [update] */
        fun update(
            params: CounterpartyUpdateParams
        ): CompletableFuture<HttpResponseFor<Counterparty>> = update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Counterparty>> =
            update(id, CounterpartyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/counterparties`, but is otherwise the same as
         * [CounterpartyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>> =
            list(CounterpartyListParams.none())

        /** @see [list] */
        fun list(
            params: CounterpartyListParams = CounterpartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>>

        /** @see [list] */
        fun list(
            params: CounterpartyListParams = CounterpartyListParams.none()
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterpartyListPageAsync>> =
            list(CounterpartyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/counterparties/{id}`, but is otherwise the
         * same as [CounterpartyServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, CounterpartyDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: CounterpartyDeleteParams = CounterpartyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: CounterpartyDeleteParams = CounterpartyDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: CounterpartyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        fun delete(params: CounterpartyDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, CounterpartyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/counterparties/{id}/collect_account`, but is
         * otherwise the same as [CounterpartyServiceAsync.collectAccount].
         */
        fun collectAccount(
            id: String,
            params: CounterpartyCollectAccountParams,
        ): CompletableFuture<HttpResponseFor<CounterpartyCollectAccountResponse>> =
            collectAccount(id, params, RequestOptions.none())

        /** @see [collectAccount] */
        fun collectAccount(
            id: String,
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterpartyCollectAccountResponse>> =
            collectAccount(params.toBuilder().id(id).build(), requestOptions)

        /** @see [collectAccount] */
        fun collectAccount(
            params: CounterpartyCollectAccountParams
        ): CompletableFuture<HttpResponseFor<CounterpartyCollectAccountResponse>> =
            collectAccount(params, RequestOptions.none())

        /** @see [collectAccount] */
        fun collectAccount(
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterpartyCollectAccountResponse>>
    }
}
