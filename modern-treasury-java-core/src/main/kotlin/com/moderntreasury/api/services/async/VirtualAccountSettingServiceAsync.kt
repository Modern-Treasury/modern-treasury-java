// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.VirtualAccountSetting
import com.moderntreasury.api.models.VirtualAccountSettingCreateParams
import com.moderntreasury.api.models.VirtualAccountSettingListPageAsync
import com.moderntreasury.api.models.VirtualAccountSettingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface VirtualAccountSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VirtualAccountSettingServiceAsync

    /** Create a virtual account setting. */
    fun create(
        params: VirtualAccountSettingCreateParams
    ): CompletableFuture<VirtualAccountSetting> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VirtualAccountSettingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccountSetting>

    /** List virtual account settings. */
    fun list(): CompletableFuture<VirtualAccountSettingListPageAsync> =
        list(VirtualAccountSettingListParams.none())

    /** @see list */
    fun list(
        params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VirtualAccountSettingListPageAsync>

    /** @see list */
    fun list(
        params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none()
    ): CompletableFuture<VirtualAccountSettingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<VirtualAccountSettingListPageAsync> =
        list(VirtualAccountSettingListParams.none(), requestOptions)

    /**
     * A view of [VirtualAccountSettingServiceAsync] that provides access to raw HTTP responses for
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
        ): VirtualAccountSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/virtual_account_settings`, but is otherwise
         * the same as [VirtualAccountSettingServiceAsync.create].
         */
        fun create(
            params: VirtualAccountSettingCreateParams
        ): CompletableFuture<HttpResponseFor<VirtualAccountSetting>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VirtualAccountSettingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccountSetting>>

        /**
         * Returns a raw HTTP response for `get /api/virtual_account_settings`, but is otherwise the
         * same as [VirtualAccountSettingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VirtualAccountSettingListPageAsync>> =
            list(VirtualAccountSettingListParams.none())

        /** @see list */
        fun list(
            params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VirtualAccountSettingListPageAsync>>

        /** @see list */
        fun list(
            params: VirtualAccountSettingListParams = VirtualAccountSettingListParams.none()
        ): CompletableFuture<HttpResponseFor<VirtualAccountSettingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VirtualAccountSettingListPageAsync>> =
            list(VirtualAccountSettingListParams.none(), requestOptions)
    }
}
