// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/** list payment_flows */
class PaymentFlowListParams
private constructor(
    private val afterCursor: String?,
    private val clientToken: String?,
    private val counterpartyId: String?,
    private val originatingAccountId: String?,
    private val paymentOrderId: String?,
    private val perPage: Long?,
    private val receivingAccountId: String?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun clientToken(): Optional<String> = Optional.ofNullable(clientToken)

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    fun originatingAccountId(): Optional<String> = Optional.ofNullable(originatingAccountId)

    fun paymentOrderId(): Optional<String> = Optional.ofNullable(paymentOrderId)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun receivingAccountId(): Optional<String> = Optional.ofNullable(receivingAccountId)

    fun status(): Optional<String> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.clientToken?.let { queryParams.put("client_token", listOf(it.toString())) }
        this.counterpartyId?.let { queryParams.put("counterparty_id", listOf(it.toString())) }
        this.originatingAccountId?.let {
            queryParams.put("originating_account_id", listOf(it.toString()))
        }
        this.paymentOrderId?.let { queryParams.put("payment_order_id", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.receivingAccountId?.let {
            queryParams.put("receiving_account_id", listOf(it.toString()))
        }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentFlowListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var clientToken: String? = null
        private var counterpartyId: String? = null
        private var originatingAccountId: String? = null
        private var paymentOrderId: String? = null
        private var perPage: Long? = null
        private var receivingAccountId: String? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentFlowListParams: PaymentFlowListParams) = apply {
            afterCursor = paymentFlowListParams.afterCursor
            clientToken = paymentFlowListParams.clientToken
            counterpartyId = paymentFlowListParams.counterpartyId
            originatingAccountId = paymentFlowListParams.originatingAccountId
            paymentOrderId = paymentFlowListParams.paymentOrderId
            perPage = paymentFlowListParams.perPage
            receivingAccountId = paymentFlowListParams.receivingAccountId
            status = paymentFlowListParams.status
            additionalHeaders = paymentFlowListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentFlowListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.orElse(null))

        fun clientToken(clientToken: String?) = apply { this.clientToken = clientToken }

        fun clientToken(clientToken: Optional<String>) = clientToken(clientToken.orElse(null))

        fun counterpartyId(counterpartyId: String?) = apply { this.counterpartyId = counterpartyId }

        fun counterpartyId(counterpartyId: Optional<String>) =
            counterpartyId(counterpartyId.orElse(null))

        fun originatingAccountId(originatingAccountId: String?) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun originatingAccountId(originatingAccountId: Optional<String>) =
            originatingAccountId(originatingAccountId.orElse(null))

        fun paymentOrderId(paymentOrderId: String?) = apply { this.paymentOrderId = paymentOrderId }

        fun paymentOrderId(paymentOrderId: Optional<String>) =
            paymentOrderId(paymentOrderId.orElse(null))

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        fun perPage(perPage: Long) = perPage(perPage as Long?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun perPage(perPage: Optional<Long>) = perPage(perPage.orElse(null) as Long?)

        fun receivingAccountId(receivingAccountId: String?) = apply {
            this.receivingAccountId = receivingAccountId
        }

        fun receivingAccountId(receivingAccountId: Optional<String>) =
            receivingAccountId(receivingAccountId.orElse(null))

        fun status(status: String?) = apply { this.status = status }

        fun status(status: Optional<String>) = status(status.orElse(null))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): PaymentFlowListParams =
            PaymentFlowListParams(
                afterCursor,
                clientToken,
                counterpartyId,
                originatingAccountId,
                paymentOrderId,
                perPage,
                receivingAccountId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowListParams && afterCursor == other.afterCursor && clientToken == other.clientToken && counterpartyId == other.counterpartyId && originatingAccountId == other.originatingAccountId && paymentOrderId == other.paymentOrderId && perPage == other.perPage && receivingAccountId == other.receivingAccountId && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, clientToken, counterpartyId, originatingAccountId, paymentOrderId, perPage, receivingAccountId, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentFlowListParams{afterCursor=$afterCursor, clientToken=$clientToken, counterpartyId=$counterpartyId, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, perPage=$perPage, receivingAccountId=$receivingAccountId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
