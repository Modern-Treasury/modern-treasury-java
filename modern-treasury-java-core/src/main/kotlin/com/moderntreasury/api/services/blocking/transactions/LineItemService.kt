// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking.transactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemListPage
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams

interface LineItemService {

    /** create transaction line items */
    @JvmOverloads
    fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** get transaction line item */
    @JvmOverloads
    fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** list transaction_line_items */
    @JvmOverloads
    fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItemListPage

    /** delete transaction line item */
    @JvmOverloads
    fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
