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
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** create invoice */
class InvoiceCreateParams
private constructor(
    private val body: InvoiceCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The ID of the counterparty receiving the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counterpartyId(): String = body.counterpartyId()

    /**
     * A future date by when the invoice needs to be paid.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dueDate(): OffsetDateTime = body.dueDate()

    /**
     * The ID of the internal account the invoice should be paid to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun originatingAccountId(): String = body.originatingAccountId()

    /**
     * When true, the invoice will progress to unpaid automatically and cannot be edited after
     * entering that state. If the invoice fails to progress to unpaid, the errors will be returned
     * and the invoice will not be created.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun autoAdvance(): Optional<Boolean> = body.autoAdvance()

    /**
     * The invoicer's contact details displayed at the top of the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun contactDetails(): Optional<List<ContactDetail>> = body.contactDetails()

    /**
     * The counterparty's billing address.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyBillingAddress(): Optional<CounterpartyBillingAddress> =
        body.counterpartyBillingAddress()

    /**
     * The counterparty's shipping address where physical goods should be delivered.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyShippingAddress(): Optional<CounterpartyShippingAddress> =
        body.counterpartyShippingAddress()

    /**
     * Currency that the invoice is denominated in. Defaults to `USD` if not provided.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Optional<Currency> = body.currency()

    /**
     * A free-form description of the invoice.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * When payment_method is automatic, the fallback payment method to use when an automatic
     * payment fails. One of `manual` or `ui`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fallbackPaymentMethod(): Optional<String> = body.fallbackPaymentMethod()

    /**
     * Whether to ingest the ledger_entries to populate the invoice line items. If this is false,
     * then a line item must be provided. If this is true, line_items must be empty. Ignored if
     * ledger_account_settlement_id is empty.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ingestLedgerEntries(): Optional<Boolean> = body.ingestLedgerEntries()

    /**
     * An array of invoice line items. The API supports a maximum of 50 invoice line items per
     * invoice. If a greater number of invoice line items is required, please contact support.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoiceLineItems(): Optional<List<InvoiceLineItemCreateRequest>> = body.invoiceLineItems()

    /**
     * The invoice issuer's business address.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun invoicerAddress(): Optional<InvoicerAddress> = body.invoicerAddress()

    /**
     * The ID of the virtual account the invoice should be paid to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccountSettlementId(): Optional<String> = body.ledgerAccountSettlementId()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Emails in addition to the counterparty email to send invoice status notifications to. At
     * least one email is required if notifications are enabled and the counterparty doesn't have an
     * email.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun notificationEmailAddresses(): Optional<List<String>> = body.notificationEmailAddresses()

    /**
     * If true, the invoice will send email notifications to the invoice recipients about invoice
     * status changes.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun notificationsEnabled(): Optional<Boolean> = body.notificationsEnabled()

    /**
     * Date transactions are to be posted to the participants' account. Defaults to the current
     * business day or the next business day if the current day is a bank holiday or weekend.
     * Format: yyyy-mm-dd.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentEffectiveDate(): Optional<LocalDate> = body.paymentEffectiveDate()

    /**
     * The method by which the invoice can be paid. `ui` will show the embedded payment collection
     * flow. `automatic` will automatically initiate payment based upon the account details of the
     * receiving_account id.\nIf the invoice amount is positive, the automatically initiated payment
     * order's direction will be debit. If the invoice amount is negative, the automatically
     * initiated payment order's direction will be credit. One of `manual`, `ui`, or `automatic`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethod(): Optional<PaymentMethod> = body.paymentMethod()

    /**
     * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`, `bacs`,
     * `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`, `signet`,
     * `provexchange`, `zengin`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentType(): Optional<PaymentOrderType> = body.paymentType()

    /**
     * The receiving account ID. Can be an `external_account`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun receivingAccountId(): Optional<String> = body.receivingAccountId()

    /**
     * The email of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun recipientEmail(): Optional<String> = body.recipientEmail()

    /**
     * The name of the recipient of the invoice. Leaving this value as null will fallback to using
     * the counterparty's name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun recipientName(): Optional<String> = body.recipientName()

    /**
     * Number of days after due date when overdue reminder emails will be sent out to invoice
     * recipients.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remindAfterOverdueDays(): Optional<List<Long>> = body.remindAfterOverdueDays()

    /**
     * The ID of the virtual account the invoice should be paid to.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun virtualAccountId(): Optional<String> = body.virtualAccountId()

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dueDate(): JsonField<OffsetDateTime> = body._dueDate()

    /**
     * Returns the raw JSON value of [originatingAccountId].
     *
     * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _originatingAccountId(): JsonField<String> = body._originatingAccountId()

    /**
     * Returns the raw JSON value of [autoAdvance].
     *
     * Unlike [autoAdvance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _autoAdvance(): JsonField<Boolean> = body._autoAdvance()

    /**
     * Returns the raw JSON value of [contactDetails].
     *
     * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactDetails(): JsonField<List<ContactDetail>> = body._contactDetails()

    /**
     * Returns the raw JSON value of [counterpartyBillingAddress].
     *
     * Unlike [counterpartyBillingAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _counterpartyBillingAddress(): JsonField<CounterpartyBillingAddress> =
        body._counterpartyBillingAddress()

    /**
     * Returns the raw JSON value of [counterpartyShippingAddress].
     *
     * Unlike [counterpartyShippingAddress], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _counterpartyShippingAddress(): JsonField<CounterpartyShippingAddress> =
        body._counterpartyShippingAddress()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<Currency> = body._currency()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [fallbackPaymentMethod].
     *
     * Unlike [fallbackPaymentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _fallbackPaymentMethod(): JsonField<String> = body._fallbackPaymentMethod()

    /**
     * Returns the raw JSON value of [ingestLedgerEntries].
     *
     * Unlike [ingestLedgerEntries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _ingestLedgerEntries(): JsonField<Boolean> = body._ingestLedgerEntries()

    /**
     * Returns the raw JSON value of [invoiceLineItems].
     *
     * Unlike [invoiceLineItems], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _invoiceLineItems(): JsonField<List<InvoiceLineItemCreateRequest>> =
        body._invoiceLineItems()

    /**
     * Returns the raw JSON value of [invoicerAddress].
     *
     * Unlike [invoicerAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoicerAddress(): JsonField<InvoicerAddress> = body._invoicerAddress()

    /**
     * Returns the raw JSON value of [ledgerAccountSettlementId].
     *
     * Unlike [ledgerAccountSettlementId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _ledgerAccountSettlementId(): JsonField<String> = body._ledgerAccountSettlementId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [notificationEmailAddresses].
     *
     * Unlike [notificationEmailAddresses], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _notificationEmailAddresses(): JsonField<List<String>> = body._notificationEmailAddresses()

    /**
     * Returns the raw JSON value of [notificationsEnabled].
     *
     * Unlike [notificationsEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _notificationsEnabled(): JsonField<Boolean> = body._notificationsEnabled()

    /**
     * Returns the raw JSON value of [paymentEffectiveDate].
     *
     * Unlike [paymentEffectiveDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _paymentEffectiveDate(): JsonField<LocalDate> = body._paymentEffectiveDate()

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentMethod(): JsonField<PaymentMethod> = body._paymentMethod()

    /**
     * Returns the raw JSON value of [paymentType].
     *
     * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentType(): JsonField<PaymentOrderType> = body._paymentType()

    /**
     * Returns the raw JSON value of [receivingAccountId].
     *
     * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _receivingAccountId(): JsonField<String> = body._receivingAccountId()

    /**
     * Returns the raw JSON value of [recipientEmail].
     *
     * Unlike [recipientEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recipientEmail(): JsonField<String> = body._recipientEmail()

    /**
     * Returns the raw JSON value of [recipientName].
     *
     * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _recipientName(): JsonField<String> = body._recipientName()

    /**
     * Returns the raw JSON value of [remindAfterOverdueDays].
     *
     * Unlike [remindAfterOverdueDays], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _remindAfterOverdueDays(): JsonField<List<Long>> = body._remindAfterOverdueDays()

    /**
     * Returns the raw JSON value of [virtualAccountId].
     *
     * Unlike [virtualAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _virtualAccountId(): JsonField<String> = body._virtualAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceCreateParams].
         *
         * The following fields are required:
         * ```java
         * .counterpartyId()
         * .dueDate()
         * .originatingAccountId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceCreateParams]. */
    class Builder internal constructor() {

        private var body: InvoiceCreateRequest.Builder = InvoiceCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceCreateParams: InvoiceCreateParams) = apply {
            body = invoiceCreateParams.body.toBuilder()
            additionalHeaders = invoiceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [counterpartyId]
         * - [dueDate]
         * - [originatingAccountId]
         * - [autoAdvance]
         * - [contactDetails]
         * - etc.
         */
        fun body(body: InvoiceCreateRequest) = apply { this.body = body.toBuilder() }

        /** The ID of the counterparty receiving the invoice. */
        fun counterpartyId(counterpartyId: String) = apply { body.counterpartyId(counterpartyId) }

        /**
         * Sets [Builder.counterpartyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            body.counterpartyId(counterpartyId)
        }

        /** A future date by when the invoice needs to be paid. */
        fun dueDate(dueDate: OffsetDateTime) = apply { body.dueDate(dueDate) }

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { body.dueDate(dueDate) }

        /** The ID of the internal account the invoice should be paid to. */
        fun originatingAccountId(originatingAccountId: String) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
            body.originatingAccountId(originatingAccountId)
        }

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         */
        fun autoAdvance(autoAdvance: Boolean?) = apply { body.autoAdvance(autoAdvance) }

        /**
         * Alias for [Builder.autoAdvance].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun autoAdvance(autoAdvance: Boolean) = autoAdvance(autoAdvance as Boolean?)

        /** Alias for calling [Builder.autoAdvance] with `autoAdvance.orElse(null)`. */
        fun autoAdvance(autoAdvance: Optional<Boolean>) = autoAdvance(autoAdvance.getOrNull())

        /**
         * Sets [Builder.autoAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoAdvance] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun autoAdvance(autoAdvance: JsonField<Boolean>) = apply { body.autoAdvance(autoAdvance) }

        /** The invoicer's contact details displayed at the top of the invoice. */
        fun contactDetails(contactDetails: List<ContactDetail>) = apply {
            body.contactDetails(contactDetails)
        }

        /**
         * Sets [Builder.contactDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactDetails] with a well-typed `List<ContactDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
            body.contactDetails(contactDetails)
        }

        /**
         * Adds a single [ContactDetail] to [contactDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContactDetail(contactDetail: ContactDetail) = apply {
            body.addContactDetail(contactDetail)
        }

        /** The counterparty's billing address. */
        fun counterpartyBillingAddress(counterpartyBillingAddress: CounterpartyBillingAddress?) =
            apply {
                body.counterpartyBillingAddress(counterpartyBillingAddress)
            }

        /**
         * Alias for calling [Builder.counterpartyBillingAddress] with
         * `counterpartyBillingAddress.orElse(null)`.
         */
        fun counterpartyBillingAddress(
            counterpartyBillingAddress: Optional<CounterpartyBillingAddress>
        ) = counterpartyBillingAddress(counterpartyBillingAddress.getOrNull())

        /**
         * Sets [Builder.counterpartyBillingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyBillingAddress] with a well-typed
         * [CounterpartyBillingAddress] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun counterpartyBillingAddress(
            counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>
        ) = apply { body.counterpartyBillingAddress(counterpartyBillingAddress) }

        /** The counterparty's shipping address where physical goods should be delivered. */
        fun counterpartyShippingAddress(counterpartyShippingAddress: CounterpartyShippingAddress?) =
            apply {
                body.counterpartyShippingAddress(counterpartyShippingAddress)
            }

        /**
         * Alias for calling [Builder.counterpartyShippingAddress] with
         * `counterpartyShippingAddress.orElse(null)`.
         */
        fun counterpartyShippingAddress(
            counterpartyShippingAddress: Optional<CounterpartyShippingAddress>
        ) = counterpartyShippingAddress(counterpartyShippingAddress.getOrNull())

        /**
         * Sets [Builder.counterpartyShippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterpartyShippingAddress] with a well-typed
         * [CounterpartyShippingAddress] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun counterpartyShippingAddress(
            counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>
        ) = apply { body.counterpartyShippingAddress(counterpartyShippingAddress) }

        /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
        fun currency(currency: Currency) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { body.currency(currency) }

        /** A free-form description of the invoice. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: String?) = apply {
            body.fallbackPaymentMethod(fallbackPaymentMethod)
        }

        /**
         * Alias for calling [Builder.fallbackPaymentMethod] with
         * `fallbackPaymentMethod.orElse(null)`.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: Optional<String>) =
            fallbackPaymentMethod(fallbackPaymentMethod.getOrNull())

        /**
         * Sets [Builder.fallbackPaymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fallbackPaymentMethod] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fallbackPaymentMethod(fallbackPaymentMethod: JsonField<String>) = apply {
            body.fallbackPaymentMethod(fallbackPaymentMethod)
        }

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: Boolean?) = apply {
            body.ingestLedgerEntries(ingestLedgerEntries)
        }

        /**
         * Alias for [Builder.ingestLedgerEntries].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: Boolean) =
            ingestLedgerEntries(ingestLedgerEntries as Boolean?)

        /**
         * Alias for calling [Builder.ingestLedgerEntries] with `ingestLedgerEntries.orElse(null)`.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: Optional<Boolean>) =
            ingestLedgerEntries(ingestLedgerEntries.getOrNull())

        /**
         * Sets [Builder.ingestLedgerEntries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ingestLedgerEntries] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ingestLedgerEntries(ingestLedgerEntries: JsonField<Boolean>) = apply {
            body.ingestLedgerEntries(ingestLedgerEntries)
        }

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         */
        fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>?) = apply {
            body.invoiceLineItems(invoiceLineItems)
        }

        /** Alias for calling [Builder.invoiceLineItems] with `invoiceLineItems.orElse(null)`. */
        fun invoiceLineItems(invoiceLineItems: Optional<List<InvoiceLineItemCreateRequest>>) =
            invoiceLineItems(invoiceLineItems.getOrNull())

        /**
         * Sets [Builder.invoiceLineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceLineItems] with a well-typed
         * `List<InvoiceLineItemCreateRequest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun invoiceLineItems(invoiceLineItems: JsonField<List<InvoiceLineItemCreateRequest>>) =
            apply {
                body.invoiceLineItems(invoiceLineItems)
            }

        /**
         * Adds a single [InvoiceLineItemCreateRequest] to [invoiceLineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInvoiceLineItem(invoiceLineItem: InvoiceLineItemCreateRequest) = apply {
            body.addInvoiceLineItem(invoiceLineItem)
        }

        /** The invoice issuer's business address. */
        fun invoicerAddress(invoicerAddress: InvoicerAddress?) = apply {
            body.invoicerAddress(invoicerAddress)
        }

        /** Alias for calling [Builder.invoicerAddress] with `invoicerAddress.orElse(null)`. */
        fun invoicerAddress(invoicerAddress: Optional<InvoicerAddress>) =
            invoicerAddress(invoicerAddress.getOrNull())

        /**
         * Sets [Builder.invoicerAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicerAddress] with a well-typed [InvoicerAddress]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoicerAddress(invoicerAddress: JsonField<InvoicerAddress>) = apply {
            body.invoicerAddress(invoicerAddress)
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) = apply {
            body.ledgerAccountSettlementId(ledgerAccountSettlementId)
        }

        /**
         * Alias for calling [Builder.ledgerAccountSettlementId] with
         * `ledgerAccountSettlementId.orElse(null)`.
         */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: Optional<String>) =
            ledgerAccountSettlementId(ledgerAccountSettlementId.getOrNull())

        /**
         * Sets [Builder.ledgerAccountSettlementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountSettlementId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ledgerAccountSettlementId(ledgerAccountSettlementId: JsonField<String>) = apply {
            body.ledgerAccountSettlementId(ledgerAccountSettlementId)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: List<String>?) = apply {
            body.notificationEmailAddresses(notificationEmailAddresses)
        }

        /**
         * Alias for calling [Builder.notificationEmailAddresses] with
         * `notificationEmailAddresses.orElse(null)`.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: Optional<List<String>>) =
            notificationEmailAddresses(notificationEmailAddresses.getOrNull())

        /**
         * Sets [Builder.notificationEmailAddresses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationEmailAddresses] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun notificationEmailAddresses(notificationEmailAddresses: JsonField<List<String>>) =
            apply {
                body.notificationEmailAddresses(notificationEmailAddresses)
            }

        /**
         * Adds a single [String] to [notificationEmailAddresses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNotificationEmailAddress(notificationEmailAddress: String) = apply {
            body.addNotificationEmailAddress(notificationEmailAddress)
        }

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         */
        fun notificationsEnabled(notificationsEnabled: Boolean) = apply {
            body.notificationsEnabled(notificationsEnabled)
        }

        /**
         * Sets [Builder.notificationsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notificationsEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notificationsEnabled(notificationsEnabled: JsonField<Boolean>) = apply {
            body.notificationsEnabled(notificationsEnabled)
        }

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: LocalDate) = apply {
            body.paymentEffectiveDate(paymentEffectiveDate)
        }

        /**
         * Sets [Builder.paymentEffectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentEffectiveDate] with a well-typed [LocalDate]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentEffectiveDate(paymentEffectiveDate: JsonField<LocalDate>) = apply {
            body.paymentEffectiveDate(paymentEffectiveDate)
        }

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         */
        fun paymentMethod(paymentMethod: PaymentMethod) = apply {
            body.paymentMethod(paymentMethod)
        }

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
            body.paymentMethod(paymentMethod)
        }

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         */
        fun paymentType(paymentType: PaymentOrderType) = apply { body.paymentType(paymentType) }

        /**
         * Sets [Builder.paymentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentType] with a well-typed [PaymentOrderType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentType(paymentType: JsonField<PaymentOrderType>) = apply {
            body.paymentType(paymentType)
        }

        /** The receiving account ID. Can be an `external_account`. */
        fun receivingAccountId(receivingAccountId: String) = apply {
            body.receivingAccountId(receivingAccountId)
        }

        /**
         * Sets [Builder.receivingAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.receivingAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
            body.receivingAccountId(receivingAccountId)
        }

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientEmail(recipientEmail: String?) = apply { body.recipientEmail(recipientEmail) }

        /** Alias for calling [Builder.recipientEmail] with `recipientEmail.orElse(null)`. */
        fun recipientEmail(recipientEmail: Optional<String>) =
            recipientEmail(recipientEmail.getOrNull())

        /**
         * Sets [Builder.recipientEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recipientEmail(recipientEmail: JsonField<String>) = apply {
            body.recipientEmail(recipientEmail)
        }

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         */
        fun recipientName(recipientName: String?) = apply { body.recipientName(recipientName) }

        /** Alias for calling [Builder.recipientName] with `recipientName.orElse(null)`. */
        fun recipientName(recipientName: Optional<String>) =
            recipientName(recipientName.getOrNull())

        /**
         * Sets [Builder.recipientName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipientName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipientName(recipientName: JsonField<String>) = apply {
            body.recipientName(recipientName)
        }

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>?) = apply {
            body.remindAfterOverdueDays(remindAfterOverdueDays)
        }

        /**
         * Alias for calling [Builder.remindAfterOverdueDays] with
         * `remindAfterOverdueDays.orElse(null)`.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: Optional<List<Long>>) =
            remindAfterOverdueDays(remindAfterOverdueDays.getOrNull())

        /**
         * Sets [Builder.remindAfterOverdueDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remindAfterOverdueDays] with a well-typed `List<Long>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun remindAfterOverdueDays(remindAfterOverdueDays: JsonField<List<Long>>) = apply {
            body.remindAfterOverdueDays(remindAfterOverdueDays)
        }

        /**
         * Adds a single [Long] to [remindAfterOverdueDays].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRemindAfterOverdueDay(remindAfterOverdueDay: Long) = apply {
            body.addRemindAfterOverdueDay(remindAfterOverdueDay)
        }

        /** The ID of the virtual account the invoice should be paid to. */
        fun virtualAccountId(virtualAccountId: String?) = apply {
            body.virtualAccountId(virtualAccountId)
        }

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
            body.virtualAccountId(virtualAccountId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        /**
         * Returns an immutable instance of [InvoiceCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .counterpartyId()
         * .dueDate()
         * .originatingAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceCreateParams =
            InvoiceCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): InvoiceCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class InvoiceCreateRequest
    private constructor(
        private val counterpartyId: JsonField<String>,
        private val dueDate: JsonField<OffsetDateTime>,
        private val originatingAccountId: JsonField<String>,
        private val autoAdvance: JsonField<Boolean>,
        private val contactDetails: JsonField<List<ContactDetail>>,
        private val counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>,
        private val counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>,
        private val currency: JsonField<Currency>,
        private val description: JsonField<String>,
        private val fallbackPaymentMethod: JsonField<String>,
        private val ingestLedgerEntries: JsonField<Boolean>,
        private val invoiceLineItems: JsonField<List<InvoiceLineItemCreateRequest>>,
        private val invoicerAddress: JsonField<InvoicerAddress>,
        private val ledgerAccountSettlementId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val notificationEmailAddresses: JsonField<List<String>>,
        private val notificationsEnabled: JsonField<Boolean>,
        private val paymentEffectiveDate: JsonField<LocalDate>,
        private val paymentMethod: JsonField<PaymentMethod>,
        private val paymentType: JsonField<PaymentOrderType>,
        private val receivingAccountId: JsonField<String>,
        private val recipientEmail: JsonField<String>,
        private val recipientName: JsonField<String>,
        private val remindAfterOverdueDays: JsonField<List<Long>>,
        private val virtualAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("due_date")
            @ExcludeMissing
            dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            originatingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auto_advance")
            @ExcludeMissing
            autoAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("contact_details")
            @ExcludeMissing
            contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
            @JsonProperty("counterparty_billing_address")
            @ExcludeMissing
            counterpartyBillingAddress: JsonField<CounterpartyBillingAddress> = JsonMissing.of(),
            @JsonProperty("counterparty_shipping_address")
            @ExcludeMissing
            counterpartyShippingAddress: JsonField<CounterpartyShippingAddress> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fallback_payment_method")
            @ExcludeMissing
            fallbackPaymentMethod: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ingest_ledger_entries")
            @ExcludeMissing
            ingestLedgerEntries: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("invoice_line_items")
            @ExcludeMissing
            invoiceLineItems: JsonField<List<InvoiceLineItemCreateRequest>> = JsonMissing.of(),
            @JsonProperty("invoicer_address")
            @ExcludeMissing
            invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of(),
            @JsonProperty("ledger_account_settlement_id")
            @ExcludeMissing
            ledgerAccountSettlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("notification_email_addresses")
            @ExcludeMissing
            notificationEmailAddresses: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("notifications_enabled")
            @ExcludeMissing
            notificationsEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_effective_date")
            @ExcludeMissing
            paymentEffectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("payment_method")
            @ExcludeMissing
            paymentMethod: JsonField<PaymentMethod> = JsonMissing.of(),
            @JsonProperty("payment_type")
            @ExcludeMissing
            paymentType: JsonField<PaymentOrderType> = JsonMissing.of(),
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            receivingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_email")
            @ExcludeMissing
            recipientEmail: JsonField<String> = JsonMissing.of(),
            @JsonProperty("recipient_name")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remind_after_overdue_days")
            @ExcludeMissing
            remindAfterOverdueDays: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("virtual_account_id")
            @ExcludeMissing
            virtualAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(
            counterpartyId,
            dueDate,
            originatingAccountId,
            autoAdvance,
            contactDetails,
            counterpartyBillingAddress,
            counterpartyShippingAddress,
            currency,
            description,
            fallbackPaymentMethod,
            ingestLedgerEntries,
            invoiceLineItems,
            invoicerAddress,
            ledgerAccountSettlementId,
            metadata,
            notificationEmailAddresses,
            notificationsEnabled,
            paymentEffectiveDate,
            paymentMethod,
            paymentType,
            receivingAccountId,
            recipientEmail,
            recipientName,
            remindAfterOverdueDays,
            virtualAccountId,
            mutableMapOf(),
        )

        /**
         * The ID of the counterparty receiving the invoice.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

        /**
         * A future date by when the invoice needs to be paid.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dueDate(): OffsetDateTime = dueDate.getRequired("due_date")

        /**
         * The ID of the internal account the invoice should be paid to.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun originatingAccountId(): String =
            originatingAccountId.getRequired("originating_account_id")

        /**
         * When true, the invoice will progress to unpaid automatically and cannot be edited after
         * entering that state. If the invoice fails to progress to unpaid, the errors will be
         * returned and the invoice will not be created.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun autoAdvance(): Optional<Boolean> =
            Optional.ofNullable(autoAdvance.getNullable("auto_advance"))

        /**
         * The invoicer's contact details displayed at the top of the invoice.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contactDetails(): Optional<List<ContactDetail>> =
            Optional.ofNullable(contactDetails.getNullable("contact_details"))

        /**
         * The counterparty's billing address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun counterpartyBillingAddress(): Optional<CounterpartyBillingAddress> =
            Optional.ofNullable(
                counterpartyBillingAddress.getNullable("counterparty_billing_address")
            )

        /**
         * The counterparty's shipping address where physical goods should be delivered.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun counterpartyShippingAddress(): Optional<CounterpartyShippingAddress> =
            Optional.ofNullable(
                counterpartyShippingAddress.getNullable("counterparty_shipping_address")
            )

        /**
         * Currency that the invoice is denominated in. Defaults to `USD` if not provided.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): Optional<Currency> = Optional.ofNullable(currency.getNullable("currency"))

        /**
         * A free-form description of the invoice.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * When payment_method is automatic, the fallback payment method to use when an automatic
         * payment fails. One of `manual` or `ui`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fallbackPaymentMethod(): Optional<String> =
            Optional.ofNullable(fallbackPaymentMethod.getNullable("fallback_payment_method"))

        /**
         * Whether to ingest the ledger_entries to populate the invoice line items. If this is
         * false, then a line item must be provided. If this is true, line_items must be empty.
         * Ignored if ledger_account_settlement_id is empty.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ingestLedgerEntries(): Optional<Boolean> =
            Optional.ofNullable(ingestLedgerEntries.getNullable("ingest_ledger_entries"))

        /**
         * An array of invoice line items. The API supports a maximum of 50 invoice line items per
         * invoice. If a greater number of invoice line items is required, please contact support.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun invoiceLineItems(): Optional<List<InvoiceLineItemCreateRequest>> =
            Optional.ofNullable(invoiceLineItems.getNullable("invoice_line_items"))

        /**
         * The invoice issuer's business address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun invoicerAddress(): Optional<InvoicerAddress> =
            Optional.ofNullable(invoicerAddress.getNullable("invoicer_address"))

        /**
         * The ID of the virtual account the invoice should be paid to.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerAccountSettlementId(): Optional<String> =
            Optional.ofNullable(
                ledgerAccountSettlementId.getNullable("ledger_account_settlement_id")
            )

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * Emails in addition to the counterparty email to send invoice status notifications to. At
         * least one email is required if notifications are enabled and the counterparty doesn't
         * have an email.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun notificationEmailAddresses(): Optional<List<String>> =
            Optional.ofNullable(
                notificationEmailAddresses.getNullable("notification_email_addresses")
            )

        /**
         * If true, the invoice will send email notifications to the invoice recipients about
         * invoice status changes.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun notificationsEnabled(): Optional<Boolean> =
            Optional.ofNullable(notificationsEnabled.getNullable("notifications_enabled"))

        /**
         * Date transactions are to be posted to the participants' account. Defaults to the current
         * business day or the next business day if the current day is a bank holiday or weekend.
         * Format: yyyy-mm-dd.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentEffectiveDate(): Optional<LocalDate> =
            Optional.ofNullable(paymentEffectiveDate.getNullable("payment_effective_date"))

        /**
         * The method by which the invoice can be paid. `ui` will show the embedded payment
         * collection flow. `automatic` will automatically initiate payment based upon the account
         * details of the receiving_account id.\nIf the invoice amount is positive, the
         * automatically initiated payment order's direction will be debit. If the invoice amount is
         * negative, the automatically initiated payment order's direction will be credit. One of
         * `manual`, `ui`, or `automatic`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentMethod(): Optional<PaymentMethod> =
            Optional.ofNullable(paymentMethod.getNullable("payment_method"))

        /**
         * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
         * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
         * `signet`, `provexchange`, `zengin`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentType(): Optional<PaymentOrderType> =
            Optional.ofNullable(paymentType.getNullable("payment_type"))

        /**
         * The receiving account ID. Can be an `external_account`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun receivingAccountId(): Optional<String> =
            Optional.ofNullable(receivingAccountId.getNullable("receiving_account_id"))

        /**
         * The email of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun recipientEmail(): Optional<String> =
            Optional.ofNullable(recipientEmail.getNullable("recipient_email"))

        /**
         * The name of the recipient of the invoice. Leaving this value as null will fallback to
         * using the counterparty's name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun recipientName(): Optional<String> =
            Optional.ofNullable(recipientName.getNullable("recipient_name"))

        /**
         * Number of days after due date when overdue reminder emails will be sent out to invoice
         * recipients.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remindAfterOverdueDays(): Optional<List<Long>> =
            Optional.ofNullable(remindAfterOverdueDays.getNullable("remind_after_overdue_days"))

        /**
         * The ID of the virtual account the invoice should be paid to.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun virtualAccountId(): Optional<String> =
            Optional.ofNullable(virtualAccountId.getNullable("virtual_account_id"))

        /**
         * Returns the raw JSON value of [counterpartyId].
         *
         * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun _counterpartyId(): JsonField<String> = counterpartyId

        /**
         * Returns the raw JSON value of [dueDate].
         *
         * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_date")
        @ExcludeMissing
        fun _dueDate(): JsonField<OffsetDateTime> = dueDate

        /**
         * Returns the raw JSON value of [originatingAccountId].
         *
         * Unlike [originatingAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId(): JsonField<String> = originatingAccountId

        /**
         * Returns the raw JSON value of [autoAdvance].
         *
         * Unlike [autoAdvance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("auto_advance")
        @ExcludeMissing
        fun _autoAdvance(): JsonField<Boolean> = autoAdvance

        /**
         * Returns the raw JSON value of [contactDetails].
         *
         * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): JsonField<List<ContactDetail>> = contactDetails

        /**
         * Returns the raw JSON value of [counterpartyBillingAddress].
         *
         * Unlike [counterpartyBillingAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("counterparty_billing_address")
        @ExcludeMissing
        fun _counterpartyBillingAddress(): JsonField<CounterpartyBillingAddress> =
            counterpartyBillingAddress

        /**
         * Returns the raw JSON value of [counterpartyShippingAddress].
         *
         * Unlike [counterpartyShippingAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("counterparty_shipping_address")
        @ExcludeMissing
        fun _counterpartyShippingAddress(): JsonField<CounterpartyShippingAddress> =
            counterpartyShippingAddress

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [fallbackPaymentMethod].
         *
         * Unlike [fallbackPaymentMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fallback_payment_method")
        @ExcludeMissing
        fun _fallbackPaymentMethod(): JsonField<String> = fallbackPaymentMethod

        /**
         * Returns the raw JSON value of [ingestLedgerEntries].
         *
         * Unlike [ingestLedgerEntries], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ingest_ledger_entries")
        @ExcludeMissing
        fun _ingestLedgerEntries(): JsonField<Boolean> = ingestLedgerEntries

        /**
         * Returns the raw JSON value of [invoiceLineItems].
         *
         * Unlike [invoiceLineItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_line_items")
        @ExcludeMissing
        fun _invoiceLineItems(): JsonField<List<InvoiceLineItemCreateRequest>> = invoiceLineItems

        /**
         * Returns the raw JSON value of [invoicerAddress].
         *
         * Unlike [invoicerAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoicer_address")
        @ExcludeMissing
        fun _invoicerAddress(): JsonField<InvoicerAddress> = invoicerAddress

        /**
         * Returns the raw JSON value of [ledgerAccountSettlementId].
         *
         * Unlike [ledgerAccountSettlementId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_account_settlement_id")
        @ExcludeMissing
        fun _ledgerAccountSettlementId(): JsonField<String> = ledgerAccountSettlementId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [notificationEmailAddresses].
         *
         * Unlike [notificationEmailAddresses], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("notification_email_addresses")
        @ExcludeMissing
        fun _notificationEmailAddresses(): JsonField<List<String>> = notificationEmailAddresses

        /**
         * Returns the raw JSON value of [notificationsEnabled].
         *
         * Unlike [notificationsEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("notifications_enabled")
        @ExcludeMissing
        fun _notificationsEnabled(): JsonField<Boolean> = notificationsEnabled

        /**
         * Returns the raw JSON value of [paymentEffectiveDate].
         *
         * Unlike [paymentEffectiveDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_effective_date")
        @ExcludeMissing
        fun _paymentEffectiveDate(): JsonField<LocalDate> = paymentEffectiveDate

        /**
         * Returns the raw JSON value of [paymentMethod].
         *
         * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_method")
        @ExcludeMissing
        fun _paymentMethod(): JsonField<PaymentMethod> = paymentMethod

        /**
         * Returns the raw JSON value of [paymentType].
         *
         * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentOrderType> = paymentType

        /**
         * Returns the raw JSON value of [receivingAccountId].
         *
         * Unlike [receivingAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("receiving_account_id")
        @ExcludeMissing
        fun _receivingAccountId(): JsonField<String> = receivingAccountId

        /**
         * Returns the raw JSON value of [recipientEmail].
         *
         * Unlike [recipientEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipient_email")
        @ExcludeMissing
        fun _recipientEmail(): JsonField<String> = recipientEmail

        /**
         * Returns the raw JSON value of [recipientName].
         *
         * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /**
         * Returns the raw JSON value of [remindAfterOverdueDays].
         *
         * Unlike [remindAfterOverdueDays], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remind_after_overdue_days")
        @ExcludeMissing
        fun _remindAfterOverdueDays(): JsonField<List<Long>> = remindAfterOverdueDays

        /**
         * Returns the raw JSON value of [virtualAccountId].
         *
         * Unlike [virtualAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("virtual_account_id")
        @ExcludeMissing
        fun _virtualAccountId(): JsonField<String> = virtualAccountId

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
             * Returns a mutable builder for constructing an instance of [InvoiceCreateRequest].
             *
             * The following fields are required:
             * ```java
             * .counterpartyId()
             * .dueDate()
             * .originatingAccountId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InvoiceCreateRequest]. */
        class Builder internal constructor() {

            private var counterpartyId: JsonField<String>? = null
            private var dueDate: JsonField<OffsetDateTime>? = null
            private var originatingAccountId: JsonField<String>? = null
            private var autoAdvance: JsonField<Boolean> = JsonMissing.of()
            private var contactDetails: JsonField<MutableList<ContactDetail>>? = null
            private var counterpartyBillingAddress: JsonField<CounterpartyBillingAddress> =
                JsonMissing.of()
            private var counterpartyShippingAddress: JsonField<CounterpartyShippingAddress> =
                JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var fallbackPaymentMethod: JsonField<String> = JsonMissing.of()
            private var ingestLedgerEntries: JsonField<Boolean> = JsonMissing.of()
            private var invoiceLineItems: JsonField<MutableList<InvoiceLineItemCreateRequest>>? =
                null
            private var invoicerAddress: JsonField<InvoicerAddress> = JsonMissing.of()
            private var ledgerAccountSettlementId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var notificationEmailAddresses: JsonField<MutableList<String>>? = null
            private var notificationsEnabled: JsonField<Boolean> = JsonMissing.of()
            private var paymentEffectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var paymentMethod: JsonField<PaymentMethod> = JsonMissing.of()
            private var paymentType: JsonField<PaymentOrderType> = JsonMissing.of()
            private var receivingAccountId: JsonField<String> = JsonMissing.of()
            private var recipientEmail: JsonField<String> = JsonMissing.of()
            private var recipientName: JsonField<String> = JsonMissing.of()
            private var remindAfterOverdueDays: JsonField<MutableList<Long>>? = null
            private var virtualAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceCreateRequest: InvoiceCreateRequest) = apply {
                counterpartyId = invoiceCreateRequest.counterpartyId
                dueDate = invoiceCreateRequest.dueDate
                originatingAccountId = invoiceCreateRequest.originatingAccountId
                autoAdvance = invoiceCreateRequest.autoAdvance
                contactDetails = invoiceCreateRequest.contactDetails.map { it.toMutableList() }
                counterpartyBillingAddress = invoiceCreateRequest.counterpartyBillingAddress
                counterpartyShippingAddress = invoiceCreateRequest.counterpartyShippingAddress
                currency = invoiceCreateRequest.currency
                description = invoiceCreateRequest.description
                fallbackPaymentMethod = invoiceCreateRequest.fallbackPaymentMethod
                ingestLedgerEntries = invoiceCreateRequest.ingestLedgerEntries
                invoiceLineItems = invoiceCreateRequest.invoiceLineItems.map { it.toMutableList() }
                invoicerAddress = invoiceCreateRequest.invoicerAddress
                ledgerAccountSettlementId = invoiceCreateRequest.ledgerAccountSettlementId
                metadata = invoiceCreateRequest.metadata
                notificationEmailAddresses =
                    invoiceCreateRequest.notificationEmailAddresses.map { it.toMutableList() }
                notificationsEnabled = invoiceCreateRequest.notificationsEnabled
                paymentEffectiveDate = invoiceCreateRequest.paymentEffectiveDate
                paymentMethod = invoiceCreateRequest.paymentMethod
                paymentType = invoiceCreateRequest.paymentType
                receivingAccountId = invoiceCreateRequest.receivingAccountId
                recipientEmail = invoiceCreateRequest.recipientEmail
                recipientName = invoiceCreateRequest.recipientName
                remindAfterOverdueDays =
                    invoiceCreateRequest.remindAfterOverdueDays.map { it.toMutableList() }
                virtualAccountId = invoiceCreateRequest.virtualAccountId
                additionalProperties = invoiceCreateRequest.additionalProperties.toMutableMap()
            }

            /** The ID of the counterparty receiving the invoice. */
            fun counterpartyId(counterpartyId: String) =
                counterpartyId(JsonField.of(counterpartyId))

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

            /** A future date by when the invoice needs to be paid. */
            fun dueDate(dueDate: OffsetDateTime) = dueDate(JsonField.of(dueDate))

            /**
             * Sets [Builder.dueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

            /** The ID of the internal account the invoice should be paid to. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /**
             * Sets [Builder.originatingAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.originatingAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * When true, the invoice will progress to unpaid automatically and cannot be edited
             * after entering that state. If the invoice fails to progress to unpaid, the errors
             * will be returned and the invoice will not be created.
             */
            fun autoAdvance(autoAdvance: Boolean?) = autoAdvance(JsonField.ofNullable(autoAdvance))

            /**
             * Alias for [Builder.autoAdvance].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun autoAdvance(autoAdvance: Boolean) = autoAdvance(autoAdvance as Boolean?)

            /** Alias for calling [Builder.autoAdvance] with `autoAdvance.orElse(null)`. */
            fun autoAdvance(autoAdvance: Optional<Boolean>) = autoAdvance(autoAdvance.getOrNull())

            /**
             * Sets [Builder.autoAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoAdvance] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoAdvance(autoAdvance: JsonField<Boolean>) = apply {
                this.autoAdvance = autoAdvance
            }

            /** The invoicer's contact details displayed at the top of the invoice. */
            fun contactDetails(contactDetails: List<ContactDetail>) =
                contactDetails(JsonField.of(contactDetails))

            /**
             * Sets [Builder.contactDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactDetails] with a well-typed
             * `List<ContactDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
                this.contactDetails = contactDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [ContactDetail] to [contactDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContactDetail(contactDetail: ContactDetail) = apply {
                contactDetails =
                    (contactDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contactDetails", it).add(contactDetail)
                    }
            }

            /** The counterparty's billing address. */
            fun counterpartyBillingAddress(
                counterpartyBillingAddress: CounterpartyBillingAddress?
            ) = counterpartyBillingAddress(JsonField.ofNullable(counterpartyBillingAddress))

            /**
             * Alias for calling [Builder.counterpartyBillingAddress] with
             * `counterpartyBillingAddress.orElse(null)`.
             */
            fun counterpartyBillingAddress(
                counterpartyBillingAddress: Optional<CounterpartyBillingAddress>
            ) = counterpartyBillingAddress(counterpartyBillingAddress.getOrNull())

            /**
             * Sets [Builder.counterpartyBillingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterpartyBillingAddress] with a well-typed
             * [CounterpartyBillingAddress] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun counterpartyBillingAddress(
                counterpartyBillingAddress: JsonField<CounterpartyBillingAddress>
            ) = apply { this.counterpartyBillingAddress = counterpartyBillingAddress }

            /** The counterparty's shipping address where physical goods should be delivered. */
            fun counterpartyShippingAddress(
                counterpartyShippingAddress: CounterpartyShippingAddress?
            ) = counterpartyShippingAddress(JsonField.ofNullable(counterpartyShippingAddress))

            /**
             * Alias for calling [Builder.counterpartyShippingAddress] with
             * `counterpartyShippingAddress.orElse(null)`.
             */
            fun counterpartyShippingAddress(
                counterpartyShippingAddress: Optional<CounterpartyShippingAddress>
            ) = counterpartyShippingAddress(counterpartyShippingAddress.getOrNull())

            /**
             * Sets [Builder.counterpartyShippingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterpartyShippingAddress] with a well-typed
             * [CounterpartyShippingAddress] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun counterpartyShippingAddress(
                counterpartyShippingAddress: JsonField<CounterpartyShippingAddress>
            ) = apply { this.counterpartyShippingAddress = counterpartyShippingAddress }

            /** Currency that the invoice is denominated in. Defaults to `USD` if not provided. */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** A free-form description of the invoice. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * When payment_method is automatic, the fallback payment method to use when an
             * automatic payment fails. One of `manual` or `ui`.
             */
            fun fallbackPaymentMethod(fallbackPaymentMethod: String?) =
                fallbackPaymentMethod(JsonField.ofNullable(fallbackPaymentMethod))

            /**
             * Alias for calling [Builder.fallbackPaymentMethod] with
             * `fallbackPaymentMethod.orElse(null)`.
             */
            fun fallbackPaymentMethod(fallbackPaymentMethod: Optional<String>) =
                fallbackPaymentMethod(fallbackPaymentMethod.getOrNull())

            /**
             * Sets [Builder.fallbackPaymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fallbackPaymentMethod] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun fallbackPaymentMethod(fallbackPaymentMethod: JsonField<String>) = apply {
                this.fallbackPaymentMethod = fallbackPaymentMethod
            }

            /**
             * Whether to ingest the ledger_entries to populate the invoice line items. If this is
             * false, then a line item must be provided. If this is true, line_items must be empty.
             * Ignored if ledger_account_settlement_id is empty.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: Boolean?) =
                ingestLedgerEntries(JsonField.ofNullable(ingestLedgerEntries))

            /**
             * Alias for [Builder.ingestLedgerEntries].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: Boolean) =
                ingestLedgerEntries(ingestLedgerEntries as Boolean?)

            /**
             * Alias for calling [Builder.ingestLedgerEntries] with
             * `ingestLedgerEntries.orElse(null)`.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: Optional<Boolean>) =
                ingestLedgerEntries(ingestLedgerEntries.getOrNull())

            /**
             * Sets [Builder.ingestLedgerEntries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ingestLedgerEntries] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ingestLedgerEntries(ingestLedgerEntries: JsonField<Boolean>) = apply {
                this.ingestLedgerEntries = ingestLedgerEntries
            }

            /**
             * An array of invoice line items. The API supports a maximum of 50 invoice line items
             * per invoice. If a greater number of invoice line items is required, please contact
             * support.
             */
            fun invoiceLineItems(invoiceLineItems: List<InvoiceLineItemCreateRequest>?) =
                invoiceLineItems(JsonField.ofNullable(invoiceLineItems))

            /**
             * Alias for calling [Builder.invoiceLineItems] with `invoiceLineItems.orElse(null)`.
             */
            fun invoiceLineItems(invoiceLineItems: Optional<List<InvoiceLineItemCreateRequest>>) =
                invoiceLineItems(invoiceLineItems.getOrNull())

            /**
             * Sets [Builder.invoiceLineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceLineItems] with a well-typed
             * `List<InvoiceLineItemCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun invoiceLineItems(invoiceLineItems: JsonField<List<InvoiceLineItemCreateRequest>>) =
                apply {
                    this.invoiceLineItems = invoiceLineItems.map { it.toMutableList() }
                }

            /**
             * Adds a single [InvoiceLineItemCreateRequest] to [invoiceLineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInvoiceLineItem(invoiceLineItem: InvoiceLineItemCreateRequest) = apply {
                invoiceLineItems =
                    (invoiceLineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("invoiceLineItems", it).add(invoiceLineItem)
                    }
            }

            /** The invoice issuer's business address. */
            fun invoicerAddress(invoicerAddress: InvoicerAddress?) =
                invoicerAddress(JsonField.ofNullable(invoicerAddress))

            /** Alias for calling [Builder.invoicerAddress] with `invoicerAddress.orElse(null)`. */
            fun invoicerAddress(invoicerAddress: Optional<InvoicerAddress>) =
                invoicerAddress(invoicerAddress.getOrNull())

            /**
             * Sets [Builder.invoicerAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoicerAddress] with a well-typed [InvoicerAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoicerAddress(invoicerAddress: JsonField<InvoicerAddress>) = apply {
                this.invoicerAddress = invoicerAddress
            }

            /** The ID of the virtual account the invoice should be paid to. */
            fun ledgerAccountSettlementId(ledgerAccountSettlementId: String?) =
                ledgerAccountSettlementId(JsonField.ofNullable(ledgerAccountSettlementId))

            /**
             * Alias for calling [Builder.ledgerAccountSettlementId] with
             * `ledgerAccountSettlementId.orElse(null)`.
             */
            fun ledgerAccountSettlementId(ledgerAccountSettlementId: Optional<String>) =
                ledgerAccountSettlementId(ledgerAccountSettlementId.getOrNull())

            /**
             * Sets [Builder.ledgerAccountSettlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountSettlementId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ledgerAccountSettlementId(ledgerAccountSettlementId: JsonField<String>) = apply {
                this.ledgerAccountSettlementId = ledgerAccountSettlementId
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * Emails in addition to the counterparty email to send invoice status notifications to.
             * At least one email is required if notifications are enabled and the counterparty
             * doesn't have an email.
             */
            fun notificationEmailAddresses(notificationEmailAddresses: List<String>?) =
                notificationEmailAddresses(JsonField.ofNullable(notificationEmailAddresses))

            /**
             * Alias for calling [Builder.notificationEmailAddresses] with
             * `notificationEmailAddresses.orElse(null)`.
             */
            fun notificationEmailAddresses(notificationEmailAddresses: Optional<List<String>>) =
                notificationEmailAddresses(notificationEmailAddresses.getOrNull())

            /**
             * Sets [Builder.notificationEmailAddresses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notificationEmailAddresses] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun notificationEmailAddresses(notificationEmailAddresses: JsonField<List<String>>) =
                apply {
                    this.notificationEmailAddresses =
                        notificationEmailAddresses.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [notificationEmailAddresses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addNotificationEmailAddress(notificationEmailAddress: String) = apply {
                notificationEmailAddresses =
                    (notificationEmailAddresses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("notificationEmailAddresses", it).add(notificationEmailAddress)
                    }
            }

            /**
             * If true, the invoice will send email notifications to the invoice recipients about
             * invoice status changes.
             */
            fun notificationsEnabled(notificationsEnabled: Boolean) =
                notificationsEnabled(JsonField.of(notificationsEnabled))

            /**
             * Sets [Builder.notificationsEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notificationsEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun notificationsEnabled(notificationsEnabled: JsonField<Boolean>) = apply {
                this.notificationsEnabled = notificationsEnabled
            }

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun paymentEffectiveDate(paymentEffectiveDate: LocalDate) =
                paymentEffectiveDate(JsonField.of(paymentEffectiveDate))

            /**
             * Sets [Builder.paymentEffectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentEffectiveDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentEffectiveDate(paymentEffectiveDate: JsonField<LocalDate>) = apply {
                this.paymentEffectiveDate = paymentEffectiveDate
            }

            /**
             * The method by which the invoice can be paid. `ui` will show the embedded payment
             * collection flow. `automatic` will automatically initiate payment based upon the
             * account details of the receiving_account id.\nIf the invoice amount is positive, the
             * automatically initiated payment order's direction will be debit. If the invoice
             * amount is negative, the automatically initiated payment order's direction will be
             * credit. One of `manual`, `ui`, or `automatic`.
             */
            fun paymentMethod(paymentMethod: PaymentMethod) =
                paymentMethod(JsonField.of(paymentMethod))

            /**
             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethod] with a well-typed [PaymentMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentMethod(paymentMethod: JsonField<PaymentMethod>) = apply {
                this.paymentMethod = paymentMethod
            }

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun paymentType(paymentType: PaymentOrderType) = paymentType(JsonField.of(paymentType))

            /**
             * Sets [Builder.paymentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentType] with a well-typed [PaymentOrderType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentType(paymentType: JsonField<PaymentOrderType>) = apply {
                this.paymentType = paymentType
            }

            /** The receiving account ID. Can be an `external_account`. */
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

            /**
             * The email of the recipient of the invoice. Leaving this value as null will fallback
             * to using the counterparty's name.
             */
            fun recipientEmail(recipientEmail: String?) =
                recipientEmail(JsonField.ofNullable(recipientEmail))

            /** Alias for calling [Builder.recipientEmail] with `recipientEmail.orElse(null)`. */
            fun recipientEmail(recipientEmail: Optional<String>) =
                recipientEmail(recipientEmail.getOrNull())

            /**
             * Sets [Builder.recipientEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientEmail(recipientEmail: JsonField<String>) = apply {
                this.recipientEmail = recipientEmail
            }

            /**
             * The name of the recipient of the invoice. Leaving this value as null will fallback to
             * using the counterparty's name.
             */
            fun recipientName(recipientName: String?) =
                recipientName(JsonField.ofNullable(recipientName))

            /** Alias for calling [Builder.recipientName] with `recipientName.orElse(null)`. */
            fun recipientName(recipientName: Optional<String>) =
                recipientName(recipientName.getOrNull())

            /**
             * Sets [Builder.recipientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /**
             * Number of days after due date when overdue reminder emails will be sent out to
             * invoice recipients.
             */
            fun remindAfterOverdueDays(remindAfterOverdueDays: List<Long>?) =
                remindAfterOverdueDays(JsonField.ofNullable(remindAfterOverdueDays))

            /**
             * Alias for calling [Builder.remindAfterOverdueDays] with
             * `remindAfterOverdueDays.orElse(null)`.
             */
            fun remindAfterOverdueDays(remindAfterOverdueDays: Optional<List<Long>>) =
                remindAfterOverdueDays(remindAfterOverdueDays.getOrNull())

            /**
             * Sets [Builder.remindAfterOverdueDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remindAfterOverdueDays] with a well-typed
             * `List<Long>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun remindAfterOverdueDays(remindAfterOverdueDays: JsonField<List<Long>>) = apply {
                this.remindAfterOverdueDays = remindAfterOverdueDays.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [remindAfterOverdueDays].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRemindAfterOverdueDay(remindAfterOverdueDay: Long) = apply {
                remindAfterOverdueDays =
                    (remindAfterOverdueDays ?: JsonField.of(mutableListOf())).also {
                        checkKnown("remindAfterOverdueDays", it).add(remindAfterOverdueDay)
                    }
            }

            /** The ID of the virtual account the invoice should be paid to. */
            fun virtualAccountId(virtualAccountId: String?) =
                virtualAccountId(JsonField.ofNullable(virtualAccountId))

            /**
             * Alias for calling [Builder.virtualAccountId] with `virtualAccountId.orElse(null)`.
             */
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
             * Returns an immutable instance of [InvoiceCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .counterpartyId()
             * .dueDate()
             * .originatingAccountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InvoiceCreateRequest =
                InvoiceCreateRequest(
                    checkRequired("counterpartyId", counterpartyId),
                    checkRequired("dueDate", dueDate),
                    checkRequired("originatingAccountId", originatingAccountId),
                    autoAdvance,
                    (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    counterpartyBillingAddress,
                    counterpartyShippingAddress,
                    currency,
                    description,
                    fallbackPaymentMethod,
                    ingestLedgerEntries,
                    (invoiceLineItems ?: JsonMissing.of()).map { it.toImmutable() },
                    invoicerAddress,
                    ledgerAccountSettlementId,
                    metadata,
                    (notificationEmailAddresses ?: JsonMissing.of()).map { it.toImmutable() },
                    notificationsEnabled,
                    paymentEffectiveDate,
                    paymentMethod,
                    paymentType,
                    receivingAccountId,
                    recipientEmail,
                    recipientName,
                    (remindAfterOverdueDays ?: JsonMissing.of()).map { it.toImmutable() },
                    virtualAccountId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InvoiceCreateRequest = apply {
            if (validated) {
                return@apply
            }

            counterpartyId()
            dueDate()
            originatingAccountId()
            autoAdvance()
            contactDetails().ifPresent { it.forEach { it.validate() } }
            counterpartyBillingAddress().ifPresent { it.validate() }
            counterpartyShippingAddress().ifPresent { it.validate() }
            currency().ifPresent { it.validate() }
            description()
            fallbackPaymentMethod()
            ingestLedgerEntries()
            invoiceLineItems().ifPresent { it.forEach { it.validate() } }
            invoicerAddress().ifPresent { it.validate() }
            ledgerAccountSettlementId()
            metadata().ifPresent { it.validate() }
            notificationEmailAddresses()
            notificationsEnabled()
            paymentEffectiveDate()
            paymentMethod().ifPresent { it.validate() }
            paymentType().ifPresent { it.validate() }
            receivingAccountId()
            recipientEmail()
            recipientName()
            remindAfterOverdueDays()
            virtualAccountId()
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
            (if (counterpartyId.asKnown().isPresent) 1 else 0) +
                (if (dueDate.asKnown().isPresent) 1 else 0) +
                (if (originatingAccountId.asKnown().isPresent) 1 else 0) +
                (if (autoAdvance.asKnown().isPresent) 1 else 0) +
                (contactDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (counterpartyBillingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (counterpartyShippingAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (fallbackPaymentMethod.asKnown().isPresent) 1 else 0) +
                (if (ingestLedgerEntries.asKnown().isPresent) 1 else 0) +
                (invoiceLineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (invoicerAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ledgerAccountSettlementId.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (notificationEmailAddresses.asKnown().getOrNull()?.size ?: 0) +
                (if (notificationsEnabled.asKnown().isPresent) 1 else 0) +
                (if (paymentEffectiveDate.asKnown().isPresent) 1 else 0) +
                (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (receivingAccountId.asKnown().isPresent) 1 else 0) +
                (if (recipientEmail.asKnown().isPresent) 1 else 0) +
                (if (recipientName.asKnown().isPresent) 1 else 0) +
                (remindAfterOverdueDays.asKnown().getOrNull()?.size ?: 0) +
                (if (virtualAccountId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceCreateRequest && counterpartyId == other.counterpartyId && dueDate == other.dueDate && originatingAccountId == other.originatingAccountId && autoAdvance == other.autoAdvance && contactDetails == other.contactDetails && counterpartyBillingAddress == other.counterpartyBillingAddress && counterpartyShippingAddress == other.counterpartyShippingAddress && currency == other.currency && description == other.description && fallbackPaymentMethod == other.fallbackPaymentMethod && ingestLedgerEntries == other.ingestLedgerEntries && invoiceLineItems == other.invoiceLineItems && invoicerAddress == other.invoicerAddress && ledgerAccountSettlementId == other.ledgerAccountSettlementId && metadata == other.metadata && notificationEmailAddresses == other.notificationEmailAddresses && notificationsEnabled == other.notificationsEnabled && paymentEffectiveDate == other.paymentEffectiveDate && paymentMethod == other.paymentMethod && paymentType == other.paymentType && receivingAccountId == other.receivingAccountId && recipientEmail == other.recipientEmail && recipientName == other.recipientName && remindAfterOverdueDays == other.remindAfterOverdueDays && virtualAccountId == other.virtualAccountId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterpartyId, dueDate, originatingAccountId, autoAdvance, contactDetails, counterpartyBillingAddress, counterpartyShippingAddress, currency, description, fallbackPaymentMethod, ingestLedgerEntries, invoiceLineItems, invoicerAddress, ledgerAccountSettlementId, metadata, notificationEmailAddresses, notificationsEnabled, paymentEffectiveDate, paymentMethod, paymentType, receivingAccountId, recipientEmail, recipientName, remindAfterOverdueDays, virtualAccountId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceCreateRequest{counterpartyId=$counterpartyId, dueDate=$dueDate, originatingAccountId=$originatingAccountId, autoAdvance=$autoAdvance, contactDetails=$contactDetails, counterpartyBillingAddress=$counterpartyBillingAddress, counterpartyShippingAddress=$counterpartyShippingAddress, currency=$currency, description=$description, fallbackPaymentMethod=$fallbackPaymentMethod, ingestLedgerEntries=$ingestLedgerEntries, invoiceLineItems=$invoiceLineItems, invoicerAddress=$invoicerAddress, ledgerAccountSettlementId=$ledgerAccountSettlementId, metadata=$metadata, notificationEmailAddresses=$notificationEmailAddresses, notificationsEnabled=$notificationsEnabled, paymentEffectiveDate=$paymentEffectiveDate, paymentMethod=$paymentMethod, paymentType=$paymentType, receivingAccountId=$receivingAccountId, recipientEmail=$recipientEmail, recipientName=$recipientName, remindAfterOverdueDays=$remindAfterOverdueDays, virtualAccountId=$virtualAccountId, additionalProperties=$additionalProperties}"
    }

    class ContactDetail
    private constructor(
        private val id: JsonField<String>,
        private val contactIdentifier: JsonField<String>,
        private val contactIdentifierType: JsonField<ContactIdentifierType>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val discardedAt: JsonField<OffsetDateTime>,
        private val liveMode: JsonField<Boolean>,
        private val object_: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_identifier")
            @ExcludeMissing
            contactIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("discarded_at")
            @ExcludeMissing
            discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            contactIdentifier,
            contactIdentifierType,
            createdAt,
            discardedAt,
            liveMode,
            object_,
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
        fun contactIdentifier(): String = contactIdentifier.getRequired("contact_identifier")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contactIdentifierType(): ContactIdentifierType =
            contactIdentifierType.getRequired("contact_identifier_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discardedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(discardedAt.getNullable("discarded_at"))

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
         * Returns the raw JSON value of [contactIdentifier].
         *
         * Unlike [contactIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_identifier")
        @ExcludeMissing
        fun _contactIdentifier(): JsonField<String> = contactIdentifier

        /**
         * Returns the raw JSON value of [contactIdentifierType].
         *
         * Unlike [contactIdentifierType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        fun _contactIdentifierType(): JsonField<ContactIdentifierType> = contactIdentifierType

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [discardedAt].
         *
         * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discarded_at")
        @ExcludeMissing
        fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

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
             * Returns a mutable builder for constructing an instance of [ContactDetail].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contactIdentifier()
             * .contactIdentifierType()
             * .createdAt()
             * .discardedAt()
             * .liveMode()
             * .object_()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContactDetail]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var contactIdentifier: JsonField<String>? = null
            private var contactIdentifierType: JsonField<ContactIdentifierType>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var discardedAt: JsonField<OffsetDateTime>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var object_: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contactDetail: ContactDetail) = apply {
                id = contactDetail.id
                contactIdentifier = contactDetail.contactIdentifier
                contactIdentifierType = contactDetail.contactIdentifierType
                createdAt = contactDetail.createdAt
                discardedAt = contactDetail.discardedAt
                liveMode = contactDetail.liveMode
                object_ = contactDetail.object_
                updatedAt = contactDetail.updatedAt
                additionalProperties = contactDetail.additionalProperties.toMutableMap()
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

            fun contactIdentifier(contactIdentifier: String) =
                contactIdentifier(JsonField.of(contactIdentifier))

            /**
             * Sets [Builder.contactIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                this.contactIdentifier = contactIdentifier
            }

            fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                contactIdentifierType(JsonField.of(contactIdentifierType))

            /**
             * Sets [Builder.contactIdentifierType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactIdentifierType] with a well-typed
             * [ContactIdentifierType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun contactIdentifierType(contactIdentifierType: JsonField<ContactIdentifierType>) =
                apply {
                    this.contactIdentifierType = contactIdentifierType
                }

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

            fun discardedAt(discardedAt: OffsetDateTime?) =
                discardedAt(JsonField.ofNullable(discardedAt))

            /** Alias for calling [Builder.discardedAt] with `discardedAt.orElse(null)`. */
            fun discardedAt(discardedAt: Optional<OffsetDateTime>) =
                discardedAt(discardedAt.getOrNull())

            /**
             * Sets [Builder.discardedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
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
             * Returns an immutable instance of [ContactDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .contactIdentifier()
             * .contactIdentifierType()
             * .createdAt()
             * .discardedAt()
             * .liveMode()
             * .object_()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ContactDetail =
                ContactDetail(
                    checkRequired("id", id),
                    checkRequired("contactIdentifier", contactIdentifier),
                    checkRequired("contactIdentifierType", contactIdentifierType),
                    checkRequired("createdAt", createdAt),
                    checkRequired("discardedAt", discardedAt),
                    checkRequired("liveMode", liveMode),
                    checkRequired("object_", object_),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ContactDetail = apply {
            if (validated) {
                return@apply
            }

            id()
            contactIdentifier()
            contactIdentifierType().validate()
            createdAt()
            discardedAt()
            liveMode()
            object_()
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
                (if (contactIdentifier.asKnown().isPresent) 1 else 0) +
                (contactIdentifierType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (discardedAt.asKnown().isPresent) 1 else 0) +
                (if (liveMode.asKnown().isPresent) 1 else 0) +
                (if (object_.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        class ContactIdentifierType
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

                @JvmField val EMAIL = of("email")

                @JvmField val PHONE_NUMBER = of("phone_number")

                @JvmField val WEBSITE = of("website")

                @JvmStatic fun of(value: String) = ContactIdentifierType(JsonField.of(value))
            }

            /** An enum containing [ContactIdentifierType]'s known values. */
            enum class Known {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
            }

            /**
             * An enum containing [ContactIdentifierType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ContactIdentifierType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMAIL,
                PHONE_NUMBER,
                WEBSITE,
                /**
                 * An enum member indicating that [ContactIdentifierType] was instantiated with an
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
                    EMAIL -> Value.EMAIL
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    WEBSITE -> Value.WEBSITE
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
                    EMAIL -> Known.EMAIL
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    WEBSITE -> Known.WEBSITE
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown ContactIdentifierType: $value"
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

            fun validate(): ContactIdentifierType = apply {
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

                return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContactDetail && id == other.id && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && createdAt == other.createdAt && discardedAt == other.discardedAt && liveMode == other.liveMode && object_ == other.object_ && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, contactIdentifier, contactIdentifierType, createdAt, discardedAt, liveMode, object_, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContactDetail{id=$id, contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, createdAt=$createdAt, discardedAt=$discardedAt, liveMode=$liveMode, object_=$object_, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }

    /** The counterparty's billing address. */
    class CounterpartyBillingAddress
    private constructor(
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(country, line1, locality, postalCode, region, line2, mutableMapOf())

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of
             * [CounterpartyBillingAddress].
             *
             * The following fields are required:
             * ```java
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CounterpartyBillingAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(counterpartyBillingAddress: CounterpartyBillingAddress) = apply {
                country = counterpartyBillingAddress.country
                line1 = counterpartyBillingAddress.line1
                locality = counterpartyBillingAddress.locality
                postalCode = counterpartyBillingAddress.postalCode
                region = counterpartyBillingAddress.region
                line2 = counterpartyBillingAddress.line2
                additionalProperties =
                    counterpartyBillingAddress.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
             * Returns an immutable instance of [CounterpartyBillingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CounterpartyBillingAddress =
                CounterpartyBillingAddress(
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CounterpartyBillingAddress = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            line2()
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
            (if (country.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyBillingAddress && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyBillingAddress{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
    }

    /** The counterparty's shipping address where physical goods should be delivered. */
    class CounterpartyShippingAddress
    private constructor(
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(country, line1, locality, postalCode, region, line2, mutableMapOf())

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of
             * [CounterpartyShippingAddress].
             *
             * The following fields are required:
             * ```java
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CounterpartyShippingAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(counterpartyShippingAddress: CounterpartyShippingAddress) = apply {
                country = counterpartyShippingAddress.country
                line1 = counterpartyShippingAddress.line1
                locality = counterpartyShippingAddress.locality
                postalCode = counterpartyShippingAddress.postalCode
                region = counterpartyShippingAddress.region
                line2 = counterpartyShippingAddress.line2
                additionalProperties =
                    counterpartyShippingAddress.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
             * Returns an immutable instance of [CounterpartyShippingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CounterpartyShippingAddress =
                CounterpartyShippingAddress(
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CounterpartyShippingAddress = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            line2()
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
            (if (country.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyShippingAddress && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyShippingAddress{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
    }

    class InvoiceLineItemCreateRequest
    private constructor(
        private val name: JsonField<String>,
        private val unitAmount: JsonField<Long>,
        private val description: JsonField<String>,
        private val direction: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val quantity: JsonField<Long>,
        private val unitAmountDecimal: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit_amount")
            @ExcludeMissing
            unitAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("unit_amount_decimal")
            @ExcludeMissing
            unitAmountDecimal: JsonField<String> = JsonMissing.of(),
        ) : this(
            name,
            unitAmount,
            description,
            direction,
            metadata,
            quantity,
            unitAmountDecimal,
            mutableMapOf(),
        )

        /**
         * The name of the line item, typically a product or SKU name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unitAmount(): Long = unitAmount.getRequired("unit_amount")

        /**
         * An optional free-form description of the line item.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun direction(): Optional<String> = Optional.ofNullable(direction.getNullable("direction"))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun quantity(): Optional<Long> = Optional.ofNullable(quantity.getNullable("quantity"))

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun unitAmountDecimal(): Optional<String> =
            Optional.ofNullable(unitAmountDecimal.getNullable("unit_amount_decimal"))

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [unitAmount].
         *
         * Unlike [unitAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<Long> = unitAmount

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [direction].
         *
         * Unlike [direction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /**
         * Returns the raw JSON value of [unitAmountDecimal].
         *
         * Unlike [unitAmountDecimal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("unit_amount_decimal")
        @ExcludeMissing
        fun _unitAmountDecimal(): JsonField<String> = unitAmountDecimal

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
             * Returns a mutable builder for constructing an instance of
             * [InvoiceLineItemCreateRequest].
             *
             * The following fields are required:
             * ```java
             * .name()
             * .unitAmount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InvoiceLineItemCreateRequest]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var unitAmount: JsonField<Long>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var quantity: JsonField<Long> = JsonMissing.of()
            private var unitAmountDecimal: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceLineItemCreateRequest: InvoiceLineItemCreateRequest) = apply {
                name = invoiceLineItemCreateRequest.name
                unitAmount = invoiceLineItemCreateRequest.unitAmount
                description = invoiceLineItemCreateRequest.description
                direction = invoiceLineItemCreateRequest.direction
                metadata = invoiceLineItemCreateRequest.metadata
                quantity = invoiceLineItemCreateRequest.quantity
                unitAmountDecimal = invoiceLineItemCreateRequest.unitAmountDecimal
                additionalProperties =
                    invoiceLineItemCreateRequest.additionalProperties.toMutableMap()
            }

            /** The name of the line item, typically a product or SKU name. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: Long) = unitAmount(JsonField.of(unitAmount))

            /**
             * Sets [Builder.unitAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitAmount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitAmount(unitAmount: JsonField<Long>) = apply { this.unitAmount = unitAmount }

            /** An optional free-form description of the line item. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Sets [Builder.direction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.direction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: String) =
                unitAmountDecimal(JsonField.of(unitAmountDecimal))

            /**
             * Sets [Builder.unitAmountDecimal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitAmountDecimal] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitAmountDecimal(unitAmountDecimal: JsonField<String>) = apply {
                this.unitAmountDecimal = unitAmountDecimal
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
             * Returns an immutable instance of [InvoiceLineItemCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * .unitAmount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InvoiceLineItemCreateRequest =
                InvoiceLineItemCreateRequest(
                    checkRequired("name", name),
                    checkRequired("unitAmount", unitAmount),
                    description,
                    direction,
                    metadata,
                    quantity,
                    unitAmountDecimal,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InvoiceLineItemCreateRequest = apply {
            if (validated) {
                return@apply
            }

            name()
            unitAmount()
            description()
            direction()
            metadata().ifPresent { it.validate() }
            quantity()
            unitAmountDecimal()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (unitAmount.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (direction.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (unitAmountDecimal.asKnown().isPresent) 1 else 0)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceLineItemCreateRequest && name == other.name && unitAmount == other.unitAmount && description == other.description && direction == other.direction && metadata == other.metadata && quantity == other.quantity && unitAmountDecimal == other.unitAmountDecimal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, unitAmount, description, direction, metadata, quantity, unitAmountDecimal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceLineItemCreateRequest{name=$name, unitAmount=$unitAmount, description=$description, direction=$direction, metadata=$metadata, quantity=$quantity, unitAmountDecimal=$unitAmountDecimal, additionalProperties=$additionalProperties}"
    }

    /** The invoice issuer's business address. */
    class InvoicerAddress
    private constructor(
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val line2: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        ) : this(country, line1, locality, postalCode, region, line2, mutableMapOf())

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): String = country.getRequired("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun line1(): String = line1.getRequired("line1")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun locality(): String = locality.getRequired("locality")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun postalCode(): String = postalCode.getRequired("postal_code")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun region(): String = region.getRequired("region")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [line1].
         *
         * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [postalCode].
         *
         * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postal_code")
        @ExcludeMissing
        fun _postalCode(): JsonField<String> = postalCode

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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
             * Returns a mutable builder for constructing an instance of [InvoicerAddress].
             *
             * The following fields are required:
             * ```java
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InvoicerAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<String>? = null
            private var line1: JsonField<String>? = null
            private var locality: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var line2: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoicerAddress: InvoicerAddress) = apply {
                country = invoicerAddress.country
                line1 = invoicerAddress.line1
                locality = invoicerAddress.locality
                postalCode = invoicerAddress.postalCode
                region = invoicerAddress.region
                line2 = invoicerAddress.line2
                additionalProperties = invoicerAddress.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String) = line1(JsonField.of(line1))

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun line2(line2: String) = line2(JsonField.of(line2))

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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
             * Returns an immutable instance of [InvoicerAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .country()
             * .line1()
             * .locality()
             * .postalCode()
             * .region()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InvoicerAddress =
                InvoicerAddress(
                    checkRequired("country", country),
                    checkRequired("line1", line1),
                    checkRequired("locality", locality),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    line2,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): InvoicerAddress = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            locality()
            postalCode()
            region()
            line2()
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
            (if (country.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoicerAddress && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, line2, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoicerAddress{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, line2=$line2, additionalProperties=$additionalProperties}"
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
     * The method by which the invoice can be paid. `ui` will show the embedded payment collection
     * flow. `automatic` will automatically initiate payment based upon the account details of the
     * receiving_account id.\nIf the invoice amount is positive, the automatically initiated payment
     * order's direction will be debit. If the invoice amount is negative, the automatically
     * initiated payment order's direction will be credit. One of `manual`, `ui`, or `automatic`.
     */
    class PaymentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UI = of("ui")

            @JvmField val MANUAL = of("manual")

            @JvmField val AUTOMATIC = of("automatic")

            @JvmStatic fun of(value: String) = PaymentMethod(JsonField.of(value))
        }

        /** An enum containing [PaymentMethod]'s known values. */
        enum class Known {
            UI,
            MANUAL,
            AUTOMATIC,
        }

        /**
         * An enum containing [PaymentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UI,
            MANUAL,
            AUTOMATIC,
            /**
             * An enum member indicating that [PaymentMethod] was instantiated with an unknown
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
                UI -> Value.UI
                MANUAL -> Value.MANUAL
                AUTOMATIC -> Value.AUTOMATIC
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
                UI -> Known.UI
                MANUAL -> Known.MANUAL
                AUTOMATIC -> Known.AUTOMATIC
                else -> throw ModernTreasuryInvalidDataException("Unknown PaymentMethod: $value")
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

        fun validate(): PaymentMethod = apply {
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

            return /* spotless:off */ other is PaymentMethod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
