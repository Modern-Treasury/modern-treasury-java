// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ForeignExchangeQuoteCreateParams
constructor(
    private val internalAccountId: String,
    private val targetCurrency: Currency,
    private val baseAmount: Long?,
    private val baseCurrency: Currency?,
    private val effectiveAt: OffsetDateTime?,
    private val targetAmount: Long?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun internalAccountId(): String = internalAccountId

    fun targetCurrency(): Currency = targetCurrency

    fun baseAmount(): Optional<Long> = Optional.ofNullable(baseAmount)

    fun baseCurrency(): Optional<Currency> = Optional.ofNullable(baseCurrency)

    fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

    fun targetAmount(): Optional<Long> = Optional.ofNullable(targetAmount)

    @JvmSynthetic
    internal fun getBody(): ForeignExchangeQuoteCreateBody {
        return ForeignExchangeQuoteCreateBody(
            internalAccountId,
            targetCurrency,
            baseAmount,
            baseCurrency,
            effectiveAt,
            targetAmount,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ForeignExchangeQuoteCreateBody.Builder::class)
    @NoAutoDetect
    class ForeignExchangeQuoteCreateBody
    internal constructor(
        private val internalAccountId: String?,
        private val targetCurrency: Currency?,
        private val baseAmount: Long?,
        private val baseCurrency: Currency?,
        private val effectiveAt: OffsetDateTime?,
        private val targetAmount: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID for the `InternalAccount` this quote is associated with. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String? = internalAccountId

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        @JsonProperty("target_currency") fun targetCurrency(): Currency? = targetCurrency

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        @JsonProperty("base_amount") fun baseAmount(): Long? = baseAmount

        /** Currency to convert, often called the "sell" currency. */
        @JsonProperty("base_currency") fun baseCurrency(): Currency? = baseCurrency

        /** The timestamp until when the quoted rate is valid. */
        @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        @JsonProperty("target_amount") fun targetAmount(): Long? = targetAmount

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var internalAccountId: String? = null
            private var targetCurrency: Currency? = null
            private var baseAmount: Long? = null
            private var baseCurrency: Currency? = null
            private var effectiveAt: OffsetDateTime? = null
            private var targetAmount: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(foreignExchangeQuoteCreateBody: ForeignExchangeQuoteCreateBody) =
                apply {
                    this.internalAccountId = foreignExchangeQuoteCreateBody.internalAccountId
                    this.targetCurrency = foreignExchangeQuoteCreateBody.targetCurrency
                    this.baseAmount = foreignExchangeQuoteCreateBody.baseAmount
                    this.baseCurrency = foreignExchangeQuoteCreateBody.baseCurrency
                    this.effectiveAt = foreignExchangeQuoteCreateBody.effectiveAt
                    this.targetAmount = foreignExchangeQuoteCreateBody.targetAmount
                    additionalProperties(foreignExchangeQuoteCreateBody.additionalProperties)
                }

            /** The ID for the `InternalAccount` this quote is associated with. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            @JsonProperty("target_currency")
            fun targetCurrency(targetCurrency: Currency) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            @JsonProperty("base_amount")
            fun baseAmount(baseAmount: Long) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            @JsonProperty("base_currency")
            fun baseCurrency(baseCurrency: Currency) = apply { this.baseCurrency = baseCurrency }

            /** The timestamp until when the quoted rate is valid. */
            @JsonProperty("effective_at")
            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            @JsonProperty("target_amount")
            fun targetAmount(targetAmount: Long) = apply { this.targetAmount = targetAmount }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ForeignExchangeQuoteCreateBody =
                ForeignExchangeQuoteCreateBody(
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    checkNotNull(targetCurrency) { "`targetCurrency` is required but was not set" },
                    baseAmount,
                    baseCurrency,
                    effectiveAt,
                    targetAmount,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeQuoteCreateBody && this.internalAccountId == other.internalAccountId && this.targetCurrency == other.targetCurrency && this.baseAmount == other.baseAmount && this.baseCurrency == other.baseCurrency && this.effectiveAt == other.effectiveAt && this.targetAmount == other.targetAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(internalAccountId, targetCurrency, baseAmount, baseCurrency, effectiveAt, targetAmount, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ForeignExchangeQuoteCreateBody{internalAccountId=$internalAccountId, targetCurrency=$targetCurrency, baseAmount=$baseAmount, baseCurrency=$baseCurrency, effectiveAt=$effectiveAt, targetAmount=$targetAmount, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ForeignExchangeQuoteCreateParams && this.internalAccountId == other.internalAccountId && this.targetCurrency == other.targetCurrency && this.baseAmount == other.baseAmount && this.baseCurrency == other.baseCurrency && this.effectiveAt == other.effectiveAt && this.targetAmount == other.targetAmount && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(internalAccountId, targetCurrency, baseAmount, baseCurrency, effectiveAt, targetAmount, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ForeignExchangeQuoteCreateParams{internalAccountId=$internalAccountId, targetCurrency=$targetCurrency, baseAmount=$baseAmount, baseCurrency=$baseCurrency, effectiveAt=$effectiveAt, targetAmount=$targetAmount, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var internalAccountId: String? = null
        private var targetCurrency: Currency? = null
        private var baseAmount: Long? = null
        private var baseCurrency: Currency? = null
        private var effectiveAt: OffsetDateTime? = null
        private var targetAmount: Long? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(foreignExchangeQuoteCreateParams: ForeignExchangeQuoteCreateParams) =
            apply {
                this.internalAccountId = foreignExchangeQuoteCreateParams.internalAccountId
                this.targetCurrency = foreignExchangeQuoteCreateParams.targetCurrency
                this.baseAmount = foreignExchangeQuoteCreateParams.baseAmount
                this.baseCurrency = foreignExchangeQuoteCreateParams.baseCurrency
                this.effectiveAt = foreignExchangeQuoteCreateParams.effectiveAt
                this.targetAmount = foreignExchangeQuoteCreateParams.targetAmount
                additionalHeaders(foreignExchangeQuoteCreateParams.additionalHeaders)
                additionalQueryParams(foreignExchangeQuoteCreateParams.additionalQueryParams)
                additionalBodyProperties(foreignExchangeQuoteCreateParams.additionalBodyProperties)
            }

        /** The ID for the `InternalAccount` this quote is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** Currency to convert the `base_currency` to, often called the "buy" currency. */
        fun targetCurrency(targetCurrency: Currency) = apply {
            this.targetCurrency = targetCurrency
        }

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         */
        fun baseAmount(baseAmount: Long) = apply { this.baseAmount = baseAmount }

        /** Currency to convert, often called the "sell" currency. */
        fun baseCurrency(baseCurrency: Currency) = apply { this.baseCurrency = baseCurrency }

        /** The timestamp until when the quoted rate is valid. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         */
        fun targetAmount(targetAmount: Long) = apply { this.targetAmount = targetAmount }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ForeignExchangeQuoteCreateParams =
            ForeignExchangeQuoteCreateParams(
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(targetCurrency) { "`targetCurrency` is required but was not set" },
                baseAmount,
                baseCurrency,
                effectiveAt,
                targetAmount,
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }
}
