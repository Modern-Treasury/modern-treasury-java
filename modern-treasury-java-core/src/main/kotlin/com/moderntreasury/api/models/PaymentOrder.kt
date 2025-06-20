// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.BaseDeserializer
import com.moderntreasury.api.core.BaseSerializer
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.allMaxBy
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PaymentOrder
private constructor(
    private val id: JsonField<String>,
    private val accounting: JsonField<Accounting>,
    private val accountingCategoryId: JsonField<String>,
    private val accountingLedgerClassId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val chargeBearer: JsonField<ChargeBearer>,
    private val counterpartyId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val currentReturn: JsonField<ReturnObject>,
    private val description: JsonField<String>,
    private val direction: JsonField<Direction>,
    private val effectiveDate: JsonField<LocalDate>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val externalId: JsonField<String>,
    private val foreignExchangeContract: JsonField<String>,
    private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>,
    private val foreignExchangeRate: JsonField<ForeignExchangeRate>,
    private val ledgerTransactionId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val nsfProtected: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val originatingAccountId: JsonField<String>,
    private val originatingPartyName: JsonField<String>,
    private val priority: JsonField<Priority>,
    private val processAfter: JsonField<OffsetDateTime>,
    private val purpose: JsonField<String>,
    private val receivingAccountId: JsonField<String>,
    private val receivingAccountType: JsonField<ReceivingAccountType>,
    private val referenceNumbers: JsonField<List<PaymentReference>>,
    private val remittanceInformation: JsonField<String>,
    private val sendRemittanceAdvice: JsonField<Boolean>,
    private val statementDescriptor: JsonField<String>,
    private val status: JsonField<Status>,
    private val subtype: JsonField<PaymentOrderSubtype>,
    private val transactionIds: JsonField<List<String>>,
    private val type: JsonField<PaymentOrderType>,
    private val ultimateOriginatingAccount: JsonField<UltimateOriginatingAccount>,
    private val ultimateOriginatingAccountId: JsonField<String>,
    private val ultimateOriginatingAccountType: JsonField<UltimateOriginatingAccountType>,
    private val ultimateOriginatingPartyIdentifier: JsonField<String>,
    private val ultimateOriginatingPartyName: JsonField<String>,
    private val ultimateReceivingPartyIdentifier: JsonField<String>,
    private val ultimateReceivingPartyName: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vendorAttributes: JsonValue,
    private val vendorFailureReason: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounting")
        @ExcludeMissing
        accounting: JsonField<Accounting> = JsonMissing.of(),
        @JsonProperty("accounting_category_id")
        @ExcludeMissing
        accountingCategoryId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounting_ledger_class_id")
        @ExcludeMissing
        accountingLedgerClassId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("charge_bearer")
        @ExcludeMissing
        chargeBearer: JsonField<ChargeBearer> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("current_return")
        @ExcludeMissing
        currentReturn: JsonField<ReturnObject> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        direction: JsonField<Direction> = JsonMissing.of(),
        @JsonProperty("effective_date")
        @ExcludeMissing
        effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_contract")
        @ExcludeMissing
        foreignExchangeContract: JsonField<String> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_indicator")
        @ExcludeMissing
        foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> = JsonMissing.of(),
        @JsonProperty("foreign_exchange_rate")
        @ExcludeMissing
        foreignExchangeRate: JsonField<ForeignExchangeRate> = JsonMissing.of(),
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        ledgerTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("nsf_protected")
        @ExcludeMissing
        nsfProtected: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        originatingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originating_party_name")
        @ExcludeMissing
        originatingPartyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority") @ExcludeMissing priority: JsonField<Priority> = JsonMissing.of(),
        @JsonProperty("process_after")
        @ExcludeMissing
        processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("purpose") @ExcludeMissing purpose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        receivingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("receiving_account_type")
        @ExcludeMissing
        receivingAccountType: JsonField<ReceivingAccountType> = JsonMissing.of(),
        @JsonProperty("reference_numbers")
        @ExcludeMissing
        referenceNumbers: JsonField<List<PaymentReference>> = JsonMissing.of(),
        @JsonProperty("remittance_information")
        @ExcludeMissing
        remittanceInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("send_remittance_advice")
        @ExcludeMissing
        sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        statementDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subtype")
        @ExcludeMissing
        subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of(),
        @JsonProperty("transaction_ids")
        @ExcludeMissing
        transactionIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<PaymentOrderType> = JsonMissing.of(),
        @JsonProperty("ultimate_originating_account")
        @ExcludeMissing
        ultimateOriginatingAccount: JsonField<UltimateOriginatingAccount> = JsonMissing.of(),
        @JsonProperty("ultimate_originating_account_id")
        @ExcludeMissing
        ultimateOriginatingAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ultimate_originating_account_type")
        @ExcludeMissing
        ultimateOriginatingAccountType: JsonField<UltimateOriginatingAccountType> =
            JsonMissing.of(),
        @JsonProperty("ultimate_originating_party_identifier")
        @ExcludeMissing
        ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ultimate_originating_party_name")
        @ExcludeMissing
        ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ultimate_receiving_party_identifier")
        @ExcludeMissing
        ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ultimate_receiving_party_name")
        @ExcludeMissing
        ultimateReceivingPartyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vendor_attributes")
        @ExcludeMissing
        vendorAttributes: JsonValue = JsonMissing.of(),
        @JsonProperty("vendor_failure_reason")
        @ExcludeMissing
        vendorFailureReason: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accounting,
        accountingCategoryId,
        accountingLedgerClassId,
        amount,
        chargeBearer,
        counterpartyId,
        createdAt,
        currency,
        currentReturn,
        description,
        direction,
        effectiveDate,
        expiresAt,
        externalId,
        foreignExchangeContract,
        foreignExchangeIndicator,
        foreignExchangeRate,
        ledgerTransactionId,
        liveMode,
        metadata,
        nsfProtected,
        object_,
        originatingAccountId,
        originatingPartyName,
        priority,
        processAfter,
        purpose,
        receivingAccountId,
        receivingAccountType,
        referenceNumbers,
        remittanceInformation,
        sendRemittanceAdvice,
        statementDescriptor,
        status,
        subtype,
        transactionIds,
        type,
        ultimateOriginatingAccount,
        ultimateOriginatingAccountId,
        ultimateOriginatingAccountType,
        ultimateOriginatingPartyIdentifier,
        ultimateOriginatingPartyName,
        ultimateReceivingPartyIdentifier,
        ultimateReceivingPartyName,
        updatedAt,
        vendorAttributes,
        vendorFailureReason,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accounting(): Accounting = accounting.getRequired("accounting")

    /**
     * The ID of one of your accounting categories. Note that these will only be accessible if your
     * accounting system has been connected.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun accountingCategoryId(): Optional<String> =
        accountingCategoryId.getOptional("accounting_category_id")

    /**
     * The ID of one of your accounting ledger classes. Note that these will only be accessible if
     * your accounting system has been connected.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun accountingLedgerClassId(): Optional<String> =
        accountingLedgerClassId.getOptional("accounting_ledger_class_id")

    /**
     * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000 (cents).
     * For RTP, the maximum amount allowed by the network is $100,000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The party that will pay the fees for the payment order. Only applies to wire payment orders.
     * Can be one of shared, sender, or receiver, which correspond respectively with the SWIFT 71A
     * values `SHA`, `OUR`, `BEN`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun chargeBearer(): Optional<ChargeBearer> = chargeBearer.getOptional("charge_bearer")

    /**
     * If the payment order is tied to a specific Counterparty, their id will appear, otherwise
     * `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyId(): Optional<String> = counterpartyId.getOptional("counterparty_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Defaults to the currency of the originating account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * If the payment order's status is `returned`, this will include the return object's data.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currentReturn(): Optional<ReturnObject> = currentReturn.getOptional("current_return")

    /**
     * An optional description for internal use.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun direction(): Direction = direction.getRequired("direction")

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /**
     * RFP payments require an expires_at. This value must be past the effective_date.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * An optional user-defined 180 character unique identifier.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = externalId.getOptional("external_id")

    /**
     * If present, indicates a specific foreign exchange contract number that has been generated by
     * your financial institution.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun foreignExchangeContract(): Optional<String> =
        foreignExchangeContract.getOptional("foreign_exchange_contract")

    /**
     * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
     * `fixed_to_variable`, or `null` if the payment order currency matches the originating account
     * currency.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun foreignExchangeIndicator(): Optional<ForeignExchangeIndicator> =
        foreignExchangeIndicator.getOptional("foreign_exchange_indicator")

    /**
     * Associated serialized foreign exchange rate information.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun foreignExchangeRate(): Optional<ForeignExchangeRate> =
        foreignExchangeRate.getOptional("foreign_exchange_rate")

    /**
     * The ID of the ledger transaction linked to the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerTransactionId(): Optional<String> =
        ledgerTransactionId.getOptional("ledger_transaction_id")

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
     * A boolean to determine if NSF Protection is enabled for this payment order. Note that this
     * setting must also be turned on in your organization settings page.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nsfProtected(): Boolean = nsfProtected.getRequired("nsf_protected")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The ID of one of your organization's internal accounts.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatingAccountId(): String = originatingAccountId.getRequired("originating_account_id")

    /**
     * If present, this will replace your default company name on receiver's bank statement. This
     * field can only be used for ACH payments currently. For ACH, only the first 16 characters of
     * this string will be used. Any additional characters will be truncated.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatingPartyName(): Optional<String> =
        originatingPartyName.getOptional("originating_party_name")

    /**
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun priority(): Priority = priority.getRequired("priority")

    /**
     * If present, Modern Treasury will not process the payment until after this time. If
     * `process_after` is past the cutoff for `effective_date`, `process_after` will take precedence
     * and `effective_date` will automatically update to reflect the earliest possible sending date
     * after `process_after`. Format is ISO8601 timestamp.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun processAfter(): Optional<OffsetDateTime> = processAfter.getOptional("process_after")

    /**
     * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt" field
     * in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be attached to
     * the payment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purpose(): Optional<String> = purpose.getOptional("purpose")

    /**
     * The receiving account ID. Can be an `external_account` or `internal_account`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun receivingAccountId(): String = receivingAccountId.getRequired("receiving_account_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun receivingAccountType(): ReceivingAccountType =
        receivingAccountType.getRequired("receiving_account_type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceNumbers(): List<PaymentReference> =
        referenceNumbers.getRequired("reference_numbers")

    /**
     * For `ach`, this field will be passed through on an addenda record. For `wire` payments the
     * field will be passed through as the "Originator to Beneficiary Information", also known as
     * OBI or Fedwire tag 6000.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remittanceInformation(): Optional<String> =
        remittanceInformation.getOptional("remittance_information")

    /**
     * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
     * `send_remittance_advice` on the Counterparty is used.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sendRemittanceAdvice(): Optional<Boolean> =
        sendRemittanceAdvice.getOptional("send_remittance_advice")

    /**
     * An optional descriptor which will appear in the receiver's statement. For `check` payments
     * this field will be used as the memo line. For `ach` the maximum length is 10 characters. Note
     * that for ACH payments, the name on your bank account will be included automatically by the
     * bank, so you can use the characters for other useful information. For `eft` the maximum
     * length is 15 characters.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun statementDescriptor(): Optional<String> =
        statementDescriptor.getOptional("statement_descriptor")

    /**
     * The current status of the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * An additional layer of classification for the type of payment order you are doing. This field
     * is only used for `ach` payment orders currently. For `ach` payment orders, the `subtype`
     * represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and
     * `TEL`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subtype(): Optional<PaymentOrderSubtype> = subtype.getOptional("subtype")

    /**
     * The IDs of all the transactions associated to this payment order. Usually, you will only have
     * a single transaction ID. However, if a payment order initially results in a Return, but gets
     * redrafted and is later successfully completed, it can have many transactions.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionIds(): List<String> = transactionIds.getRequired("transaction_ids")

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): PaymentOrderType = type.getRequired("type")

    /**
     * The account to which the originating of this payment should be attributed to. Can be a
     * `virtual_account` or `internal_account`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingAccount(): Optional<UltimateOriginatingAccount> =
        ultimateOriginatingAccount.getOptional("ultimate_originating_account")

    /**
     * The ultimate originating account ID. Can be a `virtual_account` or `internal_account`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingAccountId(): Optional<String> =
        ultimateOriginatingAccountId.getOptional("ultimate_originating_account_id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingAccountType(): Optional<UltimateOriginatingAccountType> =
        ultimateOriginatingAccountType.getOptional("ultimate_originating_account_type")

    /**
     * Identifier of the ultimate originator of the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingPartyIdentifier(): Optional<String> =
        ultimateOriginatingPartyIdentifier.getOptional("ultimate_originating_party_identifier")

    /**
     * Name of the ultimate originator of the payment order.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateOriginatingPartyName(): Optional<String> =
        ultimateOriginatingPartyName.getOptional("ultimate_originating_party_name")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateReceivingPartyIdentifier(): Optional<String> =
        ultimateReceivingPartyIdentifier.getOptional("ultimate_receiving_party_identifier")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ultimateReceivingPartyName(): Optional<String> =
        ultimateReceivingPartyName.getOptional("ultimate_receiving_party_name")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Additional vendor specific fields for this payment. Data must be represented as key-value
     * pairs.
     */
    @JsonProperty("vendor_attributes")
    @ExcludeMissing
    fun _vendorAttributes(): JsonValue = vendorAttributes

    /**
     * This field will be populated if a vendor failure occurs. Logic shouldn't be built on its
     * value as it is free-form.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun vendorFailureReason(): Optional<String> =
        vendorFailureReason.getOptional("vendor_failure_reason")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accounting].
     *
     * Unlike [accounting], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accounting")
    @ExcludeMissing
    fun _accounting(): JsonField<Accounting> = accounting

    /**
     * Returns the raw JSON value of [accountingCategoryId].
     *
     * Unlike [accountingCategoryId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("accounting_category_id")
    @ExcludeMissing
    fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

    /**
     * Returns the raw JSON value of [accountingLedgerClassId].
     *
     * Unlike [accountingLedgerClassId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("accounting_ledger_class_id")
    @ExcludeMissing
    fun _accountingLedgerClassId(): JsonField<String> = accountingLedgerClassId

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [chargeBearer].
     *
     * Unlike [chargeBearer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("charge_bearer")
    @ExcludeMissing
    fun _chargeBearer(): JsonField<ChargeBearer> = chargeBearer

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    fun _counterpartyId(): JsonField<String> = counterpartyId

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
     * Returns the raw JSON value of [currentReturn].
     *
     * Unlike [currentReturn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_return")
    @ExcludeMissing
    fun _currentReturn(): JsonField<ReturnObject> = currentReturn

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [direction].
     *
     * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<Direction> = direction

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_date")
    @ExcludeMissing
    fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [foreignExchangeContract].
     *
     * Unlike [foreignExchangeContract], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("foreign_exchange_contract")
    @ExcludeMissing
    fun _foreignExchangeContract(): JsonField<String> = foreignExchangeContract

    /**
     * Returns the raw JSON value of [foreignExchangeIndicator].
     *
     * Unlike [foreignExchangeIndicator], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("foreign_exchange_indicator")
    @ExcludeMissing
    fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> = foreignExchangeIndicator

    /**
     * Returns the raw JSON value of [foreignExchangeRate].
     *
     * Unlike [foreignExchangeRate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("foreign_exchange_rate")
    @ExcludeMissing
    fun _foreignExchangeRate(): JsonField<ForeignExchangeRate> = foreignExchangeRate

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
     * Returns the raw JSON value of [nsfProtected].
     *
     * Unlike [nsfProtected], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nsf_protected")
    @ExcludeMissing
    fun _nsfProtected(): JsonField<Boolean> = nsfProtected

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [originatingAccountId].
     *
     * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("originating_account_id")
    @ExcludeMissing
    fun _originatingAccountId(): JsonField<String> = originatingAccountId

    /**
     * Returns the raw JSON value of [originatingPartyName].
     *
     * Unlike [originatingPartyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("originating_party_name")
    @ExcludeMissing
    fun _originatingPartyName(): JsonField<String> = originatingPartyName

    /**
     * Returns the raw JSON value of [priority].
     *
     * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Priority> = priority

    /**
     * Returns the raw JSON value of [processAfter].
     *
     * Unlike [processAfter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("process_after")
    @ExcludeMissing
    fun _processAfter(): JsonField<OffsetDateTime> = processAfter

    /**
     * Returns the raw JSON value of [purpose].
     *
     * Unlike [purpose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

    /**
     * Returns the raw JSON value of [receivingAccountId].
     *
     * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiving_account_id")
    @ExcludeMissing
    fun _receivingAccountId(): JsonField<String> = receivingAccountId

    /**
     * Returns the raw JSON value of [receivingAccountType].
     *
     * Unlike [receivingAccountType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("receiving_account_type")
    @ExcludeMissing
    fun _receivingAccountType(): JsonField<ReceivingAccountType> = receivingAccountType

    /**
     * Returns the raw JSON value of [referenceNumbers].
     *
     * Unlike [referenceNumbers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_numbers")
    @ExcludeMissing
    fun _referenceNumbers(): JsonField<List<PaymentReference>> = referenceNumbers

    /**
     * Returns the raw JSON value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation(): JsonField<String> = remittanceInformation

    /**
     * Returns the raw JSON value of [sendRemittanceAdvice].
     *
     * Unlike [sendRemittanceAdvice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("send_remittance_advice")
    @ExcludeMissing
    fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

    /**
     * Returns the raw JSON value of [statementDescriptor].
     *
     * Unlike [statementDescriptor], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor(): JsonField<String> = statementDescriptor

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subtype].
     *
     * Unlike [subtype], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtype")
    @ExcludeMissing
    fun _subtype(): JsonField<PaymentOrderSubtype> = subtype

    /**
     * Returns the raw JSON value of [transactionIds].
     *
     * Unlike [transactionIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_ids")
    @ExcludeMissing
    fun _transactionIds(): JsonField<List<String>> = transactionIds

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentOrderType> = type

    /**
     * Returns the raw JSON value of [ultimateOriginatingAccount].
     *
     * Unlike [ultimateOriginatingAccount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ultimate_originating_account")
    @ExcludeMissing
    fun _ultimateOriginatingAccount(): JsonField<UltimateOriginatingAccount> =
        ultimateOriginatingAccount

    /**
     * Returns the raw JSON value of [ultimateOriginatingAccountId].
     *
     * Unlike [ultimateOriginatingAccountId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ultimate_originating_account_id")
    @ExcludeMissing
    fun _ultimateOriginatingAccountId(): JsonField<String> = ultimateOriginatingAccountId

    /**
     * Returns the raw JSON value of [ultimateOriginatingAccountType].
     *
     * Unlike [ultimateOriginatingAccountType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ultimate_originating_account_type")
    @ExcludeMissing
    fun _ultimateOriginatingAccountType(): JsonField<UltimateOriginatingAccountType> =
        ultimateOriginatingAccountType

    /**
     * Returns the raw JSON value of [ultimateOriginatingPartyIdentifier].
     *
     * Unlike [ultimateOriginatingPartyIdentifier], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("ultimate_originating_party_identifier")
    @ExcludeMissing
    fun _ultimateOriginatingPartyIdentifier(): JsonField<String> =
        ultimateOriginatingPartyIdentifier

    /**
     * Returns the raw JSON value of [ultimateOriginatingPartyName].
     *
     * Unlike [ultimateOriginatingPartyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ultimate_originating_party_name")
    @ExcludeMissing
    fun _ultimateOriginatingPartyName(): JsonField<String> = ultimateOriginatingPartyName

    /**
     * Returns the raw JSON value of [ultimateReceivingPartyIdentifier].
     *
     * Unlike [ultimateReceivingPartyIdentifier], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ultimate_receiving_party_identifier")
    @ExcludeMissing
    fun _ultimateReceivingPartyIdentifier(): JsonField<String> = ultimateReceivingPartyIdentifier

    /**
     * Returns the raw JSON value of [ultimateReceivingPartyName].
     *
     * Unlike [ultimateReceivingPartyName], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("ultimate_receiving_party_name")
    @ExcludeMissing
    fun _ultimateReceivingPartyName(): JsonField<String> = ultimateReceivingPartyName

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [vendorFailureReason].
     *
     * Unlike [vendorFailureReason], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("vendor_failure_reason")
    @ExcludeMissing
    fun _vendorFailureReason(): JsonField<String> = vendorFailureReason

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
         * Returns a mutable builder for constructing an instance of [PaymentOrder].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accounting()
         * .accountingCategoryId()
         * .accountingLedgerClassId()
         * .amount()
         * .chargeBearer()
         * .counterpartyId()
         * .createdAt()
         * .currency()
         * .currentReturn()
         * .description()
         * .direction()
         * .effectiveDate()
         * .expiresAt()
         * .externalId()
         * .foreignExchangeContract()
         * .foreignExchangeIndicator()
         * .foreignExchangeRate()
         * .ledgerTransactionId()
         * .liveMode()
         * .metadata()
         * .nsfProtected()
         * .object_()
         * .originatingAccountId()
         * .originatingPartyName()
         * .priority()
         * .processAfter()
         * .purpose()
         * .receivingAccountId()
         * .receivingAccountType()
         * .referenceNumbers()
         * .remittanceInformation()
         * .sendRemittanceAdvice()
         * .statementDescriptor()
         * .status()
         * .subtype()
         * .transactionIds()
         * .type()
         * .ultimateOriginatingAccount()
         * .ultimateOriginatingAccountId()
         * .ultimateOriginatingAccountType()
         * .ultimateOriginatingPartyIdentifier()
         * .ultimateOriginatingPartyName()
         * .ultimateReceivingPartyIdentifier()
         * .ultimateReceivingPartyName()
         * .updatedAt()
         * .vendorAttributes()
         * .vendorFailureReason()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentOrder]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accounting: JsonField<Accounting>? = null
        private var accountingCategoryId: JsonField<String>? = null
        private var accountingLedgerClassId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var chargeBearer: JsonField<ChargeBearer>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var currentReturn: JsonField<ReturnObject>? = null
        private var description: JsonField<String>? = null
        private var direction: JsonField<Direction>? = null
        private var effectiveDate: JsonField<LocalDate>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var externalId: JsonField<String>? = null
        private var foreignExchangeContract: JsonField<String>? = null
        private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>? = null
        private var foreignExchangeRate: JsonField<ForeignExchangeRate>? = null
        private var ledgerTransactionId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var nsfProtected: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var originatingAccountId: JsonField<String>? = null
        private var originatingPartyName: JsonField<String>? = null
        private var priority: JsonField<Priority>? = null
        private var processAfter: JsonField<OffsetDateTime>? = null
        private var purpose: JsonField<String>? = null
        private var receivingAccountId: JsonField<String>? = null
        private var receivingAccountType: JsonField<ReceivingAccountType>? = null
        private var referenceNumbers: JsonField<MutableList<PaymentReference>>? = null
        private var remittanceInformation: JsonField<String>? = null
        private var sendRemittanceAdvice: JsonField<Boolean>? = null
        private var statementDescriptor: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var subtype: JsonField<PaymentOrderSubtype>? = null
        private var transactionIds: JsonField<MutableList<String>>? = null
        private var type: JsonField<PaymentOrderType>? = null
        private var ultimateOriginatingAccount: JsonField<UltimateOriginatingAccount>? = null
        private var ultimateOriginatingAccountId: JsonField<String>? = null
        private var ultimateOriginatingAccountType: JsonField<UltimateOriginatingAccountType>? =
            null
        private var ultimateOriginatingPartyIdentifier: JsonField<String>? = null
        private var ultimateOriginatingPartyName: JsonField<String>? = null
        private var ultimateReceivingPartyIdentifier: JsonField<String>? = null
        private var ultimateReceivingPartyName: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vendorAttributes: JsonValue? = null
        private var vendorFailureReason: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentOrder: PaymentOrder) = apply {
            id = paymentOrder.id
            accounting = paymentOrder.accounting
            accountingCategoryId = paymentOrder.accountingCategoryId
            accountingLedgerClassId = paymentOrder.accountingLedgerClassId
            amount = paymentOrder.amount
            chargeBearer = paymentOrder.chargeBearer
            counterpartyId = paymentOrder.counterpartyId
            createdAt = paymentOrder.createdAt
            currency = paymentOrder.currency
            currentReturn = paymentOrder.currentReturn
            description = paymentOrder.description
            direction = paymentOrder.direction
            effectiveDate = paymentOrder.effectiveDate
            expiresAt = paymentOrder.expiresAt
            externalId = paymentOrder.externalId
            foreignExchangeContract = paymentOrder.foreignExchangeContract
            foreignExchangeIndicator = paymentOrder.foreignExchangeIndicator
            foreignExchangeRate = paymentOrder.foreignExchangeRate
            ledgerTransactionId = paymentOrder.ledgerTransactionId
            liveMode = paymentOrder.liveMode
            metadata = paymentOrder.metadata
            nsfProtected = paymentOrder.nsfProtected
            object_ = paymentOrder.object_
            originatingAccountId = paymentOrder.originatingAccountId
            originatingPartyName = paymentOrder.originatingPartyName
            priority = paymentOrder.priority
            processAfter = paymentOrder.processAfter
            purpose = paymentOrder.purpose
            receivingAccountId = paymentOrder.receivingAccountId
            receivingAccountType = paymentOrder.receivingAccountType
            referenceNumbers = paymentOrder.referenceNumbers.map { it.toMutableList() }
            remittanceInformation = paymentOrder.remittanceInformation
            sendRemittanceAdvice = paymentOrder.sendRemittanceAdvice
            statementDescriptor = paymentOrder.statementDescriptor
            status = paymentOrder.status
            subtype = paymentOrder.subtype
            transactionIds = paymentOrder.transactionIds.map { it.toMutableList() }
            type = paymentOrder.type
            ultimateOriginatingAccount = paymentOrder.ultimateOriginatingAccount
            ultimateOriginatingAccountId = paymentOrder.ultimateOriginatingAccountId
            ultimateOriginatingAccountType = paymentOrder.ultimateOriginatingAccountType
            ultimateOriginatingPartyIdentifier = paymentOrder.ultimateOriginatingPartyIdentifier
            ultimateOriginatingPartyName = paymentOrder.ultimateOriginatingPartyName
            ultimateReceivingPartyIdentifier = paymentOrder.ultimateReceivingPartyIdentifier
            ultimateReceivingPartyName = paymentOrder.ultimateReceivingPartyName
            updatedAt = paymentOrder.updatedAt
            vendorAttributes = paymentOrder.vendorAttributes
            vendorFailureReason = paymentOrder.vendorFailureReason
            additionalProperties = paymentOrder.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

        /**
         * Sets [Builder.accounting] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accounting] with a well-typed [Accounting] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accounting(accounting: JsonField<Accounting>) = apply { this.accounting = accounting }

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(accountingCategoryId: String?) =
            accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

        /**
         * Alias for calling [Builder.accountingCategoryId] with
         * `accountingCategoryId.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(accountingCategoryId: Optional<String>) =
            accountingCategoryId(accountingCategoryId.getOrNull())

        /**
         * Sets [Builder.accountingCategoryId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingCategoryId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
            this.accountingCategoryId = accountingCategoryId
        }

        /**
         * The ID of one of your accounting ledger classes. Note that these will only be accessible
         * if your accounting system has been connected.
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(accountingLedgerClassId: String?) =
            accountingLedgerClassId(JsonField.ofNullable(accountingLedgerClassId))

        /**
         * Alias for calling [Builder.accountingLedgerClassId] with
         * `accountingLedgerClassId.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(accountingLedgerClassId: Optional<String>) =
            accountingLedgerClassId(accountingLedgerClassId.getOrNull())

        /**
         * Sets [Builder.accountingLedgerClassId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingLedgerClassId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
            this.accountingLedgerClassId = accountingLedgerClassId
        }

        /**
         * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
         * (cents). For RTP, the maximum amount allowed by the network is $100,000.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The party that will pay the fees for the payment order. Only applies to wire payment
         * orders. Can be one of shared, sender, or receiver, which correspond respectively with the
         * SWIFT 71A values `SHA`, `OUR`, `BEN`.
         */
        fun chargeBearer(chargeBearer: ChargeBearer?) =
            chargeBearer(JsonField.ofNullable(chargeBearer))

        /** Alias for calling [Builder.chargeBearer] with `chargeBearer.orElse(null)`. */
        fun chargeBearer(chargeBearer: Optional<ChargeBearer>) =
            chargeBearer(chargeBearer.getOrNull())

        /**
         * Sets [Builder.chargeBearer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chargeBearer] with a well-typed [ChargeBearer] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
            this.chargeBearer = chargeBearer
        }

        /**
         * If the payment order is tied to a specific Counterparty, their id will appear, otherwise
         * `null`.
         */
        fun counterpartyId(counterpartyId: String?) =
            counterpartyId(JsonField.ofNullable(counterpartyId))

        /** Alias for calling [Builder.counterpartyId] with `counterpartyId.orElse(null)`. */
        fun counterpartyId(counterpartyId: Optional<String>) =
            counterpartyId(counterpartyId.getOrNull())

        /**
         * Sets [Builder.counterpartyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Defaults to the currency of the originating account. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * If the payment order's status is `returned`, this will include the return object's data.
         */
        fun currentReturn(currentReturn: ReturnObject?) =
            currentReturn(JsonField.ofNullable(currentReturn))

        /** Alias for calling [Builder.currentReturn] with `currentReturn.orElse(null)`. */
        fun currentReturn(currentReturn: Optional<ReturnObject>) =
            currentReturn(currentReturn.getOrNull())

        /**
         * Sets [Builder.currentReturn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentReturn] with a well-typed [ReturnObject] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun currentReturn(currentReturn: JsonField<ReturnObject>) = apply {
            this.currentReturn = currentReturn
        }

        /** An optional description for internal use. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
         * `credit` moves money from your account to someone else's. A `debit` pulls money from
         * someone else's account to your own. Note that wire, rtp, and check payments will always
         * be `credit`.
         */
        fun direction(direction: Direction) = direction(JsonField.of(direction))

        /**
         * Sets [Builder.direction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.direction] with a well-typed [Direction] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun direction(direction: JsonField<Direction>) = apply { this.direction = direction }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /** RFP payments require an expires_at. This value must be past the effective_date. */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** An optional user-defined 180 character unique identifier. */
        fun externalId(externalId: String?) = externalId(JsonField.ofNullable(externalId))

        /** Alias for calling [Builder.externalId] with `externalId.orElse(null)`. */
        fun externalId(externalId: Optional<String>) = externalId(externalId.getOrNull())

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * If present, indicates a specific foreign exchange contract number that has been generated
         * by your financial institution.
         */
        fun foreignExchangeContract(foreignExchangeContract: String?) =
            foreignExchangeContract(JsonField.ofNullable(foreignExchangeContract))

        /**
         * Alias for calling [Builder.foreignExchangeContract] with
         * `foreignExchangeContract.orElse(null)`.
         */
        fun foreignExchangeContract(foreignExchangeContract: Optional<String>) =
            foreignExchangeContract(foreignExchangeContract.getOrNull())

        /**
         * Sets [Builder.foreignExchangeContract] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeContract] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
            this.foreignExchangeContract = foreignExchangeContract
        }

        /**
         * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
         * `fixed_to_variable`, or `null` if the payment order currency matches the originating
         * account currency.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
            foreignExchangeIndicator(JsonField.ofNullable(foreignExchangeIndicator))

        /**
         * Alias for calling [Builder.foreignExchangeIndicator] with
         * `foreignExchangeIndicator.orElse(null)`.
         */
        fun foreignExchangeIndicator(foreignExchangeIndicator: Optional<ForeignExchangeIndicator>) =
            foreignExchangeIndicator(foreignExchangeIndicator.getOrNull())

        /**
         * Sets [Builder.foreignExchangeIndicator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeIndicator] with a well-typed
         * [ForeignExchangeIndicator] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun foreignExchangeIndicator(
            foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
        ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

        /** Associated serialized foreign exchange rate information. */
        fun foreignExchangeRate(foreignExchangeRate: ForeignExchangeRate?) =
            foreignExchangeRate(JsonField.ofNullable(foreignExchangeRate))

        /**
         * Alias for calling [Builder.foreignExchangeRate] with `foreignExchangeRate.orElse(null)`.
         */
        fun foreignExchangeRate(foreignExchangeRate: Optional<ForeignExchangeRate>) =
            foreignExchangeRate(foreignExchangeRate.getOrNull())

        /**
         * Sets [Builder.foreignExchangeRate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.foreignExchangeRate] with a well-typed
         * [ForeignExchangeRate] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun foreignExchangeRate(foreignExchangeRate: JsonField<ForeignExchangeRate>) = apply {
            this.foreignExchangeRate = foreignExchangeRate
        }

        /** The ID of the ledger transaction linked to the payment order. */
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

        /**
         * A boolean to determine if NSF Protection is enabled for this payment order. Note that
         * this setting must also be turned on in your organization settings page.
         */
        fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

        /**
         * Sets [Builder.nsfProtected] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nsfProtected] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
            this.nsfProtected = nsfProtected
        }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The ID of one of your organization's internal accounts. */
        fun originatingAccountId(originatingAccountId: String) =
            originatingAccountId(JsonField.of(originatingAccountId))

        /**
         * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * If present, this will replace your default company name on receiver's bank statement.
         * This field can only be used for ACH payments currently. For ACH, only the first 16
         * characters of this string will be used. Any additional characters will be truncated.
         */
        fun originatingPartyName(originatingPartyName: String?) =
            originatingPartyName(JsonField.ofNullable(originatingPartyName))

        /**
         * Alias for calling [Builder.originatingPartyName] with
         * `originatingPartyName.orElse(null)`.
         */
        fun originatingPartyName(originatingPartyName: Optional<String>) =
            originatingPartyName(originatingPartyName.getOrNull())

        /**
         * Sets [Builder.originatingPartyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingPartyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
            this.originatingPartyName = originatingPartyName
        }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = priority(JsonField.of(priority))

        /**
         * Sets [Builder.priority] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priority] with a well-typed [Priority] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

        /**
         * If present, Modern Treasury will not process the payment until after this time. If
         * `process_after` is past the cutoff for `effective_date`, `process_after` will take
         * precedence and `effective_date` will automatically update to reflect the earliest
         * possible sending date after `process_after`. Format is ISO8601 timestamp.
         */
        fun processAfter(processAfter: OffsetDateTime?) =
            processAfter(JsonField.ofNullable(processAfter))

        /** Alias for calling [Builder.processAfter] with `processAfter.orElse(null)`. */
        fun processAfter(processAfter: Optional<OffsetDateTime>) =
            processAfter(processAfter.getOrNull())

        /**
         * Sets [Builder.processAfter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processAfter] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
            this.processAfter = processAfter
        }

        /**
         * For `wire`, this is usually the purpose which is transmitted via the "InstrForDbtrAgt"
         * field in the ISO20022 file. For `eft`, this field is the 3 digit CPA Code that will be
         * attached to the payment.
         */
        fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

        /** Alias for calling [Builder.purpose] with `purpose.orElse(null)`. */
        fun purpose(purpose: Optional<String>) = purpose(purpose.getOrNull())

        /**
         * Sets [Builder.purpose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purpose] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

        /** The receiving account ID. Can be an `external_account` or `internal_account`. */
        fun receivingAccountId(receivingAccountId: String) =
            receivingAccountId(JsonField.of(receivingAccountId))

        /**
         * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            this.receivingAccountId = receivingAccountId
        }

        fun receivingAccountType(receivingAccountType: ReceivingAccountType) =
            receivingAccountType(JsonField.of(receivingAccountType))

        /**
         * Sets [Builder.receivingAccountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingAccountType] with a well-typed
         * [ReceivingAccountType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun receivingAccountType(receivingAccountType: JsonField<ReceivingAccountType>) = apply {
            this.receivingAccountType = receivingAccountType
        }

        fun referenceNumbers(referenceNumbers: List<PaymentReference>) =
            referenceNumbers(JsonField.of(referenceNumbers))

        /**
         * Sets [Builder.referenceNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceNumbers] with a well-typed
         * `List<PaymentReference>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun referenceNumbers(referenceNumbers: JsonField<List<PaymentReference>>) = apply {
            this.referenceNumbers = referenceNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentReference] to [referenceNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReferenceNumber(referenceNumber: PaymentReference) = apply {
            referenceNumbers =
                (referenceNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("referenceNumbers", it).add(referenceNumber)
                }
        }

        /**
         * For `ach`, this field will be passed through on an addenda record. For `wire` payments
         * the field will be passed through as the "Originator to Beneficiary Information", also
         * known as OBI or Fedwire tag 6000.
         */
        fun remittanceInformation(remittanceInformation: String?) =
            remittanceInformation(JsonField.ofNullable(remittanceInformation))

        /**
         * Alias for calling [Builder.remittanceInformation] with
         * `remittanceInformation.orElse(null)`.
         */
        fun remittanceInformation(remittanceInformation: Optional<String>) =
            remittanceInformation(remittanceInformation.getOrNull())

        /**
         * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /**
         * Send an email to the counterparty when the payment order is sent to the bank. If `null`,
         * `send_remittance_advice` on the Counterparty is used.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) =
            sendRemittanceAdvice(JsonField.ofNullable(sendRemittanceAdvice))

        /**
         * Alias for [Builder.sendRemittanceAdvice].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
            sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

        /**
         * Alias for calling [Builder.sendRemittanceAdvice] with
         * `sendRemittanceAdvice.orElse(null)`.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Optional<Boolean>) =
            sendRemittanceAdvice(sendRemittanceAdvice.getOrNull())

        /**
         * Sets [Builder.sendRemittanceAdvice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sendRemittanceAdvice] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
            this.sendRemittanceAdvice = sendRemittanceAdvice
        }

        /**
         * An optional descriptor which will appear in the receiver's statement. For `check`
         * payments this field will be used as the memo line. For `ach` the maximum length is 10
         * characters. Note that for ACH payments, the name on your bank account will be included
         * automatically by the bank, so you can use the characters for other useful information.
         * For `eft` the maximum length is 15 characters.
         */
        fun statementDescriptor(statementDescriptor: String?) =
            statementDescriptor(JsonField.ofNullable(statementDescriptor))

        /**
         * Alias for calling [Builder.statementDescriptor] with `statementDescriptor.orElse(null)`.
         */
        fun statementDescriptor(statementDescriptor: Optional<String>) =
            statementDescriptor(statementDescriptor.getOrNull())

        /**
         * Sets [Builder.statementDescriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementDescriptor] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The current status of the payment order. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * An additional layer of classification for the type of payment order you are doing. This
         * field is only used for `ach` payment orders currently. For `ach` payment orders, the
         * `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`, `CTX`,
         * `WEB`, `CIE`, and `TEL`.
         */
        fun subtype(subtype: PaymentOrderSubtype?) = subtype(JsonField.ofNullable(subtype))

        /** Alias for calling [Builder.subtype] with `subtype.orElse(null)`. */
        fun subtype(subtype: Optional<PaymentOrderSubtype>) = subtype(subtype.getOrNull())

        /**
         * Sets [Builder.subtype] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtype] with a well-typed [PaymentOrderSubtype] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply { this.subtype = subtype }

        /**
         * The IDs of all the transactions associated to this payment order. Usually, you will only
         * have a single transaction ID. However, if a payment order initially results in a Return,
         * but gets redrafted and is later successfully completed, it can have many transactions.
         */
        fun transactionIds(transactionIds: List<String>) =
            transactionIds(JsonField.of(transactionIds))

        /**
         * Sets [Builder.transactionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionIds(transactionIds: JsonField<List<String>>) = apply {
            this.transactionIds = transactionIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [transactionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTransactionId(transactionId: String) = apply {
            transactionIds =
                (transactionIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("transactionIds", it).add(transactionId)
                }
        }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun type(type: PaymentOrderType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [PaymentOrderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

        /**
         * The account to which the originating of this payment should be attributed to. Can be a
         * `virtual_account` or `internal_account`.
         */
        fun ultimateOriginatingAccount(ultimateOriginatingAccount: UltimateOriginatingAccount?) =
            ultimateOriginatingAccount(JsonField.ofNullable(ultimateOriginatingAccount))

        /**
         * Alias for calling [Builder.ultimateOriginatingAccount] with
         * `ultimateOriginatingAccount.orElse(null)`.
         */
        fun ultimateOriginatingAccount(
            ultimateOriginatingAccount: Optional<UltimateOriginatingAccount>
        ) = ultimateOriginatingAccount(ultimateOriginatingAccount.getOrNull())

        /**
         * Sets [Builder.ultimateOriginatingAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateOriginatingAccount] with a well-typed
         * [UltimateOriginatingAccount] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ultimateOriginatingAccount(
            ultimateOriginatingAccount: JsonField<UltimateOriginatingAccount>
        ) = apply { this.ultimateOriginatingAccount = ultimateOriginatingAccount }

        /**
         * Alias for calling [ultimateOriginatingAccount] with
         * `UltimateOriginatingAccount.ofVirtual(virtual)`.
         */
        fun ultimateOriginatingAccount(virtual: VirtualAccount) =
            ultimateOriginatingAccount(UltimateOriginatingAccount.ofVirtual(virtual))

        /**
         * Alias for calling [ultimateOriginatingAccount] with
         * `UltimateOriginatingAccount.ofInternalAccount(internalAccount)`.
         */
        fun ultimateOriginatingAccount(internalAccount: InternalAccount) =
            ultimateOriginatingAccount(
                UltimateOriginatingAccount.ofInternalAccount(internalAccount)
            )

        /**
         * The ultimate originating account ID. Can be a `virtual_account` or `internal_account`.
         */
        fun ultimateOriginatingAccountId(ultimateOriginatingAccountId: String?) =
            ultimateOriginatingAccountId(JsonField.ofNullable(ultimateOriginatingAccountId))

        /**
         * Alias for calling [Builder.ultimateOriginatingAccountId] with
         * `ultimateOriginatingAccountId.orElse(null)`.
         */
        fun ultimateOriginatingAccountId(ultimateOriginatingAccountId: Optional<String>) =
            ultimateOriginatingAccountId(ultimateOriginatingAccountId.getOrNull())

        /**
         * Sets [Builder.ultimateOriginatingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateOriginatingAccountId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ultimateOriginatingAccountId(ultimateOriginatingAccountId: JsonField<String>) = apply {
            this.ultimateOriginatingAccountId = ultimateOriginatingAccountId
        }

        fun ultimateOriginatingAccountType(
            ultimateOriginatingAccountType: UltimateOriginatingAccountType?
        ) = ultimateOriginatingAccountType(JsonField.ofNullable(ultimateOriginatingAccountType))

        /**
         * Alias for calling [Builder.ultimateOriginatingAccountType] with
         * `ultimateOriginatingAccountType.orElse(null)`.
         */
        fun ultimateOriginatingAccountType(
            ultimateOriginatingAccountType: Optional<UltimateOriginatingAccountType>
        ) = ultimateOriginatingAccountType(ultimateOriginatingAccountType.getOrNull())

        /**
         * Sets [Builder.ultimateOriginatingAccountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateOriginatingAccountType] with a well-typed
         * [UltimateOriginatingAccountType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ultimateOriginatingAccountType(
            ultimateOriginatingAccountType: JsonField<UltimateOriginatingAccountType>
        ) = apply { this.ultimateOriginatingAccountType = ultimateOriginatingAccountType }

        /** Identifier of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String?) =
            ultimateOriginatingPartyIdentifier(
                JsonField.ofNullable(ultimateOriginatingPartyIdentifier)
            )

        /**
         * Alias for calling [Builder.ultimateOriginatingPartyIdentifier] with
         * `ultimateOriginatingPartyIdentifier.orElse(null)`.
         */
        fun ultimateOriginatingPartyIdentifier(
            ultimateOriginatingPartyIdentifier: Optional<String>
        ) = ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier.getOrNull())

        /**
         * Sets [Builder.ultimateOriginatingPartyIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateOriginatingPartyIdentifier] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun ultimateOriginatingPartyIdentifier(
            ultimateOriginatingPartyIdentifier: JsonField<String>
        ) = apply { this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier }

        /** Name of the ultimate originator of the payment order. */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) =
            ultimateOriginatingPartyName(JsonField.ofNullable(ultimateOriginatingPartyName))

        /**
         * Alias for calling [Builder.ultimateOriginatingPartyName] with
         * `ultimateOriginatingPartyName.orElse(null)`.
         */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: Optional<String>) =
            ultimateOriginatingPartyName(ultimateOriginatingPartyName.getOrNull())

        /**
         * Sets [Builder.ultimateOriginatingPartyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateOriginatingPartyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) = apply {
            this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
        }

        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
            ultimateReceivingPartyIdentifier(JsonField.ofNullable(ultimateReceivingPartyIdentifier))

        /**
         * Alias for calling [Builder.ultimateReceivingPartyIdentifier] with
         * `ultimateReceivingPartyIdentifier.orElse(null)`.
         */
        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: Optional<String>) =
            ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier.getOrNull())

        /**
         * Sets [Builder.ultimateReceivingPartyIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateReceivingPartyIdentifier] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: JsonField<String>) =
            apply {
                this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
            }

        fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) =
            ultimateReceivingPartyName(JsonField.ofNullable(ultimateReceivingPartyName))

        /**
         * Alias for calling [Builder.ultimateReceivingPartyName] with
         * `ultimateReceivingPartyName.orElse(null)`.
         */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: Optional<String>) =
            ultimateReceivingPartyName(ultimateReceivingPartyName.getOrNull())

        /**
         * Sets [Builder.ultimateReceivingPartyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ultimateReceivingPartyName] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) = apply {
            this.ultimateReceivingPartyName = ultimateReceivingPartyName
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

        /**
         * Additional vendor specific fields for this payment. Data must be represented as key-value
         * pairs.
         */
        fun vendorAttributes(vendorAttributes: JsonValue) = apply {
            this.vendorAttributes = vendorAttributes
        }

        /**
         * This field will be populated if a vendor failure occurs. Logic shouldn't be built on its
         * value as it is free-form.
         */
        fun vendorFailureReason(vendorFailureReason: String?) =
            vendorFailureReason(JsonField.ofNullable(vendorFailureReason))

        /**
         * Alias for calling [Builder.vendorFailureReason] with `vendorFailureReason.orElse(null)`.
         */
        fun vendorFailureReason(vendorFailureReason: Optional<String>) =
            vendorFailureReason(vendorFailureReason.getOrNull())

        /**
         * Sets [Builder.vendorFailureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vendorFailureReason] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun vendorFailureReason(vendorFailureReason: JsonField<String>) = apply {
            this.vendorFailureReason = vendorFailureReason
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
         * Returns an immutable instance of [PaymentOrder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accounting()
         * .accountingCategoryId()
         * .accountingLedgerClassId()
         * .amount()
         * .chargeBearer()
         * .counterpartyId()
         * .createdAt()
         * .currency()
         * .currentReturn()
         * .description()
         * .direction()
         * .effectiveDate()
         * .expiresAt()
         * .externalId()
         * .foreignExchangeContract()
         * .foreignExchangeIndicator()
         * .foreignExchangeRate()
         * .ledgerTransactionId()
         * .liveMode()
         * .metadata()
         * .nsfProtected()
         * .object_()
         * .originatingAccountId()
         * .originatingPartyName()
         * .priority()
         * .processAfter()
         * .purpose()
         * .receivingAccountId()
         * .receivingAccountType()
         * .referenceNumbers()
         * .remittanceInformation()
         * .sendRemittanceAdvice()
         * .statementDescriptor()
         * .status()
         * .subtype()
         * .transactionIds()
         * .type()
         * .ultimateOriginatingAccount()
         * .ultimateOriginatingAccountId()
         * .ultimateOriginatingAccountType()
         * .ultimateOriginatingPartyIdentifier()
         * .ultimateOriginatingPartyName()
         * .ultimateReceivingPartyIdentifier()
         * .ultimateReceivingPartyName()
         * .updatedAt()
         * .vendorAttributes()
         * .vendorFailureReason()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentOrder =
            PaymentOrder(
                checkRequired("id", id),
                checkRequired("accounting", accounting),
                checkRequired("accountingCategoryId", accountingCategoryId),
                checkRequired("accountingLedgerClassId", accountingLedgerClassId),
                checkRequired("amount", amount),
                checkRequired("chargeBearer", chargeBearer),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("currentReturn", currentReturn),
                checkRequired("description", description),
                checkRequired("direction", direction),
                checkRequired("effectiveDate", effectiveDate),
                checkRequired("expiresAt", expiresAt),
                checkRequired("externalId", externalId),
                checkRequired("foreignExchangeContract", foreignExchangeContract),
                checkRequired("foreignExchangeIndicator", foreignExchangeIndicator),
                checkRequired("foreignExchangeRate", foreignExchangeRate),
                checkRequired("ledgerTransactionId", ledgerTransactionId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("nsfProtected", nsfProtected),
                checkRequired("object_", object_),
                checkRequired("originatingAccountId", originatingAccountId),
                checkRequired("originatingPartyName", originatingPartyName),
                checkRequired("priority", priority),
                checkRequired("processAfter", processAfter),
                checkRequired("purpose", purpose),
                checkRequired("receivingAccountId", receivingAccountId),
                checkRequired("receivingAccountType", receivingAccountType),
                checkRequired("referenceNumbers", referenceNumbers).map { it.toImmutable() },
                checkRequired("remittanceInformation", remittanceInformation),
                checkRequired("sendRemittanceAdvice", sendRemittanceAdvice),
                checkRequired("statementDescriptor", statementDescriptor),
                checkRequired("status", status),
                checkRequired("subtype", subtype),
                checkRequired("transactionIds", transactionIds).map { it.toImmutable() },
                checkRequired("type", type),
                checkRequired("ultimateOriginatingAccount", ultimateOriginatingAccount),
                checkRequired("ultimateOriginatingAccountId", ultimateOriginatingAccountId),
                checkRequired("ultimateOriginatingAccountType", ultimateOriginatingAccountType),
                checkRequired(
                    "ultimateOriginatingPartyIdentifier",
                    ultimateOriginatingPartyIdentifier,
                ),
                checkRequired("ultimateOriginatingPartyName", ultimateOriginatingPartyName),
                checkRequired("ultimateReceivingPartyIdentifier", ultimateReceivingPartyIdentifier),
                checkRequired("ultimateReceivingPartyName", ultimateReceivingPartyName),
                checkRequired("updatedAt", updatedAt),
                checkRequired("vendorAttributes", vendorAttributes),
                checkRequired("vendorFailureReason", vendorFailureReason),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentOrder = apply {
        if (validated) {
            return@apply
        }

        id()
        accounting().validate()
        accountingCategoryId()
        accountingLedgerClassId()
        amount()
        chargeBearer().ifPresent { it.validate() }
        counterpartyId()
        createdAt()
        currency().validate()
        currentReturn().ifPresent { it.validate() }
        description()
        direction().validate()
        effectiveDate()
        expiresAt()
        externalId()
        foreignExchangeContract()
        foreignExchangeIndicator().ifPresent { it.validate() }
        foreignExchangeRate().ifPresent { it.validate() }
        ledgerTransactionId()
        liveMode()
        metadata().validate()
        nsfProtected()
        object_()
        originatingAccountId()
        originatingPartyName()
        priority().validate()
        processAfter()
        purpose()
        receivingAccountId()
        receivingAccountType().validate()
        referenceNumbers().forEach { it.validate() }
        remittanceInformation()
        sendRemittanceAdvice()
        statementDescriptor()
        status().validate()
        subtype().ifPresent { it.validate() }
        transactionIds()
        type().validate()
        ultimateOriginatingAccount().ifPresent { it.validate() }
        ultimateOriginatingAccountId()
        ultimateOriginatingAccountType().ifPresent { it.validate() }
        ultimateOriginatingPartyIdentifier()
        ultimateOriginatingPartyName()
        ultimateReceivingPartyIdentifier()
        ultimateReceivingPartyName()
        updatedAt()
        vendorFailureReason()
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
            (accounting.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountingCategoryId.asKnown().isPresent) 1 else 0) +
            (if (accountingLedgerClassId.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (chargeBearer.asKnown().getOrNull()?.validity() ?: 0) +
            (if (counterpartyId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (currentReturn.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (direction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (effectiveDate.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (foreignExchangeContract.asKnown().isPresent) 1 else 0) +
            (foreignExchangeIndicator.asKnown().getOrNull()?.validity() ?: 0) +
            (foreignExchangeRate.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ledgerTransactionId.asKnown().isPresent) 1 else 0) +
            (if (liveMode.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (nsfProtected.asKnown().isPresent) 1 else 0) +
            (if (object_.asKnown().isPresent) 1 else 0) +
            (if (originatingAccountId.asKnown().isPresent) 1 else 0) +
            (if (originatingPartyName.asKnown().isPresent) 1 else 0) +
            (priority.asKnown().getOrNull()?.validity() ?: 0) +
            (if (processAfter.asKnown().isPresent) 1 else 0) +
            (if (purpose.asKnown().isPresent) 1 else 0) +
            (if (receivingAccountId.asKnown().isPresent) 1 else 0) +
            (receivingAccountType.asKnown().getOrNull()?.validity() ?: 0) +
            (referenceNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (remittanceInformation.asKnown().isPresent) 1 else 0) +
            (if (sendRemittanceAdvice.asKnown().isPresent) 1 else 0) +
            (if (statementDescriptor.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (subtype.asKnown().getOrNull()?.validity() ?: 0) +
            (transactionIds.asKnown().getOrNull()?.size ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (ultimateOriginatingAccount.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ultimateOriginatingAccountId.asKnown().isPresent) 1 else 0) +
            (ultimateOriginatingAccountType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ultimateOriginatingPartyIdentifier.asKnown().isPresent) 1 else 0) +
            (if (ultimateOriginatingPartyName.asKnown().isPresent) 1 else 0) +
            (if (ultimateReceivingPartyIdentifier.asKnown().isPresent) 1 else 0) +
            (if (ultimateReceivingPartyName.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (vendorFailureReason.asKnown().isPresent) 1 else 0)

    class Accounting
    private constructor(
        private val accountId: JsonField<String>,
        private val classId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("class_id") @ExcludeMissing classId: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, classId, mutableMapOf())

        /**
         * The ID of one of your accounting categories. Note that these will only be accessible if
         * your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountId(): Optional<String> = accountId.getOptional("account_id")

        /**
         * The ID of one of the class objects in your accounting system. Class objects track
         * segments of your business independent of client or project. Note that these will only be
         * accessible if your accounting system has been connected.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun classId(): Optional<String> = classId.getOptional("class_id")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [classId].
         *
         * Unlike [classId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("class_id") @ExcludeMissing fun _classId(): JsonField<String> = classId

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

            /** Returns a mutable builder for constructing an instance of [Accounting]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Accounting]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var classId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accounting: Accounting) = apply {
                accountId = accounting.accountId
                classId = accounting.classId
                additionalProperties = accounting.additionalProperties.toMutableMap()
            }

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

            /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
            fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The ID of one of the class objects in your accounting system. Class objects track
             * segments of your business independent of client or project. Note that these will only
             * be accessible if your accounting system has been connected.
             */
            fun classId(classId: String?) = classId(JsonField.ofNullable(classId))

            /** Alias for calling [Builder.classId] with `classId.orElse(null)`. */
            fun classId(classId: Optional<String>) = classId(classId.getOrNull())

            /**
             * Sets [Builder.classId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.classId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun classId(classId: JsonField<String>) = apply { this.classId = classId }

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
             * Returns an immutable instance of [Accounting].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Accounting =
                Accounting(accountId, classId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Accounting = apply {
            if (validated) {
                return@apply
            }

            accountId()
            classId()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (classId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Accounting && accountId == other.accountId && classId == other.classId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
    }

    /**
     * The party that will pay the fees for the payment order. Only applies to wire payment orders.
     * Can be one of shared, sender, or receiver, which correspond respectively with the SWIFT 71A
     * values `SHA`, `OUR`, `BEN`.
     */
    class ChargeBearer @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SHARED = of("shared")

            @JvmField val SENDER = of("sender")

            @JvmField val RECEIVER = of("receiver")

            @JvmStatic fun of(value: String) = ChargeBearer(JsonField.of(value))
        }

        /** An enum containing [ChargeBearer]'s known values. */
        enum class Known {
            SHARED,
            SENDER,
            RECEIVER,
        }

        /**
         * An enum containing [ChargeBearer]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ChargeBearer] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SHARED,
            SENDER,
            RECEIVER,
            /**
             * An enum member indicating that [ChargeBearer] was instantiated with an unknown value.
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
                SHARED -> Value.SHARED
                SENDER -> Value.SENDER
                RECEIVER -> Value.RECEIVER
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
                SHARED -> Known.SHARED
                SENDER -> Known.SENDER
                RECEIVER -> Known.RECEIVER
                else -> throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
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

        fun validate(): ChargeBearer = apply {
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

            return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * One of `credit`, `debit`. Describes the direction money is flowing in the transaction. A
     * `credit` moves money from your account to someone else's. A `debit` pulls money from someone
     * else's account to your own. Note that wire, rtp, and check payments will always be `credit`.
     */
    class Direction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CREDIT = of("credit")

            @JvmField val DEBIT = of("debit")

            @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
        }

        /** An enum containing [Direction]'s known values. */
        enum class Known {
            CREDIT,
            DEBIT,
        }

        /**
         * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Direction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CREDIT,
            DEBIT,
            /**
             * An enum member indicating that [Direction] was instantiated with an unknown value.
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
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
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
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
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

        fun validate(): Direction = apply {
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

            return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
     * `fixed_to_variable`, or `null` if the payment order currency matches the originating account
     * currency.
     */
    class ForeignExchangeIndicator
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

            @JvmField val FIXED_TO_VARIABLE = of("fixed_to_variable")

            @JvmField val VARIABLE_TO_FIXED = of("variable_to_fixed")

            @JvmStatic fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
        }

        /** An enum containing [ForeignExchangeIndicator]'s known values. */
        enum class Known {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
        }

        /**
         * An enum containing [ForeignExchangeIndicator]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ForeignExchangeIndicator] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED_TO_VARIABLE,
            VARIABLE_TO_FIXED,
            /**
             * An enum member indicating that [ForeignExchangeIndicator] was instantiated with an
             * unknown value.
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
                FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
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
                FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown ForeignExchangeIndicator: $value"
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

        private var validated: Boolean = false

        fun validate(): ForeignExchangeIndicator = apply {
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

            return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Associated serialized foreign exchange rate information. */
    class ForeignExchangeRate
    private constructor(
        private val baseAmount: JsonField<Long>,
        private val baseCurrency: JsonField<Currency>,
        private val exponent: JsonField<Long>,
        private val rateString: JsonField<String>,
        private val targetAmount: JsonField<Long>,
        private val targetCurrency: JsonField<Currency>,
        private val value: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("base_amount")
            @ExcludeMissing
            baseAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("base_currency")
            @ExcludeMissing
            baseCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("exponent") @ExcludeMissing exponent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("rate_string")
            @ExcludeMissing
            rateString: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_amount")
            @ExcludeMissing
            targetAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("target_currency")
            @ExcludeMissing
            targetCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
        ) : this(
            baseAmount,
            baseCurrency,
            exponent,
            rateString,
            targetAmount,
            targetCurrency,
            value,
            mutableMapOf(),
        )

        /**
         * Amount in the lowest denomination of the `base_currency` to convert, often called the
         * "sell" amount.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun baseAmount(): Long = baseAmount.getRequired("base_amount")

        /**
         * Currency to convert, often called the "sell" currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun baseCurrency(): Currency = baseCurrency.getRequired("base_currency")

        /**
         * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exponent(): Long = exponent.getRequired("exponent")

        /**
         * A string representation of the rate.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rateString(): String = rateString.getRequired("rate_string")

        /**
         * Amount in the lowest denomination of the `target_currency`, often called the "buy"
         * amount.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetAmount(): Long = targetAmount.getRequired("target_amount")

        /**
         * Currency to convert the `base_currency` to, often called the "buy" currency.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetCurrency(): Currency = targetCurrency.getRequired("target_currency")

        /**
         * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
         * `exponent`).
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Returns the raw JSON value of [baseAmount].
         *
         * Unlike [baseAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("base_amount") @ExcludeMissing fun _baseAmount(): JsonField<Long> = baseAmount

        /**
         * Returns the raw JSON value of [baseCurrency].
         *
         * Unlike [baseCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("base_currency")
        @ExcludeMissing
        fun _baseCurrency(): JsonField<Currency> = baseCurrency

        /**
         * Returns the raw JSON value of [exponent].
         *
         * Unlike [exponent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("exponent") @ExcludeMissing fun _exponent(): JsonField<Long> = exponent

        /**
         * Returns the raw JSON value of [rateString].
         *
         * Unlike [rateString], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_string")
        @ExcludeMissing
        fun _rateString(): JsonField<String> = rateString

        /**
         * Returns the raw JSON value of [targetAmount].
         *
         * Unlike [targetAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_amount")
        @ExcludeMissing
        fun _targetAmount(): JsonField<Long> = targetAmount

        /**
         * Returns the raw JSON value of [targetCurrency].
         *
         * Unlike [targetCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_currency")
        @ExcludeMissing
        fun _targetCurrency(): JsonField<Currency> = targetCurrency

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

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
             * Returns a mutable builder for constructing an instance of [ForeignExchangeRate].
             *
             * The following fields are required:
             * ```java
             * .baseAmount()
             * .baseCurrency()
             * .exponent()
             * .rateString()
             * .targetAmount()
             * .targetCurrency()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ForeignExchangeRate]. */
        class Builder internal constructor() {

            private var baseAmount: JsonField<Long>? = null
            private var baseCurrency: JsonField<Currency>? = null
            private var exponent: JsonField<Long>? = null
            private var rateString: JsonField<String>? = null
            private var targetAmount: JsonField<Long>? = null
            private var targetCurrency: JsonField<Currency>? = null
            private var value: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(foreignExchangeRate: ForeignExchangeRate) = apply {
                baseAmount = foreignExchangeRate.baseAmount
                baseCurrency = foreignExchangeRate.baseCurrency
                exponent = foreignExchangeRate.exponent
                rateString = foreignExchangeRate.rateString
                targetAmount = foreignExchangeRate.targetAmount
                targetCurrency = foreignExchangeRate.targetCurrency
                value = foreignExchangeRate.value
                additionalProperties = foreignExchangeRate.additionalProperties.toMutableMap()
            }

            /**
             * Amount in the lowest denomination of the `base_currency` to convert, often called the
             * "sell" amount.
             */
            fun baseAmount(baseAmount: Long) = baseAmount(JsonField.of(baseAmount))

            /**
             * Sets [Builder.baseAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseAmount(baseAmount: JsonField<Long>) = apply { this.baseAmount = baseAmount }

            /** Currency to convert, often called the "sell" currency. */
            fun baseCurrency(baseCurrency: Currency) = baseCurrency(JsonField.of(baseCurrency))

            /**
             * Sets [Builder.baseCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baseCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun baseCurrency(baseCurrency: JsonField<Currency>) = apply {
                this.baseCurrency = baseCurrency
            }

            /**
             * The exponent component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun exponent(exponent: Long) = exponent(JsonField.of(exponent))

            /**
             * Sets [Builder.exponent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.exponent] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exponent(exponent: JsonField<Long>) = apply { this.exponent = exponent }

            /** A string representation of the rate. */
            fun rateString(rateString: String) = rateString(JsonField.of(rateString))

            /**
             * Sets [Builder.rateString] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateString] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateString(rateString: JsonField<String>) = apply { this.rateString = rateString }

            /**
             * Amount in the lowest denomination of the `target_currency`, often called the "buy"
             * amount.
             */
            fun targetAmount(targetAmount: Long) = targetAmount(JsonField.of(targetAmount))

            /**
             * Sets [Builder.targetAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetAmount(targetAmount: JsonField<Long>) = apply {
                this.targetAmount = targetAmount
            }

            /** Currency to convert the `base_currency` to, often called the "buy" currency. */
            fun targetCurrency(targetCurrency: Currency) =
                targetCurrency(JsonField.of(targetCurrency))

            /**
             * Sets [Builder.targetCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetCurrency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetCurrency(targetCurrency: JsonField<Currency>) = apply {
                this.targetCurrency = targetCurrency
            }

            /**
             * The whole number component of the rate. The decimal is calculated as `value` / (10 ^
             * `exponent`).
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

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
             * Returns an immutable instance of [ForeignExchangeRate].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .baseAmount()
             * .baseCurrency()
             * .exponent()
             * .rateString()
             * .targetAmount()
             * .targetCurrency()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ForeignExchangeRate =
                ForeignExchangeRate(
                    checkRequired("baseAmount", baseAmount),
                    checkRequired("baseCurrency", baseCurrency),
                    checkRequired("exponent", exponent),
                    checkRequired("rateString", rateString),
                    checkRequired("targetAmount", targetAmount),
                    checkRequired("targetCurrency", targetCurrency),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ForeignExchangeRate = apply {
            if (validated) {
                return@apply
            }

            baseAmount()
            baseCurrency().validate()
            exponent()
            rateString()
            targetAmount()
            targetCurrency().validate()
            value()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (baseAmount.asKnown().isPresent) 1 else 0) +
                (baseCurrency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (exponent.asKnown().isPresent) 1 else 0) +
                (if (rateString.asKnown().isPresent) 1 else 0) +
                (if (targetAmount.asKnown().isPresent) 1 else 0) +
                (targetCurrency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ForeignExchangeRate && baseAmount == other.baseAmount && baseCurrency == other.baseCurrency && exponent == other.exponent && rateString == other.rateString && targetAmount == other.targetAmount && targetCurrency == other.targetCurrency && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(baseAmount, baseCurrency, exponent, rateString, targetAmount, targetCurrency, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ForeignExchangeRate{baseAmount=$baseAmount, baseCurrency=$baseCurrency, exponent=$exponent, rateString=$rateString, targetAmount=$targetAmount, targetCurrency=$targetCurrency, value=$value, additionalProperties=$additionalProperties}"
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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

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

    /**
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     */
    class Priority @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HIGH = of("high")

            @JvmField val NORMAL = of("normal")

            @JvmStatic fun of(value: String) = Priority(JsonField.of(value))
        }

        /** An enum containing [Priority]'s known values. */
        enum class Known {
            HIGH,
            NORMAL,
        }

        /**
         * An enum containing [Priority]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Priority] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGH,
            NORMAL,
            /** An enum member indicating that [Priority] was instantiated with an unknown value. */
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
                HIGH -> Value.HIGH
                NORMAL -> Value.NORMAL
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
                HIGH -> Known.HIGH
                NORMAL -> Known.NORMAL
                else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
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

        fun validate(): Priority = apply {
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

            return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ReceivingAccountType
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

            @JvmField val INTERNAL_ACCOUNT = of("internal_account")

            @JvmField val EXTERNAL_ACCOUNT = of("external_account")

            @JvmStatic fun of(value: String) = ReceivingAccountType(JsonField.of(value))
        }

        /** An enum containing [ReceivingAccountType]'s known values. */
        enum class Known {
            INTERNAL_ACCOUNT,
            EXTERNAL_ACCOUNT,
        }

        /**
         * An enum containing [ReceivingAccountType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ReceivingAccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTERNAL_ACCOUNT,
            EXTERNAL_ACCOUNT,
            /**
             * An enum member indicating that [ReceivingAccountType] was instantiated with an
             * unknown value.
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
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
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
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReceivingAccountType: $value")
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

        fun validate(): ReceivingAccountType = apply {
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

            return /* spotless:off */ other is ReceivingAccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PaymentReference
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val referenceNumber: JsonField<String>,
        private val referenceNumberType: JsonField<ReferenceNumberType>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_number")
            @ExcludeMissing
            referenceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reference_number_type")
            @ExcludeMissing
            referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            liveMode,
            object_,
            referenceNumber,
            referenceNumberType,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun object_(): String = object_.getRequired("object")

        /**
         * The vendor reference number.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referenceNumber(): String = referenceNumber.getRequired("reference_number")

        /**
         * The type of the reference number. Referring to the vendor payment id.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun referenceNumberType(): ReferenceNumberType =
            referenceNumberType.getRequired("reference_number_type")

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
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

        /**
         * Returns the raw JSON value of [referenceNumber].
         *
         * Unlike [referenceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reference_number")
        @ExcludeMissing
        fun _referenceNumber(): JsonField<String> = referenceNumber

        /**
         * Returns the raw JSON value of [referenceNumberType].
         *
         * Unlike [referenceNumberType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reference_number_type")
        @ExcludeMissing
        fun _referenceNumberType(): JsonField<ReferenceNumberType> = referenceNumberType

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
             * Returns a mutable builder for constructing an instance of [PaymentReference].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .liveMode()
             * .object_()
             * .referenceNumber()
             * .referenceNumberType()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentReference]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var referenceNumber: JsonField<String>? = null
            private var referenceNumberType: JsonField<ReferenceNumberType>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentReference: PaymentReference) = apply {
                id = paymentReference.id
                createdAt = paymentReference.createdAt
                liveMode = paymentReference.liveMode
                object_ = paymentReference.object_
                referenceNumber = paymentReference.referenceNumber
                referenceNumberType = paymentReference.referenceNumberType
                updatedAt = paymentReference.updatedAt
                additionalProperties = paymentReference.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The vendor reference number. */
            fun referenceNumber(referenceNumber: String) =
                referenceNumber(JsonField.of(referenceNumber))

            /**
             * Sets [Builder.referenceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun referenceNumber(referenceNumber: JsonField<String>) = apply {
                this.referenceNumber = referenceNumber
            }

            /** The type of the reference number. Referring to the vendor payment id. */
            fun referenceNumberType(referenceNumberType: ReferenceNumberType) =
                referenceNumberType(JsonField.of(referenceNumberType))

            /**
             * Sets [Builder.referenceNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.referenceNumberType] with a well-typed
             * [ReferenceNumberType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun referenceNumberType(referenceNumberType: JsonField<ReferenceNumberType>) = apply {
                this.referenceNumberType = referenceNumberType
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [PaymentReference].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .liveMode()
             * .object_()
             * .referenceNumber()
             * .referenceNumberType()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentReference =
                PaymentReference(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("referenceNumber", referenceNumber),
                    checkRequired("referenceNumberType", referenceNumberType),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentReference = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            liveMode()
            object_()
            referenceNumber()
            referenceNumberType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (liveMode.asKnown().isPresent) 1 else 0) +
                (if (object_.asKnown().isPresent) 1 else 0) +
                (if (referenceNumber.asKnown().isPresent) 1 else 0) +
                (referenceNumberType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        /** The type of the reference number. Referring to the vendor payment id. */
        class ReferenceNumberType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ACH_ORIGINAL_TRACE_NUMBER = of("ach_original_trace_number")

                @JvmField val ACH_TRACE_NUMBER = of("ach_trace_number")

                @JvmField val BANKPROV_PAYMENT_ACTIVITY_DATE = of("bankprov_payment_activity_date")

                @JvmField val BANKPROV_PAYMENT_ID = of("bankprov_payment_id")

                @JvmField val BNK_DEV_PRENOTIFICATION_ID = of("bnk_dev_prenotification_id")

                @JvmField val BNK_DEV_TRANSFER_ID = of("bnk_dev_transfer_id")

                @JvmField val BOFA_END_TO_END_ID = of("bofa_end_to_end_id")

                @JvmField val BOFA_TRANSACTION_ID = of("bofa_transaction_id")

                @JvmField val BRALE_TRANSFER_ID = of("brale_transfer_id")

                @JvmField
                val BRIDGE_DESTINATION_TRANSACTION_HASH = of("bridge_destination_transaction_hash")

                @JvmField val BRIDGE_SOURCE_TRANSACTION_HASH = of("bridge_source_transaction_hash")

                @JvmField val BRIDGE_TRANSFER_ID = of("bridge_transfer_id")

                @JvmField val CHECK_NUMBER = of("check_number")

                @JvmField val CITIBANK_REFERENCE_NUMBER = of("citibank_reference_number")

                @JvmField
                val CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER =
                    of("citibank_worldlink_clearing_system_reference_number")

                @JvmField val COLUMN_FX_QUOTE_ID = of("column_fx_quote_id")

                @JvmField
                val COLUMN_REVERSAL_PAIR_TRANSFER_ID = of("column_reversal_pair_transfer_id")

                @JvmField val COLUMN_TRANSFER_ID = of("column_transfer_id")

                @JvmField
                val CROSS_RIVER_CORE_TRANSACTION_ID = of("cross_river_core_transaction_id")

                @JvmField val CROSS_RIVER_FED_BATCH_ID = of("cross_river_fed_batch_id")

                @JvmField val CROSS_RIVER_PAYMENT_ID = of("cross_river_payment_id")

                @JvmField val CROSS_RIVER_SERVICE_MESSAGE = of("cross_river_service_message")

                @JvmField val CROSS_RIVER_TRANSACTION_ID = of("cross_river_transaction_id")

                @JvmField val CURRENCYCLOUD_CONVERSION_ID = of("currencycloud_conversion_id")

                @JvmField val CURRENCYCLOUD_PAYMENT_ID = of("currencycloud_payment_id")

                @JvmField val DC_BANK_TRANSACTION_ID = of("dc_bank_transaction_id")

                @JvmField val EFT_TRACE_NUMBER = of("eft_trace_number")

                @JvmField val EVOLVE_TRANSACTION_ID = of("evolve_transaction_id")

                @JvmField val FEDWIRE_IMAD = of("fedwire_imad")

                @JvmField val FEDWIRE_OMAD = of("fedwire_omad")

                @JvmField val FIRST_REPUBLIC_INTERNAL_ID = of("first_republic_internal_id")

                @JvmField
                val GOLDMAN_SACHS_COLLECTION_REQUEST_ID = of("goldman_sachs_collection_request_id")

                @JvmField val GOLDMAN_SACHS_END_TO_END_ID = of("goldman_sachs_end_to_end_id")

                @JvmField
                val GOLDMAN_SACHS_PAYMENT_REQUEST_ID = of("goldman_sachs_payment_request_id")

                @JvmField val GOLDMAN_SACHS_REQUEST_ID = of("goldman_sachs_request_id")

                @JvmField
                val GOLDMAN_SACHS_UNIQUE_PAYMENT_ID = of("goldman_sachs_unique_payment_id")

                @JvmField val INTERAC_MESSAGE_ID = of("interac_message_id")

                @JvmField val JPMC_CCN = of("jpmc_ccn")

                @JvmField val JPMC_CLEARING_SYSTEM_REFERENCE = of("jpmc_clearing_system_reference")

                @JvmField val JPMC_CUSTOMER_REFERENCE_ID = of("jpmc_customer_reference_id")

                @JvmField val JPMC_END_TO_END_ID = of("jpmc_end_to_end_id")

                @JvmField val JPMC_FIRM_ROOT_ID = of("jpmc_firm_root_id")

                @JvmField val JPMC_FX_TRN_ID = of("jpmc_fx_trn_id")

                @JvmField val JPMC_P3_ID = of("jpmc_p3_id")

                @JvmField val JPMC_PAYMENT_BATCH_ID = of("jpmc_payment_batch_id")

                @JvmField val JPMC_PAYMENT_INFORMATION_ID = of("jpmc_payment_information_id")

                @JvmField val JPMC_PAYMENT_RETURNED_DATETIME = of("jpmc_payment_returned_datetime")

                @JvmField
                val JPMC_TRANSACTION_REFERENCE_NUMBER = of("jpmc_transaction_reference_number")

                @JvmField val LOB_CHECK_ID = of("lob_check_id")

                @JvmField val OTHER = of("other")

                @JvmField val PARTIAL_SWIFT_MIR = of("partial_swift_mir")

                @JvmField val PNC_CLEARING_REFERENCE = of("pnc_clearing_reference")

                @JvmField val PNC_INSTRUCTION_ID = of("pnc_instruction_id")

                @JvmField val PNC_MULTIPAYMENT_ID = of("pnc_multipayment_id")

                @JvmField val PNC_PAYMENT_TRACE_ID = of("pnc_payment_trace_id")

                @JvmField val PNC_REQUEST_FOR_PAYMENT_ID = of("pnc_request_for_payment_id")

                @JvmField
                val PNC_TRANSACTION_REFERENCE_NUMBER = of("pnc_transaction_reference_number")

                @JvmField val RBC_WIRE_REFERENCE_ID = of("rbc_wire_reference_id")

                @JvmField val RSPEC_VENDOR_PAYMENT_ID = of("rspec_vendor_payment_id")

                @JvmField val RTP_INSTRUCTION_ID = of("rtp_instruction_id")

                @JvmField val SIGNET_API_REFERENCE_ID = of("signet_api_reference_id")

                @JvmField val SIGNET_CONFIRMATION_ID = of("signet_confirmation_id")

                @JvmField val SIGNET_REQUEST_ID = of("signet_request_id")

                @JvmField val SILVERGATE_PAYMENT_ID = of("silvergate_payment_id")

                @JvmField val SVB_END_TO_END_ID = of("svb_end_to_end_id")

                @JvmField val SVB_PAYMENT_ID = of("svb_payment_id")

                @JvmField
                val SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW =
                    of("svb_transaction_cleared_for_sanctions_review")

                @JvmField
                val SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW =
                    of("svb_transaction_held_for_sanctions_review")

                @JvmField val SWIFT_MIR = of("swift_mir")

                @JvmField val SWIFT_UETR = of("swift_uetr")

                @JvmField
                val UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER = of("umb_product_partner_account_number")

                @JvmField
                val USBANK_PAYMENT_APPLICATION_REFERENCE_ID =
                    of("usbank_payment_application_reference_id")

                @JvmField val USBANK_PAYMENT_ID = of("usbank_payment_id")

                @JvmField val USBANK_PENDING_RTP_PAYMENT_ID = of("usbank_pending_rtp_payment_id")

                @JvmField val USBANK_POSTED_RTP_PAYMENT_ID = of("usbank_posted_rtp_payment_id")

                @JvmField val WELLS_FARGO_END_TO_END_ID = of("wells_fargo_end_to_end_id")

                @JvmField val WELLS_FARGO_PAYMENT_ID = of("wells_fargo_payment_id")

                @JvmField val WELLS_FARGO_TRACE_NUMBER = of("wells_fargo_trace_number")

                @JvmField val WELLS_FARGO_UETR = of("wells_fargo_uetr")

                @JvmStatic fun of(value: String) = ReferenceNumberType(JsonField.of(value))
            }

            /** An enum containing [ReferenceNumberType]'s known values. */
            enum class Known {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                BRALE_TRANSFER_ID,
                BRIDGE_DESTINATION_TRANSACTION_HASH,
                BRIDGE_SOURCE_TRANSACTION_HASH,
                BRIDGE_TRANSFER_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_CORE_TRANSACTION_ID,
                CROSS_RIVER_FED_BATCH_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_TRANSACTION_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
                INTERAC_MESSAGE_ID,
                JPMC_CCN,
                JPMC_CLEARING_SYSTEM_REFERENCE,
                JPMC_CUSTOMER_REFERENCE_ID,
                JPMC_END_TO_END_ID,
                JPMC_FIRM_ROOT_ID,
                JPMC_FX_TRN_ID,
                JPMC_P3_ID,
                JPMC_PAYMENT_BATCH_ID,
                JPMC_PAYMENT_INFORMATION_ID,
                JPMC_PAYMENT_RETURNED_DATETIME,
                JPMC_TRANSACTION_REFERENCE_NUMBER,
                LOB_CHECK_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_REQUEST_FOR_PAYMENT_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RBC_WIRE_REFERENCE_ID,
                RSPEC_VENDOR_PAYMENT_ID,
                RTP_INSTRUCTION_ID,
                SIGNET_API_REFERENCE_ID,
                SIGNET_CONFIRMATION_ID,
                SIGNET_REQUEST_ID,
                SILVERGATE_PAYMENT_ID,
                SVB_END_TO_END_ID,
                SVB_PAYMENT_ID,
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
                SWIFT_MIR,
                SWIFT_UETR,
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
                USBANK_PAYMENT_ID,
                USBANK_PENDING_RTP_PAYMENT_ID,
                USBANK_POSTED_RTP_PAYMENT_ID,
                WELLS_FARGO_END_TO_END_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
                WELLS_FARGO_UETR,
            }

            /**
             * An enum containing [ReferenceNumberType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ReferenceNumberType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH_ORIGINAL_TRACE_NUMBER,
                ACH_TRACE_NUMBER,
                BANKPROV_PAYMENT_ACTIVITY_DATE,
                BANKPROV_PAYMENT_ID,
                BNK_DEV_PRENOTIFICATION_ID,
                BNK_DEV_TRANSFER_ID,
                BOFA_END_TO_END_ID,
                BOFA_TRANSACTION_ID,
                BRALE_TRANSFER_ID,
                BRIDGE_DESTINATION_TRANSACTION_HASH,
                BRIDGE_SOURCE_TRANSACTION_HASH,
                BRIDGE_TRANSFER_ID,
                CHECK_NUMBER,
                CITIBANK_REFERENCE_NUMBER,
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
                COLUMN_FX_QUOTE_ID,
                COLUMN_REVERSAL_PAIR_TRANSFER_ID,
                COLUMN_TRANSFER_ID,
                CROSS_RIVER_CORE_TRANSACTION_ID,
                CROSS_RIVER_FED_BATCH_ID,
                CROSS_RIVER_PAYMENT_ID,
                CROSS_RIVER_SERVICE_MESSAGE,
                CROSS_RIVER_TRANSACTION_ID,
                CURRENCYCLOUD_CONVERSION_ID,
                CURRENCYCLOUD_PAYMENT_ID,
                DC_BANK_TRANSACTION_ID,
                EFT_TRACE_NUMBER,
                EVOLVE_TRANSACTION_ID,
                FEDWIRE_IMAD,
                FEDWIRE_OMAD,
                FIRST_REPUBLIC_INTERNAL_ID,
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
                GOLDMAN_SACHS_END_TO_END_ID,
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
                GOLDMAN_SACHS_REQUEST_ID,
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
                INTERAC_MESSAGE_ID,
                JPMC_CCN,
                JPMC_CLEARING_SYSTEM_REFERENCE,
                JPMC_CUSTOMER_REFERENCE_ID,
                JPMC_END_TO_END_ID,
                JPMC_FIRM_ROOT_ID,
                JPMC_FX_TRN_ID,
                JPMC_P3_ID,
                JPMC_PAYMENT_BATCH_ID,
                JPMC_PAYMENT_INFORMATION_ID,
                JPMC_PAYMENT_RETURNED_DATETIME,
                JPMC_TRANSACTION_REFERENCE_NUMBER,
                LOB_CHECK_ID,
                OTHER,
                PARTIAL_SWIFT_MIR,
                PNC_CLEARING_REFERENCE,
                PNC_INSTRUCTION_ID,
                PNC_MULTIPAYMENT_ID,
                PNC_PAYMENT_TRACE_ID,
                PNC_REQUEST_FOR_PAYMENT_ID,
                PNC_TRANSACTION_REFERENCE_NUMBER,
                RBC_WIRE_REFERENCE_ID,
                RSPEC_VENDOR_PAYMENT_ID,
                RTP_INSTRUCTION_ID,
                SIGNET_API_REFERENCE_ID,
                SIGNET_CONFIRMATION_ID,
                SIGNET_REQUEST_ID,
                SILVERGATE_PAYMENT_ID,
                SVB_END_TO_END_ID,
                SVB_PAYMENT_ID,
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
                SWIFT_MIR,
                SWIFT_UETR,
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
                USBANK_PAYMENT_ID,
                USBANK_PENDING_RTP_PAYMENT_ID,
                USBANK_POSTED_RTP_PAYMENT_ID,
                WELLS_FARGO_END_TO_END_ID,
                WELLS_FARGO_PAYMENT_ID,
                WELLS_FARGO_TRACE_NUMBER,
                WELLS_FARGO_UETR,
                /**
                 * An enum member indicating that [ReferenceNumberType] was instantiated with an
                 * unknown value.
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
                    ACH_ORIGINAL_TRACE_NUMBER -> Value.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Value.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Value.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Value.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Value.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Value.BNK_DEV_TRANSFER_ID
                    BOFA_END_TO_END_ID -> Value.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Value.BOFA_TRANSACTION_ID
                    BRALE_TRANSFER_ID -> Value.BRALE_TRANSFER_ID
                    BRIDGE_DESTINATION_TRANSACTION_HASH -> Value.BRIDGE_DESTINATION_TRANSACTION_HASH
                    BRIDGE_SOURCE_TRANSACTION_HASH -> Value.BRIDGE_SOURCE_TRANSACTION_HASH
                    BRIDGE_TRANSFER_ID -> Value.BRIDGE_TRANSFER_ID
                    CHECK_NUMBER -> Value.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Value.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Value.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Value.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Value.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Value.COLUMN_TRANSFER_ID
                    CROSS_RIVER_CORE_TRANSACTION_ID -> Value.CROSS_RIVER_CORE_TRANSACTION_ID
                    CROSS_RIVER_FED_BATCH_ID -> Value.CROSS_RIVER_FED_BATCH_ID
                    CROSS_RIVER_PAYMENT_ID -> Value.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Value.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Value.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Value.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Value.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Value.DC_BANK_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Value.EFT_TRACE_NUMBER
                    EVOLVE_TRANSACTION_ID -> Value.EVOLVE_TRANSACTION_ID
                    FEDWIRE_IMAD -> Value.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Value.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Value.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Value.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Value.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Value.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Value.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Value.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                    INTERAC_MESSAGE_ID -> Value.INTERAC_MESSAGE_ID
                    JPMC_CCN -> Value.JPMC_CCN
                    JPMC_CLEARING_SYSTEM_REFERENCE -> Value.JPMC_CLEARING_SYSTEM_REFERENCE
                    JPMC_CUSTOMER_REFERENCE_ID -> Value.JPMC_CUSTOMER_REFERENCE_ID
                    JPMC_END_TO_END_ID -> Value.JPMC_END_TO_END_ID
                    JPMC_FIRM_ROOT_ID -> Value.JPMC_FIRM_ROOT_ID
                    JPMC_FX_TRN_ID -> Value.JPMC_FX_TRN_ID
                    JPMC_P3_ID -> Value.JPMC_P3_ID
                    JPMC_PAYMENT_BATCH_ID -> Value.JPMC_PAYMENT_BATCH_ID
                    JPMC_PAYMENT_INFORMATION_ID -> Value.JPMC_PAYMENT_INFORMATION_ID
                    JPMC_PAYMENT_RETURNED_DATETIME -> Value.JPMC_PAYMENT_RETURNED_DATETIME
                    JPMC_TRANSACTION_REFERENCE_NUMBER -> Value.JPMC_TRANSACTION_REFERENCE_NUMBER
                    LOB_CHECK_ID -> Value.LOB_CHECK_ID
                    OTHER -> Value.OTHER
                    PARTIAL_SWIFT_MIR -> Value.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Value.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Value.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Value.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Value.PNC_PAYMENT_TRACE_ID
                    PNC_REQUEST_FOR_PAYMENT_ID -> Value.PNC_REQUEST_FOR_PAYMENT_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Value.PNC_TRANSACTION_REFERENCE_NUMBER
                    RBC_WIRE_REFERENCE_ID -> Value.RBC_WIRE_REFERENCE_ID
                    RSPEC_VENDOR_PAYMENT_ID -> Value.RSPEC_VENDOR_PAYMENT_ID
                    RTP_INSTRUCTION_ID -> Value.RTP_INSTRUCTION_ID
                    SIGNET_API_REFERENCE_ID -> Value.SIGNET_API_REFERENCE_ID
                    SIGNET_CONFIRMATION_ID -> Value.SIGNET_CONFIRMATION_ID
                    SIGNET_REQUEST_ID -> Value.SIGNET_REQUEST_ID
                    SILVERGATE_PAYMENT_ID -> Value.SILVERGATE_PAYMENT_ID
                    SVB_END_TO_END_ID -> Value.SVB_END_TO_END_ID
                    SVB_PAYMENT_ID -> Value.SVB_PAYMENT_ID
                    SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                        Value.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                    SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                        Value.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                    SWIFT_MIR -> Value.SWIFT_MIR
                    SWIFT_UETR -> Value.SWIFT_UETR
                    UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Value.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                    USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                        Value.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                    USBANK_PAYMENT_ID -> Value.USBANK_PAYMENT_ID
                    USBANK_PENDING_RTP_PAYMENT_ID -> Value.USBANK_PENDING_RTP_PAYMENT_ID
                    USBANK_POSTED_RTP_PAYMENT_ID -> Value.USBANK_POSTED_RTP_PAYMENT_ID
                    WELLS_FARGO_END_TO_END_ID -> Value.WELLS_FARGO_END_TO_END_ID
                    WELLS_FARGO_PAYMENT_ID -> Value.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Value.WELLS_FARGO_TRACE_NUMBER
                    WELLS_FARGO_UETR -> Value.WELLS_FARGO_UETR
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
                    ACH_ORIGINAL_TRACE_NUMBER -> Known.ACH_ORIGINAL_TRACE_NUMBER
                    ACH_TRACE_NUMBER -> Known.ACH_TRACE_NUMBER
                    BANKPROV_PAYMENT_ACTIVITY_DATE -> Known.BANKPROV_PAYMENT_ACTIVITY_DATE
                    BANKPROV_PAYMENT_ID -> Known.BANKPROV_PAYMENT_ID
                    BNK_DEV_PRENOTIFICATION_ID -> Known.BNK_DEV_PRENOTIFICATION_ID
                    BNK_DEV_TRANSFER_ID -> Known.BNK_DEV_TRANSFER_ID
                    BOFA_END_TO_END_ID -> Known.BOFA_END_TO_END_ID
                    BOFA_TRANSACTION_ID -> Known.BOFA_TRANSACTION_ID
                    BRALE_TRANSFER_ID -> Known.BRALE_TRANSFER_ID
                    BRIDGE_DESTINATION_TRANSACTION_HASH -> Known.BRIDGE_DESTINATION_TRANSACTION_HASH
                    BRIDGE_SOURCE_TRANSACTION_HASH -> Known.BRIDGE_SOURCE_TRANSACTION_HASH
                    BRIDGE_TRANSFER_ID -> Known.BRIDGE_TRANSFER_ID
                    CHECK_NUMBER -> Known.CHECK_NUMBER
                    CITIBANK_REFERENCE_NUMBER -> Known.CITIBANK_REFERENCE_NUMBER
                    CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                        Known.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                    COLUMN_FX_QUOTE_ID -> Known.COLUMN_FX_QUOTE_ID
                    COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Known.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                    COLUMN_TRANSFER_ID -> Known.COLUMN_TRANSFER_ID
                    CROSS_RIVER_CORE_TRANSACTION_ID -> Known.CROSS_RIVER_CORE_TRANSACTION_ID
                    CROSS_RIVER_FED_BATCH_ID -> Known.CROSS_RIVER_FED_BATCH_ID
                    CROSS_RIVER_PAYMENT_ID -> Known.CROSS_RIVER_PAYMENT_ID
                    CROSS_RIVER_SERVICE_MESSAGE -> Known.CROSS_RIVER_SERVICE_MESSAGE
                    CROSS_RIVER_TRANSACTION_ID -> Known.CROSS_RIVER_TRANSACTION_ID
                    CURRENCYCLOUD_CONVERSION_ID -> Known.CURRENCYCLOUD_CONVERSION_ID
                    CURRENCYCLOUD_PAYMENT_ID -> Known.CURRENCYCLOUD_PAYMENT_ID
                    DC_BANK_TRANSACTION_ID -> Known.DC_BANK_TRANSACTION_ID
                    EFT_TRACE_NUMBER -> Known.EFT_TRACE_NUMBER
                    EVOLVE_TRANSACTION_ID -> Known.EVOLVE_TRANSACTION_ID
                    FEDWIRE_IMAD -> Known.FEDWIRE_IMAD
                    FEDWIRE_OMAD -> Known.FEDWIRE_OMAD
                    FIRST_REPUBLIC_INTERNAL_ID -> Known.FIRST_REPUBLIC_INTERNAL_ID
                    GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Known.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                    GOLDMAN_SACHS_END_TO_END_ID -> Known.GOLDMAN_SACHS_END_TO_END_ID
                    GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Known.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                    GOLDMAN_SACHS_REQUEST_ID -> Known.GOLDMAN_SACHS_REQUEST_ID
                    GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Known.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                    INTERAC_MESSAGE_ID -> Known.INTERAC_MESSAGE_ID
                    JPMC_CCN -> Known.JPMC_CCN
                    JPMC_CLEARING_SYSTEM_REFERENCE -> Known.JPMC_CLEARING_SYSTEM_REFERENCE
                    JPMC_CUSTOMER_REFERENCE_ID -> Known.JPMC_CUSTOMER_REFERENCE_ID
                    JPMC_END_TO_END_ID -> Known.JPMC_END_TO_END_ID
                    JPMC_FIRM_ROOT_ID -> Known.JPMC_FIRM_ROOT_ID
                    JPMC_FX_TRN_ID -> Known.JPMC_FX_TRN_ID
                    JPMC_P3_ID -> Known.JPMC_P3_ID
                    JPMC_PAYMENT_BATCH_ID -> Known.JPMC_PAYMENT_BATCH_ID
                    JPMC_PAYMENT_INFORMATION_ID -> Known.JPMC_PAYMENT_INFORMATION_ID
                    JPMC_PAYMENT_RETURNED_DATETIME -> Known.JPMC_PAYMENT_RETURNED_DATETIME
                    JPMC_TRANSACTION_REFERENCE_NUMBER -> Known.JPMC_TRANSACTION_REFERENCE_NUMBER
                    LOB_CHECK_ID -> Known.LOB_CHECK_ID
                    OTHER -> Known.OTHER
                    PARTIAL_SWIFT_MIR -> Known.PARTIAL_SWIFT_MIR
                    PNC_CLEARING_REFERENCE -> Known.PNC_CLEARING_REFERENCE
                    PNC_INSTRUCTION_ID -> Known.PNC_INSTRUCTION_ID
                    PNC_MULTIPAYMENT_ID -> Known.PNC_MULTIPAYMENT_ID
                    PNC_PAYMENT_TRACE_ID -> Known.PNC_PAYMENT_TRACE_ID
                    PNC_REQUEST_FOR_PAYMENT_ID -> Known.PNC_REQUEST_FOR_PAYMENT_ID
                    PNC_TRANSACTION_REFERENCE_NUMBER -> Known.PNC_TRANSACTION_REFERENCE_NUMBER
                    RBC_WIRE_REFERENCE_ID -> Known.RBC_WIRE_REFERENCE_ID
                    RSPEC_VENDOR_PAYMENT_ID -> Known.RSPEC_VENDOR_PAYMENT_ID
                    RTP_INSTRUCTION_ID -> Known.RTP_INSTRUCTION_ID
                    SIGNET_API_REFERENCE_ID -> Known.SIGNET_API_REFERENCE_ID
                    SIGNET_CONFIRMATION_ID -> Known.SIGNET_CONFIRMATION_ID
                    SIGNET_REQUEST_ID -> Known.SIGNET_REQUEST_ID
                    SILVERGATE_PAYMENT_ID -> Known.SILVERGATE_PAYMENT_ID
                    SVB_END_TO_END_ID -> Known.SVB_END_TO_END_ID
                    SVB_PAYMENT_ID -> Known.SVB_PAYMENT_ID
                    SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                        Known.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                    SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                        Known.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                    SWIFT_MIR -> Known.SWIFT_MIR
                    SWIFT_UETR -> Known.SWIFT_UETR
                    UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Known.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                    USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                        Known.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                    USBANK_PAYMENT_ID -> Known.USBANK_PAYMENT_ID
                    USBANK_PENDING_RTP_PAYMENT_ID -> Known.USBANK_PENDING_RTP_PAYMENT_ID
                    USBANK_POSTED_RTP_PAYMENT_ID -> Known.USBANK_POSTED_RTP_PAYMENT_ID
                    WELLS_FARGO_END_TO_END_ID -> Known.WELLS_FARGO_END_TO_END_ID
                    WELLS_FARGO_PAYMENT_ID -> Known.WELLS_FARGO_PAYMENT_ID
                    WELLS_FARGO_TRACE_NUMBER -> Known.WELLS_FARGO_TRACE_NUMBER
                    WELLS_FARGO_UETR -> Known.WELLS_FARGO_UETR
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ReferenceNumberType: $value"
                        )
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

            private var validated: Boolean = false

            fun validate(): ReferenceNumberType = apply {
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

                return /* spotless:off */ other is ReferenceNumberType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentReference && id == other.id && createdAt == other.createdAt && liveMode == other.liveMode && object_ == other.object_ && referenceNumber == other.referenceNumber && referenceNumberType == other.referenceNumberType && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, liveMode, object_, referenceNumber, referenceNumberType, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentReference{id=$id, createdAt=$createdAt, liveMode=$liveMode, object_=$object_, referenceNumber=$referenceNumber, referenceNumberType=$referenceNumberType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The current status of the payment order. */
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

            @JvmField val APPROVED = of("approved")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val COMPLETED = of("completed")

            @JvmField val DENIED = of("denied")

            @JvmField val FAILED = of("failed")

            @JvmField val NEEDS_APPROVAL = of("needs_approval")

            @JvmField val PENDING = of("pending")

            @JvmField val PROCESSING = of("processing")

            @JvmField val RETURNED = of("returned")

            @JvmField val REVERSED = of("reversed")

            @JvmField val SENT = of("sent")

            @JvmField val STOPPED = of("stopped")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
            STOPPED,
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
            APPROVED,
            CANCELLED,
            COMPLETED,
            DENIED,
            FAILED,
            NEEDS_APPROVAL,
            PENDING,
            PROCESSING,
            RETURNED,
            REVERSED,
            SENT,
            STOPPED,
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
                APPROVED -> Value.APPROVED
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                DENIED -> Value.DENIED
                FAILED -> Value.FAILED
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                RETURNED -> Value.RETURNED
                REVERSED -> Value.REVERSED
                SENT -> Value.SENT
                STOPPED -> Value.STOPPED
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
                APPROVED -> Known.APPROVED
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                DENIED -> Known.DENIED
                FAILED -> Known.FAILED
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                RETURNED -> Known.RETURNED
                REVERSED -> Known.REVERSED
                SENT -> Known.SENT
                STOPPED -> Known.STOPPED
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

    /**
     * The account to which the originating of this payment should be attributed to. Can be a
     * `virtual_account` or `internal_account`.
     */
    @JsonDeserialize(using = UltimateOriginatingAccount.Deserializer::class)
    @JsonSerialize(using = UltimateOriginatingAccount.Serializer::class)
    class UltimateOriginatingAccount
    private constructor(
        private val virtual: VirtualAccount? = null,
        private val internalAccount: InternalAccount? = null,
        private val _json: JsonValue? = null,
    ) {

        fun virtual(): Optional<VirtualAccount> = Optional.ofNullable(virtual)

        fun internalAccount(): Optional<InternalAccount> = Optional.ofNullable(internalAccount)

        fun isVirtual(): Boolean = virtual != null

        fun isInternalAccount(): Boolean = internalAccount != null

        fun asVirtual(): VirtualAccount = virtual.getOrThrow("virtual")

        fun asInternalAccount(): InternalAccount = internalAccount.getOrThrow("internalAccount")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                virtual != null -> visitor.visitVirtual(virtual)
                internalAccount != null -> visitor.visitInternalAccount(internalAccount)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): UltimateOriginatingAccount = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitVirtual(virtual: VirtualAccount) {
                        virtual.validate()
                    }

                    override fun visitInternalAccount(internalAccount: InternalAccount) {
                        internalAccount.validate()
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitVirtual(virtual: VirtualAccount) = virtual.validity()

                    override fun visitInternalAccount(internalAccount: InternalAccount) =
                        internalAccount.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UltimateOriginatingAccount && virtual == other.virtual && internalAccount == other.internalAccount /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(virtual, internalAccount) /* spotless:on */

        override fun toString(): String =
            when {
                virtual != null -> "UltimateOriginatingAccount{virtual=$virtual}"
                internalAccount != null ->
                    "UltimateOriginatingAccount{internalAccount=$internalAccount}"
                _json != null -> "UltimateOriginatingAccount{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid UltimateOriginatingAccount")
            }

        companion object {

            @JvmStatic
            fun ofVirtual(virtual: VirtualAccount) = UltimateOriginatingAccount(virtual = virtual)

            @JvmStatic
            fun ofInternalAccount(internalAccount: InternalAccount) =
                UltimateOriginatingAccount(internalAccount = internalAccount)
        }

        /**
         * An interface that defines how to map each variant of [UltimateOriginatingAccount] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitVirtual(virtual: VirtualAccount): T

            fun visitInternalAccount(internalAccount: InternalAccount): T

            /**
             * Maps an unknown variant of [UltimateOriginatingAccount] to a value of type [T].
             *
             * An instance of [UltimateOriginatingAccount] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws ModernTreasuryInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ModernTreasuryInvalidDataException(
                    "Unknown UltimateOriginatingAccount: $json"
                )
            }
        }

        internal class Deserializer :
            BaseDeserializer<UltimateOriginatingAccount>(UltimateOriginatingAccount::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): UltimateOriginatingAccount {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<VirtualAccount>())?.let {
                                UltimateOriginatingAccount(virtual = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<InternalAccount>())?.let {
                                UltimateOriginatingAccount(internalAccount = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> UltimateOriginatingAccount(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<UltimateOriginatingAccount>(UltimateOriginatingAccount::class) {

            override fun serialize(
                value: UltimateOriginatingAccount,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.virtual != null -> generator.writeObject(value.virtual)
                    value.internalAccount != null -> generator.writeObject(value.internalAccount)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid UltimateOriginatingAccount")
                }
            }
        }
    }

    class UltimateOriginatingAccountType
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

            @JvmField val INTERNAL_ACCOUNT = of("internal_account")

            @JvmField val VIRTUAL_ACCOUNT = of("virtual_account")

            @JvmStatic fun of(value: String) = UltimateOriginatingAccountType(JsonField.of(value))
        }

        /** An enum containing [UltimateOriginatingAccountType]'s known values. */
        enum class Known {
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
        }

        /**
         * An enum containing [UltimateOriginatingAccountType]'s known values, as well as an
         * [_UNKNOWN] member.
         *
         * An instance of [UltimateOriginatingAccountType] can contain an unknown value in a couple
         * of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INTERNAL_ACCOUNT,
            VIRTUAL_ACCOUNT,
            /**
             * An enum member indicating that [UltimateOriginatingAccountType] was instantiated with
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
                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
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
                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                else ->
                    throw ModernTreasuryInvalidDataException(
                        "Unknown UltimateOriginatingAccountType: $value"
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

        private var validated: Boolean = false

        fun validate(): UltimateOriginatingAccountType = apply {
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

            return /* spotless:off */ other is UltimateOriginatingAccountType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentOrder && id == other.id && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && amount == other.amount && chargeBearer == other.chargeBearer && counterpartyId == other.counterpartyId && createdAt == other.createdAt && currency == other.currency && currentReturn == other.currentReturn && description == other.description && direction == other.direction && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && externalId == other.externalId && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && foreignExchangeRate == other.foreignExchangeRate && ledgerTransactionId == other.ledgerTransactionId && liveMode == other.liveMode && metadata == other.metadata && nsfProtected == other.nsfProtected && object_ == other.object_ && originatingAccountId == other.originatingAccountId && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccountId == other.receivingAccountId && receivingAccountType == other.receivingAccountType && referenceNumbers == other.referenceNumbers && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && status == other.status && subtype == other.subtype && transactionIds == other.transactionIds && type == other.type && ultimateOriginatingAccount == other.ultimateOriginatingAccount && ultimateOriginatingAccountId == other.ultimateOriginatingAccountId && ultimateOriginatingAccountType == other.ultimateOriginatingAccountType && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && updatedAt == other.updatedAt && vendorAttributes == other.vendorAttributes && vendorFailureReason == other.vendorFailureReason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accounting, accountingCategoryId, accountingLedgerClassId, amount, chargeBearer, counterpartyId, createdAt, currency, currentReturn, description, direction, effectiveDate, expiresAt, externalId, foreignExchangeContract, foreignExchangeIndicator, foreignExchangeRate, ledgerTransactionId, liveMode, metadata, nsfProtected, object_, originatingAccountId, originatingPartyName, priority, processAfter, purpose, receivingAccountId, receivingAccountType, referenceNumbers, remittanceInformation, sendRemittanceAdvice, statementDescriptor, status, subtype, transactionIds, type, ultimateOriginatingAccount, ultimateOriginatingAccountId, ultimateOriginatingAccountType, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, updatedAt, vendorAttributes, vendorFailureReason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentOrder{id=$id, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, createdAt=$createdAt, currency=$currency, currentReturn=$currentReturn, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, externalId=$externalId, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeRate=$foreignExchangeRate, ledgerTransactionId=$ledgerTransactionId, liveMode=$liveMode, metadata=$metadata, nsfProtected=$nsfProtected, object_=$object_, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccountId=$receivingAccountId, receivingAccountType=$receivingAccountType, referenceNumbers=$referenceNumbers, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, transactionIds=$transactionIds, type=$type, ultimateOriginatingAccount=$ultimateOriginatingAccount, ultimateOriginatingAccountId=$ultimateOriginatingAccountId, ultimateOriginatingAccountType=$ultimateOriginatingAccountType, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, updatedAt=$updatedAt, vendorAttributes=$vendorAttributes, vendorFailureReason=$vendorFailureReason, additionalProperties=$additionalProperties}"
}
