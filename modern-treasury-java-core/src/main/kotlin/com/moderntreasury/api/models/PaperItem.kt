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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PaperItem
private constructor(
    private val id: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val accountNumberSafe: JsonField<String>,
    private val amount: JsonField<Long>,
    private val checkNumber: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val depositDate: JsonField<LocalDate>,
    private val liveMode: JsonField<Boolean>,
    private val lockboxNumber: JsonField<String>,
    private val memoField: JsonField<String>,
    private val metadata: JsonValue,
    private val object_: JsonField<String>,
    private val remitterName: JsonField<String>,
    private val routingNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val transactionLineItemId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number_safe")
        @ExcludeMissing
        accountNumberSafe: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("check_number")
        @ExcludeMissing
        checkNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("deposit_date")
        @ExcludeMissing
        depositDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lockbox_number")
        @ExcludeMissing
        lockboxNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo_field") @ExcludeMissing memoField: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remitter_name")
        @ExcludeMissing
        remitterName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_line_item_id")
        @ExcludeMissing
        transactionLineItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        accountNumber,
        accountNumberSafe,
        amount,
        checkNumber,
        createdAt,
        currency,
        depositDate,
        liveMode,
        lockboxNumber,
        memoField,
        metadata,
        object_,
        remitterName,
        routingNumber,
        status,
        transactionId,
        transactionLineItemId,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The account number on the paper item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountNumber(): Optional<String> = accountNumber.getOptional("account_number")

    /**
     * The last 4 digits of the account_number.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountNumberSafe(): Optional<String> = accountNumberSafe.getOptional("account_number_safe")

    /**
     * The amount of the paper item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The check number on the paper item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun checkNumber(): Optional<String> = checkNumber.getOptional("check_number")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The currency of the paper item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The date the paper item was deposited into your organization's bank account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun depositDate(): LocalDate = depositDate.getRequired("deposit_date")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * The identifier for the lockbox assigned by the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lockboxNumber(): String = lockboxNumber.getRequired("lockbox_number")

    /**
     * The memo field on the paper item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun memoField(): Optional<String> = memoField.getOptional("memo_field")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The name of the remitter on the paper item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remitterName(): Optional<String> = remitterName.getOptional("remitter_name")

    /**
     * The routing number on the paper item.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routingNumber(): Optional<String> = routingNumber.getOptional("routing_number")

    /**
     * The current status of the paper item. One of `pending`, `completed`, or `returned`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The ID of the reconciled Transaction or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

    /**
     * The ID of the reconciled Transaction Line Item or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionLineItemId(): Optional<String> =
        transactionLineItemId.getOptional("transaction_line_item_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [accountNumberSafe].
     *
     * Unlike [accountNumberSafe], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("account_number_safe")
    @ExcludeMissing
    fun _accountNumberSafe(): JsonField<String> = accountNumberSafe

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [checkNumber].
     *
     * Unlike [checkNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("check_number")
    @ExcludeMissing
    fun _checkNumber(): JsonField<String> = checkNumber

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [depositDate].
     *
     * Unlike [depositDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deposit_date")
    @ExcludeMissing
    fun _depositDate(): JsonField<LocalDate> = depositDate

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [lockboxNumber].
     *
     * Unlike [lockboxNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lockbox_number")
    @ExcludeMissing
    fun _lockboxNumber(): JsonField<String> = lockboxNumber

    /**
     * Returns the raw JSON value of [memoField].
     *
     * Unlike [memoField], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo_field") @ExcludeMissing fun _memoField(): JsonField<String> = memoField

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [remitterName].
     *
     * Unlike [remitterName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("remitter_name")
    @ExcludeMissing
    fun _remitterName(): JsonField<String> = remitterName

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [transactionLineItemId].
     *
     * Unlike [transactionLineItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transaction_line_item_id")
    @ExcludeMissing
    fun _transactionLineItemId(): JsonField<String> = transactionLineItemId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaperItem].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountNumber()
         * .accountNumberSafe()
         * .amount()
         * .checkNumber()
         * .createdAt()
         * .currency()
         * .depositDate()
         * .liveMode()
         * .lockboxNumber()
         * .memoField()
         * .metadata()
         * .object_()
         * .remitterName()
         * .routingNumber()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaperItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var accountNumberSafe: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var checkNumber: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var depositDate: JsonField<LocalDate>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var lockboxNumber: JsonField<String>? = null
        private var memoField: JsonField<String>? = null
        private var metadata: JsonValue? = null
        private var object_: JsonField<String>? = null
        private var remitterName: JsonField<String>? = null
        private var routingNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var transactionLineItemId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paperItem: PaperItem) = apply {
            id = paperItem.id
            accountNumber = paperItem.accountNumber
            accountNumberSafe = paperItem.accountNumberSafe
            amount = paperItem.amount
            checkNumber = paperItem.checkNumber
            createdAt = paperItem.createdAt
            currency = paperItem.currency
            depositDate = paperItem.depositDate
            liveMode = paperItem.liveMode
            lockboxNumber = paperItem.lockboxNumber
            memoField = paperItem.memoField
            metadata = paperItem.metadata
            object_ = paperItem.object_
            remitterName = paperItem.remitterName
            routingNumber = paperItem.routingNumber
            status = paperItem.status
            transactionId = paperItem.transactionId
            transactionLineItemId = paperItem.transactionLineItemId
            updatedAt = paperItem.updatedAt
            additionalProperties = paperItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The account number on the paper item. */
        fun accountNumber(accountNumber: String?) =
            accountNumber(JsonField.ofNullable(accountNumber))

        /** Alias for calling [Builder.accountNumber] with `accountNumber.orElse(null)`. */
        fun accountNumber(accountNumber: Optional<String>) =
            accountNumber(accountNumber.getOrNull())

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The last 4 digits of the account_number. */
        fun accountNumberSafe(accountNumberSafe: String?) =
            accountNumberSafe(JsonField.ofNullable(accountNumberSafe))

        /** Alias for calling [Builder.accountNumberSafe] with `accountNumberSafe.orElse(null)`. */
        fun accountNumberSafe(accountNumberSafe: Optional<String>) =
            accountNumberSafe(accountNumberSafe.getOrNull())

        /**
         * Sets [Builder.accountNumberSafe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumberSafe] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountNumberSafe(accountNumberSafe: JsonField<String>) = apply {
            this.accountNumberSafe = accountNumberSafe
        }

        /** The amount of the paper item. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The check number on the paper item. */
        fun checkNumber(checkNumber: String?) = checkNumber(JsonField.ofNullable(checkNumber))

        /** Alias for calling [Builder.checkNumber] with `checkNumber.orElse(null)`. */
        fun checkNumber(checkNumber: Optional<String>) = checkNumber(checkNumber.getOrNull())

        /**
         * Sets [Builder.checkNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the paper item. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The date the paper item was deposited into your organization's bank account. */
        fun depositDate(depositDate: LocalDate) = depositDate(JsonField.of(depositDate))

        /**
         * Sets [Builder.depositDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depositDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun depositDate(depositDate: JsonField<LocalDate>) = apply {
            this.depositDate = depositDate
        }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /** The identifier for the lockbox assigned by the bank. */
        fun lockboxNumber(lockboxNumber: String) = lockboxNumber(JsonField.of(lockboxNumber))

        /**
         * Sets [Builder.lockboxNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockboxNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lockboxNumber(lockboxNumber: JsonField<String>) = apply {
            this.lockboxNumber = lockboxNumber
        }

        /** The memo field on the paper item. */
        fun memoField(memoField: String?) = memoField(JsonField.ofNullable(memoField))

        /** Alias for calling [Builder.memoField] with `memoField.orElse(null)`. */
        fun memoField(memoField: Optional<String>) = memoField(memoField.getOrNull())

        /**
         * Sets [Builder.memoField] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memoField] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun memoField(memoField: JsonField<String>) = apply { this.memoField = memoField }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The name of the remitter on the paper item. */
        fun remitterName(remitterName: String?) = remitterName(JsonField.ofNullable(remitterName))

        /** Alias for calling [Builder.remitterName] with `remitterName.orElse(null)`. */
        fun remitterName(remitterName: Optional<String>) = remitterName(remitterName.getOrNull())

        /**
         * Sets [Builder.remitterName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remitterName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun remitterName(remitterName: JsonField<String>) = apply {
            this.remitterName = remitterName
        }

        /** The routing number on the paper item. */
        fun routingNumber(routingNumber: String?) =
            routingNumber(JsonField.ofNullable(routingNumber))

        /** Alias for calling [Builder.routingNumber] with `routingNumber.orElse(null)`. */
        fun routingNumber(routingNumber: Optional<String>) =
            routingNumber(routingNumber.getOrNull())

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the reconciled Transaction or `null`. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /** The ID of the reconciled Transaction Line Item or `null`. */
        fun transactionLineItemId(transactionLineItemId: String?) =
            transactionLineItemId(JsonField.ofNullable(transactionLineItemId))

        /**
         * Alias for calling [Builder.transactionLineItemId] with
         * `transactionLineItemId.orElse(null)`.
         */
        fun transactionLineItemId(transactionLineItemId: Optional<String>) =
            transactionLineItemId(transactionLineItemId.getOrNull())

        /**
         * Sets [Builder.transactionLineItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionLineItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionLineItemId(transactionLineItemId: JsonField<String>) = apply {
            this.transactionLineItemId = transactionLineItemId
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [PaperItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountNumber()
         * .accountNumberSafe()
         * .amount()
         * .checkNumber()
         * .createdAt()
         * .currency()
         * .depositDate()
         * .liveMode()
         * .lockboxNumber()
         * .memoField()
         * .metadata()
         * .object_()
         * .remitterName()
         * .routingNumber()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaperItem =
            PaperItem(
                checkRequired("id", id),
                checkRequired("accountNumber", accountNumber),
                checkRequired("accountNumberSafe", accountNumberSafe),
                checkRequired("amount", amount),
                checkRequired("checkNumber", checkNumber),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("depositDate", depositDate),
                checkRequired("liveMode", liveMode),
                checkRequired("lockboxNumber", lockboxNumber),
                checkRequired("memoField", memoField),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("remitterName", remitterName),
                checkRequired("routingNumber", routingNumber),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("transactionLineItemId", transactionLineItemId),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaperItem = apply {
        if (validated) {
            return@apply
        }

        id()
        accountNumber()
        accountNumberSafe()
        amount()
        checkNumber()
        createdAt()
        currency().validate()
        depositDate()
        liveMode()
        lockboxNumber()
        memoField()
        object_()
        remitterName()
        routingNumber()
        status().validate()
        transactionId()
        transactionLineItemId()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (if (accountNumberSafe.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (checkNumber.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (depositDate.asKnown().isPresent) 1 else 0) +
            (if (liveMode.asKnown().isPresent) 1 else 0) +
            (if (lockboxNumber.asKnown().isPresent) 1 else 0) +
            (if (memoField.asKnown().isPresent) 1 else 0) +
            (if (object_.asKnown().isPresent) 1 else 0) +
            (if (remitterName.asKnown().isPresent) 1 else 0) +
            (if (routingNumber.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (if (transactionLineItemId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /** The current status of the paper item. One of `pending`, `completed`, or `returned`. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COMPLETED = of("completed")

            @JvmField val PENDING = of("pending")

            @JvmField val RETURNED = of("returned")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            PENDING,
            RETURNED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COMPLETED,
            PENDING,
            RETURNED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                COMPLETED -> Value.COMPLETED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
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
                COMPLETED -> Known.COMPLETED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaperItem && id == other.id && accountNumber == other.accountNumber && accountNumberSafe == other.accountNumberSafe && amount == other.amount && checkNumber == other.checkNumber && createdAt == other.createdAt && currency == other.currency && depositDate == other.depositDate && liveMode == other.liveMode && lockboxNumber == other.lockboxNumber && memoField == other.memoField && metadata == other.metadata && object_ == other.object_ && remitterName == other.remitterName && routingNumber == other.routingNumber && status == other.status && transactionId == other.transactionId && transactionLineItemId == other.transactionLineItemId && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountNumber, accountNumberSafe, amount, checkNumber, createdAt, currency, depositDate, liveMode, lockboxNumber, memoField, metadata, object_, remitterName, routingNumber, status, transactionId, transactionLineItemId, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaperItem{id=$id, accountNumber=$accountNumber, accountNumberSafe=$accountNumberSafe, amount=$amount, checkNumber=$checkNumber, createdAt=$createdAt, currency=$currency, depositDate=$depositDate, liveMode=$liveMode, lockboxNumber=$lockboxNumber, memoField=$memoField, metadata=$metadata, object_=$object_, remitterName=$remitterName, routingNumber=$routingNumber, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
