// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ConnectionLegalEntity
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityListPage
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams

interface ConnectionLegalEntityService {

    /** Create a connection legal entity. */
    @JvmOverloads
    fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** Get details on a single connection legal entity. */
    @JvmOverloads
    fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** Update a connection legal entity. */
    @JvmOverloads
    fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** Get a list of all connection legal entities. */
    @JvmOverloads
    fun list(
        params: ConnectionLegalEntityListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntityListPage
}
