// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class PaymentOrderListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val createdAtEnd: LocalDate?,
    private val createdAtStart: LocalDate?,
    private val direction: TransactionDirection?,
    private val effectiveDateEnd: LocalDate?,
    private val effectiveDateStart: LocalDate?,
    private val metadata: Metadata?,
    private val originatingAccountId: String?,
    private val perPage: Long?,
    private val priority: Priority?,
    private val referenceNumber: String?,
    private val status: Status?,
    private val transactionId: String?,
    private val type: Type?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    fun createdAtEnd(): Optional<LocalDate> = Optional.ofNullable(createdAtEnd)

    fun createdAtStart(): Optional<LocalDate> = Optional.ofNullable(createdAtStart)

    fun direction(): Optional<TransactionDirection> = Optional.ofNullable(direction)

    fun effectiveDateEnd(): Optional<LocalDate> = Optional.ofNullable(effectiveDateEnd)

    fun effectiveDateStart(): Optional<LocalDate> = Optional.ofNullable(effectiveDateStart)

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun originatingAccountId(): Optional<String> = Optional.ofNullable(originatingAccountId)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun priority(): Optional<Priority> = Optional.ofNullable(priority)

    fun referenceNumber(): Optional<String> = Optional.ofNullable(referenceNumber)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId)

    fun type(): Optional<Type> = Optional.ofNullable(type)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.afterCursor?.let { params.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { params.put("counterparty_id", listOf(it.toString())) }
        this.createdAtEnd?.let { params.put("created_at_end", listOf(it.toString())) }
        this.createdAtStart?.let { params.put("created_at_start", listOf(it.toString())) }
        this.direction?.let { params.put("direction", listOf(it.toString())) }
        this.effectiveDateEnd?.let { params.put("effective_date_end", listOf(it.toString())) }
        this.effectiveDateStart?.let { params.put("effective_date_start", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values -> params.put("metadata[$key]", values) }
        this.originatingAccountId?.let {
            params.put("originating_account_id", listOf(it.toString()))
        }
        this.perPage?.let { params.put("per_page", listOf(it.toString())) }
        this.priority?.let { params.put("priority", listOf(it.toString())) }
        this.referenceNumber?.let { params.put("reference_number", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        this.transactionId?.let { params.put("transaction_id", listOf(it.toString())) }
        this.type?.let { params.put("type", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentOrderListParams &&
            this.afterCursor == other.afterCursor &&
            this.counterpartyId == other.counterpartyId &&
            this.createdAtEnd == other.createdAtEnd &&
            this.createdAtStart == other.createdAtStart &&
            this.direction == other.direction &&
            this.effectiveDateEnd == other.effectiveDateEnd &&
            this.effectiveDateStart == other.effectiveDateStart &&
            this.metadata == other.metadata &&
            this.originatingAccountId == other.originatingAccountId &&
            this.perPage == other.perPage &&
            this.priority == other.priority &&
            this.referenceNumber == other.referenceNumber &&
            this.status == other.status &&
            this.transactionId == other.transactionId &&
            this.type == other.type &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            afterCursor,
            counterpartyId,
            createdAtEnd,
            createdAtStart,
            direction,
            effectiveDateEnd,
            effectiveDateStart,
            metadata,
            originatingAccountId,
            perPage,
            priority,
            referenceNumber,
            status,
            transactionId,
            type,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "PaymentOrderListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, createdAtEnd=$createdAtEnd, createdAtStart=$createdAtStart, direction=$direction, effectiveDateEnd=$effectiveDateEnd, effectiveDateStart=$effectiveDateStart, metadata=$metadata, originatingAccountId=$originatingAccountId, perPage=$perPage, priority=$priority, referenceNumber=$referenceNumber, status=$status, transactionId=$transactionId, type=$type, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var counterpartyId: String? = null
        private var createdAtEnd: LocalDate? = null
        private var createdAtStart: LocalDate? = null
        private var direction: TransactionDirection? = null
        private var effectiveDateEnd: LocalDate? = null
        private var effectiveDateStart: LocalDate? = null
        private var metadata: Metadata? = null
        private var originatingAccountId: String? = null
        private var perPage: Long? = null
        private var priority: Priority? = null
        private var referenceNumber: String? = null
        private var status: Status? = null
        private var transactionId: String? = null
        private var type: Type? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentOrderListParams: PaymentOrderListParams) = apply {
            this.afterCursor = paymentOrderListParams.afterCursor
            this.counterpartyId = paymentOrderListParams.counterpartyId
            this.createdAtEnd = paymentOrderListParams.createdAtEnd
            this.createdAtStart = paymentOrderListParams.createdAtStart
            this.direction = paymentOrderListParams.direction
            this.effectiveDateEnd = paymentOrderListParams.effectiveDateEnd
            this.effectiveDateStart = paymentOrderListParams.effectiveDateStart
            this.metadata = paymentOrderListParams.metadata
            this.originatingAccountId = paymentOrderListParams.originatingAccountId
            this.perPage = paymentOrderListParams.perPage
            this.priority = paymentOrderListParams.priority
            this.referenceNumber = paymentOrderListParams.referenceNumber
            this.status = paymentOrderListParams.status
            this.transactionId = paymentOrderListParams.transactionId
            this.type = paymentOrderListParams.type
            additionalQueryParams(paymentOrderListParams.additionalQueryParams)
            additionalHeaders(paymentOrderListParams.additionalHeaders)
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** An inclusive upper bound for searching created_at */
        fun createdAtEnd(createdAtEnd: LocalDate) = apply { this.createdAtEnd = createdAtEnd }

        /** An inclusive lower bound for searching created_at */
        fun createdAtStart(createdAtStart: LocalDate) = apply {
            this.createdAtStart = createdAtStart
        }

        fun direction(direction: TransactionDirection) = apply { this.direction = direction }

        /** An inclusive upper bound for searching effective_date */
        fun effectiveDateEnd(effectiveDateEnd: LocalDate) = apply {
            this.effectiveDateEnd = effectiveDateEnd
        }

        /** An inclusive lower bound for searching effective_date */
        fun effectiveDateStart(effectiveDateStart: LocalDate) = apply {
            this.effectiveDateStart = effectiveDateStart
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority) = apply { this.priority = priority }

        /** Query for records with the provided reference number */
        fun referenceNumber(referenceNumber: String) = apply {
            this.referenceNumber = referenceNumber
        }

        fun status(status: Status) = apply { this.status = status }

        /** The ID of a transaction that the payment order has been reconciled to. */
        fun transactionId(transactionId: String) = apply { this.transactionId = transactionId }

        fun type(type: Type) = apply { this.type = type }

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

        fun build(): PaymentOrderListParams =
            PaymentOrderListParams(
                afterCursor,
                counterpartyId,
                createdAtEnd,
                createdAtStart,
                direction,
                effectiveDateEnd,
                effectiveDateStart,
                metadata,
                originatingAccountId,
                perPage,
                priority,
                referenceNumber,
                status,
                transactionId,
                type,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, List<String>>,
    ) {

        private var hashCode: Int = 0

        fun _additionalProperties(): Map<String, List<String>> = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            this.additionalProperties.forEach { key, values -> putParam(key, values) }
        }

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

            private var additionalProperties: MutableMap<String, List<String>> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, List<String>>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: List<String>) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, List<String>>) =
                apply {
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

            @JvmField val APPROVED = Status(JsonField.of("approved"))

            @JvmField val CANCELLED = Status(JsonField.of("cancelled"))

            @JvmField val COMPLETED = Status(JsonField.of("completed"))

            @JvmField val DENIED = Status(JsonField.of("denied"))

            @JvmField val FAILED = Status(JsonField.of("failed"))

            @JvmField val NEEDS_APPROVAL = Status(JsonField.of("needs_approval"))

            @JvmField val PENDING = Status(JsonField.of("pending"))

            @JvmField val PROCESSING = Status(JsonField.of("processing"))

            @JvmField val RETURNED = Status(JsonField.of("returned"))

            @JvmField val REVERSED = Status(JsonField.of("reversed"))

            @JvmField val SENT = Status(JsonField.of("sent"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

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
        }

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
            _UNKNOWN,
        }

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
                else -> Value._UNKNOWN
            }

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
                else -> throw ModernTreasuryInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = Type(JsonField.of("ach"))

            @JvmField val AU_BECS = Type(JsonField.of("au_becs"))

            @JvmField val BACS = Type(JsonField.of("bacs"))

            @JvmField val BOOK = Type(JsonField.of("book"))

            @JvmField val CARD = Type(JsonField.of("card"))

            @JvmField val CHATS = Type(JsonField.of("chats"))

            @JvmField val CHECK = Type(JsonField.of("check"))

            @JvmField val CROSS_BORDER = Type(JsonField.of("cross_border"))

            @JvmField val DK_NETS = Type(JsonField.of("dk_nets"))

            @JvmField val EFT = Type(JsonField.of("eft"))

            @JvmField val HU_ICS = Type(JsonField.of("hu_ics"))

            @JvmField val INTERAC = Type(JsonField.of("interac"))

            @JvmField val MASAV = Type(JsonField.of("masav"))

            @JvmField val MX_CCEN = Type(JsonField.of("mx_ccen"))

            @JvmField val NEFT = Type(JsonField.of("neft"))

            @JvmField val NICS = Type(JsonField.of("nics"))

            @JvmField val NZ_BECS = Type(JsonField.of("nz_becs"))

            @JvmField val PL_ELIXIR = Type(JsonField.of("pl_elixir"))

            @JvmField val PROVXCHANGE = Type(JsonField.of("provxchange"))

            @JvmField val RO_SENT = Type(JsonField.of("ro_sent"))

            @JvmField val RTP = Type(JsonField.of("rtp"))

            @JvmField val SE_BANKGIROT = Type(JsonField.of("se_bankgirot"))

            @JvmField val SEN = Type(JsonField.of("sen"))

            @JvmField val SEPA = Type(JsonField.of("sepa"))

            @JvmField val SG_GIRO = Type(JsonField.of("sg_giro"))

            @JvmField val SIC = Type(JsonField.of("sic"))

            @JvmField val SIGNET = Type(JsonField.of("signet"))

            @JvmField val SKNBI = Type(JsonField.of("sknbi"))

            @JvmField val WIRE = Type(JsonField.of("wire"))

            @JvmField val ZENGIN = Type(JsonField.of("zengin"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
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
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
