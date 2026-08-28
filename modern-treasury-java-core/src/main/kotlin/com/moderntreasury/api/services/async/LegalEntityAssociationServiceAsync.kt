// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
import com.moderntreasury.api.models.LegalEntityAssociationDeleteParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LegalEntityAssociationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalEntityAssociationServiceAsync

    /** Add an associated legal entity to a business legal entity. */
    fun create(
        params: LegalEntityAssociationCreateParams
    ): CompletableFuture<LegalEntityAssociation> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LegalEntityAssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntityAssociation>

    /** Remove an associated legal entity from a business legal entity. */
    fun delete(id: String): CompletableFuture<LegalEntityAssociation> =
        delete(id, LegalEntityAssociationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LegalEntityAssociationDeleteParams = LegalEntityAssociationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntityAssociation> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LegalEntityAssociationDeleteParams = LegalEntityAssociationDeleteParams.none(),
    ): CompletableFuture<LegalEntityAssociation> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LegalEntityAssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntityAssociation>

    /** @see delete */
    fun delete(
        params: LegalEntityAssociationDeleteParams
    ): CompletableFuture<LegalEntityAssociation> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LegalEntityAssociation> =
        delete(id, LegalEntityAssociationDeleteParams.none(), requestOptions)

    /**
     * A view of [LegalEntityAssociationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalEntityAssociationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/legal_entity_associations`, but is otherwise
         * the same as [LegalEntityAssociationServiceAsync.create].
         */
        fun create(
            params: LegalEntityAssociationCreateParams
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LegalEntityAssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>>

        /**
         * Returns a raw HTTP response for `delete /api/legal_entity_associations/{id}`, but is
         * otherwise the same as [LegalEntityAssociationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<LegalEntityAssociation>> =
            delete(id, LegalEntityAssociationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LegalEntityAssociationDeleteParams = LegalEntityAssociationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LegalEntityAssociationDeleteParams = LegalEntityAssociationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LegalEntityAssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>>

        /** @see delete */
        fun delete(
            params: LegalEntityAssociationDeleteParams
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LegalEntityAssociation>> =
            delete(id, LegalEntityAssociationDeleteParams.none(), requestOptions)
    }
}
