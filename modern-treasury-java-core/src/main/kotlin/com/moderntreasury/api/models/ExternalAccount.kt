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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ExternalAccount
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_details")
    @ExcludeMissing
    private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
    @JsonProperty("account_type")
    @ExcludeMissing
    private val accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
    @JsonProperty("contact_details")
    @ExcludeMissing
    private val contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("ledger_account_id")
    @ExcludeMissing
    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("party_address")
    @ExcludeMissing
    private val partyAddress: JsonField<Address> = JsonMissing.of(),
    @JsonProperty("party_name")
    @ExcludeMissing
    private val partyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("party_type")
    @ExcludeMissing
    private val partyType: JsonField<PartyType> = JsonMissing.of(),
    @JsonProperty("routing_details")
    @ExcludeMissing
    private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("verification_source")
    @ExcludeMissing
    private val verificationSource: JsonField<VerificationSource> = JsonMissing.of(),
    @JsonProperty("verification_status")
    @ExcludeMissing
    private val verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun accountDetails(): List<AccountDetail> = accountDetails.getRequired("account_details")

    /** Can be `checking`, `savings` or `other`. */
    fun accountType(): ExternalAccountType = accountType.getRequired("account_type")

    fun contactDetails(): List<ContactDetail> = contactDetails.getRequired("contact_details")

    fun counterpartyId(): Optional<String> =
        Optional.ofNullable(counterpartyId.getNullable("counterparty_id"))

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun discardedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(discardedAt.getNullable("discarded_at"))

    /**
     * If the external account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    fun ledgerAccountId(): Optional<String> =
        Optional.ofNullable(ledgerAccountId.getNullable("ledger_account_id"))

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * A nickname for the external account. This is only for internal usage and won't affect any
     * payments
     */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun object_(): String = object_.getRequired("object")

    /** The address associated with the owner or `null`. */
    fun partyAddress(): Optional<Address> =
        Optional.ofNullable(partyAddress.getNullable("party_address"))

    /** The legal name of the entity which owns the account. */
    fun partyName(): String = partyName.getRequired("party_name")

    /** Either `individual` or `business`. */
    fun partyType(): Optional<PartyType> = Optional.ofNullable(partyType.getNullable("party_type"))

    fun routingDetails(): List<RoutingDetail> = routingDetails.getRequired("routing_details")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun verificationSource(): Optional<VerificationSource> =
        Optional.ofNullable(verificationSource.getNullable("verification_source"))

    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verification_status")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("account_details") @ExcludeMissing fun _accountDetails() = accountDetails

    /** Can be `checking`, `savings` or `other`. */
    @JsonProperty("account_type") @ExcludeMissing fun _accountType() = accountType

    @JsonProperty("contact_details") @ExcludeMissing fun _contactDetails() = contactDetails

    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /**
     * If the external account links to a ledger account in Modern Treasury, the id of the ledger
     * account will be populated here.
     */
    @JsonProperty("ledger_account_id") @ExcludeMissing fun _ledgerAccountId() = ledgerAccountId

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /**
     * A nickname for the external account. This is only for internal usage and won't affect any
     * payments
     */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /** The address associated with the owner or `null`. */
    @JsonProperty("party_address") @ExcludeMissing fun _partyAddress() = partyAddress

    /** The legal name of the entity which owns the account. */
    @JsonProperty("party_name") @ExcludeMissing fun _partyName() = partyName

    /** Either `individual` or `business`. */
    @JsonProperty("party_type") @ExcludeMissing fun _partyType() = partyType

    @JsonProperty("routing_details") @ExcludeMissing fun _routingDetails() = routingDetails

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("verification_source")
    @ExcludeMissing
    fun _verificationSource() = verificationSource

    @JsonProperty("verification_status")
    @ExcludeMissing
    fun _verificationStatus() = verificationStatus

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExternalAccount = apply {
        if (!validated) {
            id()
            accountDetails().forEach { it.validate() }
            accountType()
            contactDetails().forEach { it.validate() }
            counterpartyId()
            createdAt()
            discardedAt()
            ledgerAccountId()
            liveMode()
            metadata().validate()
            name()
            object_()
            partyAddress().map { it.validate() }
            partyName()
            partyType()
            routingDetails().forEach { it.validate() }
            updatedAt()
            verificationSource()
            verificationStatus()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of()
        private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
        private var contactDetails: JsonField<List<ContactDetail>> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var ledgerAccountId: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var partyAddress: JsonField<Address> = JsonMissing.of()
        private var partyName: JsonField<String> = JsonMissing.of()
        private var partyType: JsonField<PartyType> = JsonMissing.of()
        private var routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var verificationSource: JsonField<VerificationSource> = JsonMissing.of()
        private var verificationStatus: JsonField<VerificationStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalAccount: ExternalAccount) = apply {
            id = externalAccount.id
            accountDetails = externalAccount.accountDetails
            accountType = externalAccount.accountType
            contactDetails = externalAccount.contactDetails
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
            routingDetails = externalAccount.routingDetails
            updatedAt = externalAccount.updatedAt
            verificationSource = externalAccount.verificationSource
            verificationStatus = externalAccount.verificationStatus
            additionalProperties = externalAccount.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun accountDetails(accountDetails: List<AccountDetail>) =
            accountDetails(JsonField.of(accountDetails))

        fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
            this.accountDetails = accountDetails
        }

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(accountType: ExternalAccountType) = accountType(JsonField.of(accountType))

        /** Can be `checking`, `savings` or `other`. */
        fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
            this.accountType = accountType
        }

        fun contactDetails(contactDetails: List<ContactDetail>) =
            contactDetails(JsonField.of(contactDetails))

        fun contactDetails(contactDetails: JsonField<List<ContactDetail>>) = apply {
            this.contactDetails = contactDetails
        }

        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * If the external account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
         */
        fun ledgerAccountId(ledgerAccountId: String) =
            ledgerAccountId(JsonField.of(ledgerAccountId))

        /**
         * If the external account links to a ledger account in Modern Treasury, the id of the
         * ledger account will be populated here.
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
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The address associated with the owner or `null`. */
        fun partyAddress(partyAddress: Address) = partyAddress(JsonField.of(partyAddress))

        /** The address associated with the owner or `null`. */
        fun partyAddress(partyAddress: JsonField<Address>) = apply {
            this.partyAddress = partyAddress
        }

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: String) = partyName(JsonField.of(partyName))

        /** The legal name of the entity which owns the account. */
        fun partyName(partyName: JsonField<String>) = apply { this.partyName = partyName }

        /** Either `individual` or `business`. */
        fun partyType(partyType: PartyType) = partyType(JsonField.of(partyType))

        /** Either `individual` or `business`. */
        fun partyType(partyType: JsonField<PartyType>) = apply { this.partyType = partyType }

        fun routingDetails(routingDetails: List<RoutingDetail>) =
            routingDetails(JsonField.of(routingDetails))

        fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
            this.routingDetails = routingDetails
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun verificationSource(verificationSource: VerificationSource) =
            verificationSource(JsonField.of(verificationSource))

        fun verificationSource(verificationSource: JsonField<VerificationSource>) = apply {
            this.verificationSource = verificationSource
        }

        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

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

        fun build(): ExternalAccount =
            ExternalAccount(
                id,
                accountDetails.map { it.toImmutable() },
                accountType,
                contactDetails.map { it.toImmutable() },
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
                routingDetails.map { it.toImmutable() },
                updatedAt,
                verificationSource,
                verificationStatus,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ContactDetail
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_identifier")
        @ExcludeMissing
        private val contactIdentifier: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        private val contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun contactIdentifier(): String = contactIdentifier.getRequired("contact_identifier")

        fun contactIdentifierType(): ContactIdentifierType =
            contactIdentifierType.getRequired("contact_identifier_type")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun discardedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(discardedAt.getNullable("discarded_at"))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun object_(): String = object_.getRequired("object")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("contact_identifier")
        @ExcludeMissing
        fun _contactIdentifier() = contactIdentifier

        @JsonProperty("contact_identifier_type")
        @ExcludeMissing
        fun _contactIdentifierType() = contactIdentifierType

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContactDetail = apply {
            if (!validated) {
                id()
                contactIdentifier()
                contactIdentifierType()
                createdAt()
                discardedAt()
                liveMode()
                object_()
                updatedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var contactIdentifier: JsonField<String> = JsonMissing.of()
            private var contactIdentifierType: JsonField<ContactIdentifierType> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
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

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun contactIdentifier(contactIdentifier: String) =
                contactIdentifier(JsonField.of(contactIdentifier))

            fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                this.contactIdentifier = contactIdentifier
            }

            fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                contactIdentifierType(JsonField.of(contactIdentifierType))

            fun contactIdentifierType(contactIdentifierType: JsonField<ContactIdentifierType>) =
                apply {
                    this.contactIdentifierType = contactIdentifierType
                }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

            fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
                this.discardedAt = discardedAt
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

            fun build(): ContactDetail =
                ContactDetail(
                    id,
                    contactIdentifier,
                    contactIdentifierType,
                    createdAt,
                    discardedAt,
                    liveMode,
                    object_,
                    updatedAt,
                    additionalProperties.toImmutable(),
                )
        }

        class ContactIdentifierType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EMAIL = of("email")

                @JvmField val PHONE_NUMBER = of("phone_number")

                @JvmField val WEBSITE = of("website")

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
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
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

    /** The address associated with the owner or `null`. */
    @NoAutoDetect
    class Address
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("line1")
        @ExcludeMissing
        private val line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2")
        @ExcludeMissing
        private val line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode")
        @ExcludeMissing
        private val liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("object")
        @ExcludeMissing
        private val object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        private val postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

        fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        /** Locality or City. */
        fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

        fun object_(): String = object_.getRequired("object")

        /** The postal code of the address. */
        fun postalCode(): Optional<String> =
            Optional.ofNullable(postalCode.getNullable("postal_code"))

        /** Region or State. */
        fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** Country code conforms to [ISO 3166-1 alpha-2] */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        /** Locality or City. */
        @JsonProperty("locality") @ExcludeMissing fun _locality() = locality

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /** The postal code of the address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        /** Region or State. */
        @JsonProperty("region") @ExcludeMissing fun _region() = region

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (!validated) {
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
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var liveMode: JsonField<Boolean> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var object_: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
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

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: String) = country(JsonField.of(country))

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

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

            /** Locality or City. */
            fun locality(locality: String) = locality(JsonField.of(locality))

            /** Locality or City. */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun object_(object_: String) = object_(JsonField.of(object_))

            fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

            /** The postal code of the address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the address. */
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            /** Region or State. */
            fun region(region: String) = region(JsonField.of(region))

            /** Region or State. */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

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

            fun build(): Address =
                Address(
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
                    additionalProperties.toImmutable(),
                )
        }

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

    class PartyType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BUSINESS = of("business")

            @JvmField val INDIVIDUAL = of("individual")

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
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH_PRENOTE = of("ach_prenote")

            @JvmField val MICRODEPOSITS = of("microdeposits")

            @JvmField val PLAID = of("plaid")

            @JvmStatic fun of(value: String) = VerificationSource(JsonField.of(value))
        }

        enum class Known {
            ACH_PRENOTE,
            MICRODEPOSITS,
            PLAID,
        }

        enum class Value {
            ACH_PRENOTE,
            MICRODEPOSITS,
            PLAID,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_PRENOTE -> Value.ACH_PRENOTE
                MICRODEPOSITS -> Value.MICRODEPOSITS
                PLAID -> Value.PLAID
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_PRENOTE -> Known.ACH_PRENOTE
                MICRODEPOSITS -> Known.MICRODEPOSITS
                PLAID -> Known.PLAID
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationSource: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING_VERIFICATION = of("pending_verification")

            @JvmField val UNVERIFIED = of("unverified")

            @JvmField val VERIFIED = of("verified")

            @JvmStatic fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        enum class Known {
            PENDING_VERIFICATION,
            UNVERIFIED,
            VERIFIED,
        }

        enum class Value {
            PENDING_VERIFICATION,
            UNVERIFIED,
            VERIFIED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                UNVERIFIED -> Value.UNVERIFIED
                VERIFIED -> Value.VERIFIED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                UNVERIFIED -> Known.UNVERIFIED
                VERIFIED -> Known.VERIFIED
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown VerificationStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
