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
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IncomingPaymentDetail
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val asOfDate: JsonField<LocalDate>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val data: JsonField<Data>,
    private val direction: JsonField<TransactionDirection>,
    private val internalAccountId: JsonField<String>,
    private val ledgerTransactionId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val object_: JsonField<String>,
    private val originatingAccountNumberSafe: JsonField<String>,
    private val originatingAccountNumberType: JsonField<OriginatingAccountNumberType>,
    private val originatingRoutingNumber: JsonField<String>,
    private val originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType>,
    private val status: JsonField<Status>,
    private val transactionId: JsonField<String>,
    private val transactionLineItemId: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vendorId: JsonField<String>,
    private val virtualAccount: JsonField<VirtualAccount>,
    private val virtualAccountId: JsonField<String>,
    private val originatingAccountNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("as_of_date")
        @ExcludeMissing
        asOfDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<TransactionDirection> = JsonMissing.of(),
        @JsonProperty("internal_account_id")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        ledgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_account_number_safe")
        @ExcludeMissing
        originatingAccountNumberSafe: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_account_number_type")
        @ExcludeMissing
        originatingAccountNumberType: JsonField<OriginatingAccountNumberType> = JsonMissing.of(),
        @JsonProperty("originating_routing_number")
        @ExcludeMissing
        originatingRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_routing_number_type")
        @ExcludeMissing
        originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_line_item_id")
        @ExcludeMissing
        transactionLineItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vendor_id") @ExcludeMissing vendorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("virtual_account")
        @ExcludeMissing
        virtualAccount: JsonField<VirtualAccount> = JsonMissing.of(),
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        virtualAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_account_number")
        @ExcludeMissing
        originatingAccountNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        asOfDate,
        createdAt,
        currency,
        data,
        direction,
        internalAccountId,
        ledgerTransactionId,
        liveMode,
        metadata,
        object_,
        originatingAccountNumberSafe,
        originatingAccountNumberType,
        originatingRoutingNumber,
        originatingRoutingNumberType,
        status,
        transactionId,
        transactionLineItemId,
        type,
        updatedAt,
        vendorId,
        virtualAccount,
        virtualAccountId,
        originatingAccountNumber,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The date on which the corresponding transaction will occur.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun asOfDate(): LocalDate = asOfDate.getRequired("as_of_date")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The currency of the incoming payment detail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The raw data from the payment pre-notification file that we get from the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * One of `credit` or `debit`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): TransactionDirection = direction.getRequired("direction")

    /**
     * The ID of the Internal Account for the incoming payment detail. This is always present.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

    /**
     * The ID of the ledger transaction linked to the incoming payment detail or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransactionId(): Optional<String> =
        Optional.ofNullable(ledgerTransactionId.getNullable("ledger_transaction_id"))

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The last 4 digits of the originating account_number for the incoming payment detail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingAccountNumberSafe(): Optional<String> =
        Optional.ofNullable(
            originatingAccountNumberSafe.getNullable("originating_account_number_safe")
        )

    /**
     * The type of the originating account number for the incoming payment detail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingAccountNumberType(): Optional<OriginatingAccountNumberType> =
        Optional.ofNullable(
            originatingAccountNumberType.getNullable("originating_account_number_type")
        )

    /**
     * The routing number of the originating account for the incoming payment detail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingRoutingNumber(): Optional<String> =
        Optional.ofNullable(originatingRoutingNumber.getNullable("originating_routing_number"))

    /**
     * The type of the originating routing number for the incoming payment detail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingRoutingNumberType(): Optional<OriginatingRoutingNumberType> =
        Optional.ofNullable(
            originatingRoutingNumberType.getNullable("originating_routing_number_type")
        )

    /**
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
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
    fun transactionId(): Optional<String> =
        Optional.ofNullable(transactionId.getNullable("transaction_id"))

    /**
     * The ID of the reconciled Transaction Line Item or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionLineItemId(): Optional<String> =
        Optional.ofNullable(transactionLineItemId.getNullable("transaction_line_item_id"))

    /**
     * One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * The identifier of the vendor bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorId(): Optional<String> = Optional.ofNullable(vendorId.getNullable("vendor_id"))

    /**
     * If the incoming payment detail is in a virtual account, the serialized virtual account
     * object.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun virtualAccount(): Optional<VirtualAccount> =
        Optional.ofNullable(virtualAccount.getNullable("virtual_account"))

    /**
     * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun virtualAccountId(): Optional<String> =
        Optional.ofNullable(virtualAccountId.getNullable("virtual_account_id"))

    /**
     * The account number of the originating account for the incoming payment detail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingAccountNumber(): Optional<String> =
        Optional.ofNullable(originatingAccountNumber.getNullable("originating_account_number"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [asOfDate].
     *
     * Unlike [asOfDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("as_of_date") @ExcludeMissing fun _asOfDate(): JsonField<LocalDate> = asOfDate

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
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction")
    @ExcludeMissing
    fun _direction(): JsonField<TransactionDirection> = direction

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("internal_account_id")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

    /**
     * Returns the raw JSON value of [ledgerTransactionId].
     *
     * Unlike [ledgerTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [originatingAccountNumberSafe].
     *
     * Unlike [originatingAccountNumberSafe], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originating_account_number_safe")
    @ExcludeMissing
    fun _originatingAccountNumberSafe(): JsonField<String> = originatingAccountNumberSafe

    /**
     * Returns the raw JSON value of [originatingAccountNumberType].
     *
     * Unlike [originatingAccountNumberType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originating_account_number_type")
    @ExcludeMissing
    fun _originatingAccountNumberType(): JsonField<OriginatingAccountNumberType> =
        originatingAccountNumberType

    /**
     * Returns the raw JSON value of [originatingRoutingNumber].
     *
     * Unlike [originatingRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originating_routing_number")
    @ExcludeMissing
    fun _originatingRoutingNumber(): JsonField<String> = originatingRoutingNumber

    /**
     * Returns the raw JSON value of [originatingRoutingNumberType].
     *
     * Unlike [originatingRoutingNumberType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originating_routing_number_type")
    @ExcludeMissing
    fun _originatingRoutingNumberType(): JsonField<OriginatingRoutingNumberType> =
        originatingRoutingNumberType

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
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [vendorId].
     *
     * Unlike [vendorId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("vendor_id") @ExcludeMissing fun _vendorId(): JsonField<String> = vendorId

    /**
     * Returns the raw JSON value of [virtualAccount].
     *
     * Unlike [virtualAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("virtual_account")
    @ExcludeMissing
    fun _virtualAccount(): JsonField<VirtualAccount> = virtualAccount

    /**
     * Returns the raw JSON value of [virtualAccountId].
     *
     * Unlike [virtualAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("virtual_account_id")
    @ExcludeMissing
    fun _virtualAccountId(): JsonField<String> = virtualAccountId

    /**
     * Returns the raw JSON value of [originatingAccountNumber].
     *
     * Unlike [originatingAccountNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("originating_account_number")
    @ExcludeMissing
    fun _originatingAccountNumber(): JsonField<String> = originatingAccountNumber

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
         * Returns a mutable builder for constructing an instance of [IncomingPaymentDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .asOfDate()
         * .createdAt()
         * .currency()
         * .data()
         * .direction()
         * .internalAccountId()
         * .ledgerTransactionId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .originatingAccountNumberSafe()
         * .originatingAccountNumberType()
         * .originatingRoutingNumber()
         * .originatingRoutingNumberType()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .type()
         * .updatedAt()
         * .vendorId()
         * .virtualAccount()
         * .virtualAccountId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IncomingPaymentDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var asOfDate: JsonField<LocalDate>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var data: JsonField<Data>? = null
        private var direction: JsonField<TransactionDirection>? = null
        private var internalAccountId: JsonField<String>? = null
        private var ledgerTransactionId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var object_: JsonField<String>? = null
        private var originatingAccountNumberSafe: JsonField<String>? = null
        private var originatingAccountNumberType: JsonField<OriginatingAccountNumberType>? = null
        private var originatingRoutingNumber: JsonField<String>? = null
        private var originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType>? = null
        private var status: JsonField<Status>? = null
        private var transactionId: JsonField<String>? = null
        private var transactionLineItemId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vendorId: JsonField<String>? = null
        private var virtualAccount: JsonField<VirtualAccount>? = null
        private var virtualAccountId: JsonField<String>? = null
        private var originatingAccountNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(incomingPaymentDetail: IncomingPaymentDetail) = apply {
            id = incomingPaymentDetail.id
            amount = incomingPaymentDetail.amount
            asOfDate = incomingPaymentDetail.asOfDate
            createdAt = incomingPaymentDetail.createdAt
            currency = incomingPaymentDetail.currency
            data = incomingPaymentDetail.data
            direction = incomingPaymentDetail.direction
            internalAccountId = incomingPaymentDetail.internalAccountId
            ledgerTransactionId = incomingPaymentDetail.ledgerTransactionId
            liveMode = incomingPaymentDetail.liveMode
            metadata = incomingPaymentDetail.metadata
            object_ = incomingPaymentDetail.object_
            originatingAccountNumberSafe = incomingPaymentDetail.originatingAccountNumberSafe
            originatingAccountNumberType = incomingPaymentDetail.originatingAccountNumberType
            originatingRoutingNumber = incomingPaymentDetail.originatingRoutingNumber
            originatingRoutingNumberType = incomingPaymentDetail.originatingRoutingNumberType
            status = incomingPaymentDetail.status
            transactionId = incomingPaymentDetail.transactionId
            transactionLineItemId = incomingPaymentDetail.transactionLineItemId
            type = incomingPaymentDetail.type
            updatedAt = incomingPaymentDetail.updatedAt
            vendorId = incomingPaymentDetail.vendorId
            virtualAccount = incomingPaymentDetail.virtualAccount
            virtualAccountId = incomingPaymentDetail.virtualAccountId
            originatingAccountNumber = incomingPaymentDetail.originatingAccountNumber
            additionalProperties = incomingPaymentDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The date on which the corresponding transaction will occur. */
        fun asOfDate(asOfDate: LocalDate) = asOfDate(JsonField.of(asOfDate))

        /**
         * Sets [Builder.asOfDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOfDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The currency of the incoming payment detail. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The raw data from the payment pre-notification file that we get from the bank. */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** One of `credit` or `debit`. */
        fun direction(direction: TransactionDirection) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [TransactionDirection]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun direction(direction: JsonField<TransactionDirection>) = apply {
            this.direction = direction
        }

        /**
         * The ID of the Internal Account for the incoming payment detail. This is always present.
         */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
        }

        /** The ID of the ledger transaction linked to the incoming payment detail or `null`. */
        fun ledgerTransactionId(ledgerTransactionId: String?) =
            ledgerTransactionId(JsonField.ofNullable(ledgerTransactionId))

        /**
         * Alias for calling [Builder.ledgerTransactionId] with `ledgerTransactionId.orElse(null)`.
         */
        fun ledgerTransactionId(ledgerTransactionId: Optional<String>) =
            ledgerTransactionId(ledgerTransactionId.getOrNull())

        /**
         * Sets [Builder.ledgerTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The last 4 digits of the originating account_number for the incoming payment detail. */
        fun originatingAccountNumberSafe(originatingAccountNumberSafe: String?) =
            originatingAccountNumberSafe(JsonField.ofNullable(originatingAccountNumberSafe))

        /**
         * Alias for calling [Builder.originatingAccountNumberSafe] with
         * `originatingAccountNumberSafe.orElse(null)`.
         */
        fun originatingAccountNumberSafe(originatingAccountNumberSafe: Optional<String>) =
            originatingAccountNumberSafe(originatingAccountNumberSafe.getOrNull())

        /**
         * Sets [Builder.originatingAccountNumberSafe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountNumberSafe] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatingAccountNumberSafe(originatingAccountNumberSafe: JsonField<String>) = apply {
            this.originatingAccountNumberSafe = originatingAccountNumberSafe
        }

        /** The type of the originating account number for the incoming payment detail. */
        fun originatingAccountNumberType(
            originatingAccountNumberType: OriginatingAccountNumberType?
        ) = originatingAccountNumberType(JsonField.ofNullable(originatingAccountNumberType))

        /**
         * Alias for calling [Builder.originatingAccountNumberType] with
         * `originatingAccountNumberType.orElse(null)`.
         */
        fun originatingAccountNumberType(
            originatingAccountNumberType: Optional<OriginatingAccountNumberType>
        ) = originatingAccountNumberType(originatingAccountNumberType.getOrNull())

        /**
         * Sets [Builder.originatingAccountNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountNumberType] with a well-typed
         * [OriginatingAccountNumberType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun originatingAccountNumberType(
            originatingAccountNumberType: JsonField<OriginatingAccountNumberType>
        ) = apply { this.originatingAccountNumberType = originatingAccountNumberType }

        /** The routing number of the originating account for the incoming payment detail. */
        fun originatingRoutingNumber(originatingRoutingNumber: String?) =
            originatingRoutingNumber(JsonField.ofNullable(originatingRoutingNumber))

        /**
         * Alias for calling [Builder.originatingRoutingNumber] with
         * `originatingRoutingNumber.orElse(null)`.
         */
        fun originatingRoutingNumber(originatingRoutingNumber: Optional<String>) =
            originatingRoutingNumber(originatingRoutingNumber.getOrNull())

        /**
         * Sets [Builder.originatingRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatingRoutingNumber(originatingRoutingNumber: JsonField<String>) = apply {
            this.originatingRoutingNumber = originatingRoutingNumber
        }

        /** The type of the originating routing number for the incoming payment detail. */
        fun originatingRoutingNumberType(
            originatingRoutingNumberType: OriginatingRoutingNumberType?
        ) = originatingRoutingNumberType(JsonField.ofNullable(originatingRoutingNumberType))

        /**
         * Alias for calling [Builder.originatingRoutingNumberType] with
         * `originatingRoutingNumberType.orElse(null)`.
         */
        fun originatingRoutingNumberType(
            originatingRoutingNumberType: Optional<OriginatingRoutingNumberType>
        ) = originatingRoutingNumberType(originatingRoutingNumberType.getOrNull())

        /**
         * Sets [Builder.originatingRoutingNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingRoutingNumberType] with a well-typed
         * [OriginatingRoutingNumberType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun originatingRoutingNumberType(
            originatingRoutingNumberType: JsonField<OriginatingRoutingNumberType>
        ) = apply { this.originatingRoutingNumberType = originatingRoutingNumberType }

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
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

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** The identifier of the vendor bank. */
        fun vendorId(vendorId: String?) = vendorId(JsonField.ofNullable(vendorId))

        /** Alias for calling [Builder.vendorId] with `vendorId.orElse(null)`. */
        fun vendorId(vendorId: Optional<String>) = vendorId(vendorId.getOrNull())

        /**
         * Sets [Builder.vendorId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun vendorId(vendorId: JsonField<String>) = apply { this.vendorId = vendorId }

        /**
         * If the incoming payment detail is in a virtual account, the serialized virtual account
         * object.
         */
        fun virtualAccount(virtualAccount: VirtualAccount?) =
            virtualAccount(JsonField.ofNullable(virtualAccount))

        /** Alias for calling [Builder.virtualAccount] with `virtualAccount.orElse(null)`. */
        fun virtualAccount(virtualAccount: Optional<VirtualAccount>) =
            virtualAccount(virtualAccount.getOrNull())

        /**
         * Sets [Builder.virtualAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.virtualAccount] with a well-typed [VirtualAccount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun virtualAccount(virtualAccount: JsonField<VirtualAccount>) = apply {
            this.virtualAccount = virtualAccount
        }

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: String?) =
            virtualAccountId(JsonField.ofNullable(virtualAccountId))

        /** Alias for calling [Builder.virtualAccountId] with `virtualAccountId.orElse(null)`. */
        fun virtualAccountId(virtualAccountId: Optional<String>) =
            virtualAccountId(virtualAccountId.getOrNull())

        /**
         * Sets [Builder.virtualAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.virtualAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun virtualAccountId(virtualAccountId: JsonField<String>) = apply {
            this.virtualAccountId = virtualAccountId
        }

        /** The account number of the originating account for the incoming payment detail. */
        fun originatingAccountNumber(originatingAccountNumber: String?) =
            originatingAccountNumber(JsonField.ofNullable(originatingAccountNumber))

        /**
         * Alias for calling [Builder.originatingAccountNumber] with
         * `originatingAccountNumber.orElse(null)`.
         */
        fun originatingAccountNumber(originatingAccountNumber: Optional<String>) =
            originatingAccountNumber(originatingAccountNumber.getOrNull())

        /**
         * Sets [Builder.originatingAccountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun originatingAccountNumber(originatingAccountNumber: JsonField<String>) = apply {
            this.originatingAccountNumber = originatingAccountNumber
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

        /**
         * Returns an immutable instance of [IncomingPaymentDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .asOfDate()
         * .createdAt()
         * .currency()
         * .data()
         * .direction()
         * .internalAccountId()
         * .ledgerTransactionId()
         * .liveMode()
         * .metadata()
         * .object_()
         * .originatingAccountNumberSafe()
         * .originatingAccountNumberType()
         * .originatingRoutingNumber()
         * .originatingRoutingNumberType()
         * .status()
         * .transactionId()
         * .transactionLineItemId()
         * .type()
         * .updatedAt()
         * .vendorId()
         * .virtualAccount()
         * .virtualAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IncomingPaymentDetail =
            IncomingPaymentDetail(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("asOfDate", asOfDate),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("data", data),
                checkRequired("direction", direction),
                checkRequired("internalAccountId", internalAccountId),
                checkRequired("ledgerTransactionId", ledgerTransactionId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("object_", object_),
                checkRequired("originatingAccountNumberSafe", originatingAccountNumberSafe),
                checkRequired("originatingAccountNumberType", originatingAccountNumberType),
                checkRequired("originatingRoutingNumber", originatingRoutingNumber),
                checkRequired("originatingRoutingNumberType", originatingRoutingNumberType),
                checkRequired("status", status),
                checkRequired("transactionId", transactionId),
                checkRequired("transactionLineItemId", transactionLineItemId),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                checkRequired("vendorId", vendorId),
                checkRequired("virtualAccount", virtualAccount),
                checkRequired("virtualAccountId", virtualAccountId),
                originatingAccountNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IncomingPaymentDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        asOfDate()
        createdAt()
        currency()
        data().validate()
        direction()
        internalAccountId()
        ledgerTransactionId()
        liveMode()
        metadata().validate()
        object_()
        originatingAccountNumberSafe()
        originatingAccountNumberType()
        originatingRoutingNumber()
        originatingRoutingNumberType()
        status()
        transactionId()
        transactionLineItemId()
        type()
        updatedAt()
        vendorId()
        virtualAccount().ifPresent { it.validate() }
        virtualAccountId()
        originatingAccountNumber()
        validated = true
    }

    /** The raw data from the payment pre-notification file that we get from the bank. */
    class Data
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                additionalProperties = data.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data = Data(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Data{additionalProperties=$additionalProperties}"
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
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

    /** The type of the originating account number for the incoming payment detail. */
    class OriginatingAccountNumberType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AU_NUMBER = of("au_number")

            @JvmField val CLABE = of("clabe")

            @JvmField val HK_NUMBER = of("hk_number")

            @JvmField val IBAN = of("iban")

            @JvmField val ID_NUMBER = of("id_number")

            @JvmField val NZ_NUMBER = of("nz_number")

            @JvmField val OTHER = of("other")

            @JvmField val PAN = of("pan")

            @JvmField val SG_NUMBER = of("sg_number")

            @JvmField val WALLET_ADDRESS = of("wallet_address")

            @JvmStatic fun of(value: String) = OriginatingAccountNumberType(JsonField.of(value))
        }

        /** An enum containing [OriginatingAccountNumberType]'s known values. */
        enum class Known {
            AU_NUMBER,
            CLABE,
            HK_NUMBER,
            IBAN,
            ID_NUMBER,
            NZ_NUMBER,
            OTHER,
            PAN,
            SG_NUMBER,
            WALLET_ADDRESS,
        }

        /**
         * An enum containing [OriginatingAccountNumberType]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [OriginatingAccountNumberType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AU_NUMBER,
            CLABE,
            HK_NUMBER,
            IBAN,
            ID_NUMBER,
            NZ_NUMBER,
            OTHER,
            PAN,
            SG_NUMBER,
            WALLET_ADDRESS,
            /**
             * An enum member indicating that [OriginatingAccountNumberType] was instantiated with
             * an unknown value.
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
                AU_NUMBER -> Value.AU_NUMBER
                CLABE -> Value.CLABE
                HK_NUMBER -> Value.HK_NUMBER
                IBAN -> Value.IBAN
                ID_NUMBER -> Value.ID_NUMBER
                NZ_NUMBER -> Value.NZ_NUMBER
                OTHER -> Value.OTHER
                PAN -> Value.PAN
                SG_NUMBER -> Value.SG_NUMBER
                WALLET_ADDRESS -> Value.WALLET_ADDRESS
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
                AU_NUMBER -> Known.AU_NUMBER
                CLABE -> Known.CLABE
                HK_NUMBER -> Known.HK_NUMBER
                IBAN -> Known.IBAN
                ID_NUMBER -> Known.ID_NUMBER
                NZ_NUMBER -> Known.NZ_NUMBER
                OTHER -> Known.OTHER
                PAN -> Known.PAN
                SG_NUMBER -> Known.SG_NUMBER
                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown OriginatingAccountNumberType: $value"
                    )
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

            return /* spotless:off */ other is OriginatingAccountNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the originating routing number for the incoming payment detail. */
    class OriginatingRoutingNumberType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ABA = of("aba")

            @JvmField val AU_BSB = of("au_bsb")

            @JvmField val BR_CODIGO = of("br_codigo")

            @JvmField val CA_CPA = of("ca_cpa")

            @JvmField val CHIPS = of("chips")

            @JvmField val CNAPS = of("cnaps")

            @JvmField val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

            @JvmField val GB_SORT_CODE = of("gb_sort_code")

            @JvmField val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

            @JvmField val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

            @JvmField val ID_SKNBI_CODE = of("id_sknbi_code")

            @JvmField val IN_IFSC = of("in_ifsc")

            @JvmField val JP_ZENGIN_CODE = of("jp_zengin_code")

            @JvmField val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

            @JvmField val MY_BRANCH_CODE = of("my_branch_code")

            @JvmField val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

            @JvmField val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

            @JvmField val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

            @JvmField val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

            @JvmField val SWIFT = of("swift")

            @JvmField val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

            @JvmStatic fun of(value: String) = OriginatingRoutingNumberType(JsonField.of(value))
        }

        /** An enum containing [OriginatingRoutingNumberType]'s known values. */
        enum class Known {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SG_INTERBANK_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
        }

        /**
         * An enum containing [OriginatingRoutingNumberType]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [OriginatingRoutingNumberType] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ABA,
            AU_BSB,
            BR_CODIGO,
            CA_CPA,
            CHIPS,
            CNAPS,
            DK_INTERBANK_CLEARING_CODE,
            GB_SORT_CODE,
            HK_INTERBANK_CLEARING_CODE,
            HU_INTERBANK_CLEARING_CODE,
            ID_SKNBI_CODE,
            IN_IFSC,
            JP_ZENGIN_CODE,
            MX_BANK_IDENTIFIER,
            MY_BRANCH_CODE,
            NZ_NATIONAL_CLEARING_CODE,
            PL_NATIONAL_CLEARING_CODE,
            SE_BANKGIRO_CLEARING_CODE,
            SG_INTERBANK_CLEARING_CODE,
            SWIFT,
            ZA_NATIONAL_CLEARING_CODE,
            /**
             * An enum member indicating that [OriginatingRoutingNumberType] was instantiated with
             * an unknown value.
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
                ABA -> Value.ABA
                AU_BSB -> Value.AU_BSB
                BR_CODIGO -> Value.BR_CODIGO
                CA_CPA -> Value.CA_CPA
                CHIPS -> Value.CHIPS
                CNAPS -> Value.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Value.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                IN_IFSC -> Value.IN_IFSC
                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
                SWIFT -> Value.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                ABA -> Known.ABA
                AU_BSB -> Known.AU_BSB
                BR_CODIGO -> Known.BR_CODIGO
                CA_CPA -> Known.CA_CPA
                CHIPS -> Known.CHIPS
                CNAPS -> Known.CNAPS
                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                GB_SORT_CODE -> Known.GB_SORT_CODE
                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                IN_IFSC -> Known.IN_IFSC
                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
                SWIFT -> Known.SWIFT
                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown OriginatingRoutingNumberType: $value"
                    )
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

            return /* spotless:off */ other is OriginatingRoutingNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
     */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACH = of("ach")

            @JvmField val BOOK = of("book")

            @JvmField val CHECK = of("check")

            @JvmField val EFT = of("eft")

            @JvmField val INTERAC = of("interac")

            @JvmField val RTP = of("rtp")

            @JvmField val SEPA = of("sepa")

            @JvmField val SIGNET = of("signet")

            @JvmField val WIRE = of("wire")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ACH -> Value.ACH
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                RTP -> Value.RTP
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
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
                ACH -> Known.ACH
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                RTP -> Known.RTP
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetail && id == other.id && amount == other.amount && asOfDate == other.asOfDate && createdAt == other.createdAt && currency == other.currency && data == other.data && direction == other.direction && internalAccountId == other.internalAccountId && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && originatingAccountNumberSafe == other.originatingAccountNumberSafe && originatingAccountNumberType == other.originatingAccountNumberType && originatingRoutingNumber == other.originatingRoutingNumber && originatingRoutingNumberType == other.originatingRoutingNumberType && status == other.status && transactionId == other.transactionId && transactionLineItemId == other.transactionLineItemId && type == other.type && updatedAt == other.updatedAt && vendorId == other.vendorId && virtualAccount == other.virtualAccount && virtualAccountId == other.virtualAccountId && originatingAccountNumber == other.originatingAccountNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, asOfDate, createdAt, currency, data, direction, internalAccountId, ledgerTransactionId, liveMode, metadata, object_, originatingAccountNumberSafe, originatingAccountNumberType, originatingRoutingNumber, originatingRoutingNumberType, status, transactionId, transactionLineItemId, type, updatedAt, vendorId, virtualAccount, virtualAccountId, originatingAccountNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IncomingPaymentDetail{id=$id, amount=$amount, asOfDate=$asOfDate, createdAt=$createdAt, currency=$currency, data=$data, direction=$direction, internalAccountId=$internalAccountId, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, object_=$object_, originatingAccountNumberSafe=$originatingAccountNumberSafe, originatingAccountNumberType=$originatingAccountNumberType, originatingRoutingNumber=$originatingRoutingNumber, originatingRoutingNumberType=$originatingRoutingNumberType, status=$status, transactionId=$transactionId, transactionLineItemId=$transactionLineItemId, type=$type, updatedAt=$updatedAt, vendorId=$vendorId, virtualAccount=$virtualAccount, virtualAccountId=$virtualAccountId, originatingAccountNumber=$originatingAccountNumber, additionalProperties=$additionalProperties}"
}
