// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects
import java.util.Optional

class LedgerEntryListParams
constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val asOfLockVersion: Long?,
    private val direction: TransactionDirection?,
    private val effectiveAt: EffectiveAt?,
    private val effectiveDate: EffectiveDate?,
    private val ledgerAccountCategoryId: String?,
    private val ledgerAccountId: String?,
    private val ledgerAccountLockVersion: LedgerAccountLockVersion?,
    private val ledgerAccountPayoutId: String?,
    private val ledgerAccountSettlementId: String?,
    private val ledgerAccountStatementId: String?,
    private val ledgerTransactionId: String?,
    private val metadata: Metadata?,
    private val orderBy: OrderBy?,
    private val perPage: Long?,
    private val showBalances: Boolean?,
    private val showDeleted: Boolean?,
    private val status: Status?,
    private val updatedAt: UpdatedAt?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun asOfLockVersion(): Optional<Long> = Optional.ofNullable(asOfLockVersion)

    fun direction(): Optional<TransactionDirection> = Optional.ofNullable(direction)

    fun effectiveAt(): Optional<EffectiveAt> = Optional.ofNullable(effectiveAt)

    fun effectiveDate(): Optional<EffectiveDate> = Optional.ofNullable(effectiveDate)

    fun ledgerAccountCategoryId(): Optional<String> = Optional.ofNullable(ledgerAccountCategoryId)

    fun ledgerAccountId(): Optional<String> = Optional.ofNullable(ledgerAccountId)

    fun ledgerAccountLockVersion(): Optional<LedgerAccountLockVersion> =
        Optional.ofNullable(ledgerAccountLockVersion)

    fun ledgerAccountPayoutId(): Optional<String> = Optional.ofNullable(ledgerAccountPayoutId)

    fun ledgerAccountSettlementId(): Optional<String> =
        Optional.ofNullable(ledgerAccountSettlementId)

    fun ledgerAccountStatementId(): Optional<String> = Optional.ofNullable(ledgerAccountStatementId)

    fun ledgerTransactionId(): Optional<String> = Optional.ofNullable(ledgerTransactionId)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun orderBy(): Optional<OrderBy> = Optional.ofNullable(orderBy)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun showBalances(): Optional<Boolean> = Optional.ofNullable(showBalances)

    fun showDeleted(): Optional<Boolean> = Optional.ofNullable(showDeleted)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun updatedAt(): Optional<UpdatedAt> = Optional.ofNullable(updatedAt)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.id?.let { queryParams.put("id[]", it.map(Any::toString)) }
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.asOfLockVersion?.let { queryParams.put("as_of_lock_version", listOf(it.toString())) }
        this.direction?.let { queryParams.put("direction", listOf(it.toString())) }
        this.effectiveAt?.forEachQueryParam { key, values ->
            queryParams.put("effective_at[$key]", values)
        }
        this.effectiveDate?.forEachQueryParam { key, values ->
            queryParams.put("effective_date[$key]", values)
        }
        this.ledgerAccountCategoryId?.let {
            queryParams.put("ledger_account_category_id", listOf(it.toString()))
        }
        this.ledgerAccountId?.let { queryParams.put("ledger_account_id", listOf(it.toString())) }
        this.ledgerAccountLockVersion?.forEachQueryParam { key, values ->
            queryParams.put("ledger_account_lock_version[$key]", values)
        }
        this.ledgerAccountPayoutId?.let {
            queryParams.put("ledger_account_payout_id", listOf(it.toString()))
        }
        this.ledgerAccountSettlementId?.let {
            queryParams.put("ledger_account_settlement_id", listOf(it.toString()))
        }
        this.ledgerAccountStatementId?.let {
            queryParams.put("ledger_account_statement_id", listOf(it.toString()))
        }
        this.ledgerTransactionId?.let {
            queryParams.put("ledger_transaction_id", listOf(it.toString()))
        }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.orderBy?.forEachQueryParam { key, values -> queryParams.put("order_by[$key]", values) }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.showBalances?.let { queryParams.put("show_balances", listOf(it.toString())) }
        this.showDeleted?.let { queryParams.put("show_deleted", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.updatedAt?.forEachQueryParam { key, values ->
            queryParams.put("updated_at[$key]", values)
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: MutableList<String> = mutableListOf()
        private var afterCursor: String? = null
        private var asOfLockVersion: Long? = null
        private var direction: TransactionDirection? = null
        private var effectiveAt: EffectiveAt? = null
        private var effectiveDate: EffectiveDate? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerAccountId: String? = null
        private var ledgerAccountLockVersion: LedgerAccountLockVersion? = null
        private var ledgerAccountPayoutId: String? = null
        private var ledgerAccountSettlementId: String? = null
        private var ledgerAccountStatementId: String? = null
        private var ledgerTransactionId: String? = null
        private var metadata: Metadata? = null
        private var orderBy: OrderBy? = null
        private var perPage: Long? = null
        private var showBalances: Boolean? = null
        private var showDeleted: Boolean? = null
        private var status: Status? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ledgerEntryListParams: LedgerEntryListParams) = apply {
            id = ledgerEntryListParams.id?.toMutableList() ?: mutableListOf()
            afterCursor = ledgerEntryListParams.afterCursor
            asOfLockVersion = ledgerEntryListParams.asOfLockVersion
            direction = ledgerEntryListParams.direction
            effectiveAt = ledgerEntryListParams.effectiveAt
            effectiveDate = ledgerEntryListParams.effectiveDate
            ledgerAccountCategoryId = ledgerEntryListParams.ledgerAccountCategoryId
            ledgerAccountId = ledgerEntryListParams.ledgerAccountId
            ledgerAccountLockVersion = ledgerEntryListParams.ledgerAccountLockVersion
            ledgerAccountPayoutId = ledgerEntryListParams.ledgerAccountPayoutId
            ledgerAccountSettlementId = ledgerEntryListParams.ledgerAccountSettlementId
            ledgerAccountStatementId = ledgerEntryListParams.ledgerAccountStatementId
            ledgerTransactionId = ledgerEntryListParams.ledgerTransactionId
            metadata = ledgerEntryListParams.metadata
            orderBy = ledgerEntryListParams.orderBy
            perPage = ledgerEntryListParams.perPage
            showBalances = ledgerEntryListParams.showBalances
            showDeleted = ledgerEntryListParams.showDeleted
            status = ledgerEntryListParams.status
            updatedAt = ledgerEntryListParams.updatedAt
            additionalHeaders = ledgerEntryListParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerEntryListParams.additionalQueryParams.toBuilder()
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

        /**
         * Shows all ledger entries that were present on a ledger account at a particular
         * `lock_version`. You must also specify `ledger_account_id`.
         */
        fun asOfLockVersion(asOfLockVersion: Long) = apply {
            this.asOfLockVersion = asOfLockVersion
        }

        /**
         * If true, response will include ledger entries that were deleted. When you update a ledger
         * transaction to specify a new set of entries, the previous entries are deleted.
         */
        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the
         * transaction's effective time. Format ISO8601
         */
        fun effectiveAt(effectiveAt: EffectiveAt) = apply { this.effectiveAt = effectiveAt }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the
         * transaction's effective date. Format YYYY-MM-DD
         */
        fun effectiveDate(effectiveDate: EffectiveDate) = apply {
            this.effectiveDate = effectiveDate
        }

        /** Get all ledger entries that match the direction specified. One of `credit`, `debit`. */
        fun ledgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
            this.ledgerAccountCategoryId = ledgerAccountCategoryId
        }

        fun ledgerAccountId(ledgerAccountId: String) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the lock_version
         * of a ledger account. For example, for all entries created at or before before
         * lock_version 1000 of a ledger account, use `ledger_account_lock_version%5Blte%5D=1000`.
         */
        fun ledgerAccountLockVersion(ledgerAccountLockVersion: LedgerAccountLockVersion) = apply {
            this.ledgerAccountLockVersion = ledgerAccountLockVersion
        }

        fun ledgerAccountPayoutId(ledgerAccountPayoutId: String) = apply {
            this.ledgerAccountPayoutId = ledgerAccountPayoutId
        }

        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String) = apply {
            this.ledgerAccountSettlementId = ledgerAccountSettlementId
        }

        /** Get all ledger entries that are included in the ledger account statement. */
        fun ledgerAccountStatementId(ledgerAccountStatementId: String) = apply {
            this.ledgerAccountStatementId = ledgerAccountStatementId
        }

        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order
         * by `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field
         * at a time is supported.
         */
        fun orderBy(orderBy: OrderBy) = apply { this.orderBy = orderBy }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * If true, response will include the balances attached to the ledger entry. If there is no
         * balance available, null will be returned instead.
         */
        fun showBalances(showBalances: Boolean) = apply { this.showBalances = showBalances }

        /**
         * If true, response will include ledger entries that were deleted. When you update a ledger
         * transaction to specify a new set of entries, the previous entries are deleted.
         */
        fun showDeleted(showDeleted: Boolean) = apply { this.showDeleted = showDeleted }

        /**
         * Get all ledger entries that match the status specified. One of `pending`, `posted`, or
         * `archived`.
         */
        fun status(status: Status) = apply { this.status = status }

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun updatedAt(updatedAt: UpdatedAt) = apply { this.updatedAt = updatedAt }

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

        fun build(): LedgerEntryListParams =
            LedgerEntryListParams(
                id.toImmutable().ifEmpty { null },
                afterCursor,
                asOfLockVersion,
                direction,
                effectiveAt,
                effectiveDate,
                ledgerAccountCategoryId,
                ledgerAccountId,
                ledgerAccountLockVersion,
                ledgerAccountPayoutId,
                ledgerAccountSettlementId,
                ledgerAccountStatementId,
                ledgerTransactionId,
                metadata,
                orderBy,
                perPage,
                showBalances,
                showDeleted,
                status,
                updatedAt,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective time. Format ISO8601
     */
    @JsonDeserialize(builder = EffectiveAt.Builder::class)
    @NoAutoDetect
    class EffectiveAt
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(effectiveAt: EffectiveAt) = apply {
                additionalProperties(effectiveAt.additionalProperties)
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

            fun build(): EffectiveAt = EffectiveAt(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EffectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "EffectiveAt{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the transaction's
     * effective date. Format YYYY-MM-DD
     */
    @JsonDeserialize(builder = EffectiveDate.Builder::class)
    @NoAutoDetect
    class EffectiveDate
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(effectiveDate: EffectiveDate) = apply {
                additionalProperties(effectiveDate.additionalProperties)
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

            fun build(): EffectiveDate = EffectiveDate(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EffectiveDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "EffectiveDate{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the lock_version of
     * a ledger account. For example, for all entries created at or before before lock_version 1000
     * of a ledger account, use `ledger_account_lock_version%5Blte%5D=1000`.
     */
    @JsonDeserialize(builder = LedgerAccountLockVersion.Builder::class)
    @NoAutoDetect
    class LedgerAccountLockVersion
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerAccountLockVersion: LedgerAccountLockVersion) = apply {
                additionalProperties(ledgerAccountLockVersion.additionalProperties)
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

            fun build(): LedgerAccountLockVersion =
                LedgerAccountLockVersion(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountLockVersion && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountLockVersion{additionalProperties=$additionalProperties}"
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

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order by
     * `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field at a
     * time is supported.
     */
    @JsonDeserialize(builder = OrderBy.Builder::class)
    @NoAutoDetect
    class OrderBy
    private constructor(
        private val createdAt: CreatedAt?,
        private val effectiveAt: EffectiveAt?,
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun createdAt(): CreatedAt? = createdAt

        fun effectiveAt(): EffectiveAt? = effectiveAt

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.createdAt?.let { putParam("created_at", listOf(it.toString())) }
            this.effectiveAt?.let { putParam("effective_at", listOf(it.toString())) }
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: CreatedAt? = null
            private var effectiveAt: EffectiveAt? = null
            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(orderBy: OrderBy) = apply {
                this.createdAt = orderBy.createdAt
                this.effectiveAt = orderBy.effectiveAt
                additionalProperties(orderBy.additionalProperties)
            }

            fun createdAt(createdAt: CreatedAt) = apply { this.createdAt = createdAt }

            fun effectiveAt(effectiveAt: EffectiveAt) = apply { this.effectiveAt = effectiveAt }

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

            fun build(): OrderBy =
                OrderBy(
                    createdAt,
                    effectiveAt,
                    additionalProperties.toImmutable(),
                )
        }

        class CreatedAt
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASC = of("asc")

                @JvmField val DESC = of("desc")

                @JvmStatic fun of(value: String) = CreatedAt(JsonField.of(value))
            }

            enum class Known {
                ASC,
                DESC,
            }

            enum class Value {
                ASC,
                DESC,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown CreatedAt: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreatedAt && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EffectiveAt
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASC = of("asc")

                @JvmField val DESC = of("desc")

                @JvmStatic fun of(value: String) = EffectiveAt(JsonField.of(value))
            }

            enum class Known {
                ASC,
                DESC,
            }

            enum class Value {
                ASC,
                DESC,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown EffectiveAt: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EffectiveAt && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OrderBy && createdAt == other.createdAt && effectiveAt == other.effectiveAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, effectiveAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OrderBy{createdAt=$createdAt, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("pending")

            @JvmField val POSTED = of("posted")

            @JvmField val ARCHIVED = of("archived")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            POSTED,
            ARCHIVED,
        }

        enum class Value {
            PENDING,
            POSTED,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
                ARCHIVED -> Known.ARCHIVED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    @JsonDeserialize(builder = UpdatedAt.Builder::class)
    @NoAutoDetect
    class UpdatedAt
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(updatedAt: UpdatedAt) = apply {
                additionalProperties(updatedAt.additionalProperties)
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

            fun build(): UpdatedAt = UpdatedAt(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UpdatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "UpdatedAt{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerEntryListParams && id == other.id && afterCursor == other.afterCursor && asOfLockVersion == other.asOfLockVersion && direction == other.direction && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && ledgerAccountCategoryId == other.ledgerAccountCategoryId && ledgerAccountId == other.ledgerAccountId && ledgerAccountLockVersion == other.ledgerAccountLockVersion && ledgerAccountPayoutId == other.ledgerAccountPayoutId && ledgerAccountSettlementId == other.ledgerAccountSettlementId && ledgerAccountStatementId == other.ledgerAccountStatementId && ledgerTransactionId == other.ledgerTransactionId && metadata == other.metadata && orderBy == other.orderBy && perPage == other.perPage && showBalances == other.showBalances && showDeleted == other.showDeleted && status == other.status && updatedAt == other.updatedAt && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, afterCursor, asOfLockVersion, direction, effectiveAt, effectiveDate, ledgerAccountCategoryId, ledgerAccountId, ledgerAccountLockVersion, ledgerAccountPayoutId, ledgerAccountSettlementId, ledgerAccountStatementId, ledgerTransactionId, metadata, orderBy, perPage, showBalances, showDeleted, status, updatedAt, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerEntryListParams{id=$id, afterCursor=$afterCursor, asOfLockVersion=$asOfLockVersion, direction=$direction, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerAccountId=$ledgerAccountId, ledgerAccountLockVersion=$ledgerAccountLockVersion, ledgerAccountPayoutId=$ledgerAccountPayoutId, ledgerAccountSettlementId=$ledgerAccountSettlementId, ledgerAccountStatementId=$ledgerAccountStatementId, ledgerTransactionId=$ledgerTransactionId, metadata=$metadata, orderBy=$orderBy, perPage=$perPage, showBalances=$showBalances, showDeleted=$showDeleted, status=$status, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
