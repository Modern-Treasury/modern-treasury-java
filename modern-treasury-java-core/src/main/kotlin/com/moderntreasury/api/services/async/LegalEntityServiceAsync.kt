// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** Get details on a single legal entity. */
    @JvmOverloads
    fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** Update a legal entity. */
    @JvmOverloads
    fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntity>

    /** Get a list of all legal entities. */
    @JvmOverloads
    fun list(
        params: LegalEntityListParams = LegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntityListPageAsync>

    /** Get a list of all legal entities. */
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities/{id}`, but is otherwise the same
         * as [LegalEntityServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /**
         * Returns a raw HTTP response for `patch /api/legal_entities/{id}`, but is otherwise the
         * same as [LegalEntityServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntity>>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LegalEntityListPageAsync>> =
            list(LegalEntityListParams.none(), requestOptions)
    }
}
