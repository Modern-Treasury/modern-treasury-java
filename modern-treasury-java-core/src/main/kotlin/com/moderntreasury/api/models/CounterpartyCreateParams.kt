// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

/** Create a new counterparty. */
class CounterpartyCreateParams
constructor(
    private val body: CounterpartyCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** A human friendly name for this counterparty. */
    fun name(): Optional<String> = body.name()

    fun accounting(): Optional<Accounting> = body.accounting()

    /** The accounts for this counterparty. */
    fun accounts(): Optional<List<Account>> = body.accounts()

    /** The counterparty's email. */
    fun email(): Optional<String> = body.email()

    /**
     * An optional type to auto-sync the counterparty to your ledger. Either `customer` or `vendor`.
     */
    fun ledgerType(): Optional<LedgerType> = body.ledgerType()

    fun legalEntity(): Optional<LegalEntityCreateRequest> = body.legalEntity()

    /** The id of the legal entity. */
    fun legalEntityId(): Optional<String> = body.legalEntityId()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Send an email to the counterparty whenever an associated payment order is sent to the bank.
     */
    fun sendRemittanceAdvice(): Optional<Boolean> = body.sendRemittanceAdvice()

    /** Either a valid SSN or EIN. */
    fun taxpayerIdentifier(): Optional<String> = body.taxpayerIdentifier()

    /** The verification status of the counterparty. */
    fun verificationStatus(): Optional<VerificationStatus> = body.verificationStatus()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): CounterpartyCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CounterpartyCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("name") private val name: String?,
        @JsonProperty("accounting") private val accounting: Accounting?,
        @JsonProperty("accounts") private val accounts: List<Account>?,
        @JsonProperty("email") private val email: String?,
        @JsonProperty("ledger_type") private val ledgerType: LedgerType?,
        @JsonProperty("legal_entity") private val legalEntity: LegalEntityCreateRequest?,
        @JsonProperty("legal_entity_id") private val legalEntityId: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("send_remittance_advice") private val sendRemittanceAdvice: Boolean?,
        @JsonProperty("taxpayer_identifier") private val taxpayerIdentifier: String?,
        @JsonProperty("verification_status") private val verificationStatus: VerificationStatus?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A human friendly name for this counterparty. */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        @JsonProperty("accounting")
        fun accounting(): Optional<Accounting> = Optional.ofNullable(accounting)

        /** The accounts for this counterparty. */
        @JsonProperty("accounts")
        fun accounts(): Optional<List<Account>> = Optional.ofNullable(accounts)

        /** The counterparty's email. */
        @JsonProperty("email") fun email(): Optional<String> = Optional.ofNullable(email)

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @JsonProperty("ledger_type")
        fun ledgerType(): Optional<LedgerType> = Optional.ofNullable(ledgerType)

        @JsonProperty("legal_entity")
        fun legalEntity(): Optional<LegalEntityCreateRequest> = Optional.ofNullable(legalEntity)

        /** The id of the legal entity. */
        @JsonProperty("legal_entity_id")
        fun legalEntityId(): Optional<String> = Optional.ofNullable(legalEntityId)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        @JsonProperty("send_remittance_advice")
        fun sendRemittanceAdvice(): Optional<Boolean> = Optional.ofNullable(sendRemittanceAdvice)

        /** Either a valid SSN or EIN. */
        @JsonProperty("taxpayer_identifier")
        fun taxpayerIdentifier(): Optional<String> = Optional.ofNullable(taxpayerIdentifier)

        /** The verification status of the counterparty. */
        @JsonProperty("verification_status")
        fun verificationStatus(): Optional<VerificationStatus> =
            Optional.ofNullable(verificationStatus)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var accounting: Accounting? = null
            private var accounts: MutableList<Account>? = null
            private var email: String? = null
            private var ledgerType: LedgerType? = null
            private var legalEntity: LegalEntityCreateRequest? = null
            private var legalEntityId: String? = null
            private var metadata: Metadata? = null
            private var sendRemittanceAdvice: Boolean? = null
            private var taxpayerIdentifier: String? = null
            private var verificationStatus: VerificationStatus? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(counterpartyCreateBody: CounterpartyCreateBody) = apply {
                name = counterpartyCreateBody.name
                accounting = counterpartyCreateBody.accounting
                accounts = counterpartyCreateBody.accounts?.toMutableList()
                email = counterpartyCreateBody.email
                ledgerType = counterpartyCreateBody.ledgerType
                legalEntity = counterpartyCreateBody.legalEntity
                legalEntityId = counterpartyCreateBody.legalEntityId
                metadata = counterpartyCreateBody.metadata
                sendRemittanceAdvice = counterpartyCreateBody.sendRemittanceAdvice
                taxpayerIdentifier = counterpartyCreateBody.taxpayerIdentifier
                verificationStatus = counterpartyCreateBody.verificationStatus
                additionalProperties = counterpartyCreateBody.additionalProperties.toMutableMap()
            }

            /** A human friendly name for this counterparty. */
            fun name(name: String?) = apply { this.name = name }

            /** A human friendly name for this counterparty. */
            fun name(name: Optional<String>) = name(name.orElse(null))

            fun accounting(accounting: Accounting?) = apply { this.accounting = accounting }

            fun accounting(accounting: Optional<Accounting>) = accounting(accounting.orElse(null))

            /** The accounts for this counterparty. */
            fun accounts(accounts: List<Account>?) = apply {
                this.accounts = accounts?.toMutableList()
            }

            /** The accounts for this counterparty. */
            fun accounts(accounts: Optional<List<Account>>) = accounts(accounts.orElse(null))

            /** The accounts for this counterparty. */
            fun addAccount(account: Account) = apply {
                accounts = (accounts ?: mutableListOf()).apply { add(account) }
            }

            /** The counterparty's email. */
            fun email(email: String?) = apply { this.email = email }

            /** The counterparty's email. */
            fun email(email: Optional<String>) = email(email.orElse(null))

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            fun ledgerType(ledgerType: LedgerType?) = apply { this.ledgerType = ledgerType }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            fun ledgerType(ledgerType: Optional<LedgerType>) = ledgerType(ledgerType.orElse(null))

            fun legalEntity(legalEntity: LegalEntityCreateRequest?) = apply {
                this.legalEntity = legalEntity
            }

            fun legalEntity(legalEntity: Optional<LegalEntityCreateRequest>) =
                legalEntity(legalEntity.orElse(null))

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: String?) = apply { this.legalEntityId = legalEntityId }

            /** The id of the legal entity. */
            fun legalEntityId(legalEntityId: Optional<String>) =
                legalEntityId(legalEntityId.orElse(null))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) = apply {
                this.sendRemittanceAdvice = sendRemittanceAdvice
            }

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

            /**
             * Send an email to the counterparty whenever an associated payment order is sent to the
             * bank.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun sendRemittanceAdvice(sendRemittanceAdvice: Optional<Boolean>) =
                sendRemittanceAdvice(sendRemittanceAdvice.orElse(null) as Boolean?)

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: String?) = apply {
                this.taxpayerIdentifier = taxpayerIdentifier
            }

            /** Either a valid SSN or EIN. */
            fun taxpayerIdentifier(taxpayerIdentifier: Optional<String>) =
                taxpayerIdentifier(taxpayerIdentifier.orElse(null))

            /** The verification status of the counterparty. */
            fun verificationStatus(verificationStatus: VerificationStatus?) = apply {
                this.verificationStatus = verificationStatus
            }

            /** The verification status of the counterparty. */
            fun verificationStatus(verificationStatus: Optional<VerificationStatus>) =
                verificationStatus(verificationStatus.orElse(null))

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

            fun build(): CounterpartyCreateBody =
                CounterpartyCreateBody(
                    name,
                    accounting,
                    accounts?.toImmutable(),
                    email,
                    ledgerType,
                    legalEntity,
                    legalEntityId,
                    metadata,
                    sendRemittanceAdvice,
                    taxpayerIdentifier,
                    verificationStatus,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CounterpartyCreateBody && name == other.name && accounting == other.accounting && accounts == other.accounts && email == other.email && ledgerType == other.ledgerType && legalEntity == other.legalEntity && legalEntityId == other.legalEntityId && metadata == other.metadata && sendRemittanceAdvice == other.sendRemittanceAdvice && taxpayerIdentifier == other.taxpayerIdentifier && verificationStatus == other.verificationStatus && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, accounting, accounts, email, ledgerType, legalEntity, legalEntityId, metadata, sendRemittanceAdvice, taxpayerIdentifier, verificationStatus, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CounterpartyCreateBody{name=$name, accounting=$accounting, accounts=$accounts, email=$email, ledgerType=$ledgerType, legalEntity=$legalEntity, legalEntityId=$legalEntityId, metadata=$metadata, sendRemittanceAdvice=$sendRemittanceAdvice, taxpayerIdentifier=$taxpayerIdentifier, verificationStatus=$verificationStatus, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: CounterpartyCreateBody.Builder = CounterpartyCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(counterpartyCreateParams: CounterpartyCreateParams) = apply {
            body = counterpartyCreateParams.body.toBuilder()
            additionalHeaders = counterpartyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterpartyCreateParams.additionalQueryParams.toBuilder()
        }

        /** A human friendly name for this counterparty. */
        fun name(name: String?) = apply { body.name(name) }

        /** A human friendly name for this counterparty. */
        fun name(name: Optional<String>) = name(name.orElse(null))

        fun accounting(accounting: Accounting?) = apply { body.accounting(accounting) }

        fun accounting(accounting: Optional<Accounting>) = accounting(accounting.orElse(null))

        /** The accounts for this counterparty. */
        fun accounts(accounts: List<Account>?) = apply { body.accounts(accounts) }

        /** The accounts for this counterparty. */
        fun accounts(accounts: Optional<List<Account>>) = accounts(accounts.orElse(null))

        /** The accounts for this counterparty. */
        fun addAccount(account: Account) = apply { body.addAccount(account) }

        /** The counterparty's email. */
        fun email(email: String?) = apply { body.email(email) }

        /** The counterparty's email. */
        fun email(email: Optional<String>) = email(email.orElse(null))

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        fun ledgerType(ledgerType: LedgerType?) = apply { body.ledgerType(ledgerType) }

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        fun ledgerType(ledgerType: Optional<LedgerType>) = ledgerType(ledgerType.orElse(null))

        fun legalEntity(legalEntity: LegalEntityCreateRequest?) = apply {
            body.legalEntity(legalEntity)
        }

        fun legalEntity(legalEntity: Optional<LegalEntityCreateRequest>) =
            legalEntity(legalEntity.orElse(null))

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: String?) = apply { body.legalEntityId(legalEntityId) }

        /** The id of the legal entity. */
        fun legalEntityId(legalEntityId: Optional<String>) =
            legalEntityId(legalEntityId.orElse(null))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) = apply {
            body.sendRemittanceAdvice(sendRemittanceAdvice)
        }

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
            sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

        /**
         * Send an email to the counterparty whenever an associated payment order is sent to the
         * bank.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun sendRemittanceAdvice(sendRemittanceAdvice: Optional<Boolean>) =
            sendRemittanceAdvice(sendRemittanceAdvice.orElse(null) as Boolean?)

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: String?) = apply {
            body.taxpayerIdentifier(taxpayerIdentifier)
        }

        /** Either a valid SSN or EIN. */
        fun taxpayerIdentifier(taxpayerIdentifier: Optional<String>) =
            taxpayerIdentifier(taxpayerIdentifier.orElse(null))

        /** The verification status of the counterparty. */
        fun verificationStatus(verificationStatus: VerificationStatus?) = apply {
            body.verificationStatus(verificationStatus)
        }

        /** The verification status of the counterparty. */
        fun verificationStatus(verificationStatus: Optional<VerificationStatus>) =
            verificationStatus(verificationStatus.orElse(null))

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

        fun build(): CounterpartyCreateParams =
            CounterpartyCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Accounting
    @JsonCreator
    private constructor(
        @JsonProperty("type") private val type: Type?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
         * `vendor`.
         */
        @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accounting: Accounting) = apply {
                type = accounting.type
                additionalProperties = accounting.additionalProperties.toMutableMap()
            }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            fun type(type: Type?) = apply { this.type = type }

            /**
             * An optional type to auto-sync the counterparty to your ledger. Either `customer` or
             * `vendor`.
             */
            fun type(type: Optional<Type>) = type(type.orElse(null))

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

            fun build(): Accounting = Accounting(type, additionalProperties.toImmutable())
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CUSTOMER = of("customer")

                @JvmField val VENDOR = of("vendor")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CUSTOMER,
                VENDOR,
            }

            enum class Value {
                CUSTOMER,
                VENDOR,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CUSTOMER -> Value.CUSTOMER
                    VENDOR -> Value.VENDOR
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CUSTOMER -> Known.CUSTOMER
                    VENDOR -> Known.VENDOR
                    else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is Accounting && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Accounting{type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Account
    @JsonCreator
    private constructor(
        @JsonProperty("account_details") private val accountDetails: List<AccountDetail>?,
        @JsonProperty("account_type") private val accountType: ExternalAccountType?,
        @JsonProperty("contact_details")
        private val contactDetails: List<ContactDetailCreateRequest>?,
        @JsonProperty("ledger_account") private val ledgerAccount: LedgerAccountCreateRequest?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("party_address") private val partyAddress: AddressRequest?,
        @JsonProperty("party_identifier") private val partyIdentifier: String?,
        @JsonProperty("party_name") private val partyName: String?,
        @JsonProperty("party_type") private val partyType: PartyType?,
        @JsonProperty("plaid_processor_token") private val plaidProcessorToken: String?,
        @JsonProperty("routing_details") private val routingDetails: List<RoutingDetail>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("account_details")
        fun accountDetails(): Optional<List<AccountDetail>> = Optional.ofNullable(accountDetails)

        /** Can be `checking`, `savings` or `other`. */
        @JsonProperty("account_type")
        fun accountType(): Optional<ExternalAccountType> = Optional.ofNullable(accountType)

        @JsonProperty("contact_details")
        fun contactDetails(): Optional<List<ContactDetailCreateRequest>> =
            Optional.ofNullable(contactDetails)

        /**
         * Specifies a ledger account object that will be created with the external account. The
         * resulting ledger account is linked to the external account for auto-ledgering Payment
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @JsonProperty("ledger_account")
        fun ledgerAccount(): Optional<LedgerAccountCreateRequest> =
            Optional.ofNullable(ledgerAccount)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /**
         * A nickname for the external account. This is only for internal usage and won't affect any
         * payments
         */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** Required if receiving wire payments. */
        @JsonProperty("party_address")
        fun partyAddress(): Optional<AddressRequest> = Optional.ofNullable(partyAddress)

        @JsonProperty("party_identifier")
        fun partyIdentifier(): Optional<String> = Optional.ofNullable(partyIdentifier)

        /** If this value isn't provided, it will be inherited from the counterparty's name. */
        @JsonProperty("party_name")
        fun partyName(): Optional<String> = Optional.ofNullable(partyName)

        /** Either `individual` or `business`. */
        @JsonProperty("party_type")
        fun partyType(): Optional<PartyType> = Optional.ofNullable(partyType)

        /**
         * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you can
         * pass the processor token in this field.
         */
        @JsonProperty("plaid_processor_token")
        fun plaidProcessorToken(): Optional<String> = Optional.ofNullable(plaidProcessorToken)

        @JsonProperty("routing_details")
        fun routingDetails(): Optional<List<RoutingDetail>> = Optional.ofNullable(routingDetails)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accountDetails: MutableList<AccountDetail>? = null
            private var accountType: ExternalAccountType? = null
            private var contactDetails: MutableList<ContactDetailCreateRequest>? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var metadata: Metadata? = null
            private var name: String? = null
            private var partyAddress: AddressRequest? = null
            private var partyIdentifier: String? = null
            private var partyName: String? = null
            private var partyType: PartyType? = null
            private var plaidProcessorToken: String? = null
            private var routingDetails: MutableList<RoutingDetail>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(account: Account) = apply {
                accountDetails = account.accountDetails?.toMutableList()
                accountType = account.accountType
                contactDetails = account.contactDetails?.toMutableList()
                ledgerAccount = account.ledgerAccount
                metadata = account.metadata
                name = account.name
                partyAddress = account.partyAddress
                partyIdentifier = account.partyIdentifier
                partyName = account.partyName
                partyType = account.partyType
                plaidProcessorToken = account.plaidProcessorToken
                routingDetails = account.routingDetails?.toMutableList()
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            fun accountDetails(accountDetails: List<AccountDetail>?) = apply {
                this.accountDetails = accountDetails?.toMutableList()
            }

            fun accountDetails(accountDetails: Optional<List<AccountDetail>>) =
                accountDetails(accountDetails.orElse(null))

            fun addAccountDetail(accountDetail: AccountDetail) = apply {
                accountDetails = (accountDetails ?: mutableListOf()).apply { add(accountDetail) }
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: ExternalAccountType?) = apply {
                this.accountType = accountType
            }

            /** Can be `checking`, `savings` or `other`. */
            fun accountType(accountType: Optional<ExternalAccountType>) =
                accountType(accountType.orElse(null))

            fun contactDetails(contactDetails: List<ContactDetailCreateRequest>?) = apply {
                this.contactDetails = contactDetails?.toMutableList()
            }

            fun contactDetails(contactDetails: Optional<List<ContactDetailCreateRequest>>) =
                contactDetails(contactDetails.orElse(null))

            fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                contactDetails = (contactDetails ?: mutableListOf()).apply { add(contactDetail) }
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest?) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * Specifies a ledger account object that will be created with the external account. The
             * resulting ledger account is linked to the external account for auto-ledgering Payment
             * objects. See
             * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
             * more details.
             */
            fun ledgerAccount(ledgerAccount: Optional<LedgerAccountCreateRequest>) =
                ledgerAccount(ledgerAccount.orElse(null))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: String?) = apply { this.name = name }

            /**
             * A nickname for the external account. This is only for internal usage and won't affect
             * any payments
             */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: AddressRequest?) = apply {
                this.partyAddress = partyAddress
            }

            /** Required if receiving wire payments. */
            fun partyAddress(partyAddress: Optional<AddressRequest>) =
                partyAddress(partyAddress.orElse(null))

            fun partyIdentifier(partyIdentifier: String?) = apply {
                this.partyIdentifier = partyIdentifier
            }

            fun partyIdentifier(partyIdentifier: Optional<String>) =
                partyIdentifier(partyIdentifier.orElse(null))

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: String?) = apply { this.partyName = partyName }

            /** If this value isn't provided, it will be inherited from the counterparty's name. */
            fun partyName(partyName: Optional<String>) = partyName(partyName.orElse(null))

            /** Either `individual` or `business`. */
            fun partyType(partyType: PartyType?) = apply { this.partyType = partyType }

            /** Either `individual` or `business`. */
            fun partyType(partyType: Optional<PartyType>) = partyType(partyType.orElse(null))

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: String?) = apply {
                this.plaidProcessorToken = plaidProcessorToken
            }

            /**
             * If you've enabled the Modern Treasury + Plaid integration in your Plaid account, you
             * can pass the processor token in this field.
             */
            fun plaidProcessorToken(plaidProcessorToken: Optional<String>) =
                plaidProcessorToken(plaidProcessorToken.orElse(null))

            fun routingDetails(routingDetails: List<RoutingDetail>?) = apply {
                this.routingDetails = routingDetails?.toMutableList()
            }

            fun routingDetails(routingDetails: Optional<List<RoutingDetail>>) =
                routingDetails(routingDetails.orElse(null))

            fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                routingDetails = (routingDetails ?: mutableListOf()).apply { add(routingDetail) }
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

            fun build(): Account =
                Account(
                    accountDetails?.toImmutable(),
                    accountType,
                    contactDetails?.toImmutable(),
                    ledgerAccount,
                    metadata,
                    name,
                    partyAddress,
                    partyIdentifier,
                    partyName,
                    partyType,
                    plaidProcessorToken,
                    routingDetails?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AccountDetail
        @JsonCreator
        private constructor(
            @JsonProperty("account_number") private val accountNumber: String,
            @JsonProperty("account_number_type") private val accountNumberType: AccountNumberType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("account_number") fun accountNumber(): String = accountNumber

            @JsonProperty("account_number_type")
            fun accountNumberType(): Optional<AccountNumberType> =
                Optional.ofNullable(accountNumberType)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: String? = null
                private var accountNumberType: AccountNumberType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accountDetail: AccountDetail) = apply {
                    accountNumber = accountDetail.accountNumber
                    accountNumberType = accountDetail.accountNumberType
                    additionalProperties = accountDetail.additionalProperties.toMutableMap()
                }

                fun accountNumber(accountNumber: String) = apply {
                    this.accountNumber = accountNumber
                }

                fun accountNumberType(accountNumberType: AccountNumberType?) = apply {
                    this.accountNumberType = accountNumberType
                }

                fun accountNumberType(accountNumberType: Optional<AccountNumberType>) =
                    accountNumberType(accountNumberType.orElse(null))

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

                fun build(): AccountDetail =
                    AccountDetail(
                        checkNotNull(accountNumber) {
                            "`accountNumber` is required but was not set"
                        },
                        accountNumberType,
                        additionalProperties.toImmutable(),
                    )
            }

            class AccountNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    @JvmStatic fun of(value: String) = AccountNumberType(JsonField.of(value))
                }

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
                    _UNKNOWN,
                }

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
                                "Unknown AccountNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

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

        @NoAutoDetect
        class ContactDetailCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("contact_identifier") private val contactIdentifier: String?,
            @JsonProperty("contact_identifier_type")
            private val contactIdentifierType: ContactIdentifierType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("contact_identifier")
            fun contactIdentifier(): Optional<String> = Optional.ofNullable(contactIdentifier)

            @JsonProperty("contact_identifier_type")
            fun contactIdentifierType(): Optional<ContactIdentifierType> =
                Optional.ofNullable(contactIdentifierType)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var contactIdentifier: String? = null
                private var contactIdentifierType: ContactIdentifierType? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) = apply {
                    contactIdentifier = contactDetailCreateRequest.contactIdentifier
                    contactIdentifierType = contactDetailCreateRequest.contactIdentifierType
                    additionalProperties =
                        contactDetailCreateRequest.additionalProperties.toMutableMap()
                }

                fun contactIdentifier(contactIdentifier: String?) = apply {
                    this.contactIdentifier = contactIdentifier
                }

                fun contactIdentifier(contactIdentifier: Optional<String>) =
                    contactIdentifier(contactIdentifier.orElse(null))

                fun contactIdentifierType(contactIdentifierType: ContactIdentifierType?) = apply {
                    this.contactIdentifierType = contactIdentifierType
                }

                fun contactIdentifierType(contactIdentifierType: Optional<ContactIdentifierType>) =
                    contactIdentifierType(contactIdentifierType.orElse(null))

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

                fun build(): ContactDetailCreateRequest =
                    ContactDetailCreateRequest(
                        contactIdentifier,
                        contactIdentifierType,
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
         * objects. See
         * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for more
         * details.
         */
        @NoAutoDetect
        class LedgerAccountCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("currency") private val currency: String,
            @JsonProperty("ledger_id") private val ledgerId: String,
            @JsonProperty("name") private val name: String,
            @JsonProperty("normal_balance") private val normalBalance: TransactionDirection,
            @JsonProperty("currency_exponent") private val currencyExponent: Long?,
            @JsonProperty("description") private val description: String?,
            @JsonProperty("ledger_account_category_ids")
            private val ledgerAccountCategoryIds: List<String>?,
            @JsonProperty("ledgerable_id") private val ledgerableId: String?,
            @JsonProperty("ledgerable_type") private val ledgerableType: LedgerableType?,
            @JsonProperty("metadata") private val metadata: Metadata?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The currency of the ledger account. */
            @JsonProperty("currency") fun currency(): String = currency

            /** The id of the ledger that this account belongs to. */
            @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

            /** The name of the ledger account. */
            @JsonProperty("name") fun name(): String = name

            /** The normal balance of the ledger account. */
            @JsonProperty("normal_balance")
            fun normalBalance(): TransactionDirection = normalBalance

            /** The currency exponent of the ledger account. */
            @JsonProperty("currency_exponent")
            fun currencyExponent(): Optional<Long> = Optional.ofNullable(currencyExponent)

            /** The description of the ledger account. */
            @JsonProperty("description")
            fun description(): Optional<String> = Optional.ofNullable(description)

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            @JsonProperty("ledger_account_category_ids")
            fun ledgerAccountCategoryIds(): Optional<List<String>> =
                Optional.ofNullable(ledgerAccountCategoryIds)

            /**
             * If the ledger account links to another object in Modern Treasury, the id will be
             * populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            @JsonProperty("ledgerable_type")
            fun ledgerableType(): Optional<LedgerableType> = Optional.ofNullable(ledgerableType)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var currency: String? = null
                private var ledgerId: String? = null
                private var name: String? = null
                private var normalBalance: TransactionDirection? = null
                private var currencyExponent: Long? = null
                private var description: String? = null
                private var ledgerAccountCategoryIds: MutableList<String>? = null
                private var ledgerableId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var metadata: Metadata? = null
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
                        ledgerAccountCreateRequest.ledgerAccountCategoryIds?.toMutableList()
                    ledgerableId = ledgerAccountCreateRequest.ledgerableId
                    ledgerableType = ledgerAccountCreateRequest.ledgerableType
                    metadata = ledgerAccountCreateRequest.metadata
                    additionalProperties =
                        ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                }

                /** The currency of the ledger account. */
                fun currency(currency: String) = apply { this.currency = currency }

                /** The id of the ledger that this account belongs to. */
                fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                /** The name of the ledger account. */
                fun name(name: String) = apply { this.name = name }

                /** The normal balance of the ledger account. */
                fun normalBalance(normalBalance: TransactionDirection) = apply {
                    this.normalBalance = normalBalance
                }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long?) = apply {
                    this.currencyExponent = currencyExponent
                }

                /** The currency exponent of the ledger account. */
                fun currencyExponent(currencyExponent: Long) =
                    currencyExponent(currencyExponent as Long?)

                /** The currency exponent of the ledger account. */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun currencyExponent(currencyExponent: Optional<Long>) =
                    currencyExponent(currencyExponent.orElse(null) as Long?)

                /** The description of the ledger account. */
                fun description(description: String?) = apply { this.description = description }

                /** The description of the ledger account. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>?) = apply {
                    this.ledgerAccountCategoryIds = ledgerAccountCategoryIds?.toMutableList()
                }

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: Optional<List<String>>) =
                    ledgerAccountCategoryIds(ledgerAccountCategoryIds.orElse(null))

                /**
                 * The array of ledger account category ids that this ledger account should be a
                 * child of.
                 */
                fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                    ledgerAccountCategoryIds =
                        (ledgerAccountCategoryIds ?: mutableListOf()).apply {
                            add(ledgerAccountCategoryId)
                        }
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String?) = apply { this.ledgerableId = ledgerableId }

                /**
                 * If the ledger account links to another object in Modern Treasury, the id will be
                 * populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: Optional<String>) =
                    ledgerableId(ledgerableId.orElse(null))

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * If the ledger account links to another object in Modern Treasury, the type will
                 * be populated here, otherwise null. The value is one of internal_account or
                 * external_account.
                 */
                fun ledgerableType(ledgerableType: Optional<LedgerableType>) =
                    ledgerableType(ledgerableType.orElse(null))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

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

                fun build(): LedgerAccountCreateRequest =
                    LedgerAccountCreateRequest(
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                        checkNotNull(name) { "`name` is required but was not set" },
                        checkNotNull(normalBalance) {
                            "`normalBalance` is required but was not set"
                        },
                        currencyExponent,
                        description,
                        ledgerAccountCategoryIds?.toImmutable(),
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        additionalProperties.toImmutable(),
                    )
            }

            class LedgerableType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val COUNTERPARTY = of("counterparty")

                    @JvmField val EXTERNAL_ACCOUNT = of("external_account")

                    @JvmField val INTERNAL_ACCOUNT = of("internal_account")

                    @JvmField val VIRTUAL_ACCOUNT = of("virtual_account")

                    @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
                }

                enum class Known {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                }

                enum class Value {
                    COUNTERPARTY,
                    EXTERNAL_ACCOUNT,
                    INTERNAL_ACCOUNT,
                    VIRTUAL_ACCOUNT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        COUNTERPARTY -> Value.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        COUNTERPARTY -> Known.COUNTERPARTY
                        EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

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
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
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

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

        /** Required if receiving wire payments. */
        @NoAutoDetect
        class AddressRequest
        @JsonCreator
        private constructor(
            @JsonProperty("country") private val country: String?,
            @JsonProperty("line1") private val line1: String?,
            @JsonProperty("line2") private val line2: String?,
            @JsonProperty("locality") private val locality: String?,
            @JsonProperty("postal_code") private val postalCode: String?,
            @JsonProperty("region") private val region: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(): Optional<String> = Optional.ofNullable(country)

            @JsonProperty("line1") fun line1(): Optional<String> = Optional.ofNullable(line1)

            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(): Optional<String> = Optional.ofNullable(locality)

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

            /** Region or State. */
            @JsonProperty("region") fun region(): Optional<String> = Optional.ofNullable(region)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var country: String? = null
                private var line1: String? = null
                private var line2: String? = null
                private var locality: String? = null
                private var postalCode: String? = null
                private var region: String? = null
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
                fun country(country: String?) = apply { this.country = country }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: Optional<String>) = country(country.orElse(null))

                fun line1(line1: String?) = apply { this.line1 = line1 }

                fun line1(line1: Optional<String>) = line1(line1.orElse(null))

                fun line2(line2: String?) = apply { this.line2 = line2 }

                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                /** Locality or City. */
                fun locality(locality: String?) = apply { this.locality = locality }

                /** Locality or City. */
                fun locality(locality: Optional<String>) = locality(locality.orElse(null))

                /** The postal code of the address. */
                fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

                /** The postal code of the address. */
                fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

                /** Region or State. */
                fun region(region: String?) = apply { this.region = region }

                /** Region or State. */
                fun region(region: Optional<String>) = region(region.orElse(null))

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

                fun build(): AddressRequest =
                    AddressRequest(
                        country,
                        line1,
                        line2,
                        locality,
                        postalCode,
                        region,
                        additionalProperties.toImmutable(),
                    )
            }

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

        @NoAutoDetect
        class RoutingDetail
        @JsonCreator
        private constructor(
            @JsonProperty("routing_number") private val routingNumber: String,
            @JsonProperty("routing_number_type") private val routingNumberType: RoutingNumberType,
            @JsonProperty("payment_type") private val paymentType: PaymentType?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

            @JsonProperty("routing_number_type")
            fun routingNumberType(): RoutingNumberType = routingNumberType

            @JsonProperty("payment_type")
            fun paymentType(): Optional<PaymentType> = Optional.ofNullable(paymentType)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

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
                    routingNumber = routingDetail.routingNumber
                    routingNumberType = routingDetail.routingNumberType
                    paymentType = routingDetail.paymentType
                    additionalProperties = routingDetail.additionalProperties.toMutableMap()
                }

                fun routingNumber(routingNumber: String) = apply {
                    this.routingNumber = routingNumber
                }

                fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                    this.routingNumberType = routingNumberType
                }

                fun paymentType(paymentType: PaymentType?) = apply {
                    this.paymentType = paymentType
                }

                fun paymentType(paymentType: Optional<PaymentType>) =
                    paymentType(paymentType.orElse(null))

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

                fun build(): RoutingDetail =
                    RoutingDetail(
                        checkNotNull(routingNumber) {
                            "`routingNumber` is required but was not set"
                        },
                        checkNotNull(routingNumberType) {
                            "`routingNumberType` is required but was not set"
                        },
                        paymentType,
                        additionalProperties.toImmutable(),
                    )
            }

            class RoutingNumberType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    @JvmField val SWIFT = of("swift")

                    @JvmField val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

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
                    ID_SKNBI_CODE,
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
                    NZ_NATIONAL_CLEARING_CODE,
                    PL_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
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
                    ID_SKNBI_CODE,
                    IN_IFSC,
                    JP_ZENGIN_CODE,
                    MY_BRANCH_CODE,
                    MX_BANK_IDENTIFIER,
                    NZ_NATIONAL_CLEARING_CODE,
                    PL_NATIONAL_CLEARING_CODE,
                    SE_BANKGIRO_CLEARING_CODE,
                    SWIFT,
                    ZA_NATIONAL_CLEARING_CODE,
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
                        ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                        IN_IFSC -> Value.IN_IFSC
                        JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                        NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                        PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Value.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
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
                        ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                        IN_IFSC -> Known.IN_IFSC
                        JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                        MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                        MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                        NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                        PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                        SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                        SWIFT -> Known.SWIFT
                        ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RoutingNumberType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class PaymentType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACH = of("ach")

                    @JvmField val AU_BECS = of("au_becs")

                    @JvmField val BACS = of("bacs")

                    @JvmField val BOOK = of("book")

                    @JvmField val CARD = of("card")

                    @JvmField val CHATS = of("chats")

                    @JvmField val CHECK = of("check")

                    @JvmField val CROSS_BORDER = of("cross_border")

                    @JvmField val DK_NETS = of("dk_nets")

                    @JvmField val EFT = of("eft")

                    @JvmField val HU_ICS = of("hu_ics")

                    @JvmField val INTERAC = of("interac")

                    @JvmField val MASAV = of("masav")

                    @JvmField val MX_CCEN = of("mx_ccen")

                    @JvmField val NEFT = of("neft")

                    @JvmField val NICS = of("nics")

                    @JvmField val NZ_BECS = of("nz_becs")

                    @JvmField val PL_ELIXIR = of("pl_elixir")

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

                    @JvmField val WIRE = of("wire")

                    @JvmField val ZENGIN = of("zengin")

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
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
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
                    MX_CCEN,
                    NEFT,
                    NICS,
                    NZ_BECS,
                    PL_ELIXIR,
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
                        MX_CCEN -> Value.MX_CCEN
                        NEFT -> Value.NEFT
                        NICS -> Value.NICS
                        NZ_BECS -> Value.NZ_BECS
                        PL_ELIXIR -> Value.PL_ELIXIR
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
                        MX_CCEN -> Known.MX_CCEN
                        NEFT -> Known.NEFT
                        NICS -> Known.NICS
                        NZ_BECS -> Known.NZ_BECS
                        PL_ELIXIR -> Known.PL_ELIXIR
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
                        WIRE -> Known.WIRE
                        ZENGIN -> Known.ZENGIN
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

            return /* spotless:off */ other is Account && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    class LedgerType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CUSTOMER = of("customer")

            @JvmField val VENDOR = of("vendor")

            @JvmStatic fun of(value: String) = LedgerType(JsonField.of(value))
        }

        enum class Known {
            CUSTOMER,
            VENDOR,
        }

        enum class Value {
            CUSTOMER,
            VENDOR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CUSTOMER -> Value.CUSTOMER
                VENDOR -> Value.VENDOR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CUSTOMER -> Known.CUSTOMER
                VENDOR -> Known.VENDOR
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LedgerType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class LegalEntityCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("legal_entity_type") private val legalEntityType: LegalEntityType,
        @JsonProperty("addresses") private val addresses: List<LegalEntityAddressCreateRequest>?,
        @JsonProperty("bank_settings") private val bankSettings: BankSettings?,
        @JsonProperty("business_name") private val businessName: String?,
        @JsonProperty("citizenship_country") private val citizenshipCountry: String?,
        @JsonProperty("date_formed") private val dateFormed: LocalDate?,
        @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate?,
        @JsonProperty("doing_business_as_names") private val doingBusinessAsNames: List<String>?,
        @JsonProperty("email") private val email: String?,
        @JsonProperty("first_name") private val firstName: String?,
        @JsonProperty("identifications")
        private val identifications: List<IdentificationCreateRequest>?,
        @JsonProperty("last_name") private val lastName: String?,
        @JsonProperty("legal_entity_associations")
        private val legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?,
        @JsonProperty("legal_structure") private val legalStructure: LegalStructure?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("middle_name") private val middleName: String?,
        @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber>?,
        @JsonProperty("politically_exposed_person") private val politicallyExposedPerson: Boolean?,
        @JsonProperty("preferred_name") private val preferredName: String?,
        @JsonProperty("prefix") private val prefix: String?,
        @JsonProperty("risk_rating") private val riskRating: RiskRating?,
        @JsonProperty("suffix") private val suffix: String?,
        @JsonProperty("wealth_and_employment_details")
        private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
        @JsonProperty("website") private val website: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of legal entity. */
        @JsonProperty("legal_entity_type") fun legalEntityType(): LegalEntityType = legalEntityType

        /** A list of addresses for the entity. */
        @JsonProperty("addresses")
        fun addresses(): Optional<List<LegalEntityAddressCreateRequest>> =
            Optional.ofNullable(addresses)

        @JsonProperty("bank_settings")
        fun bankSettings(): Optional<BankSettings> = Optional.ofNullable(bankSettings)

        /** The business's legal business name. */
        @JsonProperty("business_name")
        fun businessName(): Optional<String> = Optional.ofNullable(businessName)

        /** The country of citizenship for an individual. */
        @JsonProperty("citizenship_country")
        fun citizenshipCountry(): Optional<String> = Optional.ofNullable(citizenshipCountry)

        /** A business's formation date (YYYY-MM-DD). */
        @JsonProperty("date_formed")
        fun dateFormed(): Optional<LocalDate> = Optional.ofNullable(dateFormed)

        /** An individual's date of birth (YYYY-MM-DD). */
        @JsonProperty("date_of_birth")
        fun dateOfBirth(): Optional<LocalDate> = Optional.ofNullable(dateOfBirth)

        @JsonProperty("doing_business_as_names")
        fun doingBusinessAsNames(): Optional<List<String>> =
            Optional.ofNullable(doingBusinessAsNames)

        /** The entity's primary email. */
        @JsonProperty("email") fun email(): Optional<String> = Optional.ofNullable(email)

        /** An individual's first name. */
        @JsonProperty("first_name")
        fun firstName(): Optional<String> = Optional.ofNullable(firstName)

        /** A list of identifications for the legal entity. */
        @JsonProperty("identifications")
        fun identifications(): Optional<List<IdentificationCreateRequest>> =
            Optional.ofNullable(identifications)

        /** An individual's last name. */
        @JsonProperty("last_name") fun lastName(): Optional<String> = Optional.ofNullable(lastName)

        /** The legal entity associations and its child legal entities. */
        @JsonProperty("legal_entity_associations")
        fun legalEntityAssociations(): Optional<List<LegalEntityAssociationInlineCreateRequest>> =
            Optional.ofNullable(legalEntityAssociations)

        /** The business's legal structure. */
        @JsonProperty("legal_structure")
        fun legalStructure(): Optional<LegalStructure> = Optional.ofNullable(legalStructure)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /** An individual's middle name. */
        @JsonProperty("middle_name")
        fun middleName(): Optional<String> = Optional.ofNullable(middleName)

        @JsonProperty("phone_numbers")
        fun phoneNumbers(): Optional<List<PhoneNumber>> = Optional.ofNullable(phoneNumbers)

        /** Whether the individual is a politically exposed person. */
        @JsonProperty("politically_exposed_person")
        fun politicallyExposedPerson(): Optional<Boolean> =
            Optional.ofNullable(politicallyExposedPerson)

        /** An individual's preferred name. */
        @JsonProperty("preferred_name")
        fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

        /** An individual's prefix. */
        @JsonProperty("prefix") fun prefix(): Optional<String> = Optional.ofNullable(prefix)

        /** The risk rating of the legal entity. One of low, medium, high. */
        @JsonProperty("risk_rating")
        fun riskRating(): Optional<RiskRating> = Optional.ofNullable(riskRating)

        /** An individual's suffix. */
        @JsonProperty("suffix") fun suffix(): Optional<String> = Optional.ofNullable(suffix)

        @JsonProperty("wealth_and_employment_details")
        fun wealthAndEmploymentDetails(): Optional<WealthAndEmploymentDetails> =
            Optional.ofNullable(wealthAndEmploymentDetails)

        /** The entity's primary website URL. */
        @JsonProperty("website") fun website(): Optional<String> = Optional.ofNullable(website)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var legalEntityType: LegalEntityType? = null
            private var addresses: MutableList<LegalEntityAddressCreateRequest>? = null
            private var bankSettings: BankSettings? = null
            private var businessName: String? = null
            private var citizenshipCountry: String? = null
            private var dateFormed: LocalDate? = null
            private var dateOfBirth: LocalDate? = null
            private var doingBusinessAsNames: MutableList<String>? = null
            private var email: String? = null
            private var firstName: String? = null
            private var identifications: MutableList<IdentificationCreateRequest>? = null
            private var lastName: String? = null
            private var legalEntityAssociations:
                MutableList<LegalEntityAssociationInlineCreateRequest>? =
                null
            private var legalStructure: LegalStructure? = null
            private var metadata: Metadata? = null
            private var middleName: String? = null
            private var phoneNumbers: MutableList<PhoneNumber>? = null
            private var politicallyExposedPerson: Boolean? = null
            private var preferredName: String? = null
            private var prefix: String? = null
            private var riskRating: RiskRating? = null
            private var suffix: String? = null
            private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
            private var website: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(legalEntityCreateRequest: LegalEntityCreateRequest) = apply {
                legalEntityType = legalEntityCreateRequest.legalEntityType
                addresses = legalEntityCreateRequest.addresses?.toMutableList()
                bankSettings = legalEntityCreateRequest.bankSettings
                businessName = legalEntityCreateRequest.businessName
                citizenshipCountry = legalEntityCreateRequest.citizenshipCountry
                dateFormed = legalEntityCreateRequest.dateFormed
                dateOfBirth = legalEntityCreateRequest.dateOfBirth
                doingBusinessAsNames =
                    legalEntityCreateRequest.doingBusinessAsNames?.toMutableList()
                email = legalEntityCreateRequest.email
                firstName = legalEntityCreateRequest.firstName
                identifications = legalEntityCreateRequest.identifications?.toMutableList()
                lastName = legalEntityCreateRequest.lastName
                legalEntityAssociations =
                    legalEntityCreateRequest.legalEntityAssociations?.toMutableList()
                legalStructure = legalEntityCreateRequest.legalStructure
                metadata = legalEntityCreateRequest.metadata
                middleName = legalEntityCreateRequest.middleName
                phoneNumbers = legalEntityCreateRequest.phoneNumbers?.toMutableList()
                politicallyExposedPerson = legalEntityCreateRequest.politicallyExposedPerson
                preferredName = legalEntityCreateRequest.preferredName
                prefix = legalEntityCreateRequest.prefix
                riskRating = legalEntityCreateRequest.riskRating
                suffix = legalEntityCreateRequest.suffix
                wealthAndEmploymentDetails = legalEntityCreateRequest.wealthAndEmploymentDetails
                website = legalEntityCreateRequest.website
                additionalProperties = legalEntityCreateRequest.additionalProperties.toMutableMap()
            }

            /** The type of legal entity. */
            fun legalEntityType(legalEntityType: LegalEntityType) = apply {
                this.legalEntityType = legalEntityType
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: List<LegalEntityAddressCreateRequest>?) = apply {
                this.addresses = addresses?.toMutableList()
            }

            /** A list of addresses for the entity. */
            fun addresses(addresses: Optional<List<LegalEntityAddressCreateRequest>>) =
                addresses(addresses.orElse(null))

            /** A list of addresses for the entity. */
            fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                addresses = (addresses ?: mutableListOf()).apply { add(address) }
            }

            fun bankSettings(bankSettings: BankSettings?) = apply {
                this.bankSettings = bankSettings
            }

            fun bankSettings(bankSettings: Optional<BankSettings>) =
                bankSettings(bankSettings.orElse(null))

            /** The business's legal business name. */
            fun businessName(businessName: String?) = apply { this.businessName = businessName }

            /** The business's legal business name. */
            fun businessName(businessName: Optional<String>) =
                businessName(businessName.orElse(null))

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: String?) = apply {
                this.citizenshipCountry = citizenshipCountry
            }

            /** The country of citizenship for an individual. */
            fun citizenshipCountry(citizenshipCountry: Optional<String>) =
                citizenshipCountry(citizenshipCountry.orElse(null))

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: LocalDate?) = apply { this.dateFormed = dateFormed }

            /** A business's formation date (YYYY-MM-DD). */
            fun dateFormed(dateFormed: Optional<LocalDate>) = dateFormed(dateFormed.orElse(null))

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: LocalDate?) = apply { this.dateOfBirth = dateOfBirth }

            /** An individual's date of birth (YYYY-MM-DD). */
            fun dateOfBirth(dateOfBirth: Optional<LocalDate>) =
                dateOfBirth(dateOfBirth.orElse(null))

            fun doingBusinessAsNames(doingBusinessAsNames: List<String>?) = apply {
                this.doingBusinessAsNames = doingBusinessAsNames?.toMutableList()
            }

            fun doingBusinessAsNames(doingBusinessAsNames: Optional<List<String>>) =
                doingBusinessAsNames(doingBusinessAsNames.orElse(null))

            fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                doingBusinessAsNames =
                    (doingBusinessAsNames ?: mutableListOf()).apply { add(doingBusinessAsName) }
            }

            /** The entity's primary email. */
            fun email(email: String?) = apply { this.email = email }

            /** The entity's primary email. */
            fun email(email: Optional<String>) = email(email.orElse(null))

            /** An individual's first name. */
            fun firstName(firstName: String?) = apply { this.firstName = firstName }

            /** An individual's first name. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.orElse(null))

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: List<IdentificationCreateRequest>?) = apply {
                this.identifications = identifications?.toMutableList()
            }

            /** A list of identifications for the legal entity. */
            fun identifications(identifications: Optional<List<IdentificationCreateRequest>>) =
                identifications(identifications.orElse(null))

            /** A list of identifications for the legal entity. */
            fun addIdentification(identification: IdentificationCreateRequest) = apply {
                identifications = (identifications ?: mutableListOf()).apply { add(identification) }
            }

            /** An individual's last name. */
            fun lastName(lastName: String?) = apply { this.lastName = lastName }

            /** An individual's last name. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.orElse(null))

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: List<LegalEntityAssociationInlineCreateRequest>?
            ) = apply { this.legalEntityAssociations = legalEntityAssociations?.toMutableList() }

            /** The legal entity associations and its child legal entities. */
            fun legalEntityAssociations(
                legalEntityAssociations: Optional<List<LegalEntityAssociationInlineCreateRequest>>
            ) = legalEntityAssociations(legalEntityAssociations.orElse(null))

            /** The legal entity associations and its child legal entities. */
            fun addLegalEntityAssociation(
                legalEntityAssociation: LegalEntityAssociationInlineCreateRequest
            ) = apply {
                legalEntityAssociations =
                    (legalEntityAssociations ?: mutableListOf()).apply {
                        add(legalEntityAssociation)
                    }
            }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: LegalStructure?) = apply {
                this.legalStructure = legalStructure
            }

            /** The business's legal structure. */
            fun legalStructure(legalStructure: Optional<LegalStructure>) =
                legalStructure(legalStructure.orElse(null))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

            /** An individual's middle name. */
            fun middleName(middleName: String?) = apply { this.middleName = middleName }

            /** An individual's middle name. */
            fun middleName(middleName: Optional<String>) = middleName(middleName.orElse(null))

            fun phoneNumbers(phoneNumbers: List<PhoneNumber>?) = apply {
                this.phoneNumbers = phoneNumbers?.toMutableList()
            }

            fun phoneNumbers(phoneNumbers: Optional<List<PhoneNumber>>) =
                phoneNumbers(phoneNumbers.orElse(null))

            fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) = apply {
                this.politicallyExposedPerson = politicallyExposedPerson
            }

            /** Whether the individual is a politically exposed person. */
            fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
                politicallyExposedPerson(politicallyExposedPerson as Boolean?)

            /** Whether the individual is a politically exposed person. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun politicallyExposedPerson(politicallyExposedPerson: Optional<Boolean>) =
                politicallyExposedPerson(politicallyExposedPerson.orElse(null) as Boolean?)

            /** An individual's preferred name. */
            fun preferredName(preferredName: String?) = apply { this.preferredName = preferredName }

            /** An individual's preferred name. */
            fun preferredName(preferredName: Optional<String>) =
                preferredName(preferredName.orElse(null))

            /** An individual's prefix. */
            fun prefix(prefix: String?) = apply { this.prefix = prefix }

            /** An individual's prefix. */
            fun prefix(prefix: Optional<String>) = prefix(prefix.orElse(null))

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: RiskRating?) = apply { this.riskRating = riskRating }

            /** The risk rating of the legal entity. One of low, medium, high. */
            fun riskRating(riskRating: Optional<RiskRating>) = riskRating(riskRating.orElse(null))

            /** An individual's suffix. */
            fun suffix(suffix: String?) = apply { this.suffix = suffix }

            /** An individual's suffix. */
            fun suffix(suffix: Optional<String>) = suffix(suffix.orElse(null))

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: WealthAndEmploymentDetails?
            ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

            fun wealthAndEmploymentDetails(
                wealthAndEmploymentDetails: Optional<WealthAndEmploymentDetails>
            ) = wealthAndEmploymentDetails(wealthAndEmploymentDetails.orElse(null))

            /** The entity's primary website URL. */
            fun website(website: String?) = apply { this.website = website }

            /** The entity's primary website URL. */
            fun website(website: Optional<String>) = website(website.orElse(null))

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

            fun build(): LegalEntityCreateRequest =
                LegalEntityCreateRequest(
                    checkNotNull(legalEntityType) {
                        "`legalEntityType` is required but was not set"
                    },
                    addresses?.toImmutable(),
                    bankSettings,
                    businessName,
                    citizenshipCountry,
                    dateFormed,
                    dateOfBirth,
                    doingBusinessAsNames?.toImmutable(),
                    email,
                    firstName,
                    identifications?.toImmutable(),
                    lastName,
                    legalEntityAssociations?.toImmutable(),
                    legalStructure,
                    metadata,
                    middleName,
                    phoneNumbers?.toImmutable(),
                    politicallyExposedPerson,
                    preferredName,
                    prefix,
                    riskRating,
                    suffix,
                    wealthAndEmploymentDetails,
                    website,
                    additionalProperties.toImmutable(),
                )
        }

        class LegalEntityType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BUSINESS = of("business")

                @JvmField val INDIVIDUAL = of("individual")

                @JvmStatic fun of(value: String) = LegalEntityType(JsonField.of(value))
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
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalEntityType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class LegalEntityAddressCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("country") private val country: String?,
            @JsonProperty("line1") private val line1: String?,
            @JsonProperty("locality") private val locality: String?,
            @JsonProperty("postal_code") private val postalCode: String?,
            @JsonProperty("region") private val region: String?,
            @JsonProperty("address_types") private val addressTypes: List<AddressType>?,
            @JsonProperty("line2") private val line2: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Country code conforms to [ISO 3166-1 alpha-2] */
            @JsonProperty("country") fun country(): Optional<String> = Optional.ofNullable(country)

            @JsonProperty("line1") fun line1(): Optional<String> = Optional.ofNullable(line1)

            /** Locality or City. */
            @JsonProperty("locality")
            fun locality(): Optional<String> = Optional.ofNullable(locality)

            /** The postal code of the address. */
            @JsonProperty("postal_code")
            fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

            /** Region or State. */
            @JsonProperty("region") fun region(): Optional<String> = Optional.ofNullable(region)

            /** The types of this address. */
            @JsonProperty("address_types")
            fun addressTypes(): Optional<List<AddressType>> = Optional.ofNullable(addressTypes)

            @JsonProperty("line2") fun line2(): Optional<String> = Optional.ofNullable(line2)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var country: String? = null
                private var line1: String? = null
                private var locality: String? = null
                private var postalCode: String? = null
                private var region: String? = null
                private var addressTypes: MutableList<AddressType>? = null
                private var line2: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                ) = apply {
                    country = legalEntityAddressCreateRequest.country
                    line1 = legalEntityAddressCreateRequest.line1
                    locality = legalEntityAddressCreateRequest.locality
                    postalCode = legalEntityAddressCreateRequest.postalCode
                    region = legalEntityAddressCreateRequest.region
                    addressTypes = legalEntityAddressCreateRequest.addressTypes?.toMutableList()
                    line2 = legalEntityAddressCreateRequest.line2
                    additionalProperties =
                        legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: String?) = apply { this.country = country }

                /** Country code conforms to [ISO 3166-1 alpha-2] */
                fun country(country: Optional<String>) = country(country.orElse(null))

                fun line1(line1: String?) = apply { this.line1 = line1 }

                fun line1(line1: Optional<String>) = line1(line1.orElse(null))

                /** Locality or City. */
                fun locality(locality: String?) = apply { this.locality = locality }

                /** Locality or City. */
                fun locality(locality: Optional<String>) = locality(locality.orElse(null))

                /** The postal code of the address. */
                fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

                /** The postal code of the address. */
                fun postalCode(postalCode: Optional<String>) = postalCode(postalCode.orElse(null))

                /** Region or State. */
                fun region(region: String?) = apply { this.region = region }

                /** Region or State. */
                fun region(region: Optional<String>) = region(region.orElse(null))

                /** The types of this address. */
                fun addressTypes(addressTypes: List<AddressType>?) = apply {
                    this.addressTypes = addressTypes?.toMutableList()
                }

                /** The types of this address. */
                fun addressTypes(addressTypes: Optional<List<AddressType>>) =
                    addressTypes(addressTypes.orElse(null))

                /** The types of this address. */
                fun addAddressType(addressType: AddressType) = apply {
                    addressTypes = (addressTypes ?: mutableListOf()).apply { add(addressType) }
                }

                fun line2(line2: String?) = apply { this.line2 = line2 }

                fun line2(line2: Optional<String>) = line2(line2.orElse(null))

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

                fun build(): LegalEntityAddressCreateRequest =
                    LegalEntityAddressCreateRequest(
                        country,
                        line1,
                        locality,
                        postalCode,
                        region,
                        addressTypes?.toImmutable(),
                        line2,
                        additionalProperties.toImmutable(),
                    )
            }

            class AddressType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BUSINESS = of("business")

                    @JvmField val MAILING = of("mailing")

                    @JvmField val OTHER = of("other")

                    @JvmField val PO_BOX = of("po_box")

                    @JvmField val RESIDENTIAL = of("residential")

                    @JvmStatic fun of(value: String) = AddressType(JsonField.of(value))
                }

                enum class Known {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                }

                enum class Value {
                    BUSINESS,
                    MAILING,
                    OTHER,
                    PO_BOX,
                    RESIDENTIAL,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BUSINESS -> Value.BUSINESS
                        MAILING -> Value.MAILING
                        OTHER -> Value.OTHER
                        PO_BOX -> Value.PO_BOX
                        RESIDENTIAL -> Value.RESIDENTIAL
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BUSINESS -> Known.BUSINESS
                        MAILING -> Known.MAILING
                        OTHER -> Known.OTHER
                        PO_BOX -> Known.PO_BOX
                        RESIDENTIAL -> Known.RESIDENTIAL
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown AddressType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AddressType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class IdentificationCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("id_number") private val idNumber: String,
            @JsonProperty("id_type") private val idType: IdType,
            @JsonProperty("issuing_country") private val issuingCountry: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The ID number of identification document. */
            @JsonProperty("id_number") fun idNumber(): String = idNumber

            /** The type of ID number. */
            @JsonProperty("id_type") fun idType(): IdType = idType

            /** The ISO 3166-1 alpha-2 country code of the country that issued the identification */
            @JsonProperty("issuing_country")
            fun issuingCountry(): Optional<String> = Optional.ofNullable(issuingCountry)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var idNumber: String? = null
                private var idType: IdType? = null
                private var issuingCountry: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(identificationCreateRequest: IdentificationCreateRequest) =
                    apply {
                        idNumber = identificationCreateRequest.idNumber
                        idType = identificationCreateRequest.idType
                        issuingCountry = identificationCreateRequest.issuingCountry
                        additionalProperties =
                            identificationCreateRequest.additionalProperties.toMutableMap()
                    }

                /** The ID number of identification document. */
                fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                /** The type of ID number. */
                fun idType(idType: IdType) = apply { this.idType = idType }

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: String?) = apply {
                    this.issuingCountry = issuingCountry
                }

                /**
                 * The ISO 3166-1 alpha-2 country code of the country that issued the identification
                 */
                fun issuingCountry(issuingCountry: Optional<String>) =
                    issuingCountry(issuingCountry.orElse(null))

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

                fun build(): IdentificationCreateRequest =
                    IdentificationCreateRequest(
                        checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                        checkNotNull(idType) { "`idType` is required but was not set" },
                        issuingCountry,
                        additionalProperties.toImmutable(),
                    )
            }

            class IdType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AR_CUIL = of("ar_cuil")

                    @JvmField val AR_CUIT = of("ar_cuit")

                    @JvmField val BR_CNPJ = of("br_cnpj")

                    @JvmField val BR_CPF = of("br_cpf")

                    @JvmField val CL_RUN = of("cl_run")

                    @JvmField val CL_RUT = of("cl_rut")

                    @JvmField val CO_CEDULAS = of("co_cedulas")

                    @JvmField val CO_NIT = of("co_nit")

                    @JvmField val HN_ID = of("hn_id")

                    @JvmField val HN_RTN = of("hn_rtn")

                    @JvmField val IN_LEI = of("in_lei")

                    @JvmField val KR_BRN = of("kr_brn")

                    @JvmField val KR_CRN = of("kr_crn")

                    @JvmField val KR_RRN = of("kr_rrn")

                    @JvmField val PASSPORT = of("passport")

                    @JvmField val SA_TIN = of("sa_tin")

                    @JvmField val SA_VAT = of("sa_vat")

                    @JvmField val US_EIN = of("us_ein")

                    @JvmField val US_ITIN = of("us_itin")

                    @JvmField val US_SSN = of("us_ssn")

                    @JvmField val VN_TIN = of("vn_tin")

                    @JvmStatic fun of(value: String) = IdType(JsonField.of(value))
                }

                enum class Known {
                    AR_CUIL,
                    AR_CUIT,
                    BR_CNPJ,
                    BR_CPF,
                    CL_RUN,
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
                    IN_LEI,
                    KR_BRN,
                    KR_CRN,
                    KR_RRN,
                    PASSPORT,
                    SA_TIN,
                    SA_VAT,
                    US_EIN,
                    US_ITIN,
                    US_SSN,
                    VN_TIN,
                }

                enum class Value {
                    AR_CUIL,
                    AR_CUIT,
                    BR_CNPJ,
                    BR_CPF,
                    CL_RUN,
                    CL_RUT,
                    CO_CEDULAS,
                    CO_NIT,
                    HN_ID,
                    HN_RTN,
                    IN_LEI,
                    KR_BRN,
                    KR_CRN,
                    KR_RRN,
                    PASSPORT,
                    SA_TIN,
                    SA_VAT,
                    US_EIN,
                    US_ITIN,
                    US_SSN,
                    VN_TIN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AR_CUIL -> Value.AR_CUIL
                        AR_CUIT -> Value.AR_CUIT
                        BR_CNPJ -> Value.BR_CNPJ
                        BR_CPF -> Value.BR_CPF
                        CL_RUN -> Value.CL_RUN
                        CL_RUT -> Value.CL_RUT
                        CO_CEDULAS -> Value.CO_CEDULAS
                        CO_NIT -> Value.CO_NIT
                        HN_ID -> Value.HN_ID
                        HN_RTN -> Value.HN_RTN
                        IN_LEI -> Value.IN_LEI
                        KR_BRN -> Value.KR_BRN
                        KR_CRN -> Value.KR_CRN
                        KR_RRN -> Value.KR_RRN
                        PASSPORT -> Value.PASSPORT
                        SA_TIN -> Value.SA_TIN
                        SA_VAT -> Value.SA_VAT
                        US_EIN -> Value.US_EIN
                        US_ITIN -> Value.US_ITIN
                        US_SSN -> Value.US_SSN
                        VN_TIN -> Value.VN_TIN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AR_CUIL -> Known.AR_CUIL
                        AR_CUIT -> Known.AR_CUIT
                        BR_CNPJ -> Known.BR_CNPJ
                        BR_CPF -> Known.BR_CPF
                        CL_RUN -> Known.CL_RUN
                        CL_RUT -> Known.CL_RUT
                        CO_CEDULAS -> Known.CO_CEDULAS
                        CO_NIT -> Known.CO_NIT
                        HN_ID -> Known.HN_ID
                        HN_RTN -> Known.HN_RTN
                        IN_LEI -> Known.IN_LEI
                        KR_BRN -> Known.KR_BRN
                        KR_CRN -> Known.KR_CRN
                        KR_RRN -> Known.KR_RRN
                        PASSPORT -> Known.PASSPORT
                        SA_TIN -> Known.SA_TIN
                        SA_VAT -> Known.SA_VAT
                        US_EIN -> Known.US_EIN
                        US_ITIN -> Known.US_ITIN
                        US_SSN -> Known.US_SSN
                        VN_TIN -> Known.VN_TIN
                        else -> throw ModernTreasuryInvalidDataException("Unknown IdType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is IdType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is IdentificationCreateRequest && idNumber == other.idNumber && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(idNumber, idType, issuingCountry, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class LegalEntityAssociationInlineCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("relationship_types")
            private val relationshipTypes: List<RelationshipType>,
            @JsonProperty("child_legal_entity")
            private val childLegalEntity: ChildLegalEntityCreate?,
            @JsonProperty("child_legal_entity_id") private val childLegalEntityId: String?,
            @JsonProperty("ownership_percentage") private val ownershipPercentage: Long?,
            @JsonProperty("title") private val title: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("relationship_types")
            fun relationshipTypes(): List<RelationshipType> = relationshipTypes

            /** The child legal entity. */
            @JsonProperty("child_legal_entity")
            fun childLegalEntity(): Optional<ChildLegalEntityCreate> =
                Optional.ofNullable(childLegalEntity)

            /** The ID of the child legal entity. */
            @JsonProperty("child_legal_entity_id")
            fun childLegalEntityId(): Optional<String> = Optional.ofNullable(childLegalEntityId)

            /** The child entity's ownership percentage iff they are a beneficial owner. */
            @JsonProperty("ownership_percentage")
            fun ownershipPercentage(): Optional<Long> = Optional.ofNullable(ownershipPercentage)

            /** The job title of the child entity at the parent entity. */
            @JsonProperty("title") fun title(): Optional<String> = Optional.ofNullable(title)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var relationshipTypes: MutableList<RelationshipType>? = null
                private var childLegalEntity: ChildLegalEntityCreate? = null
                private var childLegalEntityId: String? = null
                private var ownershipPercentage: Long? = null
                private var title: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    legalEntityAssociationInlineCreateRequest:
                        LegalEntityAssociationInlineCreateRequest
                ) = apply {
                    relationshipTypes =
                        legalEntityAssociationInlineCreateRequest.relationshipTypes.toMutableList()
                    childLegalEntity = legalEntityAssociationInlineCreateRequest.childLegalEntity
                    childLegalEntityId =
                        legalEntityAssociationInlineCreateRequest.childLegalEntityId
                    ownershipPercentage =
                        legalEntityAssociationInlineCreateRequest.ownershipPercentage
                    title = legalEntityAssociationInlineCreateRequest.title
                    additionalProperties =
                        legalEntityAssociationInlineCreateRequest.additionalProperties
                            .toMutableMap()
                }

                fun relationshipTypes(relationshipTypes: List<RelationshipType>) = apply {
                    this.relationshipTypes = relationshipTypes.toMutableList()
                }

                fun addRelationshipType(relationshipType: RelationshipType) = apply {
                    relationshipTypes =
                        (relationshipTypes ?: mutableListOf()).apply { add(relationshipType) }
                }

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: ChildLegalEntityCreate?) = apply {
                    this.childLegalEntity = childLegalEntity
                }

                /** The child legal entity. */
                fun childLegalEntity(childLegalEntity: Optional<ChildLegalEntityCreate>) =
                    childLegalEntity(childLegalEntity.orElse(null))

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: String?) = apply {
                    this.childLegalEntityId = childLegalEntityId
                }

                /** The ID of the child legal entity. */
                fun childLegalEntityId(childLegalEntityId: Optional<String>) =
                    childLegalEntityId(childLegalEntityId.orElse(null))

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long?) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                fun ownershipPercentage(ownershipPercentage: Long) =
                    ownershipPercentage(ownershipPercentage as Long?)

                /** The child entity's ownership percentage iff they are a beneficial owner. */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun ownershipPercentage(ownershipPercentage: Optional<Long>) =
                    ownershipPercentage(ownershipPercentage.orElse(null) as Long?)

                /** The job title of the child entity at the parent entity. */
                fun title(title: String?) = apply { this.title = title }

                /** The job title of the child entity at the parent entity. */
                fun title(title: Optional<String>) = title(title.orElse(null))

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

                fun build(): LegalEntityAssociationInlineCreateRequest =
                    LegalEntityAssociationInlineCreateRequest(
                        checkNotNull(relationshipTypes) {
                                "`relationshipTypes` is required but was not set"
                            }
                            .toImmutable(),
                        childLegalEntity,
                        childLegalEntityId,
                        ownershipPercentage,
                        title,
                        additionalProperties.toImmutable(),
                    )
            }

            class RelationshipType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val BENEFICIAL_OWNER = of("beneficial_owner")

                    @JvmField val CONTROL_PERSON = of("control_person")

                    @JvmStatic fun of(value: String) = RelationshipType(JsonField.of(value))
                }

                enum class Known {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                }

                enum class Value {
                    BENEFICIAL_OWNER,
                    CONTROL_PERSON,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        BENEFICIAL_OWNER -> Value.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Value.CONTROL_PERSON
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        BENEFICIAL_OWNER -> Known.BENEFICIAL_OWNER
                        CONTROL_PERSON -> Known.CONTROL_PERSON
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown RelationshipType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RelationshipType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The child legal entity. */
            @NoAutoDetect
            class ChildLegalEntityCreate
            @JsonCreator
            private constructor(
                @JsonProperty("addresses")
                private val addresses: List<LegalEntityAddressCreateRequest>?,
                @JsonProperty("bank_settings") private val bankSettings: BankSettings?,
                @JsonProperty("business_name") private val businessName: String?,
                @JsonProperty("citizenship_country") private val citizenshipCountry: String?,
                @JsonProperty("date_formed") private val dateFormed: LocalDate?,
                @JsonProperty("date_of_birth") private val dateOfBirth: LocalDate?,
                @JsonProperty("doing_business_as_names")
                private val doingBusinessAsNames: List<String>?,
                @JsonProperty("email") private val email: String?,
                @JsonProperty("first_name") private val firstName: String?,
                @JsonProperty("identifications")
                private val identifications: List<IdentificationCreateRequest>?,
                @JsonProperty("last_name") private val lastName: String?,
                @JsonProperty("legal_entity_type") private val legalEntityType: LegalEntityType?,
                @JsonProperty("legal_structure") private val legalStructure: LegalStructure?,
                @JsonProperty("metadata") private val metadata: Metadata?,
                @JsonProperty("middle_name") private val middleName: String?,
                @JsonProperty("phone_numbers") private val phoneNumbers: List<PhoneNumber>?,
                @JsonProperty("politically_exposed_person")
                private val politicallyExposedPerson: Boolean?,
                @JsonProperty("preferred_name") private val preferredName: String?,
                @JsonProperty("prefix") private val prefix: String?,
                @JsonProperty("risk_rating") private val riskRating: RiskRating?,
                @JsonProperty("suffix") private val suffix: String?,
                @JsonProperty("wealth_and_employment_details")
                private val wealthAndEmploymentDetails: WealthAndEmploymentDetails?,
                @JsonProperty("website") private val website: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** A list of addresses for the entity. */
                @JsonProperty("addresses")
                fun addresses(): Optional<List<LegalEntityAddressCreateRequest>> =
                    Optional.ofNullable(addresses)

                @JsonProperty("bank_settings")
                fun bankSettings(): Optional<BankSettings> = Optional.ofNullable(bankSettings)

                /** The business's legal business name. */
                @JsonProperty("business_name")
                fun businessName(): Optional<String> = Optional.ofNullable(businessName)

                /** The country of citizenship for an individual. */
                @JsonProperty("citizenship_country")
                fun citizenshipCountry(): Optional<String> = Optional.ofNullable(citizenshipCountry)

                /** A business's formation date (YYYY-MM-DD). */
                @JsonProperty("date_formed")
                fun dateFormed(): Optional<LocalDate> = Optional.ofNullable(dateFormed)

                /** An individual's date of birth (YYYY-MM-DD). */
                @JsonProperty("date_of_birth")
                fun dateOfBirth(): Optional<LocalDate> = Optional.ofNullable(dateOfBirth)

                @JsonProperty("doing_business_as_names")
                fun doingBusinessAsNames(): Optional<List<String>> =
                    Optional.ofNullable(doingBusinessAsNames)

                /** The entity's primary email. */
                @JsonProperty("email") fun email(): Optional<String> = Optional.ofNullable(email)

                /** An individual's first name. */
                @JsonProperty("first_name")
                fun firstName(): Optional<String> = Optional.ofNullable(firstName)

                /** A list of identifications for the legal entity. */
                @JsonProperty("identifications")
                fun identifications(): Optional<List<IdentificationCreateRequest>> =
                    Optional.ofNullable(identifications)

                /** An individual's last name. */
                @JsonProperty("last_name")
                fun lastName(): Optional<String> = Optional.ofNullable(lastName)

                /** The type of legal entity. */
                @JsonProperty("legal_entity_type")
                fun legalEntityType(): Optional<LegalEntityType> =
                    Optional.ofNullable(legalEntityType)

                /** The business's legal structure. */
                @JsonProperty("legal_structure")
                fun legalStructure(): Optional<LegalStructure> = Optional.ofNullable(legalStructure)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /** An individual's middle name. */
                @JsonProperty("middle_name")
                fun middleName(): Optional<String> = Optional.ofNullable(middleName)

                @JsonProperty("phone_numbers")
                fun phoneNumbers(): Optional<List<PhoneNumber>> = Optional.ofNullable(phoneNumbers)

                /** Whether the individual is a politically exposed person. */
                @JsonProperty("politically_exposed_person")
                fun politicallyExposedPerson(): Optional<Boolean> =
                    Optional.ofNullable(politicallyExposedPerson)

                /** An individual's preferred name. */
                @JsonProperty("preferred_name")
                fun preferredName(): Optional<String> = Optional.ofNullable(preferredName)

                /** An individual's prefix. */
                @JsonProperty("prefix") fun prefix(): Optional<String> = Optional.ofNullable(prefix)

                /** The risk rating of the legal entity. One of low, medium, high. */
                @JsonProperty("risk_rating")
                fun riskRating(): Optional<RiskRating> = Optional.ofNullable(riskRating)

                /** An individual's suffix. */
                @JsonProperty("suffix") fun suffix(): Optional<String> = Optional.ofNullable(suffix)

                @JsonProperty("wealth_and_employment_details")
                fun wealthAndEmploymentDetails(): Optional<WealthAndEmploymentDetails> =
                    Optional.ofNullable(wealthAndEmploymentDetails)

                /** The entity's primary website URL. */
                @JsonProperty("website")
                fun website(): Optional<String> = Optional.ofNullable(website)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var addresses: MutableList<LegalEntityAddressCreateRequest>? = null
                    private var bankSettings: BankSettings? = null
                    private var businessName: String? = null
                    private var citizenshipCountry: String? = null
                    private var dateFormed: LocalDate? = null
                    private var dateOfBirth: LocalDate? = null
                    private var doingBusinessAsNames: MutableList<String>? = null
                    private var email: String? = null
                    private var firstName: String? = null
                    private var identifications: MutableList<IdentificationCreateRequest>? = null
                    private var lastName: String? = null
                    private var legalEntityType: LegalEntityType? = null
                    private var legalStructure: LegalStructure? = null
                    private var metadata: Metadata? = null
                    private var middleName: String? = null
                    private var phoneNumbers: MutableList<PhoneNumber>? = null
                    private var politicallyExposedPerson: Boolean? = null
                    private var preferredName: String? = null
                    private var prefix: String? = null
                    private var riskRating: RiskRating? = null
                    private var suffix: String? = null
                    private var wealthAndEmploymentDetails: WealthAndEmploymentDetails? = null
                    private var website: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(childLegalEntityCreate: ChildLegalEntityCreate) = apply {
                        addresses = childLegalEntityCreate.addresses?.toMutableList()
                        bankSettings = childLegalEntityCreate.bankSettings
                        businessName = childLegalEntityCreate.businessName
                        citizenshipCountry = childLegalEntityCreate.citizenshipCountry
                        dateFormed = childLegalEntityCreate.dateFormed
                        dateOfBirth = childLegalEntityCreate.dateOfBirth
                        doingBusinessAsNames =
                            childLegalEntityCreate.doingBusinessAsNames?.toMutableList()
                        email = childLegalEntityCreate.email
                        firstName = childLegalEntityCreate.firstName
                        identifications = childLegalEntityCreate.identifications?.toMutableList()
                        lastName = childLegalEntityCreate.lastName
                        legalEntityType = childLegalEntityCreate.legalEntityType
                        legalStructure = childLegalEntityCreate.legalStructure
                        metadata = childLegalEntityCreate.metadata
                        middleName = childLegalEntityCreate.middleName
                        phoneNumbers = childLegalEntityCreate.phoneNumbers?.toMutableList()
                        politicallyExposedPerson = childLegalEntityCreate.politicallyExposedPerson
                        preferredName = childLegalEntityCreate.preferredName
                        prefix = childLegalEntityCreate.prefix
                        riskRating = childLegalEntityCreate.riskRating
                        suffix = childLegalEntityCreate.suffix
                        wealthAndEmploymentDetails =
                            childLegalEntityCreate.wealthAndEmploymentDetails
                        website = childLegalEntityCreate.website
                        additionalProperties =
                            childLegalEntityCreate.additionalProperties.toMutableMap()
                    }

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: List<LegalEntityAddressCreateRequest>?) = apply {
                        this.addresses = addresses?.toMutableList()
                    }

                    /** A list of addresses for the entity. */
                    fun addresses(addresses: Optional<List<LegalEntityAddressCreateRequest>>) =
                        addresses(addresses.orElse(null))

                    /** A list of addresses for the entity. */
                    fun addAddress(address: LegalEntityAddressCreateRequest) = apply {
                        addresses = (addresses ?: mutableListOf()).apply { add(address) }
                    }

                    fun bankSettings(bankSettings: BankSettings?) = apply {
                        this.bankSettings = bankSettings
                    }

                    fun bankSettings(bankSettings: Optional<BankSettings>) =
                        bankSettings(bankSettings.orElse(null))

                    /** The business's legal business name. */
                    fun businessName(businessName: String?) = apply {
                        this.businessName = businessName
                    }

                    /** The business's legal business name. */
                    fun businessName(businessName: Optional<String>) =
                        businessName(businessName.orElse(null))

                    /** The country of citizenship for an individual. */
                    fun citizenshipCountry(citizenshipCountry: String?) = apply {
                        this.citizenshipCountry = citizenshipCountry
                    }

                    /** The country of citizenship for an individual. */
                    fun citizenshipCountry(citizenshipCountry: Optional<String>) =
                        citizenshipCountry(citizenshipCountry.orElse(null))

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: LocalDate?) = apply { this.dateFormed = dateFormed }

                    /** A business's formation date (YYYY-MM-DD). */
                    fun dateFormed(dateFormed: Optional<LocalDate>) =
                        dateFormed(dateFormed.orElse(null))

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: LocalDate?) = apply {
                        this.dateOfBirth = dateOfBirth
                    }

                    /** An individual's date of birth (YYYY-MM-DD). */
                    fun dateOfBirth(dateOfBirth: Optional<LocalDate>) =
                        dateOfBirth(dateOfBirth.orElse(null))

                    fun doingBusinessAsNames(doingBusinessAsNames: List<String>?) = apply {
                        this.doingBusinessAsNames = doingBusinessAsNames?.toMutableList()
                    }

                    fun doingBusinessAsNames(doingBusinessAsNames: Optional<List<String>>) =
                        doingBusinessAsNames(doingBusinessAsNames.orElse(null))

                    fun addDoingBusinessAsName(doingBusinessAsName: String) = apply {
                        doingBusinessAsNames =
                            (doingBusinessAsNames ?: mutableListOf()).apply {
                                add(doingBusinessAsName)
                            }
                    }

                    /** The entity's primary email. */
                    fun email(email: String?) = apply { this.email = email }

                    /** The entity's primary email. */
                    fun email(email: Optional<String>) = email(email.orElse(null))

                    /** An individual's first name. */
                    fun firstName(firstName: String?) = apply { this.firstName = firstName }

                    /** An individual's first name. */
                    fun firstName(firstName: Optional<String>) = firstName(firstName.orElse(null))

                    /** A list of identifications for the legal entity. */
                    fun identifications(identifications: List<IdentificationCreateRequest>?) =
                        apply {
                            this.identifications = identifications?.toMutableList()
                        }

                    /** A list of identifications for the legal entity. */
                    fun identifications(
                        identifications: Optional<List<IdentificationCreateRequest>>
                    ) = identifications(identifications.orElse(null))

                    /** A list of identifications for the legal entity. */
                    fun addIdentification(identification: IdentificationCreateRequest) = apply {
                        identifications =
                            (identifications ?: mutableListOf()).apply { add(identification) }
                    }

                    /** An individual's last name. */
                    fun lastName(lastName: String?) = apply { this.lastName = lastName }

                    /** An individual's last name. */
                    fun lastName(lastName: Optional<String>) = lastName(lastName.orElse(null))

                    /** The type of legal entity. */
                    fun legalEntityType(legalEntityType: LegalEntityType?) = apply {
                        this.legalEntityType = legalEntityType
                    }

                    /** The type of legal entity. */
                    fun legalEntityType(legalEntityType: Optional<LegalEntityType>) =
                        legalEntityType(legalEntityType.orElse(null))

                    /** The business's legal structure. */
                    fun legalStructure(legalStructure: LegalStructure?) = apply {
                        this.legalStructure = legalStructure
                    }

                    /** The business's legal structure. */
                    fun legalStructure(legalStructure: Optional<LegalStructure>) =
                        legalStructure(legalStructure.orElse(null))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

                    /** An individual's middle name. */
                    fun middleName(middleName: String?) = apply { this.middleName = middleName }

                    /** An individual's middle name. */
                    fun middleName(middleName: Optional<String>) =
                        middleName(middleName.orElse(null))

                    fun phoneNumbers(phoneNumbers: List<PhoneNumber>?) = apply {
                        this.phoneNumbers = phoneNumbers?.toMutableList()
                    }

                    fun phoneNumbers(phoneNumbers: Optional<List<PhoneNumber>>) =
                        phoneNumbers(phoneNumbers.orElse(null))

                    fun addPhoneNumber(phoneNumber: PhoneNumber) = apply {
                        phoneNumbers = (phoneNumbers ?: mutableListOf()).apply { add(phoneNumber) }
                    }

                    /** Whether the individual is a politically exposed person. */
                    fun politicallyExposedPerson(politicallyExposedPerson: Boolean?) = apply {
                        this.politicallyExposedPerson = politicallyExposedPerson
                    }

                    /** Whether the individual is a politically exposed person. */
                    fun politicallyExposedPerson(politicallyExposedPerson: Boolean) =
                        politicallyExposedPerson(politicallyExposedPerson as Boolean?)

                    /** Whether the individual is a politically exposed person. */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun politicallyExposedPerson(politicallyExposedPerson: Optional<Boolean>) =
                        politicallyExposedPerson(politicallyExposedPerson.orElse(null) as Boolean?)

                    /** An individual's preferred name. */
                    fun preferredName(preferredName: String?) = apply {
                        this.preferredName = preferredName
                    }

                    /** An individual's preferred name. */
                    fun preferredName(preferredName: Optional<String>) =
                        preferredName(preferredName.orElse(null))

                    /** An individual's prefix. */
                    fun prefix(prefix: String?) = apply { this.prefix = prefix }

                    /** An individual's prefix. */
                    fun prefix(prefix: Optional<String>) = prefix(prefix.orElse(null))

                    /** The risk rating of the legal entity. One of low, medium, high. */
                    fun riskRating(riskRating: RiskRating?) = apply { this.riskRating = riskRating }

                    /** The risk rating of the legal entity. One of low, medium, high. */
                    fun riskRating(riskRating: Optional<RiskRating>) =
                        riskRating(riskRating.orElse(null))

                    /** An individual's suffix. */
                    fun suffix(suffix: String?) = apply { this.suffix = suffix }

                    /** An individual's suffix. */
                    fun suffix(suffix: Optional<String>) = suffix(suffix.orElse(null))

                    fun wealthAndEmploymentDetails(
                        wealthAndEmploymentDetails: WealthAndEmploymentDetails?
                    ) = apply { this.wealthAndEmploymentDetails = wealthAndEmploymentDetails }

                    fun wealthAndEmploymentDetails(
                        wealthAndEmploymentDetails: Optional<WealthAndEmploymentDetails>
                    ) = wealthAndEmploymentDetails(wealthAndEmploymentDetails.orElse(null))

                    /** The entity's primary website URL. */
                    fun website(website: String?) = apply { this.website = website }

                    /** The entity's primary website URL. */
                    fun website(website: Optional<String>) = website(website.orElse(null))

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

                    fun build(): ChildLegalEntityCreate =
                        ChildLegalEntityCreate(
                            addresses?.toImmutable(),
                            bankSettings,
                            businessName,
                            citizenshipCountry,
                            dateFormed,
                            dateOfBirth,
                            doingBusinessAsNames?.toImmutable(),
                            email,
                            firstName,
                            identifications?.toImmutable(),
                            lastName,
                            legalEntityType,
                            legalStructure,
                            metadata,
                            middleName,
                            phoneNumbers?.toImmutable(),
                            politicallyExposedPerson,
                            preferredName,
                            prefix,
                            riskRating,
                            suffix,
                            wealthAndEmploymentDetails,
                            website,
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LegalEntityAddressCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country") private val country: String?,
                    @JsonProperty("line1") private val line1: String?,
                    @JsonProperty("locality") private val locality: String?,
                    @JsonProperty("postal_code") private val postalCode: String?,
                    @JsonProperty("region") private val region: String?,
                    @JsonProperty("address_types") private val addressTypes: List<AddressType>?,
                    @JsonProperty("line2") private val line2: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    fun country(): Optional<String> = Optional.ofNullable(country)

                    @JsonProperty("line1")
                    fun line1(): Optional<String> = Optional.ofNullable(line1)

                    /** Locality or City. */
                    @JsonProperty("locality")
                    fun locality(): Optional<String> = Optional.ofNullable(locality)

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

                    /** Region or State. */
                    @JsonProperty("region")
                    fun region(): Optional<String> = Optional.ofNullable(region)

                    /** The types of this address. */
                    @JsonProperty("address_types")
                    fun addressTypes(): Optional<List<AddressType>> =
                        Optional.ofNullable(addressTypes)

                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var country: String? = null
                        private var line1: String? = null
                        private var locality: String? = null
                        private var postalCode: String? = null
                        private var region: String? = null
                        private var addressTypes: MutableList<AddressType>? = null
                        private var line2: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            legalEntityAddressCreateRequest: LegalEntityAddressCreateRequest
                        ) = apply {
                            country = legalEntityAddressCreateRequest.country
                            line1 = legalEntityAddressCreateRequest.line1
                            locality = legalEntityAddressCreateRequest.locality
                            postalCode = legalEntityAddressCreateRequest.postalCode
                            region = legalEntityAddressCreateRequest.region
                            addressTypes =
                                legalEntityAddressCreateRequest.addressTypes?.toMutableList()
                            line2 = legalEntityAddressCreateRequest.line2
                            additionalProperties =
                                legalEntityAddressCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String?) = apply { this.country = country }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: Optional<String>) = country(country.orElse(null))

                        fun line1(line1: String?) = apply { this.line1 = line1 }

                        fun line1(line1: Optional<String>) = line1(line1.orElse(null))

                        /** Locality or City. */
                        fun locality(locality: String?) = apply { this.locality = locality }

                        /** Locality or City. */
                        fun locality(locality: Optional<String>) = locality(locality.orElse(null))

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String?) = apply { this.postalCode = postalCode }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: Optional<String>) =
                            postalCode(postalCode.orElse(null))

                        /** Region or State. */
                        fun region(region: String?) = apply { this.region = region }

                        /** Region or State. */
                        fun region(region: Optional<String>) = region(region.orElse(null))

                        /** The types of this address. */
                        fun addressTypes(addressTypes: List<AddressType>?) = apply {
                            this.addressTypes = addressTypes?.toMutableList()
                        }

                        /** The types of this address. */
                        fun addressTypes(addressTypes: Optional<List<AddressType>>) =
                            addressTypes(addressTypes.orElse(null))

                        /** The types of this address. */
                        fun addAddressType(addressType: AddressType) = apply {
                            addressTypes =
                                (addressTypes ?: mutableListOf()).apply { add(addressType) }
                        }

                        fun line2(line2: String?) = apply { this.line2 = line2 }

                        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LegalEntityAddressCreateRequest =
                            LegalEntityAddressCreateRequest(
                                country,
                                line1,
                                locality,
                                postalCode,
                                region,
                                addressTypes?.toImmutable(),
                                line2,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AddressType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val BUSINESS = of("business")

                            @JvmField val MAILING = of("mailing")

                            @JvmField val OTHER = of("other")

                            @JvmField val PO_BOX = of("po_box")

                            @JvmField val RESIDENTIAL = of("residential")

                            @JvmStatic fun of(value: String) = AddressType(JsonField.of(value))
                        }

                        enum class Known {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                        }

                        enum class Value {
                            BUSINESS,
                            MAILING,
                            OTHER,
                            PO_BOX,
                            RESIDENTIAL,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                BUSINESS -> Value.BUSINESS
                                MAILING -> Value.MAILING
                                OTHER -> Value.OTHER
                                PO_BOX -> Value.PO_BOX
                                RESIDENTIAL -> Value.RESIDENTIAL
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                BUSINESS -> Known.BUSINESS
                                MAILING -> Known.MAILING
                                OTHER -> Known.OTHER
                                PO_BOX -> Known.PO_BOX
                                RESIDENTIAL -> Known.RESIDENTIAL
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AddressType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AddressType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalEntityAddressCreateRequest && country == other.country && line1 == other.line1 && locality == other.locality && postalCode == other.postalCode && region == other.region && addressTypes == other.addressTypes && line2 == other.line2 && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, locality, postalCode, region, addressTypes, line2, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LegalEntityAddressCreateRequest{country=$country, line1=$line1, locality=$locality, postalCode=$postalCode, region=$region, addressTypes=$addressTypes, line2=$line2, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class IdentificationCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("id_number") private val idNumber: String,
                    @JsonProperty("id_type") private val idType: IdType,
                    @JsonProperty("issuing_country") private val issuingCountry: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The ID number of identification document. */
                    @JsonProperty("id_number") fun idNumber(): String = idNumber

                    /** The type of ID number. */
                    @JsonProperty("id_type") fun idType(): IdType = idType

                    /**
                     * The ISO 3166-1 alpha-2 country code of the country that issued the
                     * identification
                     */
                    @JsonProperty("issuing_country")
                    fun issuingCountry(): Optional<String> = Optional.ofNullable(issuingCountry)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var idNumber: String? = null
                        private var idType: IdType? = null
                        private var issuingCountry: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(
                            identificationCreateRequest: IdentificationCreateRequest
                        ) = apply {
                            idNumber = identificationCreateRequest.idNumber
                            idType = identificationCreateRequest.idType
                            issuingCountry = identificationCreateRequest.issuingCountry
                            additionalProperties =
                                identificationCreateRequest.additionalProperties.toMutableMap()
                        }

                        /** The ID number of identification document. */
                        fun idNumber(idNumber: String) = apply { this.idNumber = idNumber }

                        /** The type of ID number. */
                        fun idType(idType: IdType) = apply { this.idType = idType }

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: String?) = apply {
                            this.issuingCountry = issuingCountry
                        }

                        /**
                         * The ISO 3166-1 alpha-2 country code of the country that issued the
                         * identification
                         */
                        fun issuingCountry(issuingCountry: Optional<String>) =
                            issuingCountry(issuingCountry.orElse(null))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): IdentificationCreateRequest =
                            IdentificationCreateRequest(
                                checkNotNull(idNumber) { "`idNumber` is required but was not set" },
                                checkNotNull(idType) { "`idType` is required but was not set" },
                                issuingCountry,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class IdType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val AR_CUIL = of("ar_cuil")

                            @JvmField val AR_CUIT = of("ar_cuit")

                            @JvmField val BR_CNPJ = of("br_cnpj")

                            @JvmField val BR_CPF = of("br_cpf")

                            @JvmField val CL_RUN = of("cl_run")

                            @JvmField val CL_RUT = of("cl_rut")

                            @JvmField val CO_CEDULAS = of("co_cedulas")

                            @JvmField val CO_NIT = of("co_nit")

                            @JvmField val HN_ID = of("hn_id")

                            @JvmField val HN_RTN = of("hn_rtn")

                            @JvmField val IN_LEI = of("in_lei")

                            @JvmField val KR_BRN = of("kr_brn")

                            @JvmField val KR_CRN = of("kr_crn")

                            @JvmField val KR_RRN = of("kr_rrn")

                            @JvmField val PASSPORT = of("passport")

                            @JvmField val SA_TIN = of("sa_tin")

                            @JvmField val SA_VAT = of("sa_vat")

                            @JvmField val US_EIN = of("us_ein")

                            @JvmField val US_ITIN = of("us_itin")

                            @JvmField val US_SSN = of("us_ssn")

                            @JvmField val VN_TIN = of("vn_tin")

                            @JvmStatic fun of(value: String) = IdType(JsonField.of(value))
                        }

                        enum class Known {
                            AR_CUIL,
                            AR_CUIT,
                            BR_CNPJ,
                            BR_CPF,
                            CL_RUN,
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
                            IN_LEI,
                            KR_BRN,
                            KR_CRN,
                            KR_RRN,
                            PASSPORT,
                            SA_TIN,
                            SA_VAT,
                            US_EIN,
                            US_ITIN,
                            US_SSN,
                            VN_TIN,
                        }

                        enum class Value {
                            AR_CUIL,
                            AR_CUIT,
                            BR_CNPJ,
                            BR_CPF,
                            CL_RUN,
                            CL_RUT,
                            CO_CEDULAS,
                            CO_NIT,
                            HN_ID,
                            HN_RTN,
                            IN_LEI,
                            KR_BRN,
                            KR_CRN,
                            KR_RRN,
                            PASSPORT,
                            SA_TIN,
                            SA_VAT,
                            US_EIN,
                            US_ITIN,
                            US_SSN,
                            VN_TIN,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AR_CUIL -> Value.AR_CUIL
                                AR_CUIT -> Value.AR_CUIT
                                BR_CNPJ -> Value.BR_CNPJ
                                BR_CPF -> Value.BR_CPF
                                CL_RUN -> Value.CL_RUN
                                CL_RUT -> Value.CL_RUT
                                CO_CEDULAS -> Value.CO_CEDULAS
                                CO_NIT -> Value.CO_NIT
                                HN_ID -> Value.HN_ID
                                HN_RTN -> Value.HN_RTN
                                IN_LEI -> Value.IN_LEI
                                KR_BRN -> Value.KR_BRN
                                KR_CRN -> Value.KR_CRN
                                KR_RRN -> Value.KR_RRN
                                PASSPORT -> Value.PASSPORT
                                SA_TIN -> Value.SA_TIN
                                SA_VAT -> Value.SA_VAT
                                US_EIN -> Value.US_EIN
                                US_ITIN -> Value.US_ITIN
                                US_SSN -> Value.US_SSN
                                VN_TIN -> Value.VN_TIN
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AR_CUIL -> Known.AR_CUIL
                                AR_CUIT -> Known.AR_CUIT
                                BR_CNPJ -> Known.BR_CNPJ
                                BR_CPF -> Known.BR_CPF
                                CL_RUN -> Known.CL_RUN
                                CL_RUT -> Known.CL_RUT
                                CO_CEDULAS -> Known.CO_CEDULAS
                                CO_NIT -> Known.CO_NIT
                                HN_ID -> Known.HN_ID
                                HN_RTN -> Known.HN_RTN
                                IN_LEI -> Known.IN_LEI
                                KR_BRN -> Known.KR_BRN
                                KR_CRN -> Known.KR_CRN
                                KR_RRN -> Known.KR_RRN
                                PASSPORT -> Known.PASSPORT
                                SA_TIN -> Known.SA_TIN
                                SA_VAT -> Known.SA_VAT
                                US_EIN -> Known.US_EIN
                                US_ITIN -> Known.US_ITIN
                                US_SSN -> Known.US_SSN
                                VN_TIN -> Known.VN_TIN
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown IdType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is IdType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is IdentificationCreateRequest && idNumber == other.idNumber && idType == other.idType && issuingCountry == other.issuingCountry && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(idNumber, idType, issuingCountry, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "IdentificationCreateRequest{idNumber=$idNumber, idType=$idType, issuingCountry=$issuingCountry, additionalProperties=$additionalProperties}"
                }

                class LegalEntityType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val BUSINESS = of("business")

                        @JvmField val INDIVIDUAL = of("individual")

                        @JvmStatic fun of(value: String) = LegalEntityType(JsonField.of(value))
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
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalEntityType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalEntityType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class LegalStructure
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val CORPORATION = of("corporation")

                        @JvmField val LLC = of("llc")

                        @JvmField val NON_PROFIT = of("non_profit")

                        @JvmField val PARTNERSHIP = of("partnership")

                        @JvmField val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

                        @JvmField val TRUST = of("trust")

                        @JvmStatic fun of(value: String) = LegalStructure(JsonField.of(value))
                    }

                    enum class Known {
                        CORPORATION,
                        LLC,
                        NON_PROFIT,
                        PARTNERSHIP,
                        SOLE_PROPRIETORSHIP,
                        TRUST,
                    }

                    enum class Value {
                        CORPORATION,
                        LLC,
                        NON_PROFIT,
                        PARTNERSHIP,
                        SOLE_PROPRIETORSHIP,
                        TRUST,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            CORPORATION -> Value.CORPORATION
                            LLC -> Value.LLC
                            NON_PROFIT -> Value.NON_PROFIT
                            PARTNERSHIP -> Value.PARTNERSHIP
                            SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                            TRUST -> Value.TRUST
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            CORPORATION -> Known.CORPORATION
                            LLC -> Known.LLC
                            NON_PROFIT -> Known.NON_PROFIT
                            PARTNERSHIP -> Known.PARTNERSHIP
                            SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                            TRUST -> Known.TRUST
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LegalStructure: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LegalStructure && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                /** A list of phone numbers in E.164 format. */
                @NoAutoDetect
                class PhoneNumber
                @JsonCreator
                private constructor(
                    @JsonProperty("phone_number") private val phoneNumber: String?,
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonProperty("phone_number")
                    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var phoneNumber: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(phoneNumber: PhoneNumber) = apply {
                            this.phoneNumber = phoneNumber.phoneNumber
                            additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                        }

                        fun phoneNumber(phoneNumber: String?) = apply {
                            this.phoneNumber = phoneNumber
                        }

                        fun phoneNumber(phoneNumber: Optional<String>) =
                            phoneNumber(phoneNumber.orElse(null))

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PhoneNumber =
                            PhoneNumber(phoneNumber, additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PhoneNumber && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
                }

                class RiskRating
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val LOW = of("low")

                        @JvmField val MEDIUM = of("medium")

                        @JvmField val HIGH = of("high")

                        @JvmStatic fun of(value: String) = RiskRating(JsonField.of(value))
                    }

                    enum class Known {
                        LOW,
                        MEDIUM,
                        HIGH,
                    }

                    enum class Value {
                        LOW,
                        MEDIUM,
                        HIGH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            LOW -> Value.LOW
                            MEDIUM -> Value.MEDIUM
                            HIGH -> Value.HIGH
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            LOW -> Known.LOW
                            MEDIUM -> Known.MEDIUM
                            HIGH -> Known.HIGH
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown RiskRating: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RiskRating && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChildLegalEntityCreate && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityType == other.legalEntityType && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityType, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ChildLegalEntityCreate{addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityType=$legalEntityType, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalEntityAssociationInlineCreateRequest && relationshipTypes == other.relationshipTypes && childLegalEntity == other.childLegalEntity && childLegalEntityId == other.childLegalEntityId && ownershipPercentage == other.ownershipPercentage && title == other.title && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(relationshipTypes, childLegalEntity, childLegalEntityId, ownershipPercentage, title, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LegalEntityAssociationInlineCreateRequest{relationshipTypes=$relationshipTypes, childLegalEntity=$childLegalEntity, childLegalEntityId=$childLegalEntityId, ownershipPercentage=$ownershipPercentage, title=$title, additionalProperties=$additionalProperties}"
        }

        class LegalStructure
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CORPORATION = of("corporation")

                @JvmField val LLC = of("llc")

                @JvmField val NON_PROFIT = of("non_profit")

                @JvmField val PARTNERSHIP = of("partnership")

                @JvmField val SOLE_PROPRIETORSHIP = of("sole_proprietorship")

                @JvmField val TRUST = of("trust")

                @JvmStatic fun of(value: String) = LegalStructure(JsonField.of(value))
            }

            enum class Known {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
            }

            enum class Value {
                CORPORATION,
                LLC,
                NON_PROFIT,
                PARTNERSHIP,
                SOLE_PROPRIETORSHIP,
                TRUST,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CORPORATION -> Value.CORPORATION
                    LLC -> Value.LLC
                    NON_PROFIT -> Value.NON_PROFIT
                    PARTNERSHIP -> Value.PARTNERSHIP
                    SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                    TRUST -> Value.TRUST
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CORPORATION -> Known.CORPORATION
                    LLC -> Known.LLC
                    NON_PROFIT -> Known.NON_PROFIT
                    PARTNERSHIP -> Known.PARTNERSHIP
                    SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                    TRUST -> Known.TRUST
                    else ->
                        throw ModernTreasuryInvalidDataException("Unknown LegalStructure: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LegalStructure && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
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

        /** A list of phone numbers in E.164 format. */
        @NoAutoDetect
        class PhoneNumber
        @JsonCreator
        private constructor(
            @JsonProperty("phone_number") private val phoneNumber: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("phone_number")
            fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var phoneNumber: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(phoneNumber: PhoneNumber) = apply {
                    this.phoneNumber = phoneNumber.phoneNumber
                    additionalProperties = phoneNumber.additionalProperties.toMutableMap()
                }

                fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

                fun phoneNumber(phoneNumber: Optional<String>) =
                    phoneNumber(phoneNumber.orElse(null))

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

                fun build(): PhoneNumber =
                    PhoneNumber(phoneNumber, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PhoneNumber && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PhoneNumber{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        class RiskRating
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LOW = of("low")

                @JvmField val MEDIUM = of("medium")

                @JvmField val HIGH = of("high")

                @JvmStatic fun of(value: String) = RiskRating(JsonField.of(value))
            }

            enum class Known {
                LOW,
                MEDIUM,
                HIGH,
            }

            enum class Value {
                LOW,
                MEDIUM,
                HIGH,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    LOW -> Value.LOW
                    MEDIUM -> Value.MEDIUM
                    HIGH -> Value.HIGH
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    LOW -> Known.LOW
                    MEDIUM -> Known.MEDIUM
                    HIGH -> Known.HIGH
                    else -> throw ModernTreasuryInvalidDataException("Unknown RiskRating: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RiskRating && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LegalEntityCreateRequest && legalEntityType == other.legalEntityType && addresses == other.addresses && bankSettings == other.bankSettings && businessName == other.businessName && citizenshipCountry == other.citizenshipCountry && dateFormed == other.dateFormed && dateOfBirth == other.dateOfBirth && doingBusinessAsNames == other.doingBusinessAsNames && email == other.email && firstName == other.firstName && identifications == other.identifications && lastName == other.lastName && legalEntityAssociations == other.legalEntityAssociations && legalStructure == other.legalStructure && metadata == other.metadata && middleName == other.middleName && phoneNumbers == other.phoneNumbers && politicallyExposedPerson == other.politicallyExposedPerson && preferredName == other.preferredName && prefix == other.prefix && riskRating == other.riskRating && suffix == other.suffix && wealthAndEmploymentDetails == other.wealthAndEmploymentDetails && website == other.website && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(legalEntityType, addresses, bankSettings, businessName, citizenshipCountry, dateFormed, dateOfBirth, doingBusinessAsNames, email, firstName, identifications, lastName, legalEntityAssociations, legalStructure, metadata, middleName, phoneNumbers, politicallyExposedPerson, preferredName, prefix, riskRating, suffix, wealthAndEmploymentDetails, website, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LegalEntityCreateRequest{legalEntityType=$legalEntityType, addresses=$addresses, bankSettings=$bankSettings, businessName=$businessName, citizenshipCountry=$citizenshipCountry, dateFormed=$dateFormed, dateOfBirth=$dateOfBirth, doingBusinessAsNames=$doingBusinessAsNames, email=$email, firstName=$firstName, identifications=$identifications, lastName=$lastName, legalEntityAssociations=$legalEntityAssociations, legalStructure=$legalStructure, metadata=$metadata, middleName=$middleName, phoneNumbers=$phoneNumbers, politicallyExposedPerson=$politicallyExposedPerson, preferredName=$preferredName, prefix=$prefix, riskRating=$riskRating, suffix=$suffix, wealthAndEmploymentDetails=$wealthAndEmploymentDetails, website=$website, additionalProperties=$additionalProperties}"
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

    class VerificationStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DENIED = of("denied")

            @JvmField val NEEDS_APPROVAL = of("needs_approval")

            @JvmField val UNVERIFIED = of("unverified")

            @JvmField val VERIFIED = of("verified")

            @JvmStatic fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        enum class Known {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
        }

        enum class Value {
            DENIED,
            NEEDS_APPROVAL,
            UNVERIFIED,
            VERIFIED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DENIED -> Value.DENIED
                NEEDS_APPROVAL -> Value.NEEDS_APPROVAL
                UNVERIFIED -> Value.UNVERIFIED
                VERIFIED -> Value.VERIFIED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DENIED -> Known.DENIED
                NEEDS_APPROVAL -> Known.NEEDS_APPROVAL
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

        return /* spotless:off */ other is CounterpartyCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterpartyCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
