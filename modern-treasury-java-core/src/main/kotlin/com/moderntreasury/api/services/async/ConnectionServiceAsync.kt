// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ConnectionListPageAsync
import com.moderntreasury.api.models.ConnectionListParams
import java.util.concurrent.CompletableFuture

interface ConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of all connections. */
    @JvmOverloads
    fun list(
        params: ConnectionListParams = ConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConnectionListPageAsync>

    /** Get a list of all connections. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ConnectionListPageAsync> =
        list(ConnectionListParams.none(), requestOptions)

    /**
     * A view of [ConnectionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/connections`, but is otherwise the same as
         * [ConnectionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ConnectionListParams = ConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConnectionListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /api/connections`, but is otherwise the same as
         * [ConnectionServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ConnectionListPageAsync>> =
            list(ConnectionListParams.none(), requestOptions)
    }
}
