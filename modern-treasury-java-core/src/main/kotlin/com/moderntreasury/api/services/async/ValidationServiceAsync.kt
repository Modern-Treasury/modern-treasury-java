// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.RoutingNumberLookupRequest
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams
import java.util.concurrent.CompletableFuture

interface ValidationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Validates the routing number information supplied without creating a routing detail */
    fun validateRoutingNumber(
        params: ValidationValidateRoutingNumberParams
    ): CompletableFuture<RoutingNumberLookupRequest> =
        validateRoutingNumber(params, RequestOptions.none())

    /** @see [validateRoutingNumber] */
    fun validateRoutingNumber(
        params: ValidationValidateRoutingNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RoutingNumberLookupRequest>

    /**
     * A view of [ValidationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/validations/routing_numbers`, but is otherwise
         * the same as [ValidationServiceAsync.validateRoutingNumber].
         */
        fun validateRoutingNumber(
            params: ValidationValidateRoutingNumberParams
        ): CompletableFuture<HttpResponseFor<RoutingNumberLookupRequest>> =
            validateRoutingNumber(params, RequestOptions.none())

        /** @see [validateRoutingNumber] */
        fun validateRoutingNumber(
            params: ValidationValidateRoutingNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RoutingNumberLookupRequest>>
    }
}
