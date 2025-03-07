// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPageAsync
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams
import java.util.concurrent.CompletableFuture

interface LegalEntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create legal_entity */
    fun create(params: LegalEntityCreateParams): CompletableFuture<LegalEntity> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** Get details on a single legal entity. */
    fun retrieve(params: LegalEntityRetrieveParams): CompletableFuture<LegalEntity> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** Update a legal entity. */
    fun update(params: LegalEntityUpdateParams): CompletableFuture<LegalEntity> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

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
         * Returns a raw HTTP response for `post /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LegalEntityCreateParams
        ): CompletableFuture<HttpResponseFor<LegalEntity>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities/{id}`, but is otherwise the same
         * as [LegalEntityServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LegalEntityRetrieveParams
        ): CompletableFuture<HttpResponseFor<LegalEntity>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /**
         * Returns a raw HTTP response for `patch /api/legal_entities/{id}`, but is otherwise the
         * same as [LegalEntityServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: LegalEntityUpdateParams
        ): CompletableFuture<HttpResponseFor<LegalEntity>> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> =
            list(LegalEntityListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none()
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> =
            list(LegalEntityListParams.none(), requestOptions)
    }
}
