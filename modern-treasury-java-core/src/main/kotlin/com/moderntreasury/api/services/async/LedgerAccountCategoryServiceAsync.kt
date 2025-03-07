// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPageAsync
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams
import java.util.concurrent.CompletableFuture

interface LedgerAccountCategoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account category. */
    fun create(
        params: LedgerAccountCategoryCreateParams
    ): CompletableFuture<LedgerAccountCategory> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** Get the details on a single ledger account category. */
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams
    ): CompletableFuture<LedgerAccountCategory> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** Update the details of a ledger account category. */
    fun update(
        params: LedgerAccountCategoryUpdateParams
    ): CompletableFuture<LedgerAccountCategory> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** Get a list of ledger account categories. */
    fun list(): CompletableFuture<LedgerAccountCategoryListPageAsync> =
        list(LedgerAccountCategoryListParams.none())

    /** @see [list] */
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategoryListPageAsync>

    /** @see [list] */
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none()
    ): CompletableFuture<LedgerAccountCategoryListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountCategoryListPageAsync> =
        list(LedgerAccountCategoryListParams.none(), requestOptions)

    /** Delete a ledger account category. */
    fun delete(
        params: LedgerAccountCategoryDeleteParams
    ): CompletableFuture<LedgerAccountCategory> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** Add a ledger account to a ledger account category. */
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams
    ): CompletableFuture<Void?> = addLedgerAccount(params, RequestOptions.none())

    /** @see [addLedgerAccount] */
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Add a ledger account category to a ledger account category. */
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams
    ): CompletableFuture<Void?> = addNestedCategory(params, RequestOptions.none())

    /** @see [addNestedCategory] */
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Remove a ledger account from a ledger account category. */
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams
    ): CompletableFuture<Void?> = removeLedgerAccount(params, RequestOptions.none())

    /** @see [removeLedgerAccount] */
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Delete a ledger account category from a ledger account category. */
    fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams
    ): CompletableFuture<Void?> = removeNestedCategory(params, RequestOptions.none())

    /** @see [removeNestedCategory] */
    fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [LedgerAccountCategoryServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountCategoryCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountCategoryUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>> =
            list(LedgerAccountCategoryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>> =
            list(LedgerAccountCategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerAccountCategoryDeleteParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.addLedgerAccount].
         */
        @MustBeClosed
        fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams
        ): CompletableFuture<HttpResponse> = addLedgerAccount(params, RequestOptions.none())

        /** @see [addLedgerAccount] */
        @MustBeClosed
        fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.addNestedCategory].
         */
        @MustBeClosed
        fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams
        ): CompletableFuture<HttpResponse> = addNestedCategory(params, RequestOptions.none())

        /** @see [addNestedCategory] */
        @MustBeClosed
        fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.removeLedgerAccount].
         */
        @MustBeClosed
        fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams
        ): CompletableFuture<HttpResponse> = removeLedgerAccount(params, RequestOptions.none())

        /** @see [removeLedgerAccount] */
        @MustBeClosed
        fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.removeNestedCategory].
         */
        @MustBeClosed
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams
        ): CompletableFuture<HttpResponse> = removeNestedCategory(params, RequestOptions.none())

        /** @see [removeNestedCategory] */
        @MustBeClosed
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
