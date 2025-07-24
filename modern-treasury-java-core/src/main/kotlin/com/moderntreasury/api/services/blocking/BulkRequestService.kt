// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPage
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams
import java.util.function.Consumer

interface BulkRequestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkRequestService

    /** create bulk_request */
    fun create(params: BulkRequestCreateParams): BulkRequest = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** get bulk_request */
    fun retrieve(id: String): BulkRequest = retrieve(id, BulkRequestRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
    ): BulkRequest = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** @see retrieve */
    fun retrieve(params: BulkRequestRetrieveParams): BulkRequest =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): BulkRequest =
        retrieve(id, BulkRequestRetrieveParams.none(), requestOptions)

    /** list bulk_requests */
    fun list(): BulkRequestListPage = list(BulkRequestListParams.none())

    /** @see list */
    fun list(
        params: BulkRequestListParams = BulkRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequestListPage

    /** @see list */
    fun list(params: BulkRequestListParams = BulkRequestListParams.none()): BulkRequestListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BulkRequestListPage =
        list(BulkRequestListParams.none(), requestOptions)

    /**
     * A view of [BulkRequestService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkRequestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestService.create].
         */
        @MustBeClosed
        fun create(params: BulkRequestCreateParams): HttpResponseFor<BulkRequest> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BulkRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRequest>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests/{id}`, but is otherwise the same
         * as [BulkRequestService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BulkRequest> =
            retrieve(id, BulkRequestRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRequest> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BulkRequestRetrieveParams = BulkRequestRetrieveParams.none(),
        ): HttpResponseFor<BulkRequest> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BulkRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRequest>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BulkRequestRetrieveParams): HttpResponseFor<BulkRequest> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BulkRequest> =
            retrieve(id, BulkRequestRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BulkRequestListPage> = list(BulkRequestListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BulkRequestListParams = BulkRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRequestListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BulkRequestListParams = BulkRequestListParams.none()
        ): HttpResponseFor<BulkRequestListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BulkRequestListPage> =
            list(BulkRequestListParams.none(), requestOptions)
    }
}
