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
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = ExternalAccountVerifyResponse.Deserializer::class)
@JsonSerialize(using = ExternalAccountVerifyResponse.Serializer::class)
class ExternalAccountVerifyResponse
private constructor(
    private val externalAccount: ExternalAccount? = null,
    private val externalAccountVerificationAttempt: ExternalAccountVerificationAttempt? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun externalAccount(): Optional<ExternalAccount> = Optional.ofNullable(externalAccount)

    fun externalAccountVerificationAttempt(): Optional<ExternalAccountVerificationAttempt> =
        Optional.ofNullable(externalAccountVerificationAttempt)

    fun isExternalAccount(): Boolean = externalAccount != null

    fun isExternalAccountVerificationAttempt(): Boolean = externalAccountVerificationAttempt != null

    fun asExternalAccount(): ExternalAccount = externalAccount.getOrThrow("externalAccount")

    fun asExternalAccountVerificationAttempt(): ExternalAccountVerificationAttempt =
        externalAccountVerificationAttempt.getOrThrow("externalAccountVerificationAttempt")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            externalAccount != null -> visitor.visitExternalAccount(externalAccount)
            externalAccountVerificationAttempt != null ->
                visitor.visitExternalAccountVerificationAttempt(externalAccountVerificationAttempt)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): ExternalAccountVerifyResponse = apply {
        if (!validated) {
            if (externalAccount == null && externalAccountVerificationAttempt == null) {
                throw ModernTreasuryInvalidDataException(
                    "Unknown ExternalAccountVerifyResponse: $_json"
                )
            }
            externalAccount?.validate()
            externalAccountVerificationAttempt?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountVerifyResponse && externalAccount == other.externalAccount && externalAccountVerificationAttempt == other.externalAccountVerificationAttempt /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccount, externalAccountVerificationAttempt) /* spotless:on */

    override fun toString(): String =
        when {
            externalAccount != null ->
                "ExternalAccountVerifyResponse{externalAccount=$externalAccount}"
            externalAccountVerificationAttempt != null ->
                "ExternalAccountVerifyResponse{externalAccountVerificationAttempt=$externalAccountVerificationAttempt}"
            _json != null -> "ExternalAccountVerifyResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ExternalAccountVerifyResponse")
        }

    companion object {

        @JvmStatic
        fun ofExternalAccount(externalAccount: ExternalAccount) =
            ExternalAccountVerifyResponse(externalAccount = externalAccount)

        @JvmStatic
        fun ofExternalAccountVerificationAttempt(
            externalAccountVerificationAttempt: ExternalAccountVerificationAttempt
        ) =
            ExternalAccountVerifyResponse(
                externalAccountVerificationAttempt = externalAccountVerificationAttempt
            )
    }

    interface Visitor<out T> {

        fun visitExternalAccount(externalAccount: ExternalAccount): T

        fun visitExternalAccountVerificationAttempt(
            externalAccountVerificationAttempt: ExternalAccountVerificationAttempt
        ): T

        fun unknown(json: JsonValue?): T {
            throw ModernTreasuryInvalidDataException("Unknown ExternalAccountVerifyResponse: $json")
        }
    }

    class Deserializer :
        BaseDeserializer<ExternalAccountVerifyResponse>(ExternalAccountVerifyResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ExternalAccountVerifyResponse {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<ExternalAccount>()) { it.validate() }
                ?.let {
                    return ExternalAccountVerifyResponse(externalAccount = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<ExternalAccountVerificationAttempt>()) {
                    it.validate()
                }
                ?.let {
                    return ExternalAccountVerifyResponse(
                        externalAccountVerificationAttempt = it,
                        _json = json
                    )
                }

            return ExternalAccountVerifyResponse(_json = json)
        }
    }

    class Serializer :
        BaseSerializer<ExternalAccountVerifyResponse>(ExternalAccountVerifyResponse::class) {

        override fun serialize(
            value: ExternalAccountVerifyResponse,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.externalAccount != null -> generator.writeObject(value.externalAccount)
                value.externalAccountVerificationAttempt != null ->
                    generator.writeObject(value.externalAccountVerificationAttempt)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountVerifyResponse")
            }
        }
    }

    @JsonDeserialize(builder = ExternalAccountVerificationAttempt.Builder::class)
    @NoAutoDetect
    class ExternalAccountVerificationAttempt
    private constructor(
        private val id: JsonField<String>,
        private val object_: JsonField<String>,
        private val liveMode: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val externalAccountId: JsonField<String>,
        private val originatingAccountId: JsonField<String>,
        private val paymentType: JsonField<PaymentType>,
        private val priority: JsonField<Priority>,
        private val status: JsonField<Status>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun id(): String = id.getRequired("id")

        fun object_(): String = object_.getRequired("object")

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(): Boolean = liveMode.getRequired("live_mode")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /** The ID of the external account. */
        fun externalAccountId(): String = externalAccountId.getRequired("external_account_id")

        /** The ID of the internal account where the micro-deposits originate from. */
        fun originatingAccountId(): String =
            originatingAccountId.getRequired("originating_account_id")

        /** The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`. */
        fun paymentType(): PaymentType = paymentType.getRequired("payment_type")

        /** The priority of the payment. Can be `normal` or `high`. */
        fun priority(): Optional<Priority> = Optional.ofNullable(priority.getNullable("priority"))

        /**
         * The status of the verification attempt. Can be `pending_verification`, `verified`,
         * `failed`, or `cancelled`.
         */
        fun status(): Status = status.getRequired("status")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("object") @ExcludeMissing fun _object_() = object_

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

        /** The ID of the external account. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId() = externalAccountId

        /** The ID of the internal account where the micro-deposits originate from. */
        @JsonProperty("originating_account_id")
        @ExcludeMissing
        fun _originatingAccountId() = originatingAccountId

        /** The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`. */
        @JsonProperty("payment_type") @ExcludeMissing fun _paymentType() = paymentType

        /** The priority of the payment. Can be `normal` or `high`. */
        @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

        /**
         * The status of the verification attempt. Can be `pending_verification`, `verified`,
         * `failed`, or `cancelled`.
         */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalAccountVerificationAttempt = apply {
            if (!validated) {
                id()
                object_()
                liveMode()
                createdAt()
                updatedAt()
                externalAccountId()
                originatingAccountId()
                paymentType()
                priority()
                status()
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
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var originatingAccountId: JsonField<String> = JsonMissing.of()
            private var paymentType: JsonField<PaymentType> = JsonMissing.of()
            private var priority: JsonField<Priority> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                externalAccountVerificationAttempt: ExternalAccountVerificationAttempt
            ) = apply {
                id = externalAccountVerificationAttempt.id
                object_ = externalAccountVerificationAttempt.object_
                liveMode = externalAccountVerificationAttempt.liveMode
                createdAt = externalAccountVerificationAttempt.createdAt
                updatedAt = externalAccountVerificationAttempt.updatedAt
                externalAccountId = externalAccountVerificationAttempt.externalAccountId
                originatingAccountId = externalAccountVerificationAttempt.originatingAccountId
                paymentType = externalAccountVerificationAttempt.paymentType
                priority = externalAccountVerificationAttempt.priority
                status = externalAccountVerificationAttempt.status
                additionalProperties =
                    externalAccountVerificationAttempt.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            @JsonProperty("updated_at")
            @ExcludeMissing
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** The ID of the external account. */
            fun externalAccountId(externalAccountId: String) =
                externalAccountId(JsonField.of(externalAccountId))

            /** The ID of the external account. */
            @JsonProperty("external_account_id")
            @ExcludeMissing
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
            }

            /** The ID of the internal account where the micro-deposits originate from. */
            fun originatingAccountId(originatingAccountId: String) =
                originatingAccountId(JsonField.of(originatingAccountId))

            /** The ID of the internal account where the micro-deposits originate from. */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                this.originatingAccountId = originatingAccountId
            }

            /**
             * The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`.
             */
            fun paymentType(paymentType: PaymentType) = paymentType(JsonField.of(paymentType))

            /**
             * The type of payment that can be made to this account. Can be `ach`, `eft`, or `rtp`.
             */
            @JsonProperty("payment_type")
            @ExcludeMissing
            fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                this.paymentType = paymentType
            }

            /** The priority of the payment. Can be `normal` or `high`. */
            fun priority(priority: Priority) = priority(JsonField.of(priority))

            /** The priority of the payment. Can be `normal` or `high`. */
            @JsonProperty("priority")
            @ExcludeMissing
            fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

            /**
             * The status of the verification attempt. Can be `pending_verification`, `verified`,
             * `failed`, or `cancelled`.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * The status of the verification attempt. Can be `pending_verification`, `verified`,
             * `failed`, or `cancelled`.
             */
            @JsonProperty("status")
            @ExcludeMissing
            fun status(status: JsonField<Status>) = apply { this.status = status }

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

            fun build(): ExternalAccountVerificationAttempt =
                ExternalAccountVerificationAttempt(
                    id,
                    object_,
                    liveMode,
                    createdAt,
                    updatedAt,
                    externalAccountId,
                    originatingAccountId,
                    paymentType,
                    priority,
                    status,
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

        class Priority
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val HIGH = of("high")

                @JvmField val NORMAL = of("normal")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
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

                @JvmField val FAILED = of("failed")

                @JvmField val PENDING_VERIFICATION = of("pending_verification")

                @JvmField val VERIFIED = of("verified")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            enum class Known {
                CANCELLED,
                FAILED,
                PENDING_VERIFICATION,
                VERIFIED,
            }

            enum class Value {
                CANCELLED,
                FAILED,
                PENDING_VERIFICATION,
                VERIFIED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CANCELLED -> Value.CANCELLED
                    FAILED -> Value.FAILED
                    PENDING_VERIFICATION -> Value.PENDING_VERIFICATION
                    VERIFIED -> Value.VERIFIED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CANCELLED -> Known.CANCELLED
                    FAILED -> Known.FAILED
                    PENDING_VERIFICATION -> Known.PENDING_VERIFICATION
                    VERIFIED -> Known.VERIFIED
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

            return /* spotless:off */ other is ExternalAccountVerificationAttempt && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && externalAccountId == other.externalAccountId && originatingAccountId == other.originatingAccountId && paymentType == other.paymentType && priority == other.priority && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, externalAccountId, originatingAccountId, paymentType, priority, status, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountVerificationAttempt{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, externalAccountId=$externalAccountId, originatingAccountId=$originatingAccountId, paymentType=$paymentType, priority=$priority, status=$status, additionalProperties=$additionalProperties}"
    }
}
