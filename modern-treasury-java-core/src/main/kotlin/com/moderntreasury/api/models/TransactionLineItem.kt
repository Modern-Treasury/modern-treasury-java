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
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class TransactionLineItem
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val counterpartyId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val discardedAt: JsonField<OffsetDateTime>,
    private val expectedPaymentId: JsonField<String>,
    private val liveMode: JsonField<Boolean>,
    private val object_: JsonField<String>,
    private val reconcilable: JsonField<Boolean>,
    private val reconciliationGroupId: JsonField<String>,
    private val transactableId: JsonField<String>,
    private val transactableType: JsonField<TransactableType>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("counterparty_id")
        @ExcludeMissing
        counterpartyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("discarded_at")
        @ExcludeMissing
        discardedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expected_payment_id")
        @ExcludeMissing
        expectedPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("live_mode") @ExcludeMissing liveMode: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("object") @ExcludeMissing object_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reconcilable")
        @ExcludeMissing
        reconcilable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reconciliation_group_id")
        @ExcludeMissing
        reconciliationGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactable_id")
        @ExcludeMissing
        transactableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactable_type")
        @ExcludeMissing
        transactableType: JsonField<TransactableType> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        counterpartyId,
        createdAt,
        description,
        discardedAt,
        expectedPaymentId,
        liveMode,
        object_,
        reconcilable,
        reconciliationGroupId,
        transactableId,
        transactableType,
        transactionId,
        type,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
     * specified currency's smallest unit (taken from parent Transaction).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The ID for the counterparty for this transaction line item.
     *
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
     * If no matching object is found, `description` will be a free-form text field describing the
     * line item. This field may contain personally identifiable information (PII) and is not
     * included in API responses by default. Learn more about changing your settings at
     * https://docs.moderntreasury.com/reference/personally-identifiable-information.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discardedAt(): Optional<OffsetDateTime> = discardedAt.getOptional("discarded_at")

    /**
     * The ID of the reconciled Expected Payment, otherwise `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedPaymentId(): Optional<String> = expectedPaymentId.getOptional("expected_payment_id")

    /**
     * This field will be true if this object exists in the live environment, or false if it exists
     * in the test environment.
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
     * Describes whether this line item should be counted towards the corresponding transaction’s
     * reconciliation.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reconcilable(): Boolean = reconcilable.getRequired("reconcilable")

    /**
     * The ID of the reconciliation group this line item belongs to, otherwise `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reconciliationGroupId(): Optional<String> =
        reconciliationGroupId.getOptional("reconciliation_group_id")

    /**
     * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
     * `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactableId(): Optional<String> = transactableId.getOptional("transactable_id")

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactableType(): Optional<TransactableType> =
        transactableType.getOptional("transactable_type")

    /**
     * The ID of the parent transaction.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionId(): String = transactionId.getRequired("transaction_id")

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [discardedAt].
     *
     * Unlike [discardedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discarded_at")
    @ExcludeMissing
    fun _discardedAt(): JsonField<OffsetDateTime> = discardedAt

    /**
     * Returns the raw JSON value of [expectedPaymentId].
     *
     * Unlike [expectedPaymentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expected_payment_id")
    @ExcludeMissing
    fun _expectedPaymentId(): JsonField<String> = expectedPaymentId

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
     * Returns the raw JSON value of [reconcilable].
     *
     * Unlike [reconcilable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reconcilable")
    @ExcludeMissing
    fun _reconcilable(): JsonField<Boolean> = reconcilable

    /**
     * Returns the raw JSON value of [reconciliationGroupId].
     *
     * Unlike [reconciliationGroupId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reconciliation_group_id")
    @ExcludeMissing
    fun _reconciliationGroupId(): JsonField<String> = reconciliationGroupId

    /**
     * Returns the raw JSON value of [transactableId].
     *
     * Unlike [transactableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactable_id")
    @ExcludeMissing
    fun _transactableId(): JsonField<String> = transactableId

    /**
     * Returns the raw JSON value of [transactableType].
     *
     * Unlike [transactableType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("transactable_type")
    @ExcludeMissing
    fun _transactableType(): JsonField<TransactableType> = transactableType

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [TransactionLineItem].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .counterpartyId()
         * .createdAt()
         * .description()
         * .discardedAt()
         * .expectedPaymentId()
         * .liveMode()
         * .object_()
         * .reconcilable()
         * .reconciliationGroupId()
         * .transactableId()
         * .transactableType()
         * .transactionId()
         * .type()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionLineItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var counterpartyId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var description: JsonField<String>? = null
        private var discardedAt: JsonField<OffsetDateTime>? = null
        private var expectedPaymentId: JsonField<String>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var reconcilable: JsonField<Boolean>? = null
        private var reconciliationGroupId: JsonField<String>? = null
        private var transactableId: JsonField<String>? = null
        private var transactableType: JsonField<TransactableType>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionLineItem: TransactionLineItem) = apply {
            id = transactionLineItem.id
            amount = transactionLineItem.amount
            counterpartyId = transactionLineItem.counterpartyId
            createdAt = transactionLineItem.createdAt
            description = transactionLineItem.description
            discardedAt = transactionLineItem.discardedAt
            expectedPaymentId = transactionLineItem.expectedPaymentId
            liveMode = transactionLineItem.liveMode
            object_ = transactionLineItem.object_
            reconcilable = transactionLineItem.reconcilable
            reconciliationGroupId = transactionLineItem.reconciliationGroupId
            transactableId = transactionLineItem.transactableId
            transactableType = transactionLineItem.transactableType
            transactionId = transactionLineItem.transactionId
            type = transactionLineItem.type
            updatedAt = transactionLineItem.updatedAt
            additionalProperties = transactionLineItem.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * If a matching object exists in Modern Treasury, `amount` will be populated. Value in
         * specified currency's smallest unit (taken from parent Transaction).
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** The ID for the counterparty for this transaction line item. */
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

        /**
         * If no matching object is found, `description` will be a free-form text field describing
         * the line item. This field may contain personally identifiable information (PII) and is
         * not included in API responses by default. Learn more about changing your settings at
         * https://docs.moderntreasury.com/reference/personally-identifiable-information.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        /** The ID of the reconciled Expected Payment, otherwise `null`. */
        fun expectedPaymentId(expectedPaymentId: String?) =
            expectedPaymentId(JsonField.ofNullable(expectedPaymentId))

        /** Alias for calling [Builder.expectedPaymentId] with `expectedPaymentId.orElse(null)`. */
        fun expectedPaymentId(expectedPaymentId: Optional<String>) =
            expectedPaymentId(expectedPaymentId.getOrNull())

        /**
         * Sets [Builder.expectedPaymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedPaymentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expectedPaymentId(expectedPaymentId: JsonField<String>) = apply {
            this.expectedPaymentId = expectedPaymentId
        }

        /**
         * This field will be true if this object exists in the live environment, or false if it
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

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /**
         * Describes whether this line item should be counted towards the corresponding
         * transaction’s reconciliation.
         */
        fun reconcilable(reconcilable: Boolean) = reconcilable(JsonField.of(reconcilable))

        /**
         * Sets [Builder.reconcilable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconcilable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reconcilable(reconcilable: JsonField<Boolean>) = apply {
            this.reconcilable = reconcilable
        }

        /** The ID of the reconciliation group this line item belongs to, otherwise `null`. */
        fun reconciliationGroupId(reconciliationGroupId: String?) =
            reconciliationGroupId(JsonField.ofNullable(reconciliationGroupId))

        /**
         * Alias for calling [Builder.reconciliationGroupId] with
         * `reconciliationGroupId.orElse(null)`.
         */
        fun reconciliationGroupId(reconciliationGroupId: Optional<String>) =
            reconciliationGroupId(reconciliationGroupId.getOrNull())

        /**
         * Sets [Builder.reconciliationGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reconciliationGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reconciliationGroupId(reconciliationGroupId: JsonField<String>) = apply {
            this.reconciliationGroupId = reconciliationGroupId
        }

        /**
         * If a matching object exists in Modern Treasury, the ID will be populated here, otherwise
         * `null`.
         */
        fun transactableId(transactableId: String?) =
            transactableId(JsonField.ofNullable(transactableId))

        /** Alias for calling [Builder.transactableId] with `transactableId.orElse(null)`. */
        fun transactableId(transactableId: Optional<String>) =
            transactableId(transactableId.getOrNull())

        /**
         * Sets [Builder.transactableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactableId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactableId(transactableId: JsonField<String>) = apply {
            this.transactableId = transactableId
        }

        /**
         * If a matching object exists in Modern Treasury, the type will be populated here,
         * otherwise `null`.
         */
        fun transactableType(transactableType: TransactableType?) =
            transactableType(JsonField.ofNullable(transactableType))

        /** Alias for calling [Builder.transactableType] with `transactableType.orElse(null)`. */
        fun transactableType(transactableType: Optional<TransactableType>) =
            transactableType(transactableType.getOrNull())

        /**
         * Sets [Builder.transactableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactableType] with a well-typed [TransactableType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactableType(transactableType: JsonField<TransactableType>) = apply {
            this.transactableType = transactableType
        }

        /** The ID of the parent transaction. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * Indicates whether the line item is `originating` or `receiving` (see
         * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [TransactionLineItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .counterpartyId()
         * .createdAt()
         * .description()
         * .discardedAt()
         * .expectedPaymentId()
         * .liveMode()
         * .object_()
         * .reconcilable()
         * .reconciliationGroupId()
         * .transactableId()
         * .transactableType()
         * .transactionId()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionLineItem =
            TransactionLineItem(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("counterpartyId", counterpartyId),
                checkRequired("createdAt", createdAt),
                checkRequired("description", description),
                checkRequired("discardedAt", discardedAt),
                checkRequired("expectedPaymentId", expectedPaymentId),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("reconcilable", reconcilable),
                checkRequired("reconciliationGroupId", reconciliationGroupId),
                checkRequired("transactableId", transactableId),
                checkRequired("transactableType", transactableType),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TransactionLineItem = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        counterpartyId()
        createdAt()
        description()
        discardedAt()
        expectedPaymentId()
        liveMode()
        object_()
        reconcilable()
        reconciliationGroupId()
        transactableId()
        transactableType().ifPresent { it.validate() }
        transactionId()
        type().validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (counterpartyId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (discardedAt.asKnown().isPresent) 1 else 0) +
            (if (expectedPaymentId.asKnown().isPresent) 1 else 0) +
            (if (liveMode.asKnown().isPresent) 1 else 0) +
            (if (object_.asKnown().isPresent) 1 else 0) +
            (if (reconcilable.asKnown().isPresent) 1 else 0) +
            (if (reconciliationGroupId.asKnown().isPresent) 1 else 0) +
            (if (transactableId.asKnown().isPresent) 1 else 0) +
            (transactableType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (transactionId.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    /**
     * If a matching object exists in Modern Treasury, the type will be populated here, otherwise
     * `null`.
     */
    class TransactableType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val INCOMING_PAYMENT_DETAIL = of("incoming_payment_detail")

            @JvmField val PAPER_ITEM = of("paper_item")

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val PAYMENT_ORDER_ATTEMPT = of("payment_order_attempt")

            @JvmField val RETURN = of("return")

            @JvmField val REVERSAL = of("reversal")

            @JvmStatic fun of(value: String) = TransactableType(JsonField.of(value))
        }

        /** An enum containing [TransactableType]'s known values. */
        enum class Known {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
        }

        /**
         * An enum containing [TransactableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING_PAYMENT_DETAIL,
            PAPER_ITEM,
            PAYMENT_ORDER,
            PAYMENT_ORDER_ATTEMPT,
            RETURN,
            REVERSAL,
            /**
             * An enum member indicating that [TransactableType] was instantiated with an unknown
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
                INCOMING_PAYMENT_DETAIL -> Value.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Value.PAPER_ITEM
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Value.PAYMENT_ORDER_ATTEMPT
                RETURN -> Value.RETURN
                REVERSAL -> Value.REVERSAL
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
                INCOMING_PAYMENT_DETAIL -> Known.INCOMING_PAYMENT_DETAIL
                PAPER_ITEM -> Known.PAPER_ITEM
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                PAYMENT_ORDER_ATTEMPT -> Known.PAYMENT_ORDER_ATTEMPT
                RETURN -> Known.RETURN
                REVERSAL -> Known.REVERSAL
                else -> throw ModernTreasuryInvalidDataException("Unknown TransactableType: $value")
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

        fun validate(): TransactableType = apply {
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

            return /* spotless:off */ other is TransactableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates whether the line item is `originating` or `receiving` (see
     * https://www.moderntreasury.com/journal/beginners-guide-to-ach for more).
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ORIGINATING = of("originating")

            @JvmField val RECEIVING = of("receiving")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ORIGINATING,
            RECEIVING,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORIGINATING,
            RECEIVING,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                ORIGINATING -> Value.ORIGINATING
                RECEIVING -> Value.RECEIVING
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
                ORIGINATING -> Known.ORIGINATING
                RECEIVING -> Known.RECEIVING
                else -> throw ModernTreasuryInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionLineItem && id == other.id && amount == other.amount && counterpartyId == other.counterpartyId && createdAt == other.createdAt && description == other.description && discardedAt == other.discardedAt && expectedPaymentId == other.expectedPaymentId && liveMode == other.liveMode && object_ == other.object_ && reconcilable == other.reconcilable && reconciliationGroupId == other.reconciliationGroupId && transactableId == other.transactableId && transactableType == other.transactableType && transactionId == other.transactionId && type == other.type && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, counterpartyId, createdAt, description, discardedAt, expectedPaymentId, liveMode, object_, reconcilable, reconciliationGroupId, transactableId, transactableType, transactionId, type, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionLineItem{id=$id, amount=$amount, counterpartyId=$counterpartyId, createdAt=$createdAt, description=$description, discardedAt=$discardedAt, expectedPaymentId=$expectedPaymentId, liveMode=$liveMode, object_=$object_, reconcilable=$reconcilable, reconciliationGroupId=$reconciliationGroupId, transactableId=$transactableId, transactableType=$transactableType, transactionId=$transactionId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
