// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects

class BalanceReportCreateParams
constructor(
    private val internalAccountId: String,
    private val asOfDate: LocalDate,
    private val asOfTime: String,
    private val balanceReportType: BalanceReportType,
    private val balances: List<BalanceCreateRequest>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun internalAccountId(): String = internalAccountId

    fun asOfDate(): LocalDate = asOfDate

    fun asOfTime(): String = asOfTime

    fun balanceReportType(): BalanceReportType = balanceReportType

    fun balances(): List<BalanceCreateRequest> = balances

    @JvmSynthetic
    internal fun getBody(): BalanceReportCreateBody {
        return BalanceReportCreateBody(
            asOfDate,
            asOfTime,
            balanceReportType,
            balances,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> internalAccountId
            else -> ""
        }
    }

    @JsonDeserialize(builder = BalanceReportCreateBody.Builder::class)
    @NoAutoDetect
    class BalanceReportCreateBody
    internal constructor(
        private val asOfDate: LocalDate?,
        private val asOfTime: String?,
        private val balanceReportType: BalanceReportType?,
        private val balances: List<BalanceCreateRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The date of the balance report in local time. */
        @JsonProperty("as_of_date") fun asOfDate(): LocalDate? = asOfDate

        /** The time (24-hour clock) of the balance report in local time. */
        @JsonProperty("as_of_time") fun asOfTime(): String? = asOfTime

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        @JsonProperty("balance_report_type")
        fun balanceReportType(): BalanceReportType? = balanceReportType

        /** An array of `Balance` objects. */
        @JsonProperty("balances") fun balances(): List<BalanceCreateRequest>? = balances

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var asOfDate: LocalDate? = null
            private var asOfTime: String? = null
            private var balanceReportType: BalanceReportType? = null
            private var balances: List<BalanceCreateRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceReportCreateBody: BalanceReportCreateBody) = apply {
                this.asOfDate = balanceReportCreateBody.asOfDate
                this.asOfTime = balanceReportCreateBody.asOfTime
                this.balanceReportType = balanceReportCreateBody.balanceReportType
                this.balances = balanceReportCreateBody.balances
                additionalProperties(balanceReportCreateBody.additionalProperties)
            }

            /** The date of the balance report in local time. */
            @JsonProperty("as_of_date")
            fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

            /** The time (24-hour clock) of the balance report in local time. */
            @JsonProperty("as_of_time")
            fun asOfTime(asOfTime: String) = apply { this.asOfTime = asOfTime }

            /**
             * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`,
             * or `other`.
             */
            @JsonProperty("balance_report_type")
            fun balanceReportType(balanceReportType: BalanceReportType) = apply {
                this.balanceReportType = balanceReportType
            }

            /** An array of `Balance` objects. */
            @JsonProperty("balances")
            fun balances(balances: List<BalanceCreateRequest>) = apply { this.balances = balances }

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

            fun build(): BalanceReportCreateBody =
                BalanceReportCreateBody(
                    checkNotNull(asOfDate) { "`asOfDate` is required but was not set" },
                    checkNotNull(asOfTime) { "`asOfTime` is required but was not set" },
                    checkNotNull(balanceReportType) {
                        "`balanceReportType` is required but was not set"
                    },
                    checkNotNull(balances) { "`balances` is required but was not set" }
                        .toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceReportCreateBody && this.asOfDate == other.asOfDate && this.asOfTime == other.asOfTime && this.balanceReportType == other.balanceReportType && this.balances == other.balances && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(asOfDate, asOfTime, balanceReportType, balances, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "BalanceReportCreateBody{asOfDate=$asOfDate, asOfTime=$asOfTime, balanceReportType=$balanceReportType, balances=$balances, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceReportCreateParams && this.internalAccountId == other.internalAccountId && this.asOfDate == other.asOfDate && this.asOfTime == other.asOfTime && this.balanceReportType == other.balanceReportType && this.balances == other.balances && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(internalAccountId, asOfDate, asOfTime, balanceReportType, balances, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "BalanceReportCreateParams{internalAccountId=$internalAccountId, asOfDate=$asOfDate, asOfTime=$asOfTime, balanceReportType=$balanceReportType, balances=$balances, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var internalAccountId: String? = null
        private var asOfDate: LocalDate? = null
        private var asOfTime: String? = null
        private var balanceReportType: BalanceReportType? = null
        private var balances: MutableList<BalanceCreateRequest> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceReportCreateParams: BalanceReportCreateParams) = apply {
            this.internalAccountId = balanceReportCreateParams.internalAccountId
            this.asOfDate = balanceReportCreateParams.asOfDate
            this.asOfTime = balanceReportCreateParams.asOfTime
            this.balanceReportType = balanceReportCreateParams.balanceReportType
            this.balances(balanceReportCreateParams.balances)
            additionalQueryParams(balanceReportCreateParams.additionalQueryParams)
            additionalHeaders(balanceReportCreateParams.additionalHeaders)
            additionalBodyProperties(balanceReportCreateParams.additionalBodyProperties)
        }

        fun internalAccountId(internalAccountId: String) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: String) = apply { this.asOfTime = asOfTime }

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: BalanceReportType) = apply {
            this.balanceReportType = balanceReportType
        }

        /** An array of `Balance` objects. */
        fun balances(balances: List<BalanceCreateRequest>) = apply {
            this.balances.clear()
            this.balances.addAll(balances)
        }

        /** An array of `Balance` objects. */
        fun addBalance(balance: BalanceCreateRequest) = apply { this.balances.add(balance) }

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

        fun build(): BalanceReportCreateParams =
            BalanceReportCreateParams(
                checkNotNull(internalAccountId) {
                    "`internalAccountId` is required but was not set"
                },
                checkNotNull(asOfDate) { "`asOfDate` is required but was not set" },
                checkNotNull(asOfTime) { "`asOfTime` is required but was not set" },
                checkNotNull(balanceReportType) {
                    "`balanceReportType` is required but was not set"
                },
                checkNotNull(balances) { "`balances` is required but was not set" }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class BalanceReportType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceReportType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INTRADAY = BalanceReportType(JsonField.of("intraday"))

            @JvmField val OTHER = BalanceReportType(JsonField.of("other"))

            @JvmField val PREVIOUS_DAY = BalanceReportType(JsonField.of("previous_day"))

            @JvmField val REAL_TIME = BalanceReportType(JsonField.of("real_time"))

            @JvmStatic fun of(value: String) = BalanceReportType(JsonField.of(value))
        }

        enum class Known {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
        }

        enum class Value {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTRADAY -> Value.INTRADAY
                OTHER -> Value.OTHER
                PREVIOUS_DAY -> Value.PREVIOUS_DAY
                REAL_TIME -> Value.REAL_TIME
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTRADAY -> Known.INTRADAY
                OTHER -> Known.OTHER
                PREVIOUS_DAY -> Known.PREVIOUS_DAY
                REAL_TIME -> Known.REAL_TIME
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown BalanceReportType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = BalanceCreateRequest.Builder::class)
    @NoAutoDetect
    class BalanceCreateRequest
    private constructor(
        private val amount: Long?,
        private val balanceType: BalanceType?,
        private val vendorCode: String?,
        private val vendorCodeType: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The balance amount. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, or `other`.
         */
        @JsonProperty("balance_type") fun balanceType(): BalanceType? = balanceType

        /** The code used by the bank when reporting this specific balance. */
        @JsonProperty("vendor_code") fun vendorCode(): String? = vendorCode

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         */
        @JsonProperty("vendor_code_type") fun vendorCodeType(): String? = vendorCodeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var balanceType: BalanceType? = null
            private var vendorCode: String? = null
            private var vendorCodeType: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balanceCreateRequest: BalanceCreateRequest) = apply {
                this.amount = balanceCreateRequest.amount
                this.balanceType = balanceCreateRequest.balanceType
                this.vendorCode = balanceCreateRequest.vendorCode
                this.vendorCodeType = balanceCreateRequest.vendorCodeType
                additionalProperties(balanceCreateRequest.additionalProperties)
            }

            /** The balance amount. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, or `other`.
             */
            @JsonProperty("balance_type")
            fun balanceType(balanceType: BalanceType) = apply { this.balanceType = balanceType }

            /** The code used by the bank when reporting this specific balance. */
            @JsonProperty("vendor_code")
            fun vendorCode(vendorCode: String) = apply { this.vendorCode = vendorCode }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            @JsonProperty("vendor_code_type")
            fun vendorCodeType(vendorCodeType: String) = apply {
                this.vendorCodeType = vendorCodeType
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

            fun build(): BalanceCreateRequest =
                BalanceCreateRequest(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(balanceType) { "`balanceType` is required but was not set" },
                    checkNotNull(vendorCode) { "`vendorCode` is required but was not set" },
                    vendorCodeType,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class BalanceType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BalanceType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CLOSING_AVAILABLE = BalanceType(JsonField.of("closing_available"))

                @JvmField val CLOSING_LEDGER = BalanceType(JsonField.of("closing_ledger"))

                @JvmField val CURRENT_AVAILABLE = BalanceType(JsonField.of("current_available"))

                @JvmField val CURRENT_LEDGER = BalanceType(JsonField.of("current_ledger"))

                @JvmField val OPENING_AVAILABLE = BalanceType(JsonField.of("opening_available"))

                @JvmField
                val OPENING_AVAILABLE_NEXT_BUSINESS_DAY =
                    BalanceType(JsonField.of("opening_available_next_business_day"))

                @JvmField val OPENING_LEDGER = BalanceType(JsonField.of("opening_ledger"))

                @JvmField val OTHER = BalanceType(JsonField.of("other"))

                @JvmStatic fun of(value: String) = BalanceType(JsonField.of(value))
            }

            enum class Known {
                CLOSING_AVAILABLE,
                CLOSING_LEDGER,
                CURRENT_AVAILABLE,
                CURRENT_LEDGER,
                OPENING_AVAILABLE,
                OPENING_AVAILABLE_NEXT_BUSINESS_DAY,
                OPENING_LEDGER,
                OTHER,
            }

            enum class Value {
                CLOSING_AVAILABLE,
                CLOSING_LEDGER,
                CURRENT_AVAILABLE,
                CURRENT_LEDGER,
                OPENING_AVAILABLE,
                OPENING_AVAILABLE_NEXT_BUSINESS_DAY,
                OPENING_LEDGER,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CLOSING_AVAILABLE -> Value.CLOSING_AVAILABLE
                    CLOSING_LEDGER -> Value.CLOSING_LEDGER
                    CURRENT_AVAILABLE -> Value.CURRENT_AVAILABLE
                    CURRENT_LEDGER -> Value.CURRENT_LEDGER
                    OPENING_AVAILABLE -> Value.OPENING_AVAILABLE
                    OPENING_AVAILABLE_NEXT_BUSINESS_DAY -> Value.OPENING_AVAILABLE_NEXT_BUSINESS_DAY
                    OPENING_LEDGER -> Value.OPENING_LEDGER
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CLOSING_AVAILABLE -> Known.CLOSING_AVAILABLE
                    CLOSING_LEDGER -> Known.CLOSING_LEDGER
                    CURRENT_AVAILABLE -> Known.CURRENT_AVAILABLE
                    CURRENT_LEDGER -> Known.CURRENT_LEDGER
                    OPENING_AVAILABLE -> Known.OPENING_AVAILABLE
                    OPENING_AVAILABLE_NEXT_BUSINESS_DAY -> Known.OPENING_AVAILABLE_NEXT_BUSINESS_DAY
                    OPENING_LEDGER -> Known.OPENING_LEDGER
                    OTHER -> Known.OTHER
                    else -> throw ModernTreasuryInvalidDataException("Unknown BalanceType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceCreateRequest && this.amount == other.amount && this.balanceType == other.balanceType && this.vendorCode == other.vendorCode && this.vendorCodeType == other.vendorCodeType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, balanceType, vendorCode, vendorCodeType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "BalanceCreateRequest{amount=$amount, balanceType=$balanceType, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, additionalProperties=$additionalProperties}"
    }
}
