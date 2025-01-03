// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class InvoiceListParams
constructor(
    private val afterCursor: String?,
    private val counterpartyId: String?,
    private val dueDateEnd: LocalDate?,
    private val dueDateStart: LocalDate?,
    private val expectedPaymentId: String?,
    private val metadata: Metadata?,
    private val number: String?,
    private val originatingAccountId: String?,
    private val paymentOrderId: String?,
    private val perPage: Long?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

    /** An inclusive upper bound for searching due_date */
    fun dueDateEnd(): Optional<LocalDate> = Optional.ofNullable(dueDateEnd)

    /** An inclusive lower bound for searching due_date */
    fun dueDateStart(): Optional<LocalDate> = Optional.ofNullable(dueDateStart)

    fun expectedPaymentId(): Optional<String> = Optional.ofNullable(expectedPaymentId)

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    /** A unique record number assigned to each invoice that is issued. */
    fun number(): Optional<String> = Optional.ofNullable(number)

    fun originatingAccountId(): Optional<String> = Optional.ofNullable(originatingAccountId)

    fun paymentOrderId(): Optional<String> = Optional.ofNullable(paymentOrderId)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.counterpartyId?.let { queryParams.put("counterparty_id", listOf(it.toString())) }
        this.dueDateEnd?.let { queryParams.put("due_date_end", listOf(it.toString())) }
        this.dueDateStart?.let { queryParams.put("due_date_start", listOf(it.toString())) }
        this.expectedPaymentId?.let {
            queryParams.put("expected_payment_id", listOf(it.toString()))
        }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.number?.let { queryParams.put("number", listOf(it.toString())) }
        this.originatingAccountId?.let {
            queryParams.put("originating_account_id", listOf(it.toString()))
        }
        this.paymentOrderId?.let { queryParams.put("payment_order_id", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var afterCursor: String? = null
        private var counterpartyId: String? = null
        private var dueDateEnd: LocalDate? = null
        private var dueDateStart: LocalDate? = null
        private var expectedPaymentId: String? = null
        private var metadata: Metadata? = null
        private var number: String? = null
        private var originatingAccountId: String? = null
        private var paymentOrderId: String? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceListParams: InvoiceListParams) = apply {
            afterCursor = invoiceListParams.afterCursor
            counterpartyId = invoiceListParams.counterpartyId
            dueDateEnd = invoiceListParams.dueDateEnd
            dueDateStart = invoiceListParams.dueDateStart
            expectedPaymentId = invoiceListParams.expectedPaymentId
            metadata = invoiceListParams.metadata
            number = invoiceListParams.number
            originatingAccountId = invoiceListParams.originatingAccountId
            paymentOrderId = invoiceListParams.paymentOrderId
            perPage = invoiceListParams.perPage
            status = invoiceListParams.status
            additionalHeaders = invoiceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        fun counterpartyId(counterpartyId: String) = apply { this.counterpartyId = counterpartyId }

        /** An inclusive upper bound for searching due_date */
        fun dueDateEnd(dueDateEnd: LocalDate) = apply { this.dueDateEnd = dueDateEnd }

        /** An inclusive lower bound for searching due_date */
        fun dueDateStart(dueDateStart: LocalDate) = apply { this.dueDateStart = dueDateStart }

        fun expectedPaymentId(expectedPaymentId: String) = apply {
            this.expectedPaymentId = expectedPaymentId
        }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** A unique record number assigned to each invoice that is issued. */
        fun number(number: String) = apply { this.number = number }

        fun originatingAccountId(originatingAccountId: String) = apply {
            this.originatingAccountId = originatingAccountId
        }

        fun paymentOrderId(paymentOrderId: String) = apply { this.paymentOrderId = paymentOrderId }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        fun status(status: Status) = apply { this.status = status }

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

        fun build(): InvoiceListParams =
            InvoiceListParams(
                afterCursor,
                counterpartyId,
                dueDateEnd,
                dueDateStart,
                expectedPaymentId,
                metadata,
                number,
                originatingAccountId,
                paymentOrderId,
                perPage,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    class Metadata
    private constructor(
        private val additionalProperties: QueryParams,
    ) {

        fun _additionalProperties(): QueryParams = additionalProperties

        @JvmSynthetic
        internal fun forEachQueryParam(putParam: (String, List<String>) -> Unit) {
            additionalProperties.keys().forEach { putParam(it, additionalProperties.values(it)) }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DRAFT = of("draft")

            @JvmField val PAID = of("paid")

            @JvmField val PARTIALLY_PAID = of("partially_paid")

            @JvmField val PAYMENT_PENDING = of("payment_pending")

            @JvmField val UNPAID = of("unpaid")

            @JvmField val VOIDED = of("voided")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
        }

        enum class Value {
            DRAFT,
            PAID,
            PARTIALLY_PAID,
            PAYMENT_PENDING,
            UNPAID,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                PAID -> Value.PAID
                PARTIALLY_PAID -> Value.PARTIALLY_PAID
                PAYMENT_PENDING -> Value.PAYMENT_PENDING
                UNPAID -> Value.UNPAID
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                PAID -> Known.PAID
                PARTIALLY_PAID -> Known.PARTIALLY_PAID
                PAYMENT_PENDING -> Known.PAYMENT_PENDING
                UNPAID -> Known.UNPAID
                VOIDED -> Known.VOIDED
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

        return /* spotless:off */ other is InvoiceListParams && afterCursor == other.afterCursor && counterpartyId == other.counterpartyId && dueDateEnd == other.dueDateEnd && dueDateStart == other.dueDateStart && expectedPaymentId == other.expectedPaymentId && metadata == other.metadata && number == other.number && originatingAccountId == other.originatingAccountId && paymentOrderId == other.paymentOrderId && perPage == other.perPage && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, counterpartyId, dueDateEnd, dueDateStart, expectedPaymentId, metadata, number, originatingAccountId, paymentOrderId, perPage, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceListParams{afterCursor=$afterCursor, counterpartyId=$counterpartyId, dueDateEnd=$dueDateEnd, dueDateStart=$dueDateStart, expectedPaymentId=$expectedPaymentId, metadata=$metadata, number=$number, originatingAccountId=$originatingAccountId, paymentOrderId=$paymentOrderId, perPage=$perPage, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
