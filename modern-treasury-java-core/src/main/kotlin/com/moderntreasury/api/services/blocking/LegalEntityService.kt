// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPage
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams

interface LegalEntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create legal_entity */
    fun create(params: LegalEntityCreateParams): LegalEntity = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Get details on a single legal entity. */
    fun retrieve(params: LegalEntityRetrieveParams): LegalEntity =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Update a legal entity. */
    fun update(params: LegalEntityUpdateParams): LegalEntity = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Get a list of all legal entities. */
    fun list(): LegalEntityListPage = list(LegalEntityListParams.none())

    /** @see [list] */
    fun list(
        params: LegalEntityListParams = LegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntityListPage

    /** @see [list] */
    fun list(params: LegalEntityListParams = LegalEntityListParams.none()): LegalEntityListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LegalEntityListPage =
        list(LegalEntityListParams.none(), requestOptions)

    /**
     * A view of [LegalEntityService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/legal_entities`, but is otherwise the same as
         * [LegalEntityService.create].
         */
        @MustBeClosed
        fun create(params: LegalEntityCreateParams): HttpResponseFor<LegalEntity> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities/{id}`, but is otherwise the same
         * as [LegalEntityService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LegalEntityRetrieveParams): HttpResponseFor<LegalEntity> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /**
         * Returns a raw HTTP response for `patch /api/legal_entities/{id}`, but is otherwise the
         * same as [LegalEntityService.update].
         */
        @MustBeClosed
        fun update(params: LegalEntityUpdateParams): HttpResponseFor<LegalEntity> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities`, but is otherwise the same as
         * [LegalEntityService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LegalEntityListPage> = list(LegalEntityListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntityListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none()
        ): HttpResponseFor<LegalEntityListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LegalEntityListPage> =
            list(LegalEntityListParams.none(), requestOptions)
    }
}
