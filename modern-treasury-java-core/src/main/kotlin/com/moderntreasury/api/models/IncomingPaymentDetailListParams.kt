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
import java.util.Objects
import java.util.Optional

/** Get a list of Incoming Payment Details. */
class IncomingPaymentDetailListParams
private constructor(
    private val afterCursor: String?,
    private val asOfDateEnd: LocalDate?,
    private val asOfDateStart: LocalDate?,
    private val direction: TransactionDirection?,
    private val metadata: Metadata?,
    private val perPage: Long?,
    private val status: Status?,
    private val type: Type?,
    private val virtualAccountId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    /**
     * Filters incoming payment details with an as_of_date starting on or before the specified date
     * (YYYY-MM-DD).
     */
    fun asOfDateEnd(): Optional<LocalDate> = Optional.ofNullable(asOfDateEnd)

    /**
     * Filters incoming payment details with an as_of_date starting on or after the specified date
     * (YYYY-MM-DD).
     */
    fun asOfDateStart(): Optional<LocalDate> = Optional.ofNullable(asOfDateStart)

    /** One of `credit` or `debit`. */
    fun direction(): Optional<TransactionDirection> = Optional.ofNullable(direction)

    /**
     * For example, if you want to query for records with metadata key `Type` and value `Loan`, the
     * query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
     */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    /**
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
     */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
    fun type(): Optional<Type> = Optional.ofNullable(type)

    /** If the incoming payment detail is in a virtual account, the ID of the Virtual Account. */
    fun virtualAccountId(): Optional<String> = Optional.ofNullable(virtualAccountId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.asOfDateEnd?.let { queryParams.put("as_of_date_end", listOf(it.toString())) }
        this.asOfDateStart?.let { queryParams.put("as_of_date_start", listOf(it.toString())) }
        this.direction?.let { queryParams.put("direction", listOf(it.toString())) }
        this.metadata?.forEachQueryParam { key, values ->
            queryParams.put("metadata[$key]", values)
        }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.status?.let { queryParams.put("status", listOf(it.toString())) }
        this.type?.let { queryParams.put("type", listOf(it.toString())) }
        this.virtualAccountId?.let { queryParams.put("virtual_account_id", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IncomingPaymentDetailListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var afterCursor: String? = null
        private var asOfDateEnd: LocalDate? = null
        private var asOfDateStart: LocalDate? = null
        private var direction: TransactionDirection? = null
        private var metadata: Metadata? = null
        private var perPage: Long? = null
        private var status: Status? = null
        private var type: Type? = null
        private var virtualAccountId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(incomingPaymentDetailListParams: IncomingPaymentDetailListParams) =
            apply {
                afterCursor = incomingPaymentDetailListParams.afterCursor
                asOfDateEnd = incomingPaymentDetailListParams.asOfDateEnd
                asOfDateStart = incomingPaymentDetailListParams.asOfDateStart
                direction = incomingPaymentDetailListParams.direction
                metadata = incomingPaymentDetailListParams.metadata
                perPage = incomingPaymentDetailListParams.perPage
                status = incomingPaymentDetailListParams.status
                type = incomingPaymentDetailListParams.type
                virtualAccountId = incomingPaymentDetailListParams.virtualAccountId
                additionalHeaders = incomingPaymentDetailListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    incomingPaymentDetailListParams.additionalQueryParams.toBuilder()
            }

        fun afterCursor(afterCursor: String?) = apply { this.afterCursor = afterCursor }

        fun afterCursor(afterCursor: Optional<String>) = afterCursor(afterCursor.orElse(null))

        /**
         * Filters incoming payment details with an as_of_date starting on or before the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateEnd(asOfDateEnd: LocalDate?) = apply { this.asOfDateEnd = asOfDateEnd }

        /**
         * Filters incoming payment details with an as_of_date starting on or before the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateEnd(asOfDateEnd: Optional<LocalDate>) = asOfDateEnd(asOfDateEnd.orElse(null))

        /**
         * Filters incoming payment details with an as_of_date starting on or after the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateStart(asOfDateStart: LocalDate?) = apply { this.asOfDateStart = asOfDateStart }

        /**
         * Filters incoming payment details with an as_of_date starting on or after the specified
         * date (YYYY-MM-DD).
         */
        fun asOfDateStart(asOfDateStart: Optional<LocalDate>) =
            asOfDateStart(asOfDateStart.orElse(null))

        /** One of `credit` or `debit`. */
        fun direction(direction: TransactionDirection?) = apply { this.direction = direction }

        /** One of `credit` or `debit`. */
        fun direction(direction: Optional<TransactionDirection>) = direction(direction.orElse(null))

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

        /**
         * For example, if you want to query for records with metadata key `Type` and value `Loan`,
         * the query would be `metadata%5BType%5D=Loan`. This encodes the query parameters.
         */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.orElse(null))

        fun perPage(perPage: Long?) = apply { this.perPage = perPage }

        fun perPage(perPage: Long) = perPage(perPage as Long?)

        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun perPage(perPage: Optional<Long>) = perPage(perPage.orElse(null) as Long?)

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        fun status(status: Status?) = apply { this.status = status }

        /**
         * The current status of the incoming payment order. One of `pending`, `completed`, or
         * `returned`.
         */
        fun status(status: Optional<Status>) = status(status.orElse(null))

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: Type?) = apply { this.type = type }

        /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
        fun type(type: Optional<Type>) = type(type.orElse(null))

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: String?) = apply {
            this.virtualAccountId = virtualAccountId
        }

        /**
         * If the incoming payment detail is in a virtual account, the ID of the Virtual Account.
         */
        fun virtualAccountId(virtualAccountId: Optional<String>) =
            virtualAccountId(virtualAccountId.orElse(null))

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

        fun build(): IncomingPaymentDetailListParams =
            IncomingPaymentDetailListParams(
                afterCursor,
                asOfDateEnd,
                asOfDateStart,
                direction,
                metadata,
                perPage,
                status,
                type,
                virtualAccountId,
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
     * The current status of the incoming payment order. One of `pending`, `completed`, or
     * `returned`.
     */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val COMPLETED = of("completed")

            @JvmField val PENDING = of("pending")

            @JvmField val RETURNED = of("returned")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            COMPLETED,
            PENDING,
            RETURNED,
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
            COMPLETED,
            PENDING,
            RETURNED,
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
                COMPLETED -> Value.COMPLETED
                PENDING -> Value.PENDING
                RETURNED -> Value.RETURNED
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
                COMPLETED -> Known.COMPLETED
                PENDING -> Known.PENDING
                RETURNED -> Known.RETURNED
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

    /** One of: `ach`, `book`, `check`, `eft`, `interac`, `rtp`, `sepa`, `signet`, or `wire`. */
    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val BOOK = of("book")

            @JvmField val CHECK = of("check")

            @JvmField val EFT = of("eft")

            @JvmField val INTERAC = of("interac")

            @JvmField val RTP = of("rtp")

            @JvmField val SEPA = of("sepa")

            @JvmField val SIGNET = of("signet")

            @JvmField val WIRE = of("wire")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACH,
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
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
            BOOK,
            CHECK,
            EFT,
            INTERAC,
            RTP,
            SEPA,
            SIGNET,
            WIRE,
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
                BOOK -> Value.BOOK
                CHECK -> Value.CHECK
                EFT -> Value.EFT
                INTERAC -> Value.INTERAC
                RTP -> Value.RTP
                SEPA -> Value.SEPA
                SIGNET -> Value.SIGNET
                WIRE -> Value.WIRE
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
                BOOK -> Known.BOOK
                CHECK -> Known.CHECK
                EFT -> Known.EFT
                INTERAC -> Known.INTERAC
                RTP -> Known.RTP
                SEPA -> Known.SEPA
                SIGNET -> Known.SIGNET
                WIRE -> Known.WIRE
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

        return /* spotless:off */ other is IncomingPaymentDetailListParams && afterCursor == other.afterCursor && asOfDateEnd == other.asOfDateEnd && asOfDateStart == other.asOfDateStart && direction == other.direction && metadata == other.metadata && perPage == other.perPage && status == other.status && type == other.type && virtualAccountId == other.virtualAccountId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, asOfDateEnd, asOfDateStart, direction, metadata, perPage, status, type, virtualAccountId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "IncomingPaymentDetailListParams{afterCursor=$afterCursor, asOfDateEnd=$asOfDateEnd, asOfDateStart=$asOfDateStart, direction=$direction, metadata=$metadata, perPage=$perPage, status=$status, type=$type, virtualAccountId=$virtualAccountId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
