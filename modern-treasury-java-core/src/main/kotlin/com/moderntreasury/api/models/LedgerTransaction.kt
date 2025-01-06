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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class LedgerTransaction
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("effective_at")
    @ExcludeMissing
    private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("effective_date")
    @ExcludeMissing
    private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("external_id")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledger_entries")
    @ExcludeMissing
    private val ledgerEntries: JsonField<List<LedgerEntry>> = JsonMissing.of(),
    @JsonProperty("ledger_id")
    @ExcludeMissing
    private val ledgerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledgerable_id")
    @ExcludeMissing
    private val ledgerableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("ledgerable_type")
    @ExcludeMissing
    private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("posted_at")
    @ExcludeMissing
    private val postedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("reversed_by_ledger_transaction_id")
    @ExcludeMissing
    private val reversedByLedgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reverses_ledger_transaction_id")
    @ExcludeMissing
    private val reversesLedgerTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** An optional description for internal use. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /**
     * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
     * purposes.
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effective_at")

    /** The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes. */
    fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

    /**
     * A unique string to represent the ledger transaction. Only one pending or posted ledger
     * transaction may have this ID in the ledger.
     */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("external_id"))

    /** An array of ledger entry objects. */
    fun ledgerEntries(): List<LedgerEntry> = ledgerEntries.getRequired("ledger_entries")

    /** The ID of the ledger this ledger transaction belongs to. */
    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the id will
     * be populated here, otherwise null.
     */
    fun ledgerableId(): Optional<String> =
        Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
     */
    fun ledgerableType(): Optional<LedgerableType> =
        Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun object_(): String = object_.getRequired("object")

    /**
     * The time on which the ledger transaction posted. This is null if the ledger transaction is
     * pending.
     */
    fun postedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(postedAt.getNullable("posted_at"))

    /** The ID of the ledger transaction that reversed this ledger transaction. */
    fun reversedByLedgerTransactionId(): Optional<String> =
        Optional.ofNullable(
            reversedByLedgerTransactionId.getNullable("reversed_by_ledger_transaction_id")
        )

    /** The ID of the original ledger transaction that this ledger transaction reverses. */
    fun reversesLedgerTransactionId(): Optional<String> =
        Optional.ofNullable(
            reversesLedgerTransactionId.getNullable("reverses_ledger_transaction_id")
        )

    /** To post a ledger transaction at creation, use `posted`. */
    fun status(): Status = status.getRequired("status")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** An optional description for internal use. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /**
     * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
     * purposes.
     */
    @JsonProperty("effective_at") @ExcludeMissing fun _effectiveAt() = effectiveAt

    /** The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes. */
    @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

    /**
     * A unique string to represent the ledger transaction. Only one pending or posted ledger
     * transaction may have this ID in the ledger.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId() = externalId

    /** An array of ledger entry objects. */
    @JsonProperty("ledger_entries") @ExcludeMissing fun _ledgerEntries() = ledgerEntries

    /** The ID of the ledger this ledger transaction belongs to. */
    @JsonProperty("ledger_id") @ExcludeMissing fun _ledgerId() = ledgerId

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the id will
     * be populated here, otherwise null.
     */
    @JsonProperty("ledgerable_id") @ExcludeMissing fun _ledgerableId() = ledgerableId

    /**
     * If the ledger transaction can be reconciled to another object in Modern Treasury, the type
     * will be populated here, otherwise null. This can be one of payment_order,
     * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
     */
    @JsonProperty("ledgerable_type") @ExcludeMissing fun _ledgerableType() = ledgerableType

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * The time on which the ledger transaction posted. This is null if the ledger transaction is
     * pending.
     */
    @JsonProperty("posted_at") @ExcludeMissing fun _postedAt() = postedAt

    /** The ID of the ledger transaction that reversed this ledger transaction. */
    @JsonProperty("reversed_by_ledger_transaction_id")
    @ExcludeMissing
    fun _reversedByLedgerTransactionId() = reversedByLedgerTransactionId

    /** The ID of the original ledger transaction that this ledger transaction reverses. */
    @JsonProperty("reverses_ledger_transaction_id")
    @ExcludeMissing
    fun _reversesLedgerTransactionId() = reversesLedgerTransactionId

    /** To post a ledger transaction at creation, use `posted`. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): LedgerTransaction = apply {
        if (!validated) {
            id()
            createdAt()
            description()
            effectiveAt()
            effectiveDate()
            externalId()
            ledgerEntries().forEach { it.validate() }
            ledgerId()
            ledgerableId()
            ledgerableType()
            liveMode()
            metadata().validate()
            object_()
            postedAt()
            reversedByLedgerTransactionId()
            reversesLedgerTransactionId()
            status()
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
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var ledgerEntries: JsonField<List<LedgerEntry>> = JsonMissing.of()
        private var ledgerId: JsonField<String> = JsonMissing.of()
        private var ledgerableId: JsonField<String> = JsonMissing.of()
        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
        private var liveMode: JsonField<Boolean> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var object_: JsonField<String> = JsonMissing.of()
        private var postedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var reversedByLedgerTransactionId: JsonField<String> = JsonMissing.of()
        private var reversesLedgerTransactionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ledgerTransaction: LedgerTransaction) = apply {
            id = ledgerTransaction.id
            createdAt = ledgerTransaction.createdAt
            description = ledgerTransaction.description
            effectiveAt = ledgerTransaction.effectiveAt
            effectiveDate = ledgerTransaction.effectiveDate
            externalId = ledgerTransaction.externalId
            ledgerEntries = ledgerTransaction.ledgerEntries
            ledgerId = ledgerTransaction.ledgerId
            ledgerableId = ledgerTransaction.ledgerableId
            ledgerableType = ledgerTransaction.ledgerableType
            liveMode = ledgerTransaction.liveMode
            metadata = ledgerTransaction.metadata
            object_ = ledgerTransaction.object_
            postedAt = ledgerTransaction.postedAt
            reversedByLedgerTransactionId = ledgerTransaction.reversedByLedgerTransactionId
            reversesLedgerTransactionId = ledgerTransaction.reversesLedgerTransactionId
            status = ledgerTransaction.status
            updatedAt = ledgerTransaction.updatedAt
            additionalProperties = ledgerTransaction.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** An optional description for internal use. */
        fun description(description: String) = description(JsonField.of(description))

        /** An optional description for internal use. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
         * purposes.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

        /**
         * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting purposes.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            this.effectiveDate = effectiveDate
        }

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * A unique string to represent the ledger transaction. Only one pending or posted ledger
         * transaction may have this ID in the ledger.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** An array of ledger entry objects. */
        fun ledgerEntries(ledgerEntries: List<LedgerEntry>) =
            ledgerEntries(JsonField.of(ledgerEntries))

        /** An array of ledger entry objects. */
        fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntry>>) = apply {
            this.ledgerEntries = ledgerEntries
        }

        /** The ID of the ledger this ledger transaction belongs to. */
        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

        /** The ID of the ledger this ledger transaction belongs to. */
        fun ledgerId(ledgerId: JsonField<String>) = apply { this.ledgerId = ledgerId }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the id
         * will be populated here, otherwise null.
         */
        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
            this.ledgerableId = ledgerableId
        }

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        fun ledgerableType(ledgerableType: LedgerableType) =
            ledgerableType(JsonField.of(ledgerableType))

        /**
         * If the ledger transaction can be reconciled to another object in Modern Treasury, the
         * type will be populated here, otherwise null. This can be one of payment_order,
         * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
         */
        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
            this.ledgerableType = ledgerableType
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

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * The time on which the ledger transaction posted. This is null if the ledger transaction
         * is pending.
         */
        fun postedAt(postedAt: OffsetDateTime) = postedAt(JsonField.of(postedAt))

        /**
         * The time on which the ledger transaction posted. This is null if the ledger transaction
         * is pending.
         */
        fun postedAt(postedAt: JsonField<OffsetDateTime>) = apply { this.postedAt = postedAt }

        /** The ID of the ledger transaction that reversed this ledger transaction. */
        fun reversedByLedgerTransactionId(reversedByLedgerTransactionId: String) =
            reversedByLedgerTransactionId(JsonField.of(reversedByLedgerTransactionId))

        /** The ID of the ledger transaction that reversed this ledger transaction. */
        fun reversedByLedgerTransactionId(reversedByLedgerTransactionId: JsonField<String>) =
            apply {
                this.reversedByLedgerTransactionId = reversedByLedgerTransactionId
            }

        /** The ID of the original ledger transaction that this ledger transaction reverses. */
        fun reversesLedgerTransactionId(reversesLedgerTransactionId: String) =
            reversesLedgerTransactionId(JsonField.of(reversesLedgerTransactionId))

        /** The ID of the original ledger transaction that this ledger transaction reverses. */
        fun reversesLedgerTransactionId(reversesLedgerTransactionId: JsonField<String>) = apply {
            this.reversesLedgerTransactionId = reversesLedgerTransactionId
        }

        /** To post a ledger transaction at creation, use `posted`. */
        fun status(status: Status) = status(JsonField.of(status))

        /** To post a ledger transaction at creation, use `posted`. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun build(): LedgerTransaction =
            LedgerTransaction(
                id,
                createdAt,
                description,
                effectiveAt,
                effectiveDate,
                externalId,
                ledgerEntries.map { it.toImmutable() },
                ledgerId,
                ledgerableId,
                ledgerableType,
                liveMode,
                metadata,
                object_,
                postedAt,
                reversedByLedgerTransactionId,
                reversesLedgerTransactionId,
                status,
                updatedAt,
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

            @JvmField val EXPECTED_PAYMENT = of("expected_payment")

            @JvmField val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            @JvmField val PAPER_ITEM = of("paper_item")

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val RETURN = of("return")

            @JvmField val REVERSAL = of("reversal")

            @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
        }

        enum class Known {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            EXPECTED_PAYMENT,
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown LedgerableType: $value")
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ARCHIVED = of("archived")

            @JvmField val PENDING = of("pending")

            @JvmField val POSTED = of("posted")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ARCHIVED,
            PENDING,
            POSTED,
        }

        enum class Value {
            ARCHIVED,
            PENDING,
            POSTED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ARCHIVED -> Value.ARCHIVED
                PENDING -> Value.PENDING
                POSTED -> Value.POSTED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ARCHIVED -> Known.ARCHIVED
                PENDING -> Known.PENDING
                POSTED -> Known.POSTED
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

        return /* spotless:off */ other is LedgerTransaction && id == other.id && createdAt == other.createdAt && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerEntries == other.ledgerEntries && ledgerId == other.ledgerId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && liveMode == other.liveMode && metadata == other.metadata && object_ == other.object_ && postedAt == other.postedAt && reversedByLedgerTransactionId == other.reversedByLedgerTransactionId && reversesLedgerTransactionId == other.reversesLedgerTransactionId && status == other.status && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, description, effectiveAt, effectiveDate, externalId, ledgerEntries, ledgerId, ledgerableId, ledgerableType, liveMode, metadata, object_, postedAt, reversedByLedgerTransactionId, reversesLedgerTransactionId, status, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LedgerTransaction{id=$id, createdAt=$createdAt, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerEntries=$ledgerEntries, ledgerId=$ledgerId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, liveMode=$liveMode, metadata=$metadata, object_=$object_, postedAt=$postedAt, reversedByLedgerTransactionId=$reversedByLedgerTransactionId, reversesLedgerTransactionId=$reversesLedgerTransactionId, status=$status, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
