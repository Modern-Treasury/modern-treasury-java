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
import java.util.Objects
import java.util.Optional

class VirtualAccountCreateParams
constructor(
    private val body: VirtualAccountCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The ID of the internal account that this virtual account is associated with. */
    fun internalAccountId(): String = body.internalAccountId()

    /** The name of the virtual account. */
    fun name(): String = body.name()

    /** An array of account detail objects. */
    fun accountDetails(): Optional<List<AccountDetailCreateRequest>> = body.accountDetails()

    /** The ID of the counterparty that the virtual account belongs to. */
    fun counterpartyId(): Optional<String> = body.counterpartyId()

    /**
     * The ID of a credit normal ledger account. When money leaves the virtual account, this ledger
     * account will be credited. Must be accompanied by a debit_ledger_account_id if present.
     */
    fun creditLedgerAccountId(): Optional<String> = body.creditLedgerAccountId()

    /**
     * The ID of a debit normal ledger account. When money enters the virtual account, this ledger
     * account will be debited. Must be accompanied by a credit_ledger_account_id if present.
     */
    fun debitLedgerAccountId(): Optional<String> = body.debitLedgerAccountId()

    /** An optional description for internal use. */
    fun description(): Optional<String> = body.description()

    /**
     * Specifies a ledger account object that will be created with the virtual account. The
     * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
     */
    fun ledgerAccount(): Optional<LedgerAccountCreateRequest> = body.ledgerAccount()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** An array of routing detail objects. */
    fun routingDetails(): Optional<List<RoutingDetailCreateRequest>> = body.routingDetails()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): VirtualAccountCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class VirtualAccountCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("internal_account_id") private val internalAccountId: String,
        @JsonProperty("name") private val name: String,
        @JsonProperty("account_details")
        private val accountDetails: List<AccountDetailCreateRequest>?,
        @JsonProperty("counterparty_id") private val counterpartyId: String?,
        @JsonProperty("credit_ledger_account_id") private val creditLedgerAccountId: String?,
        @JsonProperty("debit_ledger_account_id") private val debitLedgerAccountId: String?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("ledger_account") private val ledgerAccount: LedgerAccountCreateRequest?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("routing_details")
        private val routingDetails: List<RoutingDetailCreateRequest>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The ID of the internal account that this virtual account is associated with. */
        @JsonProperty("internal_account_id") fun internalAccountId(): String = internalAccountId

        /** The name of the virtual account. */
        @JsonProperty("name") fun name(): String = name

        /** An array of account detail objects. */
        @JsonProperty("account_details")
        fun accountDetails(): Optional<List<AccountDetailCreateRequest>> =
            Optional.ofNullable(accountDetails)

        /** The ID of the counterparty that the virtual account belongs to. */
        @JsonProperty("counterparty_id")
        fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        @JsonProperty("credit_ledger_account_id")
        fun creditLedgerAccountId(): Optional<String> = Optional.ofNullable(creditLedgerAccountId)

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        @JsonProperty("debit_ledger_account_id")
        fun debitLedgerAccountId(): Optional<String> = Optional.ofNullable(debitLedgerAccountId)

        /** An optional description for internal use. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /**
         * Specifies a ledger account object that will be created with the virtual account. The
         * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
         */
        @JsonProperty("ledger_account")
        fun ledgerAccount(): Optional<LedgerAccountCreateRequest> =
            Optional.ofNullable(ledgerAccount)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /** An array of routing detail objects. */
        @JsonProperty("routing_details")
        fun routingDetails(): Optional<List<RoutingDetailCreateRequest>> =
            Optional.ofNullable(routingDetails)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var internalAccountId: String? = null
            private var name: String? = null
            private var accountDetails: MutableList<AccountDetailCreateRequest>? = null
            private var counterpartyId: String? = null
            private var creditLedgerAccountId: String? = null
            private var debitLedgerAccountId: String? = null
            private var description: String? = null
            private var ledgerAccount: LedgerAccountCreateRequest? = null
            private var metadata: Metadata? = null
            private var routingDetails: MutableList<RoutingDetailCreateRequest>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(virtualAccountCreateBody: VirtualAccountCreateBody) = apply {
                internalAccountId = virtualAccountCreateBody.internalAccountId
                name = virtualAccountCreateBody.name
                accountDetails = virtualAccountCreateBody.accountDetails?.toMutableList()
                counterpartyId = virtualAccountCreateBody.counterpartyId
                creditLedgerAccountId = virtualAccountCreateBody.creditLedgerAccountId
                debitLedgerAccountId = virtualAccountCreateBody.debitLedgerAccountId
                description = virtualAccountCreateBody.description
                ledgerAccount = virtualAccountCreateBody.ledgerAccount
                metadata = virtualAccountCreateBody.metadata
                routingDetails = virtualAccountCreateBody.routingDetails?.toMutableList()
                additionalProperties = virtualAccountCreateBody.additionalProperties.toMutableMap()
            }

            /** The ID of the internal account that this virtual account is associated with. */
            fun internalAccountId(internalAccountId: String) = apply {
                this.internalAccountId = internalAccountId
            }

            /** The name of the virtual account. */
            fun name(name: String) = apply { this.name = name }

            /** An array of account detail objects. */
            fun accountDetails(accountDetails: List<AccountDetailCreateRequest>?) = apply {
                this.accountDetails = accountDetails?.toMutableList()
            }

            /** An array of account detail objects. */
            fun accountDetails(accountDetails: Optional<List<AccountDetailCreateRequest>>) =
                accountDetails(accountDetails.orElse(null))

            /** An array of account detail objects. */
            fun addAccountDetail(accountDetail: AccountDetailCreateRequest) = apply {
                accountDetails = (accountDetails ?: mutableListOf()).apply { add(accountDetail) }
            }

            /** The ID of the counterparty that the virtual account belongs to. */
            fun counterpartyId(counterpartyId: String?) = apply {
                this.counterpartyId = counterpartyId
            }

            /** The ID of the counterparty that the virtual account belongs to. */
            fun counterpartyId(counterpartyId: Optional<String>) =
                counterpartyId(counterpartyId.orElse(null))

            /**
             * The ID of a credit normal ledger account. When money leaves the virtual account, this
             * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
             * present.
             */
            fun creditLedgerAccountId(creditLedgerAccountId: String?) = apply {
                this.creditLedgerAccountId = creditLedgerAccountId
            }

            /**
             * The ID of a credit normal ledger account. When money leaves the virtual account, this
             * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
             * present.
             */
            fun creditLedgerAccountId(creditLedgerAccountId: Optional<String>) =
                creditLedgerAccountId(creditLedgerAccountId.orElse(null))

            /**
             * The ID of a debit normal ledger account. When money enters the virtual account, this
             * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
             * present.
             */
            fun debitLedgerAccountId(debitLedgerAccountId: String?) = apply {
                this.debitLedgerAccountId = debitLedgerAccountId
            }

            /**
             * The ID of a debit normal ledger account. When money enters the virtual account, this
             * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
             * present.
             */
            fun debitLedgerAccountId(debitLedgerAccountId: Optional<String>) =
                debitLedgerAccountId(debitLedgerAccountId.orElse(null))

            /** An optional description for internal use. */
            fun description(description: String?) = apply { this.description = description }

            /** An optional description for internal use. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Specifies a ledger account object that will be created with the virtual account. The
             * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
             */
            fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest?) = apply {
                this.ledgerAccount = ledgerAccount
            }

            /**
             * Specifies a ledger account object that will be created with the virtual account. The
             * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
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

            /** An array of routing detail objects. */
            fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>?) = apply {
                this.routingDetails = routingDetails?.toMutableList()
            }

            /** An array of routing detail objects. */
            fun routingDetails(routingDetails: Optional<List<RoutingDetailCreateRequest>>) =
                routingDetails(routingDetails.orElse(null))

            /** An array of routing detail objects. */
            fun addRoutingDetail(routingDetail: RoutingDetailCreateRequest) = apply {
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

            fun build(): VirtualAccountCreateBody =
                VirtualAccountCreateBody(
                    checkNotNull(internalAccountId) {
                        "`internalAccountId` is required but was not set"
                    },
                    checkNotNull(name) { "`name` is required but was not set" },
                    accountDetails?.toImmutable(),
                    counterpartyId,
                    creditLedgerAccountId,
                    debitLedgerAccountId,
                    description,
                    ledgerAccount,
                    metadata,
                    routingDetails?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VirtualAccountCreateBody && internalAccountId == other.internalAccountId && name == other.name && accountDetails == other.accountDetails && counterpartyId == other.counterpartyId && creditLedgerAccountId == other.creditLedgerAccountId && debitLedgerAccountId == other.debitLedgerAccountId && description == other.description && ledgerAccount == other.ledgerAccount && metadata == other.metadata && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(internalAccountId, name, accountDetails, counterpartyId, creditLedgerAccountId, debitLedgerAccountId, description, ledgerAccount, metadata, routingDetails, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VirtualAccountCreateBody{internalAccountId=$internalAccountId, name=$name, accountDetails=$accountDetails, counterpartyId=$counterpartyId, creditLedgerAccountId=$creditLedgerAccountId, debitLedgerAccountId=$debitLedgerAccountId, description=$description, ledgerAccount=$ledgerAccount, metadata=$metadata, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: VirtualAccountCreateBody.Builder = VirtualAccountCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(virtualAccountCreateParams: VirtualAccountCreateParams) = apply {
            body = virtualAccountCreateParams.body.toBuilder()
            additionalHeaders = virtualAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = virtualAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /** The ID of the internal account that this virtual account is associated with. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /** The name of the virtual account. */
        fun name(name: String) = apply { body.name(name) }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: List<AccountDetailCreateRequest>?) = apply {
            body.accountDetails(accountDetails)
        }

        /** An array of account detail objects. */
        fun accountDetails(accountDetails: Optional<List<AccountDetailCreateRequest>>) =
            accountDetails(accountDetails.orElse(null))

        /** An array of account detail objects. */
        fun addAccountDetail(accountDetail: AccountDetailCreateRequest) = apply {
            body.addAccountDetail(accountDetail)
        }

        /** The ID of the counterparty that the virtual account belongs to. */
        fun counterpartyId(counterpartyId: String?) = apply { body.counterpartyId(counterpartyId) }

        /** The ID of the counterparty that the virtual account belongs to. */
        fun counterpartyId(counterpartyId: Optional<String>) =
            counterpartyId(counterpartyId.orElse(null))

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: String?) = apply {
            body.creditLedgerAccountId(creditLedgerAccountId)
        }

        /**
         * The ID of a credit normal ledger account. When money leaves the virtual account, this
         * ledger account will be credited. Must be accompanied by a debit_ledger_account_id if
         * present.
         */
        fun creditLedgerAccountId(creditLedgerAccountId: Optional<String>) =
            creditLedgerAccountId(creditLedgerAccountId.orElse(null))

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: String?) = apply {
            body.debitLedgerAccountId(debitLedgerAccountId)
        }

        /**
         * The ID of a debit normal ledger account. When money enters the virtual account, this
         * ledger account will be debited. Must be accompanied by a credit_ledger_account_id if
         * present.
         */
        fun debitLedgerAccountId(debitLedgerAccountId: Optional<String>) =
            debitLedgerAccountId(debitLedgerAccountId.orElse(null))

        /** An optional description for internal use. */
        fun description(description: String?) = apply { body.description(description) }

        /** An optional description for internal use. */
        fun description(description: Optional<String>) = description(description.orElse(null))

        /**
         * Specifies a ledger account object that will be created with the virtual account. The
         * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
         */
        fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest?) = apply {
            body.ledgerAccount(ledgerAccount)
        }

        /**
         * Specifies a ledger account object that will be created with the virtual account. The
         * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
         */
        fun ledgerAccount(ledgerAccount: Optional<LedgerAccountCreateRequest>) =
            ledgerAccount(ledgerAccount.orElse(null))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: List<RoutingDetailCreateRequest>?) = apply {
            body.routingDetails(routingDetails)
        }

        /** An array of routing detail objects. */
        fun routingDetails(routingDetails: Optional<List<RoutingDetailCreateRequest>>) =
            routingDetails(routingDetails.orElse(null))

        /** An array of routing detail objects. */
        fun addRoutingDetail(routingDetail: RoutingDetailCreateRequest) = apply {
            body.addRoutingDetail(routingDetail)
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

        fun build(): VirtualAccountCreateParams =
            VirtualAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AccountDetailCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("account_number") private val accountNumber: String,
        @JsonProperty("account_number_type") private val accountNumberType: AccountNumberType?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The account number for the bank account. */
        @JsonProperty("account_number") fun accountNumber(): String = accountNumber

        /**
         * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
         * number is in a generic format.
         */
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
            internal fun from(accountDetailCreateRequest: AccountDetailCreateRequest) = apply {
                accountNumber = accountDetailCreateRequest.accountNumber
                accountNumberType = accountDetailCreateRequest.accountNumberType
                additionalProperties =
                    accountDetailCreateRequest.additionalProperties.toMutableMap()
            }

            /** The account number for the bank account. */
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
             * number is in a generic format.
             */
            fun accountNumberType(accountNumberType: AccountNumberType?) = apply {
                this.accountNumberType = accountNumberType
            }

            /**
             * One of `iban`, `clabe`, `wallet_address`, or `other`. Use `other` if the bank account
             * number is in a generic format.
             */
            fun accountNumberType(accountNumberType: Optional<AccountNumberType>) =
                accountNumberType(accountNumberType.orElse(null))

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

            fun build(): AccountDetailCreateRequest =
                AccountDetailCreateRequest(
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
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

            return /* spotless:off */ other is AccountDetailCreateRequest && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountDetailCreateRequest{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
    }

    /**
     * Specifies a ledger account object that will be created with the virtual account. The
     * resulting ledger account is linked to the virtual account for auto-ledgering IPDs.
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
        @JsonProperty("normal_balance") fun normalBalance(): TransactionDirection = normalBalance

        /** The currency exponent of the ledger account. */
        @JsonProperty("currency_exponent")
        fun currencyExponent(): Optional<Long> = Optional.ofNullable(currencyExponent)

        /** The description of the ledger account. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /**
         * The array of ledger account category ids that this ledger account should be a child of.
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
         * populated here, otherwise null. The value is one of internal_account or external_account.
         */
        @JsonProperty("ledgerable_type")
        fun ledgerableType(): Optional<LedgerableType> = Optional.ofNullable(ledgerableType)

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

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
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>?) = apply {
                this.ledgerAccountCategoryIds = ledgerAccountCategoryIds?.toMutableList()
            }

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
             */
            fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: Optional<List<String>>) =
                ledgerAccountCategoryIds(ledgerAccountCategoryIds.orElse(null))

            /**
             * The array of ledger account category ids that this ledger account should be a child
             * of.
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
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
             * external_account.
             */
            fun ledgerableType(ledgerableType: LedgerableType?) = apply {
                this.ledgerableType = ledgerableType
            }

            /**
             * If the ledger account links to another object in Modern Treasury, the type will be
             * populated here, otherwise null. The value is one of internal_account or
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): LedgerAccountCreateRequest =
                LedgerAccountCreateRequest(
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(normalBalance) { "`normalBalance` is required but was not set" },
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
                        throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
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

    @NoAutoDetect
    class RoutingDetailCreateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("routing_number") private val routingNumber: String,
        @JsonProperty("routing_number_type") private val routingNumberType: RoutingNumberType,
        @JsonProperty("payment_type") private val paymentType: PaymentType?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The routing number of the bank. */
        @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

        /**
         * The type of routing number. See
         * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
         * details.
         */
        @JsonProperty("routing_number_type")
        fun routingNumberType(): RoutingNumberType = routingNumberType

        /**
         * If the routing detail is to be used for a specific payment type this field will be
         * populated, otherwise null.
         */
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
            internal fun from(routingDetailCreateRequest: RoutingDetailCreateRequest) = apply {
                routingNumber = routingDetailCreateRequest.routingNumber
                routingNumberType = routingDetailCreateRequest.routingNumberType
                paymentType = routingDetailCreateRequest.paymentType
                additionalProperties =
                    routingDetailCreateRequest.additionalProperties.toMutableMap()
            }

            /** The routing number of the bank. */
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /**
             * The type of routing number. See
             * https://docs.moderntreasury.com/platform/reference/routing-detail-object for more
             * details.
             */
            fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                this.routingNumberType = routingNumberType
            }

            /**
             * If the routing detail is to be used for a specific payment type this field will be
             * populated, otherwise null.
             */
            fun paymentType(paymentType: PaymentType?) = apply { this.paymentType = paymentType }

            /**
             * If the routing detail is to be used for a specific payment type this field will be
             * populated, otherwise null.
             */
            fun paymentType(paymentType: Optional<PaymentType>) =
                paymentType(paymentType.orElse(null))

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

            fun build(): RoutingDetailCreateRequest =
                RoutingDetailCreateRequest(
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
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

                @JvmField val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                @JvmField val MY_BRANCH_CODE = of("my_branch_code")

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
                MX_BANK_IDENTIFIER,
                MY_BRANCH_CODE,
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
                MX_BANK_IDENTIFIER,
                MY_BRANCH_CODE,
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
                    MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                    MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
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
                    MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                    MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
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
                    else -> throw ModernTreasuryInvalidDataException("Unknown PaymentType: $value")
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

            return /* spotless:off */ other is RoutingDetailCreateRequest && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RoutingDetailCreateRequest{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccountCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VirtualAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
