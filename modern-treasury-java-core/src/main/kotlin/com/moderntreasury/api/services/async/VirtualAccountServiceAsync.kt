@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPageAsync
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams
import java.util.concurrent.CompletableFuture

interface VirtualAccountServiceAsync {

    /** create virtual_account */
    @JvmOverloads
    fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<VirtualAccount>

    /** get virtual_account */
    @JvmOverloads
    fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<VirtualAccount>

    /** update virtual_account */
    @JvmOverloads
    fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<VirtualAccount>

    /** Get a list of virtual accounts. */
    @JvmOverloads
    fun list(
        params: VirtualAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<VirtualAccountListPageAsync>

    /** delete virtual_account */
    @JvmOverloads
    fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<VirtualAccount>
}
