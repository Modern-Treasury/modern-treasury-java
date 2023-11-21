// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Transaction.Builder::class)
@NoAutoDetect
class Transaction
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val direction: JsonField<String>,
    private val vendorDescription: JsonField<String>,
    private val vendorCode: JsonField<String>,
    private val vendorCodeType: JsonField<VendorCodeType>,
    private val vendorId: JsonField<String>,
    private val asOfDate: JsonField<LocalDate>,
    private val asOfTime: JsonField<String>,
    private val internalAccountId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val posted: JsonField<Boolean>,
    private val vendorCustomerId: JsonField<String>,
    private val reconciled: JsonField<Boolean>,
    private val details: JsonField<Details>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(discardedAt.getNullable("discarded_at"))

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    fun amount(): Long = amount.getRequired("amount")

    /** Currency that this transaction is denominated in. */
    fun currency(): Optional<Currency> = Optional.ofNullable(currency.getNullable("currency"))

    /** Either `credit` or `debit`. */
    fun direction(): String = direction.getRequired("direction")

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     */
    fun vendorDescription(): Optional<String> =
        Optional.ofNullable(vendorDescription.getNullable("vendor_description"))

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     */
    fun vendorCode(): Optional<String> = Optional.ofNullable(vendorCode.getNullable("vendor_code"))

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    fun vendorCodeType(): Optional<VendorCodeType> =
        Optional.ofNullable(vendorCodeType.getNullable("vendor_code_type"))

    /** An identifier given to this transaction by the bank. */
    fun vendorId(): Optional<String> = Optional.ofNullable(vendorId.getNullable("vendor_id"))

    /** The date on which the transaction occurred. */
    fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate.getNullable("as_of_date"))

    /**
     * The time on which the transaction occurred. Depending on the granularity of the timestamp
     * information received from the bank, it may be `null`.
     */
    fun asOfTime(): Optional<String> = Optional.ofNullable(asOfTime.getNullable("as_of_time"))

    /** The ID of the relevant Internal Account. */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** This field will be `true` if the transaction has posted to the account. */
    fun posted(): Boolean = posted.getRequired("posted")

    /** An identifier given to this transaction by the bank, often `null`. */
    fun vendorCustomerId(): Optional<String> =
        Optional.ofNullable(vendorCustomerId.getNullable("vendor_customer_id"))

    /**
     * This field will be `true` if a transaction is reconciled by the Modern Treasury system. This
     * means that it has transaction line items that sum up to the transaction's amount.
     */
    fun reconciled(): Boolean = reconciled.getRequired("reconciled")

    /**
     * This field contains additional information that the bank provided about the transaction. This
     * is structured data. Some of the data in here might overlap with what is in the
     * `vendor_description`. For example, the OBI could be a part of the vendor description, and it
     * would also be included in here. The attributes that are passed through the details field will
     * vary based on your banking partner. Currently, the following keys may be in the details
     * object: `originator_name`, `originator_to_beneficiary_information`.
     */
    fun details(): Optional<Details> = Optional.ofNullable(details.getNullable("details"))

    /**
     * The type of the transaction. Can be one of `ach`, `wire`, `check`, `rtp`, `book`, or `sen`.
     */
    fun type(): Type = type.getRequired("type")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** Currency that this transaction is denominated in. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** Either `credit` or `debit`. */
    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    /**
     * The transaction detail text that often appears in on your bank statement and in your banking
     * portal.
     */
    @JsonProperty("vendor_description") @ExcludeMissing fun _vendorDescription() = vendorDescription

    /**
     * When applicable, the bank-given code that determines the transaction's category. For most
     * banks this is the BAI2/BTRS transaction code.
     */
    @JsonProperty("vendor_code") @ExcludeMissing fun _vendorCode() = vendorCode

    /**
     * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
     * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`, `goldman_sachs`,
     * `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or others.
     */
    @JsonProperty("vendor_code_type") @ExcludeMissing fun _vendorCodeType() = vendorCodeType

    /** An identifier given to this transaction by the bank. */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId() = vendorId

    /** The date on which the transaction occurred. */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate() = asOfDate

    /**
     * The time on which the transaction occurred. Depending on the granularity of the timestamp
     * information received from the bank, it may be `null`.
     */
    @JsonProperty("as_of_time") @ExcludeMissing fun _asOfTime() = asOfTime

    /** The ID of the relevant Internal Account. */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId() = internalAccountId

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** This field will be `true` if the transaction has posted to the account. */
    @JsonProperty("posted") @ExcludeMissing fun _posted() = posted

    /** An identifier given to this transaction by the bank, often `null`. */
    @JsonProperty("vendor_customer_id") @ExcludeMissing fun _vendorCustomerId() = vendorCustomerId

    /**
     * This field will be `true` if a transaction is reconciled by the Modern Treasury system. This
     * means that it has transaction line items that sum up to the transaction's amount.
     */
    @JsonProperty("reconciled") @ExcludeMissing fun _reconciled() = reconciled

    /**
     * This field contains additional information that the bank provided about the transaction. This
     * is structured data. Some of the data in here might overlap with what is in the
     * `vendor_description`. For example, the OBI could be a part of the vendor description, and it
     * would also be included in here. The attributes that are passed through the details field will
     * vary based on your banking partner. Currently, the following keys may be in the details
     * object: `originator_name`, `originator_to_beneficiary_information`.
     */
    @JsonProperty("details") @ExcludeMissing fun _details() = details

    /**
     * The type of the transaction. Can be one of `ach`, `wire`, `check`, `rtp`, `book`, or `sen`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Transaction = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            amount()
            currency()
            direction()
            vendorDescription()
            vendorCode()
            vendorCodeType()
            vendorId()
            asOfDate()
            asOfTime()
            internalAccountId()
            metadata().validate()
            posted()
            vendorCustomerId()
            reconciled()
            details().map { it.validate() }
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transaction &&
            this.id == other.id &&
            this.object_ == other.object_ &&
            this.liveMode == other.liveMode &&
            this.createdAt == other.createdAt &&
            this.updatedAt == other.updatedAt &&
            this.discardedAt == other.discardedAt &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.direction == other.direction &&
            this.vendorDescription == other.vendorDescription &&
            this.vendorCode == other.vendorCode &&
            this.vendorCodeType == other.vendorCodeType &&
            this.vendorId == other.vendorId &&
            this.asOfDate == other.asOfDate &&
            this.asOfTime == other.asOfTime &&
            this.internalAccountId == other.internalAccountId &&
            this.metadata == other.metadata &&
            this.posted == other.posted &&
            this.vendorCustomerId == other.vendorCustomerId &&
            this.reconciled == other.reconciled &&
            this.details == other.details &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    discardedAt,
                    amount,
                    currency,
                    direction,
                    vendorDescription,
                    vendorCode,
                    vendorCodeType,
                    vendorId,
                    asOfDate,
                    asOfTime,
                    internalAccountId,
                    metadata,
                    posted,
                    vendorCustomerId,
                    reconciled,
                    details,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Transaction{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, amount=$amount, currency=$currency, direction=$direction, vendorDescription=$vendorDescription, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, vendorId=$vendorId, asOfDate=$asOfDate, asOfTime=$asOfTime, internalAccountId=$internalAccountId, metadata=$metadata, posted=$posted, vendorCustomerId=$vendorCustomerId, reconciled=$reconciled, details=$details, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var direction: JsonField<String> = JsonMissing.of()
        private var vendorDescription: JsonField<String> = JsonMissing.of()
        private var vendorCode: JsonField<String> = JsonMissing.of()
        private var vendorCodeType: JsonField<VendorCodeType> = JsonMissing.of()
        private var vendorId: JsonField<String> = JsonMissing.of()
        private var asOfDate: JsonField<LocalDate> = JsonMissing.of()
        private var asOfTime: JsonField<String> = JsonMissing.of()
        private var internalAccountId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var posted: JsonField<Boolean> = JsonMissing.of()
        private var vendorCustomerId: JsonField<String> = JsonMissing.of()
        private var reconciled: JsonField<Boolean> = JsonMissing.of()
        private var details: JsonField<Details> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transaction: Transaction) = apply {
            this.id = transaction.id
            this.object_ = transaction.object_
            this.liveMode = transaction.liveMode
            this.createdAt = transaction.createdAt
            this.updatedAt = transaction.updatedAt
            this.discardedAt = transaction.discardedAt
            this.amount = transaction.amount
            this.currency = transaction.currency
            this.direction = transaction.direction
            this.vendorDescription = transaction.vendorDescription
            this.vendorCode = transaction.vendorCode
            this.vendorCodeType = transaction.vendorCodeType
            this.vendorId = transaction.vendorId
            this.asOfDate = transaction.asOfDate
            this.asOfTime = transaction.asOfTime
            this.internalAccountId = transaction.internalAccountId
            this.metadata = transaction.metadata
            this.posted = transaction.posted
            this.vendorCustomerId = transaction.vendorCustomerId
            this.reconciled = transaction.reconciled
            this.details = transaction.details
            this.type = transaction.type
            additionalProperties(transaction.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** Currency that this transaction is denominated in. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** Currency that this transaction is denominated in. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Either `credit` or `debit`. */
        fun direction(direction: String) = direction(JsonField.of(direction))

        /** Either `credit` or `debit`. */
        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<String>) = apply { this.direction = direction }

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        fun vendorDescription(vendorDescription: String) =
            vendorDescription(JsonField.of(vendorDescription))

        /**
         * The transaction detail text that often appears in on your bank statement and in your
         * banking portal.
         */
        @JsonProperty("vendor_description")
        @ExcludeMissing
        fun vendorDescription(vendorDescription: JsonField<String>) = apply {
            this.vendorDescription = vendorDescription
        }

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        fun vendorCode(vendorCode: String) = vendorCode(JsonField.of(vendorCode))

        /**
         * When applicable, the bank-given code that determines the transaction's category. For most
         * banks this is the BAI2/BTRS transaction code.
         */
        @JsonProperty("vendor_code")
        @ExcludeMissing
        fun vendorCode(vendorCode: JsonField<String>) = apply { this.vendorCode = vendorCode }

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        fun vendorCodeType(vendorCodeType: VendorCodeType) =
            vendorCodeType(JsonField.of(vendorCodeType))

        /**
         * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`, `bnk_dev`,
         * `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`, `evolve`,
         * `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`, `us_bank`, or
         * others.
         */
        @JsonProperty("vendor_code_type")
        @ExcludeMissing
        fun vendorCodeType(vendorCodeType: JsonField<VendorCodeType>) = apply {
            this.vendorCodeType = vendorCodeType
        }

        /** An identifier given to this transaction by the bank. */
        fun vendorId(vendorId: String) = vendorId(JsonField.of(vendorId))

        /** An identifier given to this transaction by the bank. */
        @JsonProperty("vendor_id")
        @ExcludeMissing
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        /** The date on which the transaction occurred. */
        fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

        /** The date on which the transaction occurred. */
        @JsonProperty("as_of_date")
        @ExcludeMissing
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        /**
         * The time on which the transaction occurred. Depending on the granularity of the timestamp
         * information received from the bank, it may be `null`.
         */
        fun asOfTime(asOfTime: String) = asOfTime(JsonField.of(asOfTime))

        /**
         * The time on which the transaction occurred. Depending on the granularity of the timestamp
         * information received from the bank, it may be `null`.
         */
        @JsonProperty("as_of_time")
        @ExcludeMissing
        fun asOfTime(asOfTime: JsonField<String>) = apply { this.asOfTime = asOfTime }

        /** The ID of the relevant Internal Account. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /** The ID of the relevant Internal Account. */
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** This field will be `true` if the transaction has posted to the account. */
        fun posted(posted: Boolean) = posted(JsonField.of(posted))

        /** This field will be `true` if the transaction has posted to the account. */
        @JsonProperty("posted")
        @ExcludeMissing
        fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

        /** An identifier given to this transaction by the bank, often `null`. */
        fun vendorCustomerId(vendorCustomerId: String) =
            vendorCustomerId(JsonField.of(vendorCustomerId))

        /** An identifier given to this transaction by the bank, often `null`. */
        @JsonProperty("vendor_customer_id")
        @ExcludeMissing
        fun vendorCustomerId(vendorCustomerId: JsonField<String>) = apply {
            this.vendorCustomerId = vendorCustomerId
        }

        /**
         * This field will be `true` if a transaction is reconciled by the Modern Treasury system.
         * This means that it has transaction line items that sum up to the transaction's amount.
         */
        fun reconciled(reconciled: Boolean) = reconciled(JsonField.of(reconciled))

        /**
         * This field will be `true` if a transaction is reconciled by the Modern Treasury system.
         * This means that it has transaction line items that sum up to the transaction's amount.
         */
        @JsonProperty("reconciled")
        @ExcludeMissing
        fun reconciled(reconciled: JsonField<Boolean>) = apply { this.reconciled = reconciled }

        /**
         * This field contains additional information that the bank provided about the transaction.
         * This is structured data. Some of the data in here might overlap with what is in the
         * `vendor_description`. For example, the OBI could be a part of the vendor description, and
         * it would also be included in here. The attributes that are passed through the details
         * field will vary based on your banking partner. Currently, the following keys may be in
         * the details object: `originator_name`, `originator_to_beneficiary_information`.
         */
        fun details(details: Details) = details(JsonField.of(details))

        /**
         * This field contains additional information that the bank provided about the transaction.
         * This is structured data. Some of the data in here might overlap with what is in the
         * `vendor_description`. For example, the OBI could be a part of the vendor description, and
         * it would also be included in here. The attributes that are passed through the details
         * field will vary based on your banking partner. Currently, the following keys may be in
         * the details object: `originator_name`, `originator_to_beneficiary_information`.
         */
        @JsonProperty("details")
        @ExcludeMissing
        fun details(details: JsonField<Details>) = apply { this.details = details }

        /**
         * The type of the transaction. Can be one of `ach`, `wire`, `check`, `rtp`, `book`, or
         * `sen`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * The type of the transaction. Can be one of `ach`, `wire`, `check`, `rtp`, `book`, or
         * `sen`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): Transaction =
            Transaction(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                amount,
                currency,
                direction,
                vendorDescription,
                vendorCode,
                vendorCodeType,
                vendorId,
                asOfDate,
                asOfTime,
                internalAccountId,
                metadata,
                posted,
                vendorCustomerId,
                reconciled,
                details,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
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

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = Type(JsonField.of("ach"))

            @JvmField val AU_BECS = Type(JsonField.of("au_becs"))

            @JvmField val BACS = Type(JsonField.of("bacs"))

            @JvmField val BOOK = Type(JsonField.of("book"))

            @JvmField val CARD = Type(JsonField.of("card"))

            @JvmField val CHATS = Type(JsonField.of("chats"))

            @JvmField val CHECK = Type(JsonField.of("check"))

            @JvmField val CROSS_BORDER = Type(JsonField.of("cross_border"))

            @JvmField val DK_NETS = Type(JsonField.of("dk_nets"))

            @JvmField val EFT = Type(JsonField.of("eft"))

            @JvmField val HU_ICS = Type(JsonField.of("hu_ics"))

            @JvmField val INTERAC = Type(JsonField.of("interac"))

            @JvmField val MASAV = Type(JsonField.of("masav"))

            @JvmField val NEFT = Type(JsonField.of("neft"))

            @JvmField val NICS = Type(JsonField.of("nics"))

            @JvmField val NZ_BECS = Type(JsonField.of("nz_becs"))

            @JvmField val PROVXCHANGE = Type(JsonField.of("provxchange"))

            @JvmField val RO_SENT = Type(JsonField.of("ro_sent"))

            @JvmField val RTP = Type(JsonField.of("rtp"))

            @JvmField val SE_BANKGIROT = Type(JsonField.of("se_bankgirot"))

            @JvmField val SEN = Type(JsonField.of("sen"))

            @JvmField val SEPA = Type(JsonField.of("sepa"))

            @JvmField val SG_GIRO = Type(JsonField.of("sg_giro"))

            @JvmField val SIC = Type(JsonField.of("sic"))

            @JvmField val SIGNET = Type(JsonField.of("signet"))

            @JvmField val WIRE = Type(JsonField.of("wire"))

            @JvmField val ZENGIN = Type(JsonField.of("zengin"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            NEFT,
            NICS,
            NZ_BECS,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            WIRE,
            ZENGIN,
        }

        enum class Value {
            ACH,
            AU_BECS,
            BACS,
            BOOK,
            CARD,
            CHATS,
            CHECK,
            CROSS_BORDER,
            DK_NETS,
            EFT,
            HU_ICS,
            INTERAC,
            MASAV,
            NEFT,
            NICS,
            NZ_BECS,
            PROVXCHANGE,
            RO_SENT,
            RTP,
            SE_BANKGIROT,
            SEN,
            SEPA,
            SG_GIRO,
            SIC,
            SIGNET,
            WIRE,
            ZENGIN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                AU_BECS -> Value.AU_BECS
                BACS -> Value.BACS
                BOOK -> Value.BOOK
                CARD -> Value.CARD
                CHATS -> Value.CHATS
                CHECK -> Value.CHECK
                CROSS_BORDER -> Value.CROSS_BORDER
                DK_NETS -> Value.DK_NETS
                EFT -> Value.EFT
                HU_ICS -> Value.HU_ICS
                INTERAC -> Value.INTERAC
                MASAV -> Value.MASAV
                NEFT -> Value.NEFT
                NICS -> Value.NICS
                NZ_BECS -> Value.NZ_BECS
                PROVXCHANGE -> Value.PROVXCHANGE
                RO_SENT -> Value.RO_SENT
                RTP -> Value.RTP
                SE_BANKGIROT -> Value.SE_BANKGIROT
                SEN -> Value.SEN
                SEPA -> Value.SEPA
                SG_GIRO -> Value.SG_GIRO
                SIC -> Value.SIC
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
                ZENGIN -> Value.ZENGIN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                AU_BECS -> Known.AU_BECS
                BACS -> Known.BACS
                BOOK -> Known.BOOK
                CARD -> Known.CARD
                CHATS -> Known.CHATS
                CHECK -> Known.CHECK
                CROSS_BORDER -> Known.CROSS_BORDER
                DK_NETS -> Known.DK_NETS
                EFT -> Known.EFT
                HU_ICS -> Known.HU_ICS
                INTERAC -> Known.INTERAC
                MASAV -> Known.MASAV
                NEFT -> Known.NEFT
                NICS -> Known.NICS
                NZ_BECS -> Known.NZ_BECS
                PROVXCHANGE -> Known.PROVXCHANGE
                RO_SENT -> Known.RO_SENT
                RTP -> Known.RTP
                SE_BANKGIROT -> Known.SE_BANKGIROT
                SEN -> Known.SEN
                SEPA -> Known.SEPA
                SG_GIRO -> Known.SG_GIRO
                SIC -> Known.SIC
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                ZENGIN -> Known.ZENGIN
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class VendorCodeType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is VendorCodeType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BAI2 = VendorCodeType(JsonField.of("bai2"))

            @JvmField val BANKPROV = VendorCodeType(JsonField.of("bankprov"))

            @JvmField val BNK_DEV = VendorCodeType(JsonField.of("bnk_dev"))

            @JvmField val CLEARTOUCH = VendorCodeType(JsonField.of("cleartouch"))

            @JvmField val COLUMN = VendorCodeType(JsonField.of("column"))

            @JvmField val CROSS_RIVER = VendorCodeType(JsonField.of("cross_river"))

            @JvmField val CURRENCYCLOUD = VendorCodeType(JsonField.of("currencycloud"))

            @JvmField val DC_BANK = VendorCodeType(JsonField.of("dc_bank"))

            @JvmField val DWOLLA = VendorCodeType(JsonField.of("dwolla"))

            @JvmField val EVOLVE = VendorCodeType(JsonField.of("evolve"))

            @JvmField val GOLDMAN_SACHS = VendorCodeType(JsonField.of("goldman_sachs"))

            @JvmField val ISO20022 = VendorCodeType(JsonField.of("iso20022"))

            @JvmField val JPMC = VendorCodeType(JsonField.of("jpmc"))

            @JvmField val MX = VendorCodeType(JsonField.of("mx"))

            @JvmField val PLAID = VendorCodeType(JsonField.of("plaid"))

            @JvmField val RSPEC_VENDOR = VendorCodeType(JsonField.of("rspec_vendor"))

            @JvmField val SIGNET = VendorCodeType(JsonField.of("signet"))

            @JvmField val SILVERGATE = VendorCodeType(JsonField.of("silvergate"))

            @JvmField val SWIFT = VendorCodeType(JsonField.of("swift"))

            @JvmField val US_BANK = VendorCodeType(JsonField.of("us_bank"))

            @JvmStatic fun of(value: String) = VendorCodeType(JsonField.of(value))
        }

        enum class Known {
            BAI2,
            BANKPROV,
            BNK_DEV,
            CLEARTOUCH,
            COLUMN,
            CROSS_RIVER,
            CURRENCYCLOUD,
            DC_BANK,
            DWOLLA,
            EVOLVE,
            GOLDMAN_SACHS,
            ISO20022,
            JPMC,
            MX,
            PLAID,
            RSPEC_VENDOR,
            SIGNET,
            SILVERGATE,
            SWIFT,
            US_BANK,
        }

        enum class Value {
            BAI2,
            BANKPROV,
            BNK_DEV,
            CLEARTOUCH,
            COLUMN,
            CROSS_RIVER,
            CURRENCYCLOUD,
            DC_BANK,
            DWOLLA,
            EVOLVE,
            GOLDMAN_SACHS,
            ISO20022,
            JPMC,
            MX,
            PLAID,
            RSPEC_VENDOR,
            SIGNET,
            SILVERGATE,
            SWIFT,
            US_BANK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BAI2 -> Value.BAI2
                BANKPROV -> Value.BANKPROV
                BNK_DEV -> Value.BNK_DEV
                CLEARTOUCH -> Value.CLEARTOUCH
                COLUMN -> Value.COLUMN
                CROSS_RIVER -> Value.CROSS_RIVER
                CURRENCYCLOUD -> Value.CURRENCYCLOUD
                DC_BANK -> Value.DC_BANK
                DWOLLA -> Value.DWOLLA
                EVOLVE -> Value.EVOLVE
                GOLDMAN_SACHS -> Value.GOLDMAN_SACHS
                ISO20022 -> Value.ISO20022
                JPMC -> Value.JPMC
                MX -> Value.MX
                PLAID -> Value.PLAID
                RSPEC_VENDOR -> Value.RSPEC_VENDOR
                SIGNET -> Value.SIGNET
                SILVERGATE -> Value.SILVERGATE
                SWIFT -> Value.SWIFT
                US_BANK -> Value.US_BANK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BAI2 -> Known.BAI2
                BANKPROV -> Known.BANKPROV
                BNK_DEV -> Known.BNK_DEV
                CLEARTOUCH -> Known.CLEARTOUCH
                COLUMN -> Known.COLUMN
                CROSS_RIVER -> Known.CROSS_RIVER
                CURRENCYCLOUD -> Known.CURRENCYCLOUD
                DC_BANK -> Known.DC_BANK
                DWOLLA -> Known.DWOLLA
                EVOLVE -> Known.EVOLVE
                GOLDMAN_SACHS -> Known.GOLDMAN_SACHS
                ISO20022 -> Known.ISO20022
                JPMC -> Known.JPMC
                MX -> Known.MX
                PLAID -> Known.PLAID
                RSPEC_VENDOR -> Known.RSPEC_VENDOR
                SIGNET -> Known.SIGNET
                SILVERGATE -> Known.SILVERGATE
                SWIFT -> Known.SWIFT
                US_BANK -> Known.US_BANK
                else -> throw ModernTreasuryInvalidDataException("Unknown VendorCodeType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * This field contains additional information that the bank provided about the transaction. This
     * is structured data. Some of the data in here might overlap with what is in the
     * `vendor_description`. For example, the OBI could be a part of the vendor description, and it
     * would also be included in here. The attributes that are passed through the details field will
     * vary based on your banking partner. Currently, the following keys may be in the details
     * object: `originator_name`, `originator_to_beneficiary_information`.
     */
    @JsonDeserialize(builder = Details.Builder::class)
    @NoAutoDetect
    class Details
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Details = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Details && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Details{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(details: Details) = apply {
                additionalProperties(details.additionalProperties)
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

            fun build(): Details = Details(additionalProperties.toUnmodifiable())
        }
    }
}
