// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class BalanceReport
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("as_of_date")
    @ExcludeMissing
    private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("as_of_time")
    @ExcludeMissing
    private val asOfTime: JsonField<String> = JsonMissing.of(),
    @JsonProperty("balance_report_type")
    @ExcludeMissing
    private val balanceReportType: JsonField<BalanceReportType> = JsonMissing.of(),
    @JsonProperty("balances")
    @ExcludeMissing
    private val balances: JsonField<List<Balance>> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    private val internalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** The date of the balance report in local time. */
    fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

    /** The time (24-hour clock) of the balance report in local time. */
    fun asOfTime(): Optional<String> = Optional.ofNullable(asOfTime.getNullable("as_of_time"))

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    fun balanceReportType(): BalanceReportType =
        balanceReportType.getRequired("balance_report_type")

    /** An array of `Balance` objects. */
    fun balances(): List<Balance> = balances.getRequired("balances")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The ID of one of your organization's Internal Accounts. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun object_(): String = object_.getRequired("object")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The date of the balance report in local time. */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

    /** The time (24-hour clock) of the balance report in local time. */
    @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime(): JsonField<String> = asOfTime

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    @JsonProperty("balance_report_type")
    @ExcludeMissing
    fun _balanceReportType(): JsonField<BalanceReportType> = balanceReportType

    /** An array of `Balance` objects. */
    @JsonProperty("balances") @ExcludeMissing fun _balances(): JsonField<List<Balance>> = balances

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The ID of one of your organization's Internal Accounts. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BalanceReport = apply {
        if (validated) {
            return@apply
        }

        id()
        asOfDate()
        asOfTime()
        balanceReportType()
        balances().forEach { it.validate() }
        createdAt()
        internalAccountId()
        liveMode()
        object_()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceReport]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var asOfDate: JsonField<LocalDate>? = null
        private var asOfTime: JsonField<String>? = null
        private var balanceReportType: JsonField<BalanceReportType>? = null
        private var balances: JsonField<MutableList<Balance>>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var internalAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceReport: BalanceReport) = apply {
            id = balanceReport.id
            asOfDate = balanceReport.asOfDate
            asOfTime = balanceReport.asOfTime
            balanceReportType = balanceReport.balanceReportType
            balances = balanceReport.balances.map { it.toMutableList() }
            createdAt = balanceReport.createdAt
            internalAccountId = balanceReport.internalAccountId
            liveMode = balanceReport.liveMode
            object_ = balanceReport.object_
            updatedAt = balanceReport.updatedAt
            additionalProperties = balanceReport.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

        /** The date of the balance report in local time. */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: String?) = asOfTime(JsonField.ofNullable(asOfTime))

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: Optional<String>) = asOfTime(asOfTime.orElse(null))

        /** The time (24-hour clock) of the balance report in local time. */
        fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: BalanceReportType) =
            balanceReportType(JsonField.of(balanceReportType))

        /**
         * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
         * `other`.
         */
        fun balanceReportType(balanceReportType: JsonField<BalanceReportType>) = apply {
            this.balanceReportType = balanceReportType
        }

        /** An array of `Balance` objects. */
        fun balances(balances: List<Balance>) = balances(JsonField.of(balances))

        /** An array of `Balance` objects. */
        fun balances(balances: JsonField<List<Balance>>) = apply {
            this.balances = balances.map { it.toMutableList() }
        }

        /** An array of `Balance` objects. */
        fun addBalance(balance: Balance) = apply {
            balances =
                (balances ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(balance)
                }
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of one of your organization's Internal Accounts. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of one of your organization's Internal Accounts. */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): BalanceReport =
            BalanceReport(
                checkRequired("id", id),
                checkRequired("asOfDate", asOfDate),
                checkRequired("asOfTime", asOfTime),
                checkRequired("balanceReportType", balanceReportType),
                checkRequired("balances", balances).map { it.toImmutable() },
                checkRequired("createdAt", createdAt),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * The specific type of balance report. One of `intraday`, `previous_day`, `real_time`, or
     * `other`.
     */
    class BalanceReportType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val INTRADAY = of("intraday")

            @JvmField val OTHER = of("other")

            @JvmField val PREVIOUS_DAY = of("previous_day")

            @JvmField val REAL_TIME = of("real_time")

            @JvmStatic fun of(value: String) = BalanceReportType(JsonField.of(value))
        }

        /** An enum containing [BalanceReportType]'s known values. */
        enum class Known {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
        }

        /**
         * An enum containing [BalanceReportType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BalanceReportType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTRADAY,
            OTHER,
            PREVIOUS_DAY,
            REAL_TIME,
            /**
             * An enum member indicating that [BalanceReportType] was instantiated with an unknown
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
                INTRADAY -> Value.INTRADAY
                OTHER -> Value.OTHER
                PREVIOUS_DAY -> Value.PREVIOUS_DAY
                REAL_TIME -> Value.REAL_TIME
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
                INTRADAY -> Known.INTRADAY
                OTHER -> Known.OTHER
                PREVIOUS_DAY -> Known.PREVIOUS_DAY
                REAL_TIME -> Known.REAL_TIME
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown BalanceReportType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BalanceReportType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Balance
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("as_of_date")
        @ExcludeMissing
        private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("as_of_time")
        @ExcludeMissing
        private val asOfTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance_type")
        @ExcludeMissing
        private val balanceType: JsonField<BalanceType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value_date")
        @ExcludeMissing
        private val valueDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("vendor_code")
        @ExcludeMissing
        private val vendorCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        private val vendorCodeType: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** The balance amount. */
        fun amount(): Long = amount.getRequired("amount")

        /** The date on which the balance became true for the account. */
        fun asOfDate(): Optional<LocalDate> =
            Optional.ofNullable(asOfDate.getNullable("as_of_date"))

        /** The time on which the balance became true for the account. */
        fun asOfTime(): Optional<String> = Optional.ofNullable(asOfTime.getNullable("as_of_time"))

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         */
        fun balanceType(): BalanceType = balanceType.getRequired("balance_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The currency of the balance. */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /** The date on which the balance becomes available. */
        fun valueDate(): Optional<LocalDate> =
            Optional.ofNullable(valueDate.getNullable("value_date"))

        /** The code used by the bank when reporting this specific balance. */
        fun vendorCode(): String = vendorCode.getRequired("vendor_code")

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         */
        fun vendorCodeType(): Optional<String> =
            Optional.ofNullable(vendorCodeType.getNullable("vendor_code_type"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The balance amount. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The date on which the balance became true for the account. */
        @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

        /** The time on which the balance became true for the account. */
        @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime(): JsonField<String> = asOfTime

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         */
        @JsonProperty("balance_type")
        @ExcludeMissing
        fun _balanceType(): JsonField<BalanceType> = balanceType

        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** The currency of the balance. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /** The date on which the balance becomes available. */
        @JsonProperty("value_date")
        @ExcludeMissing
        fun _valueDate(): JsonField<LocalDate> = valueDate

        /** The code used by the bank when reporting this specific balance. */
        @JsonProperty("vendor_code")
        @ExcludeMissing
        fun _vendorCode(): JsonField<String> = vendorCode

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, or `us_bank`.
         */
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        fun _vendorCodeType(): JsonField<String> = vendorCodeType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Balance = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            asOfDate()
            asOfTime()
            balanceType()
            createdAt()
            currency()
            liveMode()
            object_()
            updatedAt()
            valueDate()
            vendorCode()
            vendorCodeType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Balance]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var asOfDate: JsonField<LocalDate>? = null
            private var asOfTime: JsonField<String>? = null
            private var balanceType: JsonField<BalanceType>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<Currency>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var valueDate: JsonField<LocalDate>? = null
            private var vendorCode: JsonField<String>? = null
            private var vendorCodeType: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(balance: Balance) = apply {
                id = balance.id
                amount = balance.amount
                asOfDate = balance.asOfDate
                asOfTime = balance.asOfTime
                balanceType = balance.balanceType
                createdAt = balance.createdAt
                currency = balance.currency
                liveMode = balance.liveMode
                object_ = balance.object_
                updatedAt = balance.updatedAt
                valueDate = balance.valueDate
                vendorCode = balance.vendorCode
                vendorCodeType = balance.vendorCodeType
                additionalProperties = balance.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The balance amount. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The balance amount. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The date on which the balance became true for the account. */
            fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

            /** The date on which the balance became true for the account. */
            fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.orElse(null))

            /** The date on which the balance became true for the account. */
            fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

            /** The time on which the balance became true for the account. */
            fun asOfTime(asOfTime: String?) = asOfTime(JsonField.ofNullable(asOfTime))

            /** The time on which the balance became true for the account. */
            fun asOfTime(asOfTime: Optional<String>) = asOfTime(asOfTime.orElse(null))

            /** The time on which the balance became true for the account. */
            fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
             */
            fun balanceType(balanceType: BalanceType) = balanceType(JsonField.of(balanceType))

            /**
             * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
             * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
             * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
             */
            fun balanceType(balanceType: JsonField<BalanceType>) = apply {
                this.balanceType = balanceType
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The currency of the balance. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /** The currency of the balance. */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

            /**
             * This field will be true if this object exists in the live environment or false if it
             * exists in the test environment.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** The date on which the balance becomes available. */
            fun valueDate(valueDate: LocalDate?) = valueDate(JsonField.ofNullable(valueDate))

            /** The date on which the balance becomes available. */
            fun valueDate(valueDate: Optional<LocalDate>) = valueDate(valueDate.orElse(null))

            /** The date on which the balance becomes available. */
            fun valueDate(valueDate: JsonField<LocalDate>) = apply { this.valueDate = valueDate }

            /** The code used by the bank when reporting this specific balance. */
            fun vendorCode(vendorCode: String) = vendorCode(JsonField.of(vendorCode))

            /** The code used by the bank when reporting this specific balance. */
            fun vendorCode(vendorCode: JsonField<String>) = apply { this.vendorCode = vendorCode }

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            fun vendorCodeType(vendorCodeType: String?) =
                vendorCodeType(JsonField.ofNullable(vendorCodeType))

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            fun vendorCodeType(vendorCodeType: Optional<String>) =
                vendorCodeType(vendorCodeType.orElse(null))

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * or `us_bank`.
             */
            fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                this.vendorCodeType = vendorCodeType
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Balance =
                Balance(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("asOfDate", asOfDate),
                    checkRequired("asOfTime", asOfTime),
                    checkRequired("balanceType", balanceType),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("valueDate", valueDate),
                    checkRequired("vendorCode", vendorCode),
                    checkRequired("vendorCodeType", vendorCodeType),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The specific type of balance reported. One of `opening_ledger`, `closing_ledger`,
         * `current_ledger`, `opening_available`, `opening_available_next_business_day`,
         * `closing_available`, `current_available`, 'previously_closed_book', or `other`.
         */
        class BalanceType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CLOSING_AVAILABLE = of("closing_available")

                @JvmField val CLOSING_LEDGER = of("closing_ledger")

                @JvmField val CURRENT_AVAILABLE = of("current_available")

                @JvmField val CURRENT_LEDGER = of("current_ledger")

                @JvmField val OPENING_AVAILABLE = of("opening_available")

                @JvmField
                val OPENING_AVAILABLE_NEXT_BUSINESS_DAY = of("opening_available_next_business_day")

                @JvmField val OPENING_LEDGER = of("opening_ledger")

                @JvmField val OTHER = of("other")

                @JvmField val PREVIOUSLY_CLOSED_BOOK = of("previously_closed_book")

                @JvmStatic fun of(value: String) = BalanceType(JsonField.of(value))
            }

            /** An enum containing [BalanceType]'s known values. */
            enum class Known {
                CLOSING_AVAILABLE,
                CLOSING_LEDGER,
                CURRENT_AVAILABLE,
                CURRENT_LEDGER,
                OPENING_AVAILABLE,
                OPENING_AVAILABLE_NEXT_BUSINESS_DAY,
                OPENING_LEDGER,
                OTHER,
                PREVIOUSLY_CLOSED_BOOK,
            }

            /**
             * An enum containing [BalanceType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BalanceType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CLOSING_AVAILABLE,
                CLOSING_LEDGER,
                CURRENT_AVAILABLE,
                CURRENT_LEDGER,
                OPENING_AVAILABLE,
                OPENING_AVAILABLE_NEXT_BUSINESS_DAY,
                OPENING_LEDGER,
                OTHER,
                PREVIOUSLY_CLOSED_BOOK,
                /**
                 * An enum member indicating that [BalanceType] was instantiated with an unknown
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
                    CLOSING_AVAILABLE -> Value.CLOSING_AVAILABLE
                    CLOSING_LEDGER -> Value.CLOSING_LEDGER
                    CURRENT_AVAILABLE -> Value.CURRENT_AVAILABLE
                    CURRENT_LEDGER -> Value.CURRENT_LEDGER
                    OPENING_AVAILABLE -> Value.OPENING_AVAILABLE
                    OPENING_AVAILABLE_NEXT_BUSINESS_DAY -> Value.OPENING_AVAILABLE_NEXT_BUSINESS_DAY
                    OPENING_LEDGER -> Value.OPENING_LEDGER
                    OTHER -> Value.OTHER
                    PREVIOUSLY_CLOSED_BOOK -> Value.PREVIOUSLY_CLOSED_BOOK
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
                    CLOSING_AVAILABLE -> Known.CLOSING_AVAILABLE
                    CLOSING_LEDGER -> Known.CLOSING_LEDGER
                    CURRENT_AVAILABLE -> Known.CURRENT_AVAILABLE
                    CURRENT_LEDGER -> Known.CURRENT_LEDGER
                    OPENING_AVAILABLE -> Known.OPENING_AVAILABLE
                    OPENING_AVAILABLE_NEXT_BUSINESS_DAY -> Known.OPENING_AVAILABLE_NEXT_BUSINESS_DAY
                    OPENING_LEDGER -> Known.OPENING_LEDGER
                    OTHER -> Known.OTHER
                    PREVIOUSLY_CLOSED_BOOK -> Known.PREVIOUSLY_CLOSED_BOOK
                    else -> throw ModernTreasuryInvalidDataException("Unknown BalanceType: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BalanceType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Balance && id == other.id && amount == other.amount && asOfDate == other.asOfDate && asOfTime == other.asOfTime && balanceType == other.balanceType && createdAt == other.createdAt && currency == other.currency && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && valueDate == other.valueDate && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amount, asOfDate, asOfTime, balanceType, createdAt, currency, liveMode, object_, updatedAt, valueDate, vendorCode, vendorCodeType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Balance{id=$id, amount=$amount, asOfDate=$asOfDate, asOfTime=$asOfTime, balanceType=$balanceType, createdAt=$createdAt, currency=$currency, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, valueDate=$valueDate, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceReport && id == other.id && asOfDate == other.asOfDate && asOfTime == other.asOfTime && balanceReportType == other.balanceReportType && balances == other.balances && createdAt == other.createdAt && internalAccountId == other.internalAccountId && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, asOfDate, asOfTime, balanceReportType, balances, createdAt, internalAccountId, liveMode, object_, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceReport{id=$id, asOfDate=$asOfDate, asOfTime=$asOfTime, balanceReportType=$balanceReportType, balances=$balances, createdAt=$createdAt, internalAccountId=$internalAccountId, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
