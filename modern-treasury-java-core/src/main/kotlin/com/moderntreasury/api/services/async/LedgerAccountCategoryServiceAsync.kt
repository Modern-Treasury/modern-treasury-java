// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import java.util.function.Consumer

interface LedgerAccountCategoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerAccountCategoryServiceAsync

    /** Create a ledger account category. */
    fun create(
        params: LedgerAccountCategoryCreateParams
    ): CompletableFuture<LedgerAccountCategory> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** Get the details on a single ledger account category. */
    fun retrieve(id: String): CompletableFuture<LedgerAccountCategory> =
        retrieve(id, LedgerAccountCategoryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountCategoryRetrieveParams = LedgerAccountCategoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: LedgerAccountCategoryRetrieveParams = LedgerAccountCategoryRetrieveParams.none(),
    ): CompletableFuture<LedgerAccountCategory> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** @see retrieve */
    fun retrieve(
        params: LedgerAccountCategoryRetrieveParams
    ): CompletableFuture<LedgerAccountCategory> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategory> =
        retrieve(id, LedgerAccountCategoryRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account category. */
    fun update(id: String): CompletableFuture<LedgerAccountCategory> =
        update(id, LedgerAccountCategoryUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
    ): CompletableFuture<LedgerAccountCategory> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** @see update */
    fun update(
        params: LedgerAccountCategoryUpdateParams
    ): CompletableFuture<LedgerAccountCategory> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategory> =
        update(id, LedgerAccountCategoryUpdateParams.none(), requestOptions)

    /** Get a list of ledger account categories. */
    fun list(): CompletableFuture<LedgerAccountCategoryListPageAsync> =
        list(LedgerAccountCategoryListParams.none())

    /** @see list */
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategoryListPageAsync>

    /** @see list */
    fun list(
        params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none()
    ): CompletableFuture<LedgerAccountCategoryListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<LedgerAccountCategoryListPageAsync> =
        list(LedgerAccountCategoryListParams.none(), requestOptions)

    /** Delete a ledger account category. */
    fun delete(id: String): CompletableFuture<LedgerAccountCategory> =
        delete(id, LedgerAccountCategoryDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
    ): CompletableFuture<LedgerAccountCategory> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerAccountCategory>

    /** @see delete */
    fun delete(
        params: LedgerAccountCategoryDeleteParams
    ): CompletableFuture<LedgerAccountCategory> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerAccountCategory> =
        delete(id, LedgerAccountCategoryDeleteParams.none(), requestOptions)

    /** Add a ledger account to a ledger account category. */
    fun addLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryAddLedgerAccountParams,
    ): CompletableFuture<Void?> = addLedgerAccount(ledgerAccountId, params, RequestOptions.none())

    /** @see addLedgerAccount */
    fun addLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addLedgerAccount(
            params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
            requestOptions,
        )

    /** @see addLedgerAccount */
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams
    ): CompletableFuture<Void?> = addLedgerAccount(params, RequestOptions.none())

    /** @see addLedgerAccount */
    fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Add a ledger account category to a ledger account category. */
    fun addNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryAddNestedCategoryParams,
    ): CompletableFuture<Void?> = addNestedCategory(subCategoryId, params, RequestOptions.none())

    /** @see addNestedCategory */
    fun addNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        addNestedCategory(params.toBuilder().subCategoryId(subCategoryId).build(), requestOptions)

    /** @see addNestedCategory */
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams
    ): CompletableFuture<Void?> = addNestedCategory(params, RequestOptions.none())

    /** @see addNestedCategory */
    fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Remove a ledger account from a ledger account category. */
    fun removeLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
    ): CompletableFuture<Void?> =
        removeLedgerAccount(ledgerAccountId, params, RequestOptions.none())

    /** @see removeLedgerAccount */
    fun removeLedgerAccount(
        ledgerAccountId: String,
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        removeLedgerAccount(
            params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
            requestOptions,
        )

    /** @see removeLedgerAccount */
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams
    ): CompletableFuture<Void?> = removeLedgerAccount(params, RequestOptions.none())

    /** @see removeLedgerAccount */
    fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Delete a ledger account category from a ledger account category. */
    fun removeNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
    ): CompletableFuture<Void?> = removeNestedCategory(subCategoryId, params, RequestOptions.none())

    /** @see removeNestedCategory */
    fun removeNestedCategory(
        subCategoryId: String,
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        removeNestedCategory(
            params.toBuilder().subCategoryId(subCategoryId).build(),
            requestOptions,
        )

    /** @see removeNestedCategory */
    fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams
    ): CompletableFuture<Void?> = removeNestedCategory(params, RequestOptions.none())

    /** @see removeNestedCategory */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerAccountCategoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryServiceAsync.create].
         */
        fun create(
            params: LedgerAccountCategoryCreateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            retrieve(id, LedgerAccountCategoryRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountCategoryRetrieveParams =
                LedgerAccountCategoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: LedgerAccountCategoryRetrieveParams = LedgerAccountCategoryRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /** @see retrieve */
        fun retrieve(
            params: LedgerAccountCategoryRetrieveParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            retrieve(id, LedgerAccountCategoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            update(id, LedgerAccountCategoryUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: LedgerAccountCategoryUpdateParams = LedgerAccountCategoryUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /** @see update */
        fun update(
            params: LedgerAccountCategoryUpdateParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            update(id, LedgerAccountCategoryUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_categories`, but is otherwise
         * the same as [LedgerAccountCategoryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>> =
            list(LedgerAccountCategoryListParams.none())

        /** @see list */
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>>

        /** @see list */
        fun list(
            params: LedgerAccountCategoryListParams = LedgerAccountCategoryListParams.none()
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategoryListPageAsync>> =
            list(LedgerAccountCategoryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_categories/{id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            delete(id, LedgerAccountCategoryDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: LedgerAccountCategoryDeleteParams = LedgerAccountCategoryDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>>

        /** @see delete */
        fun delete(
            params: LedgerAccountCategoryDeleteParams
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerAccountCategory>> =
            delete(id, LedgerAccountCategoryDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.addLedgerAccount].
         */
        fun addLedgerAccount(
            ledgerAccountId: String,
            params: LedgerAccountCategoryAddLedgerAccountParams,
        ): CompletableFuture<HttpResponse> =
            addLedgerAccount(ledgerAccountId, params, RequestOptions.none())

        /** @see addLedgerAccount */
        fun addLedgerAccount(
            ledgerAccountId: String,
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addLedgerAccount(
                params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
                requestOptions,
            )

        /** @see addLedgerAccount */
        fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams
        ): CompletableFuture<HttpResponse> = addLedgerAccount(params, RequestOptions.none())

        /** @see addLedgerAccount */
        fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `put
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.addNestedCategory].
         */
        fun addNestedCategory(
            subCategoryId: String,
            params: LedgerAccountCategoryAddNestedCategoryParams,
        ): CompletableFuture<HttpResponse> =
            addNestedCategory(subCategoryId, params, RequestOptions.none())

        /** @see addNestedCategory */
        fun addNestedCategory(
            subCategoryId: String,
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            addNestedCategory(
                params.toBuilder().subCategoryId(subCategoryId).build(),
                requestOptions,
            )

        /** @see addNestedCategory */
        fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams
        ): CompletableFuture<HttpResponse> = addNestedCategory(params, RequestOptions.none())

        /** @see addNestedCategory */
        fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.removeLedgerAccount].
         */
        fun removeLedgerAccount(
            ledgerAccountId: String,
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
        ): CompletableFuture<HttpResponse> =
            removeLedgerAccount(ledgerAccountId, params, RequestOptions.none())

        /** @see removeLedgerAccount */
        fun removeLedgerAccount(
            ledgerAccountId: String,
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            removeLedgerAccount(
                params.toBuilder().ledgerAccountId(ledgerAccountId).build(),
                requestOptions,
            )

        /** @see removeLedgerAccount */
        fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams
        ): CompletableFuture<HttpResponse> = removeLedgerAccount(params, RequestOptions.none())

        /** @see removeLedgerAccount */
        fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}`, but is
         * otherwise the same as [LedgerAccountCategoryServiceAsync.removeNestedCategory].
         */
        fun removeNestedCategory(
            subCategoryId: String,
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
        ): CompletableFuture<HttpResponse> =
            removeNestedCategory(subCategoryId, params, RequestOptions.none())

        /** @see removeNestedCategory */
        fun removeNestedCategory(
            subCategoryId: String,
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            removeNestedCategory(
                params.toBuilder().subCategoryId(subCategoryId).build(),
                requestOptions,
            )

        /** @see removeNestedCategory */
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams
        ): CompletableFuture<HttpResponse> = removeNestedCategory(params, RequestOptions.none())

        /** @see removeNestedCategory */
        fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
