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
import com.moderntreasury.api.core.checkKnown
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ExternalAccount
private constructor(
    private val id: JsonField<String>,
    private val accountDetails: JsonField<List<AccountDetail>>,
    private val accountType: JsonField<ExternalAccountType>,
    private val contactDetails: JsonField<List<ContactDetail>>,
    private val counterpartyId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val ledgerAccountId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val name: JsonField<String>,
    private val object_: JsonField<String>,
    private val partyAddress: JsonField<Address>,
    private val partyName: JsonField<String>,
    private val partyType: JsonField<PartyType>,
    private val routingDetails: JsonField<List<RoutingDetail>>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val verificationSource: JsonField<VerificationSource>,
    private val verificationStatus: JsonField<VerificationStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_details")
        @ExcludeMissing
        accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
        @JsonProperty("account_type")
        @ExcludeMissing
        accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
        @JsonProperty("contact_details")
        @ExcludeMissing
        contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ledger_account_id")
        @ExcludeMissing
        ledgerAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_address")
        @ExcludeMissing
        partyAddress: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("party_name") @ExcludeMissing partyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("party_type")
        @ExcludeMissing
        partyType: JsonField<PartyType> = JsonMissing.of(),
        @JsonProperty("routing_details")
        @ExcludeMissing
        routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("verification_source")
        @ExcludeMissing
        verificationSource: JsonField<VerificationSource> = JsonMissing.of(),
        @JsonProperty("verification_status")
        @ExcludeMissing
        verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
    ) : this(
        id,
        accountDetails,
        accountType,
        contactDetails,
        counterpartyId,
        createdAt,
        discardedAt,
        ledgerAccountId,
        liveMode,
        metadata,
        name,
        object_,
        partyAddress,
        partyName,
        partyType,
        routingDetails,
        updatedAt,
        verificationSource,
        verificationStatus,
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
    fun accountDetails(): List<AccountDetail> = accountDetails.getRequired("account_details")

    /**
     * Can be `checking`, `savings` or `other`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): ExternalAccountType = accountType.getRequired("account_type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contactDetails(): List<ContactDetail> = contactDetails.getRequired("contact_details")

    /**
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
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): Optional<OffsetDateTime> = discardedAt.getOptional("discarded_at")

    /**
     * If the external account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ledgerAccountId(): Optional<String> = ledgerAccountId.getOptional("ledger_account_id")

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
     * A nickname for the external account. This is only for internal usage and won't affect any
     * payments
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The address associated with the owner or `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun partyAddress(): Optional<Address> = partyAddress.getOptional("party_address")

    /**
     * The legal name of the entity which owns the account.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun partyName(): String = partyName.getRequired("party_name")

    /**
     * Either `individual` or `business`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun partyType(): Optional<PartyType> = partyType.getOptional("party_type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingDetails(): List<RoutingDetail> = routingDetails.getRequired("routing_details")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun verificationSource(): Optional<VerificationSource> =
        verificationSource.getOptional("verification_source")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verification_status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountDetails].
     *
     * Unlike [accountDetails], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [contactDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contact_details")
    @ExcludeMissing
    fun _contactDetails(): JsonField<List<ContactDetail>> = contactDetails

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
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Returns the raw JSON value of [ledgerAccountId].
     *
     * Unlike [ledgerAccountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [partyAddress].
     *
     * Unlike [partyAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("party_address")
    @ExcludeMissing
    fun _partyAddress(): JsonField<Address> = partyAddress

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
    @JsonProperty("party_type") @ExcludeMissing fun _partyType(): JsonField<PartyType> = partyType

    /**
     * Returns the raw JSON value of [routingDetails].
     *
     * Unlike [routingDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_details")
    @ExcludeMissing
    fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [verificationSource].
     *
     * Unlike [verificationSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_source")
    @ExcludeMissing
    fun _verificationSource(): JsonField<VerificationSource> = verificationSource

    /**
     * Returns the raw JSON value of [verificationStatus].
     *
     * Unlike [verificationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verification_status")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

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
         * Returns a mutable builder for constructing an instance of [ExternalAccount].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountDetails()
         * .accountType()
         * .contactDetails()
         * .counterpartyId()
         * .createdAt()
         * .discardedAt()
         * .ledgerAccountId()
         * .liveMode()
         * .metadata()
         * .name()
         * .object_()
         * .partyAddress()
         * .partyName()
         * .partyType()
         * .routingDetails()
         * .updatedAt()
         * .verificationSource()
         * .verificationStatus()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalAccount]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
        private var accountType: JsonField<ExternalAccountType>? = null
        private var contactDetails: JsonField<MutableList<ContactDetail>>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var ledgerAccountId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var object_: JsonField<String>? = null
        private var partyAddress: JsonField<Address>? = null
        private var partyName: JsonField<String>? = null
        private var partyType: JsonField<PartyType>? = null
        private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var verificationSource: JsonField<VerificationSource>? = null
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAccount: ExternalAccount) = apply {
            id = externalAccount.id
            accountDetails = externalAccount.accountDetails.map { it.toMutableList() }
            accountType = externalAccount.accountType
            contactDetails = externalAccount.contactDetails.map { it.toMutableList() }
            counterpartyId = externalAccount.counterpartyId
            createdAt = externalAccount.createdAt
            discardedAt = externalAccount.discardedAt
            ledgerAccountId = externalAccount.ledgerAccountId
            liveMode = externalAccount.liveMode
            metadata = externalAccount.metadata
            name = externalAccount.name
            object_ = externalAccount.object_
            partyAddress = externalAccount.partyAddress
            partyName = externalAccount.partyName
            partyType = externalAccount.partyType
            routingDetails = externalAccount.routingDetails.map { it.toMutableList() }
            updatedAt = externalAccount.updatedAt
            verificationSource = externalAccount.verificationSource
            verificationStatus = externalAccount.verificationStatus
            additionalProperties = externalAccount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accountDetails(accountDetails: List<AccountDetail>) =
            accountDetails(JsonField.of(accountDetails))

        /**
         * Sets [Builder.accountDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountDetails] with a well-typed `List<AccountDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
        fun accountType(accountType: ExternalAccountType) = accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed [ExternalAccountType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
            this.accountType = accountType
        }

        fun contactDetails(contactDetails: List<ContactDetail>) =
            contactDetails(JsonField.of(contactDetails))

        /**
         * Sets [Builder.contactDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactDetails] with a well-typed `List<ContactDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        fun discardedAt(discardedAt: OffsetDateTime?) =
            discardedAt(JsonField.ofNullable(discardedAt))

        /** Alias for calling [Builder.discardedAt] with `discardedAt.orElse(null)`. */
        fun discardedAt(discardedAt: Optional<OffsetDateTime>) =
            discardedAt(discardedAt.getOrNull())

        /**
         * Sets [Builder.discardedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discardedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * If the external account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: String?) =
            ledgerAccountId(JsonField.ofNullable(ledgerAccountId))

        /** Alias for calling [Builder.ledgerAccountId] with `ledgerAccountId.orElse(null)`. */
        fun ledgerAccountId(ledgerAccountId: Optional<String>) =
            ledgerAccountId(ledgerAccountId.getOrNull())

        /**
         * Sets [Builder.ledgerAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ledgerAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
            this.ledgerAccountId = ledgerAccountId
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
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The address associated with the owner or `null`. */
        fun partyAddress(partyAddress: Address?) = partyAddress(JsonField.ofNullable(partyAddress))

        /** Alias for calling [Builder.partyAddress] with `partyAddress.orElse(null)`. */
        fun partyAddress(partyAddress: Optional<Address>) = partyAddress(partyAddress.getOrNull())

        /**
         * Sets [Builder.partyAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partyAddress] with a well-typed [Address] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun partyAddress(partyAddress: JsonField<Address>) = apply {
            this.partyAddress = partyAddress
        }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: String) = partyName(JsonField.of(partyName))

        /**
         * Sets [Builder.partyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partyName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

        /** Either `individual` or `business`. */
        fun partyType(partyType: PartyType?) = partyType(JsonField.ofNullable(partyType))

        /** Alias for calling [Builder.partyType] with `partyType.orElse(null)`. */
        fun partyType(partyType: Optional<PartyType>) = partyType(partyType.getOrNull())

        /**
         * Sets [Builder.partyType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partyType] with a well-typed [PartyType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

        fun routingDetails(routingDetails: List<RoutingDetail>) =
            routingDetails(JsonField.of(routingDetails))

        /**
         * Sets [Builder.routingDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingDetails] with a well-typed `List<RoutingDetail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun verificationSource(verificationSource: VerificationSource?) =
            verificationSource(JsonField.ofNullable(verificationSource))

        /**
         * Alias for calling [Builder.verificationSource] with `verificationSource.orElse(null)`.
         */
        fun verificationSource(verificationSource: Optional<VerificationSource>) =
            verificationSource(verificationSource.getOrNull())

        /**
         * Sets [Builder.verificationSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationSource] with a well-typed
         * [VerificationSource] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun verificationSource(verificationSource: JsonField<VerificationSource>) = apply {
            this.verificationSource = verificationSource
        }

        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        /**
         * Sets [Builder.verificationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationStatus] with a well-typed
         * [VerificationStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
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
         * Returns an immutable instance of [ExternalAccount].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accountDetails()
         * .accountType()
         * .contactDetails()
         * .counterpartyId()
         * .createdAt()
         * .discardedAt()
         * .ledgerAccountId()
         * .liveMode()
         * .metadata()
         * .name()
         * .object_()
         * .partyAddress()
         * .partyName()
         * .partyType()
         * .routingDetails()
         * .updatedAt()
         * .verificationSource()
         * .verificationStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalAccount =
            ExternalAccount(
                checkRequired("id", id),
                checkRequired("accountDetails", accountDetails).map { it.toImmutable() },
                checkRequired("accountType", accountType),
                checkRequired("contactDetails", contactDetails).map { it.toImmutable() },
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("discardedAt", discardedAt),
                checkRequired("ledgerAccountId", ledgerAccountId),
                checkRequired("liveMode", liveMode),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("object_", object_),
                checkRequired("partyAddress", partyAddress),
                checkRequired("partyName", partyName),
                checkRequired("partyType", partyType),
                checkRequired("routingDetails", routingDetails).map { it.toImmutable() },
                checkRequired("updatedAt", updatedAt),
                checkRequired("verificationSource", verificationSource),
                checkRequired("verificationStatus", verificationStatus),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalAccount = apply {
        if (validated) {
            return@apply
        }

        id()
        accountDetails().forEach { it.validate() }
        accountType().validate()
        contactDetails().forEach { it.validate() }
        counterpartyId()
        createdAt()
        discardedAt()
        ledgerAccountId()
        liveMode()
        metadata().validate()
        name()
        object_()
        partyAddress().ifPresent { it.validate() }
        partyName()
        partyType().ifPresent { it.validate() }
        routingDetails().forEach { it.validate() }
        updatedAt()
        verificationSource().ifPresent { it.validate() }
        verificationStatus().validate()
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
            (accountDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (accountType.asKnown().getOrNull()?.validity() ?: 0) +
            (contactDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (counterpartyId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (discardedAt.asKnown().isPresent) 1 else 0) +
            (if (ledgerAccountId.asKnown().isPresent) 1 else 0) +
            (if (liveMode.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (object_.asKnown().isPresent) 1 else 0) +
            (partyAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (if (partyName.asKnown().isPresent) 1 else 0) +
            (partyType.asKnown().getOrNull()?.validity() ?: 0) +
            (routingDetails.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (verificationSource.asKnown().getOrNull()?.validity() ?: 0) +
            (verificationStatus.asKnown().getOrNull()?.validity() ?: 0)

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
        fun discardedAt(): Optional<OffsetDateTime> = discardedAt.getOptional("discarded_at")

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

    /** The address associated with the owner or `null`. */
    class Address
    private constructor(
        private val id: JsonField<String>,
        private val country: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val locality: JsonField<String>,
        private val object_: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val region: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("live_mode")
            @ExcludeMissing
            liveMode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postal_code")
            @ExcludeMissing
            postalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            country,
            createdAt,
            line1,
            line2,
            liveMode,
            locality,
            object_,
            postalCode,
            region,
            updatedAt,
            mutableMapOf(),
        )

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Country code conforms to [ISO 3166-1 alpha-2]
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun country(): Optional<String> = country.getOptional("country")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /**
         * Locality or City.
         *
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun locality(): Optional<String> = locality.getOptional("locality")

        /**
         * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun object_(): String = object_.getRequired("object")

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
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
         * Returns the raw JSON value of [liveMode].
         *
         * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [object_].
         *
         * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

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
             * Returns a mutable builder for constructing an instance of [Address].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .country()
             * .createdAt()
             * .line1()
             * .line2()
             * .liveMode()
             * .locality()
             * .object_()
             * .postalCode()
             * .region()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var line1: JsonField<String>? = null
            private var line2: JsonField<String>? = null
            private var liveMode: JsonField<Boolean>? = null
            private var locality: JsonField<String>? = null
            private var object_: JsonField<String>? = null
            private var postalCode: JsonField<String>? = null
            private var region: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                id = address.id
                country = address.country
                createdAt = address.createdAt
                line1 = address.line1
                line2 = address.line2
                liveMode = address.liveMode
                locality = address.locality
                object_ = address.object_
                postalCode = address.postalCode
                region = address.region
                updatedAt = address.updatedAt
                additionalProperties = address.additionalProperties.toMutableMap()
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

            fun object_(object_: String) = object_(JsonField.of(object_))

            /**
             * Sets [Builder.object_] to an arbitrary JSON value.
             *
             * You should usually call [Builder.object_] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

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
             * Returns an immutable instance of [Address].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .country()
             * .createdAt()
             * .line1()
             * .line2()
             * .liveMode()
             * .locality()
             * .object_()
             * .postalCode()
             * .region()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Address =
                Address(
                    checkRequired("id", id),
                    checkRequired("country", country),
                    checkRequired("createdAt", createdAt),
                    checkRequired("line1", line1),
                    checkRequired("line2", line2),
                    checkRequired("liveMode", liveMode),
                    checkRequired("locality", locality),
                    checkRequired("object_", object_),
                    checkRequired("postalCode", postalCode),
                    checkRequired("region", region),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            id()
            country()
            createdAt()
            line1()
            line2()
            liveMode()
            locality()
            object_()
            postalCode()
            region()
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
                (if (country.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (line1.asKnown().isPresent) 1 else 0) +
                (if (line2.asKnown().isPresent) 1 else 0) +
                (if (liveMode.asKnown().isPresent) 1 else 0) +
                (if (locality.asKnown().isPresent) 1 else 0) +
                (if (object_.asKnown().isPresent) 1 else 0) +
                (if (postalCode.asKnown().isPresent) 1 else 0) +
                (if (region.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Address && id == other.id && country == other.country && createdAt == other.createdAt && line1 == other.line1 && line2 == other.line2 && liveMode == other.liveMode && locality == other.locality && object_ == other.object_ && postalCode == other.postalCode && region == other.region && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, country, createdAt, line1, line2, liveMode, locality, object_, postalCode, region, updatedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{id=$id, country=$country, createdAt=$createdAt, line1=$line1, line2=$line2, liveMode=$liveMode, locality=$locality, object_=$object_, postalCode=$postalCode, region=$region, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
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

    class VerificationSource
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

            @JvmField val ACH_PRENOTE = of("ach_prenote")

            @JvmField val MICRODEPOSITS = of("microdeposits")

            @JvmField val PLAID = of("plaid")

            @JvmStatic fun of(value: String) = VerificationSource(JsonField.of(value))
        }

        /** An enum containing [VerificationSource]'s known values. */
        enum class Known {
            ACH_PRENOTE,
            MICRODEPOSITS,
            PLAID,
        }

        /**
         * An enum containing [VerificationSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH_PRENOTE,
            MICRODEPOSITS,
            PLAID,
            /**
             * An enum member indicating that [VerificationSource] was instantiated with an unknown
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
                ACH_PRENOTE -> Value.ACH_PRENOTE
                MICRODEPOSITS -> Value.MICRODEPOSITS
                PLAID -> Value.PLAID
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
                ACH_PRENOTE -> Known.ACH_PRENOTE
                MICRODEPOSITS -> Known.MICRODEPOSITS
                PLAID -> Known.PLAID
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationSource: $value")
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

        fun validate(): VerificationSource = apply {
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

            return /* spotless:off */ other is VerificationSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class VerificationStatus
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

            @JvmField val PENDING_VERIFICATION = of("pending_verification")

            @JvmField val UNVERIFIED = of("unverified")

            @JvmField val VERIFIED = of("verified")

            @JvmStatic fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        /** An enum containing [VerificationStatus]'s known values. */
        enum class Known {
            PENDING_VERIFICATION,
            UNVERIFIED,
            VERIFIED,
        }

        /**
         * An enum containing [VerificationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING_VERIFICATION,
            UNVERIFIED,
            VERIFIED,
            /**
             * An enum member indicating that [VerificationStatus] was instantiated with an unknown
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
                PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                UNVERIFIED -> Value.UNVERIFIED
                VERIFIED -> Value.VERIFIED
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
                PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                UNVERIFIED -> Known.UNVERIFIED
                VERIFIED -> Known.VERIFIED
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationStatus: $value")
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

        fun validate(): VerificationStatus = apply {
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

            return /* spotless:off */ other is VerificationStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccount && id == other.id && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && counterpartyId == other.counterpartyId && createdAt == other.createdAt && discardedAt == other.discardedAt && ledgerAccountId == other.ledgerAccountId && liveMode == other.liveMode && metadata == other.metadata && name == other.name && object_ == other.object_ && partyAddress == other.partyAddress && partyName == other.partyName && partyType == other.partyType && routingDetails == other.routingDetails && updatedAt == other.updatedAt && verificationSource == other.verificationSource && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountDetails, accountType, contactDetails, counterpartyId, createdAt, discardedAt, ledgerAccountId, liveMode, metadata, name, object_, partyAddress, partyName, partyType, routingDetails, updatedAt, verificationSource, verificationStatus, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalAccount{id=$id, accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, counterpartyId=$counterpartyId, createdAt=$createdAt, discardedAt=$discardedAt, ledgerAccountId=$ledgerAccountId, liveMode=$liveMode, metadata=$metadata, name=$name, object_=$object_, partyAddress=$partyAddress, partyName=$partyName, partyType=$partyType, routingDetails=$routingDetails, updatedAt=$updatedAt, verificationSource=$verificationSource, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
}
