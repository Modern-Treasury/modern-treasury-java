// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ConnectionLegalEntity
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityListPage
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams

interface ConnectionLegalEntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a connection legal entity. */
    @JvmOverloads
    fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** Get details on a single connection legal entity. */
    @JvmOverloads
    fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** Update a connection legal entity. */
    @JvmOverloads
    fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** Get a list of all connection legal entities. */
    @JvmOverloads
    fun list(
        params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntityListPage

    /** Get a list of all connection legal entities. */
    fun list(requestOptions: RequestOptions): ConnectionLegalEntityListPage =
        list(ConnectionLegalEntityListParams.none(), requestOptions)

    /**
     * A view of [ConnectionLegalEntityService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/connection_legal_entities`, but is otherwise
         * the same as [ConnectionLegalEntityService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ConnectionLegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity>

        /**
         * Returns a raw HTTP response for `get /api/connection_legal_entities/{id}`, but is
         * otherwise the same as [ConnectionLegalEntityService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ConnectionLegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity>

        /**
         * Returns a raw HTTP response for `patch /api/connection_legal_entities/{id}`, but is
         * otherwise the same as [ConnectionLegalEntityService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ConnectionLegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity>

        /**
         * Returns a raw HTTP response for `get /api/connection_legal_entities`, but is otherwise
         * the same as [ConnectionLegalEntityService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntityListPage>

        /**
         * Returns a raw HTTP response for `get /api/connection_legal_entities`, but is otherwise
         * the same as [ConnectionLegalEntityService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConnectionLegalEntityListPage> =
            list(ConnectionLegalEntityListParams.none(), requestOptions)
    }
}
