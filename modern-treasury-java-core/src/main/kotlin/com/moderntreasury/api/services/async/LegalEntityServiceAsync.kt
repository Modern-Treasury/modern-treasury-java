// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPageAsync
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LegalEntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalEntityServiceAsync

    /** create legal_entity */
    fun create(params: LegalEntityCreateParams): CompletableFuture<LegalEntity> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** Get details on a single legal entity. */
    fun retrieve(id: String): CompletableFuture<LegalEntity> =
        retrieve(id, LegalEntityRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
    ): CompletableFuture<LegalEntity> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** @see [retrieve] */
    fun retrieve(params: LegalEntityRetrieveParams): CompletableFuture<LegalEntity> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<LegalEntity> =
        retrieve(id, LegalEntityRetrieveParams.none(), requestOptions)

    /** Update a legal entity. */
    fun update(id: String): CompletableFuture<LegalEntity> =
        update(id, LegalEntityUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
    ): CompletableFuture<LegalEntity> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** @see [update] */
    fun update(params: LegalEntityUpdateParams): CompletableFuture<LegalEntity> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<LegalEntity> =
        update(id, LegalEntityUpdateParams.none(), requestOptions)

    /** Get a list of all legal entities. */
    fun list(): CompletableFuture<LegalEntityListPageAsync> = list(LegalEntityListParams.none())

    /** @see [list] */
    fun list(
        params: LegalEntityListParams = LegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntityListPageAsync>

    /** @see [list] */
    fun list(
        params: LegalEntityListParams = LegalEntityListParams.none()
    ): CompletableFuture<LegalEntityListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LegalEntityListPageAsync> =
        list(LegalEntityListParams.none(), requestOptions)

    /**
     * A view of [LegalEntityServiceAsync] that provides access to raw HTTP responses for each
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
        ): LegalEntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.create].
         */
        fun create(
            params: LegalEntityCreateParams
        ): CompletableFuture<HttpResponseFor<LegalEntity>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities/{id}`, but is otherwise the same
         * as [LegalEntityServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LegalEntity>> =
            retrieve(id, LegalEntityRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /** @see [retrieve] */
        fun retrieve(
            params: LegalEntityRetrieveParams
        ): CompletableFuture<HttpResponseFor<LegalEntity>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntity>> =
            retrieve(id, LegalEntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/legal_entities/{id}`, but is otherwise the
         * same as [LegalEntityServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<LegalEntity>> =
            update(id, LegalEntityUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /** @see [update] */
        fun update(
            params: LegalEntityUpdateParams
        ): CompletableFuture<HttpResponseFor<LegalEntity>> = update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntity>> =
            update(id, LegalEntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> =
            list(LegalEntityListParams.none())

        /** @see [list] */
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>>

        /** @see [list] */
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none()
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> =
            list(LegalEntityListParams.none(), requestOptions)
    }
}
