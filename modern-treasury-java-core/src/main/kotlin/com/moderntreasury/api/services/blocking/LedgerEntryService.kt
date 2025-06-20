// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerEntry
import com.moderntreasury.api.models.LedgerEntryListPage
import com.moderntreasury.api.models.LedgerEntryListParams
import com.moderntreasury.api.models.LedgerEntryRetrieveParams
import com.moderntreasury.api.models.LedgerEntryUpdateParams
import java.util.function.Consumer

interface LedgerEntryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerEntryService

    /** Get details on a single ledger entry. */
    fun retrieve(id: String): LedgerEntry = retrieve(id, LedgerEntryRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntry = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
    ): LedgerEntry = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntry

    /** @see [retrieve] */
    fun retrieve(params: LedgerEntryRetrieveParams): LedgerEntry =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): LedgerEntry =
        retrieve(id, LedgerEntryRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger entry. */
    fun update(id: String): LedgerEntry = update(id, LedgerEntryUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntry = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
    ): LedgerEntry = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerEntryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntry

    /** @see [update] */
    fun update(params: LedgerEntryUpdateParams): LedgerEntry = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): LedgerEntry =
        update(id, LedgerEntryUpdateParams.none(), requestOptions)

    /** Get a list of all ledger entries. */
    fun list(): LedgerEntryListPage = list(LedgerEntryListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerEntryListParams = LedgerEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntryListPage

    /** @see [list] */
    fun list(params: LedgerEntryListParams = LedgerEntryListParams.none()): LedgerEntryListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerEntryListPage =
        list(LedgerEntryListParams.none(), requestOptions)

    /**
     * A view of [LedgerEntryService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerEntryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/ledger_entries/{id}`, but is otherwise the same
         * as [LedgerEntryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<LedgerEntry> =
            retrieve(id, LedgerEntryRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntry> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerEntryRetrieveParams = LedgerEntryRetrieveParams.none(),
        ): HttpResponseFor<LedgerEntry> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntry>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: LedgerEntryRetrieveParams): HttpResponseFor<LedgerEntry> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<LedgerEntry> =
            retrieve(id, LedgerEntryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_entries/{id}`, but is otherwise the
         * same as [LedgerEntryService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<LedgerEntry> =
            update(id, LedgerEntryUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntry> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerEntryUpdateParams = LedgerEntryUpdateParams.none(),
        ): HttpResponseFor<LedgerEntry> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerEntryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntry>

        /** @see [update] */
        @MustBeClosed
        fun update(params: LedgerEntryUpdateParams): HttpResponseFor<LedgerEntry> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<LedgerEntry> =
            update(id, LedgerEntryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_entries`, but is otherwise the same as
         * [LedgerEntryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LedgerEntryListPage> = list(LedgerEntryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerEntryListParams = LedgerEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerEntryListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerEntryListParams = LedgerEntryListParams.none()
        ): HttpResponseFor<LedgerEntryListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerEntryListPage> =
            list(LedgerEntryListParams.none(), requestOptions)
    }
}
