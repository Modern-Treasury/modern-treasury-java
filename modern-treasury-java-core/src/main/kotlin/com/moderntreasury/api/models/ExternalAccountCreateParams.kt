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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** create external account */
class ExternalAccountCreateParams
private constructor(
    private val body: ExternalAccountCreateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun counterpartyId(): Optional<String> = body.counterpartyId()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountDetails(): Optional<List<AccountDetail>> = body.accountDetails()

    /**
     * Can be `checking`, `savings` or `other`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun accountType(): Optional<ExternalAccountType> = body.accountType()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun contactDetails(): Optional<List<ContactDetailCreateRequest>> = body.contactDetails()

    /**
     * Specifies a ledger account object that will be created with the external account. The
     * resulting ledger account is linked to the external account for auto-ledgering Payment
     * objects. See https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
     * for more details.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccount(): Optional<LedgerAccountCreateRequest> = body.ledgerAccount()

    /**
     * Additional data represented as key-value pairs. Both the key and value must be strings.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * A nickname for the external account. This is only for internal usage and won't affect any
     * payments
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * Required if receiving wire payments.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun partyAddress(): Optional<AddressRequest> = body.partyAddress()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun partyIdentifier(): Optional<String> = body.partyIdentifier()

    /**
     * If this value isn't provided, it will be inherited from the counterparty's name.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun partyName(): Optional<String> = body.partyName()

    /**
     * Either `individual` or `business`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun partyType(): Optional<PartyType> = body.partyType()

    /**
     * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can pass
     * the processor token in this field.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun plaidProcessorToken(): Optional<String> = body.plaidProcessorToken()

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun routingDetails(): Optional<List<RoutingDetail>> = body.routingDetails()

    /**
     * Returns the raw JSON value of [counterpartyId].
     *
     * Unlike [counterpartyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _counterpartyId(): JsonField<String> = body._counterpartyId()

    /**
     * Returns the raw JSON value of [accountDetails].
     *
     * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountDetails(): JsonField<List<AccountDetail>> = body._accountDetails()

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountType(): JsonField<ExternalAccountType> = body._accountType()

    /**
     * Returns the raw JSON value of [contactDetails].
     *
     * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = body._contactDetails()

    /**
     * Returns the raw JSON value of [ledgerAccount].
     *
     * Unlike [ledgerAccount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = body._ledgerAccount()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [partyAddress].
     *
     * Unlike [partyAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _partyAddress(): JsonField<AddressRequest> = body._partyAddress()

    /**
     * Returns the raw JSON value of [partyIdentifier].
     *
     * Unlike [partyIdentifier], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _partyIdentifier(): JsonField<String> = body._partyIdentifier()

    /**
     * Returns the raw JSON value of [partyName].
     *
     * Unlike [partyName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _partyName(): JsonField<String> = body._partyName()

    /**
     * Returns the raw JSON value of [partyType].
     *
     * Unlike [partyType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _partyType(): JsonField<PartyType> = body._partyType()

    /**
     * Returns the raw JSON value of [plaidProcessorToken].
     *
     * Unlike [plaidProcessorToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _plaidProcessorToken(): JsonField<String> = body._plaidProcessorToken()

    /**
     * Returns the raw JSON value of [routingDetails].
     *
     * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _routingDetails(): JsonField<List<RoutingDetail>> = body._routingDetails()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountCreateParams].
         *
         * The following fields are required:
         * ```java
         * .counterpartyId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalAccountCreateParams]. */
    class Builder internal constructor() {

        private var body: ExternalAccountCreateRequest.Builder =
            ExternalAccountCreateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalAccountCreateParams: ExternalAccountCreateParams) = apply {
            body = externalAccountCreateParams.body.toBuilder()
            additionalHeaders = externalAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [counterpartyId]
         * - [accountDetails]
         * - [accountType]
         * - [contactDetails]
         * - [ledgerAccount]
         * - etc.
         */
        fun body(body: ExternalAccountCreateRequest) = apply { this.body = body.toBuilder() }

        fun counterpartyId(counterpartyId: String?) = apply { body.counterpartyId(counterpartyId) }

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
            body.counterpartyId(counterpartyId)
        }

        fun accountDetails(accountDetails: List<AccountDetail>) = apply {
            body.accountDetails(accountDetails)
        }

        /**
         * Sets [Builder.accountDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountDetails] with a well-typed `List<AccountDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
            body.accountDetails(accountDetails)
        }

        /**
         * Adds a single [AccountDetail] to [accountDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountDetail(accountDetail: AccountDetail) = apply {
            body.addAccountDetail(accountDetail)
        }

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(accountType: ExternalAccountType) = apply { body.accountType(accountType) }

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed [ExternalAccountType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
            body.accountType(accountType)
        }

        fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
            body.contactDetails(contactDetails)
        }

        /**
         * Sets [Builder.contactDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactDetails] with a well-typed
         * `List<ContactDetailCreateRequest>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun contactDetails(contactDetails: JsonField<List<ContactDetailCreateRequest>>) = apply {
            body.contactDetails(contactDetails)
        }

        /**
         * Adds a single [ContactDetailCreateRequest] to [contactDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
            body.addContactDetail(contactDetail)
        }

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
            body.ledgerAccount(ledgerAccount)
        }

        /**
         * Sets [Builder.ledgerAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccount] with a well-typed
         * [LedgerAccountCreateRequest] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) = apply {
            body.ledgerAccount(ledgerAccount)
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** Required if receiving wire payments. */
        fun partyAddress(partyAddress: AddressRequest) = apply { body.partyAddress(partyAddress) }

        /**
         * Sets [Builder.partyAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partyAddress] with a well-typed [AddressRequest] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
            body.partyAddress(partyAddress)
        }

        fun partyIdentifier(partyIdentifier: String) = apply {
            body.partyIdentifier(partyIdentifier)
        }

        /**
         * Sets [Builder.partyIdentifier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partyIdentifier] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
            body.partyIdentifier(partyIdentifier)
        }

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        fun partyName(partyName: String) = apply { body.partyName(partyName) }

        /**
         * Sets [Builder.partyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun partyName(partyName: JsonField<String>) = apply { body.partyName(partyName) }

        /** Either `individual` or `business`. */
        fun partyType(partyType: PartyType?) = apply { body.partyType(partyType) }

        /** Alias for calling [Builder.partyType] with `partyType.orElse(null)`. */
        fun partyType(partyType: Optional<PartyType>) = partyType(partyType.getOrNull())

        /**
         * Sets [Builder.partyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partyType] with a well-typed [PartyType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun partyType(partyType: JsonField<PartyType>) = apply { body.partyType(partyType) }

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        fun plaidProcessorToken(plaidProcessorToken: String) = apply {
            body.plaidProcessorToken(plaidProcessorToken)
        }

        /**
         * Sets [Builder.plaidProcessorToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.plaidProcessorToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
            body.plaidProcessorToken(plaidProcessorToken)
        }

        fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
            body.routingDetails(routingDetails)
        }

        /**
         * Sets [Builder.routingDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingDetails] with a well-typed `List<RoutingDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
            body.routingDetails(routingDetails)
        }

        /**
         * Adds a single [RoutingDetail] to [routingDetails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
            body.addRoutingDetail(routingDetail)
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
         * Returns an immutable instance of [ExternalAccountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .counterpartyId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalAccountCreateParams =
            ExternalAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): ExternalAccountCreateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class ExternalAccountCreateRequest
    private constructor(
        private val counterpartyId: JsonField<String>,
        private val accountDetails: JsonField<List<AccountDetail>>,
        private val accountType: JsonField<ExternalAccountType>,
        private val contactDetails: JsonField<List<ContactDetailCreateRequest>>,
        private val ledgerAccount: JsonField<LedgerAccountCreateRequest>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val partyAddress: JsonField<AddressRequest>,
        private val partyIdentifier: JsonField<String>,
        private val partyName: JsonField<String>,
        private val partyType: JsonField<PartyType>,
        private val plaidProcessorToken: JsonField<String>,
        private val routingDetails: JsonField<List<RoutingDetail>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_details")
            @ExcludeMissing
            accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
            @JsonProperty("contact_details")
            @ExcludeMissing
            contactDetails: JsonField<List<ContactDetailCreateRequest>> = JsonMissing.of(),
            @JsonProperty("ledger_account")
            @ExcludeMissing
            ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_address")
            @ExcludeMissing
            partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
            @JsonProperty("party_identifier")
            @ExcludeMissing
            partyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_name")
            @ExcludeMissing
            partyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("party_type")
            @ExcludeMissing
            partyType: JsonField<PartyType> = JsonMissing.of(),
            @JsonProperty("plaid_processor_token")
            @ExcludeMissing
            plaidProcessorToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_details")
            @ExcludeMissing
            routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
        ) : this(
            counterpartyId,
            accountDetails,
            accountType,
            contactDetails,
            ledgerAccount,
            metadata,
            name,
            partyAddress,
            partyIdentifier,
            partyName,
            partyType,
            plaidProcessorToken,
            routingDetails,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun counterpartyId(): Optional<String> = counterpartyId.getOptional("counterparty_id")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountDetails(): Optional<List<AccountDetail>> =
            accountDetails.getOptional("account_details")

        /**
         * Can be `checking`, `savings` or `other`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountType(): Optional<ExternalAccountType> = accountType.getOptional("account_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contactDetails(): Optional<List<ContactDetailCreateRequest>> =
            contactDetails.getOptional("contact_details")

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerAccount(): Optional<LedgerAccountCreateRequest> =
            ledgerAccount.getOptional("ledger_account")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Required if receiving wire payments.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyAddress(): Optional<AddressRequest> = partyAddress.getOptional("party_address")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyIdentifier(): Optional<String> = partyIdentifier.getOptional("party_identifier")

        /**
         * If this value isn't provided, it will be inherited from the counterparty's name.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyName(): Optional<String> = partyName.getOptional("party_name")

        /**
         * Either `individual` or `business`.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun partyType(): Optional<PartyType> = partyType.getOptional("party_type")

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun plaidProcessorToken(): Optional<String> =
            plaidProcessorToken.getOptional("plaid_processor_token")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun routingDetails(): Optional<List<RoutingDetail>> =
            routingDetails.getOptional("routing_details")

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
         * Returns the raw JSON value of [accountDetails].
         *
         * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_details")
        @ExcludeMissing
        fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<ExternalAccountType> = accountType

        /**
         * Returns the raw JSON value of [contactDetails].
         *
         * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contact_details")
        @ExcludeMissing
        fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

        /**
         * Returns the raw JSON value of [ledgerAccount].
         *
         * Unlike [ledgerAccount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledger_account")
        @ExcludeMissing
        fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [partyAddress].
         *
         * Unlike [partyAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("party_address")
        @ExcludeMissing
        fun _partyAddress(): JsonField<AddressRequest> = partyAddress

        /**
         * Returns the raw JSON value of [partyIdentifier].
         *
         * Unlike [partyIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("party_identifier")
        @ExcludeMissing
        fun _partyIdentifier(): JsonField<String> = partyIdentifier

        /**
         * Returns the raw JSON value of [partyName].
         *
         * Unlike [partyName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("party_name") @ExcludeMissing fun _partyName(): JsonField<String> = partyName

        /**
         * Returns the raw JSON value of [partyType].
         *
         * Unlike [partyType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("party_type")
        @ExcludeMissing
        fun _partyType(): JsonField<PartyType> = partyType

        /**
         * Returns the raw JSON value of [plaidProcessorToken].
         *
         * Unlike [plaidProcessorToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("plaid_processor_token")
        @ExcludeMissing
        fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

        /**
         * Returns the raw JSON value of [routingDetails].
         *
         * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_details")
        @ExcludeMissing
        fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

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
             * [ExternalAccountCreateRequest].
             *
             * The following fields are required:
             * ```java
             * .counterpartyId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalAccountCreateRequest]. */
        class Builder internal constructor() {

            private var counterpartyId: JsonField<String>? = null
            private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
            private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
            private var contactDetails: JsonField<MutableList<ContactDetailCreateRequest>>? = null
            private var ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
            private var partyIdentifier: JsonField<String> = JsonMissing.of()
            private var partyName: JsonField<String> = JsonMissing.of()
            private var partyType: JsonField<PartyType> = JsonMissing.of()
            private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
            private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalAccountCreateRequest: ExternalAccountCreateRequest) = apply {
                counterpartyId = externalAccountCreateRequest.counterpartyId
                accountDetails =
                    externalAccountCreateRequest.accountDetails.map { it.toMutableList() }
                accountType = externalAccountCreateRequest.accountType
                contactDetails =
                    externalAccountCreateRequest.contactDetails.map { it.toMutableList() }
                ledgerAccount = externalAccountCreateRequest.ledgerAccount
                metadata = externalAccountCreateRequest.metadata
                name = externalAccountCreateRequest.name
                partyAddress = externalAccountCreateRequest.partyAddress
                partyIdentifier = externalAccountCreateRequest.partyIdentifier
                partyName = externalAccountCreateRequest.partyName
                partyType = externalAccountCreateRequest.partyType
                plaidProcessorToken = externalAccountCreateRequest.plaidProcessorToken
                routingDetails =
                    externalAccountCreateRequest.routingDetails.map { it.toMutableList() }
                additionalProperties =
                    externalAccountCreateRequest.additionalProperties.toMutableMap()
            }

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

            fun accountDetails(accountDetails: List<AccountDetail>) =
                accountDetails(JsonField.of(accountDetails))

            /**
             * Sets [Builder.accountDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountDetails] with a well-typed
             * `List<AccountDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                this.accountDetails = accountDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [AccountDetail] to [accountDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAccountDetail(accountDetail: AccountDetail) = apply {
                accountDetails =
                    (accountDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accountDetails", it).add(accountDetail)
                    }
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType) =
                accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [ExternalAccountType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                this.accountType = accountType
            }

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                contactDetails(JsonField.of(contactDetails))

            /**
             * Sets [Builder.contactDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactDetails] with a well-typed
             * `List<ContactDetailCreateRequest>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun contactDetails(contactDetails: JsonField<List<ContactDetailCreateRequest>>) =
                apply {
                    this.contactDetails = contactDetails.map { it.toMutableList() }
                }

            /**
             * Adds a single [ContactDetailCreateRequest] to [contactDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                contactDetails =
                    (contactDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contactDetails", it).add(contactDetail)
                    }
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                ledgerAccount(JsonField.of(ledgerAccount))

            /**
             * Sets [Builder.ledgerAccount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccount] with a well-typed
             * [LedgerAccountCreateRequest] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) = apply {
                this.ledgerAccount = ledgerAccount
            }

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
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest) =
                partyAddress(JsonField.of(partyAddress))

            /**
             * Sets [Builder.partyAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyAddress] with a well-typed [AddressRequest]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                this.partyAddress = partyAddress
            }

            fun partyIdentifier(partyIdentifier: String) =
                partyIdentifier(JsonField.of(partyIdentifier))

            /**
             * Sets [Builder.partyIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                this.partyIdentifier = partyIdentifier
            }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String) = partyName(JsonField.of(partyName))

            /**
             * Sets [Builder.partyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

            /** Alias for calling [Builder.partyType] with `partyType.orElse(null)`. */
            fun partyType(partyType: Optional<PartyType>) = partyType(partyType.getOrNull())

            /**
             * Sets [Builder.partyType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partyType] with a well-typed [PartyType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String) =
                plaidProcessorToken(JsonField.of(plaidProcessorToken))

            /**
             * Sets [Builder.plaidProcessorToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.plaidProcessorToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            fun routingDetails(routingDetails: List<RoutingDetail>) =
                routingDetails(JsonField.of(routingDetails))

            /**
             * Sets [Builder.routingDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingDetails] with a well-typed
             * `List<RoutingDetail>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                this.routingDetails = routingDetails.map { it.toMutableList() }
            }

            /**
             * Adds a single [RoutingDetail] to [routingDetails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                routingDetails =
                    (routingDetails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("routingDetails", it).add(routingDetail)
                    }
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
             * Returns an immutable instance of [ExternalAccountCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .counterpartyId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExternalAccountCreateRequest =
                ExternalAccountCreateRequest(
                    checkRequired("counterpartyId", counterpartyId),
                    (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    accountType,
                    (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExternalAccountCreateRequest = apply {
            if (validated) {
                return@apply
            }

            counterpartyId()
            accountDetails().ifPresent { it.forEach { it.validate() } }
            accountType().ifPresent { it.validate() }
            contactDetails().ifPresent { it.forEach { it.validate() } }
            ledgerAccount().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            name()
            partyAddress().ifPresent { it.validate() }
            partyIdentifier()
            partyName()
            partyType().ifPresent { it.validate() }
            plaidProcessorToken()
            routingDetails().ifPresent { it.forEach { it.validate() } }
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
                (accountDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (accountType.asKnown().getOrNull()?.validity() ?: 0) +
                (contactDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (ledgerAccount.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (partyAddress.asKnown().getOrNull()?.validity() ?: 0) +
                (if (partyIdentifier.asKnown().isPresent) 1 else 0) +
                (if (partyName.asKnown().isPresent) 1 else 0) +
                (partyType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (plaidProcessorToken.asKnown().isPresent) 1 else 0) +
                (routingDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalAccountCreateRequest && counterpartyId == other.counterpartyId && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterpartyId, accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountCreateRequest{counterpartyId=$counterpartyId, accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    class AccountDetail
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountNumberType: JsonField<AccountNumberType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("account_number_type")
            @ExcludeMissing
            accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
        ) : this(accountNumber, accountNumberType, mutableMapOf())

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("account_number")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountNumberType(): Optional<AccountNumberType> =
            accountNumberType.getOptional("account_number_type")

        /**
         * Returns the raw JSON value of [accountNumber].
         *
         * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Returns the raw JSON value of [accountNumberType].
         *
         * Unlike [accountNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("account_number_type")
        @ExcludeMissing
        fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

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
             * Returns a mutable builder for constructing an instance of [AccountDetail].
             *
             * The following fields are required:
             * ```java
             * .accountNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccountDetail]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountNumberType: JsonField<AccountNumberType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accountDetail: AccountDetail) = apply {
                accountNumber = accountDetail.accountNumber
                accountNumberType = accountDetail.accountNumberType
                additionalProperties = accountDetail.additionalProperties.toMutableMap()
            }

            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            fun accountNumberType(accountNumberType: AccountNumberType) =
                accountNumberType(JsonField.of(accountNumberType))

            /**
             * Sets [Builder.accountNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumberType] with a well-typed
             * [AccountNumberType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) = apply {
                this.accountNumberType = accountNumberType
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
             * Returns an immutable instance of [AccountDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountDetail =
                AccountDetail(
                    checkRequired("accountNumber", accountNumber),
                    accountNumberType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountDetail = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            accountNumberType().ifPresent { it.validate() }
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
            (if (accountNumber.asKnown().isPresent) 1 else 0) +
                (accountNumberType.asKnown().getOrNull()?.validity() ?: 0)

        class AccountNumberType
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

                @JvmField val AU_NUMBER = of("au_number")

                @JvmField val BASE_ADDRESS = of("base_address")

                @JvmField val CLABE = of("clabe")

                @JvmField val ETHEREUM_ADDRESS = of("ethereum_address")

                @JvmField val HK_NUMBER = of("hk_number")

                @JvmField val IBAN = of("iban")

                @JvmField val ID_NUMBER = of("id_number")

                @JvmField val NZ_NUMBER = of("nz_number")

                @JvmField val OTHER = of("other")

                @JvmField val PAN = of("pan")

                @JvmField val POLYGON_ADDRESS = of("polygon_address")

                @JvmField val SG_NUMBER = of("sg_number")

                @JvmField val SOLANA_ADDRESS = of("solana_address")

                @JvmField val WALLET_ADDRESS = of("wallet_address")

                @JvmStatic fun of(value: String) = AccountNumberType(JsonField.of(value))
            }

            /** An enum containing [AccountNumberType]'s known values. */
            enum class Known {
                AU_NUMBER,
                BASE_ADDRESS,
                CLABE,
                ETHEREUM_ADDRESS,
                HK_NUMBER,
                IBAN,
                ID_NUMBER,
                NZ_NUMBER,
                OTHER,
                PAN,
                POLYGON_ADDRESS,
                SG_NUMBER,
                SOLANA_ADDRESS,
                WALLET_ADDRESS,
            }

            /**
             * An enum containing [AccountNumberType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AccountNumberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AU_NUMBER,
                BASE_ADDRESS,
                CLABE,
                ETHEREUM_ADDRESS,
                HK_NUMBER,
                IBAN,
                ID_NUMBER,
                NZ_NUMBER,
                OTHER,
                PAN,
                POLYGON_ADDRESS,
                SG_NUMBER,
                SOLANA_ADDRESS,
                WALLET_ADDRESS,
                /**
                 * An enum member indicating that [AccountNumberType] was instantiated with an
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
                    AU_NUMBER -> Value.AU_NUMBER
                    BASE_ADDRESS -> Value.BASE_ADDRESS
                    CLABE -> Value.CLABE
                    ETHEREUM_ADDRESS -> Value.ETHEREUM_ADDRESS
                    HK_NUMBER -> Value.HK_NUMBER
                    IBAN -> Value.IBAN
                    ID_NUMBER -> Value.ID_NUMBER
                    NZ_NUMBER -> Value.NZ_NUMBER
                    OTHER -> Value.OTHER
                    PAN -> Value.PAN
                    POLYGON_ADDRESS -> Value.POLYGON_ADDRESS
                    SG_NUMBER -> Value.SG_NUMBER
                    SOLANA_ADDRESS -> Value.SOLANA_ADDRESS
                    WALLET_ADDRESS -> Value.WALLET_ADDRESS
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
                    AU_NUMBER -> Known.AU_NUMBER
                    BASE_ADDRESS -> Known.BASE_ADDRESS
                    CLABE -> Known.CLABE
                    ETHEREUM_ADDRESS -> Known.ETHEREUM_ADDRESS
                    HK_NUMBER -> Known.HK_NUMBER
                    IBAN -> Known.IBAN
                    ID_NUMBER -> Known.ID_NUMBER
                    NZ_NUMBER -> Known.NZ_NUMBER
                    OTHER -> Known.OTHER
                    PAN -> Known.PAN
                    POLYGON_ADDRESS -> Known.POLYGON_ADDRESS
                    SG_NUMBER -> Known.SG_NUMBER
                    SOLANA_ADDRESS -> Known.SOLANA_ADDRESS
                    WALLET_ADDRESS -> Known.WALLET_ADDRESS
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown AccountNumberType: $value"
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

            fun validate(): AccountNumberType = apply {
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

                return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountDetail && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
    }

    class ContactDetailCreateRequest
    private constructor(
        private val contactIdentifier: JsonField<String>,
        private val contactIdentifierType: JsonField<ContactIdentifierType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contact_identifier")
            @ExcludeMissing
            contactIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contact_identifier_type")
            @ExcludeMissing
            contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
        ) : this(contactIdentifier, contactIdentifierType, mutableMapOf())

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contactIdentifier(): Optional<String> =
            contactIdentifier.getOptional("contact_identifier")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun contactIdentifierType(): Optional<ContactIdentifierType> =
            contactIdentifierType.getOptional("contact_identifier_type")

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
             * [ContactDetailCreateRequest].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContactDetailCreateRequest]. */
        class Builder internal constructor() {

            private var contactIdentifier: JsonField<String> = JsonMissing.of()
            private var contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                contactIdentifier = contactDetailCreateRequest.contactIdentifier
                contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                additionalProperties =
                    contactDetailCreateRequest.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [ContactDetailCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ContactDetailCreateRequest =
                ContactDetailCreateRequest(
                    contactIdentifier,
                    contactIdentifierType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ContactDetailCreateRequest = apply {
            if (validated) {
                return@apply
            }

            contactIdentifier()
            contactIdentifierType().ifPresent { it.validate() }
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
            (if (contactIdentifier.asKnown().isPresent) 1 else 0) +
                (contactIdentifierType.asKnown().getOrNull()?.validity() ?: 0)

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

            return /* spotless:off */ other is ContactDetailCreateRequest && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies a ledger account object that will be created with the external account. The
     * resulting ledger account is linked to the external account for auto-ledgering Payment
     * objects. See https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
     * for more details.
     */
    class LedgerAccountCreateRequest
    private constructor(
        private val currency: JsonField<String>,
        private val ledgerId: JsonField<String>,
        private val name: JsonField<String>,
        private val normalBalance: JsonField<TransactionDirection>,
        private val currencyExponent: JsonField<Long>,
        private val description: JsonField<String>,
        private val ledgerAccountCategoryIds: JsonField<List<String>>,
        private val ledgerableId: JsonField<String>,
        private val ledgerableType: JsonField<LedgerableType>,
        private val metadata: JsonField<Metadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_id")
            @ExcludeMissing
            ledgerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("normal_balance")
            @ExcludeMissing
            normalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
            @JsonProperty("currency_exponent")
            @ExcludeMissing
            currencyExponent: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_account_category_ids")
            @ExcludeMissing
            ledgerAccountCategoryIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            ledgerableId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
        ) : this(
            currency,
            ledgerId,
            name,
            normalBalance,
            currencyExponent,
            description,
            ledgerAccountCategoryIds,
            ledgerableId,
            ledgerableType,
            metadata,
            mutableMapOf(),
        )

        /**
         * The currency of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * The id of the ledger that this account belongs to.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ledgerId(): String = ledgerId.getRequired("ledger_id")

        /**
         * The name of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The normal balance of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun normalBalance(): TransactionDirection = normalBalance.getRequired("normal_balance")

        /**
         * The currency exponent of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currencyExponent(): Optional<Long> = currencyExponent.getOptional("currency_exponent")

        /**
         * The description of the ledger account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The array of ledger account category ids that this ledger account should be a child of.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerAccountCategoryIds(): Optional<List<String>> =
            ledgerAccountCategoryIds.getOptional("ledger_account_category_ids")

        /**
         * If the ledger account links to another object in Modern Treasury, the id will be
         * populated here, otherwise null.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerableId(): Optional<String> = ledgerableId.getOptional("ledgerable_id")

        /**
         * If the ledger account links to another object in Modern Treasury, the type will be
         * populated here, otherwise null. The value is one of internal_account or external_account.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ledgerableType(): Optional<LedgerableType> =
            ledgerableType.getOptional("ledgerable_type")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [ledgerId].
         *
         * Unlike [ledgerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId(): JsonField<String> = ledgerId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [normalBalance].
         *
         * Unlike [normalBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("normal_balance")
        @ExcludeMissing
        fun _normalBalance(): JsonField<TransactionDirection> = normalBalance

        /**
         * Returns the raw JSON value of [currencyExponent].
         *
         * Unlike [currencyExponent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currency_exponent")
        @ExcludeMissing
        fun _currencyExponent(): JsonField<Long> = currencyExponent

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [ledgerAccountCategoryIds].
         *
         * Unlike [ledgerAccountCategoryIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ledger_account_category_ids")
        @ExcludeMissing
        fun _ledgerAccountCategoryIds(): JsonField<List<String>> = ledgerAccountCategoryIds

        /**
         * Returns the raw JSON value of [ledgerableId].
         *
         * Unlike [ledgerableId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledgerable_id")
        @ExcludeMissing
        fun _ledgerableId(): JsonField<String> = ledgerableId

        /**
         * Returns the raw JSON value of [ledgerableType].
         *
         * Unlike [ledgerableType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ledgerable_type")
        @ExcludeMissing
        fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
             * [LedgerAccountCreateRequest].
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .ledgerId()
             * .name()
             * .normalBalance()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LedgerAccountCreateRequest]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var ledgerId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var normalBalance: JsonField<TransactionDirection>? = null
            private var currencyExponent: JsonField<Long> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var ledgerAccountCategoryIds: JsonField<MutableList<String>>? = null
            private var ledgerableId: JsonField<String> = JsonMissing.of()
            private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) = apply {
                currency = ledgerAccountCreateRequest.currency
                ledgerId = ledgerAccountCreateRequest.ledgerId
                name = ledgerAccountCreateRequest.name
                normalBalance = ledgerAccountCreateRequest.normalBalance
                currencyExponent = ledgerAccountCreateRequest.currencyExponent
                description = ledgerAccountCreateRequest.description
                ledgerAccountCategoryIds =
                    ledgerAccountCreateRequest.ledgerAccountCategoryIds.map { it.toMutableList() }
                ledgerableId = ledgerAccountCreateRequest.ledgerableId
                ledgerableType = ledgerAccountCreateRequest.ledgerableType
                metadata = ledgerAccountCreateRequest.metadata
                additionalProperties =
                    ledgerAccountCreateRequest.additionalProperties.toMutableMap()
            }

            /** The currency of the ledger account. */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The id of the ledger that this account belongs to. */
            fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

            /**
             * Sets [Builder.ledgerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

            /** The name of the ledger account. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The normal balance of the ledger account. */
            fun normalBalance(normalBalance: TransactionDirection) =
                normalBalance(JsonField.of(normalBalance))

            /**
             * Sets [Builder.normalBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.normalBalance] with a well-typed
             * [TransactionDirection] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
                this.normalBalance = normalBalance
            }

            /** The currency exponent of the ledger account. */
            fun currencyExponent(currencyExponent: Long?) =
                currencyExponent(JsonField.ofNullable(currencyExponent))

            /**
             * Alias for [Builder.currencyExponent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun currencyExponent(currencyExponent: Long) =
                currencyExponent(currencyExponent as Long?)

            /**
             * Alias for calling [Builder.currencyExponent] with `currencyExponent.orElse(null)`.
             */
            fun currencyExponent(currencyExponent: Optional<Long>) =
                currencyExponent(currencyExponent.getOrNull())

            /**
             * Sets [Builder.currencyExponent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyExponent] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                this.currencyExponent = currencyExponent
            }

            /** The description of the ledger account. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

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
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                ledgerAccountCategoryIds(JsonField.of(ledgerAccountCategoryIds))

            /**
             * Sets [Builder.ledgerAccountCategoryIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerAccountCategoryIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: JsonField<List<String>>) =
                apply {
                    this.ledgerAccountCategoryIds =
                        ledgerAccountCategoryIds.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [ledgerAccountCategoryIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                ledgerAccountCategoryIds =
                    (ledgerAccountCategoryIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ledgerAccountCategoryIds", it).add(ledgerAccountCategoryId)
                    }
            }

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

            /**
             * Sets [Builder.ledgerableId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerableId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                this.ledgerableId = ledgerableId
            }

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            fun ledgerableType(ledgerableType: LedgerableType) =
                ledgerableType(JsonField.of(ledgerableType))

            /**
             * Sets [Builder.ledgerableType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ledgerableType] with a well-typed [LedgerableType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                this.ledgerableType = ledgerableType
            }

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
             * Returns an immutable instance of [LedgerAccountCreateRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .ledgerId()
             * .name()
             * .normalBalance()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LedgerAccountCreateRequest =
                LedgerAccountCreateRequest(
                    checkRequired("currency", currency),
                    checkRequired("ledgerId", ledgerId),
                    checkRequired("name", name),
                    checkRequired("normalBalance", normalBalance),
                    currencyExponent,
                    description,
                    (ledgerAccountCategoryIds ?: JsonMissing.of()).map { it.toImmutable() },
                    ledgerableId,
                    ledgerableType,
                    metadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LedgerAccountCreateRequest = apply {
            if (validated) {
                return@apply
            }

            currency()
            ledgerId()
            name()
            normalBalance().validate()
            currencyExponent()
            description()
            ledgerAccountCategoryIds()
            ledgerableId()
            ledgerableType().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
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
            (if (currency.asKnown().isPresent) 1 else 0) +
                (if (ledgerId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (normalBalance.asKnown().getOrNull()?.validity() ?: 0) +
                (if (currencyExponent.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (ledgerAccountCategoryIds.asKnown().getOrNull()?.size ?: 0) +
                (if (ledgerableId.asKnown().isPresent) 1 else 0) +
                (ledgerableType.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * If the ledger account links to another object in Modern Treasury, the type will be
         * populated here, otherwise null. The value is one of internal_account or external_account.
         */
        class LedgerableType
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

                @JvmField val COUNTERPARTY = of("counterparty")

                @JvmField val EXTERNAL_ACCOUNT = of("external_account")

                @JvmField val INTERNAL_ACCOUNT = of("internal_account")

                @JvmField val VIRTUAL_ACCOUNT = of("virtual_account")

                @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
            }

            /** An enum containing [LedgerableType]'s known values. */
            enum class Known {
                COUNTERPARTY,
                EXTERNAL_ACCOUNT,
                INTERNAL_ACCOUNT,
                VIRTUAL_ACCOUNT,
            }

            /**
             * An enum containing [LedgerableType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LedgerableType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COUNTERPARTY,
                EXTERNAL_ACCOUNT,
                INTERNAL_ACCOUNT,
                VIRTUAL_ACCOUNT,
                /**
                 * An enum member indicating that [LedgerableType] was instantiated with an unknown
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
                    COUNTERPARTY -> Value.COUNTERPARTY
                    EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                    INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                    VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
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
                    COUNTERPARTY -> Known.COUNTERPARTY
                    EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                    INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                    VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
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

            fun validate(): LedgerableType = apply {
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

                return /* spotless:off */ other is LedgerableType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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

            return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
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

    /** Required if receiving wire payments. */
    class AddressRequest
    private constructor(
        private val country: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val locality: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        ) : this(country, line1, line2, locality, postalCode, region, mutableMapOf())

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line1(): Optional<String> = line1.getOptional("line1")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun line2(): Optional<String> = line2.getOptional("line2")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun locality(): Optional<String> = locality.getOptional("locality")

        /**
         * The postal code of the address.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

        /**
         * Region or State.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun region(): Optional<String> = region.getOptional("region")

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
         * Returns the raw JSON value of [line2].
         *
         * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

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

            /** Returns a mutable builder for constructing an instance of [AddressRequest]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AddressRequest]. */
        class Builder internal constructor() {

            private var country: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(addressRequest: AddressRequest) = apply {
                country = addressRequest.country
                line1 = addressRequest.line1
                line2 = addressRequest.line2
                locality = addressRequest.locality
                postalCode = addressRequest.postalCode
                region = addressRequest.region
                additionalProperties = addressRequest.additionalProperties.toMutableMap()
            }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String?) = country(JsonField.ofNullable(country))

            /** Alias for calling [Builder.country] with `country.orElse(null)`. */
            fun country(country: Optional<String>) = country(country.getOrNull())

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

            /** Alias for calling [Builder.line1] with `line1.orElse(null)`. */
            fun line1(line1: Optional<String>) = line1(line1.getOrNull())

            /**
             * Sets [Builder.line1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line1] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

            /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
            fun line2(line2: Optional<String>) = line2(line2.getOrNull())

            /**
             * Sets [Builder.line2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.line2] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** Locality or City. */
            fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

            /** Alias for calling [Builder.locality] with `locality.orElse(null)`. */
            fun locality(locality: Optional<String>) = locality(locality.getOrNull())

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            /** The postal code of the address. */
            fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

            /** Alias for calling [Builder.postalCode] with `postalCode.orElse(null)`. */
            fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.getOrNull())

            /**
             * Sets [Builder.postalCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postalCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String?) = region(JsonField.ofNullable(region))

            /** Alias for calling [Builder.region] with `region.orElse(null)`. */
            fun region(region: Optional<String>) = region(region.getOrNull())

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

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
             * Returns an immutable instance of [AddressRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AddressRequest =
                AddressRequest(
                    country,
                    line1,
                    line2,
                    locality,
                    postalCode,
                    region,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddressRequest = apply {
            if (validated) {
                return@apply
            }

            country()
            line1()
            line2()
            locality()
            postalCode()
            region()
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
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
    }

    /** Either `individual` or `business`. */
    class PartyType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BUSINESS = of("business")

            @JvmField val INDIVIDUAL = of("individual")

            @JvmStatic fun of(value: String) = PartyType(JsonField.of(value))
        }

        /** An enum containing [PartyType]'s known values. */
        enum class Known {
            BUSINESS,
            INDIVIDUAL,
        }

        /**
         * An enum containing [PartyType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PartyType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            /**
             * An enum member indicating that [PartyType] was instantiated with an unknown value.
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
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
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
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                else -> throw ModernTreasuryInvalidDataException("Unknown PartyType: $value")
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

        fun validate(): PartyType = apply {
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

            return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RoutingDetail
    private constructor(
        private val routingNumber: JsonField<String>,
        private val routingNumberType: JsonField<RoutingNumberType>,
        private val paymentType: JsonField<PaymentType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("routing_number")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number_type")
            @ExcludeMissing
            routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
            @JsonProperty("payment_type")
            @ExcludeMissing
            paymentType: JsonField<PaymentType> = JsonMissing.of(),
        ) : this(routingNumber, routingNumberType, paymentType, mutableMapOf())

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routing_number")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumberType(): RoutingNumberType =
            routingNumberType.getRequired("routing_number_type")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentType(): Optional<PaymentType> = paymentType.getOptional("payment_type")

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [routingNumberType].
         *
         * Unlike [routingNumberType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routing_number_type")
        @ExcludeMissing
        fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

        /**
         * Returns the raw JSON value of [paymentType].
         *
         * Unlike [paymentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payment_type")
        @ExcludeMissing
        fun _paymentType(): JsonField<PaymentType> = paymentType

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
             * Returns a mutable builder for constructing an instance of [RoutingDetail].
             *
             * The following fields are required:
             * ```java
             * .routingNumber()
             * .routingNumberType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RoutingDetail]. */
        class Builder internal constructor() {

            private var routingNumber: JsonField<String>? = null
            private var routingNumberType: JsonField<RoutingNumberType>? = null
            private var paymentType: JsonField<PaymentType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(routingDetail: RoutingDetail) = apply {
                routingNumber = routingDetail.routingNumber
                routingNumberType = routingDetail.routingNumberType
                paymentType = routingDetail.paymentType
                additionalProperties = routingDetail.additionalProperties.toMutableMap()
            }

            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            fun routingNumberType(routingNumberType: RoutingNumberType) =
                routingNumberType(JsonField.of(routingNumberType))

            /**
             * Sets [Builder.routingNumberType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumberType] with a well-typed
             * [RoutingNumberType] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) = apply {
                this.routingNumberType = routingNumberType
            }

            fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

            /**
             * Sets [Builder.paymentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentType] with a well-typed [PaymentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                this.paymentType = paymentType
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
             * Returns an immutable instance of [RoutingDetail].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .routingNumber()
             * .routingNumberType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RoutingDetail =
                RoutingDetail(
                    checkRequired("routingNumber", routingNumber),
                    checkRequired("routingNumberType", routingNumberType),
                    paymentType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RoutingDetail = apply {
            if (validated) {
                return@apply
            }

            routingNumber()
            routingNumberType().validate()
            paymentType().ifPresent { it.validate() }
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
            (if (routingNumber.asKnown().isPresent) 1 else 0) +
                (routingNumberType.asKnown().getOrNull()?.validity() ?: 0) +
                (paymentType.asKnown().getOrNull()?.validity() ?: 0)

        class RoutingNumberType
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

                @JvmField val MY_BRANCH_CODE = of("my_branch_code")

                @JvmField val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                @JvmField val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                @JvmField val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                @JvmField val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                @JvmField val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

                @JvmField val SWIFT = of("swift")

                @JvmField val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                @JvmStatic fun of(value: String) = RoutingNumberType(JsonField.of(value))
            }

            /** An enum containing [RoutingNumberType]'s known values. */
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
                MY_BRANCH_CODE,
                MX_BANK_IDENTIFIER,
                NZ_NATIONAL_CLEARING_CODE,
                PL_NATIONAL_CLEARING_CODE,
                SE_BANKGIRO_CLEARING_CODE,
                SG_INTERBANK_CLEARING_CODE,
                SWIFT,
                ZA_NATIONAL_CLEARING_CODE,
            }

            /**
             * An enum containing [RoutingNumberType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [RoutingNumberType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                MY_BRANCH_CODE,
                MX_BANK_IDENTIFIER,
                NZ_NATIONAL_CLEARING_CODE,
                PL_NATIONAL_CLEARING_CODE,
                SE_BANKGIRO_CLEARING_CODE,
                SG_INTERBANK_CLEARING_CODE,
                SWIFT,
                ZA_NATIONAL_CLEARING_CODE,
                /**
                 * An enum member indicating that [RoutingNumberType] was instantiated with an
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
                    MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                    MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
                    MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                    MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                    NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                    PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                    SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                    SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
                    SWIFT -> Known.SWIFT
                    ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                    else ->
                        throw ModernTreasuryInvalidDataException(
                            "Unknown RoutingNumberType: $value"
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

            fun validate(): RoutingNumberType = apply {
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

                return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val ACH = of("ach")

                @JvmField val AU_BECS = of("au_becs")

                @JvmField val BACS = of("bacs")

                @JvmField val BASE = of("base")

                @JvmField val BOOK = of("book")

                @JvmField val CARD = of("card")

                @JvmField val CHATS = of("chats")

                @JvmField val CHECK = of("check")

                @JvmField val CROSS_BORDER = of("cross_border")

                @JvmField val DK_NETS = of("dk_nets")

                @JvmField val EFT = of("eft")

                @JvmField val ETHEREUM = of("ethereum")

                @JvmField val HU_ICS = of("hu_ics")

                @JvmField val INTERAC = of("interac")

                @JvmField val MASAV = of("masav")

                @JvmField val MX_CCEN = of("mx_ccen")

                @JvmField val NEFT = of("neft")

                @JvmField val NICS = of("nics")

                @JvmField val NZ_BECS = of("nz_becs")

                @JvmField val PL_ELIXIR = of("pl_elixir")

                @JvmField val POLYGON = of("polygon")

                @JvmField val PROVXCHANGE = of("provxchange")

                @JvmField val RO_SENT = of("ro_sent")

                @JvmField val RTP = of("rtp")

                @JvmField val SE_BANKGIROT = of("se_bankgirot")

                @JvmField val SEN = of("sen")

                @JvmField val SEPA = of("sepa")

                @JvmField val SG_GIRO = of("sg_giro")

                @JvmField val SIC = of("sic")

                @JvmField val SIGNET = of("signet")

                @JvmField val SKNBI = of("sknbi")

                @JvmField val SOLANA = of("solana")

                @JvmField val WIRE = of("wire")

                @JvmField val ZENGIN = of("zengin")

                @JvmStatic fun of(value: String) = PaymentType(JsonField.of(value))
            }

            /** An enum containing [PaymentType]'s known values. */
            enum class Known {
                ACH,
                AU_BECS,
                BACS,
                BASE,
                BOOK,
                CARD,
                CHATS,
                CHECK,
                CROSS_BORDER,
                DK_NETS,
                EFT,
                ETHEREUM,
                HU_ICS,
                INTERAC,
                MASAV,
                MX_CCEN,
                NEFT,
                NICS,
                NZ_BECS,
                PL_ELIXIR,
                POLYGON,
                PROVXCHANGE,
                RO_SENT,
                RTP,
                SE_BANKGIROT,
                SEN,
                SEPA,
                SG_GIRO,
                SIC,
                SIGNET,
                SKNBI,
                SOLANA,
                WIRE,
                ZENGIN,
            }

            /**
             * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH,
                AU_BECS,
                BACS,
                BASE,
                BOOK,
                CARD,
                CHATS,
                CHECK,
                CROSS_BORDER,
                DK_NETS,
                EFT,
                ETHEREUM,
                HU_ICS,
                INTERAC,
                MASAV,
                MX_CCEN,
                NEFT,
                NICS,
                NZ_BECS,
                PL_ELIXIR,
                POLYGON,
                PROVXCHANGE,
                RO_SENT,
                RTP,
                SE_BANKGIROT,
                SEN,
                SEPA,
                SG_GIRO,
                SIC,
                SIGNET,
                SKNBI,
                SOLANA,
                WIRE,
                ZENGIN,
                /**
                 * An enum member indicating that [PaymentType] was instantiated with an unknown
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
                    ACH -> Value.ACH
                    AU_BECS -> Value.AU_BECS
                    BACS -> Value.BACS
                    BASE -> Value.BASE
                    BOOK -> Value.BOOK
                    CARD -> Value.CARD
                    CHATS -> Value.CHATS
                    CHECK -> Value.CHECK
                    CROSS_BORDER -> Value.CROSS_BORDER
                    DK_NETS -> Value.DK_NETS
                    EFT -> Value.EFT
                    ETHEREUM -> Value.ETHEREUM
                    HU_ICS -> Value.HU_ICS
                    INTERAC -> Value.INTERAC
                    MASAV -> Value.MASAV
                    MX_CCEN -> Value.MX_CCEN
                    NEFT -> Value.NEFT
                    NICS -> Value.NICS
                    NZ_BECS -> Value.NZ_BECS
                    PL_ELIXIR -> Value.PL_ELIXIR
                    POLYGON -> Value.POLYGON
                    PROVXCHANGE -> Value.PROVXCHANGE
                    RO_SENT -> Value.RO_SENT
                    RTP -> Value.RTP
                    SE_BANKGIROT -> Value.SE_BANKGIROT
                    SEN -> Value.SEN
                    SEPA -> Value.SEPA
                    SG_GIRO -> Value.SG_GIRO
                    SIC -> Value.SIC
                    SIGNET -> Value.SIGNET
                    SKNBI -> Value.SKNBI
                    SOLANA -> Value.SOLANA
                    WIRE -> Value.WIRE
                    ZENGIN -> Value.ZENGIN
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
                    ACH -> Known.ACH
                    AU_BECS -> Known.AU_BECS
                    BACS -> Known.BACS
                    BASE -> Known.BASE
                    BOOK -> Known.BOOK
                    CARD -> Known.CARD
                    CHATS -> Known.CHATS
                    CHECK -> Known.CHECK
                    CROSS_BORDER -> Known.CROSS_BORDER
                    DK_NETS -> Known.DK_NETS
                    EFT -> Known.EFT
                    ETHEREUM -> Known.ETHEREUM
                    HU_ICS -> Known.HU_ICS
                    INTERAC -> Known.INTERAC
                    MASAV -> Known.MASAV
                    MX_CCEN -> Known.MX_CCEN
                    NEFT -> Known.NEFT
                    NICS -> Known.NICS
                    NZ_BECS -> Known.NZ_BECS
                    PL_ELIXIR -> Known.PL_ELIXIR
                    POLYGON -> Known.POLYGON
                    PROVXCHANGE -> Known.PROVXCHANGE
                    RO_SENT -> Known.RO_SENT
                    RTP -> Known.RTP
                    SE_BANKGIROT -> Known.SE_BANKGIROT
                    SEN -> Known.SEN
                    SEPA -> Known.SEPA
                    SG_GIRO -> Known.SG_GIRO
                    SIC -> Known.SIC
                    SIGNET -> Known.SIGNET
                    SKNBI -> Known.SKNBI
                    SOLANA -> Known.SOLANA
                    WIRE -> Known.WIRE
                    ZENGIN -> Known.ZENGIN
                    else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
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

            fun validate(): PaymentType = apply {
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

                return /* spotless:off */ other is PaymentType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RoutingDetail && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
