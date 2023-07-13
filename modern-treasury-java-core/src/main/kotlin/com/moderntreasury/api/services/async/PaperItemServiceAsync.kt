@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPageAsync
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams
import java.util.concurrent.CompletableFuture

interface PaperItemServiceAsync {

    /** Get details on a single paper item. */
    @JvmOverloads
    fun retrieve(
        params: PaperItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaperItem>

    /** Get a list of all paper items. */
    @JvmOverloads
    fun list(
        params: PaperItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaperItemListPageAsync>
}
