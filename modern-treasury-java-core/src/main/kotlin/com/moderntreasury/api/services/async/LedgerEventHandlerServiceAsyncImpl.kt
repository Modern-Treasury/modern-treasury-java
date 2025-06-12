// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import java.util.function.Consumer

class LedgerEventHandlerServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerEventHandlerServiceAsync {

    private val withRawResponse: LedgerEventHandlerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerEventHandlerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LedgerEventHandlerServiceAsync =
        LedgerEventHandlerServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerEventHandlerServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LedgerEventHandlerServiceAsync.WithRawResponse =
            LedgerEventHandlerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
