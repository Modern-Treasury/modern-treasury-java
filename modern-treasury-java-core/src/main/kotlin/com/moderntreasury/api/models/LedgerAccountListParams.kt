// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of ledger accounts. */
class LedgerAccountListParams
private constructor(
    private val id: List<String>?,
    private val afterCursor: String?,
    private val availableBalanceAmount: AvailableBalanceAmount?,
    private val balances: Balances?,
    private val createdAt: CreatedAt?,
    private val currency: String?,
    private val externalId: String?,
    private val ledgerAccountCategoryId: String?,
    private val ledgerId: String?,
    private val metadata: Metadata?,
    private val name: List<String>?,
    private val normalBalance: TransactionDirection?,
    private val pendingBalanceAmount: PendingBalanceAmount?,
    private val perPage: Long?,
    private val postedBalanceAmount: PostedBalanceAmount?,
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

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
        Optional.ofNullable(availableBalanceAmount)

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound.
     */
    fun balances(): Optional<Balances> = Optional.ofNullable(balances)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    fun createdAt(): Optional<CreatedAt> = Optional.ofNullable(createdAt)

    fun currency(): Optional<String> = Optional.ofNullable(currency)

    fun externalId(): Optional<String> = Optional.ofNullable(externalId)

    fun ledgerAccountCategoryId(): Optional<String> = Optional.ofNullable(ledgerAccountCategoryId)

    fun ledgerId(): Optional<String> = Optional.ofNullable(ledgerId)

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    /**
     * If you have specific names to retrieve in bulk, you can pass them as query parameters
     * delimited with `name[]=`, for example `?name[]=123&name[]=abc`.
     */
    fun name(): Optional<List<String>> = Optional.ofNullable(name)

    fun normalBalance(): Optional<TransactionDirection> = Optional.ofNullable(normalBalance)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
        Optional.ofNullable(pendingBalanceAmount)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
        Optional.ofNullable(postedBalanceAmount)

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    fun updatedAt(): Optional<UpdatedAt> = Optional.ofNullable(updatedAt)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LedgerAccountListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [LedgerAccountListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerAccountListParams]. */
    class Builder internal constructor() {

        private var id: MutableList<String>? = null
        private var afterCursor: String? = null
        private var availableBalanceAmount: AvailableBalanceAmount? = null
        private var balances: Balances? = null
        private var createdAt: CreatedAt? = null
        private var currency: String? = null
        private var externalId: String? = null
        private var ledgerAccountCategoryId: String? = null
        private var ledgerId: String? = null
        private var metadata: Metadata? = null
        private var name: MutableList<String>? = null
        private var normalBalance: TransactionDirection? = null
        private var pendingBalanceAmount: PendingBalanceAmount? = null
        private var perPage: Long? = null
        private var postedBalanceAmount: PostedBalanceAmount? = null
        private var updatedAt: UpdatedAt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ledgerAccountListParams: LedgerAccountListParams) = apply {
            id = ledgerAccountListParams.id?.toMutableList()
            afterCursor = ledgerAccountListParams.afterCursor
            availableBalanceAmount = ledgerAccountListParams.availableBalanceAmount
            balances = ledgerAccountListParams.balances
            createdAt = ledgerAccountListParams.createdAt
            currency = ledgerAccountListParams.currency
            externalId = ledgerAccountListParams.externalId
            ledgerAccountCategoryId = ledgerAccountListParams.ledgerAccountCategoryId
            ledgerId = ledgerAccountListParams.ledgerId
            metadata = ledgerAccountListParams.metadata
            name = ledgerAccountListParams.name?.toMutableList()
            normalBalance = ledgerAccountListParams.normalBalance
            pendingBalanceAmount = ledgerAccountListParams.pendingBalanceAmount
            perPage = ledgerAccountListParams.perPage
            postedBalanceAmount = ledgerAccountListParams.postedBalanceAmount
            updatedAt = ledgerAccountListParams.updatedAt
            additionalHeaders = ledgerAccountListParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerAccountListParams.additionalQueryParams.toBuilder()
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

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) = apply {
            this.availableBalanceAmount = availableBalanceAmount
        }

        /**
         * Alias for calling [Builder.availableBalanceAmount] with
         * `availableBalanceAmount.orElse(null)`.
         */
        fun availableBalanceAmount(availableBalanceAmount: Optional<AvailableBalanceAmount>) =
            availableBalanceAmount(availableBalanceAmount.getOrNull())

        /**
         * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get
         * the balances change between the two timestamps. The lower bound is inclusive while the
         * upper bound is exclusive of the provided timestamps. If no value is supplied the balances
         * will be retrieved not including that bound.
         */
        fun balances(balances: Balances?) = apply { this.balances = balances }

        /** Alias for calling [Builder.balances] with `balances.orElse(null)`. */
        fun balances(balances: Optional<Balances>) = balances(balances.getOrNull())

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun createdAt(createdAt: CreatedAt?) = apply { this.createdAt = createdAt }

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<CreatedAt>) = createdAt(createdAt.getOrNull())

        fun currency(currency: String?) = apply { this.currency = currency }

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

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

        fun ledgerId(ledgerId: String?) = apply { this.ledgerId = ledgerId }

        /** Alias for calling [Builder.ledgerId] with `ledgerId.orElse(null)`. */
        fun ledgerId(ledgerId: Optional<String>) = ledgerId(ledgerId.getOrNull())

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * If you have specific names to retrieve in bulk, you can pass them as query parameters
         * delimited with `name[]=`, for example `?name[]=123&name[]=abc`.
         */
        fun name(name: List<String>?) = apply { this.name = name?.toMutableList() }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<List<String>>) = name(name.getOrNull())

        /**
         * Adds a single [String] to [Builder.name].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addName(name: String) = apply {
            this.name = (this.name ?: mutableListOf()).apply { add(name) }
        }

        fun normalBalance(normalBalance: TransactionDirection?) = apply {
            this.normalBalance = normalBalance
        }

        /** Alias for calling [Builder.normalBalance] with `normalBalance.orElse(null)`. */
        fun normalBalance(normalBalance: Optional<TransactionDirection>) =
            normalBalance(normalBalance.getOrNull())

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) = apply {
            this.pendingBalanceAmount = pendingBalanceAmount
        }

        /**
         * Alias for calling [Builder.pendingBalanceAmount] with
         * `pendingBalanceAmount.orElse(null)`.
         */
        fun pendingBalanceAmount(pendingBalanceAmount: Optional<PendingBalanceAmount>) =
            pendingBalanceAmount(pendingBalanceAmount.getOrNull())

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
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
         * balance amount.
         */
        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) = apply {
            this.postedBalanceAmount = postedBalanceAmount
        }

        /**
         * Alias for calling [Builder.postedBalanceAmount] with `postedBalanceAmount.orElse(null)`.
         */
        fun postedBalanceAmount(postedBalanceAmount: Optional<PostedBalanceAmount>) =
            postedBalanceAmount(postedBalanceAmount.getOrNull())

        /**
         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
         * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
         * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
         */
        fun updatedAt(updatedAt: UpdatedAt?) = apply { this.updatedAt = updatedAt }

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<UpdatedAt>) = updatedAt(updatedAt.getOrNull())

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

        /**
         * Returns an immutable instance of [LedgerAccountListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LedgerAccountListParams =
            LedgerAccountListParams(
                id?.toImmutable(),
                afterCursor,
                availableBalanceAmount,
                balances,
                createdAt,
                currency,
                externalId,
                ledgerAccountCategoryId,
                ledgerId,
                metadata,
                name?.toImmutable(),
                normalBalance,
                pendingBalanceAmount,
                perPage,
                postedBalanceAmount,
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
                availableBalanceAmount?.let {
                    it.eq().ifPresent { put("available_balance_amount[eq]", it.toString()) }
                    it.gt().ifPresent { put("available_balance_amount[gt]", it.toString()) }
                    it.gte().ifPresent { put("available_balance_amount[gte]", it.toString()) }
                    it.lt().ifPresent { put("available_balance_amount[lt]", it.toString()) }
                    it.lte().ifPresent { put("available_balance_amount[lte]", it.toString()) }
                    it.notEq().ifPresent { put("available_balance_amount[not_eq]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("available_balance_amount[$key]", value)
                        }
                    }
                }
                balances?.let {
                    it.asOfDate().ifPresent { put("balances[as_of_date]", it.toString()) }
                    it.effectiveAt().ifPresent {
                        put(
                            "balances[effective_at]",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it.effectiveAtLowerBound().ifPresent {
                        put(
                            "balances[effective_at_lower_bound]",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it.effectiveAtUpperBound().ifPresent {
                        put(
                            "balances[effective_at_upper_bound]",
                            DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it),
                        )
                    }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("balances[$key]", value)
                        }
                    }
                }
                createdAt?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("created_at[$key]", value)
                        }
                    }
                }
                currency?.let { put("currency", it) }
                externalId?.let { put("external_id", it) }
                ledgerAccountCategoryId?.let { put("ledger_account_category_id", it) }
                ledgerId?.let { put("ledger_id", it) }
                metadata?.let {
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("metadata[$key]", value)
                        }
                    }
                }
                name?.forEach { put("name[]", it) }
                normalBalance?.let { put("normal_balance", it.toString()) }
                pendingBalanceAmount?.let {
                    it.eq().ifPresent { put("pending_balance_amount[eq]", it.toString()) }
                    it.gt().ifPresent { put("pending_balance_amount[gt]", it.toString()) }
                    it.gte().ifPresent { put("pending_balance_amount[gte]", it.toString()) }
                    it.lt().ifPresent { put("pending_balance_amount[lt]", it.toString()) }
                    it.lte().ifPresent { put("pending_balance_amount[lte]", it.toString()) }
                    it.notEq().ifPresent { put("pending_balance_amount[not_eq]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("pending_balance_amount[$key]", value)
                        }
                    }
                }
                perPage?.let { put("per_page", it.toString()) }
                postedBalanceAmount?.let {
                    it.eq().ifPresent { put("posted_balance_amount[eq]", it.toString()) }
                    it.gt().ifPresent { put("posted_balance_amount[gt]", it.toString()) }
                    it.gte().ifPresent { put("posted_balance_amount[gte]", it.toString()) }
                    it.lt().ifPresent { put("posted_balance_amount[lt]", it.toString()) }
                    it.lte().ifPresent { put("posted_balance_amount[lte]", it.toString()) }
                    it.notEq().ifPresent { put("posted_balance_amount[not_eq]", it.toString()) }
                    it._additionalProperties().keys().forEach { key ->
                        it._additionalProperties().values(key).forEach { value ->
                            put("posted_balance_amount[$key]", value)
                        }
                    }
                }
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

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    class AvailableBalanceAmount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val notEq: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Optional<Long> = Optional.ofNullable(eq)

        fun gt(): Optional<Long> = Optional.ofNullable(gt)

        fun gte(): Optional<Long> = Optional.ofNullable(gte)

        fun lt(): Optional<Long> = Optional.ofNullable(lt)

        fun lte(): Optional<Long> = Optional.ofNullable(lte)

        fun notEq(): Optional<Long> = Optional.ofNullable(notEq)

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [AvailableBalanceAmount].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AvailableBalanceAmount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                eq = availableBalanceAmount.eq
                gt = availableBalanceAmount.gt
                gte = availableBalanceAmount.gte
                lt = availableBalanceAmount.lt
                lte = availableBalanceAmount.lte
                notEq = availableBalanceAmount.notEq
                additionalProperties = availableBalanceAmount.additionalProperties.toBuilder()
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

            fun notEq(notEq: Long?) = apply { this.notEq = notEq }

            /**
             * Alias for [Builder.notEq].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun notEq(notEq: Long) = notEq(notEq as Long?)

            /** Alias for calling [Builder.notEq] with `notEq.orElse(null)`. */
            fun notEq(notEq: Optional<Long>) = notEq(notEq.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [AvailableBalanceAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AvailableBalanceAmount =
                AvailableBalanceAmount(eq, gt, gte, lt, lte, notEq, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AvailableBalanceAmount && eq == other.eq && gt == other.gt && gte == other.gte && lt == other.lt && lte == other.lte && notEq == other.notEq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, gt, gte, lt, lte, notEq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AvailableBalanceAmount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound.
     */
    class Balances
    private constructor(
        private val asOfDate: LocalDate?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveAtLowerBound: OffsetDateTime?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate)

        fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

        fun effectiveAtLowerBound(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAtLowerBound)

        fun effectiveAtUpperBound(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAtUpperBound)

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Balances]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Balances]. */
        class Builder internal constructor() {

            private var asOfDate: LocalDate? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(balances: Balances) = apply {
                asOfDate = balances.asOfDate
                effectiveAt = balances.effectiveAt
                effectiveAtLowerBound = balances.effectiveAtLowerBound
                effectiveAtUpperBound = balances.effectiveAtUpperBound
                additionalProperties = balances.additionalProperties.toBuilder()
            }

            fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

            /** Alias for calling [Builder.asOfDate] with `asOfDate.orElse(null)`. */
            fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.getOrNull())

            fun effectiveAt(effectiveAt: OffsetDateTime?) = apply { this.effectiveAt = effectiveAt }

            /** Alias for calling [Builder.effectiveAt] with `effectiveAt.orElse(null)`. */
            fun effectiveAt(effectiveAt: Optional<OffsetDateTime>) =
                effectiveAt(effectiveAt.getOrNull())

            fun effectiveAtLowerBound(effectiveAtLowerBound: OffsetDateTime?) = apply {
                this.effectiveAtLowerBound = effectiveAtLowerBound
            }

            /**
             * Alias for calling [Builder.effectiveAtLowerBound] with
             * `effectiveAtLowerBound.orElse(null)`.
             */
            fun effectiveAtLowerBound(effectiveAtLowerBound: Optional<OffsetDateTime>) =
                effectiveAtLowerBound(effectiveAtLowerBound.getOrNull())

            fun effectiveAtUpperBound(effectiveAtUpperBound: OffsetDateTime?) = apply {
                this.effectiveAtUpperBound = effectiveAtUpperBound
            }

            /**
             * Alias for calling [Builder.effectiveAtUpperBound] with
             * `effectiveAtUpperBound.orElse(null)`.
             */
            fun effectiveAtUpperBound(effectiveAtUpperBound: Optional<OffsetDateTime>) =
                effectiveAtUpperBound(effectiveAtUpperBound.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Balances].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Balances =
                Balances(
                    asOfDate,
                    effectiveAt,
                    effectiveAtLowerBound,
                    effectiveAtUpperBound,
                    additionalProperties.build(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balances && asOfDate == other.asOfDate && effectiveAt == other.effectiveAt && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(asOfDate, effectiveAt, effectiveAtLowerBound, effectiveAtUpperBound, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{asOfDate=$asOfDate, effectiveAt=$effectiveAt, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the created at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * created_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    class CreatedAt private constructor(private val additionalProperties: QueryParams) {

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CreatedAt]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreatedAt]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(createdAt: CreatedAt) = apply {
                additionalProperties = createdAt.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [CreatedAt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CreatedAt = CreatedAt(additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CreatedAt{additionalProperties=$additionalProperties}"
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

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
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
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

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    class PendingBalanceAmount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val notEq: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Optional<Long> = Optional.ofNullable(eq)

        fun gt(): Optional<Long> = Optional.ofNullable(gt)

        fun gte(): Optional<Long> = Optional.ofNullable(gte)

        fun lt(): Optional<Long> = Optional.ofNullable(lt)

        fun lte(): Optional<Long> = Optional.ofNullable(lte)

        fun notEq(): Optional<Long> = Optional.ofNullable(notEq)

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PendingBalanceAmount]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PendingBalanceAmount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                eq = pendingBalanceAmount.eq
                gt = pendingBalanceAmount.gt
                gte = pendingBalanceAmount.gte
                lt = pendingBalanceAmount.lt
                lte = pendingBalanceAmount.lte
                notEq = pendingBalanceAmount.notEq
                additionalProperties = pendingBalanceAmount.additionalProperties.toBuilder()
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

            fun notEq(notEq: Long?) = apply { this.notEq = notEq }

            /**
             * Alias for [Builder.notEq].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun notEq(notEq: Long) = notEq(notEq as Long?)

            /** Alias for calling [Builder.notEq] with `notEq.orElse(null)`. */
            fun notEq(notEq: Optional<Long>) = notEq(notEq.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [PendingBalanceAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PendingBalanceAmount =
                PendingBalanceAmount(eq, gt, gte, lt, lte, notEq, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PendingBalanceAmount && eq == other.eq && gt == other.gt && gte == other.gte && lt == other.lt && lte == other.lte && notEq == other.notEq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, gt, gte, lt, lte, notEq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PendingBalanceAmount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), `eq` (=), or `not_eq` (!=) to filter by
     * balance amount.
     */
    class PostedBalanceAmount
    private constructor(
        private val eq: Long?,
        private val gt: Long?,
        private val gte: Long?,
        private val lt: Long?,
        private val lte: Long?,
        private val notEq: Long?,
        private val additionalProperties: QueryParams,
    ) {

        fun eq(): Optional<Long> = Optional.ofNullable(eq)

        fun gt(): Optional<Long> = Optional.ofNullable(gt)

        fun gte(): Optional<Long> = Optional.ofNullable(gte)

        fun lt(): Optional<Long> = Optional.ofNullable(lt)

        fun lte(): Optional<Long> = Optional.ofNullable(lte)

        fun notEq(): Optional<Long> = Optional.ofNullable(notEq)

        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PostedBalanceAmount]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PostedBalanceAmount]. */
        class Builder internal constructor() {

            private var eq: Long? = null
            private var gt: Long? = null
            private var gte: Long? = null
            private var lt: Long? = null
            private var lte: Long? = null
            private var notEq: Long? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                eq = postedBalanceAmount.eq
                gt = postedBalanceAmount.gt
                gte = postedBalanceAmount.gte
                lt = postedBalanceAmount.lt
                lte = postedBalanceAmount.lte
                notEq = postedBalanceAmount.notEq
                additionalProperties = postedBalanceAmount.additionalProperties.toBuilder()
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

            fun notEq(notEq: Long?) = apply { this.notEq = notEq }

            /**
             * Alias for [Builder.notEq].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun notEq(notEq: Long) = notEq(notEq as Long?)

            /** Alias for calling [Builder.notEq] with `notEq.orElse(null)`. */
            fun notEq(notEq: Optional<Long>) = notEq(notEq.getOrNull())

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [PostedBalanceAmount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PostedBalanceAmount =
                PostedBalanceAmount(eq, gt, gte, lt, lte, notEq, additionalProperties.build())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PostedBalanceAmount && eq == other.eq && gt == other.gt && gte == other.gte && lt == other.lt && lte == other.lte && notEq == other.notEq && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(eq, gt, gte, lt, lte, notEq, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PostedBalanceAmount{eq=$eq, gt=$gt, gte=$gte, lt=$lt, lte=$lte, notEq=$notEq, additionalProperties=$additionalProperties}"
    }

    /**
     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to filter by the updated at
     * timestamp. For example, for all times after Jan 1 2000 12:00 UTC, use
     * updated_at%5Bgt%5D=2000-01-01T12:00:00Z.
     */
    class UpdatedAt private constructor(private val additionalProperties: QueryParams) {

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
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
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

        return /* spotless:off */ other is LedgerAccountListParams && id == other.id && afterCursor == other.afterCursor && availableBalanceAmount == other.availableBalanceAmount && balances == other.balances && createdAt == other.createdAt && currency == other.currency && externalId == other.externalId && ledgerAccountCategoryId == other.ledgerAccountCategoryId && ledgerId == other.ledgerId && metadata == other.metadata && name == other.name && normalBalance == other.normalBalance && pendingBalanceAmount == other.pendingBalanceAmount && perPage == other.perPage && postedBalanceAmount == other.postedBalanceAmount && updatedAt == other.updatedAt && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, afterCursor, availableBalanceAmount, balances, createdAt, currency, externalId, ledgerAccountCategoryId, ledgerId, metadata, name, normalBalance, pendingBalanceAmount, perPage, postedBalanceAmount, updatedAt, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountListParams{id=$id, afterCursor=$afterCursor, availableBalanceAmount=$availableBalanceAmount, balances=$balances, createdAt=$createdAt, currency=$currency, externalId=$externalId, ledgerAccountCategoryId=$ledgerAccountCategoryId, ledgerId=$ledgerId, metadata=$metadata, name=$name, normalBalance=$normalBalance, pendingBalanceAmount=$pendingBalanceAmount, perPage=$perPage, postedBalanceAmount=$postedBalanceAmount, updatedAt=$updatedAt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
