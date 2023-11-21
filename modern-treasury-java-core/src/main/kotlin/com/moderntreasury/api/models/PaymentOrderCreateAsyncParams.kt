// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class PaymentOrderCreateAsyncParams
constructor(
    private val amount: Long,
    private val direction: Direction,
    private val originatingAccountId: String,
    private val type: PaymentOrderType,
    private val accounting: Accounting?,
    private val accountingCategoryId: String?,
    private val accountingLedgerClassId: String?,
    private val chargeBearer: ChargeBearer?,
    private val currency: Currency?,
    private val description: String?,
    private val effectiveDate: LocalDate?,
    private val expiresAt: OffsetDateTime?,
    private val fallbackType: FallbackType?,
    private val foreignExchangeContract: String?,
    private val foreignExchangeIndicator: ForeignExchangeIndicator?,
    private val ledgerTransaction: LedgerTransactionCreateRequest?,
    private val ledgerTransactionId: String?,
    private val lineItems: List<LineItemRequest>?,
    private val metadata: Metadata?,
    private val nsfProtected: Boolean?,
    private val originatingPartyName: String?,
    private val priority: Priority?,
    private val purpose: String?,
    private val receivingAccount: ReceivingAccount?,
    private val receivingAccountId: String?,
    private val remittanceInformation: String?,
    private val sendRemittanceAdvice: Boolean?,
    private val statementDescriptor: String?,
    private val subtype: PaymentOrderSubtype?,
    private val transactionMonitoringEnabled: Boolean?,
    private val ultimateOriginatingPartyIdentifier: String?,
    private val ultimateOriginatingPartyName: String?,
    private val ultimateReceivingPartyIdentifier: String?,
    private val ultimateReceivingPartyName: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun direction(): Direction = direction

    fun originatingAccountId(): String = originatingAccountId

    fun type(): PaymentOrderType = type

    fun accounting(): Optional<Accounting> = Optional.ofNullable(accounting)

    fun accountingCategoryId(): Optional<String> = Optional.ofNullable(accountingCategoryId)

    fun accountingLedgerClassId(): Optional<String> = Optional.ofNullable(accountingLedgerClassId)

    fun chargeBearer(): Optional<ChargeBearer> = Optional.ofNullable(chargeBearer)

    fun currency(): Optional<Currency> = Optional.ofNullable(currency)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

    fun expiresAt(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAt)

    fun fallbackType(): Optional<FallbackType> = Optional.ofNullable(fallbackType)

    fun foreignExchangeContract(): Optional<String> = Optional.ofNullable(foreignExchangeContract)

    fun foreignExchangeIndicator(): Optional<ForeignExchangeIndicator> =
        Optional.ofNullable(foreignExchangeIndicator)

    fun ledgerTransaction(): Optional<LedgerTransactionCreateRequest> =
        Optional.ofNullable(ledgerTransaction)

    fun ledgerTransactionId(): Optional<String> = Optional.ofNullable(ledgerTransactionId)

    fun lineItems(): Optional<List<LineItemRequest>> = Optional.ofNullable(lineItems)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun nsfProtected(): Optional<Boolean> = Optional.ofNullable(nsfProtected)

    fun originatingPartyName(): Optional<String> = Optional.ofNullable(originatingPartyName)

    fun priority(): Optional<Priority> = Optional.ofNullable(priority)

    fun purpose(): Optional<String> = Optional.ofNullable(purpose)

    fun receivingAccount(): Optional<ReceivingAccount> = Optional.ofNullable(receivingAccount)

    fun receivingAccountId(): Optional<String> = Optional.ofNullable(receivingAccountId)

    fun remittanceInformation(): Optional<String> = Optional.ofNullable(remittanceInformation)

    fun sendRemittanceAdvice(): Optional<Boolean> = Optional.ofNullable(sendRemittanceAdvice)

    fun statementDescriptor(): Optional<String> = Optional.ofNullable(statementDescriptor)

    fun subtype(): Optional<PaymentOrderSubtype> = Optional.ofNullable(subtype)

    fun transactionMonitoringEnabled(): Optional<Boolean> =
        Optional.ofNullable(transactionMonitoringEnabled)

    fun ultimateOriginatingPartyIdentifier(): Optional<String> =
        Optional.ofNullable(ultimateOriginatingPartyIdentifier)

    fun ultimateOriginatingPartyName(): Optional<String> =
        Optional.ofNullable(ultimateOriginatingPartyName)

    fun ultimateReceivingPartyIdentifier(): Optional<String> =
        Optional.ofNullable(ultimateReceivingPartyIdentifier)

    fun ultimateReceivingPartyName(): Optional<String> =
        Optional.ofNullable(ultimateReceivingPartyName)

    @JvmSynthetic
    internal fun getBody(): PaymentOrderCreateAsyncBody {
        return PaymentOrderCreateAsyncBody(
            amount,
            direction,
            originatingAccountId,
            type,
            accounting,
            accountingCategoryId,
            accountingLedgerClassId,
            chargeBearer,
            currency,
            description,
            effectiveDate,
            expiresAt,
            fallbackType,
            foreignExchangeContract,
            foreignExchangeIndicator,
            ledgerTransaction,
            ledgerTransactionId,
            lineItems,
            metadata,
            nsfProtected,
            originatingPartyName,
            priority,
            purpose,
            receivingAccount,
            receivingAccountId,
            remittanceInformation,
            sendRemittanceAdvice,
            statementDescriptor,
            subtype,
            transactionMonitoringEnabled,
            ultimateOriginatingPartyIdentifier,
            ultimateOriginatingPartyName,
            ultimateReceivingPartyIdentifier,
            ultimateReceivingPartyName,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PaymentOrderCreateAsyncBody.Builder::class)
    @NoAutoDetect
    class PaymentOrderCreateAsyncBody
    internal constructor(
        private val amount: Long?,
        private val direction: Direction?,
        private val originatingAccountId: String?,
        private val type: PaymentOrderType?,
        private val accounting: Accounting?,
        private val accountingCategoryId: String?,
        private val accountingLedgerClassId: String?,
        private val chargeBearer: ChargeBearer?,
        private val currency: Currency?,
        private val description: String?,
        private val effectiveDate: LocalDate?,
        private val expiresAt: OffsetDateTime?,
        private val fallbackType: FallbackType?,
        private val foreignExchangeContract: String?,
        private val foreignExchangeIndicator: ForeignExchangeIndicator?,
        private val ledgerTransaction: LedgerTransactionCreateRequest?,
        private val ledgerTransactionId: String?,
        private val lineItems: List<LineItemRequest>?,
        private val metadata: Metadata?,
        private val nsfProtected: Boolean?,
        private val originatingPartyName: String?,
        private val priority: Priority?,
        private val purpose: String?,
        private val receivingAccount: ReceivingAccount?,
        private val receivingAccountId: String?,
        private val remittanceInformation: String?,
        private val sendRemittanceAdvice: Boolean?,
        private val statementDescriptor: String?,
        private val subtype: PaymentOrderSubtype?,
        private val transactionMonitoringEnabled: Boolean?,
        private val ultimateOriginatingPartyIdentifier: String?,
        private val ultimateOriginatingPartyName: String?,
        private val ultimateReceivingPartyIdentifier: String?,
        private val ultimateReceivingPartyName: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        @JsonProperty("direction") fun direction(): Direction? = direction

        /** The ID of one of your organization's internal accounts. */
        @JsonProperty("originating_account_id")
        fun originatingAccountId(): String? = originatingAccountId

        /**
         * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
         * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
         * `provexchange`, `zengin`.
         */
        @JsonProperty("type") fun type(): PaymentOrderType? = type

        @JsonProperty("accounting") fun accounting(): Accounting? = accounting

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("accounting_category_id")
        fun accountingCategoryId(): String? = accountingCategoryId

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        @JsonProperty("accounting_ledger_class_id")
        fun accountingLedgerClassId(): String? = accountingLedgerClassId

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        @JsonProperty("charge_bearer") fun chargeBearer(): ChargeBearer? = chargeBearer

        /** Defaults to the currency of the originating account. */
        @JsonProperty("currency") fun currency(): Currency? = currency

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        @JsonProperty("expires_at") fun expiresAt(): OffsetDateTime? = expiresAt

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         */
        @JsonProperty("fallback_type") fun fallbackType(): FallbackType? = fallbackType

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        @JsonProperty("foreign_exchange_contract")
        fun foreignExchangeContract(): String? = foreignExchangeContract

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        @JsonProperty("foreign_exchange_indicator")
        fun foreignExchangeIndicator(): ForeignExchangeIndicator? = foreignExchangeIndicator

        /**
         * Specifies a ledger transaction object that will be created with the payment order. If the
         * ledger transaction cannot be created, then the payment order creation will fail. The
         * resulting ledger transaction will mirror the status of the payment order.
         */
        @JsonProperty("ledger_transaction")
        fun ledgerTransaction(): LedgerTransactionCreateRequest? = ledgerTransaction

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon payment order creation. Once the payment order is
         * created, the status of the ledger transaction tracks the payment order automatically.
         */
        @JsonProperty("ledger_transaction_id")
        fun ledgerTransactionId(): String? = ledgerTransactionId

        /** An array of line items that must sum up to the amount of the payment order. */
        @JsonProperty("line_items") fun lineItems(): List<LineItemRequest>? = lineItems

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        @JsonProperty("nsf_protected") fun nsfProtected(): Boolean? = nsfProtected

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        @JsonProperty("originating_party_name")
        fun originatingPartyName(): String? = originatingPartyName

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        @JsonProperty("priority") fun priority(): Priority? = priority

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. If you are using Currencycloud, this is the
         * `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        @JsonProperty("purpose") fun purpose(): String? = purpose

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        @JsonProperty("receiving_account")
        fun receivingAccount(): ReceivingAccount? = receivingAccount

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        @JsonProperty("receiving_account_id") fun receivingAccountId(): String? = receivingAccountId

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        @JsonProperty("send_remittance_advice")
        fun sendRemittanceAdvice(): Boolean? = sendRemittanceAdvice

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        @JsonProperty("statement_descriptor")
        fun statementDescriptor(): String? = statementDescriptor

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        @JsonProperty("subtype") fun subtype(): PaymentOrderSubtype? = subtype

        /**
         * A flag that determines whether a payment order should go through transaction monitoring.
         */
        @JsonProperty("transaction_monitoring_enabled")
        fun transactionMonitoringEnabled(): Boolean? = transactionMonitoringEnabled

        /** Identifier of the ultimate originator of the payment order. */
        @JsonProperty("ultimate_originating_party_identifier")
        fun ultimateOriginatingPartyIdentifier(): String? = ultimateOriginatingPartyIdentifier

        /** Name of the ultimate originator of the payment order. */
        @JsonProperty("ultimate_originating_party_name")
        fun ultimateOriginatingPartyName(): String? = ultimateOriginatingPartyName

        /** Identifier of the ultimate funds recipient. */
        @JsonProperty("ultimate_receiving_party_identifier")
        fun ultimateReceivingPartyIdentifier(): String? = ultimateReceivingPartyIdentifier

        /** Name of the ultimate funds recipient. */
        @JsonProperty("ultimate_receiving_party_name")
        fun ultimateReceivingPartyName(): String? = ultimateReceivingPartyName

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentOrderCreateAsyncBody &&
                this.amount == other.amount &&
                this.direction == other.direction &&
                this.originatingAccountId == other.originatingAccountId &&
                this.type == other.type &&
                this.accounting == other.accounting &&
                this.accountingCategoryId == other.accountingCategoryId &&
                this.accountingLedgerClassId == other.accountingLedgerClassId &&
                this.chargeBearer == other.chargeBearer &&
                this.currency == other.currency &&
                this.description == other.description &&
                this.effectiveDate == other.effectiveDate &&
                this.expiresAt == other.expiresAt &&
                this.fallbackType == other.fallbackType &&
                this.foreignExchangeContract == other.foreignExchangeContract &&
                this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                this.ledgerTransaction == other.ledgerTransaction &&
                this.ledgerTransactionId == other.ledgerTransactionId &&
                this.lineItems == other.lineItems &&
                this.metadata == other.metadata &&
                this.nsfProtected == other.nsfProtected &&
                this.originatingPartyName == other.originatingPartyName &&
                this.priority == other.priority &&
                this.purpose == other.purpose &&
                this.receivingAccount == other.receivingAccount &&
                this.receivingAccountId == other.receivingAccountId &&
                this.remittanceInformation == other.remittanceInformation &&
                this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
                this.statementDescriptor == other.statementDescriptor &&
                this.subtype == other.subtype &&
                this.transactionMonitoringEnabled == other.transactionMonitoringEnabled &&
                this.ultimateOriginatingPartyIdentifier ==
                    other.ultimateOriginatingPartyIdentifier &&
                this.ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
                this.ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier &&
                this.ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        direction,
                        originatingAccountId,
                        type,
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        chargeBearer,
                        currency,
                        description,
                        effectiveDate,
                        expiresAt,
                        fallbackType,
                        foreignExchangeContract,
                        foreignExchangeIndicator,
                        ledgerTransaction,
                        ledgerTransactionId,
                        lineItems,
                        metadata,
                        nsfProtected,
                        originatingPartyName,
                        priority,
                        purpose,
                        receivingAccount,
                        receivingAccountId,
                        remittanceInformation,
                        sendRemittanceAdvice,
                        statementDescriptor,
                        subtype,
                        transactionMonitoringEnabled,
                        ultimateOriginatingPartyIdentifier,
                        ultimateOriginatingPartyName,
                        ultimateReceivingPartyIdentifier,
                        ultimateReceivingPartyName,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentOrderCreateAsyncBody{amount=$amount, direction=$direction, originatingAccountId=$originatingAccountId, type=$type, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, chargeBearer=$chargeBearer, currency=$currency, description=$description, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, priority=$priority, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, subtype=$subtype, transactionMonitoringEnabled=$transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var direction: Direction? = null
            private var originatingAccountId: String? = null
            private var type: PaymentOrderType? = null
            private var accounting: Accounting? = null
            private var accountingCategoryId: String? = null
            private var accountingLedgerClassId: String? = null
            private var chargeBearer: ChargeBearer? = null
            private var currency: Currency? = null
            private var description: String? = null
            private var effectiveDate: LocalDate? = null
            private var expiresAt: OffsetDateTime? = null
            private var fallbackType: FallbackType? = null
            private var foreignExchangeContract: String? = null
            private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
            private var ledgerTransaction: LedgerTransactionCreateRequest? = null
            private var ledgerTransactionId: String? = null
            private var lineItems: List<LineItemRequest>? = null
            private var metadata: Metadata? = null
            private var nsfProtected: Boolean? = null
            private var originatingPartyName: String? = null
            private var priority: Priority? = null
            private var purpose: String? = null
            private var receivingAccount: ReceivingAccount? = null
            private var receivingAccountId: String? = null
            private var remittanceInformation: String? = null
            private var sendRemittanceAdvice: Boolean? = null
            private var statementDescriptor: String? = null
            private var subtype: PaymentOrderSubtype? = null
            private var transactionMonitoringEnabled: Boolean? = null
            private var ultimateOriginatingPartyIdentifier: String? = null
            private var ultimateOriginatingPartyName: String? = null
            private var ultimateReceivingPartyIdentifier: String? = null
            private var ultimateReceivingPartyName: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentOrderCreateAsyncBody: PaymentOrderCreateAsyncBody) = apply {
                this.amount = paymentOrderCreateAsyncBody.amount
                this.direction = paymentOrderCreateAsyncBody.direction
                this.originatingAccountId = paymentOrderCreateAsyncBody.originatingAccountId
                this.type = paymentOrderCreateAsyncBody.type
                this.accounting = paymentOrderCreateAsyncBody.accounting
                this.accountingCategoryId = paymentOrderCreateAsyncBody.accountingCategoryId
                this.accountingLedgerClassId = paymentOrderCreateAsyncBody.accountingLedgerClassId
                this.chargeBearer = paymentOrderCreateAsyncBody.chargeBearer
                this.currency = paymentOrderCreateAsyncBody.currency
                this.description = paymentOrderCreateAsyncBody.description
                this.effectiveDate = paymentOrderCreateAsyncBody.effectiveDate
                this.expiresAt = paymentOrderCreateAsyncBody.expiresAt
                this.fallbackType = paymentOrderCreateAsyncBody.fallbackType
                this.foreignExchangeContract = paymentOrderCreateAsyncBody.foreignExchangeContract
                this.foreignExchangeIndicator = paymentOrderCreateAsyncBody.foreignExchangeIndicator
                this.ledgerTransaction = paymentOrderCreateAsyncBody.ledgerTransaction
                this.ledgerTransactionId = paymentOrderCreateAsyncBody.ledgerTransactionId
                this.lineItems = paymentOrderCreateAsyncBody.lineItems
                this.metadata = paymentOrderCreateAsyncBody.metadata
                this.nsfProtected = paymentOrderCreateAsyncBody.nsfProtected
                this.originatingPartyName = paymentOrderCreateAsyncBody.originatingPartyName
                this.priority = paymentOrderCreateAsyncBody.priority
                this.purpose = paymentOrderCreateAsyncBody.purpose
                this.receivingAccount = paymentOrderCreateAsyncBody.receivingAccount
                this.receivingAccountId = paymentOrderCreateAsyncBody.receivingAccountId
                this.remittanceInformation = paymentOrderCreateAsyncBody.remittanceInformation
                this.sendRemittanceAdvice = paymentOrderCreateAsyncBody.sendRemittanceAdvice
                this.statementDescriptor = paymentOrderCreateAsyncBody.statementDescriptor
                this.subtype = paymentOrderCreateAsyncBody.subtype
                this.transactionMonitoringEnabled =
                    paymentOrderCreateAsyncBody.transactionMonitoringEnabled
                this.ultimateOriginatingPartyIdentifier =
                    paymentOrderCreateAsyncBody.ultimateOriginatingPartyIdentifier
                this.ultimateOriginatingPartyName =
                    paymentOrderCreateAsyncBody.ultimateOriginatingPartyName
                this.ultimateReceivingPartyIdentifier =
                    paymentOrderCreateAsyncBody.ultimateReceivingPartyIdentifier
                this.ultimateReceivingPartyName =
                    paymentOrderCreateAsyncBody.ultimateReceivingPartyName
                additionalProperties(paymentOrderCreateAsyncBody.additionalProperties)
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction")
            fun direction(direction: Direction) = apply { this.direction = direction }

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(originatingAccountId: String) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") fun type(type: PaymentOrderType) = apply { this.type = type }

            @JsonProperty("accounting")
            fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(accountingCategoryId: String) = apply {
                this.accountingCategoryId = accountingCategoryId
            }

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            fun accountingLedgerClassId(accountingLedgerClassId: String) = apply {
                this.accountingLedgerClassId = accountingLedgerClassId
            }

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer")
            fun chargeBearer(chargeBearer: ChargeBearer) = apply {
                this.chargeBearer = chargeBearer
            }

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(currency: Currency) = apply { this.currency = currency }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at")
            fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            fun fallbackType(fallbackType: FallbackType) = apply {
                this.fallbackType = fallbackType
            }

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            fun foreignExchangeContract(foreignExchangeContract: String) = apply {
                this.foreignExchangeContract = foreignExchangeContract
            }

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                apply {
                    this.foreignExchangeIndicator = foreignExchangeIndicator
                }

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @JsonProperty("ledger_transaction")
            fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
                this.ledgerTransaction = ledgerTransaction
            }

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            fun ledgerTransactionId(ledgerTransactionId: String) = apply {
                this.ledgerTransactionId = ledgerTransactionId
            }

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items")
            fun lineItems(lineItems: List<LineItemRequest>) = apply { this.lineItems = lineItems }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected")
            fun nsfProtected(nsfProtected: Boolean) = apply { this.nsfProtected = nsfProtected }

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            fun originatingPartyName(originatingPartyName: String) = apply {
                this.originatingPartyName = originatingPartyName
            }

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority")
            fun priority(priority: Priority) = apply { this.priority = priority }

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. If you are using Currencycloud, this is
             * the `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that
             * will be attached to the payment.
             */
            @JsonProperty("purpose") fun purpose(purpose: String) = apply { this.purpose = purpose }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
                this.receivingAccount = receivingAccount
            }

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(receivingAccountId: String) = apply {
                this.receivingAccountId = receivingAccountId
            }

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(statementDescriptor: String) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype")
            fun subtype(subtype: PaymentOrderSubtype) = apply { this.subtype = subtype }

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            @JsonProperty("transaction_monitoring_enabled")
            fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) = apply {
                this.transactionMonitoringEnabled = transactionMonitoringEnabled
            }

            /** Identifier of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_identifier")
            fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) =
                apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

            /** Name of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_name")
            fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) = apply {
                this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
            }

            /** Identifier of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_identifier")
            fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) = apply {
                this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
            }

            /** Name of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_name")
            fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) = apply {
                this.ultimateReceivingPartyName = ultimateReceivingPartyName
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

            fun build(): PaymentOrderCreateAsyncBody =
                PaymentOrderCreateAsyncBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(originatingAccountId) {
                        "`originatingAccountId` is required but was not set"
                    },
                    checkNotNull(type) { "`type` is required but was not set" },
                    accounting,
                    accountingCategoryId,
                    accountingLedgerClassId,
                    chargeBearer,
                    currency,
                    description,
                    effectiveDate,
                    expiresAt,
                    fallbackType,
                    foreignExchangeContract,
                    foreignExchangeIndicator,
                    ledgerTransaction,
                    ledgerTransactionId,
                    lineItems?.toUnmodifiable(),
                    metadata,
                    nsfProtected,
                    originatingPartyName,
                    priority,
                    purpose,
                    receivingAccount,
                    receivingAccountId,
                    remittanceInformation,
                    sendRemittanceAdvice,
                    statementDescriptor,
                    subtype,
                    transactionMonitoringEnabled,
                    ultimateOriginatingPartyIdentifier,
                    ultimateOriginatingPartyName,
                    ultimateReceivingPartyIdentifier,
                    ultimateReceivingPartyName,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderCreateAsyncParams &&
            this.amount == other.amount &&
            this.direction == other.direction &&
            this.originatingAccountId == other.originatingAccountId &&
            this.type == other.type &&
            this.accounting == other.accounting &&
            this.accountingCategoryId == other.accountingCategoryId &&
            this.accountingLedgerClassId == other.accountingLedgerClassId &&
            this.chargeBearer == other.chargeBearer &&
            this.currency == other.currency &&
            this.description == other.description &&
            this.effectiveDate == other.effectiveDate &&
            this.expiresAt == other.expiresAt &&
            this.fallbackType == other.fallbackType &&
            this.foreignExchangeContract == other.foreignExchangeContract &&
            this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
            this.ledgerTransaction == other.ledgerTransaction &&
            this.ledgerTransactionId == other.ledgerTransactionId &&
            this.lineItems == other.lineItems &&
            this.metadata == other.metadata &&
            this.nsfProtected == other.nsfProtected &&
            this.originatingPartyName == other.originatingPartyName &&
            this.priority == other.priority &&
            this.purpose == other.purpose &&
            this.receivingAccount == other.receivingAccount &&
            this.receivingAccountId == other.receivingAccountId &&
            this.remittanceInformation == other.remittanceInformation &&
            this.sendRemittanceAdvice == other.sendRemittanceAdvice &&
            this.statementDescriptor == other.statementDescriptor &&
            this.subtype == other.subtype &&
            this.transactionMonitoringEnabled == other.transactionMonitoringEnabled &&
            this.ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier &&
            this.ultimateOriginatingPartyName == other.ultimateOriginatingPartyName &&
            this.ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier &&
            this.ultimateReceivingPartyName == other.ultimateReceivingPartyName &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            direction,
            originatingAccountId,
            type,
            accounting,
            accountingCategoryId,
            accountingLedgerClassId,
            chargeBearer,
            currency,
            description,
            effectiveDate,
            expiresAt,
            fallbackType,
            foreignExchangeContract,
            foreignExchangeIndicator,
            ledgerTransaction,
            ledgerTransactionId,
            lineItems,
            metadata,
            nsfProtected,
            originatingPartyName,
            priority,
            purpose,
            receivingAccount,
            receivingAccountId,
            remittanceInformation,
            sendRemittanceAdvice,
            statementDescriptor,
            subtype,
            transactionMonitoringEnabled,
            ultimateOriginatingPartyIdentifier,
            ultimateOriginatingPartyName,
            ultimateReceivingPartyIdentifier,
            ultimateReceivingPartyName,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PaymentOrderCreateAsyncParams{amount=$amount, direction=$direction, originatingAccountId=$originatingAccountId, type=$type, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, chargeBearer=$chargeBearer, currency=$currency, description=$description, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, priority=$priority, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, subtype=$subtype, transactionMonitoringEnabled=$transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var direction: Direction? = null
        private var originatingAccountId: String? = null
        private var type: PaymentOrderType? = null
        private var accounting: Accounting? = null
        private var accountingCategoryId: String? = null
        private var accountingLedgerClassId: String? = null
        private var chargeBearer: ChargeBearer? = null
        private var currency: Currency? = null
        private var description: String? = null
        private var effectiveDate: LocalDate? = null
        private var expiresAt: OffsetDateTime? = null
        private var fallbackType: FallbackType? = null
        private var foreignExchangeContract: String? = null
        private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
        private var ledgerTransaction: LedgerTransactionCreateRequest? = null
        private var ledgerTransactionId: String? = null
        private var lineItems: MutableList<LineItemRequest> = mutableListOf()
        private var metadata: Metadata? = null
        private var nsfProtected: Boolean? = null
        private var originatingPartyName: String? = null
        private var priority: Priority? = null
        private var purpose: String? = null
        private var receivingAccount: ReceivingAccount? = null
        private var receivingAccountId: String? = null
        private var remittanceInformation: String? = null
        private var sendRemittanceAdvice: Boolean? = null
        private var statementDescriptor: String? = null
        private var subtype: PaymentOrderSubtype? = null
        private var transactionMonitoringEnabled: Boolean? = null
        private var ultimateOriginatingPartyIdentifier: String? = null
        private var ultimateOriginatingPartyName: String? = null
        private var ultimateReceivingPartyIdentifier: String? = null
        private var ultimateReceivingPartyName: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentOrderCreateAsyncParams: PaymentOrderCreateAsyncParams) = apply {
            this.amount = paymentOrderCreateAsyncParams.amount
            this.direction = paymentOrderCreateAsyncParams.direction
            this.originatingAccountId = paymentOrderCreateAsyncParams.originatingAccountId
            this.type = paymentOrderCreateAsyncParams.type
            this.accounting = paymentOrderCreateAsyncParams.accounting
            this.accountingCategoryId = paymentOrderCreateAsyncParams.accountingCategoryId
            this.accountingLedgerClassId = paymentOrderCreateAsyncParams.accountingLedgerClassId
            this.chargeBearer = paymentOrderCreateAsyncParams.chargeBearer
            this.currency = paymentOrderCreateAsyncParams.currency
            this.description = paymentOrderCreateAsyncParams.description
            this.effectiveDate = paymentOrderCreateAsyncParams.effectiveDate
            this.expiresAt = paymentOrderCreateAsyncParams.expiresAt
            this.fallbackType = paymentOrderCreateAsyncParams.fallbackType
            this.foreignExchangeContract = paymentOrderCreateAsyncParams.foreignExchangeContract
            this.foreignExchangeIndicator = paymentOrderCreateAsyncParams.foreignExchangeIndicator
            this.ledgerTransaction = paymentOrderCreateAsyncParams.ledgerTransaction
            this.ledgerTransactionId = paymentOrderCreateAsyncParams.ledgerTransactionId
            this.lineItems(paymentOrderCreateAsyncParams.lineItems ?: listOf())
            this.metadata = paymentOrderCreateAsyncParams.metadata
            this.nsfProtected = paymentOrderCreateAsyncParams.nsfProtected
            this.originatingPartyName = paymentOrderCreateAsyncParams.originatingPartyName
            this.priority = paymentOrderCreateAsyncParams.priority
            this.purpose = paymentOrderCreateAsyncParams.purpose
            this.receivingAccount = paymentOrderCreateAsyncParams.receivingAccount
            this.receivingAccountId = paymentOrderCreateAsyncParams.receivingAccountId
            this.remittanceInformation = paymentOrderCreateAsyncParams.remittanceInformation
            this.sendRemittanceAdvice = paymentOrderCreateAsyncParams.sendRemittanceAdvice
            this.statementDescriptor = paymentOrderCreateAsyncParams.statementDescriptor
            this.subtype = paymentOrderCreateAsyncParams.subtype
            this.transactionMonitoringEnabled =
                paymentOrderCreateAsyncParams.transactionMonitoringEnabled
            this.ultimateOriginatingPartyIdentifier =
                paymentOrderCreateAsyncParams.ultimateOriginatingPartyIdentifier
            this.ultimateOriginatingPartyName =
                paymentOrderCreateAsyncParams.ultimateOriginatingPartyName
            this.ultimateReceivingPartyIdentifier =
                paymentOrderCreateAsyncParams.ultimateReceivingPartyIdentifier
            this.ultimateReceivingPartyName =
                paymentOrderCreateAsyncParams.ultimateReceivingPartyName
            additionalQueryParams(paymentOrderCreateAsyncParams.additionalQueryParams)
            additionalHeaders(paymentOrderCreateAsyncParams.additionalHeaders)
            additionalBodyProperties(paymentOrderCreateAsyncParams.additionalBodyProperties)
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        fun amount(amount: Long) = apply { this.amount = amount }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: Direction) = apply { this.direction = direction }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * One of `ach`, `bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
         * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
         * `provexchange`, `zengin`.
         */
        fun type(type: PaymentOrderType) = apply { this.type = type }

        fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        fun accountingCategoryId(accountingCategoryId: String) = apply {
            this.accountingCategoryId = accountingCategoryId
        }

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        fun accountingLedgerClassId(accountingLedgerClassId: String) = apply {
            this.accountingLedgerClassId = accountingLedgerClassId
        }

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        fun chargeBearer(chargeBearer: ChargeBearer) = apply { this.chargeBearer = chargeBearer }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = apply { this.currency = currency }

        /** An optional description for internal use. */
        fun description(description: String) = apply { this.description = description }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

        /**
         * A payment type to fallback to if the original type is not valid for the receiving
         * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
         * fallback_type=ach)
         */
        fun fallbackType(fallbackType: FallbackType) = apply { this.fallbackType = fallbackType }

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        fun foreignExchangeContract(foreignExchangeContract: String) = apply {
            this.foreignExchangeContract = foreignExchangeContract
        }

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) = apply {
            this.foreignExchangeIndicator = foreignExchangeIndicator
        }

        /**
         * Specifies a ledger transaction object that will be created with the payment order. If the
         * ledger transaction cannot be created, then the payment order creation will fail. The
         * resulting ledger transaction will mirror the status of the payment order.
         */
        fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
            this.ledgerTransaction = ledgerTransaction
        }

        /**
         * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending ledger
         * transaction can be attached upon payment order creation. Once the payment order is
         * created, the status of the ledger transaction tracks the payment order automatically.
         */
        fun ledgerTransactionId(ledgerTransactionId: String) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /** An array of line items that must sum up to the amount of the payment order. */
        fun lineItems(lineItems: List<LineItemRequest>) = apply {
            this.lineItems.clear()
            this.lineItems.addAll(lineItems)
        }

        /** An array of line items that must sum up to the amount of the payment order. */
        fun addLineItem(lineItem: LineItemRequest) = apply { this.lineItems.add(lineItem) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        fun nsfProtected(nsfProtected: Boolean) = apply { this.nsfProtected = nsfProtected }

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        fun originatingPartyName(originatingPartyName: String) = apply {
            this.originatingPartyName = originatingPartyName
        }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = apply { this.priority = priority }

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. If you are using Currencycloud, this is the
         * `payment.purpose_code` field. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        fun purpose(purpose: String) = apply { this.purpose = purpose }

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
            this.receivingAccount = receivingAccount
        }

        /**
         * Either `receiving_account` or `receiving_account_id` must be present. When using
         * `receiving_account_id`, you may pass the id of an external account or an internal
         * account.
         */
        fun receivingAccountId(receivingAccountId: String) = apply {
            this.receivingAccountId = receivingAccountId
        }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
            this.sendRemittanceAdvice = sendRemittanceAdvice
        }

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        fun subtype(subtype: PaymentOrderSubtype) = apply { this.subtype = subtype }

        /**
         * A flag that determines whether a payment order should go through transaction monitoring.
         */
        fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) = apply {
            this.transactionMonitoringEnabled = transactionMonitoringEnabled
        }

        /** Identifier of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) = apply {
            this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
        }

        /** Name of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) = apply {
            this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
        }

        /** Identifier of the ultimate funds recipient. */
        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) = apply {
            this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
        }

        /** Name of the ultimate funds recipient. */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) = apply {
            this.ultimateReceivingPartyName = ultimateReceivingPartyName
        }

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

        fun build(): PaymentOrderCreateAsyncParams =
            PaymentOrderCreateAsyncParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(originatingAccountId) {
                    "`originatingAccountId` is required but was not set"
                },
                checkNotNull(type) { "`type` is required but was not set" },
                accounting,
                accountingCategoryId,
                accountingLedgerClassId,
                chargeBearer,
                currency,
                description,
                effectiveDate,
                expiresAt,
                fallbackType,
                foreignExchangeContract,
                foreignExchangeIndicator,
                ledgerTransaction,
                ledgerTransactionId,
                if (lineItems.size == 0) null else lineItems.toUnmodifiable(),
                metadata,
                nsfProtected,
                originatingPartyName,
                priority,
                purpose,
                receivingAccount,
                receivingAccountId,
                remittanceInformation,
                sendRemittanceAdvice,
                statementDescriptor,
                subtype,
                transactionMonitoringEnabled,
                ultimateOriginatingPartyIdentifier,
                ultimateOriginatingPartyName,
                ultimateReceivingPartyIdentifier,
                ultimateReceivingPartyName,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Direction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Direction && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDIT = Direction(JsonField.of("credit"))

            @JvmField val DEBIT = Direction(JsonField.of("debit"))

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Accounting.Builder::class)
    @NoAutoDetect
    class Accounting
    private constructor(
        private val accountId: String?,
        private val classId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         */
        @JsonProperty("class_id") fun classId(): String? = classId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Accounting &&
                this.accountId == other.accountId &&
                this.classId == other.classId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountId,
                        classId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var classId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accounting: Accounting) = apply {
                this.accountId = accounting.accountId
                this.classId = accounting.classId
                additionalProperties(accounting.additionalProperties)
            }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            @JsonProperty("class_id")
            fun classId(classId: String) = apply { this.classId = classId }

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

            fun build(): Accounting =
                Accounting(
                    accountId,
                    classId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class ChargeBearer
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ChargeBearer && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SHARED = ChargeBearer(JsonField.of("shared"))

            @JvmField val SENDER = ChargeBearer(JsonField.of("sender"))

            @JvmField val RECEIVER = ChargeBearer(JsonField.of("receiver"))

            @JvmStatic fun of(value: String) = ChargeBearer(JsonField.of(value))
        }

        enum class Known {
            SHARED,
            SENDER,
            RECEIVER,
        }

        enum class Value {
            SHARED,
            SENDER,
            RECEIVER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SHARED -> Value.SHARED
                SENDER -> Value.SENDER
                RECEIVER -> Value.RECEIVER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SHARED -> Known.SHARED
                SENDER -> Known.SENDER
                RECEIVER -> Known.RECEIVER
                else -> throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class FallbackType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FallbackType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = FallbackType(JsonField.of("ach"))

            @JvmStatic fun of(value: String) = FallbackType(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                else -> throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ForeignExchangeIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ForeignExchangeIndicator && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val FIXED_TO_VARIABLE = ForeignExchangeIndicator(JsonField.of("fixed_to_variable"))

            @JvmField
            val VARIABLE_TO_FIXED = ForeignExchangeIndicator(JsonField.of("variable_to_fixed"))

            @JvmStatic fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
        }

        enum class Known {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
        }

        enum class Value {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown ForeignExchangeIndicator: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Specifies a ledger transaction object that will be created with the payment order. If the
     * ledger transaction cannot be created, then the payment order creation will fail. The
     * resulting ledger transaction will mirror the status of the payment order.
     */
    @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
    @NoAutoDetect
    class LedgerTransactionCreateRequest
    private constructor(
        private val description: String?,
        private val status: Status?,
        private val metadata: Metadata?,
        private val effectiveAt: OffsetDateTime?,
        private val effectiveDate: LocalDate?,
        private val ledgerEntries: List<LedgerEntryCreateRequest>?,
        private val externalId: String?,
        private val ledgerableType: LedgerableType?,
        private val ledgerableId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** An optional description for internal use. */
        @JsonProperty("description") fun description(): String? = description

        /** To post a ledger transaction at creation, use `posted`. */
        @JsonProperty("status") fun status(): Status? = status

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        @JsonProperty("effective_at") fun effectiveAt(): OffsetDateTime? = effectiveAt

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        /** An array of ledger entry objects. */
        @JsonProperty("ledger_entries")
        fun ledgerEntries(): List<LedgerEntryCreateRequest>? = ledgerEntries

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        @JsonProperty("external_id") fun externalId(): String? = externalId

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, or reversal.
         */
        @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LedgerTransactionCreateRequest &&
                this.description == other.description &&
                this.status == other.status &&
                this.metadata == other.metadata &&
                this.effectiveAt == other.effectiveAt &&
                this.effectiveDate == other.effectiveDate &&
                this.ledgerEntries == other.ledgerEntries &&
                this.externalId == other.externalId &&
                this.ledgerableType == other.ledgerableType &&
                this.ledgerableId == other.ledgerableId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        description,
                        status,
                        metadata,
                        effectiveAt,
                        effectiveDate,
                        ledgerEntries,
                        externalId,
                        ledgerableType,
                        ledgerableId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var status: Status? = null
            private var metadata: Metadata? = null
            private var effectiveAt: OffsetDateTime? = null
            private var effectiveDate: LocalDate? = null
            private var ledgerEntries: List<LedgerEntryCreateRequest>? = null
            private var externalId: String? = null
            private var ledgerableType: LedgerableType? = null
            private var ledgerableId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                apply {
                    this.description = ledgerTransactionCreateRequest.description
                    this.status = ledgerTransactionCreateRequest.status
                    this.metadata = ledgerTransactionCreateRequest.metadata
                    this.effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                    this.effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                    this.ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries
                    this.externalId = ledgerTransactionCreateRequest.externalId
                    this.ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                    this.ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                    additionalProperties(ledgerTransactionCreateRequest.additionalProperties)
                }

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            fun effectiveAt(effectiveAt: OffsetDateTime) = apply { this.effectiveAt = effectiveAt }

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                this.ledgerEntries = ledgerEntries
            }

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            @JsonProperty("external_id")
            fun externalId(externalId: String) = apply { this.externalId = externalId }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, or reversal.
             */
            @JsonProperty("ledgerable_type")
            fun ledgerableType(ledgerableType: LedgerableType) = apply {
                this.ledgerableType = ledgerableType
            }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

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

            fun build(): LedgerTransactionCreateRequest =
                LedgerTransactionCreateRequest(
                    description,
                    status,
                    metadata,
                    effectiveAt,
                    effectiveDate,
                    checkNotNull(ledgerEntries) { "`ledgerEntries` is required but was not set" }
                        .toUnmodifiable(),
                    externalId,
                    ledgerableType,
                    ledgerableId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
        @NoAutoDetect
        class LedgerEntryCreateRequest
        private constructor(
            private val amount: Long?,
            private val direction: TransactionDirection?,
            private val ledgerAccountId: String?,
            private val lockVersion: Long?,
            private val pendingBalanceAmount: PendingBalanceAmount?,
            private val postedBalanceAmount: PostedBalanceAmount?,
            private val availableBalanceAmount: AvailableBalanceAmount?,
            private val showResultingLedgerAccountBalances: Boolean?,
            private val metadata: Metadata?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             * Can be any integer up to 36 digits.
             */
            @JsonProperty("amount") fun amount(): Long? = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") fun direction(): TransactionDirection? = direction

            /** The ledger account that this ledger entry is associated with. */
            @JsonProperty("ledger_account_id") fun ledgerAccountId(): String? = ledgerAccountId

            /**
             * Lock version of the ledger account. This can be passed when creating a ledger
             * transaction to only succeed if no ledger transactions have posted since the given
             * version. See our post about Designing the Ledgers API with Optimistic Locking for
             * more details.
             */
            @JsonProperty("lock_version") fun lockVersion(): Long? = lockVersion

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("pending_balance_amount")
            fun pendingBalanceAmount(): PendingBalanceAmount? = pendingBalanceAmount

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("posted_balance_amount")
            fun postedBalanceAmount(): PostedBalanceAmount? = postedBalanceAmount

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonProperty("available_balance_amount")
            fun availableBalanceAmount(): AvailableBalanceAmount? = availableBalanceAmount

            /**
             * If true, response will include the balance of the associated ledger account for the
             * entry.
             */
            @JsonProperty("show_resulting_ledger_account_balances")
            fun showResultingLedgerAccountBalances(): Boolean? = showResultingLedgerAccountBalances

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerEntryCreateRequest &&
                    this.amount == other.amount &&
                    this.direction == other.direction &&
                    this.ledgerAccountId == other.ledgerAccountId &&
                    this.lockVersion == other.lockVersion &&
                    this.pendingBalanceAmount == other.pendingBalanceAmount &&
                    this.postedBalanceAmount == other.postedBalanceAmount &&
                    this.availableBalanceAmount == other.availableBalanceAmount &&
                    this.showResultingLedgerAccountBalances ==
                        other.showResultingLedgerAccountBalances &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            direction,
                            ledgerAccountId,
                            lockVersion,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            availableBalanceAmount,
                            showResultingLedgerAccountBalances,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var direction: TransactionDirection? = null
                private var ledgerAccountId: String? = null
                private var lockVersion: Long? = null
                private var pendingBalanceAmount: PendingBalanceAmount? = null
                private var postedBalanceAmount: PostedBalanceAmount? = null
                private var availableBalanceAmount: AvailableBalanceAmount? = null
                private var showResultingLedgerAccountBalances: Boolean? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                    this.amount = ledgerEntryCreateRequest.amount
                    this.direction = ledgerEntryCreateRequest.direction
                    this.ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                    this.lockVersion = ledgerEntryCreateRequest.lockVersion
                    this.pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                    this.postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                    this.availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                    this.showResultingLedgerAccountBalances =
                        ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                    this.metadata = ledgerEntryCreateRequest.metadata
                    additionalProperties(ledgerEntryCreateRequest.additionalProperties)
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                fun direction(direction: TransactionDirection) = apply {
                    this.direction = direction
                }

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id")
                fun ledgerAccountId(ledgerAccountId: String) = apply {
                    this.ledgerAccountId = ledgerAccountId
                }

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version")
                fun lockVersion(lockVersion: Long) = apply { this.lockVersion = lockVersion }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) = apply {
                    this.pendingBalanceAmount = pendingBalanceAmount
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) = apply {
                    this.postedBalanceAmount = postedBalanceAmount
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) = apply {
                    this.availableBalanceAmount = availableBalanceAmount
                }

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                fun showResultingLedgerAccountBalances(
                    showResultingLedgerAccountBalances: Boolean
                ) = apply {
                    this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LedgerEntryCreateRequest =
                    LedgerEntryCreateRequest(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        checkNotNull(ledgerAccountId) {
                            "`ledgerAccountId` is required but was not set"
                        },
                        lockVersion,
                        pendingBalanceAmount,
                        postedBalanceAmount,
                        availableBalanceAmount,
                        showResultingLedgerAccountBalances,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * available balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
            @NoAutoDetect
            class AvailableBalanceAmount
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AvailableBalanceAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "AvailableBalanceAmount{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                        additionalProperties(availableBalanceAmount.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): AvailableBalanceAmount =
                        AvailableBalanceAmount(additionalProperties.toUnmodifiable())
                }
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * pending balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
            @NoAutoDetect
            class PendingBalanceAmount
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PendingBalanceAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "PendingBalanceAmount{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                        additionalProperties(pendingBalanceAmount.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PendingBalanceAmount =
                        PendingBalanceAmount(additionalProperties.toUnmodifiable())
                }
            }

            /**
             * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the account’s
             * posted balance. If any of these conditions would be false after the transaction is
             * created, the entire call will fail with error code 422.
             */
            @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
            @NoAutoDetect
            class PostedBalanceAmount
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PostedBalanceAmount &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = Objects.hash(additionalProperties)
                    }
                    return hashCode
                }

                override fun toString() =
                    "PostedBalanceAmount{additionalProperties=$additionalProperties}"

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                        additionalProperties(postedBalanceAmount.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PostedBalanceAmount =
                        PostedBalanceAmount(additionalProperties.toUnmodifiable())
                }
            }
        }

        class LedgerableType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerableType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val COUNTERPARTY = LedgerableType(JsonField.of("counterparty"))

                @JvmField val EXPECTED_PAYMENT = LedgerableType(JsonField.of("expected_payment"))

                @JvmField
                val INCOMING_PAYMENT_DETAIL =
                    LedgerableType(JsonField.of("incoming_payment_detail"))

                @JvmField val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                @JvmField val LINE_ITEM = LedgerableType(JsonField.of("line_item"))

                @JvmField val PAPER_ITEM = LedgerableType(JsonField.of("paper_item"))

                @JvmField val PAYMENT_ORDER = LedgerableType(JsonField.of("payment_order"))

                @JvmField
                val PAYMENT_ORDER_ATTEMPT = LedgerableType(JsonField.of("payment_order_attempt"))

                @JvmField val RETURN = LedgerableType(JsonField.of("return"))

                @JvmField val REVERSAL = LedgerableType(JsonField.of("reversal"))

                @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
            }

            enum class Known {
                COUNTERPARTY,
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                INTERNAL_ACCOUNT,
                LINE_ITEM,
                PAPER_ITEM,
                PAYMENT_ORDER,
                PAYMENT_ORDER_ATTEMPT,
                RETURN,
                REVERSAL,
            }

            enum class Value {
                COUNTERPARTY,
                EXPECTED_PAYMENT,
                INCOMING_PAYMENT_DETAIL,
                INTERNAL_ACCOUNT,
                LINE_ITEM,
                PAPER_ITEM,
                PAYMENT_ORDER,
                PAYMENT_ORDER_ATTEMPT,
                RETURN,
                REVERSAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COUNTERPARTY -> Value.COUNTERPARTY
                    EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                    INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                    LINE_ITEM -> Value.LINE_ITEM
                    PAPER_ITEM -> Value.PAPER_ITEM
                    PAYMENT_ORDER -> Value.PAYMENT_ORDER
                    PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                    RETURN -> Value.RETURN
                    REVERSAL -> Value.REVERSAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COUNTERPARTY -> Known.COUNTERPARTY
                    EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                    INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                    INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                    LINE_ITEM -> Known.LINE_ITEM
                    PAPER_ITEM -> Known.PAPER_ITEM
                    PAYMENT_ORDER -> Known.PAYMENT_ORDER
                    PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                    RETURN -> Known.RETURN
                    REVERSAL -> Known.REVERSAL
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }

        class Status
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ARCHIVED = Status(JsonField.of("archived"))

                @JvmField val PENDING = Status(JsonField.of("pending"))

                @JvmField val POSTED = Status(JsonField.of("posted"))

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                ARCHIVED,
                PENDING,
                POSTED,
            }

            enum class Value {
                ARCHIVED,
                PENDING,
                POSTED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ARCHIVED -> Value.ARCHIVED
                    PENDING -> Value.PENDING
                    POSTED -> Value.POSTED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ARCHIVED -> Known.ARCHIVED
                    PENDING -> Known.PENDING
                    POSTED -> Known.POSTED
                    else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    @JsonDeserialize(builder = LineItemRequest.Builder::class)
    @NoAutoDetect
    class LineItemRequest
    private constructor(
        private val amount: Long?,
        private val metadata: Metadata?,
        private val description: String?,
        private val accountingCategoryId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Value in specified currency's smallest unit. e.g. $10 would be represented as 1000. */
        @JsonProperty("amount") fun amount(): Long? = amount

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** A free-form description of the line item. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @JsonProperty("accounting_category_id")
        fun accountingCategoryId(): String? = accountingCategoryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItemRequest &&
                this.amount == other.amount &&
                this.metadata == other.metadata &&
                this.description == other.description &&
                this.accountingCategoryId == other.accountingCategoryId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        metadata,
                        description,
                        accountingCategoryId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var metadata: Metadata? = null
            private var description: String? = null
            private var accountingCategoryId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItemRequest: LineItemRequest) = apply {
                this.amount = lineItemRequest.amount
                this.metadata = lineItemRequest.metadata
                this.description = lineItemRequest.description
                this.accountingCategoryId = lineItemRequest.accountingCategoryId
                additionalProperties(lineItemRequest.additionalProperties)
            }

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** A free-form description of the line item. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(accountingCategoryId: String) = apply {
                this.accountingCategoryId = accountingCategoryId
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

            fun build(): LineItemRequest =
                LineItemRequest(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    metadata,
                    description,
                    accountingCategoryId,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    class Priority
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Priority && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val HIGH = Priority(JsonField.of("high"))

            @JvmField val NORMAL = Priority(JsonField.of("normal"))

            @JvmStatic fun of(value: String) = Priority(JsonField.of(value))
        }

        enum class Known {
            HIGH,
            NORMAL,
        }

        enum class Value {
            HIGH,
            NORMAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                HIGH -> Value.HIGH
                NORMAL -> Value.NORMAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                HIGH -> Known.HIGH
                NORMAL -> Known.NORMAL
                else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * Either `receiving_account` or `receiving_account_id` must be present. When using
     * `receiving_account_id`, you may pass the id of an external account or an internal account.
     */
    @JsonDeserialize(builder = ReceivingAccount.Builder::class)
    @NoAutoDetect
    class ReceivingAccount
    private constructor(
        private val accountType: ExternalAccountType?,
        private val partyType: PartyType?,
        private val partyAddress: AddressRequest?,
        private val name: String?,
        private val accountDetails: List<AccountDetail>?,
        private val routingDetails: List<RoutingDetail>?,
        private val metadata: Metadata?,
        private val partyName: String?,
        private val partyIdentifier: String?,
        private val ledgerAccount: LedgerAccountCreateRequest?,
        private val plaidProcessorToken: String?,
        private val contactDetails: List<ContactDetailCreateRequest>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type") fun accountType(): ExternalAccountType? = accountType

        /** Either `individual` or `business`. */
        @JsonProperty("party_type") fun partyType(): PartyType? = partyType

        /** Required if receiving wire payments. */
        @JsonProperty("party_address") fun partyAddress(): AddressRequest? = partyAddress

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("account_details") fun accountDetails(): List<AccountDetail>? = accountDetails

        @JsonProperty("routing_details") fun routingDetails(): List<RoutingDetail>? = routingDetails

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name") fun partyName(): String? = partyName

        @JsonProperty("party_identifier") fun partyIdentifier(): String? = partyIdentifier

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonProperty("ledger_account")
        fun ledgerAccount(): LedgerAccountCreateRequest? = ledgerAccount

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        @JsonProperty("plaid_processor_token")
        fun plaidProcessorToken(): String? = plaidProcessorToken

        @JsonProperty("contact_details")
        fun contactDetails(): List<ContactDetailCreateRequest>? = contactDetails

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReceivingAccount &&
                this.accountType == other.accountType &&
                this.partyType == other.partyType &&
                this.partyAddress == other.partyAddress &&
                this.name == other.name &&
                this.accountDetails == other.accountDetails &&
                this.routingDetails == other.routingDetails &&
                this.metadata == other.metadata &&
                this.partyName == other.partyName &&
                this.partyIdentifier == other.partyIdentifier &&
                this.ledgerAccount == other.ledgerAccount &&
                this.plaidProcessorToken == other.plaidProcessorToken &&
                this.contactDetails == other.contactDetails &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountType,
                        partyType,
                        partyAddress,
                        name,
                        accountDetails,
                        routingDetails,
                        metadata,
                        partyName,
                        partyIdentifier,
                        ledgerAccount,
                        plaidProcessorToken,
                        contactDetails,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ReceivingAccount{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountType: ExternalAccountType? = null
            private var partyType: PartyType? = null
            private var partyAddress: AddressRequest? = null
            private var name: String? = null
            private var accountDetails: List<AccountDetail>? = null
            private var routingDetails: List<RoutingDetail>? = null
            private var metadata: Metadata? = null
            private var partyName: String? = null
            private var partyIdentifier: String? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var plaidProcessorToken: String? = null
            private var contactDetails: List<ContactDetailCreateRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(receivingAccount: ReceivingAccount) = apply {
                this.accountType = receivingAccount.accountType
                this.partyType = receivingAccount.partyType
                this.partyAddress = receivingAccount.partyAddress
                this.name = receivingAccount.name
                this.accountDetails = receivingAccount.accountDetails
                this.routingDetails = receivingAccount.routingDetails
                this.metadata = receivingAccount.metadata
                this.partyName = receivingAccount.partyName
                this.partyIdentifier = receivingAccount.partyIdentifier
                this.ledgerAccount = receivingAccount.ledgerAccount
                this.plaidProcessorToken = receivingAccount.plaidProcessorToken
                this.contactDetails = receivingAccount.contactDetails
                additionalProperties(receivingAccount.additionalProperties)
            }

            /** Can be `checking`, `savings` or `other`. */
            @JsonProperty("account_type")
            fun accountType(accountType: ExternalAccountType) = apply {
                this.accountType = accountType
            }

            /** Either `individual` or `business`. */
            @JsonProperty("party_type")
            fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

            /** Required if receiving wire payments. */
            @JsonProperty("party_address")
            fun partyAddress(partyAddress: AddressRequest) = apply {
                this.partyAddress = partyAddress
            }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("account_details")
            fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                this.accountDetails = accountDetails
            }

            @JsonProperty("routing_details")
            fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
                this.routingDetails = routingDetails
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            @JsonProperty("party_name")
            fun partyName(partyName: String) = apply { this.partyName = partyName }

            @JsonProperty("party_identifier")
            fun partyIdentifier(partyIdentifier: String) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            @JsonProperty("ledger_account")
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            @JsonProperty("plaid_processor_token")
            fun plaidProcessorToken(plaidProcessorToken: String) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            @JsonProperty("contact_details")
            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
                this.contactDetails = contactDetails
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

            fun build(): ReceivingAccount =
                ReceivingAccount(
                    accountType,
                    partyType,
                    partyAddress,
                    name,
                    accountDetails?.toUnmodifiable(),
                    routingDetails?.toUnmodifiable(),
                    metadata,
                    partyName,
                    partyIdentifier,
                    ledgerAccount,
                    plaidProcessorToken,
                    contactDetails?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = AccountDetail.Builder::class)
        @NoAutoDetect
        class AccountDetail
        private constructor(
            private val accountNumber: String?,
            private val accountNumberType: AccountNumberType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

            @JsonProperty("account_number_type")
            fun accountNumberType(): AccountNumberType? = accountNumberType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountDetail &&
                    this.accountNumber == other.accountNumber &&
                    this.accountNumberType == other.accountNumberType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            accountNumber,
                            accountNumberType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: String? = null
                private var accountNumberType: AccountNumberType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountDetail: AccountDetail) = apply {
                    this.accountNumber = accountDetail.accountNumber
                    this.accountNumberType = accountDetail.accountNumberType
                    additionalProperties(accountDetail.additionalProperties)
                }

                @JsonProperty("account_number")
                fun accountNumber(accountNumber: String) = apply {
                    this.accountNumber = accountNumber
                }

                @JsonProperty("account_number_type")
                fun accountNumberType(accountNumberType: AccountNumberType) = apply {
                    this.accountNumberType = accountNumberType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AccountDetail =
                    AccountDetail(
                        checkNotNull(accountNumber) {
                            "`accountNumber` is required but was not set"
                        },
                        accountNumberType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class AccountNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is AccountNumberType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val IBAN = AccountNumberType(JsonField.of("iban"))

                    @JvmField val CLABE = AccountNumberType(JsonField.of("clabe"))

                    @JvmField val WALLET_ADDRESS = AccountNumberType(JsonField.of("wallet_address"))

                    @JvmField val PAN = AccountNumberType(JsonField.of("pan"))

                    @JvmField val OTHER = AccountNumberType(JsonField.of("other"))

                    @JvmStatic fun of(value: String) = AccountNumberType(JsonField.of(value))
                }

                enum class Known {
                    IBAN,
                    CLABE,
                    WALLET_ADDRESS,
                    PAN,
                    OTHER,
                }

                enum class Value {
                    IBAN,
                    CLABE,
                    WALLET_ADDRESS,
                    PAN,
                    OTHER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        IBAN -> Value.IBAN
                        CLABE -> Value.CLABE
                        WALLET_ADDRESS -> Value.WALLET_ADDRESS
                        PAN -> Value.PAN
                        OTHER -> Value.OTHER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        IBAN -> Known.IBAN
                        CLABE -> Known.CLABE
                        WALLET_ADDRESS -> Known.WALLET_ADDRESS
                        PAN -> Known.PAN
                        OTHER -> Known.OTHER
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown AccountNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
        @NoAutoDetect
        class ContactDetailCreateRequest
        private constructor(
            private val contactIdentifier: String?,
            private val contactIdentifierType: ContactIdentifierType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("contact_identifier") fun contactIdentifier(): String? = contactIdentifier

            @JsonProperty("contact_identifier_type")
            fun contactIdentifierType(): ContactIdentifierType? = contactIdentifierType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ContactDetailCreateRequest &&
                    this.contactIdentifier == other.contactIdentifier &&
                    this.contactIdentifierType == other.contactIdentifierType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            contactIdentifier,
                            contactIdentifierType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var contactIdentifier: String? = null
                private var contactIdentifierType: ContactIdentifierType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    this.contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    this.contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties(contactDetailCreateRequest.additionalProperties)
                }

                @JsonProperty("contact_identifier")
                fun contactIdentifier(contactIdentifier: String) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                @JsonProperty("contact_identifier_type")
                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) = apply {
                    this.contactIdentifierType = contactIdentifierType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ContactDetailCreateRequest =
                    ContactDetailCreateRequest(
                        contactIdentifier,
                        contactIdentifierType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ContactIdentifierType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ContactIdentifierType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val EMAIL = ContactIdentifierType(JsonField.of("email"))

                    @JvmField val PHONE_NUMBER = ContactIdentifierType(JsonField.of("phone_number"))

                    @JvmField val WEBSITE = ContactIdentifierType(JsonField.of("website"))

                    @JvmStatic fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                }

                enum class Known {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                }

                enum class Value {
                    EMAIL,
                    PHONE_NUMBER,
                    WEBSITE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        EMAIL -> Value.EMAIL
                        PHONE_NUMBER -> Value.PHONE_NUMBER
                        WEBSITE -> Value.WEBSITE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        EMAIL -> Known.EMAIL
                        PHONE_NUMBER -> Known.PHONE_NUMBER
                        WEBSITE -> Known.WEBSITE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ContactIdentifierType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonDeserialize(builder = LedgerAccountCreateRequest.Builder::class)
        @NoAutoDetect
        class LedgerAccountCreateRequest
        private constructor(
            private val name: String?,
            private val description: String?,
            private val normalBalance: TransactionDirection?,
            private val ledgerId: String?,
            private val currency: String?,
            private val currencyExponent: Long?,
            private val ledgerableId: String?,
            private val ledgerableType: LedgerableType?,
            private val metadata: Metadata?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            /** The name of the ledger account. */
            @JsonProperty("name") fun name(): String? = name

            /** The description of the ledger account. */
            @JsonProperty("description") fun description(): String? = description

            /** The normal balance of the ledger account. */
            @JsonProperty("normal_balance")
            fun normalBalance(): TransactionDirection? = normalBalance

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id") fun ledgerId(): String? = ledgerId

            /** The currency of the ledger account. */
            @JsonProperty("currency") fun currency(): String? = currency

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent") fun currencyExponent(): Long? = currencyExponent

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id") fun ledgerableId(): String? = ledgerableId

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            @JsonProperty("ledgerable_type") fun ledgerableType(): LedgerableType? = ledgerableType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata") fun metadata(): Metadata? = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LedgerAccountCreateRequest &&
                    this.name == other.name &&
                    this.description == other.description &&
                    this.normalBalance == other.normalBalance &&
                    this.ledgerId == other.ledgerId &&
                    this.currency == other.currency &&
                    this.currencyExponent == other.currencyExponent &&
                    this.ledgerableId == other.ledgerableId &&
                    this.ledgerableType == other.ledgerableType &&
                    this.metadata == other.metadata &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            name,
                            description,
                            normalBalance,
                            ledgerId,
                            currency,
                            currencyExponent,
                            ledgerableId,
                            ledgerableType,
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: String? = null
                private var description: String? = null
                private var normalBalance: TransactionDirection? = null
                private var ledgerId: String? = null
                private var currency: String? = null
                private var currencyExponent: Long? = null
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                    this.name = ledgerAccountCreateRequest.name
                    this.description = ledgerAccountCreateRequest.description
                    this.normalBalance = ledgerAccountCreateRequest.normalBalance
                    this.ledgerId = ledgerAccountCreateRequest.ledgerId
                    this.currency = ledgerAccountCreateRequest.currency
                    this.currencyExponent = ledgerAccountCreateRequest.currencyExponent
                    this.ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    this.ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    this.metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties(ledgerAccountCreateRequest.additionalProperties)
                }

                /** The name of the ledger account. */
                @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                /** The description of the ledger account. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /** The normal balance of the ledger account. */
                @JsonProperty("normal_balance")
                fun normalBalance(normalBalance: TransactionDirection) = apply {
                    this.normalBalance = normalBalance
                }

                /** The id of the ledger that this account belongs to. */
                @JsonProperty("ledger_id")
                fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                /** The currency of the ledger account. */
                @JsonProperty("currency")
                fun currency(currency: String) = apply { this.currency = currency }

                /** The currency exponent of the ledger account. */
                @JsonProperty("currency_exponent")
                fun currencyExponent(currencyExponent: Long) = apply {
                    this.currencyExponent = currencyExponent
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(ledgerableType: LedgerableType) = apply {
                    this.ledgerableType = ledgerableType
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): LedgerAccountCreateRequest =
                    LedgerAccountCreateRequest(
                        checkNotNull(name) { "`name` is required but was not set" },
                        description,
                        checkNotNull(normalBalance) {
                            "`normalBalance` is required but was not set"
                        },
                        checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        currencyExponent,
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LedgerableType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val EXTERNAL_ACCOUNT = LedgerableType(JsonField.of("external_account"))

                    @JvmField
                    val INTERNAL_ACCOUNT = LedgerableType(JsonField.of("internal_account"))

                    @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                enum class Known {
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                }

                enum class Value {
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var hashCode: Int = 0

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata &&
                        this.additionalProperties == other.additionalProperties
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
                }
            }
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }
        }

        /** Required if receiving wire payments. */
        @JsonDeserialize(builder = AddressRequest.Builder::class)
        @NoAutoDetect
        class AddressRequest
        private constructor(
            private val line1: String?,
            private val line2: String?,
            private val locality: String?,
            private val region: String?,
            private val postalCode: String?,
            private val country: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("line1") fun line1(): String? = line1

            @JsonProperty("line2") fun line2(): String? = line2

            /** Locality or City. */
            @JsonProperty("locality") fun locality(): String? = locality

            /** Region or State. */
            @JsonProperty("region") fun region(): String? = region

            /** The postal code of the address. */
            @JsonProperty("postal_code") fun postalCode(): String? = postalCode

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(): String? = country

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AddressRequest &&
                    this.line1 == other.line1 &&
                    this.line2 == other.line2 &&
                    this.locality == other.locality &&
                    this.region == other.region &&
                    this.postalCode == other.postalCode &&
                    this.country == other.country &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            line1,
                            line2,
                            locality,
                            region,
                            postalCode,
                            country,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var line1: String? = null
                private var line2: String? = null
                private var locality: String? = null
                private var region: String? = null
                private var postalCode: String? = null
                private var country: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addressRequest: AddressRequest) = apply {
                    this.line1 = addressRequest.line1
                    this.line2 = addressRequest.line2
                    this.locality = addressRequest.locality
                    this.region = addressRequest.region
                    this.postalCode = addressRequest.postalCode
                    this.country = addressRequest.country
                    additionalProperties(addressRequest.additionalProperties)
                }

                @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

                @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

                /** Locality or City. */
                @JsonProperty("locality")
                fun locality(locality: String) = apply { this.locality = locality }

                /** Region or State. */
                @JsonProperty("region") fun region(region: String) = apply { this.region = region }

                /** The postal code of the address. */
                @JsonProperty("postal_code")
                fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                @JsonProperty("country")
                fun country(country: String) = apply { this.country = country }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AddressRequest =
                    AddressRequest(
                        line1,
                        line2,
                        locality,
                        region,
                        postalCode,
                        country,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        class PartyType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PartyType && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val BUSINESS = PartyType(JsonField.of("business"))

                @JvmField val INDIVIDUAL = PartyType(JsonField.of("individual"))

                @JvmStatic fun of(value: String) = PartyType(JsonField.of(value))
            }

            enum class Known {
                BUSINESS,
                INDIVIDUAL,
            }

            enum class Value {
                BUSINESS,
                INDIVIDUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BUSINESS -> Value.BUSINESS
                    INDIVIDUAL -> Value.INDIVIDUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BUSINESS -> Known.BUSINESS
                    INDIVIDUAL -> Known.INDIVIDUAL
                    else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = RoutingDetail.Builder::class)
        @NoAutoDetect
        class RoutingDetail
        private constructor(
            private val routingNumber: String?,
            private val routingNumberType: RoutingNumberType?,
            private val paymentType: PaymentType?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

            @JsonProperty("routing_number_type")
            fun routingNumberType(): RoutingNumberType? = routingNumberType

            @JsonProperty("payment_type") fun paymentType(): PaymentType? = paymentType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RoutingDetail &&
                    this.routingNumber == other.routingNumber &&
                    this.routingNumberType == other.routingNumberType &&
                    this.paymentType == other.paymentType &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            routingNumber,
                            routingNumberType,
                            paymentType,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var routingNumber: String? = null
                private var routingNumberType: RoutingNumberType? = null
                private var paymentType: PaymentType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(routingDetail: RoutingDetail) = apply {
                    this.routingNumber = routingDetail.routingNumber
                    this.routingNumberType = routingDetail.routingNumberType
                    this.paymentType = routingDetail.paymentType
                    additionalProperties(routingDetail.additionalProperties)
                }

                @JsonProperty("routing_number")
                fun routingNumber(routingNumber: String) = apply {
                    this.routingNumber = routingNumber
                }

                @JsonProperty("routing_number_type")
                fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                    this.routingNumberType = routingNumberType
                }

                @JsonProperty("payment_type")
                fun paymentType(paymentType: PaymentType) = apply { this.paymentType = paymentType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkNotNull(routingNumber) {
                            "`routingNumber` is required but was not set"
                        },
                        checkNotNull(routingNumberType) {
                            "`routingNumberType` is required but was not set"
                        },
                        paymentType,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class RoutingNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RoutingNumberType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ABA = RoutingNumberType(JsonField.of("aba"))

                    @JvmField val AU_BSB = RoutingNumberType(JsonField.of("au_bsb"))

                    @JvmField val BR_CODIGO = RoutingNumberType(JsonField.of("br_codigo"))

                    @JvmField val CA_CPA = RoutingNumberType(JsonField.of("ca_cpa"))

                    @JvmField val CHIPS = RoutingNumberType(JsonField.of("chips"))

                    @JvmField val CNAPS = RoutingNumberType(JsonField.of("cnaps"))

                    @JvmField
                    val DK_INTERBANK_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("dk_interbank_clearing_code"))

                    @JvmField val GB_SORT_CODE = RoutingNumberType(JsonField.of("gb_sort_code"))

                    @JvmField
                    val HK_INTERBANK_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("hk_interbank_clearing_code"))

                    @JvmField
                    val HU_INTERBANK_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("hu_interbank_clearing_code"))

                    @JvmField val IN_IFSC = RoutingNumberType(JsonField.of("in_ifsc"))

                    @JvmField val JP_ZENGIN_CODE = RoutingNumberType(JsonField.of("jp_zengin_code"))

                    @JvmField val MY_BRANCH_CODE = RoutingNumberType(JsonField.of("my_branch_code"))

                    @JvmField
                    val NZ_NATIONAL_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("nz_national_clearing_code"))

                    @JvmField
                    val SE_BANKGIRO_CLEARING_CODE =
                        RoutingNumberType(JsonField.of("se_bankgiro_clearing_code"))

                    @JvmField val SWIFT = RoutingNumberType(JsonField.of("swift"))

                    @JvmStatic fun of(value: String) = RoutingNumberType(JsonField.of(value))
                }

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
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    NZ_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
                }

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
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    NZ_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
                    _UNKNOWN,
                }

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
                        IN_IFSC -> Value.IN_IFSC
                        JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                        NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Value.SWIFT
                        else -> Value._UNKNOWN
                    }

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
                        IN_IFSC -> Known.IN_IFSC
                        JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                        NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Known.SWIFT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RoutingNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class PaymentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PaymentType && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ACH = PaymentType(JsonField.of("ach"))

                    @JvmField val AU_BECS = PaymentType(JsonField.of("au_becs"))

                    @JvmField val BACS = PaymentType(JsonField.of("bacs"))

                    @JvmField val BOOK = PaymentType(JsonField.of("book"))

                    @JvmField val CARD = PaymentType(JsonField.of("card"))

                    @JvmField val CHATS = PaymentType(JsonField.of("chats"))

                    @JvmField val CHECK = PaymentType(JsonField.of("check"))

                    @JvmField val CROSS_BORDER = PaymentType(JsonField.of("cross_border"))

                    @JvmField val DK_NETS = PaymentType(JsonField.of("dk_nets"))

                    @JvmField val EFT = PaymentType(JsonField.of("eft"))

                    @JvmField val HU_ICS = PaymentType(JsonField.of("hu_ics"))

                    @JvmField val INTERAC = PaymentType(JsonField.of("interac"))

                    @JvmField val MASAV = PaymentType(JsonField.of("masav"))

                    @JvmField val NEFT = PaymentType(JsonField.of("neft"))

                    @JvmField val NICS = PaymentType(JsonField.of("nics"))

                    @JvmField val NZ_BECS = PaymentType(JsonField.of("nz_becs"))

                    @JvmField val PROVXCHANGE = PaymentType(JsonField.of("provxchange"))

                    @JvmField val RO_SENT = PaymentType(JsonField.of("ro_sent"))

                    @JvmField val RTP = PaymentType(JsonField.of("rtp"))

                    @JvmField val SG_GIRO = PaymentType(JsonField.of("sg_giro"))

                    @JvmField val SE_BANKGIROT = PaymentType(JsonField.of("se_bankgirot"))

                    @JvmField val SEN = PaymentType(JsonField.of("sen"))

                    @JvmField val SEPA = PaymentType(JsonField.of("sepa"))

                    @JvmField val SIC = PaymentType(JsonField.of("sic"))

                    @JvmField val SIGNET = PaymentType(JsonField.of("signet"))

                    @JvmField val WIRE = PaymentType(JsonField.of("wire"))

                    @JvmField val ZENGIN = PaymentType(JsonField.of("zengin"))

                    @JvmStatic fun of(value: String) = PaymentType(JsonField.of(value))
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
                    SG_GIRO,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
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
                    SG_GIRO,
                    SE_BANKGIROT,
                    SEN,
                    SEPA,
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
                        SG_GIRO -> Value.SG_GIRO
                        SE_BANKGIROT -> Value.SE_BANKGIROT
                        SEN -> Value.SEN
                        SEPA -> Value.SEPA
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
                        SG_GIRO -> Known.SG_GIRO
                        SE_BANKGIROT -> Known.SE_BANKGIROT
                        SEN -> Known.SEN
                        SEPA -> Known.SEPA
                        SIC -> Known.SIC
                        SIGNET -> Known.SIGNET
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }
    }
}
