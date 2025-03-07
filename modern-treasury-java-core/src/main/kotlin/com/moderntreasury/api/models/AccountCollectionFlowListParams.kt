// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** list account_collection_flows */
class AccountCollectionFlowListParams
private constructor(
    private val afterCursor: String?,
    private val clientToken: String?,
    private val counterpartyId: String?,
    private val externalAccountId: String?,
    private val perPage: Long?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun clientToken(): Optional<String> = Optional.ofNullable(clientToken)

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    fun externalAccountId(): Optional<String> = Optional.ofNullable(externalAccountId)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun status(): Optional<String> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.clientToken?.let { queryParams.put("client_token", listOf(it.toString())) }
        this.counterpartyId?.let { queryParams.put("counterparty_id", listOf(it.toString())) }
        this.externalAccountId?.let {
            queryParams.put("external_account_id", listOf(it.toString()))
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AccountCollectionFlowListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountCollectionFlowListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountCollectionFlowListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var clientToken: String? = null
        private var counterpartyId: String? = null
        private var externalAccountId: String? = null
        private var perPage: Long? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(accountCollectionFlowListParams: AccountCollectionFlowListParams) =
            apply {
                afterCursor = accountCollectionFlowListParams.afterCursor
                clientToken = accountCollectionFlowListParams.clientToken
                counterpartyId = accountCollectionFlowListParams.counterpartyId
                externalAccountId = accountCollectionFlowListParams.externalAccountId
                perPage = accountCollectionFlowListParams.perPage
                status = accountCollectionFlowListParams.status
                additionalHeaders = accountCollectionFlowListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    accountCollectionFlowListParams.additionalQueryParams.toBuilder()
            }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.getOrNull())

        fun clientToken(clientToken: String?) = apply { this.clientToken = clientToken }

        fun clientToken(clientToken: Optional<String>) = clientToken(clientToken.getOrNull())

        fun counterpartyId(counterpartyId: String?) = apply { this.counterpartyId = counterpartyId }

        fun counterpartyId(counterpartyId: Optional<String>) =
            counterpartyId(counterpartyId.getOrNull())

        fun externalAccountId(externalAccountId: String?) = apply {
            this.externalAccountId = externalAccountId
        }

        fun externalAccountId(externalAccountId: Optional<String>) =
            externalAccountId(externalAccountId.getOrNull())

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        fun perPage(perPage: Long) = perPage(perPage as Long?)

        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

        fun status(status: String?) = apply { this.status = status }

        fun status(status: Optional<String>) = status(status.getOrNull())

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

        fun build(): AccountCollectionFlowListParams =
            AccountCollectionFlowListParams(
                afterCursor,
                clientToken,
                counterpartyId,
                externalAccountId,
                perPage,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountCollectionFlowListParams && afterCursor == other.afterCursor && clientToken == other.clientToken && counterpartyId == other.counterpartyId && externalAccountId == other.externalAccountId && perPage == other.perPage && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, clientToken, counterpartyId, externalAccountId, perPage, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AccountCollectionFlowListParams{afterCursor=$afterCursor, clientToken=$clientToken, counterpartyId=$counterpartyId, externalAccountId=$externalAccountId, perPage=$perPage, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
