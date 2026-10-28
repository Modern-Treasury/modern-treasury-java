// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Hold
import com.moderntreasury.api.models.HoldCreateParams
import com.moderntreasury.api.models.HoldListPageAsync
import com.moderntreasury.api.models.HoldListParams
import com.moderntreasury.api.models.HoldRetrieveParams
import com.moderntreasury.api.models.HoldUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HoldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldServiceAsync

    /** Create a new hold */
    fun create(params: HoldCreateParams): CompletableFuture<Hold> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold>

    /** Get a specific hold */
    fun retrieve(id: String): CompletableFuture<Hold> = retrieve(id, HoldRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
    ): CompletableFuture<Hold> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold>

    /** @see retrieve */
    fun retrieve(params: HoldRetrieveParams): CompletableFuture<Hold> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Hold> =
        retrieve(id, HoldRetrieveParams.none(), requestOptions)

    /** Update a hold */
    fun update(id: String, params: HoldUpdateParams): CompletableFuture<Hold> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: HoldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: HoldUpdateParams): CompletableFuture<Hold> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HoldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold>

    /** Get a list of holds. */
    fun list(): CompletableFuture<HoldListPageAsync> = list(HoldListParams.none())

    /** @see list */
    fun list(
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HoldListPageAsync>

    /** @see list */
    fun list(params: HoldListParams = HoldListParams.none()): CompletableFuture<HoldListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HoldListPageAsync> =
        list(HoldListParams.none(), requestOptions)

    /** A view of [HoldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/holds`, but is otherwise the same as
         * [HoldServiceAsync.create].
         */
        fun create(params: HoldCreateParams): CompletableFuture<HttpResponseFor<Hold>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>>

        /**
         * Returns a raw HTTP response for `get /api/holds/{id}`, but is otherwise the same as
         * [HoldServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(id, HoldRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>>

        /** @see retrieve */
        fun retrieve(params: HoldRetrieveParams): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(id, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/holds/{id}`, but is otherwise the same as
         * [HoldServiceAsync.update].
         */
        fun update(id: String, params: HoldUpdateParams): CompletableFuture<HttpResponseFor<Hold>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: HoldUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(params: HoldUpdateParams): CompletableFuture<HttpResponseFor<Hold>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: HoldUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>>

        /**
         * Returns a raw HTTP response for `get /api/holds`, but is otherwise the same as
         * [HoldServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(HoldListParams.none())

        /** @see list */
        fun list(
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>>

        /** @see list */
        fun list(
            params: HoldListParams = HoldListParams.none()
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(HoldListParams.none(), requestOptions)
    }
}
