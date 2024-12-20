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
class TransactionLineItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("discarded_at")
    @ExcludeMissing
    private val discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("transactable_type")
    @ExcludeMissing
    private val transactableType: JsonField<TransactableType> = JsonMissing.of(),
    @JsonProperty("transactable_id")
    @ExcludeMissing
    private val transactableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterparty_id")
    @ExcludeMissing
    private val counterpartyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expected_payment_id")
    @ExcludeMissing
    private val expectedPaymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reconcilable")
    @ExcludeMissing
    private val reconcilable: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun object_(): String = object_.getRequired("object")

    /**
     * This field will be true if this object exists in the live environment, or false if it exists
     * in the test environment.
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    fun discardedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(discardedAt.getNullable("discarded_at"))

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    fun transactableType(): Optional<TransactableType> =
        Optional.ofNullable(transactableType.getNullable("transactable_type"))

    /**
     * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
     * `null`.
     */
    fun transactableId(): Optional<String> =
        Optional.ofNullable(transactableId.getNullable("transactable_id"))

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If no matching object is found, `description` will be a free-form text field describing the
     * line item. This field may contain personally identifiable information (PII) and is not
     * included in API responses by default. Learn more about changing your settings at
     * https://docs.moderntreasury.com/reference/personally-identifiable-information.
     */
    fun description(): String = description.getRequired("description")

    /** The ID for the counterparty for this transaction line item. */
    fun counterpartyId(): Optional<String> =
        Optional.ofNullable(counterpartyId.getNullable("counterparty_id"))

    /** The ID of the reconciled Expected Payment, otherwise `null`. */
    fun expectedPaymentId(): Optional<String> =
        Optional.ofNullable(expectedPaymentId.getNullable("expected_payment_id"))

    /** The ID of the parent transaction. */
    fun transactionId(): String = transactionId.getRequired("transaction_id")

    /**
     * Describes whether this line item should be counted towards the corresponding transaction’s
     * reconciliation.
     */
    fun reconcilable(): Boolean = reconcilable.getRequired("reconcilable")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("object") @ExcludeMissing fun _object_() = object_

    /**
     * This field will be true if this object exists in the live environment, or false if it exists
     * in the test environment.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode() = liveMode

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("updated_at") @ExcludeMissing fun _updatedAt() = updatedAt

    @JsonProperty("discarded_at") @ExcludeMissing fun _discardedAt() = discardedAt

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    @JsonProperty("transactable_type") @ExcludeMissing fun _transactableType() = transactableType

    /**
     * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
     * `null`.
     */
    @JsonProperty("transactable_id") @ExcludeMissing fun _transactableId() = transactableId

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * If no matching object is found, `description` will be a free-form text field describing the
     * line item. This field may contain personally identifiable information (PII) and is not
     * included in API responses by default. Learn more about changing your settings at
     * https://docs.moderntreasury.com/reference/personally-identifiable-information.
     */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The ID for the counterparty for this transaction line item. */
    @JsonProperty("counterparty_id") @ExcludeMissing fun _counterpartyId() = counterpartyId

    /** The ID of the reconciled Expected Payment, otherwise `null`. */
    @JsonProperty("expected_payment_id")
    @ExcludeMissing
    fun _expectedPaymentId() = expectedPaymentId

    /** The ID of the parent transaction. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * Describes whether this line item should be counted towards the corresponding transaction’s
     * reconciliation.
     */
    @JsonProperty("reconcilable") @ExcludeMissing fun _reconcilable() = reconcilable

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TransactionLineItem = apply {
        if (!validated) {
            id()
            object_()
            liveMode()
            createdAt()
            updatedAt()
            discardedAt()
            type()
            transactableType()
            transactableId()
            amount()
            description()
            counterpartyId()
            expectedPaymentId()
            transactionId()
            reconcilable()
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
        private var discardedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var transactableType: JsonField<TransactableType> = JsonMissing.of()
        private var transactableId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var counterpartyId: JsonField<String> = JsonMissing.of()
        private var expectedPaymentId: JsonField<String> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var reconcilable: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionLineItem: TransactionLineItem) = apply {
            id = transactionLineItem.id
            object_ = transactionLineItem.object_
            liveMode = transactionLineItem.liveMode
            createdAt = transactionLineItem.createdAt
            updatedAt = transactionLineItem.updatedAt
            discardedAt = transactionLineItem.discardedAt
            type = transactionLineItem.type
            transactableType = transactionLineItem.transactableType
            transactableId = transactionLineItem.transactableId
            amount = transactionLineItem.amount
            description = transactionLineItem.description
            counterpartyId = transactionLineItem.counterpartyId
            expectedPaymentId = transactionLineItem.expectedPaymentId
            transactionId = transactionLineItem.transactionId
            reconcilable = transactionLineItem.reconcilable
            additionalProperties = transactionLineItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun object_(object_: String) = object_(JsonField.of(object_))

        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * This field will be true if this object exists in the live environment, or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * This field will be true if this object exists in the live environment, or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun discardedAt(discardedAt: OffsetDateTime) = discardedAt(JsonField.of(discardedAt))

        fun discardedAt(discardedAt: JsonField<OffsetDateTime>) = apply {
            this.discardedAt = discardedAt
        }

        /**
         * Indicates whether the line item is `originating` or `receiving` (see
         * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Indicates whether the line item is `originating` or `receiving` (see
         * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * If a matching object exists in Modern Treasury, the type will be populated here,
         * otherwise `null`.
         */
        fun transactableType(transactableType: TransactableType) =
            transactableType(JsonField.of(transactableType))

        /**
         * If a matching object exists in Modern Treasury, the type will be populated here,
         * otherwise `null`.
         */
        fun transactableType(transactableType: JsonField<TransactableType>) = apply {
            this.transactableType = transactableType
        }

        /**
         * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
         * `null`.
         */
        fun transactableId(transactableId: String) = transactableId(JsonField.of(transactableId))

        /**
         * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
         * `null`.
         */
        fun transactableId(transactableId: JsonField<String>) = apply {
            this.transactableId = transactableId
        }

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If no matching object is found, `description` will be a free-form text field describing
         * the line item. This field may contain personally identifiable information (PII) and is
         * not included in API responses by default. Learn more about changing your settings at
         * https://docs.moderntreasury.com/reference/personally-identifiable-information.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * If no matching object is found, `description` will be a free-form text field describing
         * the line item. This field may contain personally identifiable information (PII) and is
         * not included in API responses by default. Learn more about changing your settings at
         * https://docs.moderntreasury.com/reference/personally-identifiable-information.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The ID for the counterparty for this transaction line item. */
        fun counterpartyId(counterpartyId: String) = counterpartyId(JsonField.of(counterpartyId))

        /** The ID for the counterparty for this transaction line item. */
        fun counterpartyId(counterpartyId: JsonField<String>) = apply {
            this.counterpartyId = counterpartyId
        }

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: String) =
            expectedPaymentId(JsonField.of(expectedPaymentId))

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: JsonField<String>) = apply {
            this.expectedPaymentId = expectedPaymentId
        }

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * Describes whether this line item should be counted towards the corresponding
         * transaction’s reconciliation.
         */
        fun reconcilable(reconcilable: Boolean) = reconcilable(JsonField.of(reconcilable))

        /**
         * Describes whether this line item should be counted towards the corresponding
         * transaction’s reconciliation.
         */
        fun reconcilable(reconcilable: JsonField<Boolean>) = apply {
            this.reconcilable = reconcilable
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

        fun build(): TransactionLineItem =
            TransactionLineItem(
                id,
                object_,
                liveMode,
                createdAt,
                updatedAt,
                discardedAt,
                type,
                transactableType,
                transactableId,
                amount,
                description,
                counterpartyId,
                expectedPaymentId,
                transactionId,
                reconcilable,
                additionalProperties.toImmutable(),
            )
    }

    class TransactableType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            @JvmField val PAPER_ITEM = of("paper_item")

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val PAYMENT_ORDER_ATTEMPT = of("payment_order_attempt")

            @JvmField val RETURN = of("return")

            @JvmField val REVERSAL = of("reversal")

            @JvmStatic fun of(value: String) = TransactableType(JsonField.of(value))
        }

        enum class Known {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
        }

        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown TransactableType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ORIGINATING = of("originating")

            @JvmField val RECEIVING = of("receiving")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ORIGINATING,
            RECEIVING,
        }

        enum class Value {
            ORIGINATING,
            RECEIVING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ORIGINATING -> Value.ORIGINATING
                RECEIVING -> Value.RECEIVING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ORIGINATING -> Known.ORIGINATING
                RECEIVING -> Known.RECEIVING
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

        return /* spotless:off */ other is TransactionLineItem && id == other.id && object_ == other.object_ && liveMode == other.liveMode && createdAt == other.createdAt && updatedAt == other.updatedAt && discardedAt == other.discardedAt && type == other.type && transactableType == other.transactableType && transactableId == other.transactableId && amount == other.amount && description == other.description && counterpartyId == other.counterpartyId && expectedPaymentId == other.expectedPaymentId && transactionId == other.transactionId && reconcilable == other.reconcilable && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, object_, liveMode, createdAt, updatedAt, discardedAt, type, transactableType, transactableId, amount, description, counterpartyId, expectedPaymentId, transactionId, reconcilable, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionLineItem{id=$id, object_=$object_, liveMode=$liveMode, createdAt=$createdAt, updatedAt=$updatedAt, discardedAt=$discardedAt, type=$type, transactableType=$transactableType, transactableId=$transactableId, amount=$amount, description=$description, counterpartyId=$counterpartyId, expectedPaymentId=$expectedPaymentId, transactionId=$transactionId, reconcilable=$reconcilable, additionalProperties=$additionalProperties}"
}
