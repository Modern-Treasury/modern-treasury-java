// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get details on a single ledger account. */
class LedgerAccountRetrieveParams
private constructor(
    private val id: String?,
    private val balances: Balances?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound. Use `balances[as_of_lock_version]` to retrieve a balance
     * as of a specific Ledger Account `lock_version`.
     */
    fun balances(): Optional<Balances> = Optional.ofNullable(balances)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): LedgerAccountRetrieveParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [LedgerAccountRetrieveParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerAccountRetrieveParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var balances: Balances? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ledgerAccountRetrieveParams: LedgerAccountRetrieveParams) = apply {
            id = ledgerAccountRetrieveParams.id
            balances = ledgerAccountRetrieveParams.balances
            additionalHeaders = ledgerAccountRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = ledgerAccountRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get
         * the balances change between the two timestamps. The lower bound is inclusive while the
         * upper bound is exclusive of the provided timestamps. If no value is supplied the balances
         * will be retrieved not including that bound. Use `balances[as_of_lock_version]` to
         * retrieve a balance as of a specific Ledger Account `lock_version`.
         */
        fun balances(balances: Balances?) = apply { this.balances = balances }

        /** Alias for calling [Builder.balances] with `balances.orElse(null)`. */
        fun balances(balances: Optional<Balances>) = balances(balances.getOrNull())

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
         * Returns an immutable instance of [LedgerAccountRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LedgerAccountRetrieveParams =
            LedgerAccountRetrieveParams(
                id,
                balances,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                balances?.let {
                    it.asOfDate().ifPresent { put("balances[as_of_date]", it.toString()) }
                    it.asOfLockVersion().ifPresent {
                        put("balances[as_of_lock_version]", it.toString())
                    }
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
                putAll(additionalQueryParams)
            }
            .build()

    /**
     * Use `balances[effective_at_lower_bound]` and `balances[effective_at_upper_bound]` to get the
     * balances change between the two timestamps. The lower bound is inclusive while the upper
     * bound is exclusive of the provided timestamps. If no value is supplied the balances will be
     * retrieved not including that bound. Use `balances[as_of_lock_version]` to retrieve a balance
     * as of a specific Ledger Account `lock_version`.
     */
    class Balances
    private constructor(
        private val asOfDate: LocalDate?,
        private val asOfLockVersion: Long?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveAtLowerBound: OffsetDateTime?,
        private val effectiveAtUpperBound: OffsetDateTime?,
        private val additionalProperties: QueryParams,
    ) {

        fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate)

        fun asOfLockVersion(): Optional<Long> = Optional.ofNullable(asOfLockVersion)

        fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

        fun effectiveAtLowerBound(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAtLowerBound)

        fun effectiveAtUpperBound(): Optional<OffsetDateTime> =
            Optional.ofNullable(effectiveAtUpperBound)

        /** Query params to send with the request. */
        fun _additionalProperties(): QueryParams = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Balances]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Balances]. */
        class Builder internal constructor() {

            private var asOfDate: LocalDate? = null
            private var asOfLockVersion: Long? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveAtLowerBound: OffsetDateTime? = null
            private var effectiveAtUpperBound: OffsetDateTime? = null
            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(balances: Balances) = apply {
                asOfDate = balances.asOfDate
                asOfLockVersion = balances.asOfLockVersion
                effectiveAt = balances.effectiveAt
                effectiveAtLowerBound = balances.effectiveAtLowerBound
                effectiveAtUpperBound = balances.effectiveAtUpperBound
                additionalProperties = balances.additionalProperties.toBuilder()
            }

            fun asOfDate(asOfDate: LocalDate?) = apply { this.asOfDate = asOfDate }

            /** Alias for calling [Builder.asOfDate] with `asOfDate.orElse(null)`. */
            fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.getOrNull())

            fun asOfLockVersion(asOfLockVersion: Long?) = apply {
                this.asOfLockVersion = asOfLockVersion
            }

            /**
             * Alias for [Builder.asOfLockVersion].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun asOfLockVersion(asOfLockVersion: Long) = asOfLockVersion(asOfLockVersion as Long?)

            /** Alias for calling [Builder.asOfLockVersion] with `asOfLockVersion.orElse(null)`. */
            fun asOfLockVersion(asOfLockVersion: Optional<Long>) =
                asOfLockVersion(asOfLockVersion.getOrNull())

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
                    asOfLockVersion,
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

            return /* spotless:off */ other is Balances && asOfDate == other.asOfDate && asOfLockVersion == other.asOfLockVersion && effectiveAt == other.effectiveAt && effectiveAtLowerBound == other.effectiveAtLowerBound && effectiveAtUpperBound == other.effectiveAtUpperBound && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(asOfDate, asOfLockVersion, effectiveAt, effectiveAtLowerBound, effectiveAtUpperBound, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balances{asOfDate=$asOfDate, asOfLockVersion=$asOfLockVersion, effectiveAt=$effectiveAt, effectiveAtLowerBound=$effectiveAtLowerBound, effectiveAtUpperBound=$effectiveAtUpperBound, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountRetrieveParams && id == other.id && balances == other.balances && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, balances, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "LedgerAccountRetrieveParams{id=$id, balances=$balances, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
