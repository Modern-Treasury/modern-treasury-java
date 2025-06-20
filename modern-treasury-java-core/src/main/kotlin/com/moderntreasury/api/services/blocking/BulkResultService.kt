// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPage
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams
import java.util.function.Consumer

interface BulkResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BulkResultService

    /** get bulk_result */
    fun retrieve(id: String): BulkResult = retrieve(id, BulkResultRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkResult = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
    ): BulkResult = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkResult

    /** @see [retrieve] */
    fun retrieve(params: BulkResultRetrieveParams): BulkResult =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): BulkResult =
        retrieve(id, BulkResultRetrieveParams.none(), requestOptions)

    /** list bulk_results */
    fun list(): BulkResultListPage = list(BulkResultListParams.none())

    /** @see [list] */
    fun list(
        params: BulkResultListParams = BulkResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkResultListPage

    /** @see [list] */
    fun list(params: BulkResultListParams = BulkResultListParams.none()): BulkResultListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BulkResultListPage =
        list(BulkResultListParams.none(), requestOptions)

    /** A view of [BulkResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BulkResultService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/bulk_results/{id}`, but is otherwise the same
         * as [BulkResultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<BulkResult> =
            retrieve(id, BulkResultRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkResult> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BulkResultRetrieveParams = BulkResultRetrieveParams.none(),
        ): HttpResponseFor<BulkResult> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BulkResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkResult>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: BulkResultRetrieveParams): HttpResponseFor<BulkResult> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<BulkResult> =
            retrieve(id, BulkResultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/bulk_results`, but is otherwise the same as
         * [BulkResultService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BulkResultListPage> = list(BulkResultListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BulkResultListParams = BulkResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkResultListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BulkResultListParams = BulkResultListParams.none()
        ): HttpResponseFor<BulkResultListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BulkResultListPage> =
            list(BulkResultListParams.none(), requestOptions)
    }
}
