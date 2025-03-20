// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.RoutingDetail
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListPageAsync
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams
import java.util.concurrent.CompletableFuture

interface RoutingDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a routing detail for a single external account. */
    fun create(params: RoutingDetailCreateParams): CompletableFuture<RoutingDetail> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingDetail>

    /** Get a single routing detail for a single internal or external account. */
    fun retrieve(params: RoutingDetailRetrieveParams): CompletableFuture<RoutingDetail> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingDetail>

    /** Get a list of routing details for a single internal or external account. */
    fun list(params: RoutingDetailListParams): CompletableFuture<RoutingDetailListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RoutingDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingDetailListPageAsync>

    /** Delete a routing detail for a single external account. */
    fun delete(params: RoutingDetailDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: RoutingDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [RoutingDetailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/{accounts_type}/{account_id}/routing_details`,
         * but is otherwise the same as [RoutingDetailServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: RoutingDetailCreateParams
        ): CompletableFuture<HttpResponseFor<RoutingDetail>> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RoutingDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingDetail>>

        /**
         * Returns a raw HTTP response for `get
         * /api/{accounts_type}/{account_id}/routing_details/{id}`, but is otherwise the same as
         * [RoutingDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: RoutingDetailRetrieveParams
        ): CompletableFuture<HttpResponseFor<RoutingDetail>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RoutingDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingDetail>>

        /**
         * Returns a raw HTTP response for `get /api/{accounts_type}/{account_id}/routing_details`,
         * but is otherwise the same as [RoutingDetailServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: RoutingDetailListParams
        ): CompletableFuture<HttpResponseFor<RoutingDetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RoutingDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingDetailListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/{accounts_type}/{account_id}/routing_details/{id}`, but is otherwise the same as
         * [RoutingDetailServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: RoutingDetailDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: RoutingDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
