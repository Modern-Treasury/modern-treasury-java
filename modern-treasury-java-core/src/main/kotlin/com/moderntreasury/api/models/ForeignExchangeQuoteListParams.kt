// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

class ForeignExchangeQuoteListParams
constructor(
    private val afterCursor: String?,
    private val baseCurrency: String?,
    private val effectiveAtEnd: LocalDate?,
    private val effectiveAtStart: LocalDate?,
    private val expiresAt: OffsetDateTime?,
    private val internalAccountId: String?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val targetCurrency: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun baseCurrency(): Optional<String> = Optional.ofNullable(baseCurrency)

    fun effectiveAtEnd(): Optional<LocalDate> = Optional.ofNullable(effectiveAtEnd)

    fun effectiveAtStart(): Optional<LocalDate> = Optional.ofNullable(effectiveAtStart)

    fun expiresAt(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAt)

    fun internalAccountId(): Optional<String> = Optional.ofNullable(internalAccountId)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun targetCurrency(): Optional<String> = Optional.ofNullable(targetCurrency)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.baseCurrency?.let { queryParams.put("base_currency", listOf(it.toString())) }
        this.effectiveAtEnd?.let { queryParams.put("effective_at_end", listOf(it.toString())) }
        this.effectiveAtStart?.let { queryParams.put("effective_at_start", listOf(it.toString())) }
        this.expiresAt?.let {
            queryParams.put("expires_at", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.internalAccountId?.let {
            queryParams.put("internal_account_id", listOf(it.toString()))
        }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.targetCurrency?.let { queryParams.put("target_currency", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var baseCurrency: String? = null
        private var effectiveAtEnd: LocalDate? = null
        private var effectiveAtStart: LocalDate? = null
        private var expiresAt: OffsetDateTime? = null
        private var internalAccountId: String? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var targetCurrency: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(foreignExchangeQuoteListParams: ForeignExchangeQuoteListParams) = apply {
            afterCursor = foreignExchangeQuoteListParams.afterCursor
            baseCurrency = foreignExchangeQuoteListParams.baseCurrency
            effectiveAtEnd = foreignExchangeQuoteListParams.effectiveAtEnd
            effectiveAtStart = foreignExchangeQuoteListParams.effectiveAtStart
            expiresAt = foreignExchangeQuoteListParams.expiresAt
            internalAccountId = foreignExchangeQuoteListParams.internalAccountId
            metadata = foreignExchangeQuoteListParams.metadata
            perPage = foreignExchangeQuoteListParams.perPage
            targetCurrency = foreignExchangeQuoteListParams.targetCurrency
            additionalHeaders = foreignExchangeQuoteListParams.additionalHeaders.toBuilder()
            additionalQueryParams = foreignExchangeQuoteListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: String) = apply { this.baseCurrency = baseCurrency }

        /** An inclusive upper bound for searching effective_at */
        fun effectiveAtEnd(effectiveAtEnd: LocalDate) = apply {
            this.effectiveAtEnd = effectiveAtEnd
        }

        /** An inclusive lower bound for searching effective_at */
        fun effectiveAtStart(effectiveAtStart: LocalDate) = apply {
            this.effectiveAtStart = effectiveAtStart
        }

        /** The timestamp until which the quote must be booked by. */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: String) = apply { this.targetCurrency = targetCurrency }

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

        fun build(): ForeignExchangeQuoteListParams =
            ForeignExchangeQuoteListParams(
                afterCursor,
                baseCurrency,
                effectiveAtEnd,
                effectiveAtStart,
                expiresAt,
                internalAccountId,
                metadata,
                perPage,
                targetCurrency,
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteListParams && afterCursor == other.afterCursor && baseCurrency == other.baseCurrency && effectiveAtEnd == other.effectiveAtEnd && effectiveAtStart == other.effectiveAtStart && expiresAt == other.expiresAt && internalAccountId == other.internalAccountId && metadata == other.metadata && perPage == other.perPage && targetCurrency == other.targetCurrency && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, baseCurrency, effectiveAtEnd, effectiveAtStart, expiresAt, internalAccountId, metadata, perPage, targetCurrency, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ForeignExchangeQuoteListParams{afterCursor=$afterCursor, baseCurrency=$baseCurrency, effectiveAtEnd=$effectiveAtEnd, effectiveAtStart=$effectiveAtStart, expiresAt=$expiresAt, internalAccountId=$internalAccountId, metadata=$metadata, perPage=$perPage, targetCurrency=$targetCurrency, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
