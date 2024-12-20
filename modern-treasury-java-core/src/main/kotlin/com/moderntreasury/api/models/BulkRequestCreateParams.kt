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
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class BulkRequestCreateParams
constructor(
    private val actionType: ActionType,
    private val resourceType: ResourceType,
    private val resources: List<Resource>,
    private val metadata: Metadata?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun actionType(): ActionType = actionType

    fun resourceType(): ResourceType = resourceType

    fun resources(): List<Resource> = resources

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): BulkRequestCreateBody {
        return BulkRequestCreateBody(
            actionType,
            resourceType,
            resources,
            metadata,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = BulkRequestCreateBody.Builder::class)
    @NoAutoDetect
    class BulkRequestCreateBody
    internal constructor(
        private val actionType: ActionType,
        private val resourceType: ResourceType,
        private val resources: List<Resource>,
        private val metadata: Metadata?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** One of create, or update. */
        @JsonProperty("action_type") fun actionType(): ActionType = actionType

        /** One of payment_order, expected_payment, or ledger_transaction. */
        @JsonProperty("resource_type") fun resourceType(): ResourceType = resourceType

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        @JsonProperty("resources") fun resources(): List<Resource> = resources

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var actionType: ActionType? = null
            private var resourceType: ResourceType? = null
            private var resources: List<Resource>? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bulkRequestCreateBody: BulkRequestCreateBody) = apply {
                actionType = bulkRequestCreateBody.actionType
                resourceType = bulkRequestCreateBody.resourceType
                resources = bulkRequestCreateBody.resources.toMutableList()
                metadata = bulkRequestCreateBody.metadata
                additionalProperties = bulkRequestCreateBody.additionalProperties.toMutableMap()
            }

            /** One of create, or update. */
            @JsonProperty("action_type")
            fun actionType(actionType: ActionType) = apply { this.actionType = actionType }

            /** One of payment_order, expected_payment, or ledger_transaction. */
            @JsonProperty("resource_type")
            fun resourceType(resourceType: ResourceType) = apply {
                this.resourceType = resourceType
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            @JsonProperty("resources")
            fun resources(resources: List<Resource>) = apply { this.resources = resources }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

            fun build(): BulkRequestCreateBody =
                BulkRequestCreateBody(
                    checkNotNull(actionType) { "`actionType` is required but was not set" },
                    checkNotNull(resourceType) { "`resourceType` is required but was not set" },
                    checkNotNull(resources) { "`resources` is required but was not set" }
                        .toImmutable(),
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BulkRequestCreateBody && actionType == other.actionType && resourceType == other.resourceType && resources == other.resources && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(actionType, resourceType, resources, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BulkRequestCreateBody{actionType=$actionType, resourceType=$resourceType, resources=$resources, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var actionType: ActionType? = null
        private var resourceType: ResourceType? = null
        private var resources: MutableList<Resource> = mutableListOf()
        private var metadata: Metadata? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkRequestCreateParams: BulkRequestCreateParams) = apply {
            actionType = bulkRequestCreateParams.actionType
            resourceType = bulkRequestCreateParams.resourceType
            resources = bulkRequestCreateParams.resources.toMutableList()
            metadata = bulkRequestCreateParams.metadata
            additionalHeaders = bulkRequestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bulkRequestCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                bulkRequestCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = apply { this.actionType = actionType }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = apply { this.resourceType = resourceType }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun resources(resources: List<Resource>) = apply {
            this.resources.clear()
            this.resources.addAll(resources)
        }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(resource: Resource) = apply { this.resources.add(resource) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): BulkRequestCreateParams =
            BulkRequestCreateParams(
                checkNotNull(actionType) { "`actionType` is required but was not set" },
                checkNotNull(resourceType) { "`resourceType` is required but was not set" },
                resources.toImmutable(),
                metadata,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class ActionType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREATE = of("create")

            @JvmField val UPDATE = of("update")

            @JvmField val DELETE = of("delete")

            @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
        }

        enum class Known {
            CREATE,
            UPDATE,
            DELETE,
        }

        enum class Value {
            CREATE,
            UPDATE,
            DELETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREATE -> Value.CREATE
                UPDATE -> Value.UPDATE
                DELETE -> Value.DELETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREATE -> Known.CREATE
                UPDATE -> Known.UPDATE
                DELETE -> Known.DELETE
                else -> throw ModernTreasuryInvalidDataException("Unknown ActionType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ActionType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ResourceType
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

            @JvmStatic fun of(value: String) = ResourceType(JsonField.of(value))
        }

        enum class Known {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
        }

        enum class Value {
            PAYMENT_ORDER,
            LEDGER_TRANSACTION,
            TRANSACTION,
            EXPECTED_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Value.LEDGER_TRANSACTION
                TRANSACTION -> Value.TRANSACTION
                EXPECTED_PAYMENT -> Value.EXPECTED_PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                LEDGER_TRANSACTION -> Known.LEDGER_TRANSACTION
                TRANSACTION -> Known.TRANSACTION
                EXPECTED_PAYMENT -> Known.EXPECTED_PAYMENT
                else -> throw ModernTreasuryInvalidDataException("Unknown ResourceType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResourceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(using = Resource.Deserializer::class)
    @JsonSerialize(using = Resource.Serializer::class)
    class Resource
    private constructor(
        private val paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest? = null,
        private val expectedPaymentCreateRequest: ExpectedPaymentCreateRequest? = null,
        private val ledgerTransactionCreateRequest: LedgerTransactionCreateRequest? = null,
        private val transactionCreateRequest: TransactionCreateRequest? = null,
        private val id: Id? = null,
        private val paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId? = null,
        private val expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId? = null,
        private val transactionUpdateRequestWithId: TransactionUpdateRequestWithId? = null,
        private val ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun paymentOrderAsyncCreateRequest(): Optional<PaymentOrderAsyncCreateRequest> =
            Optional.ofNullable(paymentOrderAsyncCreateRequest)

        fun expectedPaymentCreateRequest(): Optional<ExpectedPaymentCreateRequest> =
            Optional.ofNullable(expectedPaymentCreateRequest)

        fun ledgerTransactionCreateRequest(): Optional<LedgerTransactionCreateRequest> =
            Optional.ofNullable(ledgerTransactionCreateRequest)

        fun transactionCreateRequest(): Optional<TransactionCreateRequest> =
            Optional.ofNullable(transactionCreateRequest)

        fun id(): Optional<Id> = Optional.ofNullable(id)

        fun paymentOrderUpdateRequestWithId(): Optional<PaymentOrderUpdateRequestWithId> =
            Optional.ofNullable(paymentOrderUpdateRequestWithId)

        fun expectedPaymentUpdateRequestWithId(): Optional<ExpectedPaymentUpdateRequestWithId> =
            Optional.ofNullable(expectedPaymentUpdateRequestWithId)

        fun transactionUpdateRequestWithId(): Optional<TransactionUpdateRequestWithId> =
            Optional.ofNullable(transactionUpdateRequestWithId)

        fun ledgerTransactionUpdateRequestWithId(): Optional<LedgerTransactionUpdateRequestWithId> =
            Optional.ofNullable(ledgerTransactionUpdateRequestWithId)

        fun isPaymentOrderAsyncCreateRequest(): Boolean = paymentOrderAsyncCreateRequest != null

        fun isExpectedPaymentCreateRequest(): Boolean = expectedPaymentCreateRequest != null

        fun isLedgerTransactionCreateRequest(): Boolean = ledgerTransactionCreateRequest != null

        fun isTransactionCreateRequest(): Boolean = transactionCreateRequest != null

        fun isId(): Boolean = id != null

        fun isPaymentOrderUpdateRequestWithId(): Boolean = paymentOrderUpdateRequestWithId != null

        fun isExpectedPaymentUpdateRequestWithId(): Boolean =
            expectedPaymentUpdateRequestWithId != null

        fun isTransactionUpdateRequestWithId(): Boolean = transactionUpdateRequestWithId != null

        fun isLedgerTransactionUpdateRequestWithId(): Boolean =
            ledgerTransactionUpdateRequestWithId != null

        fun asPaymentOrderAsyncCreateRequest(): PaymentOrderAsyncCreateRequest =
            paymentOrderAsyncCreateRequest.getOrThrow("paymentOrderAsyncCreateRequest")

        fun asExpectedPaymentCreateRequest(): ExpectedPaymentCreateRequest =
            expectedPaymentCreateRequest.getOrThrow("expectedPaymentCreateRequest")

        fun asLedgerTransactionCreateRequest(): LedgerTransactionCreateRequest =
            ledgerTransactionCreateRequest.getOrThrow("ledgerTransactionCreateRequest")

        fun asTransactionCreateRequest(): TransactionCreateRequest =
            transactionCreateRequest.getOrThrow("transactionCreateRequest")

        fun asId(): Id = id.getOrThrow("id")

        fun asPaymentOrderUpdateRequestWithId(): PaymentOrderUpdateRequestWithId =
            paymentOrderUpdateRequestWithId.getOrThrow("paymentOrderUpdateRequestWithId")

        fun asExpectedPaymentUpdateRequestWithId(): ExpectedPaymentUpdateRequestWithId =
            expectedPaymentUpdateRequestWithId.getOrThrow("expectedPaymentUpdateRequestWithId")

        fun asTransactionUpdateRequestWithId(): TransactionUpdateRequestWithId =
            transactionUpdateRequestWithId.getOrThrow("transactionUpdateRequestWithId")

        fun asLedgerTransactionUpdateRequestWithId(): LedgerTransactionUpdateRequestWithId =
            ledgerTransactionUpdateRequestWithId.getOrThrow("ledgerTransactionUpdateRequestWithId")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                paymentOrderAsyncCreateRequest != null ->
                    visitor.visitPaymentOrderAsyncCreateRequest(paymentOrderAsyncCreateRequest)
                expectedPaymentCreateRequest != null ->
                    visitor.visitExpectedPaymentCreateRequest(expectedPaymentCreateRequest)
                ledgerTransactionCreateRequest != null ->
                    visitor.visitLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)
                transactionCreateRequest != null ->
                    visitor.visitTransactionCreateRequest(transactionCreateRequest)
                id != null -> visitor.visitId(id)
                paymentOrderUpdateRequestWithId != null ->
                    visitor.visitPaymentOrderUpdateRequestWithId(paymentOrderUpdateRequestWithId)
                expectedPaymentUpdateRequestWithId != null ->
                    visitor.visitExpectedPaymentUpdateRequestWithId(
                        expectedPaymentUpdateRequestWithId
                    )
                transactionUpdateRequestWithId != null ->
                    visitor.visitTransactionUpdateRequestWithId(transactionUpdateRequestWithId)
                ledgerTransactionUpdateRequestWithId != null ->
                    visitor.visitLedgerTransactionUpdateRequestWithId(
                        ledgerTransactionUpdateRequestWithId
                    )
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Resource && paymentOrderAsyncCreateRequest == other.paymentOrderAsyncCreateRequest && expectedPaymentCreateRequest == other.expectedPaymentCreateRequest && ledgerTransactionCreateRequest == other.ledgerTransactionCreateRequest && transactionCreateRequest == other.transactionCreateRequest && id == other.id && paymentOrderUpdateRequestWithId == other.paymentOrderUpdateRequestWithId && expectedPaymentUpdateRequestWithId == other.expectedPaymentUpdateRequestWithId && transactionUpdateRequestWithId == other.transactionUpdateRequestWithId && ledgerTransactionUpdateRequestWithId == other.ledgerTransactionUpdateRequestWithId /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentOrderAsyncCreateRequest, expectedPaymentCreateRequest, ledgerTransactionCreateRequest, transactionCreateRequest, id, paymentOrderUpdateRequestWithId, expectedPaymentUpdateRequestWithId, transactionUpdateRequestWithId, ledgerTransactionUpdateRequestWithId) /* spotless:on */

        override fun toString(): String =
            when {
                paymentOrderAsyncCreateRequest != null ->
                    "Resource{paymentOrderAsyncCreateRequest=$paymentOrderAsyncCreateRequest}"
                expectedPaymentCreateRequest != null ->
                    "Resource{expectedPaymentCreateRequest=$expectedPaymentCreateRequest}"
                ledgerTransactionCreateRequest != null ->
                    "Resource{ledgerTransactionCreateRequest=$ledgerTransactionCreateRequest}"
                transactionCreateRequest != null ->
                    "Resource{transactionCreateRequest=$transactionCreateRequest}"
                id != null -> "Resource{id=$id}"
                paymentOrderUpdateRequestWithId != null ->
                    "Resource{paymentOrderUpdateRequestWithId=$paymentOrderUpdateRequestWithId}"
                expectedPaymentUpdateRequestWithId != null ->
                    "Resource{expectedPaymentUpdateRequestWithId=$expectedPaymentUpdateRequestWithId}"
                transactionUpdateRequestWithId != null ->
                    "Resource{transactionUpdateRequestWithId=$transactionUpdateRequestWithId}"
                ledgerTransactionUpdateRequestWithId != null ->
                    "Resource{ledgerTransactionUpdateRequestWithId=$ledgerTransactionUpdateRequestWithId}"
                _json != null -> "Resource{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Resource")
            }

        companion object {

            @JvmStatic
            fun ofPaymentOrderAsyncCreateRequest(
                paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest
            ) = Resource(paymentOrderAsyncCreateRequest = paymentOrderAsyncCreateRequest)

            @JvmStatic
            fun ofExpectedPaymentCreateRequest(
                expectedPaymentCreateRequest: ExpectedPaymentCreateRequest
            ) = Resource(expectedPaymentCreateRequest = expectedPaymentCreateRequest)

            @JvmStatic
            fun ofLedgerTransactionCreateRequest(
                ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
            ) = Resource(ledgerTransactionCreateRequest = ledgerTransactionCreateRequest)

            @JvmStatic
            fun ofTransactionCreateRequest(transactionCreateRequest: TransactionCreateRequest) =
                Resource(transactionCreateRequest = transactionCreateRequest)

            @JvmStatic fun ofId(id: Id) = Resource(id = id)

            @JvmStatic
            fun ofPaymentOrderUpdateRequestWithId(
                paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
            ) = Resource(paymentOrderUpdateRequestWithId = paymentOrderUpdateRequestWithId)

            @JvmStatic
            fun ofExpectedPaymentUpdateRequestWithId(
                expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
            ) = Resource(expectedPaymentUpdateRequestWithId = expectedPaymentUpdateRequestWithId)

            @JvmStatic
            fun ofTransactionUpdateRequestWithId(
                transactionUpdateRequestWithId: TransactionUpdateRequestWithId
            ) = Resource(transactionUpdateRequestWithId = transactionUpdateRequestWithId)

            @JvmStatic
            fun ofLedgerTransactionUpdateRequestWithId(
                ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
            ) =
                Resource(
                    ledgerTransactionUpdateRequestWithId = ledgerTransactionUpdateRequestWithId
                )
        }

        interface Visitor<out T> {

            fun visitPaymentOrderAsyncCreateRequest(
                paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest
            ): T

            fun visitExpectedPaymentCreateRequest(
                expectedPaymentCreateRequest: ExpectedPaymentCreateRequest
            ): T

            fun visitLedgerTransactionCreateRequest(
                ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
            ): T

            fun visitTransactionCreateRequest(transactionCreateRequest: TransactionCreateRequest): T

            fun visitId(id: Id): T

            fun visitPaymentOrderUpdateRequestWithId(
                paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
            ): T

            fun visitExpectedPaymentUpdateRequestWithId(
                expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
            ): T

            fun visitTransactionUpdateRequestWithId(
                transactionUpdateRequestWithId: TransactionUpdateRequestWithId
            ): T

            fun visitLedgerTransactionUpdateRequestWithId(
                ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
            ): T

            fun unknown(json: JsonValue?): T {
                throw ModernTreasuryInvalidDataException("Unknown Resource: $json")
            }
        }

        class Deserializer : BaseDeserializer<Resource>(Resource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Resource {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<PaymentOrderAsyncCreateRequest>())?.let {
                    return Resource(paymentOrderAsyncCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentCreateRequest>())?.let {
                    return Resource(expectedPaymentCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionCreateRequest>())?.let {
                    return Resource(ledgerTransactionCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<TransactionCreateRequest>())?.let {
                    return Resource(transactionCreateRequest = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Id>())?.let {
                    return Resource(id = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<PaymentOrderUpdateRequestWithId>())?.let {
                    return Resource(paymentOrderUpdateRequestWithId = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentUpdateRequestWithId>())?.let {
                    return Resource(expectedPaymentUpdateRequestWithId = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<TransactionUpdateRequestWithId>())?.let {
                    return Resource(transactionUpdateRequestWithId = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionUpdateRequestWithId>())?.let {
                    return Resource(ledgerTransactionUpdateRequestWithId = it, _json = json)
                }

                return Resource(_json = json)
            }
        }

        class Serializer : BaseSerializer<Resource>(Resource::class) {

            override fun serialize(
                value: Resource,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.paymentOrderAsyncCreateRequest != null ->
                        generator.writeObject(value.paymentOrderAsyncCreateRequest)
                    value.expectedPaymentCreateRequest != null ->
                        generator.writeObject(value.expectedPaymentCreateRequest)
                    value.ledgerTransactionCreateRequest != null ->
                        generator.writeObject(value.ledgerTransactionCreateRequest)
                    value.transactionCreateRequest != null ->
                        generator.writeObject(value.transactionCreateRequest)
                    value.id != null -> generator.writeObject(value.id)
                    value.paymentOrderUpdateRequestWithId != null ->
                        generator.writeObject(value.paymentOrderUpdateRequestWithId)
                    value.expectedPaymentUpdateRequestWithId != null ->
                        generator.writeObject(value.expectedPaymentUpdateRequestWithId)
                    value.transactionUpdateRequestWithId != null ->
                        generator.writeObject(value.transactionUpdateRequestWithId)
                    value.ledgerTransactionUpdateRequestWithId != null ->
                        generator.writeObject(value.ledgerTransactionUpdateRequestWithId)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Resource")
                }
            }
        }

        @JsonDeserialize(builder = PaymentOrderAsyncCreateRequest.Builder::class)
        @NoAutoDetect
        class PaymentOrderAsyncCreateRequest
        private constructor(
            private val type: PaymentOrderType,
            private val subtype: PaymentOrderSubtype?,
            private val amount: Long,
            private val direction: Direction,
            private val priority: Priority?,
            private val originatingAccountId: String,
            private val receivingAccountId: String?,
            private val accounting: Accounting?,
            private val accountingCategoryId: String?,
            private val accountingLedgerClassId: String?,
            private val currency: Currency?,
            private val effectiveDate: LocalDate?,
            private val description: String?,
            private val statementDescriptor: String?,
            private val remittanceInformation: String?,
            private val processAfter: OffsetDateTime?,
            private val purpose: String?,
            private val metadata: Metadata?,
            private val chargeBearer: ChargeBearer?,
            private val foreignExchangeIndicator: ForeignExchangeIndicator?,
            private val foreignExchangeContract: String?,
            private val nsfProtected: Boolean?,
            private val originatingPartyName: String?,
            private val ultimateOriginatingPartyName: String?,
            private val ultimateOriginatingPartyIdentifier: String?,
            private val ultimateReceivingPartyName: String?,
            private val ultimateReceivingPartyIdentifier: String?,
            private val sendRemittanceAdvice: Boolean?,
            private val expiresAt: OffsetDateTime?,
            private val fallbackType: FallbackType?,
            private val receivingAccount: ReceivingAccount?,
            private val ledgerTransaction: LedgerTransactionCreateRequest?,
            private val ledgerTransactionId: String?,
            private val lineItems: List<LineItemRequest>?,
            private val transactionMonitoringEnabled: Boolean?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") fun type(): PaymentOrderType = type

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype")
            fun subtype(): Optional<PaymentOrderSubtype> = Optional.ofNullable(subtype)

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") fun amount(): Long = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction") fun direction(): Direction = direction

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority")
            fun priority(): Optional<Priority> = Optional.ofNullable(priority)

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(): String = originatingAccountId

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(): Optional<String> = Optional.ofNullable(receivingAccountId)

            @JsonProperty("accounting")
            fun accounting(): Optional<Accounting> = Optional.ofNullable(accounting)

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(): Optional<String> = Optional.ofNullable(accountingCategoryId)

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            fun accountingLedgerClassId(): Optional<String> =
                Optional.ofNullable(accountingLedgerClassId)

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(): Optional<Currency> = Optional.ofNullable(currency)

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(): Optional<String> = Optional.ofNullable(description)

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): Optional<String> = Optional.ofNullable(statementDescriptor)

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation)

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after")
            fun processAfter(): Optional<OffsetDateTime> = Optional.ofNullable(processAfter)

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            @JsonProperty("purpose") fun purpose(): Optional<String> = Optional.ofNullable(purpose)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer")
            fun chargeBearer(): Optional<ChargeBearer> = Optional.ofNullable(chargeBearer)

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            fun foreignExchangeIndicator(): Optional<ForeignExchangeIndicator> =
                Optional.ofNullable(foreignExchangeIndicator)

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            fun foreignExchangeContract(): Optional<String> =
                Optional.ofNullable(foreignExchangeContract)

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected")
            fun nsfProtected(): Optional<Boolean> = Optional.ofNullable(nsfProtected)

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            fun originatingPartyName(): Optional<String> = Optional.ofNullable(originatingPartyName)

            /** Name of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_name")
            fun ultimateOriginatingPartyName(): Optional<String> =
                Optional.ofNullable(ultimateOriginatingPartyName)

            /** Identifier of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_identifier")
            fun ultimateOriginatingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(ultimateOriginatingPartyIdentifier)

            /** Name of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_name")
            fun ultimateReceivingPartyName(): Optional<String> =
                Optional.ofNullable(ultimateReceivingPartyName)

            /** Identifier of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_identifier")
            fun ultimateReceivingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(ultimateReceivingPartyIdentifier)

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(): Optional<Boolean> =
                Optional.ofNullable(sendRemittanceAdvice)

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at")
            fun expiresAt(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAt)

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            fun fallbackType(): Optional<FallbackType> = Optional.ofNullable(fallbackType)

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            fun receivingAccount(): Optional<ReceivingAccount> =
                Optional.ofNullable(receivingAccount)

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @JsonProperty("ledger_transaction")
            fun ledgerTransaction(): Optional<LedgerTransactionCreateRequest> =
                Optional.ofNullable(ledgerTransaction)

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            fun ledgerTransactionId(): Optional<String> = Optional.ofNullable(ledgerTransactionId)

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items")
            fun lineItems(): Optional<List<LineItemRequest>> = Optional.ofNullable(lineItems)

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            @JsonProperty("transaction_monitoring_enabled")
            fun transactionMonitoringEnabled(): Optional<Boolean> =
                Optional.ofNullable(transactionMonitoringEnabled)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: PaymentOrderType? = null
                private var subtype: PaymentOrderSubtype? = null
                private var amount: Long? = null
                private var direction: Direction? = null
                private var priority: Priority? = null
                private var originatingAccountId: String? = null
                private var receivingAccountId: String? = null
                private var accounting: Accounting? = null
                private var accountingCategoryId: String? = null
                private var accountingLedgerClassId: String? = null
                private var currency: Currency? = null
                private var effectiveDate: LocalDate? = null
                private var description: String? = null
                private var statementDescriptor: String? = null
                private var remittanceInformation: String? = null
                private var processAfter: OffsetDateTime? = null
                private var purpose: String? = null
                private var metadata: Metadata? = null
                private var chargeBearer: ChargeBearer? = null
                private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
                private var foreignExchangeContract: String? = null
                private var nsfProtected: Boolean? = null
                private var originatingPartyName: String? = null
                private var ultimateOriginatingPartyName: String? = null
                private var ultimateOriginatingPartyIdentifier: String? = null
                private var ultimateReceivingPartyName: String? = null
                private var ultimateReceivingPartyIdentifier: String? = null
                private var sendRemittanceAdvice: Boolean? = null
                private var expiresAt: OffsetDateTime? = null
                private var fallbackType: FallbackType? = null
                private var receivingAccount: ReceivingAccount? = null
                private var ledgerTransaction: LedgerTransactionCreateRequest? = null
                private var ledgerTransactionId: String? = null
                private var lineItems: List<LineItemRequest>? = null
                private var transactionMonitoringEnabled: Boolean? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest) =
                    apply {
                        type = paymentOrderAsyncCreateRequest.type
                        subtype = paymentOrderAsyncCreateRequest.subtype
                        amount = paymentOrderAsyncCreateRequest.amount
                        direction = paymentOrderAsyncCreateRequest.direction
                        priority = paymentOrderAsyncCreateRequest.priority
                        originatingAccountId = paymentOrderAsyncCreateRequest.originatingAccountId
                        receivingAccountId = paymentOrderAsyncCreateRequest.receivingAccountId
                        accounting = paymentOrderAsyncCreateRequest.accounting
                        accountingCategoryId = paymentOrderAsyncCreateRequest.accountingCategoryId
                        accountingLedgerClassId =
                            paymentOrderAsyncCreateRequest.accountingLedgerClassId
                        currency = paymentOrderAsyncCreateRequest.currency
                        effectiveDate = paymentOrderAsyncCreateRequest.effectiveDate
                        description = paymentOrderAsyncCreateRequest.description
                        statementDescriptor = paymentOrderAsyncCreateRequest.statementDescriptor
                        remittanceInformation = paymentOrderAsyncCreateRequest.remittanceInformation
                        processAfter = paymentOrderAsyncCreateRequest.processAfter
                        purpose = paymentOrderAsyncCreateRequest.purpose
                        metadata = paymentOrderAsyncCreateRequest.metadata
                        chargeBearer = paymentOrderAsyncCreateRequest.chargeBearer
                        foreignExchangeIndicator =
                            paymentOrderAsyncCreateRequest.foreignExchangeIndicator
                        foreignExchangeContract =
                            paymentOrderAsyncCreateRequest.foreignExchangeContract
                        nsfProtected = paymentOrderAsyncCreateRequest.nsfProtected
                        originatingPartyName = paymentOrderAsyncCreateRequest.originatingPartyName
                        ultimateOriginatingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyName
                        ultimateOriginatingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyIdentifier
                        ultimateReceivingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyName
                        ultimateReceivingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyIdentifier
                        sendRemittanceAdvice = paymentOrderAsyncCreateRequest.sendRemittanceAdvice
                        expiresAt = paymentOrderAsyncCreateRequest.expiresAt
                        fallbackType = paymentOrderAsyncCreateRequest.fallbackType
                        receivingAccount = paymentOrderAsyncCreateRequest.receivingAccount
                        ledgerTransaction = paymentOrderAsyncCreateRequest.ledgerTransaction
                        ledgerTransactionId = paymentOrderAsyncCreateRequest.ledgerTransactionId
                        lineItems = paymentOrderAsyncCreateRequest.lineItems?.toMutableList()
                        transactionMonitoringEnabled =
                            paymentOrderAsyncCreateRequest.transactionMonitoringEnabled
                        additionalProperties =
                            paymentOrderAsyncCreateRequest.additionalProperties.toMutableMap()
                    }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                @JsonProperty("type") fun type(type: PaymentOrderType) = apply { this.type = type }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                @JsonProperty("subtype")
                fun subtype(subtype: PaymentOrderSubtype) = apply { this.subtype = subtype }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                fun direction(direction: Direction) = apply { this.direction = direction }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                @JsonProperty("priority")
                fun priority(priority: Priority) = apply { this.priority = priority }

                /** The ID of one of your organization's internal accounts. */
                @JsonProperty("originating_account_id")
                fun originatingAccountId(originatingAccountId: String) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account_id")
                fun receivingAccountId(receivingAccountId: String) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                @JsonProperty("accounting")
                fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(accountingCategoryId: String) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_ledger_class_id")
                fun accountingLedgerClassId(accountingLedgerClassId: String) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /** Defaults to the currency of the originating account. */
                @JsonProperty("currency")
                fun currency(currency: Currency) = apply { this.currency = currency }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                @JsonProperty("effective_date")
                fun effectiveDate(effectiveDate: LocalDate) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                @JsonProperty("statement_descriptor")
                fun statementDescriptor(statementDescriptor: String) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                fun remittanceInformation(remittanceInformation: String) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                @JsonProperty("process_after")
                fun processAfter(processAfter: OffsetDateTime) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                @JsonProperty("purpose")
                fun purpose(purpose: String) = apply { this.purpose = purpose }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                @JsonProperty("charge_bearer")
                fun chargeBearer(chargeBearer: ChargeBearer) = apply {
                    this.chargeBearer = chargeBearer
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                @JsonProperty("foreign_exchange_indicator")
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                    apply {
                        this.foreignExchangeIndicator = foreignExchangeIndicator
                    }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                @JsonProperty("foreign_exchange_contract")
                fun foreignExchangeContract(foreignExchangeContract: String) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                @JsonProperty("nsf_protected")
                fun nsfProtected(nsfProtected: Boolean) = apply { this.nsfProtected = nsfProtected }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                @JsonProperty("originating_party_name")
                fun originatingPartyName(originatingPartyName: String) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /** Name of the ultimate originator of the payment order. */
                @JsonProperty("ultimate_originating_party_name")
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) = apply {
                    this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                }

                /** Identifier of the ultimate originator of the payment order. */
                @JsonProperty("ultimate_originating_party_identifier")
                fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) =
                    apply {
                        this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                    }

                /** Name of the ultimate funds recipient. */
                @JsonProperty("ultimate_receiving_party_name")
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) = apply {
                    this.ultimateReceivingPartyName = ultimateReceivingPartyName
                }

                /** Identifier of the ultimate funds recipient. */
                @JsonProperty("ultimate_receiving_party_identifier")
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) =
                    apply {
                        this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                    }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                @JsonProperty("send_remittance_advice")
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                @JsonProperty("expires_at")
                fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                @JsonProperty("fallback_type")
                fun fallbackType(fallbackType: FallbackType) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account")
                fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Specifies a ledger transaction object that will be created with the payment
                 * order. If the ledger transaction cannot be created, then the payment order
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the payment order.
                 */
                @JsonProperty("ledger_transaction")
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
                    this.ledgerTransaction = ledgerTransaction
                }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon payment order creation. Once the
                 * payment order is created, the status of the ledger transaction tracks the payment
                 * order automatically.
                 */
                @JsonProperty("ledger_transaction_id")
                fun ledgerTransactionId(ledgerTransactionId: String) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                @JsonProperty("line_items")
                fun lineItems(lineItems: List<LineItemRequest>) = apply {
                    this.lineItems = lineItems
                }

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                @JsonProperty("transaction_monitoring_enabled")
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) = apply {
                    this.transactionMonitoringEnabled = transactionMonitoringEnabled
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PaymentOrderAsyncCreateRequest =
                    PaymentOrderAsyncCreateRequest(
                        checkNotNull(type) { "`type` is required but was not set" },
                        subtype,
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        priority,
                        checkNotNull(originatingAccountId) {
                            "`originatingAccountId` is required but was not set"
                        },
                        receivingAccountId,
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        currency,
                        effectiveDate,
                        description,
                        statementDescriptor,
                        remittanceInformation,
                        processAfter,
                        purpose,
                        metadata,
                        chargeBearer,
                        foreignExchangeIndicator,
                        foreignExchangeContract,
                        nsfProtected,
                        originatingPartyName,
                        ultimateOriginatingPartyName,
                        ultimateOriginatingPartyIdentifier,
                        ultimateReceivingPartyName,
                        ultimateReceivingPartyIdentifier,
                        sendRemittanceAdvice,
                        expiresAt,
                        fallbackType,
                        receivingAccount,
                        ledgerTransaction,
                        ledgerTransactionId,
                        lineItems?.toImmutable(),
                        transactionMonitoringEnabled,
                        additionalProperties.toImmutable(),
                    )
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CREDIT = of("credit")

                    @JvmField val DEBIT = of("debit")

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                enum class Value {
                    CREDIT,
                    DEBIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(builder = Accounting.Builder::class)
            @NoAutoDetect
            class Accounting
            private constructor(
                private val accountId: String?,
                private val classId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id")
                fun accountId(): Optional<String> = Optional.ofNullable(accountId)

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id")
                fun classId(): Optional<String> = Optional.ofNullable(classId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var accountId: String? = null
                    private var classId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accounting: Accounting) = apply {
                        accountId = accounting.accountId
                        classId = accounting.classId
                        additionalProperties = accounting.additionalProperties.toMutableMap()
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("account_id")
                    fun accountId(accountId: String) = apply { this.accountId = accountId }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    @JsonProperty("class_id")
                    fun classId(classId: String) = apply { this.classId = classId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Accounting =
                        Accounting(
                            accountId,
                            classId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Accounting && accountId == other.accountId && classId == other.classId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
            }

            class ChargeBearer
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SHARED = of("shared")

                    @JvmField val SENDER = of("sender")

                    @JvmField val RECEIVER = of("receiver")

                    @JvmStatic fun of(value: String) = ChargeBearer(JsonField.of(value))
                }

                enum class Known {
                    SHARED,
                    SENDER,
                    RECEIVER,
                }

                enum class Value {
                    SHARED,
                    SENDER,
                    RECEIVER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SHARED -> Value.SHARED
                        SENDER -> Value.SENDER
                        RECEIVER -> Value.RECEIVER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SHARED -> Known.SHARED
                        SENDER -> Known.SENDER
                        RECEIVER -> Known.RECEIVER
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class FallbackType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACH = of("ach")

                    @JvmStatic fun of(value: String) = FallbackType(JsonField.of(value))
                }

                enum class Known {
                    ACH,
                }

                enum class Value {
                    ACH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FIXED_TO_VARIABLE = of("fixed_to_variable")

                    @JvmField val VARIABLE_TO_FIXED = of("variable_to_fixed")

                    @JvmStatic fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                }

                enum class Known {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                }

                enum class Value {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ForeignExchangeIndicator: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            private constructor(
                private val description: String?,
                private val status: Status?,
                private val metadata: Metadata?,
                private val effectiveAt: OffsetDateTime?,
                private val effectiveDate: LocalDate?,
                private val ledgerEntries: List<LedgerEntryCreateRequest>,
                private val externalId: String?,
                private val ledgerableType: LedgerableType?,
                private val ledgerableId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(): Optional<String> = Optional.ofNullable(description)

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date")
                fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                fun ledgerEntries(): List<LedgerEntryCreateRequest> = ledgerEntries

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id")
                fun externalId(): Optional<String> = Optional.ofNullable(externalId)

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(): Optional<LedgerableType> = Optional.ofNullable(ledgerableType)

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var description: String? = null
                    private var status: Status? = null
                    private var metadata: Metadata? = null
                    private var effectiveAt: OffsetDateTime? = null
                    private var effectiveDate: LocalDate? = null
                    private var ledgerEntries: List<LedgerEntryCreateRequest>? = null
                    private var externalId: String? = null
                    private var ledgerableType: LedgerableType? = null
                    private var ledgerableId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        description = ledgerTransactionCreateRequest.description
                        status = ledgerTransactionCreateRequest.status
                        metadata = ledgerTransactionCreateRequest.metadata
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries.toMutableList()
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                    /** An optional description for internal use. */
                    @JsonProperty("description")
                    fun description(description: String) = apply { this.description = description }

                    /** To post a ledger transaction at creation, use `posted`. */
                    @JsonProperty("status")
                    fun status(status: Status) = apply { this.status = status }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    @JsonProperty("effective_at")
                    fun effectiveAt(effectiveAt: OffsetDateTime) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    @JsonProperty("effective_date")
                    fun effectiveDate(effectiveDate: LocalDate) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /** An array of ledger entry objects. */
                    @JsonProperty("ledger_entries")
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                        this.ledgerEntries = ledgerEntries
                    }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    @JsonProperty("external_id")
                    fun externalId(externalId: String) = apply { this.externalId = externalId }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    @JsonProperty("ledgerable_type")
                    fun ledgerableType(ledgerableType: LedgerableType) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    fun ledgerableId(ledgerableId: String) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): LedgerTransactionCreateRequest =
                        LedgerTransactionCreateRequest(
                            description,
                            status,
                            metadata,
                            effectiveAt,
                            effectiveDate,
                            checkNotNull(ledgerEntries) {
                                    "`ledgerEntries` is required but was not set"
                                }
                                .toImmutable(),
                            externalId,
                            ledgerableType,
                            ledgerableId,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerEntryCreateRequest
                private constructor(
                    private val amount: Long,
                    private val direction: TransactionDirection,
                    private val ledgerAccountId: String,
                    private val lockVersion: Long?,
                    private val pendingBalanceAmount: PendingBalanceAmount?,
                    private val postedBalanceAmount: PostedBalanceAmount?,
                    private val availableBalanceAmount: AvailableBalanceAmount?,
                    private val showResultingLedgerAccountBalances: Boolean?,
                    private val metadata: Metadata?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") fun amount(): Long = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction") fun direction(): TransactionDirection = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    fun ledgerAccountId(): String = ledgerAccountId

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    fun lockVersion(): Optional<Long> = Optional.ofNullable(lockVersion)

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                        Optional.ofNullable(pendingBalanceAmount)

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                        Optional.ofNullable(postedBalanceAmount)

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                        Optional.ofNullable(availableBalanceAmount)

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                        Optional.ofNullable(showResultingLedgerAccountBalances)

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var amount: Long? = null
                        private var direction: TransactionDirection? = null
                        private var ledgerAccountId: String? = null
                        private var lockVersion: Long? = null
                        private var pendingBalanceAmount: PendingBalanceAmount? = null
                        private var postedBalanceAmount: PostedBalanceAmount? = null
                        private var availableBalanceAmount: AvailableBalanceAmount? = null
                        private var showResultingLedgerAccountBalances: Boolean? = null
                        private var metadata: Metadata? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                amount = ledgerEntryCreateRequest.amount
                                direction = ledgerEntryCreateRequest.direction
                                ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                lockVersion = ledgerEntryCreateRequest.lockVersion
                                pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                                postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                                availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                metadata = ledgerEntryCreateRequest.metadata
                                additionalProperties =
                                    ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        @JsonProperty("amount")
                        fun amount(amount: Long) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        @JsonProperty("direction")
                        fun direction(direction: TransactionDirection) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        @JsonProperty("ledger_account_id")
                        fun ledgerAccountId(ledgerAccountId: String) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        @JsonProperty("lock_version")
                        fun lockVersion(lockVersion: Long) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("pending_balance_amount")
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) =
                            apply {
                                this.pendingBalanceAmount = pendingBalanceAmount
                            }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("posted_balance_amount")
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) = apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        @JsonProperty("available_balance_amount")
                        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                            apply {
                                this.availableBalanceAmount = availableBalanceAmount
                            }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        @JsonProperty("show_resulting_ledger_account_balances")
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LedgerEntryCreateRequest =
                            LedgerEntryCreateRequest(
                                checkNotNull(amount) { "`amount` is required but was not set" },
                                checkNotNull(direction) {
                                    "`direction` is required but was not set"
                                },
                                checkNotNull(ledgerAccountId) {
                                    "`ledgerAccountId` is required but was not set"
                                },
                                lockVersion,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                availableBalanceAmount,
                                showResultingLedgerAccountBalances,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(availableBalanceAmount: AvailableBalanceAmount) =
                                apply {
                                    additionalProperties =
                                        availableBalanceAmount.additionalProperties.toMutableMap()
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): AvailableBalanceAmount =
                                AvailableBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties = metadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PendingBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                                additionalProperties =
                                    pendingBalanceAmount.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): PendingBalanceAmount =
                                PendingBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PostedBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                                additionalProperties =
                                    postedBalanceAmount.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): PostedBalanceAmount =
                                PostedBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && lockVersion == other.lockVersion && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && availableBalanceAmount == other.availableBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, lockVersion, pendingBalanceAmount, postedBalanceAmount, availableBalanceAmount, showResultingLedgerAccountBalances, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                class LedgerableType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LedgerableType: $value"
                                )
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

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                            else ->
                                throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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

                    return /* spotless:off */ other is LedgerTransactionCreateRequest && description == other.description && status == other.status && metadata == other.metadata && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && ledgerEntries == other.ledgerEntries && externalId == other.externalId && ledgerableType == other.ledgerableType && ledgerableId == other.ledgerableId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(description, status, metadata, effectiveAt, effectiveDate, ledgerEntries, externalId, ledgerableType, ledgerableId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = LineItemRequest.Builder::class)
            @NoAutoDetect
            class LineItemRequest
            private constructor(
                private val amount: Long,
                private val metadata: Metadata?,
                private val description: String?,
                private val accountingCategoryId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /** A free-form description of the line item. */
                @JsonProperty("description")
                fun description(): Optional<String> = Optional.ofNullable(description)

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(): Optional<String> =
                    Optional.ofNullable(accountingCategoryId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var metadata: Metadata? = null
                    private var description: String? = null
                    private var accountingCategoryId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        metadata = lineItemRequest.metadata
                        description = lineItemRequest.description
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /** A free-form description of the line item. */
                    @JsonProperty("description")
                    fun description(description: String) = apply { this.description = description }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("accounting_category_id")
                    fun accountingCategoryId(accountingCategoryId: String) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            metadata,
                            description,
                            accountingCategoryId,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && metadata == other.metadata && description == other.description && accountingCategoryId == other.accountingCategoryId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, metadata, description, accountingCategoryId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonDeserialize(builder = ReceivingAccount.Builder::class)
            @NoAutoDetect
            class ReceivingAccount
            private constructor(
                private val accountType: ExternalAccountType?,
                private val partyType: PartyType?,
                private val partyAddress: AddressRequest?,
                private val name: String?,
                private val accountDetails: List<AccountDetail>?,
                private val routingDetails: List<RoutingDetail>?,
                private val metadata: Metadata?,
                private val partyName: String?,
                private val partyIdentifier: String?,
                private val ledgerAccount: LedgerAccountCreateRequest?,
                private val plaidProcessorToken: String?,
                private val contactDetails: List<ContactDetailCreateRequest>?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type")
                fun accountType(): Optional<ExternalAccountType> = Optional.ofNullable(accountType)

                /** Either `individual` or `business`. */
                @JsonProperty("party_type")
                fun partyType(): Optional<PartyType> = Optional.ofNullable(partyType)

                /** Required if receiving wire payments. */
                @JsonProperty("party_address")
                fun partyAddress(): Optional<AddressRequest> = Optional.ofNullable(partyAddress)

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

                @JsonProperty("account_details")
                fun accountDetails(): Optional<List<AccountDetail>> =
                    Optional.ofNullable(accountDetails)

                @JsonProperty("routing_details")
                fun routingDetails(): Optional<List<RoutingDetail>> =
                    Optional.ofNullable(routingDetails)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name")
                fun partyName(): Optional<String> = Optional.ofNullable(partyName)

                @JsonProperty("party_identifier")
                fun partyIdentifier(): Optional<String> = Optional.ofNullable(partyIdentifier)

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account")
                fun ledgerAccount(): Optional<LedgerAccountCreateRequest> =
                    Optional.ofNullable(ledgerAccount)

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                fun plaidProcessorToken(): Optional<String> =
                    Optional.ofNullable(plaidProcessorToken)

                @JsonProperty("contact_details")
                fun contactDetails(): Optional<List<ContactDetailCreateRequest>> =
                    Optional.ofNullable(contactDetails)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var accountType: ExternalAccountType? = null
                    private var partyType: PartyType? = null
                    private var partyAddress: AddressRequest? = null
                    private var name: String? = null
                    private var accountDetails: List<AccountDetail>? = null
                    private var routingDetails: List<RoutingDetail>? = null
                    private var metadata: Metadata? = null
                    private var partyName: String? = null
                    private var partyIdentifier: String? = null
                    private var ledgerAccount: LedgerAccountCreateRequest? = null
                    private var plaidProcessorToken: String? = null
                    private var contactDetails: List<ContactDetailCreateRequest>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountType = receivingAccount.accountType
                        partyType = receivingAccount.partyType
                        partyAddress = receivingAccount.partyAddress
                        name = receivingAccount.name
                        accountDetails = receivingAccount.accountDetails?.toMutableList()
                        routingDetails = receivingAccount.routingDetails?.toMutableList()
                        metadata = receivingAccount.metadata
                        partyName = receivingAccount.partyName
                        partyIdentifier = receivingAccount.partyIdentifier
                        ledgerAccount = receivingAccount.ledgerAccount
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        contactDetails = receivingAccount.contactDetails?.toMutableList()
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    @JsonProperty("account_type")
                    fun accountType(accountType: ExternalAccountType) = apply {
                        this.accountType = accountType
                    }

                    /** Either `individual` or `business`. */
                    @JsonProperty("party_type")
                    fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

                    /** Required if receiving wire payments. */
                    @JsonProperty("party_address")
                    fun partyAddress(partyAddress: AddressRequest) = apply {
                        this.partyAddress = partyAddress
                    }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                    @JsonProperty("account_details")
                    fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                        this.accountDetails = accountDetails
                    }

                    @JsonProperty("routing_details")
                    fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
                        this.routingDetails = routingDetails
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    @JsonProperty("party_name")
                    fun partyName(partyName: String) = apply { this.partyName = partyName }

                    @JsonProperty("party_identifier")
                    fun partyIdentifier(partyIdentifier: String) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    @JsonProperty("ledger_account")
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
                        this.ledgerAccount = ledgerAccount
                    }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    @JsonProperty("plaid_processor_token")
                    fun plaidProcessorToken(plaidProcessorToken: String) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    @JsonProperty("contact_details")
                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
                        this.contactDetails = contactDetails
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            accountType,
                            partyType,
                            partyAddress,
                            name,
                            accountDetails?.toImmutable(),
                            routingDetails?.toImmutable(),
                            metadata,
                            partyName,
                            partyIdentifier,
                            ledgerAccount,
                            plaidProcessorToken,
                            contactDetails?.toImmutable(),
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = AccountDetail.Builder::class)
                @NoAutoDetect
                class AccountDetail
                private constructor(
                    private val accountNumber: String,
                    private val accountNumberType: AccountNumberType?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("account_number") fun accountNumber(): String = accountNumber

                    @JsonProperty("account_number_type")
                    fun accountNumberType(): Optional<AccountNumberType> =
                        Optional.ofNullable(accountNumberType)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var accountNumber: String? = null
                        private var accountNumberType: AccountNumberType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        @JsonProperty("account_number")
                        fun accountNumber(accountNumber: String) = apply {
                            this.accountNumber = accountNumber
                        }

                        @JsonProperty("account_number_type")
                        fun accountNumberType(accountNumberType: AccountNumberType) = apply {
                            this.accountNumberType = accountNumberType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AccountDetail =
                            AccountDetail(
                                checkNotNull(accountNumber) {
                                    "`accountNumber` is required but was not set"
                                },
                                accountNumberType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AccountNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val AU_NUMBER = of("au_number")

                            @JvmField val CLABE = of("clabe")

                            @JvmField val HK_NUMBER = of("hk_number")

                            @JvmField val IBAN = of("iban")

                            @JvmField val ID_NUMBER = of("id_number")

                            @JvmField val NZ_NUMBER = of("nz_number")

                            @JvmField val OTHER = of("other")

                            @JvmField val PAN = of("pan")

                            @JvmField val SG_NUMBER = of("sg_number")

                            @JvmField val WALLET_ADDRESS = of("wallet_address")

                            @JvmStatic
                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                        }

                        enum class Value {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AU_NUMBER -> Value.AU_NUMBER
                                CLABE -> Value.CLABE
                                HK_NUMBER -> Value.HK_NUMBER
                                IBAN -> Value.IBAN
                                ID_NUMBER -> Value.ID_NUMBER
                                NZ_NUMBER -> Value.NZ_NUMBER
                                OTHER -> Value.OTHER
                                PAN -> Value.PAN
                                SG_NUMBER -> Value.SG_NUMBER
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AU_NUMBER -> Known.AU_NUMBER
                                CLABE -> Known.CLABE
                                HK_NUMBER -> Known.HK_NUMBER
                                IBAN -> Known.IBAN
                                ID_NUMBER -> Known.ID_NUMBER
                                NZ_NUMBER -> Known.NZ_NUMBER
                                OTHER -> Known.OTHER
                                PAN -> Known.PAN
                                SG_NUMBER -> Known.SG_NUMBER
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AccountDetail && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
                @NoAutoDetect
                class ContactDetailCreateRequest
                private constructor(
                    private val contactIdentifier: String?,
                    private val contactIdentifierType: ContactIdentifierType?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("contact_identifier")
                    fun contactIdentifier(): Optional<String> =
                        Optional.ofNullable(contactIdentifier)

                    @JsonProperty("contact_identifier_type")
                    fun contactIdentifierType(): Optional<ContactIdentifierType> =
                        Optional.ofNullable(contactIdentifierType)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var contactIdentifier: String? = null
                        private var contactIdentifierType: ContactIdentifierType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) =
                            apply {
                                contactIdentifier = contactDetailCreateRequest.contactIdentifier
                                contactIdentifierType =
                                    contactDetailCreateRequest.contactIdentifierType
                                additionalProperties =
                                    contactDetailCreateRequest.additionalProperties.toMutableMap()
                            }

                        @JsonProperty("contact_identifier")
                        fun contactIdentifier(contactIdentifier: String) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        @JsonProperty("contact_identifier_type")
                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                            apply {
                                this.contactIdentifierType = contactIdentifierType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): ContactDetailCreateRequest =
                            ContactDetailCreateRequest(
                                contactIdentifier,
                                contactIdentifierType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class ContactIdentifierType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val EMAIL = of("email")

                            @JvmField val PHONE_NUMBER = of("phone_number")

                            @JvmField val WEBSITE = of("website")

                            @JvmStatic
                            fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                        }

                        enum class Known {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                        }

                        enum class Value {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                EMAIL -> Value.EMAIL
                                PHONE_NUMBER -> Value.PHONE_NUMBER
                                WEBSITE -> Value.WEBSITE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                EMAIL -> Known.EMAIL
                                PHONE_NUMBER -> Known.PHONE_NUMBER
                                WEBSITE -> Known.WEBSITE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown ContactIdentifierType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ContactDetailCreateRequest && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
                }

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonDeserialize(builder = LedgerAccountCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerAccountCreateRequest
                private constructor(
                    private val name: String,
                    private val description: String?,
                    private val normalBalance: TransactionDirection,
                    private val ledgerId: String,
                    private val currency: String,
                    private val currencyExponent: Long?,
                    private val ledgerAccountCategoryIds: List<String>?,
                    private val ledgerableId: String?,
                    private val ledgerableType: LedgerableType?,
                    private val metadata: Metadata?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The name of the ledger account. */
                    @JsonProperty("name") fun name(): String = name

                    /** The description of the ledger account. */
                    @JsonProperty("description")
                    fun description(): Optional<String> = Optional.ofNullable(description)

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    fun normalBalance(): TransactionDirection = normalBalance

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

                    /** The currency of the ledger account. */
                    @JsonProperty("currency") fun currency(): String = currency

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    fun currencyExponent(): Optional<Long> = Optional.ofNullable(currencyExponent)

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    fun ledgerAccountCategoryIds(): Optional<List<String>> =
                        Optional.ofNullable(ledgerAccountCategoryIds)

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    fun ledgerableType(): Optional<LedgerableType> =
                        Optional.ofNullable(ledgerableType)

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var name: String? = null
                        private var description: String? = null
                        private var normalBalance: TransactionDirection? = null
                        private var ledgerId: String? = null
                        private var currency: String? = null
                        private var currencyExponent: Long? = null
                        private var ledgerAccountCategoryIds: List<String>? = null
                        private var ledgerableId: String? = null
                        private var ledgerableType: LedgerableType? = null
                        private var metadata: Metadata? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                name = ledgerAccountCreateRequest.name
                                description = ledgerAccountCreateRequest.description
                                normalBalance = ledgerAccountCreateRequest.normalBalance
                                ledgerId = ledgerAccountCreateRequest.ledgerId
                                currency = ledgerAccountCreateRequest.currency
                                currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds
                                        ?.toMutableList()
                                ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties =
                                    ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                            }

                        /** The name of the ledger account. */
                        @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                        /** The description of the ledger account. */
                        @JsonProperty("description")
                        fun description(description: String) = apply {
                            this.description = description
                        }

                        /** The normal balance of the ledger account. */
                        @JsonProperty("normal_balance")
                        fun normalBalance(normalBalance: TransactionDirection) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The id of the ledger that this account belongs to. */
                        @JsonProperty("ledger_id")
                        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                        /** The currency of the ledger account. */
                        @JsonProperty("currency")
                        fun currency(currency: String) = apply { this.currency = currency }

                        /** The currency exponent of the ledger account. */
                        @JsonProperty("currency_exponent")
                        fun currencyExponent(currencyExponent: Long) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        @JsonProperty("ledger_account_category_ids")
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                            apply {
                                this.ledgerAccountCategoryIds = ledgerAccountCategoryIds
                            }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        @JsonProperty("ledgerable_id")
                        fun ledgerableId(ledgerableId: String) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        @JsonProperty("ledgerable_type")
                        fun ledgerableType(ledgerableType: LedgerableType) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LedgerAccountCreateRequest =
                            LedgerAccountCreateRequest(
                                checkNotNull(name) { "`name` is required but was not set" },
                                description,
                                checkNotNull(normalBalance) {
                                    "`normalBalance` is required but was not set"
                                },
                                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                                checkNotNull(currency) { "`currency` is required but was not set" },
                                currencyExponent,
                                ledgerAccountCategoryIds?.toImmutable(),
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class LedgerableType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val COUNTERPARTY = of("counterparty")

                            @JvmField val EXTERNAL_ACCOUNT = of("external_account")

                            @JvmField val INTERNAL_ACCOUNT = of("internal_account")

                            @JvmField val VIRTUAL_ACCOUNT = of("virtual_account")

                            @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
                        }

                        enum class Known {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                        }

                        enum class Value {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                COUNTERPARTY -> Value.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                COUNTERPARTY -> Known.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown LedgerableType: $value"
                                    )
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

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties = metadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerAccountCreateRequest && name == other.name && description == other.description && normalBalance == other.normalBalance && ledgerId == other.ledgerId && currency == other.currency && currencyExponent == other.currencyExponent && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, description, normalBalance, ledgerId, currency, currencyExponent, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                /** Required if receiving wire payments. */
                @JsonDeserialize(builder = AddressRequest.Builder::class)
                @NoAutoDetect
                class AddressRequest
                private constructor(
                    private val line1: String?,
                    private val line2: String?,
                    private val locality: String?,
                    private val region: String?,
                    private val postalCode: String?,
                    private val country: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("line1")
                    fun line1(): Optional<String> = Optional.ofNullable(line1)

                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

                    /** Locality or City. */
                    @JsonProperty("locality")
                    fun locality(): Optional<String> = Optional.ofNullable(locality)

                    /** Region or State. */
                    @JsonProperty("region")
                    fun region(): Optional<String> = Optional.ofNullable(region)

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    fun country(): Optional<String> = Optional.ofNullable(country)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: String? = null
                        private var line2: String? = null
                        private var locality: String? = null
                        private var region: String? = null
                        private var postalCode: String? = null
                        private var country: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addressRequest: AddressRequest) = apply {
                            line1 = addressRequest.line1
                            line2 = addressRequest.line2
                            locality = addressRequest.locality
                            region = addressRequest.region
                            postalCode = addressRequest.postalCode
                            country = addressRequest.country
                            additionalProperties =
                                addressRequest.additionalProperties.toMutableMap()
                        }

                        @JsonProperty("line1")
                        fun line1(line1: String) = apply { this.line1 = line1 }

                        @JsonProperty("line2")
                        fun line2(line2: String) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        @JsonProperty("locality")
                        fun locality(locality: String) = apply { this.locality = locality }

                        /** Region or State. */
                        @JsonProperty("region")
                        fun region(region: String) = apply { this.region = region }

                        /** The postal code of the address. */
                        @JsonProperty("postal_code")
                        fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AddressRequest =
                            AddressRequest(
                                line1,
                                line2,
                                locality,
                                region,
                                postalCode,
                                country,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddressRequest && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
                }

                class PartyType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val BUSINESS = of("business")

                        @JvmField val INDIVIDUAL = of("individual")

                        @JvmStatic fun of(value: String) = PartyType(JsonField.of(value))
                    }

                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown PartyType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                @JsonDeserialize(builder = RoutingDetail.Builder::class)
                @NoAutoDetect
                class RoutingDetail
                private constructor(
                    private val routingNumber: String,
                    private val routingNumberType: RoutingNumberType,
                    private val paymentType: PaymentType?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

                    @JsonProperty("routing_number_type")
                    fun routingNumberType(): RoutingNumberType = routingNumberType

                    @JsonProperty("payment_type")
                    fun paymentType(): Optional<PaymentType> = Optional.ofNullable(paymentType)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var routingNumber: String? = null
                        private var routingNumberType: RoutingNumberType? = null
                        private var paymentType: PaymentType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        @JsonProperty("routing_number")
                        fun routingNumber(routingNumber: String) = apply {
                            this.routingNumber = routingNumber
                        }

                        @JsonProperty("routing_number_type")
                        fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                            this.routingNumberType = routingNumberType
                        }

                        @JsonProperty("payment_type")
                        fun paymentType(paymentType: PaymentType) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): RoutingDetail =
                            RoutingDetail(
                                checkNotNull(routingNumber) {
                                    "`routingNumber` is required but was not set"
                                },
                                checkNotNull(routingNumberType) {
                                    "`routingNumberType` is required but was not set"
                                },
                                paymentType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val ABA = of("aba")

                            @JvmField val AU_BSB = of("au_bsb")

                            @JvmField val BR_CODIGO = of("br_codigo")

                            @JvmField val CA_CPA = of("ca_cpa")

                            @JvmField val CHIPS = of("chips")

                            @JvmField val CNAPS = of("cnaps")

                            @JvmField
                            val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

                            @JvmField val GB_SORT_CODE = of("gb_sort_code")

                            @JvmField
                            val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

                            @JvmField
                            val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

                            @JvmField val ID_SKNBI_CODE = of("id_sknbi_code")

                            @JvmField val IN_IFSC = of("in_ifsc")

                            @JvmField val JP_ZENGIN_CODE = of("jp_zengin_code")

                            @JvmField val MY_BRANCH_CODE = of("my_branch_code")

                            @JvmField val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                            @JvmField
                            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                            @JvmField
                            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                            @JvmField
                            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                            @JvmField val SWIFT = of("swift")

                            @JvmField
                            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                            @JvmStatic
                            fun of(value: String) = RoutingNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                        }

                        enum class Value {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                ABA -> Value.ABA
                                AU_BSB -> Value.AU_BSB
                                BR_CODIGO -> Value.BR_CODIGO
                                CA_CPA -> Value.CA_CPA
                                CHIPS -> Value.CHIPS
                                CNAPS -> Value.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Value.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                                IN_IFSC -> Value.IN_IFSC
                                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Value.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                ABA -> Known.ABA
                                AU_BSB -> Known.AU_BSB
                                BR_CODIGO -> Known.BR_CODIGO
                                CA_CPA -> Known.CA_CPA
                                CHIPS -> Known.CHIPS
                                CNAPS -> Known.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Known.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                                IN_IFSC -> Known.IN_IFSC
                                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Known.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class PaymentType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown PaymentType: $value"
                                    )
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RoutingDetail && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ReceivingAccount && accountType == other.accountType && partyType == other.partyType && partyAddress == other.partyAddress && name == other.name && accountDetails == other.accountDetails && routingDetails == other.routingDetails && metadata == other.metadata && partyName == other.partyName && partyIdentifier == other.partyIdentifier && ledgerAccount == other.ledgerAccount && plaidProcessorToken == other.plaidProcessorToken && contactDetails == other.contactDetails && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountType, partyType, partyAddress, name, accountDetails, routingDetails, metadata, partyName, partyIdentifier, ledgerAccount, plaidProcessorToken, contactDetails, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ReceivingAccount{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentOrderAsyncCreateRequest && type == other.type && subtype == other.subtype && amount == other.amount && direction == other.direction && priority == other.priority && originatingAccountId == other.originatingAccountId && receivingAccountId == other.receivingAccountId && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && currency == other.currency && effectiveDate == other.effectiveDate && description == other.description && statementDescriptor == other.statementDescriptor && remittanceInformation == other.remittanceInformation && processAfter == other.processAfter && purpose == other.purpose && metadata == other.metadata && chargeBearer == other.chargeBearer && foreignExchangeIndicator == other.foreignExchangeIndicator && foreignExchangeContract == other.foreignExchangeContract && nsfProtected == other.nsfProtected && originatingPartyName == other.originatingPartyName && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && sendRemittanceAdvice == other.sendRemittanceAdvice && expiresAt == other.expiresAt && fallbackType == other.fallbackType && receivingAccount == other.receivingAccount && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && lineItems == other.lineItems && transactionMonitoringEnabled == other.transactionMonitoringEnabled && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, subtype, amount, direction, priority, originatingAccountId, receivingAccountId, accounting, accountingCategoryId, accountingLedgerClassId, currency, effectiveDate, description, statementDescriptor, remittanceInformation, processAfter, purpose, metadata, chargeBearer, foreignExchangeIndicator, foreignExchangeContract, nsfProtected, originatingPartyName, ultimateOriginatingPartyName, ultimateOriginatingPartyIdentifier, ultimateReceivingPartyName, ultimateReceivingPartyIdentifier, sendRemittanceAdvice, expiresAt, fallbackType, receivingAccount, ledgerTransaction, ledgerTransactionId, lineItems, transactionMonitoringEnabled, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderAsyncCreateRequest{type=$type, subtype=$subtype, amount=$amount, direction=$direction, priority=$priority, originatingAccountId=$originatingAccountId, receivingAccountId=$receivingAccountId, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, currency=$currency, effectiveDate=$effectiveDate, description=$description, statementDescriptor=$statementDescriptor, remittanceInformation=$remittanceInformation, processAfter=$processAfter, purpose=$purpose, metadata=$metadata, chargeBearer=$chargeBearer, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeContract=$foreignExchangeContract, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, sendRemittanceAdvice=$sendRemittanceAdvice, expiresAt=$expiresAt, fallbackType=$fallbackType, receivingAccount=$receivingAccount, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, transactionMonitoringEnabled=$transactionMonitoringEnabled, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ExpectedPaymentCreateRequest.Builder::class)
        @NoAutoDetect
        class ExpectedPaymentCreateRequest
        private constructor(
            private val amountUpperBound: Long?,
            private val amountLowerBound: Long?,
            private val direction: Direction?,
            private val internalAccountId: String?,
            private val type: ExpectedPaymentType?,
            private val currency: Currency?,
            private val dateUpperBound: LocalDate?,
            private val dateLowerBound: LocalDate?,
            private val description: String?,
            private val statementDescriptor: String?,
            private val metadata: Metadata?,
            private val counterpartyId: String?,
            private val remittanceInformation: String?,
            private val reconciliationGroups: JsonValue?,
            private val reconciliationFilters: JsonValue?,
            private val reconciliationRuleVariables: List<ReconciliationRule>?,
            private val lineItems: List<LineItemRequest>?,
            private val ledgerTransaction: LedgerTransactionCreateRequest?,
            private val ledgerTransactionId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            fun amountUpperBound(): Optional<Long> = Optional.ofNullable(amountUpperBound)

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            fun amountLowerBound(): Optional<Long> = Optional.ofNullable(amountLowerBound)

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction")
            fun direction(): Optional<Direction> = Optional.ofNullable(direction)

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(): Optional<String> = Optional.ofNullable(internalAccountId)

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type")
            fun type(): Optional<ExpectedPaymentType> = Optional.ofNullable(type)

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency")
            fun currency(): Optional<Currency> = Optional.ofNullable(currency)

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound")
            fun dateUpperBound(): Optional<LocalDate> = Optional.ofNullable(dateUpperBound)

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound")
            fun dateLowerBound(): Optional<LocalDate> = Optional.ofNullable(dateLowerBound)

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(): Optional<String> = Optional.ofNullable(description)

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): Optional<String> = Optional.ofNullable(statementDescriptor)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation)

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            fun reconciliationGroups(): Optional<JsonValue> =
                Optional.ofNullable(reconciliationGroups)

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            fun reconciliationFilters(): Optional<JsonValue> =
                Optional.ofNullable(reconciliationFilters)

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            fun reconciliationRuleVariables(): Optional<List<ReconciliationRule>> =
                Optional.ofNullable(reconciliationRuleVariables)

            @JsonProperty("line_items")
            fun lineItems(): Optional<List<LineItemRequest>> = Optional.ofNullable(lineItems)

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @JsonProperty("ledger_transaction")
            fun ledgerTransaction(): Optional<LedgerTransactionCreateRequest> =
                Optional.ofNullable(ledgerTransaction)

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            fun ledgerTransactionId(): Optional<String> = Optional.ofNullable(ledgerTransactionId)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amountUpperBound: Long? = null
                private var amountLowerBound: Long? = null
                private var direction: Direction? = null
                private var internalAccountId: String? = null
                private var type: ExpectedPaymentType? = null
                private var currency: Currency? = null
                private var dateUpperBound: LocalDate? = null
                private var dateLowerBound: LocalDate? = null
                private var description: String? = null
                private var statementDescriptor: String? = null
                private var metadata: Metadata? = null
                private var counterpartyId: String? = null
                private var remittanceInformation: String? = null
                private var reconciliationGroups: JsonValue? = null
                private var reconciliationFilters: JsonValue? = null
                private var reconciliationRuleVariables: List<ReconciliationRule>? = null
                private var lineItems: List<LineItemRequest>? = null
                private var ledgerTransaction: LedgerTransactionCreateRequest? = null
                private var ledgerTransactionId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(expectedPaymentCreateRequest: ExpectedPaymentCreateRequest) =
                    apply {
                        amountUpperBound = expectedPaymentCreateRequest.amountUpperBound
                        amountLowerBound = expectedPaymentCreateRequest.amountLowerBound
                        direction = expectedPaymentCreateRequest.direction
                        internalAccountId = expectedPaymentCreateRequest.internalAccountId
                        type = expectedPaymentCreateRequest.type
                        currency = expectedPaymentCreateRequest.currency
                        dateUpperBound = expectedPaymentCreateRequest.dateUpperBound
                        dateLowerBound = expectedPaymentCreateRequest.dateLowerBound
                        description = expectedPaymentCreateRequest.description
                        statementDescriptor = expectedPaymentCreateRequest.statementDescriptor
                        metadata = expectedPaymentCreateRequest.metadata
                        counterpartyId = expectedPaymentCreateRequest.counterpartyId
                        remittanceInformation = expectedPaymentCreateRequest.remittanceInformation
                        reconciliationGroups = expectedPaymentCreateRequest.reconciliationGroups
                        reconciliationFilters = expectedPaymentCreateRequest.reconciliationFilters
                        reconciliationRuleVariables =
                            expectedPaymentCreateRequest.reconciliationRuleVariables
                                ?.toMutableList()
                        lineItems = expectedPaymentCreateRequest.lineItems?.toMutableList()
                        ledgerTransaction = expectedPaymentCreateRequest.ledgerTransaction
                        ledgerTransactionId = expectedPaymentCreateRequest.ledgerTransactionId
                        additionalProperties =
                            expectedPaymentCreateRequest.additionalProperties.toMutableMap()
                    }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_upper_bound")
                fun amountUpperBound(amountUpperBound: Long) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_lower_bound")
                fun amountLowerBound(amountLowerBound: Long) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                @JsonProperty("direction")
                fun direction(direction: Direction) = apply { this.direction = direction }

                /** The ID of the Internal Account for the expected payment. */
                @JsonProperty("internal_account_id")
                fun internalAccountId(internalAccountId: String) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                @JsonProperty("type")
                fun type(type: ExpectedPaymentType) = apply { this.type = type }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                @JsonProperty("currency")
                fun currency(currency: Currency) = apply { this.currency = currency }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_upper_bound")
                fun dateUpperBound(dateUpperBound: LocalDate) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_lower_bound")
                fun dateLowerBound(dateLowerBound: LocalDate) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                @JsonProperty("statement_descriptor")
                fun statementDescriptor(statementDescriptor: String) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                /** The ID of the counterparty you expect for this payment. */
                @JsonProperty("counterparty_id")
                fun counterpartyId(counterpartyId: String) = apply {
                    this.counterpartyId = counterpartyId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                fun remittanceInformation(remittanceInformation: String) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The reconciliation groups you have for this payment. */
                @JsonProperty("reconciliation_groups")
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** The reconciliation filters you have for this payment. */
                @JsonProperty("reconciliation_filters")
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** An array of reconciliation rule variables for this payment. */
                @JsonProperty("reconciliation_rule_variables")
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>
                ) = apply { this.reconciliationRuleVariables = reconciliationRuleVariables }

                @JsonProperty("line_items")
                fun lineItems(lineItems: List<LineItemRequest>) = apply {
                    this.lineItems = lineItems
                }

                /**
                 * Specifies a ledger transaction object that will be created with the expected
                 * payment. If the ledger transaction cannot be created, then the expected payment
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the expected payment.
                 */
                @JsonProperty("ledger_transaction")
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) = apply {
                    this.ledgerTransaction = ledgerTransaction
                }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon expected payment creation. Once
                 * the expected payment is created, the status of the ledger transaction tracks the
                 * expected payment automatically.
                 */
                @JsonProperty("ledger_transaction_id")
                fun ledgerTransactionId(ledgerTransactionId: String) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ExpectedPaymentCreateRequest =
                    ExpectedPaymentCreateRequest(
                        amountUpperBound,
                        amountLowerBound,
                        direction,
                        internalAccountId,
                        type,
                        currency,
                        dateUpperBound,
                        dateLowerBound,
                        description,
                        statementDescriptor,
                        metadata,
                        counterpartyId,
                        remittanceInformation,
                        reconciliationGroups,
                        reconciliationFilters,
                        reconciliationRuleVariables?.toImmutable(),
                        lineItems?.toImmutable(),
                        ledgerTransaction,
                        ledgerTransactionId,
                        additionalProperties.toImmutable(),
                    )
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CREDIT = of("credit")

                    @JvmField val DEBIT = of("debit")

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                enum class Value {
                    CREDIT,
                    DEBIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            private constructor(
                private val description: String?,
                private val status: Status?,
                private val metadata: Metadata?,
                private val effectiveAt: OffsetDateTime?,
                private val effectiveDate: LocalDate?,
                private val ledgerEntries: List<LedgerEntryCreateRequest>,
                private val externalId: String?,
                private val ledgerableType: LedgerableType?,
                private val ledgerableId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(): Optional<String> = Optional.ofNullable(description)

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date")
                fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                fun ledgerEntries(): List<LedgerEntryCreateRequest> = ledgerEntries

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id")
                fun externalId(): Optional<String> = Optional.ofNullable(externalId)

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(): Optional<LedgerableType> = Optional.ofNullable(ledgerableType)

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var description: String? = null
                    private var status: Status? = null
                    private var metadata: Metadata? = null
                    private var effectiveAt: OffsetDateTime? = null
                    private var effectiveDate: LocalDate? = null
                    private var ledgerEntries: List<LedgerEntryCreateRequest>? = null
                    private var externalId: String? = null
                    private var ledgerableType: LedgerableType? = null
                    private var ledgerableId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        description = ledgerTransactionCreateRequest.description
                        status = ledgerTransactionCreateRequest.status
                        metadata = ledgerTransactionCreateRequest.metadata
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries.toMutableList()
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                    /** An optional description for internal use. */
                    @JsonProperty("description")
                    fun description(description: String) = apply { this.description = description }

                    /** To post a ledger transaction at creation, use `posted`. */
                    @JsonProperty("status")
                    fun status(status: Status) = apply { this.status = status }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    @JsonProperty("effective_at")
                    fun effectiveAt(effectiveAt: OffsetDateTime) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    @JsonProperty("effective_date")
                    fun effectiveDate(effectiveDate: LocalDate) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /** An array of ledger entry objects. */
                    @JsonProperty("ledger_entries")
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                        this.ledgerEntries = ledgerEntries
                    }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    @JsonProperty("external_id")
                    fun externalId(externalId: String) = apply { this.externalId = externalId }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    @JsonProperty("ledgerable_type")
                    fun ledgerableType(ledgerableType: LedgerableType) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    fun ledgerableId(ledgerableId: String) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): LedgerTransactionCreateRequest =
                        LedgerTransactionCreateRequest(
                            description,
                            status,
                            metadata,
                            effectiveAt,
                            effectiveDate,
                            checkNotNull(ledgerEntries) {
                                    "`ledgerEntries` is required but was not set"
                                }
                                .toImmutable(),
                            externalId,
                            ledgerableType,
                            ledgerableId,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerEntryCreateRequest
                private constructor(
                    private val amount: Long,
                    private val direction: TransactionDirection,
                    private val ledgerAccountId: String,
                    private val lockVersion: Long?,
                    private val pendingBalanceAmount: PendingBalanceAmount?,
                    private val postedBalanceAmount: PostedBalanceAmount?,
                    private val availableBalanceAmount: AvailableBalanceAmount?,
                    private val showResultingLedgerAccountBalances: Boolean?,
                    private val metadata: Metadata?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") fun amount(): Long = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction") fun direction(): TransactionDirection = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    fun ledgerAccountId(): String = ledgerAccountId

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    fun lockVersion(): Optional<Long> = Optional.ofNullable(lockVersion)

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                        Optional.ofNullable(pendingBalanceAmount)

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                        Optional.ofNullable(postedBalanceAmount)

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                        Optional.ofNullable(availableBalanceAmount)

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                        Optional.ofNullable(showResultingLedgerAccountBalances)

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var amount: Long? = null
                        private var direction: TransactionDirection? = null
                        private var ledgerAccountId: String? = null
                        private var lockVersion: Long? = null
                        private var pendingBalanceAmount: PendingBalanceAmount? = null
                        private var postedBalanceAmount: PostedBalanceAmount? = null
                        private var availableBalanceAmount: AvailableBalanceAmount? = null
                        private var showResultingLedgerAccountBalances: Boolean? = null
                        private var metadata: Metadata? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                amount = ledgerEntryCreateRequest.amount
                                direction = ledgerEntryCreateRequest.direction
                                ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                lockVersion = ledgerEntryCreateRequest.lockVersion
                                pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                                postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                                availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                metadata = ledgerEntryCreateRequest.metadata
                                additionalProperties =
                                    ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        @JsonProperty("amount")
                        fun amount(amount: Long) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        @JsonProperty("direction")
                        fun direction(direction: TransactionDirection) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        @JsonProperty("ledger_account_id")
                        fun ledgerAccountId(ledgerAccountId: String) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        @JsonProperty("lock_version")
                        fun lockVersion(lockVersion: Long) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("pending_balance_amount")
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) =
                            apply {
                                this.pendingBalanceAmount = pendingBalanceAmount
                            }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        @JsonProperty("posted_balance_amount")
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) = apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        @JsonProperty("available_balance_amount")
                        fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                            apply {
                                this.availableBalanceAmount = availableBalanceAmount
                            }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        @JsonProperty("show_resulting_ledger_account_balances")
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LedgerEntryCreateRequest =
                            LedgerEntryCreateRequest(
                                checkNotNull(amount) { "`amount` is required but was not set" },
                                checkNotNull(direction) {
                                    "`direction` is required but was not set"
                                },
                                checkNotNull(ledgerAccountId) {
                                    "`ledgerAccountId` is required but was not set"
                                },
                                lockVersion,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                availableBalanceAmount,
                                showResultingLedgerAccountBalances,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(availableBalanceAmount: AvailableBalanceAmount) =
                                apply {
                                    additionalProperties =
                                        availableBalanceAmount.additionalProperties.toMutableMap()
                                }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): AvailableBalanceAmount =
                                AvailableBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties = metadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PendingBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                                additionalProperties =
                                    pendingBalanceAmount.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): PendingBalanceAmount =
                                PendingBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                    @NoAutoDetect
                    class PostedBalanceAmount
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                                additionalProperties =
                                    postedBalanceAmount.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            fun build(): PostedBalanceAmount =
                                PostedBalanceAmount(additionalProperties.toImmutable())
                        }

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                        }

                        /* spotless:off */
                        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                        /* spotless:on */

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && lockVersion == other.lockVersion && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && availableBalanceAmount == other.availableBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, lockVersion, pendingBalanceAmount, postedBalanceAmount, availableBalanceAmount, showResultingLedgerAccountBalances, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                class LedgerableType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown LedgerableType: $value"
                                )
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

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                            else ->
                                throw ModernTreasuryInvalidDataException("Unknown Status: $value")
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

                    return /* spotless:off */ other is LedgerTransactionCreateRequest && description == other.description && status == other.status && metadata == other.metadata && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && ledgerEntries == other.ledgerEntries && externalId == other.externalId && ledgerableType == other.ledgerableType && ledgerableId == other.ledgerableId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(description, status, metadata, effectiveAt, effectiveDate, ledgerEntries, externalId, ledgerableType, ledgerableId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = LineItemRequest.Builder::class)
            @NoAutoDetect
            class LineItemRequest
            private constructor(
                private val amount: Long,
                private val metadata: Metadata?,
                private val description: String?,
                private val accountingCategoryId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /** A free-form description of the line item. */
                @JsonProperty("description")
                fun description(): Optional<String> = Optional.ofNullable(description)

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(): Optional<String> =
                    Optional.ofNullable(accountingCategoryId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var metadata: Metadata? = null
                    private var description: String? = null
                    private var accountingCategoryId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        metadata = lineItemRequest.metadata
                        description = lineItemRequest.description
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /** A free-form description of the line item. */
                    @JsonProperty("description")
                    fun description(description: String) = apply { this.description = description }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("accounting_category_id")
                    fun accountingCategoryId(accountingCategoryId: String) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            metadata,
                            description,
                            accountingCategoryId,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && metadata == other.metadata && description == other.description && accountingCategoryId == other.accountingCategoryId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, metadata, description, accountingCategoryId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExpectedPaymentCreateRequest && amountUpperBound == other.amountUpperBound && amountLowerBound == other.amountLowerBound && direction == other.direction && internalAccountId == other.internalAccountId && type == other.type && currency == other.currency && dateUpperBound == other.dateUpperBound && dateLowerBound == other.dateLowerBound && description == other.description && statementDescriptor == other.statementDescriptor && metadata == other.metadata && counterpartyId == other.counterpartyId && remittanceInformation == other.remittanceInformation && reconciliationGroups == other.reconciliationGroups && reconciliationFilters == other.reconciliationFilters && reconciliationRuleVariables == other.reconciliationRuleVariables && lineItems == other.lineItems && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountUpperBound, amountLowerBound, direction, internalAccountId, type, currency, dateUpperBound, dateLowerBound, description, statementDescriptor, metadata, counterpartyId, remittanceInformation, reconciliationGroups, reconciliationFilters, reconciliationRuleVariables, lineItems, ledgerTransaction, ledgerTransactionId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedPaymentCreateRequest{amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, description=$description, statementDescriptor=$statementDescriptor, metadata=$metadata, counterpartyId=$counterpartyId, remittanceInformation=$remittanceInformation, reconciliationGroups=$reconciliationGroups, reconciliationFilters=$reconciliationFilters, reconciliationRuleVariables=$reconciliationRuleVariables, lineItems=$lineItems, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = LedgerTransactionCreateRequest.Builder::class)
        @NoAutoDetect
        class LedgerTransactionCreateRequest
        private constructor(
            private val description: String?,
            private val status: Status?,
            private val metadata: Metadata?,
            private val effectiveAt: OffsetDateTime?,
            private val effectiveDate: LocalDate?,
            private val ledgerEntries: List<LedgerEntryCreateRequest>,
            private val externalId: String?,
            private val ledgerableType: LedgerableType?,
            private val ledgerableId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(): Optional<String> = Optional.ofNullable(description)

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            fun ledgerEntries(): List<LedgerEntryCreateRequest> = ledgerEntries

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            @JsonProperty("external_id")
            fun externalId(): Optional<String> = Optional.ofNullable(externalId)

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            @JsonProperty("ledgerable_type")
            fun ledgerableType(): Optional<LedgerableType> = Optional.ofNullable(ledgerableType)

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var description: String? = null
                private var status: Status? = null
                private var metadata: Metadata? = null
                private var effectiveAt: OffsetDateTime? = null
                private var effectiveDate: LocalDate? = null
                private var ledgerEntries: List<LedgerEntryCreateRequest>? = null
                private var externalId: String? = null
                private var ledgerableType: LedgerableType? = null
                private var ledgerableId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                    apply {
                        description = ledgerTransactionCreateRequest.description
                        status = ledgerTransactionCreateRequest.status
                        metadata = ledgerTransactionCreateRequest.metadata
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        ledgerEntries = ledgerTransactionCreateRequest.ledgerEntries.toMutableList()
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                fun effectiveAt(effectiveAt: OffsetDateTime) = apply {
                    this.effectiveAt = effectiveAt
                }

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date")
                fun effectiveDate(effectiveDate: LocalDate) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                    this.ledgerEntries = ledgerEntries
                }

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id")
                fun externalId(externalId: String) = apply { this.externalId = externalId }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(ledgerableType: LedgerableType) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LedgerTransactionCreateRequest =
                    LedgerTransactionCreateRequest(
                        description,
                        status,
                        metadata,
                        effectiveAt,
                        effectiveDate,
                        checkNotNull(ledgerEntries) {
                                "`ledgerEntries` is required but was not set"
                            }
                            .toImmutable(),
                        externalId,
                        ledgerableType,
                        ledgerableId,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerEntryCreateRequest
            private constructor(
                private val amount: Long,
                private val direction: TransactionDirection,
                private val ledgerAccountId: String,
                private val lockVersion: Long?,
                private val pendingBalanceAmount: PendingBalanceAmount?,
                private val postedBalanceAmount: PostedBalanceAmount?,
                private val availableBalanceAmount: AvailableBalanceAmount?,
                private val showResultingLedgerAccountBalances: Boolean?,
                private val metadata: Metadata?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction") fun direction(): TransactionDirection = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id") fun ledgerAccountId(): String = ledgerAccountId

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version")
                fun lockVersion(): Optional<Long> = Optional.ofNullable(lockVersion)

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                    Optional.ofNullable(pendingBalanceAmount)

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                    Optional.ofNullable(postedBalanceAmount)

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                    Optional.ofNullable(availableBalanceAmount)

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                    Optional.ofNullable(showResultingLedgerAccountBalances)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var direction: TransactionDirection? = null
                    private var ledgerAccountId: String? = null
                    private var lockVersion: Long? = null
                    private var pendingBalanceAmount: PendingBalanceAmount? = null
                    private var postedBalanceAmount: PostedBalanceAmount? = null
                    private var availableBalanceAmount: AvailableBalanceAmount? = null
                    private var showResultingLedgerAccountBalances: Boolean? = null
                    private var metadata: Metadata? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        amount = ledgerEntryCreateRequest.amount
                        direction = ledgerEntryCreateRequest.direction
                        ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        lockVersion = ledgerEntryCreateRequest.lockVersion
                        pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                        showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        metadata = ledgerEntryCreateRequest.metadata
                        additionalProperties =
                            ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction")
                    fun direction(direction: TransactionDirection) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    fun ledgerAccountId(ledgerAccountId: String) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    fun lockVersion(lockVersion: Long) = apply { this.lockVersion = lockVersion }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) = apply {
                        this.pendingBalanceAmount = pendingBalanceAmount
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) = apply {
                        this.postedBalanceAmount = postedBalanceAmount
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                        apply {
                            this.availableBalanceAmount = availableBalanceAmount
                        }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): LedgerEntryCreateRequest =
                        LedgerEntryCreateRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(direction) { "`direction` is required but was not set" },
                            checkNotNull(ledgerAccountId) {
                                "`ledgerAccountId` is required but was not set"
                            },
                            lockVersion,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            availableBalanceAmount,
                            showResultingLedgerAccountBalances,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                @NoAutoDetect
                class AvailableBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                            additionalProperties =
                                availableBalanceAmount.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AvailableBalanceAmount =
                            AvailableBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                @NoAutoDetect
                class PendingBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                            additionalProperties =
                                pendingBalanceAmount.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PendingBalanceAmount =
                            PendingBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                @NoAutoDetect
                class PostedBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                            additionalProperties =
                                postedBalanceAmount.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PostedBalanceAmount =
                            PostedBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && lockVersion == other.lockVersion && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && availableBalanceAmount == other.availableBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, lockVersion, pendingBalanceAmount, postedBalanceAmount, availableBalanceAmount, showResultingLedgerAccountBalances, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"
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
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
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

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                return /* spotless:off */ other is LedgerTransactionCreateRequest && description == other.description && status == other.status && metadata == other.metadata && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && ledgerEntries == other.ledgerEntries && externalId == other.externalId && ledgerableType == other.ledgerableType && ledgerableId == other.ledgerableId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(description, status, metadata, effectiveAt, effectiveDate, ledgerEntries, externalId, ledgerableType, ledgerableId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerTransactionCreateRequest{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, ledgerEntries=$ledgerEntries, externalId=$externalId, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = TransactionCreateRequest.Builder::class)
        @NoAutoDetect
        class TransactionCreateRequest
        private constructor(
            private val amount: Long,
            private val direction: String,
            private val vendorDescription: String?,
            private val vendorCode: String?,
            private val vendorCodeType: String?,
            private val asOfDate: LocalDate?,
            private val internalAccountId: String,
            private val metadata: Metadata?,
            private val posted: Boolean?,
            private val type: Type?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") fun amount(): Long = amount

            /** Either `credit` or `debit`. */
            @JsonProperty("direction") fun direction(): String = direction

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            @JsonProperty("vendor_description")
            fun vendorDescription(): Optional<String> = Optional.ofNullable(vendorDescription)

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            @JsonProperty("vendor_code")
            fun vendorCode(): Optional<String> = Optional.ofNullable(vendorCode)

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            @JsonProperty("vendor_code_type")
            fun vendorCodeType(): Optional<String> = Optional.ofNullable(vendorCodeType)

            /** The date on which the transaction occurred. */
            @JsonProperty("as_of_date")
            fun asOfDate(): Optional<LocalDate> = Optional.ofNullable(asOfDate)

            /** The ID of the relevant Internal Account. */
            @JsonProperty("internal_account_id") fun internalAccountId(): String = internalAccountId

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            /** This field will be `true` if the transaction has posted to the account. */
            @JsonProperty("posted") fun posted(): Optional<Boolean> = Optional.ofNullable(posted)

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: Long? = null
                private var direction: String? = null
                private var vendorDescription: String? = null
                private var vendorCode: String? = null
                private var vendorCodeType: String? = null
                private var asOfDate: LocalDate? = null
                private var internalAccountId: String? = null
                private var metadata: Metadata? = null
                private var posted: Boolean? = null
                private var type: Type? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transactionCreateRequest: TransactionCreateRequest) = apply {
                    amount = transactionCreateRequest.amount
                    direction = transactionCreateRequest.direction
                    vendorDescription = transactionCreateRequest.vendorDescription
                    vendorCode = transactionCreateRequest.vendorCode
                    vendorCodeType = transactionCreateRequest.vendorCodeType
                    asOfDate = transactionCreateRequest.asOfDate
                    internalAccountId = transactionCreateRequest.internalAccountId
                    metadata = transactionCreateRequest.metadata
                    posted = transactionCreateRequest.posted
                    type = transactionCreateRequest.type
                    additionalProperties =
                        transactionCreateRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /** Either `credit` or `debit`. */
                @JsonProperty("direction")
                fun direction(direction: String) = apply { this.direction = direction }

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                @JsonProperty("vendor_description")
                fun vendorDescription(vendorDescription: String) = apply {
                    this.vendorDescription = vendorDescription
                }

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                @JsonProperty("vendor_code")
                fun vendorCode(vendorCode: String) = apply { this.vendorCode = vendorCode }

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                @JsonProperty("vendor_code_type")
                fun vendorCodeType(vendorCodeType: String) = apply {
                    this.vendorCodeType = vendorCodeType
                }

                /** The date on which the transaction occurred. */
                @JsonProperty("as_of_date")
                fun asOfDate(asOfDate: LocalDate) = apply { this.asOfDate = asOfDate }

                /** The ID of the relevant Internal Account. */
                @JsonProperty("internal_account_id")
                fun internalAccountId(internalAccountId: String) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                /** This field will be `true` if the transaction has posted to the account. */
                @JsonProperty("posted") fun posted(posted: Boolean) = apply { this.posted = posted }

                /**
                 * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`,
                 * `rtp`, `book`, or `sen`.
                 */
                @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): TransactionCreateRequest =
                    TransactionCreateRequest(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        vendorDescription,
                        vendorCode,
                        vendorCodeType,
                        asOfDate,
                        checkNotNull(internalAccountId) {
                            "`internalAccountId` is required but was not set"
                        },
                        metadata,
                        posted,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

            class Type
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

                    @JvmField val OTHER = of("other")

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
                    OTHER,
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
                    OTHER,
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
                        OTHER -> Value.OTHER
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
                        OTHER -> Known.OTHER
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

                return /* spotless:off */ other is TransactionCreateRequest && amount == other.amount && direction == other.direction && vendorDescription == other.vendorDescription && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && asOfDate == other.asOfDate && internalAccountId == other.internalAccountId && metadata == other.metadata && posted == other.posted && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, direction, vendorDescription, vendorCode, vendorCodeType, asOfDate, internalAccountId, metadata, posted, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionCreateRequest{amount=$amount, direction=$direction, vendorDescription=$vendorDescription, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, asOfDate=$asOfDate, internalAccountId=$internalAccountId, metadata=$metadata, posted=$posted, type=$type, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Id.Builder::class)
        @NoAutoDetect
        class Id
        private constructor(
            private val id: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("id") fun id(): Optional<String> = Optional.ofNullable(id)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(id: Id) = apply {
                    this.id = id.id
                    additionalProperties = id.additionalProperties.toMutableMap()
                }

                @JsonProperty("id") fun id(id: String) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): Id = Id(id, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Id && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Id{id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = PaymentOrderUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class PaymentOrderUpdateRequestWithId
        private constructor(
            private val type: PaymentOrderType?,
            private val subtype: PaymentOrderSubtype?,
            private val amount: Long?,
            private val direction: Direction?,
            private val priority: Priority?,
            private val originatingAccountId: String?,
            private val receivingAccountId: String?,
            private val accounting: Accounting?,
            private val accountingCategoryId: String?,
            private val accountingLedgerClassId: String?,
            private val currency: Currency?,
            private val effectiveDate: LocalDate?,
            private val description: String?,
            private val statementDescriptor: String?,
            private val remittanceInformation: String?,
            private val processAfter: OffsetDateTime?,
            private val purpose: String?,
            private val metadata: Metadata?,
            private val chargeBearer: ChargeBearer?,
            private val foreignExchangeIndicator: ForeignExchangeIndicator?,
            private val foreignExchangeContract: String?,
            private val nsfProtected: Boolean?,
            private val originatingPartyName: String?,
            private val ultimateOriginatingPartyName: String?,
            private val ultimateOriginatingPartyIdentifier: String?,
            private val ultimateReceivingPartyName: String?,
            private val ultimateReceivingPartyIdentifier: String?,
            private val sendRemittanceAdvice: Boolean?,
            private val expiresAt: OffsetDateTime?,
            private val status: Status?,
            private val counterpartyId: String?,
            private val fallbackType: FallbackType?,
            private val receivingAccount: ReceivingAccount?,
            private val lineItems: List<LineItemRequest>?,
            private val id: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") fun type(): Optional<PaymentOrderType> = Optional.ofNullable(type)

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype")
            fun subtype(): Optional<PaymentOrderSubtype> = Optional.ofNullable(subtype)

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") fun amount(): Optional<Long> = Optional.ofNullable(amount)

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction")
            fun direction(): Optional<Direction> = Optional.ofNullable(direction)

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority")
            fun priority(): Optional<Priority> = Optional.ofNullable(priority)

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            fun originatingAccountId(): Optional<String> = Optional.ofNullable(originatingAccountId)

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            fun receivingAccountId(): Optional<String> = Optional.ofNullable(receivingAccountId)

            @JsonProperty("accounting")
            fun accounting(): Optional<Accounting> = Optional.ofNullable(accounting)

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @JsonProperty("accounting_category_id")
            fun accountingCategoryId(): Optional<String> = Optional.ofNullable(accountingCategoryId)

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @JsonProperty("accounting_ledger_class_id")
            fun accountingLedgerClassId(): Optional<String> =
                Optional.ofNullable(accountingLedgerClassId)

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            fun currency(): Optional<Currency> = Optional.ofNullable(currency)

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(): Optional<LocalDate> = Optional.ofNullable(effectiveDate)

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(): Optional<String> = Optional.ofNullable(description)

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): Optional<String> = Optional.ofNullable(statementDescriptor)

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation)

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after")
            fun processAfter(): Optional<OffsetDateTime> = Optional.ofNullable(processAfter)

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            @JsonProperty("purpose") fun purpose(): Optional<String> = Optional.ofNullable(purpose)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer")
            fun chargeBearer(): Optional<ChargeBearer> = Optional.ofNullable(chargeBearer)

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            fun foreignExchangeIndicator(): Optional<ForeignExchangeIndicator> =
                Optional.ofNullable(foreignExchangeIndicator)

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            fun foreignExchangeContract(): Optional<String> =
                Optional.ofNullable(foreignExchangeContract)

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected")
            fun nsfProtected(): Optional<Boolean> = Optional.ofNullable(nsfProtected)

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            fun originatingPartyName(): Optional<String> = Optional.ofNullable(originatingPartyName)

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_name")
            fun ultimateOriginatingPartyName(): Optional<String> =
                Optional.ofNullable(ultimateOriginatingPartyName)

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_identifier")
            fun ultimateOriginatingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(ultimateOriginatingPartyIdentifier)

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_name")
            fun ultimateReceivingPartyName(): Optional<String> =
                Optional.ofNullable(ultimateReceivingPartyName)

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_identifier")
            fun ultimateReceivingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(ultimateReceivingPartyIdentifier)

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            fun sendRemittanceAdvice(): Optional<Boolean> =
                Optional.ofNullable(sendRemittanceAdvice)

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at")
            fun expiresAt(): Optional<OffsetDateTime> = Optional.ofNullable(expiresAt)

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

            /** Required when receiving_account_id is passed the ID of an external account. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            fun fallbackType(): Optional<FallbackType> = Optional.ofNullable(fallbackType)

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            fun receivingAccount(): Optional<ReceivingAccount> =
                Optional.ofNullable(receivingAccount)

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items")
            fun lineItems(): Optional<List<LineItemRequest>> = Optional.ofNullable(lineItems)

            @JsonProperty("id") fun id(): Optional<String> = Optional.ofNullable(id)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var type: PaymentOrderType? = null
                private var subtype: PaymentOrderSubtype? = null
                private var amount: Long? = null
                private var direction: Direction? = null
                private var priority: Priority? = null
                private var originatingAccountId: String? = null
                private var receivingAccountId: String? = null
                private var accounting: Accounting? = null
                private var accountingCategoryId: String? = null
                private var accountingLedgerClassId: String? = null
                private var currency: Currency? = null
                private var effectiveDate: LocalDate? = null
                private var description: String? = null
                private var statementDescriptor: String? = null
                private var remittanceInformation: String? = null
                private var processAfter: OffsetDateTime? = null
                private var purpose: String? = null
                private var metadata: Metadata? = null
                private var chargeBearer: ChargeBearer? = null
                private var foreignExchangeIndicator: ForeignExchangeIndicator? = null
                private var foreignExchangeContract: String? = null
                private var nsfProtected: Boolean? = null
                private var originatingPartyName: String? = null
                private var ultimateOriginatingPartyName: String? = null
                private var ultimateOriginatingPartyIdentifier: String? = null
                private var ultimateReceivingPartyName: String? = null
                private var ultimateReceivingPartyIdentifier: String? = null
                private var sendRemittanceAdvice: Boolean? = null
                private var expiresAt: OffsetDateTime? = null
                private var status: Status? = null
                private var counterpartyId: String? = null
                private var fallbackType: FallbackType? = null
                private var receivingAccount: ReceivingAccount? = null
                private var lineItems: List<LineItemRequest>? = null
                private var id: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                ) = apply {
                    type = paymentOrderUpdateRequestWithId.type
                    subtype = paymentOrderUpdateRequestWithId.subtype
                    amount = paymentOrderUpdateRequestWithId.amount
                    direction = paymentOrderUpdateRequestWithId.direction
                    priority = paymentOrderUpdateRequestWithId.priority
                    originatingAccountId = paymentOrderUpdateRequestWithId.originatingAccountId
                    receivingAccountId = paymentOrderUpdateRequestWithId.receivingAccountId
                    accounting = paymentOrderUpdateRequestWithId.accounting
                    accountingCategoryId = paymentOrderUpdateRequestWithId.accountingCategoryId
                    accountingLedgerClassId =
                        paymentOrderUpdateRequestWithId.accountingLedgerClassId
                    currency = paymentOrderUpdateRequestWithId.currency
                    effectiveDate = paymentOrderUpdateRequestWithId.effectiveDate
                    description = paymentOrderUpdateRequestWithId.description
                    statementDescriptor = paymentOrderUpdateRequestWithId.statementDescriptor
                    remittanceInformation = paymentOrderUpdateRequestWithId.remittanceInformation
                    processAfter = paymentOrderUpdateRequestWithId.processAfter
                    purpose = paymentOrderUpdateRequestWithId.purpose
                    metadata = paymentOrderUpdateRequestWithId.metadata
                    chargeBearer = paymentOrderUpdateRequestWithId.chargeBearer
                    foreignExchangeIndicator =
                        paymentOrderUpdateRequestWithId.foreignExchangeIndicator
                    foreignExchangeContract =
                        paymentOrderUpdateRequestWithId.foreignExchangeContract
                    nsfProtected = paymentOrderUpdateRequestWithId.nsfProtected
                    originatingPartyName = paymentOrderUpdateRequestWithId.originatingPartyName
                    ultimateOriginatingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyName
                    ultimateOriginatingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyIdentifier
                    ultimateReceivingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyName
                    ultimateReceivingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyIdentifier
                    sendRemittanceAdvice = paymentOrderUpdateRequestWithId.sendRemittanceAdvice
                    expiresAt = paymentOrderUpdateRequestWithId.expiresAt
                    status = paymentOrderUpdateRequestWithId.status
                    counterpartyId = paymentOrderUpdateRequestWithId.counterpartyId
                    fallbackType = paymentOrderUpdateRequestWithId.fallbackType
                    receivingAccount = paymentOrderUpdateRequestWithId.receivingAccount
                    lineItems = paymentOrderUpdateRequestWithId.lineItems?.toMutableList()
                    id = paymentOrderUpdateRequestWithId.id
                    additionalProperties =
                        paymentOrderUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                @JsonProperty("type") fun type(type: PaymentOrderType) = apply { this.type = type }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                @JsonProperty("subtype")
                fun subtype(subtype: PaymentOrderSubtype) = apply { this.subtype = subtype }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                fun direction(direction: Direction) = apply { this.direction = direction }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                @JsonProperty("priority")
                fun priority(priority: Priority) = apply { this.priority = priority }

                /** The ID of one of your organization's internal accounts. */
                @JsonProperty("originating_account_id")
                fun originatingAccountId(originatingAccountId: String) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account_id")
                fun receivingAccountId(receivingAccountId: String) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                @JsonProperty("accounting")
                fun accounting(accounting: Accounting) = apply { this.accounting = accounting }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(accountingCategoryId: String) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_ledger_class_id")
                fun accountingLedgerClassId(accountingLedgerClassId: String) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /** Defaults to the currency of the originating account. */
                @JsonProperty("currency")
                fun currency(currency: Currency) = apply { this.currency = currency }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                @JsonProperty("effective_date")
                fun effectiveDate(effectiveDate: LocalDate) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                @JsonProperty("statement_descriptor")
                fun statementDescriptor(statementDescriptor: String) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                fun remittanceInformation(remittanceInformation: String) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                @JsonProperty("process_after")
                fun processAfter(processAfter: OffsetDateTime) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                @JsonProperty("purpose")
                fun purpose(purpose: String) = apply { this.purpose = purpose }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                @JsonProperty("charge_bearer")
                fun chargeBearer(chargeBearer: ChargeBearer) = apply {
                    this.chargeBearer = chargeBearer
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                @JsonProperty("foreign_exchange_indicator")
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator) =
                    apply {
                        this.foreignExchangeIndicator = foreignExchangeIndicator
                    }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                @JsonProperty("foreign_exchange_contract")
                fun foreignExchangeContract(foreignExchangeContract: String) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                @JsonProperty("nsf_protected")
                fun nsfProtected(nsfProtected: Boolean) = apply { this.nsfProtected = nsfProtected }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                @JsonProperty("originating_party_name")
                fun originatingPartyName(originatingPartyName: String) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_originating_party_name")
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String) = apply {
                    this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                }

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_originating_party_identifier")
                fun ultimateOriginatingPartyIdentifier(ultimateOriginatingPartyIdentifier: String) =
                    apply {
                        this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                    }

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_receiving_party_name")
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String) = apply {
                    this.ultimateReceivingPartyName = ultimateReceivingPartyName
                }

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                @JsonProperty("ultimate_receiving_party_identifier")
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String) =
                    apply {
                        this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                    }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                @JsonProperty("send_remittance_advice")
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                @JsonProperty("expires_at")
                fun expiresAt(expiresAt: OffsetDateTime) = apply { this.expiresAt = expiresAt }

                /**
                 * To cancel a payment order, use `cancelled`. To redraft a returned payment order,
                 * use `approved`. To undo approval on a denied or approved payment order, use
                 * `needs_approval`.
                 */
                @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

                /** Required when receiving_account_id is passed the ID of an external account. */
                @JsonProperty("counterparty_id")
                fun counterpartyId(counterpartyId: String) = apply {
                    this.counterpartyId = counterpartyId
                }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                @JsonProperty("fallback_type")
                fun fallbackType(fallbackType: FallbackType) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                @JsonProperty("receiving_account")
                fun receivingAccount(receivingAccount: ReceivingAccount) = apply {
                    this.receivingAccount = receivingAccount
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                @JsonProperty("line_items")
                fun lineItems(lineItems: List<LineItemRequest>) = apply {
                    this.lineItems = lineItems
                }

                @JsonProperty("id") fun id(id: String) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): PaymentOrderUpdateRequestWithId =
                    PaymentOrderUpdateRequestWithId(
                        type,
                        subtype,
                        amount,
                        direction,
                        priority,
                        originatingAccountId,
                        receivingAccountId,
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        currency,
                        effectiveDate,
                        description,
                        statementDescriptor,
                        remittanceInformation,
                        processAfter,
                        purpose,
                        metadata,
                        chargeBearer,
                        foreignExchangeIndicator,
                        foreignExchangeContract,
                        nsfProtected,
                        originatingPartyName,
                        ultimateOriginatingPartyName,
                        ultimateOriginatingPartyIdentifier,
                        ultimateReceivingPartyName,
                        ultimateReceivingPartyIdentifier,
                        sendRemittanceAdvice,
                        expiresAt,
                        status,
                        counterpartyId,
                        fallbackType,
                        receivingAccount,
                        lineItems?.toImmutable(),
                        id,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = Accounting.Builder::class)
            @NoAutoDetect
            class Accounting
            private constructor(
                private val accountId: String?,
                private val classId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id")
                fun accountId(): Optional<String> = Optional.ofNullable(accountId)

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id")
                fun classId(): Optional<String> = Optional.ofNullable(classId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var accountId: String? = null
                    private var classId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accounting: Accounting) = apply {
                        accountId = accounting.accountId
                        classId = accounting.classId
                        additionalProperties = accounting.additionalProperties.toMutableMap()
                    }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("account_id")
                    fun accountId(accountId: String) = apply { this.accountId = accountId }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    @JsonProperty("class_id")
                    fun classId(classId: String) = apply { this.classId = classId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Accounting =
                        Accounting(
                            accountId,
                            classId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Accounting && accountId == other.accountId && classId == other.classId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountId, classId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Accounting{accountId=$accountId, classId=$classId, additionalProperties=$additionalProperties}"
            }

            class ChargeBearer
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SHARED = of("shared")

                    @JvmField val SENDER = of("sender")

                    @JvmField val RECEIVER = of("receiver")

                    @JvmStatic fun of(value: String) = ChargeBearer(JsonField.of(value))
                }

                enum class Known {
                    SHARED,
                    SENDER,
                    RECEIVER,
                }

                enum class Value {
                    SHARED,
                    SENDER,
                    RECEIVER,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SHARED -> Value.SHARED
                        SENDER -> Value.SENDER
                        RECEIVER -> Value.RECEIVER
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SHARED -> Known.SHARED
                        SENDER -> Known.SENDER
                        RECEIVER -> Known.RECEIVER
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown ChargeBearer: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ChargeBearer && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CREDIT = of("credit")

                    @JvmField val DEBIT = of("debit")

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                enum class Value {
                    CREDIT,
                    DEBIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class FallbackType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACH = of("ach")

                    @JvmStatic fun of(value: String) = FallbackType(JsonField.of(value))
                }

                enum class Known {
                    ACH,
                }

                enum class Value {
                    ACH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH -> Value.ACH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH -> Known.ACH
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown FallbackType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is FallbackType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ForeignExchangeIndicator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FIXED_TO_VARIABLE = of("fixed_to_variable")

                    @JvmField val VARIABLE_TO_FIXED = of("variable_to_fixed")

                    @JvmStatic fun of(value: String) = ForeignExchangeIndicator(JsonField.of(value))
                }

                enum class Known {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                }

                enum class Value {
                    FIXED_TO_VARIABLE,
                    VARIABLE_TO_FIXED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FIXED_TO_VARIABLE -> Value.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Value.VARIABLE_TO_FIXED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FIXED_TO_VARIABLE -> Known.FIXED_TO_VARIABLE
                        VARIABLE_TO_FIXED -> Known.VARIABLE_TO_FIXED
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown ForeignExchangeIndicator: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ForeignExchangeIndicator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @JsonDeserialize(builder = LineItemRequest.Builder::class)
            @NoAutoDetect
            class LineItemRequest
            private constructor(
                private val amount: Long,
                private val metadata: Metadata?,
                private val description: String?,
                private val accountingCategoryId: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /** A free-form description of the line item. */
                @JsonProperty("description")
                fun description(): Optional<String> = Optional.ofNullable(description)

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                fun accountingCategoryId(): Optional<String> =
                    Optional.ofNullable(accountingCategoryId)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var metadata: Metadata? = null
                    private var description: String? = null
                    private var accountingCategoryId: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        metadata = lineItemRequest.metadata
                        description = lineItemRequest.description
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /** A free-form description of the line item. */
                    @JsonProperty("description")
                    fun description(description: String) = apply { this.description = description }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    @JsonProperty("accounting_category_id")
                    fun accountingCategoryId(accountingCategoryId: String) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): LineItemRequest =
                        LineItemRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            metadata,
                            description,
                            accountingCategoryId,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && metadata == other.metadata && description == other.description && accountingCategoryId == other.accountingCategoryId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, metadata, description, accountingCategoryId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, metadata=$metadata, description=$description, accountingCategoryId=$accountingCategoryId, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonDeserialize(builder = ReceivingAccount.Builder::class)
            @NoAutoDetect
            class ReceivingAccount
            private constructor(
                private val accountType: ExternalAccountType?,
                private val partyType: PartyType?,
                private val partyAddress: AddressRequest?,
                private val name: String?,
                private val accountDetails: List<AccountDetail>?,
                private val routingDetails: List<RoutingDetail>?,
                private val metadata: Metadata?,
                private val partyName: String?,
                private val partyIdentifier: String?,
                private val ledgerAccount: LedgerAccountCreateRequest?,
                private val plaidProcessorToken: String?,
                private val contactDetails: List<ContactDetailCreateRequest>?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type")
                fun accountType(): Optional<ExternalAccountType> = Optional.ofNullable(accountType)

                /** Either `individual` or `business`. */
                @JsonProperty("party_type")
                fun partyType(): Optional<PartyType> = Optional.ofNullable(partyType)

                /** Required if receiving wire payments. */
                @JsonProperty("party_address")
                fun partyAddress(): Optional<AddressRequest> = Optional.ofNullable(partyAddress)

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

                @JsonProperty("account_details")
                fun accountDetails(): Optional<List<AccountDetail>> =
                    Optional.ofNullable(accountDetails)

                @JsonProperty("routing_details")
                fun routingDetails(): Optional<List<RoutingDetail>> =
                    Optional.ofNullable(routingDetails)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name")
                fun partyName(): Optional<String> = Optional.ofNullable(partyName)

                @JsonProperty("party_identifier")
                fun partyIdentifier(): Optional<String> = Optional.ofNullable(partyIdentifier)

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account")
                fun ledgerAccount(): Optional<LedgerAccountCreateRequest> =
                    Optional.ofNullable(ledgerAccount)

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                fun plaidProcessorToken(): Optional<String> =
                    Optional.ofNullable(plaidProcessorToken)

                @JsonProperty("contact_details")
                fun contactDetails(): Optional<List<ContactDetailCreateRequest>> =
                    Optional.ofNullable(contactDetails)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var accountType: ExternalAccountType? = null
                    private var partyType: PartyType? = null
                    private var partyAddress: AddressRequest? = null
                    private var name: String? = null
                    private var accountDetails: List<AccountDetail>? = null
                    private var routingDetails: List<RoutingDetail>? = null
                    private var metadata: Metadata? = null
                    private var partyName: String? = null
                    private var partyIdentifier: String? = null
                    private var ledgerAccount: LedgerAccountCreateRequest? = null
                    private var plaidProcessorToken: String? = null
                    private var contactDetails: List<ContactDetailCreateRequest>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountType = receivingAccount.accountType
                        partyType = receivingAccount.partyType
                        partyAddress = receivingAccount.partyAddress
                        name = receivingAccount.name
                        accountDetails = receivingAccount.accountDetails?.toMutableList()
                        routingDetails = receivingAccount.routingDetails?.toMutableList()
                        metadata = receivingAccount.metadata
                        partyName = receivingAccount.partyName
                        partyIdentifier = receivingAccount.partyIdentifier
                        ledgerAccount = receivingAccount.ledgerAccount
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        contactDetails = receivingAccount.contactDetails?.toMutableList()
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    @JsonProperty("account_type")
                    fun accountType(accountType: ExternalAccountType) = apply {
                        this.accountType = accountType
                    }

                    /** Either `individual` or `business`. */
                    @JsonProperty("party_type")
                    fun partyType(partyType: PartyType) = apply { this.partyType = partyType }

                    /** Required if receiving wire payments. */
                    @JsonProperty("party_address")
                    fun partyAddress(partyAddress: AddressRequest) = apply {
                        this.partyAddress = partyAddress
                    }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                    @JsonProperty("account_details")
                    fun accountDetails(accountDetails: List<AccountDetail>) = apply {
                        this.accountDetails = accountDetails
                    }

                    @JsonProperty("routing_details")
                    fun routingDetails(routingDetails: List<RoutingDetail>) = apply {
                        this.routingDetails = routingDetails
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    @JsonProperty("party_name")
                    fun partyName(partyName: String) = apply { this.partyName = partyName }

                    @JsonProperty("party_identifier")
                    fun partyIdentifier(partyIdentifier: String) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    @JsonProperty("ledger_account")
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) = apply {
                        this.ledgerAccount = ledgerAccount
                    }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    @JsonProperty("plaid_processor_token")
                    fun plaidProcessorToken(plaidProcessorToken: String) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    @JsonProperty("contact_details")
                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) = apply {
                        this.contactDetails = contactDetails
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): ReceivingAccount =
                        ReceivingAccount(
                            accountType,
                            partyType,
                            partyAddress,
                            name,
                            accountDetails?.toImmutable(),
                            routingDetails?.toImmutable(),
                            metadata,
                            partyName,
                            partyIdentifier,
                            ledgerAccount,
                            plaidProcessorToken,
                            contactDetails?.toImmutable(),
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = AccountDetail.Builder::class)
                @NoAutoDetect
                class AccountDetail
                private constructor(
                    private val accountNumber: String,
                    private val accountNumberType: AccountNumberType?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("account_number") fun accountNumber(): String = accountNumber

                    @JsonProperty("account_number_type")
                    fun accountNumberType(): Optional<AccountNumberType> =
                        Optional.ofNullable(accountNumberType)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var accountNumber: String? = null
                        private var accountNumberType: AccountNumberType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        @JsonProperty("account_number")
                        fun accountNumber(accountNumber: String) = apply {
                            this.accountNumber = accountNumber
                        }

                        @JsonProperty("account_number_type")
                        fun accountNumberType(accountNumberType: AccountNumberType) = apply {
                            this.accountNumberType = accountNumberType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AccountDetail =
                            AccountDetail(
                                checkNotNull(accountNumber) {
                                    "`accountNumber` is required but was not set"
                                },
                                accountNumberType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AccountNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val AU_NUMBER = of("au_number")

                            @JvmField val CLABE = of("clabe")

                            @JvmField val HK_NUMBER = of("hk_number")

                            @JvmField val IBAN = of("iban")

                            @JvmField val ID_NUMBER = of("id_number")

                            @JvmField val NZ_NUMBER = of("nz_number")

                            @JvmField val OTHER = of("other")

                            @JvmField val PAN = of("pan")

                            @JvmField val SG_NUMBER = of("sg_number")

                            @JvmField val WALLET_ADDRESS = of("wallet_address")

                            @JvmStatic
                            fun of(value: String) = AccountNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                        }

                        enum class Value {
                            AU_NUMBER,
                            CLABE,
                            HK_NUMBER,
                            IBAN,
                            ID_NUMBER,
                            NZ_NUMBER,
                            OTHER,
                            PAN,
                            SG_NUMBER,
                            WALLET_ADDRESS,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                AU_NUMBER -> Value.AU_NUMBER
                                CLABE -> Value.CLABE
                                HK_NUMBER -> Value.HK_NUMBER
                                IBAN -> Value.IBAN
                                ID_NUMBER -> Value.ID_NUMBER
                                NZ_NUMBER -> Value.NZ_NUMBER
                                OTHER -> Value.OTHER
                                PAN -> Value.PAN
                                SG_NUMBER -> Value.SG_NUMBER
                                WALLET_ADDRESS -> Value.WALLET_ADDRESS
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                AU_NUMBER -> Known.AU_NUMBER
                                CLABE -> Known.CLABE
                                HK_NUMBER -> Known.HK_NUMBER
                                IBAN -> Known.IBAN
                                ID_NUMBER -> Known.ID_NUMBER
                                NZ_NUMBER -> Known.NZ_NUMBER
                                OTHER -> Known.OTHER
                                PAN -> Known.PAN
                                SG_NUMBER -> Known.SG_NUMBER
                                WALLET_ADDRESS -> Known.WALLET_ADDRESS
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown AccountNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is AccountNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AccountDetail && accountNumber == other.accountNumber && accountNumberType == other.accountNumberType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(accountNumber, accountNumberType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AccountDetail{accountNumber=$accountNumber, accountNumberType=$accountNumberType, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = ContactDetailCreateRequest.Builder::class)
                @NoAutoDetect
                class ContactDetailCreateRequest
                private constructor(
                    private val contactIdentifier: String?,
                    private val contactIdentifierType: ContactIdentifierType?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("contact_identifier")
                    fun contactIdentifier(): Optional<String> =
                        Optional.ofNullable(contactIdentifier)

                    @JsonProperty("contact_identifier_type")
                    fun contactIdentifierType(): Optional<ContactIdentifierType> =
                        Optional.ofNullable(contactIdentifierType)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var contactIdentifier: String? = null
                        private var contactIdentifierType: ContactIdentifierType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(contactDetailCreateRequest: ContactDetailCreateRequest) =
                            apply {
                                contactIdentifier = contactDetailCreateRequest.contactIdentifier
                                contactIdentifierType =
                                    contactDetailCreateRequest.contactIdentifierType
                                additionalProperties =
                                    contactDetailCreateRequest.additionalProperties.toMutableMap()
                            }

                        @JsonProperty("contact_identifier")
                        fun contactIdentifier(contactIdentifier: String) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        @JsonProperty("contact_identifier_type")
                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                            apply {
                                this.contactIdentifierType = contactIdentifierType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): ContactDetailCreateRequest =
                            ContactDetailCreateRequest(
                                contactIdentifier,
                                contactIdentifierType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class ContactIdentifierType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val EMAIL = of("email")

                            @JvmField val PHONE_NUMBER = of("phone_number")

                            @JvmField val WEBSITE = of("website")

                            @JvmStatic
                            fun of(value: String) = ContactIdentifierType(JsonField.of(value))
                        }

                        enum class Known {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                        }

                        enum class Value {
                            EMAIL,
                            PHONE_NUMBER,
                            WEBSITE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                EMAIL -> Value.EMAIL
                                PHONE_NUMBER -> Value.PHONE_NUMBER
                                WEBSITE -> Value.WEBSITE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                EMAIL -> Known.EMAIL
                                PHONE_NUMBER -> Known.PHONE_NUMBER
                                WEBSITE -> Known.WEBSITE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown ContactIdentifierType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ContactIdentifierType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ContactDetailCreateRequest && contactIdentifier == other.contactIdentifier && contactIdentifierType == other.contactIdentifierType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(contactIdentifier, contactIdentifierType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ContactDetailCreateRequest{contactIdentifier=$contactIdentifier, contactIdentifierType=$contactIdentifierType, additionalProperties=$additionalProperties}"
                }

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonDeserialize(builder = LedgerAccountCreateRequest.Builder::class)
                @NoAutoDetect
                class LedgerAccountCreateRequest
                private constructor(
                    private val name: String,
                    private val description: String?,
                    private val normalBalance: TransactionDirection,
                    private val ledgerId: String,
                    private val currency: String,
                    private val currencyExponent: Long?,
                    private val ledgerAccountCategoryIds: List<String>?,
                    private val ledgerableId: String?,
                    private val ledgerableType: LedgerableType?,
                    private val metadata: Metadata?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The name of the ledger account. */
                    @JsonProperty("name") fun name(): String = name

                    /** The description of the ledger account. */
                    @JsonProperty("description")
                    fun description(): Optional<String> = Optional.ofNullable(description)

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    fun normalBalance(): TransactionDirection = normalBalance

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id") fun ledgerId(): String = ledgerId

                    /** The currency of the ledger account. */
                    @JsonProperty("currency") fun currency(): String = currency

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    fun currencyExponent(): Optional<Long> = Optional.ofNullable(currencyExponent)

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    fun ledgerAccountCategoryIds(): Optional<List<String>> =
                        Optional.ofNullable(ledgerAccountCategoryIds)

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    fun ledgerableType(): Optional<LedgerableType> =
                        Optional.ofNullable(ledgerableType)

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var name: String? = null
                        private var description: String? = null
                        private var normalBalance: TransactionDirection? = null
                        private var ledgerId: String? = null
                        private var currency: String? = null
                        private var currencyExponent: Long? = null
                        private var ledgerAccountCategoryIds: List<String>? = null
                        private var ledgerableId: String? = null
                        private var ledgerableType: LedgerableType? = null
                        private var metadata: Metadata? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                name = ledgerAccountCreateRequest.name
                                description = ledgerAccountCreateRequest.description
                                normalBalance = ledgerAccountCreateRequest.normalBalance
                                ledgerId = ledgerAccountCreateRequest.ledgerId
                                currency = ledgerAccountCreateRequest.currency
                                currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds
                                        ?.toMutableList()
                                ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties =
                                    ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                            }

                        /** The name of the ledger account. */
                        @JsonProperty("name") fun name(name: String) = apply { this.name = name }

                        /** The description of the ledger account. */
                        @JsonProperty("description")
                        fun description(description: String) = apply {
                            this.description = description
                        }

                        /** The normal balance of the ledger account. */
                        @JsonProperty("normal_balance")
                        fun normalBalance(normalBalance: TransactionDirection) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The id of the ledger that this account belongs to. */
                        @JsonProperty("ledger_id")
                        fun ledgerId(ledgerId: String) = apply { this.ledgerId = ledgerId }

                        /** The currency of the ledger account. */
                        @JsonProperty("currency")
                        fun currency(currency: String) = apply { this.currency = currency }

                        /** The currency exponent of the ledger account. */
                        @JsonProperty("currency_exponent")
                        fun currencyExponent(currencyExponent: Long) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        @JsonProperty("ledger_account_category_ids")
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                            apply {
                                this.ledgerAccountCategoryIds = ledgerAccountCategoryIds
                            }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        @JsonProperty("ledgerable_id")
                        fun ledgerableId(ledgerableId: String) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        @JsonProperty("ledgerable_type")
                        fun ledgerableType(ledgerableType: LedgerableType) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        @JsonProperty("metadata")
                        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): LedgerAccountCreateRequest =
                            LedgerAccountCreateRequest(
                                checkNotNull(name) { "`name` is required but was not set" },
                                description,
                                checkNotNull(normalBalance) {
                                    "`normalBalance` is required but was not set"
                                },
                                checkNotNull(ledgerId) { "`ledgerId` is required but was not set" },
                                checkNotNull(currency) { "`currency` is required but was not set" },
                                currencyExponent,
                                ledgerAccountCategoryIds?.toImmutable(),
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class LedgerableType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val COUNTERPARTY = of("counterparty")

                            @JvmField val EXTERNAL_ACCOUNT = of("external_account")

                            @JvmField val INTERNAL_ACCOUNT = of("internal_account")

                            @JvmField val VIRTUAL_ACCOUNT = of("virtual_account")

                            @JvmStatic fun of(value: String) = LedgerableType(JsonField.of(value))
                        }

                        enum class Known {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                        }

                        enum class Value {
                            COUNTERPARTY,
                            EXTERNAL_ACCOUNT,
                            INTERNAL_ACCOUNT,
                            VIRTUAL_ACCOUNT,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                COUNTERPARTY -> Value.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Value.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Value.VIRTUAL_ACCOUNT
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                COUNTERPARTY -> Known.COUNTERPARTY
                                EXTERNAL_ACCOUNT -> Known.EXTERNAL_ACCOUNT
                                INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                                VIRTUAL_ACCOUNT -> Known.VIRTUAL_ACCOUNT
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown LedgerableType: $value"
                                    )
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

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonDeserialize(builder = Metadata.Builder::class)
                    @NoAutoDetect
                    class Metadata
                    private constructor(
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder {

                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(metadata: Metadata) = apply {
                                additionalProperties = metadata.additionalProperties.toMutableMap()
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

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

                        override fun toString() =
                            "Metadata{additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is LedgerAccountCreateRequest && name == other.name && description == other.description && normalBalance == other.normalBalance && ledgerId == other.ledgerId && currency == other.currency && currencyExponent == other.currencyExponent && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(name, description, normalBalance, ledgerId, currency, currencyExponent, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerAccountCreateRequest{name=$name, description=$description, normalBalance=$normalBalance, ledgerId=$ledgerId, currency=$currency, currencyExponent=$currencyExponent, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                /** Required if receiving wire payments. */
                @JsonDeserialize(builder = AddressRequest.Builder::class)
                @NoAutoDetect
                class AddressRequest
                private constructor(
                    private val line1: String?,
                    private val line2: String?,
                    private val locality: String?,
                    private val region: String?,
                    private val postalCode: String?,
                    private val country: String?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("line1")
                    fun line1(): Optional<String> = Optional.ofNullable(line1)

                    @JsonProperty("line2")
                    fun line2(): Optional<String> = Optional.ofNullable(line2)

                    /** Locality or City. */
                    @JsonProperty("locality")
                    fun locality(): Optional<String> = Optional.ofNullable(locality)

                    /** Region or State. */
                    @JsonProperty("region")
                    fun region(): Optional<String> = Optional.ofNullable(region)

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    fun postalCode(): Optional<String> = Optional.ofNullable(postalCode)

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    fun country(): Optional<String> = Optional.ofNullable(country)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var line1: String? = null
                        private var line2: String? = null
                        private var locality: String? = null
                        private var region: String? = null
                        private var postalCode: String? = null
                        private var country: String? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addressRequest: AddressRequest) = apply {
                            line1 = addressRequest.line1
                            line2 = addressRequest.line2
                            locality = addressRequest.locality
                            region = addressRequest.region
                            postalCode = addressRequest.postalCode
                            country = addressRequest.country
                            additionalProperties =
                                addressRequest.additionalProperties.toMutableMap()
                        }

                        @JsonProperty("line1")
                        fun line1(line1: String) = apply { this.line1 = line1 }

                        @JsonProperty("line2")
                        fun line2(line2: String) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        @JsonProperty("locality")
                        fun locality(locality: String) = apply { this.locality = locality }

                        /** Region or State. */
                        @JsonProperty("region")
                        fun region(region: String) = apply { this.region = region }

                        /** The postal code of the address. */
                        @JsonProperty("postal_code")
                        fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        @JsonProperty("country")
                        fun country(country: String) = apply { this.country = country }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AddressRequest =
                            AddressRequest(
                                line1,
                                line2,
                                locality,
                                region,
                                postalCode,
                                country,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddressRequest && line1 == other.line1 && line2 == other.line2 && locality == other.locality && region == other.region && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(line1, line2, locality, region, postalCode, country, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddressRequest{line1=$line1, line2=$line2, locality=$locality, region=$region, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
                }

                class PartyType
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val BUSINESS = of("business")

                        @JvmField val INDIVIDUAL = of("individual")

                        @JvmStatic fun of(value: String) = PartyType(JsonField.of(value))
                    }

                    enum class Known {
                        BUSINESS,
                        INDIVIDUAL,
                    }

                    enum class Value {
                        BUSINESS,
                        INDIVIDUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            BUSINESS -> Value.BUSINESS
                            INDIVIDUAL -> Value.INDIVIDUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            BUSINESS -> Known.BUSINESS
                            INDIVIDUAL -> Known.INDIVIDUAL
                            else ->
                                throw ModernTreasuryInvalidDataException(
                                    "Unknown PartyType: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PartyType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                @JsonDeserialize(builder = RoutingDetail.Builder::class)
                @NoAutoDetect
                class RoutingDetail
                private constructor(
                    private val routingNumber: String,
                    private val routingNumberType: RoutingNumberType,
                    private val paymentType: PaymentType?,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonProperty("routing_number") fun routingNumber(): String = routingNumber

                    @JsonProperty("routing_number_type")
                    fun routingNumberType(): RoutingNumberType = routingNumberType

                    @JsonProperty("payment_type")
                    fun paymentType(): Optional<PaymentType> = Optional.ofNullable(paymentType)

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var routingNumber: String? = null
                        private var routingNumberType: RoutingNumberType? = null
                        private var paymentType: PaymentType? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        @JsonProperty("routing_number")
                        fun routingNumber(routingNumber: String) = apply {
                            this.routingNumber = routingNumber
                        }

                        @JsonProperty("routing_number_type")
                        fun routingNumberType(routingNumberType: RoutingNumberType) = apply {
                            this.routingNumberType = routingNumberType
                        }

                        @JsonProperty("payment_type")
                        fun paymentType(paymentType: PaymentType) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): RoutingDetail =
                            RoutingDetail(
                                checkNotNull(routingNumber) {
                                    "`routingNumber` is required but was not set"
                                },
                                checkNotNull(routingNumberType) {
                                    "`routingNumberType` is required but was not set"
                                },
                                paymentType,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class RoutingNumberType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val ABA = of("aba")

                            @JvmField val AU_BSB = of("au_bsb")

                            @JvmField val BR_CODIGO = of("br_codigo")

                            @JvmField val CA_CPA = of("ca_cpa")

                            @JvmField val CHIPS = of("chips")

                            @JvmField val CNAPS = of("cnaps")

                            @JvmField
                            val DK_INTERBANK_CLEARING_CODE = of("dk_interbank_clearing_code")

                            @JvmField val GB_SORT_CODE = of("gb_sort_code")

                            @JvmField
                            val HK_INTERBANK_CLEARING_CODE = of("hk_interbank_clearing_code")

                            @JvmField
                            val HU_INTERBANK_CLEARING_CODE = of("hu_interbank_clearing_code")

                            @JvmField val ID_SKNBI_CODE = of("id_sknbi_code")

                            @JvmField val IN_IFSC = of("in_ifsc")

                            @JvmField val JP_ZENGIN_CODE = of("jp_zengin_code")

                            @JvmField val MY_BRANCH_CODE = of("my_branch_code")

                            @JvmField val MX_BANK_IDENTIFIER = of("mx_bank_identifier")

                            @JvmField
                            val NZ_NATIONAL_CLEARING_CODE = of("nz_national_clearing_code")

                            @JvmField
                            val PL_NATIONAL_CLEARING_CODE = of("pl_national_clearing_code")

                            @JvmField
                            val SE_BANKGIRO_CLEARING_CODE = of("se_bankgiro_clearing_code")

                            @JvmField val SWIFT = of("swift")

                            @JvmField
                            val ZA_NATIONAL_CLEARING_CODE = of("za_national_clearing_code")

                            @JvmStatic
                            fun of(value: String) = RoutingNumberType(JsonField.of(value))
                        }

                        enum class Known {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                        }

                        enum class Value {
                            ABA,
                            AU_BSB,
                            BR_CODIGO,
                            CA_CPA,
                            CHIPS,
                            CNAPS,
                            DK_INTERBANK_CLEARING_CODE,
                            GB_SORT_CODE,
                            HK_INTERBANK_CLEARING_CODE,
                            HU_INTERBANK_CLEARING_CODE,
                            ID_SKNBI_CODE,
                            IN_IFSC,
                            JP_ZENGIN_CODE,
                            MY_BRANCH_CODE,
                            MX_BANK_IDENTIFIER,
                            NZ_NATIONAL_CLEARING_CODE,
                            PL_NATIONAL_CLEARING_CODE,
                            SE_BANKGIRO_CLEARING_CODE,
                            SWIFT,
                            ZA_NATIONAL_CLEARING_CODE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                ABA -> Value.ABA
                                AU_BSB -> Value.AU_BSB
                                BR_CODIGO -> Value.BR_CODIGO
                                CA_CPA -> Value.CA_CPA
                                CHIPS -> Value.CHIPS
                                CNAPS -> Value.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Value.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Value.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Value.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Value.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Value.ID_SKNBI_CODE
                                IN_IFSC -> Value.IN_IFSC
                                JP_ZENGIN_CODE -> Value.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Value.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Value.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Value.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Value.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Value.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Value.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Value.ZA_NATIONAL_CLEARING_CODE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                ABA -> Known.ABA
                                AU_BSB -> Known.AU_BSB
                                BR_CODIGO -> Known.BR_CODIGO
                                CA_CPA -> Known.CA_CPA
                                CHIPS -> Known.CHIPS
                                CNAPS -> Known.CNAPS
                                DK_INTERBANK_CLEARING_CODE -> Known.DK_INTERBANK_CLEARING_CODE
                                GB_SORT_CODE -> Known.GB_SORT_CODE
                                HK_INTERBANK_CLEARING_CODE -> Known.HK_INTERBANK_CLEARING_CODE
                                HU_INTERBANK_CLEARING_CODE -> Known.HU_INTERBANK_CLEARING_CODE
                                ID_SKNBI_CODE -> Known.ID_SKNBI_CODE
                                IN_IFSC -> Known.IN_IFSC
                                JP_ZENGIN_CODE -> Known.JP_ZENGIN_CODE
                                MY_BRANCH_CODE -> Known.MY_BRANCH_CODE
                                MX_BANK_IDENTIFIER -> Known.MX_BANK_IDENTIFIER
                                NZ_NATIONAL_CLEARING_CODE -> Known.NZ_NATIONAL_CLEARING_CODE
                                PL_NATIONAL_CLEARING_CODE -> Known.PL_NATIONAL_CLEARING_CODE
                                SE_BANKGIRO_CLEARING_CODE -> Known.SE_BANKGIRO_CLEARING_CODE
                                SWIFT -> Known.SWIFT
                                ZA_NATIONAL_CLEARING_CODE -> Known.ZA_NATIONAL_CLEARING_CODE
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown RoutingNumberType: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is RoutingNumberType && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class PaymentType
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

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
                                else ->
                                    throw ModernTreasuryInvalidDataException(
                                        "Unknown PaymentType: $value"
                                    )
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RoutingDetail && routingNumber == other.routingNumber && routingNumberType == other.routingNumberType && paymentType == other.paymentType && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(routingNumber, routingNumberType, paymentType, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RoutingDetail{routingNumber=$routingNumber, routingNumberType=$routingNumberType, paymentType=$paymentType, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ReceivingAccount && accountType == other.accountType && partyType == other.partyType && partyAddress == other.partyAddress && name == other.name && accountDetails == other.accountDetails && routingDetails == other.routingDetails && metadata == other.metadata && partyName == other.partyName && partyIdentifier == other.partyIdentifier && ledgerAccount == other.ledgerAccount && plaidProcessorToken == other.plaidProcessorToken && contactDetails == other.contactDetails && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountType, partyType, partyAddress, name, accountDetails, routingDetails, metadata, partyName, partyIdentifier, ledgerAccount, plaidProcessorToken, contactDetails, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ReceivingAccount{accountType=$accountType, partyType=$partyType, partyAddress=$partyAddress, name=$name, accountDetails=$accountDetails, routingDetails=$routingDetails, metadata=$metadata, partyName=$partyName, partyIdentifier=$partyIdentifier, ledgerAccount=$ledgerAccount, plaidProcessorToken=$plaidProcessorToken, contactDetails=$contactDetails, additionalProperties=$additionalProperties}"
            }

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                return /* spotless:off */ other is PaymentOrderUpdateRequestWithId && type == other.type && subtype == other.subtype && amount == other.amount && direction == other.direction && priority == other.priority && originatingAccountId == other.originatingAccountId && receivingAccountId == other.receivingAccountId && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && currency == other.currency && effectiveDate == other.effectiveDate && description == other.description && statementDescriptor == other.statementDescriptor && remittanceInformation == other.remittanceInformation && processAfter == other.processAfter && purpose == other.purpose && metadata == other.metadata && chargeBearer == other.chargeBearer && foreignExchangeIndicator == other.foreignExchangeIndicator && foreignExchangeContract == other.foreignExchangeContract && nsfProtected == other.nsfProtected && originatingPartyName == other.originatingPartyName && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && sendRemittanceAdvice == other.sendRemittanceAdvice && expiresAt == other.expiresAt && status == other.status && counterpartyId == other.counterpartyId && fallbackType == other.fallbackType && receivingAccount == other.receivingAccount && lineItems == other.lineItems && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(type, subtype, amount, direction, priority, originatingAccountId, receivingAccountId, accounting, accountingCategoryId, accountingLedgerClassId, currency, effectiveDate, description, statementDescriptor, remittanceInformation, processAfter, purpose, metadata, chargeBearer, foreignExchangeIndicator, foreignExchangeContract, nsfProtected, originatingPartyName, ultimateOriginatingPartyName, ultimateOriginatingPartyIdentifier, ultimateReceivingPartyName, ultimateReceivingPartyIdentifier, sendRemittanceAdvice, expiresAt, status, counterpartyId, fallbackType, receivingAccount, lineItems, id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderUpdateRequestWithId{type=$type, subtype=$subtype, amount=$amount, direction=$direction, priority=$priority, originatingAccountId=$originatingAccountId, receivingAccountId=$receivingAccountId, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, currency=$currency, effectiveDate=$effectiveDate, description=$description, statementDescriptor=$statementDescriptor, remittanceInformation=$remittanceInformation, processAfter=$processAfter, purpose=$purpose, metadata=$metadata, chargeBearer=$chargeBearer, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeContract=$foreignExchangeContract, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, sendRemittanceAdvice=$sendRemittanceAdvice, expiresAt=$expiresAt, status=$status, counterpartyId=$counterpartyId, fallbackType=$fallbackType, receivingAccount=$receivingAccount, lineItems=$lineItems, id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ExpectedPaymentUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class ExpectedPaymentUpdateRequestWithId
        private constructor(
            private val amountUpperBound: Long?,
            private val amountLowerBound: Long?,
            private val direction: Direction?,
            private val internalAccountId: String?,
            private val type: ExpectedPaymentType?,
            private val currency: Currency?,
            private val dateUpperBound: LocalDate?,
            private val dateLowerBound: LocalDate?,
            private val description: String?,
            private val statementDescriptor: String?,
            private val metadata: Metadata?,
            private val counterpartyId: String?,
            private val remittanceInformation: String?,
            private val reconciliationGroups: JsonValue?,
            private val reconciliationFilters: JsonValue?,
            private val reconciliationRuleVariables: List<ReconciliationRule>?,
            private val status: Status?,
            private val id: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            fun amountUpperBound(): Optional<Long> = Optional.ofNullable(amountUpperBound)

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            fun amountLowerBound(): Optional<Long> = Optional.ofNullable(amountLowerBound)

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction")
            fun direction(): Optional<Direction> = Optional.ofNullable(direction)

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            fun internalAccountId(): Optional<String> = Optional.ofNullable(internalAccountId)

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type")
            fun type(): Optional<ExpectedPaymentType> = Optional.ofNullable(type)

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency")
            fun currency(): Optional<Currency> = Optional.ofNullable(currency)

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound")
            fun dateUpperBound(): Optional<LocalDate> = Optional.ofNullable(dateUpperBound)

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound")
            fun dateLowerBound(): Optional<LocalDate> = Optional.ofNullable(dateLowerBound)

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(): Optional<String> = Optional.ofNullable(description)

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            fun statementDescriptor(): Optional<String> = Optional.ofNullable(statementDescriptor)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id")
            fun counterpartyId(): Optional<String> = Optional.ofNullable(counterpartyId)

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation)

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            fun reconciliationGroups(): Optional<JsonValue> =
                Optional.ofNullable(reconciliationGroups)

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            fun reconciliationFilters(): Optional<JsonValue> =
                Optional.ofNullable(reconciliationFilters)

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            fun reconciliationRuleVariables(): Optional<List<ReconciliationRule>> =
                Optional.ofNullable(reconciliationRuleVariables)

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

            @JsonProperty("id") fun id(): Optional<String> = Optional.ofNullable(id)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amountUpperBound: Long? = null
                private var amountLowerBound: Long? = null
                private var direction: Direction? = null
                private var internalAccountId: String? = null
                private var type: ExpectedPaymentType? = null
                private var currency: Currency? = null
                private var dateUpperBound: LocalDate? = null
                private var dateLowerBound: LocalDate? = null
                private var description: String? = null
                private var statementDescriptor: String? = null
                private var metadata: Metadata? = null
                private var counterpartyId: String? = null
                private var remittanceInformation: String? = null
                private var reconciliationGroups: JsonValue? = null
                private var reconciliationFilters: JsonValue? = null
                private var reconciliationRuleVariables: List<ReconciliationRule>? = null
                private var status: Status? = null
                private var id: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                ) = apply {
                    amountUpperBound = expectedPaymentUpdateRequestWithId.amountUpperBound
                    amountLowerBound = expectedPaymentUpdateRequestWithId.amountLowerBound
                    direction = expectedPaymentUpdateRequestWithId.direction
                    internalAccountId = expectedPaymentUpdateRequestWithId.internalAccountId
                    type = expectedPaymentUpdateRequestWithId.type
                    currency = expectedPaymentUpdateRequestWithId.currency
                    dateUpperBound = expectedPaymentUpdateRequestWithId.dateUpperBound
                    dateLowerBound = expectedPaymentUpdateRequestWithId.dateLowerBound
                    description = expectedPaymentUpdateRequestWithId.description
                    statementDescriptor = expectedPaymentUpdateRequestWithId.statementDescriptor
                    metadata = expectedPaymentUpdateRequestWithId.metadata
                    counterpartyId = expectedPaymentUpdateRequestWithId.counterpartyId
                    remittanceInformation = expectedPaymentUpdateRequestWithId.remittanceInformation
                    reconciliationGroups = expectedPaymentUpdateRequestWithId.reconciliationGroups
                    reconciliationFilters = expectedPaymentUpdateRequestWithId.reconciliationFilters
                    reconciliationRuleVariables =
                        expectedPaymentUpdateRequestWithId.reconciliationRuleVariables
                            ?.toMutableList()
                    status = expectedPaymentUpdateRequestWithId.status
                    id = expectedPaymentUpdateRequestWithId.id
                    additionalProperties =
                        expectedPaymentUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_upper_bound")
                fun amountUpperBound(amountUpperBound: Long) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @JsonProperty("amount_lower_bound")
                fun amountLowerBound(amountLowerBound: Long) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                @JsonProperty("direction")
                fun direction(direction: Direction) = apply { this.direction = direction }

                /** The ID of the Internal Account for the expected payment. */
                @JsonProperty("internal_account_id")
                fun internalAccountId(internalAccountId: String) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                @JsonProperty("type")
                fun type(type: ExpectedPaymentType) = apply { this.type = type }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                @JsonProperty("currency")
                fun currency(currency: Currency) = apply { this.currency = currency }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_upper_bound")
                fun dateUpperBound(dateUpperBound: LocalDate) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                @JsonProperty("date_lower_bound")
                fun dateLowerBound(dateLowerBound: LocalDate) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                @JsonProperty("statement_descriptor")
                fun statementDescriptor(statementDescriptor: String) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                /** The ID of the counterparty you expect for this payment. */
                @JsonProperty("counterparty_id")
                fun counterpartyId(counterpartyId: String) = apply {
                    this.counterpartyId = counterpartyId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                @JsonProperty("remittance_information")
                fun remittanceInformation(remittanceInformation: String) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /** The reconciliation groups you have for this payment. */
                @JsonProperty("reconciliation_groups")
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** The reconciliation filters you have for this payment. */
                @JsonProperty("reconciliation_filters")
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** An array of reconciliation rule variables for this payment. */
                @JsonProperty("reconciliation_rule_variables")
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>
                ) = apply { this.reconciliationRuleVariables = reconciliationRuleVariables }

                /**
                 * The Expected Payment's status can be updated from partially_reconciled to
                 * reconciled.
                 */
                @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

                @JsonProperty("id") fun id(id: String) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): ExpectedPaymentUpdateRequestWithId =
                    ExpectedPaymentUpdateRequestWithId(
                        amountUpperBound,
                        amountLowerBound,
                        direction,
                        internalAccountId,
                        type,
                        currency,
                        dateUpperBound,
                        dateLowerBound,
                        description,
                        statementDescriptor,
                        metadata,
                        counterpartyId,
                        remittanceInformation,
                        reconciliationGroups,
                        reconciliationFilters,
                        reconciliationRuleVariables?.toImmutable(),
                        status,
                        id,
                        additionalProperties.toImmutable(),
                    )
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CREDIT = of("credit")

                    @JvmField val DEBIT = of("debit")

                    @JvmStatic fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    CREDIT,
                    DEBIT,
                }

                enum class Value {
                    CREDIT,
                    DEBIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CREDIT -> Value.CREDIT
                        DEBIT -> Value.DEBIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CREDIT -> Known.CREDIT
                        DEBIT -> Known.DEBIT
                        else ->
                            throw ModernTreasuryInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                    @JvmField val RECONCILED = of("reconciled")

                    @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                }

                enum class Known {
                    RECONCILED,
                }

                enum class Value {
                    RECONCILED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        RECONCILED -> Value.RECONCILED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        RECONCILED -> Known.RECONCILED
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

                return /* spotless:off */ other is ExpectedPaymentUpdateRequestWithId && amountUpperBound == other.amountUpperBound && amountLowerBound == other.amountLowerBound && direction == other.direction && internalAccountId == other.internalAccountId && type == other.type && currency == other.currency && dateUpperBound == other.dateUpperBound && dateLowerBound == other.dateLowerBound && description == other.description && statementDescriptor == other.statementDescriptor && metadata == other.metadata && counterpartyId == other.counterpartyId && remittanceInformation == other.remittanceInformation && reconciliationGroups == other.reconciliationGroups && reconciliationFilters == other.reconciliationFilters && reconciliationRuleVariables == other.reconciliationRuleVariables && status == other.status && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountUpperBound, amountLowerBound, direction, internalAccountId, type, currency, dateUpperBound, dateLowerBound, description, statementDescriptor, metadata, counterpartyId, remittanceInformation, reconciliationGroups, reconciliationFilters, reconciliationRuleVariables, status, id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedPaymentUpdateRequestWithId{amountUpperBound=$amountUpperBound, amountLowerBound=$amountLowerBound, direction=$direction, internalAccountId=$internalAccountId, type=$type, currency=$currency, dateUpperBound=$dateUpperBound, dateLowerBound=$dateLowerBound, description=$description, statementDescriptor=$statementDescriptor, metadata=$metadata, counterpartyId=$counterpartyId, remittanceInformation=$remittanceInformation, reconciliationGroups=$reconciliationGroups, reconciliationFilters=$reconciliationFilters, reconciliationRuleVariables=$reconciliationRuleVariables, status=$status, id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = TransactionUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class TransactionUpdateRequestWithId
        private constructor(
            private val metadata: Metadata?,
            private val id: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            @JsonProperty("id") fun id(): Optional<String> = Optional.ofNullable(id)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var metadata: Metadata? = null
                private var id: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transactionUpdateRequestWithId: TransactionUpdateRequestWithId) =
                    apply {
                        metadata = transactionUpdateRequestWithId.metadata
                        id = transactionUpdateRequestWithId.id
                        additionalProperties =
                            transactionUpdateRequestWithId.additionalProperties.toMutableMap()
                    }

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                @JsonProperty("id") fun id(id: String) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): TransactionUpdateRequestWithId =
                    TransactionUpdateRequestWithId(
                        metadata,
                        id,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionUpdateRequestWithId && metadata == other.metadata && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(metadata, id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionUpdateRequestWithId{metadata=$metadata, id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = LedgerTransactionUpdateRequestWithId.Builder::class)
        @NoAutoDetect
        class LedgerTransactionUpdateRequestWithId
        private constructor(
            private val description: String?,
            private val status: Status?,
            private val metadata: Metadata?,
            private val effectiveAt: OffsetDateTime?,
            private val ledgerEntries: List<LedgerEntryCreateRequest>?,
            private val ledgerableType: LedgerableType?,
            private val ledgerableId: String?,
            private val id: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** An optional description for internal use. */
            @JsonProperty("description")
            fun description(): Optional<String> = Optional.ofNullable(description)

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") fun status(): Optional<Status> = Optional.ofNullable(status)

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            fun effectiveAt(): Optional<OffsetDateTime> = Optional.ofNullable(effectiveAt)

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            fun ledgerEntries(): Optional<List<LedgerEntryCreateRequest>> =
                Optional.ofNullable(ledgerEntries)

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            @JsonProperty("ledgerable_type")
            fun ledgerableType(): Optional<LedgerableType> = Optional.ofNullable(ledgerableType)

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            fun ledgerableId(): Optional<String> = Optional.ofNullable(ledgerableId)

            @JsonProperty("id") fun id(): Optional<String> = Optional.ofNullable(id)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var description: String? = null
                private var status: Status? = null
                private var metadata: Metadata? = null
                private var effectiveAt: OffsetDateTime? = null
                private var ledgerEntries: List<LedgerEntryCreateRequest>? = null
                private var ledgerableType: LedgerableType? = null
                private var ledgerableId: String? = null
                private var id: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                ) = apply {
                    description = ledgerTransactionUpdateRequestWithId.description
                    status = ledgerTransactionUpdateRequestWithId.status
                    metadata = ledgerTransactionUpdateRequestWithId.metadata
                    effectiveAt = ledgerTransactionUpdateRequestWithId.effectiveAt
                    ledgerEntries =
                        ledgerTransactionUpdateRequestWithId.ledgerEntries?.toMutableList()
                    ledgerableType = ledgerTransactionUpdateRequestWithId.ledgerableType
                    ledgerableId = ledgerTransactionUpdateRequestWithId.ledgerableId
                    id = ledgerTransactionUpdateRequestWithId.id
                    additionalProperties =
                        ledgerTransactionUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                /** An optional description for internal use. */
                @JsonProperty("description")
                fun description(description: String) = apply { this.description = description }

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") fun status(status: Status) = apply { this.status = status }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                fun effectiveAt(effectiveAt: OffsetDateTime) = apply {
                    this.effectiveAt = effectiveAt
                }

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) = apply {
                    this.ledgerEntries = ledgerEntries
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                fun ledgerableType(ledgerableType: LedgerableType) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                fun ledgerableId(ledgerableId: String) = apply { this.ledgerableId = ledgerableId }

                @JsonProperty("id") fun id(id: String) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): LedgerTransactionUpdateRequestWithId =
                    LedgerTransactionUpdateRequestWithId(
                        description,
                        status,
                        metadata,
                        effectiveAt,
                        ledgerEntries?.toImmutable(),
                        ledgerableType,
                        ledgerableId,
                        id,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = LedgerEntryCreateRequest.Builder::class)
            @NoAutoDetect
            class LedgerEntryCreateRequest
            private constructor(
                private val amount: Long,
                private val direction: TransactionDirection,
                private val ledgerAccountId: String,
                private val lockVersion: Long?,
                private val pendingBalanceAmount: PendingBalanceAmount?,
                private val postedBalanceAmount: PostedBalanceAmount?,
                private val availableBalanceAmount: AvailableBalanceAmount?,
                private val showResultingLedgerAccountBalances: Boolean?,
                private val metadata: Metadata?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") fun amount(): Long = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction") fun direction(): TransactionDirection = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id") fun ledgerAccountId(): String = ledgerAccountId

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version")
                fun lockVersion(): Optional<Long> = Optional.ofNullable(lockVersion)

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                    Optional.ofNullable(pendingBalanceAmount)

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                    Optional.ofNullable(postedBalanceAmount)

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                    Optional.ofNullable(availableBalanceAmount)

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                    Optional.ofNullable(showResultingLedgerAccountBalances)

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Long? = null
                    private var direction: TransactionDirection? = null
                    private var ledgerAccountId: String? = null
                    private var lockVersion: Long? = null
                    private var pendingBalanceAmount: PendingBalanceAmount? = null
                    private var postedBalanceAmount: PostedBalanceAmount? = null
                    private var availableBalanceAmount: AvailableBalanceAmount? = null
                    private var showResultingLedgerAccountBalances: Boolean? = null
                    private var metadata: Metadata? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        amount = ledgerEntryCreateRequest.amount
                        direction = ledgerEntryCreateRequest.direction
                        ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        lockVersion = ledgerEntryCreateRequest.lockVersion
                        pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                        showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        metadata = ledgerEntryCreateRequest.metadata
                        additionalProperties =
                            ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Long) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction")
                    fun direction(direction: TransactionDirection) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    fun ledgerAccountId(ledgerAccountId: String) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    fun lockVersion(lockVersion: Long) = apply { this.lockVersion = lockVersion }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount) = apply {
                        this.pendingBalanceAmount = pendingBalanceAmount
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount) = apply {
                        this.postedBalanceAmount = postedBalanceAmount
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount) =
                        apply {
                            this.availableBalanceAmount = availableBalanceAmount
                        }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): LedgerEntryCreateRequest =
                        LedgerEntryCreateRequest(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(direction) { "`direction` is required but was not set" },
                            checkNotNull(ledgerAccountId) {
                                "`ledgerAccountId` is required but was not set"
                            },
                            lockVersion,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            availableBalanceAmount,
                            showResultingLedgerAccountBalances,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = AvailableBalanceAmount.Builder::class)
                @NoAutoDetect
                class AvailableBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(availableBalanceAmount: AvailableBalanceAmount) = apply {
                            additionalProperties =
                                availableBalanceAmount.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): AvailableBalanceAmount =
                            AvailableBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AvailableBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AvailableBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonDeserialize(builder = Metadata.Builder::class)
                @NoAutoDetect
                class Metadata
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

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

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PendingBalanceAmount.Builder::class)
                @NoAutoDetect
                class PendingBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(pendingBalanceAmount: PendingBalanceAmount) = apply {
                            additionalProperties =
                                pendingBalanceAmount.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PendingBalanceAmount =
                            PendingBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PendingBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PendingBalanceAmount{additionalProperties=$additionalProperties}"
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonDeserialize(builder = PostedBalanceAmount.Builder::class)
                @NoAutoDetect
                class PostedBalanceAmount
                private constructor(
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(postedBalanceAmount: PostedBalanceAmount) = apply {
                            additionalProperties =
                                postedBalanceAmount.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): PostedBalanceAmount =
                            PostedBalanceAmount(additionalProperties.toImmutable())
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is PostedBalanceAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PostedBalanceAmount{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && lockVersion == other.lockVersion && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && availableBalanceAmount == other.availableBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, lockVersion, pendingBalanceAmount, postedBalanceAmount, availableBalanceAmount, showResultingLedgerAccountBalances, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, lockVersion=$lockVersion, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, availableBalanceAmount=$availableBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, metadata=$metadata, additionalProperties=$additionalProperties}"
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
                        else ->
                            throw ModernTreasuryInvalidDataException(
                                "Unknown LedgerableType: $value"
                            )
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

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonDeserialize(builder = Metadata.Builder::class)
            @NoAutoDetect
            class Metadata
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

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

                return /* spotless:off */ other is LedgerTransactionUpdateRequestWithId && description == other.description && status == other.status && metadata == other.metadata && effectiveAt == other.effectiveAt && ledgerEntries == other.ledgerEntries && ledgerableType == other.ledgerableType && ledgerableId == other.ledgerableId && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(description, status, metadata, effectiveAt, ledgerEntries, ledgerableType, ledgerableId, id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerTransactionUpdateRequestWithId{description=$description, status=$status, metadata=$metadata, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, ledgerableType=$ledgerableType, ledgerableId=$ledgerableId, id=$id, additionalProperties=$additionalProperties}"
        }
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestCreateParams && actionType == other.actionType && resourceType == other.resourceType && resources == other.resources && metadata == other.metadata && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(actionType, resourceType, resources, metadata, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "BulkRequestCreateParams{actionType=$actionType, resourceType=$resourceType, resources=$resources, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
