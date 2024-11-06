// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.models.*
import java.util.Objects
import java.util.Optional

class LedgerAccountCategoryCreateParams
constructor(
    private val currency: String,
    private val ledgerId: String,
    private val name: String,
    private val normalBalance: TransactionDirection,
    private val currencyExponent: Long?,
    private val description: String?,
    private val ledgerAccountCategoryIds: List<String>?,
    private val metadata: Metadata?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun currency(): String = currency

    fun ledgerId(): String = ledgerId

    fun name(): String = name

    fun normalBalance(): TransactionDirection = normalBalance

    fun currencyExponent(): Optional<Long> = Optional.ofNullable(currencyExponent)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun ledgerAccountCategoryIds(): Optional<List<String>> =
        Optional.ofNullable(ledgerAccountCategoryIds)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    @JvmSynthetic
    internal fun getBody(): LedgerAccountCategoryCreateBody {
        return LedgerAccountCategoryCreateBody(
            currency,
            ledgerId,
            name,
            normalBalance,
            currencyExponent,
            description,
            ledgerAccountCategoryIds,
            metadata,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = LedgerAccountCategoryCreateBody.Builder::class)
    @NoAutoDetect
    class LedgerAccountCategoryCreateBody
    internal constructor(
        private val currency: String?,
        private val ledgerId: String?,
        private val name: String?,
        private val normalBalance: TransactionDirection?,
        private val currencyExponent: Long?,
        private val description: String?,
        private val ledgerAccountCategoryIds: List<String>?,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The currency of the ledger account category. */
        @JsonProperty("currency") fun currency(): String? = currency

        /** The id of the ledger that this account category belongs to. */
        @JsonProperty("ledger_id") fun ledgerId(): String? = ledgerId

        /** The name of the ledger account category. */
        @JsonProperty("name") fun name(): String? = name

        /** The normal balance of the ledger account category. */
        @JsonProperty("normal_balance") fun normalBalance(): TransactionDirection? = normalBalance

        /** The currency exponent of the ledger account category. */
        @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

        /** The description of the ledger account category. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         */
        @JsonProperty("ledger_account_category_ids")
        fun ledgerAccountCategoryIds(): List<String>? = ledgerAccountCategoryIds

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var currency: String? = null
            private var ledgerId: String? = null
            private var name: String? = null
            private var normalBalance: TransactionDirection? = null
            private var currencyExponent: Long? = null
            private var description: String? = null
            private var ledgerAccountCategoryIds: List<String>? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerAccountCategoryCreateBody: LedgerAccountCategoryCreateBody) =
                apply {
                    this.currency = ledgerAccountCategoryCreateBody.currency
                    this.ledgerId = ledgerAccountCategoryCreateBody.ledgerId
                    this.name = ledgerAccountCategoryCreateBody.name
                    this.normalBalance = ledgerAccountCategoryCreateBody.normalBalance
                    this.currencyExponent = ledgerAccountCategoryCreateBody.currencyExponent
                    this.description = ledgerAccountCategoryCreateBody.description
                    this.ledgerAccountCategoryIds =
                        ledgerAccountCategoryCreateBody.ledgerAccountCategoryIds
                    this.metadata = ledgerAccountCategoryCreateBody.metadata
                    additionalProperties(ledgerAccountCategoryCreateBody.additionalProperties)
                }

            /** The currency of the ledger account category. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the ledger that this account category belongs to. */
            @JsonProperty("ledger_id")
            fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

            /** The name of the ledger account category. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** The normal balance of the ledger account category. */
            @JsonProperty("normal_balance")
            fun normalBalance(normalBalance: TransactionDirection) = apply {
                this.normalBalance = normalBalance
            }

            /** The currency exponent of the ledger account category. */
            @JsonProperty("currency_exponent")
            fun currencyExponent(currencyExponent: Long) = apply {
                this.currencyExponent = currencyExponent
            }

            /** The description of the ledger account category. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The array of ledger account category ids that this ledger account category should be
             * a child of.
             */
            @JsonProperty("ledger_account_category_ids")
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) = apply {
                this.ledgerAccountCategoryIds = ledgerAccountCategoryIds
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

            fun build(): LedgerAccountCategoryCreateBody =
                LedgerAccountCategoryCreateBody(
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
                    currencyExponent,
                    description,
                    ledgerAccountCategoryIds?.toImmutable(),
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerAccountCategoryCreateBody && this.currency == other.currency && this.ledgerId == other.ledgerId && this.name == other.name && this.normalBalance == other.normalBalance && this.currencyExponent == other.currencyExponent && this.description == other.description && this.ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && this.metadata == other.metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, metadata, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LedgerAccountCategoryCreateBody{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountCategoryCreateParams && this.currency == other.currency && this.ledgerId == other.ledgerId && this.name == other.name && this.normalBalance == other.normalBalance && this.currencyExponent == other.currencyExponent && this.description == other.description && this.ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && this.metadata == other.metadata && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, metadata, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "LedgerAccountCategoryCreateParams{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var currency: String? = null
        private var ledgerId: String? = null
        private var name: String? = null
        private var normalBalance: TransactionDirection? = null
        private var currencyExponent: Long? = null
        private var description: String? = null
        private var ledgerAccountCategoryIds: MutableList<String> = mutableListOf()
        private var metadata: Metadata? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ledgerAccountCategoryCreateParams: LedgerAccountCategoryCreateParams) =
            apply {
                this.currency = ledgerAccountCategoryCreateParams.currency
                this.ledgerId = ledgerAccountCategoryCreateParams.ledgerId
                this.name = ledgerAccountCategoryCreateParams.name
                this.normalBalance = ledgerAccountCategoryCreateParams.normalBalance
                this.currencyExponent = ledgerAccountCategoryCreateParams.currencyExponent
                this.description = ledgerAccountCategoryCreateParams.description
                this.ledgerAccountCategoryIds(
                    ledgerAccountCategoryCreateParams.ledgerAccountCategoryIds ?: listOf()
                )
                this.metadata = ledgerAccountCategoryCreateParams.metadata
                additionalHeaders(ledgerAccountCategoryCreateParams.additionalHeaders)
                additionalQueryParams(ledgerAccountCategoryCreateParams.additionalQueryParams)
                additionalBodyProperties(ledgerAccountCategoryCreateParams.additionalBodyProperties)
            }

        /** The currency of the ledger account category. */
        fun currency(currency: String) = apply { this.currency = currency }

        /** The id of the ledger that this account category belongs to. */
        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

        /** The name of the ledger account category. */
        fun name(name: String) = apply { this.name = name }

        /** The normal balance of the ledger account category. */
        fun normalBalance(normalBalance: TransactionDirection) = apply {
            this.normalBalance = normalBalance
        }

        /** The currency exponent of the ledger account category. */
        fun currencyExponent(currencyExponent: Long) = apply {
            this.currencyExponent = currencyExponent
        }

        /** The description of the ledger account category. */
        fun description(description: String) = apply { this.description = description }

        /**
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         */
        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) = apply {
            this.ledgerAccountCategoryIds.clear()
            this.ledgerAccountCategoryIds.addAll(ledgerAccountCategoryIds)
        }

        /**
         * The array of ledger account category ids that this ledger account category should be a
         * child of.
         */
        fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
            this.ledgerAccountCategoryIds.add(ledgerAccountCategoryId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

        fun build(): LedgerAccountCategoryCreateParams =
            LedgerAccountCategoryCreateParams(
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
                currencyExponent,
                description,
                if (ledgerAccountCategoryIds.size == 0) null
                else ledgerAccountCategoryIds.toImmutable(),
                metadata,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }
}
