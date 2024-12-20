// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AccountCollectionFlow.Builder::class)
@NoAutoDetect
class AccountCollectionFlow
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val clientToken: JsonField<String>,
    private val status: JsonField<Status>,
    private val counterpartyId: JsonField<String>,
    private val externalAccountId: JsonField<String>,
    private val paymentTypes: JsonField<List<PaymentType>>,
    private val receivingCountries: JsonField<List<ReceivingCountry>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    fun object_(): Optional<String> = Optional.ofNullable(object_.getNullable("object"))

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Optional<Boolean> = Optional.ofNullable(liveMode.getNullable("live_mode"))

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun updatedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(updatedAt.getNullable("updated_at"))

    /**
     * The client token of the account collection flow. This token can be used to embed account
     * collection in your client-side application.
     */
    fun clientToken(): Optional<String> =
        Optional.ofNullable(clientToken.getNullable("client_token"))

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /**
     * The ID of a counterparty. An external account created with this flow will be associated with
     * this counterparty.
     */
    fun counterpartyId(): String = counterpartyId.getRequired("counterparty_id")

    /** If present, the ID of the external account created using this flow. */
    fun externalAccountId(): Optional<String> =
        Optional.ofNullable(externalAccountId.getNullable("external_account_id"))

    fun paymentTypes(): List<PaymentType> = paymentTypes.getRequired("payment_types")

    fun receivingCountries(): Optional<List<ReceivingCountry>> =
        Optional.ofNullable(receivingCountries.getNullable("receiving_countries"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /**
     * The client token of the account collection flow. This token can be used to embed account
     * collection in your client-side application.
     */
    @JsonProperty("client_token") @ExcludeMissing fun _clientToken() = clientToken

    /**
     * The current status of the account collection flow. One of `pending`, `completed`, `expired`,
     * or `cancelled`.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The ID of a counterparty. An external account created with this flow will be associated with
     * this counterparty.
     */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** If present, the ID of the external account created using this flow. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    @JsonProperty("payment_types") @ExcludeMissing fun _paymentTypes() = paymentTypes

    @JsonProperty("receiving_countries")
    @ExcludeMissing
    fun _receivingCountries() = receivingCountries

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AccountCollectionFlow = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            clientToken()
            status()
            counterpartyId()
            externalAccountId()
            paymentTypes()
            receivingCountries()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var clientToken: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var paymentTypes: JsonField<List<PaymentType>> = JsonMissing.of()
        private var receivingCountries: JsonField<List<ReceivingCountry>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountCollectionFlow: AccountCollectionFlow) = apply {
            id = accountCollectionFlow.id
            object_ = accountCollectionFlow.object_
            liveMode = accountCollectionFlow.liveMode
            createdAt = accountCollectionFlow.createdAt
            updatedAt = accountCollectionFlow.updatedAt
            clientToken = accountCollectionFlow.clientToken
            status = accountCollectionFlow.status
            counterpartyId = accountCollectionFlow.counterpartyId
            externalAccountId = accountCollectionFlow.externalAccountId
            paymentTypes = accountCollectionFlow.paymentTypes
            receivingCountries = accountCollectionFlow.receivingCountries
            additionalProperties = accountCollectionFlow.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        @JsonProperty("object")
        @ExcludeMissing
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode")
        @ExcludeMissing
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        @JsonProperty("updated_at")
        @ExcludeMissing
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * The client token of the account collection flow. This token can be used to embed account
         * collection in your client-side application.
         */
        fun clientToken(clientToken: String) = clientToken(JsonField.of(clientToken))

        /**
         * The client token of the account collection flow. This token can be used to embed account
         * collection in your client-side application.
         */
        @JsonProperty("client_token")
        @ExcludeMissing
        fun clientToken(clientToken: JsonField<String>) = apply { this.clientToken = clientToken }

        /**
         * The current status of the account collection flow. One of `pending`, `completed`,
         * `expired`, or `cancelled`.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * The current status of the account collection flow. One of `pending`, `completed`,
         * `expired`, or `cancelled`.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The ID of a counterparty. An external account created with this flow will be associated
         * with this counterparty.
         */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /**
         * The ID of a counterparty. An external account created with this flow will be associated
         * with this counterparty.
         */
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** If present, the ID of the external account created using this flow. */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /** If present, the ID of the external account created using this flow. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        fun paymentTypes(paymentTypes: List<PaymentType>) = paymentTypes(JsonField.of(paymentTypes))

        @JsonProperty("payment_types")
        @ExcludeMissing
        fun paymentTypes(paymentTypes: JsonField<List<PaymentType>>) = apply {
            this.paymentTypes = paymentTypes
        }

        fun receivingCountries(receivingCountries: List<ReceivingCountry>) =
            receivingCountries(JsonField.of(receivingCountries))

        @JsonProperty("receiving_countries")
        @ExcludeMissing
        fun receivingCountries(receivingCountries: JsonField<List<ReceivingCountry>>) = apply {
            this.receivingCountries = receivingCountries
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): AccountCollectionFlow =
            AccountCollectionFlow(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                clientToken,
                status,
                counterpartyId,
                externalAccountId,
                paymentTypes.map { it.toImmutable() },
                receivingCountries.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    class PaymentType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH = of("ach")

            @JvmField val WIRE = of("wire")

            @JvmStatic fun of(value: String) = PaymentType(JsonField.of(value))
        }

        enum class Known {
            ACH,
            WIRE,
        }

        enum class Value {
            ACH,
            WIRE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                WIRE -> Value.WIRE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                WIRE -> Known.WIRE
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

    class ReceivingCountry
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val USA = of("USA")

            @JvmField val AUS = of("AUS")

            @JvmField val BEL = of("BEL")

            @JvmField val CAN = of("CAN")

            @JvmField val CHL = of("CHL")

            @JvmField val CHN = of("CHN")

            @JvmField val COL = of("COL")

            @JvmField val FRA = of("FRA")

            @JvmField val DEU = of("DEU")

            @JvmField val HKG = of("HKG")

            @JvmField val IND = of("IND")

            @JvmField val IRL = of("IRL")

            @JvmField val ITA = of("ITA")

            @JvmField val MEX = of("MEX")

            @JvmField val NLD = of("NLD")

            @JvmField val PER = of("PER")

            @JvmField val ESP = of("ESP")

            @JvmField val GBR = of("GBR")

            @JvmStatic fun of(value: String) = ReceivingCountry(JsonField.of(value))
        }

        enum class Known {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
        }

        enum class Value {
            USA,
            AUS,
            BEL,
            CAN,
            CHL,
            CHN,
            COL,
            FRA,
            DEU,
            HKG,
            IND,
            IRL,
            ITA,
            MEX,
            NLD,
            PER,
            ESP,
            GBR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                USA -> Value.USA
                AUS -> Value.AUS
                BEL -> Value.BEL
                CAN -> Value.CAN
                CHL -> Value.CHL
                CHN -> Value.CHN
                COL -> Value.COL
                FRA -> Value.FRA
                DEU -> Value.DEU
                HKG -> Value.HKG
                IND -> Value.IND
                IRL -> Value.IRL
                ITA -> Value.ITA
                MEX -> Value.MEX
                NLD -> Value.NLD
                PER -> Value.PER
                ESP -> Value.ESP
                GBR -> Value.GBR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                USA -> Known.USA
                AUS -> Known.AUS
                BEL -> Known.BEL
                CAN -> Known.CAN
                CHL -> Known.CHL
                CHN -> Known.CHN
                COL -> Known.COL
                FRA -> Known.FRA
                DEU -> Known.DEU
                HKG -> Known.HKG
                IND -> Known.IND
                IRL -> Known.IRL
                ITA -> Known.ITA
                MEX -> Known.MEX
                NLD -> Known.NLD
                PER -> Known.PER
                ESP -> Known.ESP
                GBR -> Known.GBR
                else -> throw ModernTreasuryInvalidDataException("Unknown ReceivingCountry: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReceivingCountry && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val COMPLETED = of("completed")

            @JvmField val EXPIRED = of("expired")

            @JvmField val PENDING = of("pending")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
        }

        enum class Value {
            CANCELLED,
            COMPLETED,
            EXPIRED,
            PENDING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CANCELLED -> Value.CANCELLED
                COMPLETED -> Value.COMPLETED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CANCELLED -> Known.CANCELLED
                COMPLETED -> Known.COMPLETED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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

        return /* spotless:off */ other is AccountCollectionFlow && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && clientToken == other.clientToken && status == other.status && counterpartyId == other.counterpartyId && externalAccountId == other.externalAccountId && paymentTypes == other.paymentTypes && receivingCountries == other.receivingCountries && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, clientToken, status, counterpartyId, externalAccountId, paymentTypes, receivingCountries, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountCollectionFlow{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, clientToken=$clientToken, status=$status, counterpartyId=$counterpartyId, externalAccountId=$externalAccountId, paymentTypes=$paymentTypes, receivingCountries=$receivingCountries, additionalProperties=$additionalProperties}"
}
