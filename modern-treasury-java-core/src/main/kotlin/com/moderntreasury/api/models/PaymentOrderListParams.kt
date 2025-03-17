// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a list of all payment orders */
class PaymentOrderListParams
private constructor(
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
    private val processAfterEnd: OffsetDateTime?,
    private val processAfterStart: OffsetDateTime?,
    private val referenceNumber: String?,
    private val status: Status?,
    private val transactionId: String?,
    private val type: Type?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    /** An inclusive upper bound for searching created_at */
    fun createdAtEnd(): Optional<LocalDate> = Optional.ofNullable(createdAtEnd)

    /** An inclusive lower bound for searching created_at */
    fun createdAtStart(): Optional<LocalDate> = Optional.ofNullable(createdAtStart)

    fun direction(): Optional<TransactionDirection> = Optional.ofNullable(direction)

    /** An inclusive upper bound for searching effective_date */
    fun effectiveDateEnd(): Optional<LocalDate> = Optional.ofNullable(effectiveDateEnd)

    /** An inclusive lower bound for searching effective_date */
    fun effectiveDateStart(): Optional<LocalDate> = Optional.ofNullable(effectiveDateStart)

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun originatingAccountId(): Optional<String> = Optional.ofNullable(originatingAccountId)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /**
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     */
    fun priority(): Optional<Priority> = Optional.ofNullable(priority)

    /** An inclusive upper bound for searching process_after */
    fun processAfterEnd(): Optional<OffsetDateTime> = Optional.ofNullable(processAfterEnd)

    /** An inclusive lower bound for searching process_after */
    fun processAfterStart(): Optional<OffsetDateTime> = Optional.ofNullable(processAfterStart)

    /** Query for records with the provided reference number */
    fun referenceNumber(): Optional<String> = Optional.ofNullable(referenceNumber)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** The ID of a transaction that the payment order has been reconciled to. */
    fun transactionId(): Optional<String> = Optional.ofNullable(transactionId)

    fun type(): Optional<Type> = Optional.ofNullable(type)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { queryParams.put("counterparty_id", listOf(it.toString())) }
        this.createdAtEnd?.let { queryParams.put("created_at_end", listOf(it.toString())) }
        this.createdAtStart?.let { queryParams.put("created_at_start", listOf(it.toString())) }
        this.direction?.let { queryParams.put("direction", listOf(it.toString())) }
        this.effectiveDateEnd?.let { queryParams.put("effective_date_end", listOf(it.toString())) }
        this.effectiveDateStart?.let {
            queryParams.put("effective_date_start", listOf(it.toString()))
        }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.originatingAccountId?.let {
            queryParams.put("originating_account_id", listOf(it.toString()))
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.priority?.let { queryParams.put("priority", listOf(it.toString())) }
        this.processAfterEnd?.let {
            queryParams.put(
                "process_after_end",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.processAfterStart?.let {
            queryParams.put(
                "process_after_start",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.referenceNumber?.let { queryParams.put("reference_number", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.transactionId?.let { queryParams.put("transaction_id", listOf(it.toString())) }
        this.type?.let { queryParams.put("type", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PaymentOrderListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PaymentOrderListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentOrderListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

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
        private var processAfterEnd: OffsetDateTime? = null
        private var processAfterStart: OffsetDateTime? = null
        private var referenceNumber: String? = null
        private var status: Status? = null
        private var transactionId: String? = null
        private var type: Type? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentOrderListParams: PaymentOrderListParams) = apply {
            afterCursor = paymentOrderListParams.afterCursor
            counterpartyId = paymentOrderListParams.counterpartyId
            createdAtEnd = paymentOrderListParams.createdAtEnd
            createdAtStart = paymentOrderListParams.createdAtStart
            direction = paymentOrderListParams.direction
            effectiveDateEnd = paymentOrderListParams.effectiveDateEnd
            effectiveDateStart = paymentOrderListParams.effectiveDateStart
            metadata = paymentOrderListParams.metadata
            originatingAccountId = paymentOrderListParams.originatingAccountId
            perPage = paymentOrderListParams.perPage
            priority = paymentOrderListParams.priority
            processAfterEnd = paymentOrderListParams.processAfterEnd
            processAfterStart = paymentOrderListParams.processAfterStart
            referenceNumber = paymentOrderListParams.referenceNumber
            status = paymentOrderListParams.status
            transactionId = paymentOrderListParams.transactionId
            type = paymentOrderListParams.type
            additionalHeaders = paymentOrderListParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentOrderListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        /** Alias for calling [Builder.afterCursor] with `afterCursor.orElse(null)`. */
        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.getOrNull())

        fun counterpartyId(counterpartyId: String?) = apply { this.counterpartyId = counterpartyId }

        /** Alias for calling [Builder.counterpartyId] with `counterpartyId.orElse(null)`. */
        fun counterpartyId(counterpartyId: Optional<String>) =
            counterpartyId(counterpartyId.getOrNull())

        /** An inclusive upper bound for searching created_at */
        fun createdAtEnd(createdAtEnd: LocalDate?) = apply { this.createdAtEnd = createdAtEnd }

        /** Alias for calling [Builder.createdAtEnd] with `createdAtEnd.orElse(null)`. */
        fun createdAtEnd(createdAtEnd: Optional<LocalDate>) = createdAtEnd(createdAtEnd.getOrNull())

        /** An inclusive lower bound for searching created_at */
        fun createdAtStart(createdAtStart: LocalDate?) = apply {
            this.createdAtStart = createdAtStart
        }

        /** Alias for calling [Builder.createdAtStart] with `createdAtStart.orElse(null)`. */
        fun createdAtStart(createdAtStart: Optional<LocalDate>) =
            createdAtStart(createdAtStart.getOrNull())

        fun direction(direction: TransactionDirection?) = apply { this.direction = direction }

        /** Alias for calling [Builder.direction] with `direction.orElse(null)`. */
        fun direction(direction: Optional<TransactionDirection>) = direction(direction.getOrNull())

        /** An inclusive upper bound for searching effective_date */
        fun effectiveDateEnd(effectiveDateEnd: LocalDate?) = apply {
            this.effectiveDateEnd = effectiveDateEnd
        }

        /** Alias for calling [Builder.effectiveDateEnd] with `effectiveDateEnd.orElse(null)`. */
        fun effectiveDateEnd(effectiveDateEnd: Optional<LocalDate>) =
            effectiveDateEnd(effectiveDateEnd.getOrNull())

        /** An inclusive lower bound for searching effective_date */
        fun effectiveDateStart(effectiveDateStart: LocalDate?) = apply {
            this.effectiveDateStart = effectiveDateStart
        }

        /**
         * Alias for calling [Builder.effectiveDateStart] with `effectiveDateStart.orElse(null)`.
         */
        fun effectiveDateStart(effectiveDateStart: Optional<LocalDate>) =
            effectiveDateStart(effectiveDateStart.getOrNull())

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        fun originatingAccountId(originatingAccountId: String?) = apply {
            this.originatingAccountId = originatingAccountId
        }

        /**
         * Alias for calling [Builder.originatingAccountId] with
         * `originatingAccountId.orElse(null)`.
         */
        fun originatingAccountId(originatingAccountId: Optional<String>) =
            originatingAccountId(originatingAccountId.getOrNull())

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        /**
         * Alias for [Builder.perPage].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun perPage(perPage: Long) = perPage(perPage as Long?)

        /** Alias for calling [Builder.perPage] with `perPage.orElse(null)`. */
        fun perPage(perPage: Optional<Long>) = perPage(perPage.getOrNull())

        /**
         * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or
         * EFT transfer, respectively. For check payments, `high` can mean an overnight check rather
         * than standard mail.
         */
        fun priority(priority: Priority?) = apply { this.priority = priority }

        /** Alias for calling [Builder.priority] with `priority.orElse(null)`. */
        fun priority(priority: Optional<Priority>) = priority(priority.getOrNull())

        /** An inclusive upper bound for searching process_after */
        fun processAfterEnd(processAfterEnd: OffsetDateTime?) = apply {
            this.processAfterEnd = processAfterEnd
        }

        /** Alias for calling [Builder.processAfterEnd] with `processAfterEnd.orElse(null)`. */
        fun processAfterEnd(processAfterEnd: Optional<OffsetDateTime>) =
            processAfterEnd(processAfterEnd.getOrNull())

        /** An inclusive lower bound for searching process_after */
        fun processAfterStart(processAfterStart: OffsetDateTime?) = apply {
            this.processAfterStart = processAfterStart
        }

        /** Alias for calling [Builder.processAfterStart] with `processAfterStart.orElse(null)`. */
        fun processAfterStart(processAfterStart: Optional<OffsetDateTime>) =
            processAfterStart(processAfterStart.getOrNull())

        /** Query for records with the provided reference number */
        fun referenceNumber(referenceNumber: String?) = apply {
            this.referenceNumber = referenceNumber
        }

        /** Alias for calling [Builder.referenceNumber] with `referenceNumber.orElse(null)`. */
        fun referenceNumber(referenceNumber: Optional<String>) =
            referenceNumber(referenceNumber.getOrNull())

        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /** The ID of a transaction that the payment order has been reconciled to. */
        fun transactionId(transactionId: String?) = apply { this.transactionId = transactionId }

        /** Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`. */
        fun transactionId(transactionId: Optional<String>) =
            transactionId(transactionId.getOrNull())

        fun type(type: Type?) = apply { this.type = type }

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

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

        /**
         * Returns an immutable instance of [PaymentOrderListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
                processAfterEnd,
                processAfterStart,
                referenceNumber,
                status,
                transactionId,
                type,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata private constructor(private val additionalProperties: QueryParams) {

        fun _additionalProperties(): QueryParams = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: QueryParams.Builder = QueryParams.builder()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toBuilder()
            }

            fun additionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, Iterable<String>>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: String) = apply {
                additionalProperties.put(key, value)
            }

            fun putAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.put(key, values)
            }

            fun putAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, Iterable<String>>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun replaceAdditionalProperties(key: String, value: String) = apply {
                additionalProperties.replace(key, value)
            }

            fun replaceAdditionalProperties(key: String, values: Iterable<String>) = apply {
                additionalProperties.replace(key, values)
            }

            fun replaceAllAdditionalProperties(additionalProperties: QueryParams) = apply {
                this.additionalProperties.replaceAll(additionalProperties)
            }

            fun replaceAllAdditionalProperties(
                additionalProperties: Map<String, Iterable<String>>
            ) = apply { this.additionalProperties.replaceAll(additionalProperties) }

            fun removeAdditionalProperties(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                additionalProperties.removeAll(keys)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.build())
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

    /**
     * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH or EFT
     * transfer, respectively. For check payments, `high` can mean an overnight check rather than
     * standard mail.
     */
    class Priority @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val HIGH = of("high")

            @JvmField val NORMAL = of("normal")

            @JvmStatic fun of(value: String) = Priority(JsonField.of(value))
        }

        /** An enum containing [Priority]'s known values. */
        enum class Known {
            HIGH,
            NORMAL,
        }

        /**
         * An enum containing [Priority]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Priority] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HIGH,
            NORMAL,
            /** An enum member indicating that [Priority] was instantiated with an unknown value. */
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
                HIGH -> Value.HIGH
                NORMAL -> Value.NORMAL
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
                HIGH -> Known.HIGH
                NORMAL -> Known.NORMAL
                else -> throw ModernTreasuryInvalidDataException("Unknown Priority: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Priority && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APPROVED = of("approved")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val COMPLETED = of("completed")

            @JvmField val DENIED = of("denied")

            @JvmField val FAILED = of("failed")

            @JvmField val NEEDS_APPROVAL = of("needs_approval")

            @JvmField val PENDING = of("pending")

            @JvmField val PROCESSING = of("processing")

            @JvmField val RETURNED = of("returned")

            @JvmField val REVERSED = of("reversed")

            @JvmField val SENT = of("sent")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
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

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
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
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

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

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
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

        return /* spotless:off */ other is PaymentOrderListParams && afterCursor == other.afterCursor && counterpartyId == other.counterpartyId && createdAtEnd == other.createdAtEnd && createdAtStart == other.createdAtStart && direction == other.direction && effectiveDateEnd == other.effectiveDateEnd && effectiveDateStart == other.effectiveDateStart && metadata == other.metadata && originatingAccountId == other.originatingAccountId && perPage == other.perPage && priority == other.priority && processAfterEnd == other.processAfterEnd && processAfterStart == other.processAfterStart && referenceNumber == other.referenceNumber && status == other.status && transactionId == other.transactionId && type == other.type && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, counterpartyId, createdAtEnd, createdAtStart, direction, effectiveDateEnd, effectiveDateStart, metadata, originatingAccountId, perPage, priority, processAfterEnd, processAfterStart, referenceNumber, status, transactionId, type, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentOrderListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, createdAtEnd=$createdAtEnd, createdAtStart=$createdAtStart, direction=$direction, effectiveDateEnd=$effectiveDateEnd, effectiveDateStart=$effectiveDateStart, metadata=$metadata, originatingAccountId=$originatingAccountId, perPage=$perPage, priority=$priority, processAfterEnd=$processAfterEnd, processAfterStart=$processAfterStart, referenceNumber=$referenceNumber, status=$status, transactionId=$transactionId, type=$type, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
