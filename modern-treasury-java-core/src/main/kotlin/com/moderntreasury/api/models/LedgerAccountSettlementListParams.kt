// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.models.*
import java.util.Objects
import java.util.Optional

class LedgerAccountSettlementListParams
constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val ledgerTransactionId: String?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val settledLedgerAccountId: String?,
    private val settlementEntryDirection: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun ledgerTransactionId(): Optional<String> = Optional.ofNullable(ledgerTransactionId)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun settledLedgerAccountId(): Optional<String> = Optional.ofNullable(settledLedgerAccountId)

    fun settlementEntryDirection(): Optional<String> = Optional.ofNullable(settlementEntryDirection)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.id?.let { params.put("id[]", it.map(Any::toString)) }
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.ledgerTransactionId?.let { params.put("ledger_transaction_id", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.settledLedgerAccountId?.let {
            params.put("settled_ledger_account_id", listOf(it.toString()))
        }
        this.settlementEntryDirection?.let {
            params.put("settlement_entry_direction", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountSettlementListParams &&
            this.id == other.id &&
            this.afterCursor == other.afterCursor &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.metadata == other.metadata &&
            this.perPage == other.perPage &&
            this.settledLedgerAccountId == other.settledLedgerAccountId &&
            this.settlementEntryDirection == other.settlementEntryDirection &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            afterCursor,
            ledgerTransactionId,
            metadata,
            perPage,
            settledLedgerAccountId,
            settlementEntryDirection,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "LedgerAccountSettlementListParams{id=$id, afterCursor=$afterCursor, ledgerTransactionId=$ledgerTransactionId, metadata=$metadata, perPage=$perPage, settledLedgerAccountId=$settledLedgerAccountId, settlementEntryDirection=$settlementEntryDirection, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: MutableList<String> = mutableListOf()
        private var afterCursor: String? = null
        private var ledgerTransactionId: String? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var settledLedgerAccountId: String? = null
        private var settlementEntryDirection: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ledgerAccountSettlementListParams: LedgerAccountSettlementListParams) =
            apply {
                this.id(ledgerAccountSettlementListParams.id ?: listOf())
                this.afterCursor = ledgerAccountSettlementListParams.afterCursor
                this.ledgerTransactionId = ledgerAccountSettlementListParams.ledgerTransactionId
                this.metadata = ledgerAccountSettlementListParams.metadata
                this.perPage = ledgerAccountSettlementListParams.perPage
                this.settledLedgerAccountId =
                    ledgerAccountSettlementListParams.settledLedgerAccountId
                this.settlementEntryDirection =
                    ledgerAccountSettlementListParams.settlementEntryDirection
                additionalQueryParams(ledgerAccountSettlementListParams.additionalQueryParams)
                additionalHeaders(ledgerAccountSettlementListParams.additionalHeaders)
            }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun id(id: List<String>) = apply {
            this.id.clear()
            this.id.addAll(id)
        }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun addId(id: String) = apply { this.id.add(id) }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun settledLedgerAccountId(settledLedgerAccountId: String) = apply {
            this.settledLedgerAccountId = settledLedgerAccountId
        }

        fun settlementEntryDirection(settlementEntryDirection: String) = apply {
            this.settlementEntryDirection = settlementEntryDirection
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): LedgerAccountSettlementListParams =
            LedgerAccountSettlementListParams(
                if (id.size == 0) null else id.toUnmodifiable(),
                afterCursor,
                ledgerTransactionId,
                metadata,
                perPage,
                settledLedgerAccountId,
                settlementEntryDirection,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }
}
