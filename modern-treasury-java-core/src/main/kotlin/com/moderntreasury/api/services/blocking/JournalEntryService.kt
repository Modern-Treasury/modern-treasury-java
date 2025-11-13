// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalEntryListParams
import com.moderntreasury.api.models.JournalEntryRetrieveParams
import java.util.function.Consumer

interface JournalEntryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JournalEntryService

    /** Retrieve a specific journal entry */
    fun retrieve(id: String) = retrieve(id, JournalEntryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JournalEntryRetrieveParams = JournalEntryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JournalEntryRetrieveParams = JournalEntryRetrieveParams.none(),
    ) = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JournalEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: JournalEntryRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, JournalEntryRetrieveParams.none(), requestOptions)

    /** Retrieve a list of journal entries */
    fun list(params: JournalEntryListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(params: JournalEntryListParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * A view of [JournalEntryService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): JournalEntryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_entries/{id}`, but is otherwise the
         * same as [JournalEntryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, JournalEntryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JournalEntryRetrieveParams = JournalEntryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JournalEntryRetrieveParams = JournalEntryRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JournalEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: JournalEntryRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, JournalEntryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_entries`, but is otherwise the same as
         * [JournalEntryService.list].
         */
        @MustBeClosed
        fun list(params: JournalEntryListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: JournalEntryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
