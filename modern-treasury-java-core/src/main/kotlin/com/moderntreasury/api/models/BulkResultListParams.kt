// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.models.*
import java.util.Objects
import java.util.Optional

class BulkResultListParams
constructor(
    private val afterCursor: String?,
    private val entityId: String?,
    private val entityType: EntityType?,
    private val perPage: Long?,
    private val requestId: String?,
    private val requestType: RequestType?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun afterCursor(): Optional<String> = Optional.ofNullable(afterCursor)

    fun entityId(): Optional<String> = Optional.ofNullable(entityId)

    fun entityType(): Optional<EntityType> = Optional.ofNullable(entityType)

    fun perPage(): Optional<Long> = Optional.ofNullable(perPage)

    fun requestId(): Optional<String> = Optional.ofNullable(requestId)

    fun requestType(): Optional<RequestType> = Optional.ofNullable(requestType)

    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic
    internal fun getQueryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.afterCursor?.let { queryParams.put("after_cursor", listOf(it.toString())) }
        this.entityId?.let { queryParams.put("entity_id", listOf(it.toString())) }
        this.entityType?.let { queryParams.put("entity_type", listOf(it.toString())) }
        this.perPage?.let { queryParams.put("per_page", listOf(it.toString())) }
        this.requestId?.let { queryParams.put("request_id", listOf(it.toString())) }
        this.requestType?.let { queryParams.put("request_type", listOf(it.toString())) }
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
        private var entityId: String? = null
        private var entityType: EntityType? = null
        private var perPage: Long? = null
        private var requestId: String? = null
        private var requestType: RequestType? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bulkResultListParams: BulkResultListParams) = apply {
            afterCursor = bulkResultListParams.afterCursor
            entityId = bulkResultListParams.entityId
            entityType = bulkResultListParams.entityType
            perPage = bulkResultListParams.perPage
            requestId = bulkResultListParams.requestId
            requestType = bulkResultListParams.requestType
            status = bulkResultListParams.status
            additionalHeaders = bulkResultListParams.additionalHeaders.toBuilder()
            additionalQueryParams = bulkResultListParams.additionalQueryParams.toBuilder()
        }

        fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

        /** Unique identifier for the result entity object. */
        fun entityId(entityId: String) = apply { this.entityId = entityId }

        /**
         * The type of the request that created this result. bulk_request is the only supported
         * `request_type`
         */
        fun entityType(entityType: EntityType) = apply { this.entityType = entityType }

        fun perPage(perPage: Long) = apply { this.perPage = perPage }

        /**
         * Unique identifier for the request that created this bulk result. This is the ID of the
         * bulk request when `request_type` is bulk_request
         */
        fun requestId(requestId: String) = apply { this.requestId = requestId }

        /**
         * The type of the request that created this result. bulk_request is the only supported
         * `request_type`
         */
        fun requestType(requestType: RequestType) = apply { this.requestType = requestType }

        /** One of successful or failed. */
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

        fun build(): BulkResultListParams =
            BulkResultListParams(
                afterCursor,
                entityId,
                entityType,
                perPage,
                requestId,
                requestType,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class EntityType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val LEDGER_TRANSACTION = of("ledger_transaction")

            @JvmField val TRANSACTION = of("transaction")

            @JvmField val EXPECTED_PAYMENT = of("expected_payment")

            @JvmField val BULK_ERROR = of("bulk_error")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
            BULK_ERROR,
        }

        enum class Value {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
            BULK_ERROR,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Value.LEDGER_TRANSACTION
                TRANSACTION -> Value.TRANSACTION
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                BULK_ERROR -> Value.BULK_ERROR
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Known.LEDGER_TRANSACTION
                TRANSACTION -> Known.TRANSACTION
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                BULK_ERROR -> Known.BULK_ERROR
                else -> throw ModernTreasuryInvalidDataException("Unknown EntityType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is EntityType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RequestType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BULK_REQUEST = of("bulk_request")

            @JvmStatic fun of(value: String) = RequestType(JsonField.of(value))
        }

        enum class Known {
            BULK_REQUEST,
        }

        enum class Value {
            BULK_REQUEST,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BULK_REQUEST -> Value.BULK_REQUEST
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BULK_REQUEST -> Known.BULK_REQUEST
                else -> throw ModernTreasuryInvalidDataException("Unknown RequestType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RequestType && value == other.value /* spotless:on */
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

            @JvmField val PENDING = of("pending")

            @JvmField val SUCCESSFUL = of("successful")

            @JvmField val FAILED = of("failed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            SUCCESSFUL,
            FAILED,
        }

        enum class Value {
            PENDING,
            SUCCESSFUL,
            FAILED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                SUCCESSFUL -> Value.SUCCESSFUL
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                SUCCESSFUL -> Known.SUCCESSFUL
                FAILED -> Known.FAILED
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

        return /* spotless:off */ other is BulkResultListParams && afterCursor == other.afterCursor && entityId == other.entityId && entityType == other.entityType && perPage == other.perPage && requestId == other.requestId && requestType == other.requestType && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(afterCursor, entityId, entityType, perPage, requestId, requestType, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BulkResultListParams{afterCursor=$afterCursor, entityId=$entityId, entityType=$entityType, perPage=$perPage, requestId=$requestId, requestType=$requestType, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
