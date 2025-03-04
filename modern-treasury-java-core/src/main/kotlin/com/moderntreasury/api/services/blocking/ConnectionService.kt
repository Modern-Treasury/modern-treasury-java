// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ConnectionListPage
import com.moderntreasury.api.models.ConnectionListParams

interface ConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of all connections. */
    @JvmOverloads
    fun list(
        params: ConnectionListParams = ConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionListPage

    /** Get a list of all connections. */
    fun list(requestOptions: RequestOptions): ConnectionListPage =
        list(ConnectionListParams.none(), requestOptions)

    /** A view of [ConnectionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/connections`, but is otherwise the same as
         * [ConnectionService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ConnectionListParams = ConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionListPage>

        /**
         * Returns a raw HTTP response for `get /api/connections`, but is otherwise the same as
         * [ConnectionService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ConnectionListPage> =
            list(ConnectionListParams.none(), requestOptions)
    }
}
