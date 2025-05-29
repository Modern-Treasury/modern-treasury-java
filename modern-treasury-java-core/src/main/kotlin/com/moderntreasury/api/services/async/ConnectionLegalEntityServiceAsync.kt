// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ConnectionLegalEntity
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityListPageAsync
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams
import java.util.concurrent.CompletableFuture

interface ConnectionLegalEntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a connection legal entity. */
    fun create(
        params: ConnectionLegalEntityCreateParams
    ): CompletableFuture<ConnectionLegalEntity> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionLegalEntity>

    /** Get details on a single connection legal entity. */
    fun retrieve(id: String): CompletableFuture<ConnectionLegalEntity> =
        retrieve(id, ConnectionLegalEntityRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ConnectionLegalEntityRetrieveParams = ConnectionLegalEntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionLegalEntity> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ConnectionLegalEntityRetrieveParams = ConnectionLegalEntityRetrieveParams.none(),
    ): CompletableFuture<ConnectionLegalEntity> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionLegalEntity>

    /** @see [retrieve] */
    fun retrieve(
        params: ConnectionLegalEntityRetrieveParams
    ): CompletableFuture<ConnectionLegalEntity> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionLegalEntity> =
        retrieve(id, ConnectionLegalEntityRetrieveParams.none(), requestOptions)

    /** Update a connection legal entity. */
    fun update(id: String): CompletableFuture<ConnectionLegalEntity> =
        update(id, ConnectionLegalEntityUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ConnectionLegalEntityUpdateParams = ConnectionLegalEntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionLegalEntity> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: ConnectionLegalEntityUpdateParams = ConnectionLegalEntityUpdateParams.none(),
    ): CompletableFuture<ConnectionLegalEntity> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionLegalEntity>

    /** @see [update] */
    fun update(
        params: ConnectionLegalEntityUpdateParams
    ): CompletableFuture<ConnectionLegalEntity> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ConnectionLegalEntity> =
        update(id, ConnectionLegalEntityUpdateParams.none(), requestOptions)

    /** Get a list of all connection legal entities. */
    fun list(): CompletableFuture<ConnectionLegalEntityListPageAsync> =
        list(ConnectionLegalEntityListParams.none())

    /** @see [list] */
    fun list(
        params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionLegalEntityListPageAsync>

    /** @see [list] */
    fun list(
        params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none()
    ): CompletableFuture<ConnectionLegalEntityListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<ConnectionLegalEntityListPageAsync> =
        list(ConnectionLegalEntityListParams.none(), requestOptions)

    /**
     * A view of [ConnectionLegalEntityServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/connection_legal_entities`, but is otherwise
         * the same as [ConnectionLegalEntityServiceAsync.create].
         */
        fun create(
            params: ConnectionLegalEntityCreateParams
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: ConnectionLegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>>

        /**
         * Returns a raw HTTP response for `get /api/connection_legal_entities/{id}`, but is
         * otherwise the same as [ConnectionLegalEntityServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            retrieve(id, ConnectionLegalEntityRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ConnectionLegalEntityRetrieveParams =
                ConnectionLegalEntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ConnectionLegalEntityRetrieveParams = ConnectionLegalEntityRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ConnectionLegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>>

        /** @see [retrieve] */
        fun retrieve(
            params: ConnectionLegalEntityRetrieveParams
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            retrieve(id, ConnectionLegalEntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/connection_legal_entities/{id}`, but is
         * otherwise the same as [ConnectionLegalEntityServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            update(id, ConnectionLegalEntityUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: ConnectionLegalEntityUpdateParams = ConnectionLegalEntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: ConnectionLegalEntityUpdateParams = ConnectionLegalEntityUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: ConnectionLegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>>

        /** @see [update] */
        fun update(
            params: ConnectionLegalEntityUpdateParams
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntity>> =
            update(id, ConnectionLegalEntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/connection_legal_entities`, but is otherwise
         * the same as [ConnectionLegalEntityServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ConnectionLegalEntityListPageAsync>> =
            list(ConnectionLegalEntityListParams.none())

        /** @see [list] */
        fun list(
            params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntityListPageAsync>>

        /** @see [list] */
        fun list(
            params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none()
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionLegalEntityListPageAsync>> =
            list(ConnectionLegalEntityListParams.none(), requestOptions)
    }
}
