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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PaperItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    private val transactionLineItemId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("lockbox_number")
    @ExcludeMissing
    private val lockboxNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("deposit_date")
    @ExcludeMissing
    private val depositDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("account_number")
    @ExcludeMissing
    private val accountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number_safe")
    @ExcludeMissing
    private val accountNumberSafe: JsonField<String> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("check_number")
    @ExcludeMissing
    private val checkNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("remitter_name")
    @ExcludeMissing
    private val remitterName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("memo_field")
    @ExcludeMissing
    private val memoField: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The ID of the reconciled Transaction Line Item or `null`. */
    fun transactionLineItemId(): Optional<String> =
        Optional.ofNullable(transactionLineItemId.getNullable("transaction_line_item_id"))

    /** The ID of the reconciled Transaction or `null`. */
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
    fun status(): Status = status.getRequired("status")

    /** The identifier for the lockbox assigned by the bank. */
    fun lockboxNumber(): String = lockboxNumber.getRequired("lockbox_number")

    /** The date the paper item was deposited into your organization's bank account. */
    fun depositDate(): LocalDate = depositDate.getRequired("deposit_date")

    /** The amount of the paper item. */
    fun amount(): Long = amount.getRequired("amount")

    /** The currency of the paper item. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The account number on the paper item. */
    fun accountNumber(): Optional<String> =
        Optional.ofNullable(accountNumber.getNullable("account_number"))

    /** The last 4 digits of the account_number. */
    fun accountNumberSafe(): Optional<String> =
        Optional.ofNullable(accountNumberSafe.getNullable("account_number_safe"))

    /** The routing number on the paper item. */
    fun routingNumber(): Optional<String> =
        Optional.ofNullable(routingNumber.getNullable("routing_number"))

    /** The check number on the paper item. */
    fun checkNumber(): Optional<String> =
        Optional.ofNullable(checkNumber.getNullable("check_number"))

    /** The name of the remitter on the paper item. */
    fun remitterName(): Optional<String> =
        Optional.ofNullable(remitterName.getNullable("remitter_name"))

    /** The memo field on the paper item. */
    fun memoField(): Optional<String> = Optional.ofNullable(memoField.getNullable("memo_field"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The ID of the reconciled Transaction Line Item or `null`. */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId() = transactionLineItemId

    /** The ID of the reconciled Transaction or `null`. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The identifier for the lockbox assigned by the bank. */
    @JsonProperty("lockbox_number") @ExcludeMissing fun _lockboxNumber() = lockboxNumber

    /** The date the paper item was deposited into your organization's bank account. */
    @JsonProperty("deposit_date") @ExcludeMissing fun _depositDate() = depositDate

    /** The amount of the paper item. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** The currency of the paper item. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The account number on the paper item. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /** The last 4 digits of the account_number. */
    @JsonProperty("account_number_safe")
    @ExcludeMissing
    fun _accountNumberSafe() = accountNumberSafe

    /** The routing number on the paper item. */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /** The check number on the paper item. */
    @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

    /** The name of the remitter on the paper item. */
    @JsonProperty("remitter_name") @ExcludeMissing fun _remitterName() = remitterName

    /** The memo field on the paper item. */
    @JsonProperty("memo_field") @ExcludeMissing fun _memoField() = memoField

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaperItem = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            transactionLineItemId()
            transactionId()
            status()
            lockboxNumber()
            depositDate()
            amount()
            currency()
            accountNumber()
            accountNumberSafe()
            routingNumber()
            checkNumber()
            remitterName()
            memoField()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var transactionLineItemId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var lockboxNumber: JsonField<String> = JsonMissing.of()
        private var depositDate: JsonField<LocalDate> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var accountNumberSafe: JsonField<String> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var checkNumber: JsonField<String> = JsonMissing.of()
        private var remitterName: JsonField<String> = JsonMissing.of()
        private var memoField: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paperItem: PaperItem) = apply {
            id = paperItem.id
            object_ = paperItem.object_
            liveMode = paperItem.liveMode
            createdAt = paperItem.createdAt
            updatedAt = paperItem.updatedAt
            transactionLineItemId = paperItem.transactionLineItemId
            transactionId = paperItem.transactionId
            status = paperItem.status
            lockboxNumber = paperItem.lockboxNumber
            depositDate = paperItem.depositDate
            amount = paperItem.amount
            currency = paperItem.currency
            accountNumber = paperItem.accountNumber
            accountNumberSafe = paperItem.accountNumberSafe
            routingNumber = paperItem.routingNumber
            checkNumber = paperItem.checkNumber
            remitterName = paperItem.remitterName
            memoField = paperItem.memoField
            additionalProperties = paperItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

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
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The ID of the reconciled Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: String) =
            transactionLineItemId(JsonField.of(transactionLineItemId))

        /** The ID of the reconciled Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        /** The ID of the reconciled Transaction or `null`. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the reconciled Transaction or `null`. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The identifier for the lockbox assigned by the bank. */
        fun lockboxNumber(lockboxNumber: String) = lockboxNumber(JsonField.of(lockboxNumber))

        /** The identifier for the lockbox assigned by the bank. */
        fun lockboxNumber(lockboxNumber: JsonField<String>) = apply {
            this.lockboxNumber = lockboxNumber
        }

        /** The date the paper item was deposited into your organization's bank account. */
        fun depositDate(depositDate: LocalDate) = depositDate(JsonField.of(depositDate))

        /** The date the paper item was deposited into your organization's bank account. */
        fun depositDate(depositDate: JsonField<LocalDate>) = apply {
            this.depositDate = depositDate
        }

        /** The amount of the paper item. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The amount of the paper item. */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The currency of the paper item. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The currency of the paper item. */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The account number on the paper item. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The account number on the paper item. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The last 4 digits of the account_number. */
        fun accountNumberSafe(accountNumberSafe: String) =
            accountNumberSafe(JsonField.of(accountNumberSafe))

        /** The last 4 digits of the account_number. */
        fun accountNumberSafe(accountNumberSafe: JsonField<String>) = apply {
            this.accountNumberSafe = accountNumberSafe
        }

        /** The routing number on the paper item. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The routing number on the paper item. */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The check number on the paper item. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /** The check number on the paper item. */
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /** The name of the remitter on the paper item. */
        fun remitterName(remitterName: String) = remitterName(JsonField.of(remitterName))

        /** The name of the remitter on the paper item. */
        fun remitterName(remitterName: JsonField<String>) = apply {
            this.remitterName = remitterName
        }

        /** The memo field on the paper item. */
        fun memoField(memoField: String) = memoField(JsonField.of(memoField))

        /** The memo field on the paper item. */
        fun memoField(memoField: JsonField<String>) = apply { this.memoField = memoField }

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

        fun build(): PaperItem =
            PaperItem(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                transactionLineItemId,
                transactionId,
                status,
                lockboxNumber,
                depositDate,
                amount,
                currency,
                accountNumber,
                accountNumberSafe,
                routingNumber,
                checkNumber,
                remitterName,
                memoField,
                additionalProperties.toImmutable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COMPLETED = of("completed")

            @JvmField val PENDING = of("pending")

            @JvmField val RETURNED = of("returned")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            COMPLETED,
            PENDING,
            RETURNED,
        }

        enum class Value {
            COMPLETED,
            PENDING,
            RETURNED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItem && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && transactionLineItemId == other.transactionLineItemId && transactionId == other.transactionId && status == other.status && lockboxNumber == other.lockboxNumber && depositDate == other.depositDate && amount == other.amount && currency == other.currency && accountNumber == other.accountNumber && accountNumberSafe == other.accountNumberSafe && routingNumber == other.routingNumber && checkNumber == other.checkNumber && remitterName == other.remitterName && memoField == other.memoField && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, transactionLineItemId, transactionId, status, lockboxNumber, depositDate, amount, currency, accountNumber, accountNumberSafe, routingNumber, checkNumber, remitterName, memoField, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaperItem{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, transactionLineItemId=$transactionLineItemId, transactionId=$transactionId, status=$status, lockboxNumber=$lockboxNumber, depositDate=$depositDate, amount=$amount, currency=$currency, accountNumber=$accountNumber, accountNumberSafe=$accountNumberSafe, routingNumber=$routingNumber, checkNumber=$checkNumber, remitterName=$remitterName, memoField=$memoField, additionalProperties=$additionalProperties}"
}
