// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPage
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams

interface LegalEntityService {

    /** create legal_entity */
    @JvmOverloads
    fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Get details on a single legal entity. */
    @JvmOverloads
    fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Update a legal entity. */
    @JvmOverloads
    fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Get a list of all legal entities. */
    @JvmOverloads
    fun list(
        params: LegalEntityListParams = LegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntityListPage

    /** Get a list of all legal entities. */
    fun list(requestOptions: RequestOptions): LegalEntityListPage =
        list(LegalEntityListParams.none(), requestOptions)
}
