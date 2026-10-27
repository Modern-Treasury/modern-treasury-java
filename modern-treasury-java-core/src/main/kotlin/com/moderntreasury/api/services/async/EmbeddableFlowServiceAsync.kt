// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.EmbeddableFlow
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowListPageAsync
import com.moderntreasury.api.models.EmbeddableFlowListParams
import com.moderntreasury.api.models.EmbeddableFlowRetrieveParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EmbeddableFlowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmbeddableFlowServiceAsync

    /** create embeddable_flow */
    fun create(params: EmbeddableFlowCreateParams): CompletableFuture<EmbeddableFlow> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmbeddableFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddableFlow>

    /** get embeddable_flow */
    fun retrieve(id: String): CompletableFuture<EmbeddableFlow> =
        retrieve(id, EmbeddableFlowRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddableFlow> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
    ): CompletableFuture<EmbeddableFlow> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: EmbeddableFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddableFlow>

    /** @see retrieve */
    fun retrieve(params: EmbeddableFlowRetrieveParams): CompletableFuture<EmbeddableFlow> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<EmbeddableFlow> =
        retrieve(id, EmbeddableFlowRetrieveParams.none(), requestOptions)

    /** update embeddable_flow */
    fun update(id: String, params: EmbeddableFlowUpdateParams): CompletableFuture<EmbeddableFlow> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddableFlow> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: EmbeddableFlowUpdateParams): CompletableFuture<EmbeddableFlow> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddableFlow>

    /** list embeddable_flows */
    fun list(): CompletableFuture<EmbeddableFlowListPageAsync> =
        list(EmbeddableFlowListParams.none())

    /** @see list */
    fun list(
        params: EmbeddableFlowListParams = EmbeddableFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EmbeddableFlowListPageAsync>

    /** @see list */
    fun list(
        params: EmbeddableFlowListParams = EmbeddableFlowListParams.none()
    ): CompletableFuture<EmbeddableFlowListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<EmbeddableFlowListPageAsync> =
        list(EmbeddableFlowListParams.none(), requestOptions)

    /**
     * A view of [EmbeddableFlowServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmbeddableFlowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/embeddable_flows`, but is otherwise the same
         * as [EmbeddableFlowServiceAsync.create].
         */
        fun create(
            params: EmbeddableFlowCreateParams
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: EmbeddableFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>>

        /**
         * Returns a raw HTTP response for `get /api/embeddable_flows/{id}`, but is otherwise the
         * same as [EmbeddableFlowServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            retrieve(id, EmbeddableFlowRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: EmbeddableFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>>

        /** @see retrieve */
        fun retrieve(
            params: EmbeddableFlowRetrieveParams
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            retrieve(id, EmbeddableFlowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/embeddable_flows/{id}`, but is otherwise the
         * same as [EmbeddableFlowServiceAsync.update].
         */
        fun update(
            id: String,
            params: EmbeddableFlowUpdateParams,
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: EmbeddableFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: EmbeddableFlowUpdateParams
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: EmbeddableFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddableFlow>>

        /**
         * Returns a raw HTTP response for `get /api/embeddable_flows`, but is otherwise the same as
         * [EmbeddableFlowServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<EmbeddableFlowListPageAsync>> =
            list(EmbeddableFlowListParams.none())

        /** @see list */
        fun list(
            params: EmbeddableFlowListParams = EmbeddableFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EmbeddableFlowListPageAsync>>

        /** @see list */
        fun list(
            params: EmbeddableFlowListParams = EmbeddableFlowListParams.none()
        ): CompletableFuture<HttpResponseFor<EmbeddableFlowListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<EmbeddableFlowListPageAsync>> =
            list(EmbeddableFlowListParams.none(), requestOptions)
    }
}
