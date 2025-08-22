// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of ledger transactions. */
class LedgerTransactionListParams
private constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val amount: Amount?,
    private val effectiveAt: EffectiveAt?,
    private val effectiveDate: EffectiveDate?,
    private val externalId: String?,
    private val ledgerAccountCategoryId: String?,
    private val ledgerAccountId: String?,
    private val ledgerAccountSettlementId: String?,
    private val ledgerId: String?,
    private val ledgerableId: String?,
    private val ledgerableType: LedgerableType?,
    private val metadata: Metadata?,
    private val orderBy: OrderBy?,
    private val partiallyPostsLedgerTransactionId: String?,
    private val perPage: Long?,
    private val postedAt: PostedAt?,
    private val reversesLedgerTransactionId: String?,
    private val status: Status?,
    private val updatedAt: UpdatedAt?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * If you have specific IDs to retrieve in bulk, you can pass them as query parameters delimited
     * with `id[]=`, for example `?id[]=123&id[]=abc`.
     */
    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    /** Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by amount. */
    fun amount(): Optional<Amount> = Optional.ofNullable(amount)

    /**
     * Use "gt" (>), "gte" (>=), "lt" (<), "lte" (<=), or "eq" (=) to filter by effective at. For
     * example, for all transactions after Jan 1 2000, use
     * effective_at%5Bgt%5D=2000-01-01T00:00:00:00.000Z.
     */
    fun effectiveAt(): Optional<EffectiveAt> = Optional.ofNullable(effectiveAt)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by effective date. For
     * example, for all dates after Jan 1 2000, use effective_date%5Bgt%5D=2000-01-01.
     */
    fun effectiveDate(): Optional<EffectiveDate> = Optional.ofNullable(effectiveDate)

    fun externalId(): Optional<String> = Optional.ofNullable(externalId)

    fun ledgerAccountCategoryId(): Optional<String> = Optional.ofNullable(ledgerAccountCategoryId)

    fun ledgerAccountId(): Optional<String> = Optional.ofNullable(ledgerAccountId)

    fun ledgerAccountSettlementId(): Optional<String> =
        Optional.ofNullable(ledgerAccountSettlementId)

    fun ledgerId(): Optional<String> = Optional.ofNullable(ledgerId)

    fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

    fun ledgerableType(): Optional<LedgerableType> = Optional.ofNullable(ledgerableType)

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    /**
     * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order by
     * `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field at a
     * time is supported.
     */
    fun orderBy(): Optional<OrderBy> = Optional.ofNullable(orderBy)

    fun partiallyPostsLedgerTransactionId(): Optional<String> =
        Optional.ofNullable(partiallyPostsLedgerTransactionId)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * posted_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    fun postedAt(): Optional<PostedAt> = Optional.ofNullable(postedAt)

    fun reversesLedgerTransactionId(): Optional<String> =
        Optional.ofNullable(reversesLedgerTransactionId)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    fun updatedAt(): Optional<UpdatedAt> = Optional.ofNullable(updatedAt)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LedgerTransactionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [LedgerTransactionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerTransactionListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var afterCursor: String? = null
        private var amount: Amount? = null
        private var effectiveAt: EffectiveAt? = null
        private var effectiveDate: EffectiveDate? = null
        private var externalId: String? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerAccountId: String? = null
        private var ledgerAccountSettlementId: String? = null
        private var ledgerId: String? = null
        private var ledgerableId: String? = null
        private var ledgerableType: LedgerableType? = null
        private var metadata: Metadata? = null
        private var orderBy: OrderBy? = null
        private var partiallyPostsLedgerTransactionId: String? = null
        private var perPage: Long? = null
        private var postedAt: PostedAt? = null
        private var reversesLedgerTransactionId: String? = null
        private var status: Status? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ledgerTransactionListParams: LedgerTransactionListParams) = apply {
            id = ledgerTransactionListParams.id?.toMutableList()
            afterCursor = ledgerTransactionListParams.afterCursor
            amount = ledgerTransactionListParams.amount
            effectiveAt = ledgerTransactionListParams.effectiveAt
            effectiveDate = ledgerTransactionListParams.effectiveDate
            externalId = ledgerTransactionListParams.externalId
            ledgerAccountCategoryId = ledgerTransactionListParams.ledgerAccountCategoryId
            ledgerAccountId = ledgerTransactionListParams.ledgerAccountId
            ledgerAccountSettlementId = ledgerTransactionListParams.ledgerAccountSettlementId
            ledgerId = ledgerTransactionListParams.ledgerId
            ledgerableId = ledgerTransactionListParams.ledgerableId
            ledgerableType = ledgerTransactionListParams.ledgerableType
            metadata = ledgerTransactionListParams.metadata
            orderBy = ledgerTransactionListParams.orderBy
            partiallyPostsLedgerTransactionId =
                ledgerTransactionListParams.partiallyPostsLedgerTransactionId
            perPage = ledgerTransactionListParams.perPage
            postedAt = ledgerTransactionListParams.postedAt
            reversesLedgerTransactionId = ledgerTransactionListParams.reversesLedgerTransactionId
            status = ledgerTransactionListParams.status
            updatedAt = ledgerTransactionListParams.updatedAt
            additionalHeaders = ledgerTransactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerTransactionListParams.additionalQueryParams.toBuilder()
        }

        /**
         * If you have specific IDs to retrieve in bulk, you can pass them as query parameters
         * delimited with `id[]=`, for example `?id[]=123&id[]=abc`.
         */
        fun id(id: List<String>?) = apply { this.id = id?.toMutableList() }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<List<String>>) = id(id.getOrNull())

        /**
         * Adds a single [String] to [Builder.id].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { this.id = (this.id ?: mutableListOf()).apply { add(id) } }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /** Alias for calling [Builder.afterCursor] with `afterCursor.orElse(null)`. */
        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.getOrNull())

        /** Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by amount. */
        fun amount(amount: Amount?) = apply { this.amount = amount }

        /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
        fun amount(amount: Optional<Amount>) = amount(amount.getOrNull())

        /**
         * Use "gt" (>), "gte" (>=), "lt" (<), "lte" (<=), or "eq" (=) to filter by effective at.
         * For example, for all transactions after Jan 1 2000, use
         * effective_at%5Bgt%5D=2000-01-01T00:00:00:00.000Z.
         */
        fun effectiveAt(effectiveAt: EffectiveAt?) = apply { this.effectiveAt = effectiveAt }

        /** Alias for calling [Builder.effectiveAt] with `effectiveAt.orElse(null)`. */
        fun effectiveAt(effectiveAt: Optional<EffectiveAt>) = effectiveAt(effectiveAt.getOrNull())

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by effective date.
         * For example, for all dates after Jan 1 2000, use effective_date%5Bgt%5D=2000-01-01.
         */
        fun effectiveDate(effectiveDate: EffectiveDate?) = apply {
            this.effectiveDate = effectiveDate
        }

        /** Alias for calling [Builder.effectiveDate] with `effectiveDate.orElse(null)`. */
        fun effectiveDate(effectiveDate: Optional<EffectiveDate>) =
            effectiveDate(effectiveDate.getOrNull())

        fun externalId(externalId: String?) = apply { this.externalId = externalId }

        /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

        fun ledgerAccountCategoryId(ledgerAccountCategoryId: String?) = apply {
            this.ledgerAccountCategoryId = ledgerAccountCategoryId
        }

        /**
         * Alias for calling [Builder.ledgerAccountCategoryId] with
         * `ledgerAccountCategoryId.orElse(null)`.
         */
        fun ledgerAccountCategoryId(ledgerAccountCategoryId: Optional<String>) =
            ledgerAccountCategoryId(ledgerAccountCategoryId.getOrNull())

        fun ledgerAccountId(ledgerAccountId: String?) = apply {
            this.ledgerAccountId = ledgerAccountId
        }

        /** Alias for calling [Builder.ledgerAccountId] with `ledgerAccountId.orElse(null)`. */
        fun ledgerAccountId(ledgerAccountId: Optional<String>) =
            ledgerAccountId(ledgerAccountId.getOrNull())

        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) = apply {
            this.ledgerAccountSettlementId = ledgerAccountSettlementId
        }

        /**
         * Alias for calling [Builder.ledgerAccountSettlementId] with
         * `ledgerAccountSettlementId.orElse(null)`.
         */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: Optional<String>) =
            ledgerAccountSettlementId(ledgerAccountSettlementId.getOrNull())

        fun ledgerId(ledgerId: String?) = apply { this.ledgerId = ledgerId }

        /** Alias for calling [Builder.ledgerId] with `ledgerId.orElse(null)`. */
        fun ledgerId(ledgerId: Optional<String>) = ledgerId(ledgerId.getOrNull())

        fun ledgerableId(ledgerableId: String?) = apply { this.ledgerableId = ledgerableId }

        /** Alias for calling [Builder.ledgerableId] with `ledgerableId.orElse(null)`. */
        fun ledgerableId(ledgerableId: Optional<String>) = ledgerableId(ledgerableId.getOrNull())

        fun ledgerableType(ledgerableType: LedgerableType?) = apply {
            this.ledgerableType = ledgerableType
        }

        /** Alias for calling [Builder.ledgerableType] with `ledgerableType.orElse(null)`. */
        fun ledgerableType(ledgerableType: Optional<LedgerableType>) =
            ledgerableType(ledgerableType.getOrNull())

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order
         * by `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field
         * at a time is supported.
         */
        fun orderBy(orderBy: OrderBy?) = apply { this.orderBy = orderBy }

        /** Alias for calling [Builder.orderBy] with `orderBy.orElse(null)`. */
        fun orderBy(orderBy: Optional<OrderBy>) = orderBy(orderBy.getOrNull())

        fun partiallyPostsLedgerTransactionId(partiallyPostsLedgerTransactionId: String?) = apply {
            this.partiallyPostsLedgerTransactionId = partiallyPostsLedgerTransactionId
        }

        /**
         * Alias for calling [Builder.partiallyPostsLedgerTransactionId] with
         * `partiallyPostsLedgerTransactionId.orElse(null)`.
         */
        fun partiallyPostsLedgerTransactionId(partiallyPostsLedgerTransactionId: Optional<String>) =
            partiallyPostsLedgerTransactionId(partiallyPostsLedgerTransactionId.getOrNull())

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * posted_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun postedAt(postedAt: PostedAt?) = apply { this.postedAt = postedAt }

        /** Alias for calling [Builder.postedAt] with `postedAt.orElse(null)`. */
        fun postedAt(postedAt: Optional<PostedAt>) = postedAt(postedAt.getOrNull())

        fun reversesLedgerTransactionId(reversesLedgerTransactionId: String?) = apply {
            this.reversesLedgerTransactionId = reversesLedgerTransactionId
        }

        /**
         * Alias for calling [Builder.reversesLedgerTransactionId] with
         * `reversesLedgerTransactionId.orElse(null)`.
         */
        fun reversesLedgerTransactionId(reversesLedgerTransactionId: Optional<String>) =
            reversesLedgerTransactionId(reversesLedgerTransactionId.getOrNull())

        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /** Alias for calling [status] with `Status.ofUnionMember0(unionMember0)`. */
        fun status(unionMember0: Status.UnionMember0) = status(Status.ofUnionMember0(unionMember0))

        /**
         * Alias for calling [status] with
         * `Status.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)`.
         */
        fun statusOfUnnamedSchemaWithArrayParent0s(
            unnamedSchemaWithArrayParent0s: List<Status.UnnamedSchemaWithArrayParent0>
        ) = status(Status.ofUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s))

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun updatedAt(updatedAt: UpdatedAt?) = apply { this.updatedAt = updatedAt }

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<UpdatedAt>) = updatedAt(updatedAt.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [LedgerTransactionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LedgerTransactionListParams =
            LedgerTransactionListParams(
                id?.toImmutable(),
                afterCursor,
                amount,
                effectiveAt,
                effectiveDate,
                externalId,
                ledgerAccountCategoryId,
                ledgerAccountId,
                ledgerAccountSettlementId,
                ledgerId,
                ledgerableId,
                ledgerableType,
                metadata,
                orderBy,
                partiallyPostsLedgerTransactionId,
                perPage,
                postedAt,
                reversesLedgerTransactionId,
                status,
                updatedAt,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                id?.forEach { put("id[]", it) }
                afterCursor?.let { put("after_cursor", it) }
                amount?.let {
                    it.eq().ifPresent { put("amount[eq]", it.toString()) }
                    it.gt().ifPresent { put("amount[gt]", it.toString()) }
                    it.gte().ifPresent { put("amount[gte]", it.toString()) }
                    it.lt().ifPresent { put("amount[lt]", it.toString()) }
                    it.lte().ifPresent { put("amount[lte]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("amount[$key]", value)
                        }
                    }
                }
                effectiveAt?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("effective_at[$key]", value)
                        }
                    }
                }
                effectiveDate?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("effective_date[$key]", value)
                        }
                    }
                }
                externalId?.let { put("external_id", it) }
                ledgerAccountCategoryId?.let { put("ledger_account_category_id", it) }
                ledgerAccountId?.let { put("ledger_account_id", it) }
                ledgerAccountSettlementId?.let { put("ledger_account_settlement_id", it) }
                ledgerId?.let { put("ledger_id", it) }
                ledgerableId?.let { put("ledgerable_id", it) }
                ledgerableType?.let { put("ledgerable_type", it.toString()) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                orderBy?.let {
                    it.createdAt().ifPresent { put("order_by[created_at]", it.toString()) }
                    it.effectiveAt().ifPresent { put("order_by[effective_at]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("order_by[$key]", value)
                        }
                    }
                }
                partiallyPostsLedgerTransactionId?.let {
                    put("partially_posts_ledger_transaction_id", it)
                }
                perPage?.let { put("per_page", it.toString()) }
                postedAt?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("posted_at[$key]", value)
                        }
                    }
                }
                reversesLedgerTransactionId?.let { put("reverses_ledger_transaction_id", it) }
                status?.accept(
                    object : Status.Visitor<Unit> {
                        override fun visitUnionMember0(unionMember0: Status.UnionMember0) {
                            put("status", unionMember0.toString())
                        }

                        override fun visitUnnamedSchemaWithArrayParent0s(
                            unnamedSchemaWithArrayParent0s:
                                List<Status.UnnamedSchemaWithArrayParent0>
                        ) {
                            unnamedSchemaWithArrayParent0s.forEach {
                                put("status[]", it.toString())
                            }
                        }
                    }
                )
                updatedAt?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("updated_at[$key]", value)
                        }
                    }
                }
                putAll(additionalQueryParams)
            }
            .build()

    /** Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by amount. */
    class Amount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Optional<Long> = Optional.ofNullable(eq)

        fun gt(): Optional<Long> = Optional.ofNullable(gt)

        fun gte(): Optional<Long> = Optional.ofNullable(gte)

        fun lt(): Optional<Long> = Optional.ofNullable(lt)

        fun lte(): Optional<Long> = Optional.ofNullable(lte)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Amount]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Amount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(amount: Amount) = apply {
                eq = amount.eq
                gt = amount.gt
                gte = amount.gte
                lt = amount.lt
                lte = amount.lte
                additionalProperties = amount.additionalProperties.toBuilder()
            }

            fun eq(eq: Long?) = apply { this.eq = eq }

            /**
             * Alias for [Builder.eq].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun eq(eq: Long) = eq(eq as Long?)

            /** Alias for calling [Builder.eq] with `eq.orElse(null)`. */
            fun eq(eq: Optional<Long>) = eq(eq.getOrNull())

            fun gt(gt: Long?) = apply { this.gt = gt }

            /**
             * Alias for [Builder.gt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun gt(gt: Long) = gt(gt as Long?)

            /** Alias for calling [Builder.gt] with `gt.orElse(null)`. */
            fun gt(gt: Optional<Long>) = gt(gt.getOrNull())

            fun gte(gte: Long?) = apply { this.gte = gte }

            /**
             * Alias for [Builder.gte].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun gte(gte: Long) = gte(gte as Long?)

            /** Alias for calling [Builder.gte] with `gte.orElse(null)`. */
            fun gte(gte: Optional<Long>) = gte(gte.getOrNull())

            fun lt(lt: Long?) = apply { this.lt = lt }

            /**
             * Alias for [Builder.lt].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lt(lt: Long) = lt(lt as Long?)

            /** Alias for calling [Builder.lt] with `lt.orElse(null)`. */
            fun lt(lt: Optional<Long>) = lt(lt.getOrNull())

            fun lte(lte: Long?) = apply { this.lte = lte }

            /**
             * Alias for [Builder.lte].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lte(lte: Long) = lte(lte as Long?)

            /** Alias for calling [Builder.lte] with `lte.orElse(null)`. */
            fun lte(lte: Optional<Long>) = lte(lte.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Amount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Amount = Amount(eq, gt, gte, lt, lte, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Amount &&
                eq == other.eq &&
                gt == other.gt &&
                gte == other.gte &&
                lt == other.lt &&
                lte == other.lte &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(eq, gt, gte, lt, lte, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Amount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, additionalProperties=$additionalProperties}"
    }

    /**
     * Use "gt" (>), "gte" (>=), "lt" (<), "lte" (<=), or "eq" (=) to filter by effective at. For
     * example, for all transactions after Jan 1 2000, use
     * effective_at%5Bgt%5D=2000-01-01T00:00:00:00.000Z.
     */
    class EffectiveAt private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [EffectiveAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EffectiveAt]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(effectiveAt: EffectiveAt) = apply {
                additionalProperties = effectiveAt.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [EffectiveAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EffectiveAt = EffectiveAt(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EffectiveAt && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "EffectiveAt{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by effective date. For
     * example, for all dates after Jan 1 2000, use effective_date%5Bgt%5D=2000-01-01.
     */
    class EffectiveDate private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [EffectiveDate]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [EffectiveDate]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(effectiveDate: EffectiveDate) = apply {
                additionalProperties = effectiveDate.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [EffectiveDate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EffectiveDate = EffectiveDate(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EffectiveDate && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "EffectiveDate{additionalProperties=$additionalProperties}"
    }

    class LedgerableType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EXPECTED_PAYMENT = of("expected_payment")

            @JvmField val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val RETURN = of("return")

            @JvmField val REVERSAL = of("reversal")

            @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        /** An enum containing [LedgerableType]'s known values. */
        enum class Known {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        /**
         * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LedgerableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            /**
             * An enum member indicating that [LedgerableType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ModernTreasuryInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): LedgerableType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerableType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * Order by `created_at` or `effective_at` in `asc` or `desc` order. For example, to order by
     * `effective_at asc`, use `order_by%5Beffective_at%5D=asc`. Ordering by only one field at a
     * time is supported.
     */
    class OrderBy
    private constructor(
        private val createdAt: CreatedAt?,
        private val effectiveAt: EffectiveAt?,
        private val additionalProperties: QueryParams,
    ) {

        fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

        fun effectiveAt(): Optional<EffectiveAt> = Optional.ofNullable(effectiveAt)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OrderBy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OrderBy]. */
        class Builder internal constructor() {

            private var createdAt: CreatedAt? = null
            private var effectiveAt: EffectiveAt? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(orderBy: OrderBy) = apply {
                createdAt = orderBy.createdAt
                effectiveAt = orderBy.effectiveAt
                additionalProperties = orderBy.additionalProperties.toBuilder()
            }

            fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

            /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
            fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

            fun effectiveAt(effectiveAt: EffectiveAt?) = apply { this.effectiveAt = effectiveAt }

            /** Alias for calling [Builder.effectiveAt] with `effectiveAt.orElse(null)`. */
            fun effectiveAt(effectiveAt: Optional<EffectiveAt>) =
                effectiveAt(effectiveAt.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [OrderBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OrderBy = OrderBy(createdAt, effectiveAt, additionalProperties.build())
        }

        class CreatedAt @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASC = of("asc")

                @JvmField val DESC = of("desc")

                @JvmStatic fun of(value: String) = CreatedAt(JsonField.of(value))
            }

            /** An enum containing [CreatedAt]'s known values. */
            enum class Known {
                ASC,
                DESC,
            }

            /**
             * An enum containing [CreatedAt]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [CreatedAt] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASC,
                DESC,
                /**
                 * An enum member indicating that [CreatedAt] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown CreatedAt: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ModernTreasuryInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): CreatedAt = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ModernTreasuryInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreatedAt && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EffectiveAt @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ASC = of("asc")

                @JvmField val DESC = of("desc")

                @JvmStatic fun of(value: String) = EffectiveAt(JsonField.of(value))
            }

            /** An enum containing [EffectiveAt]'s known values. */
            enum class Known {
                ASC,
                DESC,
            }

            /**
             * An enum containing [EffectiveAt]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [EffectiveAt] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ASC,
                DESC,
                /**
                 * An enum member indicating that [EffectiveAt] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ASC -> Value.ASC
                    DESC -> Value.DESC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ASC -> Known.ASC
                    DESC -> Known.DESC
                    else -> throw ModernTreasuryInvalidDataException("Unknown EffectiveAt: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ModernTreasuryInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): EffectiveAt = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ModernTreasuryInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EffectiveAt && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OrderBy &&
                createdAt == other.createdAt &&
                effectiveAt == other.effectiveAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(createdAt, effectiveAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OrderBy{createdAt=$createdAt, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * posted_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    class PostedAt private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PostedAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PostedAt]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(postedAt: PostedAt) = apply {
                additionalProperties = postedAt.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [PostedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PostedAt = PostedAt(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PostedAt && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PostedAt{additionalProperties=$additionalProperties}"
    }

    class Status
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unnamedSchemaWithArrayParent0s(): Optional<List<UnnamedSchemaWithArrayParent0>> =
            Optional.ofNullable(unnamedSchemaWithArrayParent0s)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnnamedSchemaWithArrayParent0s(): Boolean = unnamedSchemaWithArrayParent0s != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnnamedSchemaWithArrayParent0s(): List<UnnamedSchemaWithArrayParent0> =
            unnamedSchemaWithArrayParent0s.getOrThrow("unnamedSchemaWithArrayParent0s")

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unnamedSchemaWithArrayParent0s != null ->
                    visitor.visitUnnamedSchemaWithArrayParent0s(unnamedSchemaWithArrayParent0s)
                else -> throw IllegalStateException("Invalid Status")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status &&
                unionMember0 == other.unionMember0 &&
                unnamedSchemaWithArrayParent0s == other.unnamedSchemaWithArrayParent0s
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, unnamedSchemaWithArrayParent0s)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Status{unionMember0=$unionMember0}"
                unnamedSchemaWithArrayParent0s != null ->
                    "Status{unnamedSchemaWithArrayParent0s=$unnamedSchemaWithArrayParent0s}"
                else -> throw IllegalStateException("Invalid Status")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Status(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ) =
                Status(
                    unnamedSchemaWithArrayParent0s = unnamedSchemaWithArrayParent0s.toImmutable()
                )
        }

        /** An interface that defines how to map each variant of [Status] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnnamedSchemaWithArrayParent0s(
                unnamedSchemaWithArrayParent0s: List<UnnamedSchemaWithArrayParent0>
            ): T
        }

        class UnionMember0 @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("pending")

                @JvmField val POSTED = of("posted")

                @JvmField val ARCHIVED = of("archived")

                @JvmStatic fun of(value: String) = UnionMember0(JsonField.of(value))
            }

            /** An enum containing [UnionMember0]'s known values. */
            enum class Known {
                PENDING,
                POSTED,
                ARCHIVED,
            }

            /**
             * An enum containing [UnionMember0]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember0] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                POSTED,
                ARCHIVED,
                /**
                 * An enum member indicating that [UnionMember0] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    POSTED -> Value.POSTED
                    ARCHIVED -> Value.ARCHIVED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    POSTED -> Known.POSTED
                    ARCHIVED -> Known.ARCHIVED
                    else -> throw ModernTreasuryInvalidDataException("Unknown UnionMember0: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ModernTreasuryInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ModernTreasuryInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class UnnamedSchemaWithArrayParent0
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PENDING = of("pending")

                @JvmField val POSTED = of("posted")

                @JvmField val ARCHIVED = of("archived")

                @JvmStatic
                fun of(value: String) = UnnamedSchemaWithArrayParent0(JsonField.of(value))
            }

            /** An enum containing [UnnamedSchemaWithArrayParent0]'s known values. */
            enum class Known {
                PENDING,
                POSTED,
                ARCHIVED,
            }

            /**
             * An enum containing [UnnamedSchemaWithArrayParent0]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [UnnamedSchemaWithArrayParent0] can contain an unknown value in a
             * couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                POSTED,
                ARCHIVED,
                /**
                 * An enum member indicating that [UnnamedSchemaWithArrayParent0] was instantiated
                 * with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PENDING -> Value.PENDING
                    POSTED -> Value.POSTED
                    ARCHIVED -> Value.ARCHIVED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PENDING -> Known.PENDING
                    POSTED -> Known.POSTED
                    ARCHIVED -> Known.ARCHIVED
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown UnnamedSchemaWithArrayParent0: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ModernTreasuryInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ModernTreasuryInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): UnnamedSchemaWithArrayParent0 = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: ModernTreasuryInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnnamedSchemaWithArrayParent0 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the posted at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    class UpdatedAt private constructor(private val additionalProperties: QueryParams) {

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UpdatedAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UpdatedAt]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(updatedAt: UpdatedAt) = apply {
                additionalProperties = updatedAt.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceadditional_properties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceadditional_properties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAlladditional_properties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAlladditional_properties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeadditional_properties(key: String) = apply {
                additionalProperties.remove(key)
            }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [UpdatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UpdatedAt = UpdatedAt(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UpdatedAt && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UpdatedAt{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerTransactionListParams &&
            id == other.id &&
            afterCursor == other.afterCursor &&
            amount == other.amount &&
            effectiveAt == other.effectiveAt &&
            effectiveDate == other.effectiveDate &&
            externalId == other.externalId &&
            ledgerAccountCategoryId == other.ledgerAccountCategoryId &&
            ledgerAccountId == other.ledgerAccountId &&
            ledgerAccountSettlementId == other.ledgerAccountSettlementId &&
            ledgerId == other.ledgerId &&
            ledgerableId == other.ledgerableId &&
            ledgerableType == other.ledgerableType &&
            metadata == other.metadata &&
            orderBy == other.orderBy &&
            partiallyPostsLedgerTransactionId == other.partiallyPostsLedgerTransactionId &&
            perPage == other.perPage &&
            postedAt == other.postedAt &&
            reversesLedgerTransactionId == other.reversesLedgerTransactionId &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            afterCursor,
            amount,
            effectiveAt,
            effectiveDate,
            externalId,
            ledgerAccountCategoryId,
            ledgerAccountId,
            ledgerAccountSettlementId,
            ledgerId,
            ledgerableId,
            ledgerableType,
            metadata,
            orderBy,
            partiallyPostsLedgerTransactionId,
            perPage,
            postedAt,
            reversesLedgerTransactionId,
            status,
            updatedAt,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LedgerTransactionListParams{id=$id, afterCursor=$afterCursor, amount=$amount, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerAccountId=$ledgerAccountId, ledgerAccountSettlementId=$ledgerAccountSettlementId, ledgerId=$ledgerId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, orderBy=$orderBy, partiallyPostsLedgerTransactionId=$partiallyPostsLedgerTransactionId, perPage=$perPage, postedAt=$postedAt, reversesLedgerTransactionId=$reversesLedgerTransactionId, status=$status, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
