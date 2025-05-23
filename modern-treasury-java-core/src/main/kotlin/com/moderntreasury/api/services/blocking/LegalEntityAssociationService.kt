// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams

interface LegalEntityAssociationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create legal_entity_association */
    fun create(params: LegalEntityAssociationCreateParams): LegalEntityAssociation =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LegalEntityAssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntityAssociation

    /**
     * A view of [LegalEntityAssociationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/legal_entity_associations`, but is otherwise
         * the same as [LegalEntityAssociationService.create].
         */
        @MustBeClosed
        fun create(
            params: LegalEntityAssociationCreateParams
        ): HttpResponseFor<LegalEntityAssociation> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LegalEntityAssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntityAssociation>
    }
}
