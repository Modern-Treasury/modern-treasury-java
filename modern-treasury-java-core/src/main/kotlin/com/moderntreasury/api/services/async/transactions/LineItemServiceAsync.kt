@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async.transactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.TransactionLineItemListPageAsync
import com.moderntreasury.api.models.TransactionLineItemListParams
import java.util.concurrent.CompletableFuture

interface LineItemServiceAsync {

    /** list transaction_line_items */
    @JvmOverloads
    fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TransactionLineItemListPageAsync>
}
