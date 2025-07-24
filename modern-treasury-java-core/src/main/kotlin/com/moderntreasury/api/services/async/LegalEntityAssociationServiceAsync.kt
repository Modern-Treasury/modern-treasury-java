// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
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

    /** create legal_entity_association */
    fun create(
        params: LegalEntityAssociationCreateParams
    ): CompletableFuture<LegalEntityAssociation> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LegalEntityAssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LegalEntityAssociation>

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
    }
}
