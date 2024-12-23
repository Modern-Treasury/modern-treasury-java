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

@JsonDeserialize(builder = Reversal.Builder::class)
@NoAutoDetect
class Reversal
private constructor(
    private val id: JsonField<String>,
    private val object_: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val paymentOrderId: JsonField<String>,
    private val ledgerTransactionId: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val reason: JsonField<Reason>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /** The current status of the reversal. */
    fun status(): Status = status.getRequired("status")

    /** The ID of the relevant Payment Order. */
    fun paymentOrderId(): Optional<String> =
        Optional.ofNullable(paymentOrderId.getNullable("payment_order_id"))

    /** The ID of the ledger transaction linked to the reversal. */
    fun ledgerTransactionId(): Optional<String> =
        Optional.ofNullable(ledgerTransactionId.getNullable("ledger_transaction_id"))

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The reason for the reversal. */
    fun reason(): Reason = reason.getRequired("reason")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    /** The current status of the reversal. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The ID of the relevant Payment Order. */
    @JsonProperty("payment_order_id") @ExcludeMissing fun _paymentOrderId() = paymentOrderId

    /** The ID of the ledger transaction linked to the reversal. */
    @JsonProperty("ledger_transaction_id")
    @ExcludeMissing
    fun _ledgerTransactionId() = ledgerTransactionId

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /** The reason for the reversal. */
    @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Reversal = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            status()
            paymentOrderId()
            ledgerTransactionId()
            metadata().validate()
            reason()
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
        private var status: JsonField<Status> = JsonMissing.of()
        private var paymentOrderId: JsonField<String> = JsonMissing.of()
        private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var reason: JsonField<Reason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(reversal: Reversal) = apply {
            this.id = reversal.id
            this.object_ = reversal.object_
            this.liveMode = reversal.liveMode
            this.createdAt = reversal.createdAt
            this.updatedAt = reversal.updatedAt
            this.status = reversal.status
            this.paymentOrderId = reversal.paymentOrderId
            this.ledgerTransactionId = reversal.ledgerTransactionId
            this.metadata = reversal.metadata
            this.reason = reversal.reason
            additionalProperties(reversal.additionalProperties)
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

        /** The current status of the reversal. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The current status of the reversal. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The ID of the relevant Payment Order. */
        fun paymentOrderId(paymentOrderId: String) = paymentOrderId(JsonField.of(paymentOrderId))

        /** The ID of the relevant Payment Order. */
        @JsonProperty("payment_order_id")
        @ExcludeMissing
        fun paymentOrderId(paymentOrderId: JsonField<String>) = apply {
            this.paymentOrderId = paymentOrderId
        }

        /** The ID of the ledger transaction linked to the reversal. */
        fun ledgerTransactionId(ledgerTransactionId: String) =
            ledgerTransactionId(JsonField.of(ledgerTransactionId))

        /** The ID of the ledger transaction linked to the reversal. */
        @JsonProperty("ledger_transaction_id")
        @ExcludeMissing
        fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
            this.ledgerTransactionId = ledgerTransactionId
        }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The reason for the reversal. */
        fun reason(reason: Reason) = reason(JsonField.of(reason))

        /** The reason for the reversal. */
        @JsonProperty("reason")
        @ExcludeMissing
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Reversal =
            Reversal(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                status,
                paymentOrderId,
                ledgerTransactionId,
                metadata,
                reason,
                additionalProperties.toImmutable(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DUPLICATE = of("duplicate")

            @JvmField val INCORRECT_AMOUNT = of("incorrect_amount")

            @JvmField val INCORRECT_RECEIVING_ACCOUNT = of("incorrect_receiving_account")

            @JvmField val DATE_EARLIER_THAN_INTENDED = of("date_earlier_than_intended")

            @JvmField val DATE_LATER_THAN_INTENDED = of("date_later_than_intended")

            @JvmStatic fun of(value: String) = Reason(JsonField.of(value))
        }

        enum class Known {
            DUPLICATE,
            INCORRECT_AMOUNT,
            INCORRECT_RECEIVING_ACCOUNT,
            DATE_EARLIER_THAN_INTENDED,
            DATE_LATER_THAN_INTENDED,
        }

        enum class Value {
            DUPLICATE,
            INCORRECT_AMOUNT,
            INCORRECT_RECEIVING_ACCOUNT,
            DATE_EARLIER_THAN_INTENDED,
            DATE_LATER_THAN_INTENDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DUPLICATE -> Value.DUPLICATE
                INCORRECT_AMOUNT -> Value.INCORRECT_AMOUNT
                INCORRECT_RECEIVING_ACCOUNT -> Value.INCORRECT_RECEIVING_ACCOUNT
                DATE_EARLIER_THAN_INTENDED -> Value.DATE_EARLIER_THAN_INTENDED
                DATE_LATER_THAN_INTENDED -> Value.DATE_LATER_THAN_INTENDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DUPLICATE -> Known.DUPLICATE
                INCORRECT_AMOUNT -> Known.INCORRECT_AMOUNT
                INCORRECT_RECEIVING_ACCOUNT -> Known.INCORRECT_RECEIVING_ACCOUNT
                DATE_EARLIER_THAN_INTENDED -> Known.DATE_EARLIER_THAN_INTENDED
                DATE_LATER_THAN_INTENDED -> Known.DATE_LATER_THAN_INTENDED
                else -> throw ModernTreasuryInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && value == other.value /* spotless:on */
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

            @JvmField val COMPLETED = of("completed")

            @JvmField val FAILED = of("failed")

            @JvmField val PENDING = of("pending")

            @JvmField val PROCESSING = of("processing")

            @JvmField val RETURNED = of("returned")

            @JvmField val SENT = of("sent")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            RETURNED,
            SENT,
        }

        enum class Value {
            COMPLETED,
            FAILED,
            PENDING,
            PROCESSING,
            RETURNED,
            SENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                PENDING -> Value.PENDING
                PROCESSING -> Value.PROCESSING
                RETURNED -> Value.RETURNED
                SENT -> Value.SENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                PENDING -> Known.PENDING
                PROCESSING -> Known.PROCESSING
                RETURNED -> Known.RETURNED
                SENT -> Known.SENT
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

        return /* spotless:off */ other is Reversal && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && status == other.status && paymentOrderId == other.paymentOrderId && ledgerTransactionId == other.ledgerTransactionId && metadata == other.metadata && reason == other.reason && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, status, paymentOrderId, ledgerTransactionId, metadata, reason, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Reversal{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, status=$status, paymentOrderId=$paymentOrderId, ledgerTransactionId=$ledgerTransactionId, metadata=$metadata, reason=$reason, additionalProperties=$additionalProperties}"
}
