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
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.getOrThrow
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** create bulk_request */
class BulkRequestCreateParams
private constructor(
    private val body: BulkRequestCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** One of create, or update. */
    fun actionType(): ActionType = body.actionType()

    /** One of payment_order, expected_payment, or ledger_transaction. */
    fun resourceType(): ResourceType = body.resourceType()

    /**
     * An array of objects where each object contains the input params for a single `action_type`
     * request on a `resource_type` resource
     */
    fun resources(): List<Resource> = body.resources()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** One of create, or update. */
    fun _actionType(): JsonField<ActionType> = body._actionType()

    /** One of payment_order, expected_payment, or ledger_transaction. */
    fun _resourceType(): JsonField<ResourceType> = body._resourceType()

    /**
     * An array of objects where each object contains the input params for a single `action_type`
     * request on a `resource_type` resource
     */
    fun _resources(): JsonField<List<Resource>> = body._resources()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): BulkRequestCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class BulkRequestCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("action_type")
        @ExcludeMissing
        private val actionType: JsonField<ActionType> = JsonMissing.of(),
        @JsonProperty("resource_type")
        @ExcludeMissing
        private val resourceType: JsonField<ResourceType> = JsonMissing.of(),
        @JsonProperty("resources")
        @ExcludeMissing
        private val resources: JsonField<List<Resource>> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** One of create, or update. */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(): ResourceType = resourceType.getRequired("resource_type")

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun resources(): List<Resource> = resources.getRequired("resources")

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** One of create, or update. */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<ActionType> = actionType

        /** One of payment_order, expected_payment, or ledger_transaction. */
        @JsonProperty("resource_type")
        @ExcludeMissing
        fun _resourceType(): JsonField<ResourceType> = resourceType

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        @JsonProperty("resources")
        @ExcludeMissing
        fun _resources(): JsonField<List<Resource>> = resources

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BulkRequestCreateBody = apply {
            if (validated) {
                return@apply
            }

            actionType()
            resourceType()
            resources().forEach { it.validate() }
            metadata().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var actionType: JsonField<ActionType>? = null
            private var resourceType: JsonField<ResourceType>? = null
            private var resources: JsonField<MutableList<Resource>>? = null
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bulkRequestCreateBody: BulkRequestCreateBody) = apply {
                actionType = bulkRequestCreateBody.actionType
                resourceType = bulkRequestCreateBody.resourceType
                resources = bulkRequestCreateBody.resources.map { it.toMutableList() }
                metadata = bulkRequestCreateBody.metadata
                additionalProperties = bulkRequestCreateBody.additionalProperties.toMutableMap()
            }

            /** One of create, or update. */
            fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

            /** One of create, or update. */
            fun actionType(actionType: JsonField<ActionType>) = apply {
                this.actionType = actionType
            }

            /** One of payment_order, expected_payment, or ledger_transaction. */
            fun resourceType(resourceType: ResourceType) = resourceType(JsonField.of(resourceType))

            /** One of payment_order, expected_payment, or ledger_transaction. */
            fun resourceType(resourceType: JsonField<ResourceType>) = apply {
                this.resourceType = resourceType
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun resources(resources: List<Resource>) = resources(JsonField.of(resources))

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun resources(resources: JsonField<List<Resource>>) = apply {
                this.resources = resources.map { it.toMutableList() }
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(resource: Resource) = apply {
                resources =
                    (resources ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(resource)
                    }
            }

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(
                paymentOrderAsyncCreateRequest: Resource.PaymentOrderAsyncCreateRequest
            ) =
                addResource(
                    Resource.ofPaymentOrderAsyncCreateRequest(paymentOrderAsyncCreateRequest)
                )

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(expectedPaymentCreateRequest: Resource.ExpectedPaymentCreateRequest) =
                addResource(Resource.ofExpectedPaymentCreateRequest(expectedPaymentCreateRequest))

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(
                ledgerTransactionCreateRequest: Resource.LedgerTransactionCreateRequest
            ) =
                addResource(
                    Resource.ofLedgerTransactionCreateRequest(ledgerTransactionCreateRequest)
                )

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(transactionCreateRequest: Resource.TransactionCreateRequest) =
                addResource(Resource.ofTransactionCreateRequest(transactionCreateRequest))

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(id: Resource.Id) = addResource(Resource.ofId(id))

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(
                paymentOrderUpdateRequestWithId: Resource.PaymentOrderUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofPaymentOrderUpdateRequestWithId(paymentOrderUpdateRequestWithId)
                )

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(
                expectedPaymentUpdateRequestWithId: Resource.ExpectedPaymentUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofExpectedPaymentUpdateRequestWithId(
                        expectedPaymentUpdateRequestWithId
                    )
                )

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(
                transactionUpdateRequestWithId: Resource.TransactionUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofTransactionUpdateRequestWithId(transactionUpdateRequestWithId)
                )

            /**
             * An array of objects where each object contains the input params for a single
             * `action_type` request on a `resource_type` resource
             */
            fun addResource(
                ledgerTransactionUpdateRequestWithId: Resource.LedgerTransactionUpdateRequestWithId
            ) =
                addResource(
                    Resource.ofLedgerTransactionUpdateRequestWithId(
                        ledgerTransactionUpdateRequestWithId
                    )
                )

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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

            fun build(): BulkRequestCreateBody =
                BulkRequestCreateBody(
                    checkRequired("actionType", actionType),
                    checkRequired("resourceType", resourceType),
                    checkRequired("resources", resources).map { it.toImmutable() },
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
    class Builder internal constructor() {

        private var body: BulkRequestCreateBody.Builder = BulkRequestCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(bulkRequestCreateParams: BulkRequestCreateParams) = apply {
            body = bulkRequestCreateParams.body.toBuilder()
            additionalHeaders = bulkRequestCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = bulkRequestCreateParams.additionalQueryParams.toBuilder()
        }

        /** One of create, or update. */
        fun actionType(actionType: ActionType) = apply { body.actionType(actionType) }

        /** One of create, or update. */
        fun actionType(actionType: JsonField<ActionType>) = apply { body.actionType(actionType) }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: ResourceType) = apply { body.resourceType(resourceType) }

        /** One of payment_order, expected_payment, or ledger_transaction. */
        fun resourceType(resourceType: JsonField<ResourceType>) = apply {
            body.resourceType(resourceType)
        }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun resources(resources: List<Resource>) = apply { body.resources(resources) }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun resources(resources: JsonField<List<Resource>>) = apply { body.resources(resources) }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(resource: Resource) = apply { body.addResource(resource) }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(paymentOrderAsyncCreateRequest: Resource.PaymentOrderAsyncCreateRequest) =
            apply {
                body.addResource(paymentOrderAsyncCreateRequest)
            }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(expectedPaymentCreateRequest: Resource.ExpectedPaymentCreateRequest) =
            apply {
                body.addResource(expectedPaymentCreateRequest)
            }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(ledgerTransactionCreateRequest: Resource.LedgerTransactionCreateRequest) =
            apply {
                body.addResource(ledgerTransactionCreateRequest)
            }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(transactionCreateRequest: Resource.TransactionCreateRequest) = apply {
            body.addResource(transactionCreateRequest)
        }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(id: Resource.Id) = apply { body.addResource(id) }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(paymentOrderUpdateRequestWithId: Resource.PaymentOrderUpdateRequestWithId) =
            apply {
                body.addResource(paymentOrderUpdateRequestWithId)
            }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(
            expectedPaymentUpdateRequestWithId: Resource.ExpectedPaymentUpdateRequestWithId
        ) = apply { body.addResource(expectedPaymentUpdateRequestWithId) }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(transactionUpdateRequestWithId: Resource.TransactionUpdateRequestWithId) =
            apply {
                body.addResource(transactionUpdateRequestWithId)
            }

        /**
         * An array of objects where each object contains the input params for a single
         * `action_type` request on a `resource_type` resource
         */
        fun addResource(
            ledgerTransactionUpdateRequestWithId: Resource.LedgerTransactionUpdateRequestWithId
        ) = apply { body.addResource(ledgerTransactionUpdateRequestWithId) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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

        fun build(): BulkRequestCreateParams =
            BulkRequestCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** One of create, or update. */
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

    /** One of payment_order, expected_payment, or ledger_transaction. */
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

        private var validated: Boolean = false

        fun validate(): Resource = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPaymentOrderAsyncCreateRequest(
                        paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest
                    ) {
                        paymentOrderAsyncCreateRequest.validate()
                    }

                    override fun visitExpectedPaymentCreateRequest(
                        expectedPaymentCreateRequest: ExpectedPaymentCreateRequest
                    ) {
                        expectedPaymentCreateRequest.validate()
                    }

                    override fun visitLedgerTransactionCreateRequest(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) {
                        ledgerTransactionCreateRequest.validate()
                    }

                    override fun visitTransactionCreateRequest(
                        transactionCreateRequest: TransactionCreateRequest
                    ) {
                        transactionCreateRequest.validate()
                    }

                    override fun visitId(id: Id) {
                        id.validate()
                    }

                    override fun visitPaymentOrderUpdateRequestWithId(
                        paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                    ) {
                        paymentOrderUpdateRequestWithId.validate()
                    }

                    override fun visitExpectedPaymentUpdateRequestWithId(
                        expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                    ) {
                        expectedPaymentUpdateRequestWithId.validate()
                    }

                    override fun visitTransactionUpdateRequestWithId(
                        transactionUpdateRequestWithId: TransactionUpdateRequestWithId
                    ) {
                        transactionUpdateRequestWithId.validate()
                    }

                    override fun visitLedgerTransactionUpdateRequestWithId(
                        ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                    ) {
                        ledgerTransactionUpdateRequestWithId.validate()
                    }
                }
            )
            validated = true
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

        internal class Deserializer : BaseDeserializer<Resource>(Resource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Resource {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<PaymentOrderAsyncCreateRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(paymentOrderAsyncCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentCreateRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(expectedPaymentCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionCreateRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(ledgerTransactionCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TransactionCreateRequest>()) { it.validate() }
                    ?.let {
                        return Resource(transactionCreateRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Id>()) { it.validate() }
                    ?.let {
                        return Resource(id = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<PaymentOrderUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(paymentOrderUpdateRequestWithId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ExpectedPaymentUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(expectedPaymentUpdateRequestWithId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<TransactionUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(transactionUpdateRequestWithId = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<LedgerTransactionUpdateRequestWithId>()) {
                        it.validate()
                    }
                    ?.let {
                        return Resource(ledgerTransactionUpdateRequestWithId = it, _json = json)
                    }

                return Resource(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Resource>(Resource::class) {

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

        @NoAutoDetect
        class PaymentOrderAsyncCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            private val originatingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<PaymentOrderType> = JsonMissing.of(),
            @JsonProperty("accounting")
            @ExcludeMissing
            private val accounting: JsonField<Accounting> = JsonMissing.of(),
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            private val accountingCategoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            private val accountingLedgerClassId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("charge_bearer")
            @ExcludeMissing
            private val chargeBearer: JsonField<ChargeBearer> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("fallback_type")
            @ExcludeMissing
            private val fallbackType: JsonField<FallbackType> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            private val foreignExchangeContract: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                JsonMissing.of(),
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                JsonMissing.of(),
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line_items")
            @ExcludeMissing
            private val lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("nsf_protected")
            @ExcludeMissing
            private val nsfProtected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            private val originatingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Priority> = JsonMissing.of(),
            @JsonProperty("process_after")
            @ExcludeMissing
            private val processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("purpose")
            @ExcludeMissing
            private val purpose: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiving_account")
            @ExcludeMissing
            private val receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of(),
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            private val receivingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            private val remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            private val sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            private val statementDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subtype")
            @ExcludeMissing
            private val subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of(),
            @JsonProperty("transaction_monitoring_enabled")
            @ExcludeMissing
            private val transactionMonitoringEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            private val ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            private val ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            private val ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            private val ultimateReceivingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(): Direction = direction.getRequired("direction")

            /** The ID of one of your organization's internal accounts. */
            fun originatingAccountId(): String =
                originatingAccountId.getRequired("originating_account_id")

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun type(): PaymentOrderType = type.getRequired("type")

            fun accounting(): Optional<Accounting> =
                Optional.ofNullable(accounting.getNullable("accounting"))

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(): Optional<String> =
                Optional.ofNullable(accountingCategoryId.getNullable("accounting_category_id"))

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(): Optional<String> =
                Optional.ofNullable(
                    accountingLedgerClassId.getNullable("accounting_ledger_class_id")
                )

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            fun chargeBearer(): Optional<ChargeBearer> =
                Optional.ofNullable(chargeBearer.getNullable("charge_bearer"))

            /** Defaults to the currency of the originating account. */
            fun currency(): Optional<Currency> =
                Optional.ofNullable(currency.getNullable("currency"))

            /** An optional description for internal use. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun effectiveDate(): Optional<LocalDate> =
                Optional.ofNullable(effectiveDate.getNullable("effective_date"))

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            fun expiresAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(expiresAt.getNullable("expires_at"))

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            fun fallbackType(): Optional<FallbackType> =
                Optional.ofNullable(fallbackType.getNullable("fallback_type"))

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            fun foreignExchangeContract(): Optional<String> =
                Optional.ofNullable(
                    foreignExchangeContract.getNullable("foreign_exchange_contract")
                )

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            fun foreignExchangeIndicator(): Optional<ForeignExchangeIndicator> =
                Optional.ofNullable(
                    foreignExchangeIndicator.getNullable("foreign_exchange_indicator")
                )

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            fun ledgerTransaction(): Optional<LedgerTransactionCreateRequest> =
                Optional.ofNullable(ledgerTransaction.getNullable("ledger_transaction"))

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            fun ledgerTransactionId(): Optional<String> =
                Optional.ofNullable(ledgerTransactionId.getNullable("ledger_transaction_id"))

            /** An array of line items that must sum up to the amount of the payment order. */
            fun lineItems(): Optional<List<LineItemRequest>> =
                Optional.ofNullable(lineItems.getNullable("line_items"))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            fun nsfProtected(): Optional<Boolean> =
                Optional.ofNullable(nsfProtected.getNullable("nsf_protected"))

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            fun originatingPartyName(): Optional<String> =
                Optional.ofNullable(originatingPartyName.getNullable("originating_party_name"))

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            fun priority(): Optional<Priority> =
                Optional.ofNullable(priority.getNullable("priority"))

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            fun processAfter(): Optional<OffsetDateTime> =
                Optional.ofNullable(processAfter.getNullable("process_after"))

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            fun purpose(): Optional<String> = Optional.ofNullable(purpose.getNullable("purpose"))

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccount(): Optional<ReceivingAccount> =
                Optional.ofNullable(receivingAccount.getNullable("receiving_account"))

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccountId(): Optional<String> =
                Optional.ofNullable(receivingAccountId.getNullable("receiving_account_id"))

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            fun sendRemittanceAdvice(): Optional<Boolean> =
                Optional.ofNullable(sendRemittanceAdvice.getNullable("send_remittance_advice"))

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            fun statementDescriptor(): Optional<String> =
                Optional.ofNullable(statementDescriptor.getNullable("statement_descriptor"))

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            fun subtype(): Optional<PaymentOrderSubtype> =
                Optional.ofNullable(subtype.getNullable("subtype"))

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            fun transactionMonitoringEnabled(): Optional<Boolean> =
                Optional.ofNullable(
                    transactionMonitoringEnabled.getNullable("transaction_monitoring_enabled")
                )

            /** Identifier of the ultimate originator of the payment order. */
            fun ultimateOriginatingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(
                    ultimateOriginatingPartyIdentifier.getNullable(
                        "ultimate_originating_party_identifier"
                    )
                )

            /** Name of the ultimate originator of the payment order. */
            fun ultimateOriginatingPartyName(): Optional<String> =
                Optional.ofNullable(
                    ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")
                )

            /** Identifier of the ultimate funds recipient. */
            fun ultimateReceivingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(
                    ultimateReceivingPartyIdentifier.getNullable(
                        "ultimate_receiving_party_identifier"
                    )
                )

            /** Name of the ultimate funds recipient. */
            fun ultimateReceivingPartyName(): Optional<String> =
                Optional.ofNullable(
                    ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")
                )

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun _originatingAccountId(): JsonField<String> = originatingAccountId

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentOrderType> = type

            @JsonProperty("accounting")
            @ExcludeMissing
            fun _accounting(): JsonField<Accounting> = accounting

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            fun _accountingLedgerClassId(): JsonField<String> = accountingLedgerClassId

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer")
            @ExcludeMissing
            fun _chargeBearer(): JsonField<ChargeBearer> = chargeBearer

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** An optional description for internal use. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            @ExcludeMissing
            fun _fallbackType(): JsonField<FallbackType> = fallbackType

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            fun _foreignExchangeContract(): JsonField<String> = foreignExchangeContract

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> =
                foreignExchangeIndicator

            /**
             * Specifies a ledger transaction object that will be created with the payment order. If
             * the ledger transaction cannot be created, then the payment order creation will fail.
             * The resulting ledger transaction will mirror the status of the payment order.
             */
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            fun _ledgerTransaction(): JsonField<LedgerTransactionCreateRequest> = ledgerTransaction

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon payment order creation. Once the payment
             * order is created, the status of the ledger transaction tracks the payment order
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items")
            @ExcludeMissing
            fun _lineItems(): JsonField<List<LineItemRequest>> = lineItems

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected")
            @ExcludeMissing
            fun _nsfProtected(): JsonField<Boolean> = nsfProtected

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            fun _originatingPartyName(): JsonField<String> = originatingPartyName

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority")
            @ExcludeMissing
            fun _priority(): JsonField<Priority> = priority

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after")
            @ExcludeMissing
            fun _processAfter(): JsonField<OffsetDateTime> = processAfter

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            @ExcludeMissing
            fun _receivingAccount(): JsonField<ReceivingAccount> = receivingAccount

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            fun _receivingAccountId(): JsonField<String> = receivingAccountId

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype")
            @ExcludeMissing
            fun _subtype(): JsonField<PaymentOrderSubtype> = subtype

            /**
             * A flag that determines whether a payment order should go through transaction
             * monitoring.
             */
            @JsonProperty("transaction_monitoring_enabled")
            @ExcludeMissing
            fun _transactionMonitoringEnabled(): JsonField<Boolean> = transactionMonitoringEnabled

            /** Identifier of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            fun _ultimateOriginatingPartyIdentifier(): JsonField<String> =
                ultimateOriginatingPartyIdentifier

            /** Name of the ultimate originator of the payment order. */
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            fun _ultimateOriginatingPartyName(): JsonField<String> = ultimateOriginatingPartyName

            /** Identifier of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            fun _ultimateReceivingPartyIdentifier(): JsonField<String> =
                ultimateReceivingPartyIdentifier

            /** Name of the ultimate funds recipient. */
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            fun _ultimateReceivingPartyName(): JsonField<String> = ultimateReceivingPartyName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PaymentOrderAsyncCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amount()
                direction()
                originatingAccountId()
                type()
                accounting().ifPresent { it.validate() }
                accountingCategoryId()
                accountingLedgerClassId()
                chargeBearer()
                currency()
                description()
                effectiveDate()
                expiresAt()
                fallbackType()
                foreignExchangeContract()
                foreignExchangeIndicator()
                ledgerTransaction().ifPresent { it.validate() }
                ledgerTransactionId()
                lineItems().ifPresent { it.forEach { it.validate() } }
                metadata().ifPresent { it.validate() }
                nsfProtected()
                originatingPartyName()
                priority()
                processAfter()
                purpose()
                receivingAccount().ifPresent { it.validate() }
                receivingAccountId()
                remittanceInformation()
                sendRemittanceAdvice()
                statementDescriptor()
                subtype()
                transactionMonitoringEnabled()
                ultimateOriginatingPartyIdentifier()
                ultimateOriginatingPartyName()
                ultimateReceivingPartyIdentifier()
                ultimateReceivingPartyName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var direction: JsonField<Direction>? = null
                private var originatingAccountId: JsonField<String>? = null
                private var type: JsonField<PaymentOrderType>? = null
                private var accounting: JsonField<Accounting> = JsonMissing.of()
                private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
                private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fallbackType: JsonField<FallbackType> = JsonMissing.of()
                private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                    JsonMissing.of()
                private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
                private var lineItems: JsonField<MutableList<LineItemRequest>>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
                private var originatingPartyName: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Priority> = JsonMissing.of()
                private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var purpose: JsonField<String> = JsonMissing.of()
                private var receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of()
                private var receivingAccountId: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
                private var transactionMonitoringEnabled: JsonField<Boolean> = JsonMissing.of()
                private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentOrderAsyncCreateRequest: PaymentOrderAsyncCreateRequest) =
                    apply {
                        amount = paymentOrderAsyncCreateRequest.amount
                        direction = paymentOrderAsyncCreateRequest.direction
                        originatingAccountId = paymentOrderAsyncCreateRequest.originatingAccountId
                        type = paymentOrderAsyncCreateRequest.type
                        accounting = paymentOrderAsyncCreateRequest.accounting
                        accountingCategoryId = paymentOrderAsyncCreateRequest.accountingCategoryId
                        accountingLedgerClassId =
                            paymentOrderAsyncCreateRequest.accountingLedgerClassId
                        chargeBearer = paymentOrderAsyncCreateRequest.chargeBearer
                        currency = paymentOrderAsyncCreateRequest.currency
                        description = paymentOrderAsyncCreateRequest.description
                        effectiveDate = paymentOrderAsyncCreateRequest.effectiveDate
                        expiresAt = paymentOrderAsyncCreateRequest.expiresAt
                        fallbackType = paymentOrderAsyncCreateRequest.fallbackType
                        foreignExchangeContract =
                            paymentOrderAsyncCreateRequest.foreignExchangeContract
                        foreignExchangeIndicator =
                            paymentOrderAsyncCreateRequest.foreignExchangeIndicator
                        ledgerTransaction = paymentOrderAsyncCreateRequest.ledgerTransaction
                        ledgerTransactionId = paymentOrderAsyncCreateRequest.ledgerTransactionId
                        lineItems =
                            paymentOrderAsyncCreateRequest.lineItems.map { it.toMutableList() }
                        metadata = paymentOrderAsyncCreateRequest.metadata
                        nsfProtected = paymentOrderAsyncCreateRequest.nsfProtected
                        originatingPartyName = paymentOrderAsyncCreateRequest.originatingPartyName
                        priority = paymentOrderAsyncCreateRequest.priority
                        processAfter = paymentOrderAsyncCreateRequest.processAfter
                        purpose = paymentOrderAsyncCreateRequest.purpose
                        receivingAccount = paymentOrderAsyncCreateRequest.receivingAccount
                        receivingAccountId = paymentOrderAsyncCreateRequest.receivingAccountId
                        remittanceInformation = paymentOrderAsyncCreateRequest.remittanceInformation
                        sendRemittanceAdvice = paymentOrderAsyncCreateRequest.sendRemittanceAdvice
                        statementDescriptor = paymentOrderAsyncCreateRequest.statementDescriptor
                        subtype = paymentOrderAsyncCreateRequest.subtype
                        transactionMonitoringEnabled =
                            paymentOrderAsyncCreateRequest.transactionMonitoringEnabled
                        ultimateOriginatingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyIdentifier
                        ultimateOriginatingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateOriginatingPartyName
                        ultimateReceivingPartyIdentifier =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyIdentifier
                        ultimateReceivingPartyName =
                            paymentOrderAsyncCreateRequest.ultimateReceivingPartyName
                        additionalProperties =
                            paymentOrderAsyncCreateRequest.additionalProperties.toMutableMap()
                    }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String) =
                    originatingAccountId(JsonField.of(originatingAccountId))

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType) = type(JsonField.of(type))

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

                fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

                fun accounting(accounting: JsonField<Accounting>) = apply {
                    this.accounting = accounting
                }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: String?) =
                    accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: Optional<String>) =
                    accountingCategoryId(accountingCategoryId.orElse(null))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: String?) =
                    accountingLedgerClassId(JsonField.ofNullable(accountingLedgerClassId))

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: Optional<String>) =
                    accountingLedgerClassId(accountingLedgerClassId.orElse(null))

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer?) =
                    chargeBearer(JsonField.ofNullable(chargeBearer))

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: Optional<ChargeBearer>) =
                    chargeBearer(chargeBearer.orElse(null))

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
                    this.chargeBearer = chargeBearer
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /** Defaults to the currency of the originating account. */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** An optional description for internal use. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /** An optional description for internal use. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: Optional<OffsetDateTime>) =
                    expiresAt(expiresAt.orElse(null))

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: FallbackType) =
                    fallbackType(JsonField.of(fallbackType))

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String?) =
                    foreignExchangeContract(JsonField.ofNullable(foreignExchangeContract))

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: Optional<String>) =
                    foreignExchangeContract(foreignExchangeContract.orElse(null))

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                    foreignExchangeIndicator(JsonField.ofNullable(foreignExchangeIndicator))

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: Optional<ForeignExchangeIndicator>
                ) = foreignExchangeIndicator(foreignExchangeIndicator.orElse(null))

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /**
                 * Specifies a ledger transaction object that will be created with the payment
                 * order. If the ledger transaction cannot be created, then the payment order
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the payment order.
                 */
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
                    ledgerTransaction(JsonField.of(ledgerTransaction))

                /**
                 * Specifies a ledger transaction object that will be created with the payment
                 * order. If the ledger transaction cannot be created, then the payment order
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the payment order.
                 */
                fun ledgerTransaction(
                    ledgerTransaction: JsonField<LedgerTransactionCreateRequest>
                ) = apply { this.ledgerTransaction = ledgerTransaction }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon payment order creation. Once the
                 * payment order is created, the status of the ledger transaction tracks the payment
                 * order automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: String) =
                    ledgerTransactionId(JsonField.of(ledgerTransactionId))

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon payment order creation. Once the
                 * payment order is created, the status of the ledger transaction tracks the payment
                 * order automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems.map { it.toMutableList() }
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems =
                        (lineItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(lineItem)
                        }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
                    this.nsfProtected = nsfProtected
                }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String?) =
                    originatingPartyName(JsonField.ofNullable(originatingPartyName))

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: Optional<String>) =
                    originatingPartyName(originatingPartyName.orElse(null))

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority) = priority(JsonField.of(priority))

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime?) =
                    processAfter(JsonField.ofNullable(processAfter))

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: Optional<OffsetDateTime>) =
                    processAfter(processAfter.orElse(null))

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: Optional<String>) = purpose(purpose.orElse(null))

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount) =
                    receivingAccount(JsonField.of(receivingAccount))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String) =
                    receivingAccountId(JsonField.of(receivingAccountId))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: Optional<String>) =
                    remittanceInformation(remittanceInformation.orElse(null))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) =
                    sendRemittanceAdvice(JsonField.ofNullable(sendRemittanceAdvice))

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun sendRemittanceAdvice(sendRemittanceAdvice: Optional<Boolean>) =
                    sendRemittanceAdvice(sendRemittanceAdvice.orElse(null) as Boolean?)

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: Optional<String>) =
                    statementDescriptor(statementDescriptor.orElse(null))

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype?) = subtype(JsonField.ofNullable(subtype))

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: Optional<PaymentOrderSubtype>) = subtype(subtype.orElse(null))

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply {
                    this.subtype = subtype
                }

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: Boolean) =
                    transactionMonitoringEnabled(JsonField.of(transactionMonitoringEnabled))

                /**
                 * A flag that determines whether a payment order should go through transaction
                 * monitoring.
                 */
                fun transactionMonitoringEnabled(transactionMonitoringEnabled: JsonField<Boolean>) =
                    apply {
                        this.transactionMonitoringEnabled = transactionMonitoringEnabled
                    }

                /** Identifier of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: String?
                ) =
                    ultimateOriginatingPartyIdentifier(
                        JsonField.ofNullable(ultimateOriginatingPartyIdentifier)
                    )

                /** Identifier of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: Optional<String>
                ) =
                    ultimateOriginatingPartyIdentifier(
                        ultimateOriginatingPartyIdentifier.orElse(null)
                    )

                /** Identifier of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /** Name of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) =
                    ultimateOriginatingPartyName(JsonField.ofNullable(ultimateOriginatingPartyName))

                /** Name of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: Optional<String>) =
                    ultimateOriginatingPartyName(ultimateOriginatingPartyName.orElse(null))

                /** Name of the ultimate originator of the payment order. */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                    }

                /** Identifier of the ultimate funds recipient. */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                    ultimateReceivingPartyIdentifier(
                        JsonField.ofNullable(ultimateReceivingPartyIdentifier)
                    )

                /** Identifier of the ultimate funds recipient. */
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: Optional<String>
                ) = ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier.orElse(null))

                /** Identifier of the ultimate funds recipient. */
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                }

                /** Name of the ultimate funds recipient. */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) =
                    ultimateReceivingPartyName(JsonField.ofNullable(ultimateReceivingPartyName))

                /** Name of the ultimate funds recipient. */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: Optional<String>) =
                    ultimateReceivingPartyName(ultimateReceivingPartyName.orElse(null))

                /** Name of the ultimate funds recipient. */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateReceivingPartyName = ultimateReceivingPartyName
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        checkRequired("amount", amount),
                        checkRequired("direction", direction),
                        checkRequired("originatingAccountId", originatingAccountId),
                        checkRequired("type", type),
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        chargeBearer,
                        currency,
                        description,
                        effectiveDate,
                        expiresAt,
                        fallbackType,
                        foreignExchangeContract,
                        foreignExchangeIndicator,
                        ledgerTransaction,
                        ledgerTransactionId,
                        (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                        metadata,
                        nsfProtected,
                        originatingPartyName,
                        priority,
                        processAfter,
                        purpose,
                        receivingAccount,
                        receivingAccountId,
                        remittanceInformation,
                        sendRemittanceAdvice,
                        statementDescriptor,
                        subtype,
                        transactionMonitoringEnabled,
                        ultimateOriginatingPartyIdentifier,
                        ultimateOriginatingPartyName,
                        ultimateReceivingPartyIdentifier,
                        ultimateReceivingPartyName,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
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

            @NoAutoDetect
            class Accounting
            @JsonCreator
            private constructor(
                @JsonProperty("account_id")
                @ExcludeMissing
                private val accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("class_id")
                @ExcludeMissing
                private val classId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountId(): Optional<String> =
                    Optional.ofNullable(accountId.getNullable("account_id"))

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                fun classId(): Optional<String> =
                    Optional.ofNullable(classId.getNullable("class_id"))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id")
                @ExcludeMissing
                fun _accountId(): JsonField<String> = accountId

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id")
                @ExcludeMissing
                fun _classId(): JsonField<String> = classId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Accounting = apply {
                    if (validated) {
                        return@apply
                    }

                    accountId()
                    classId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var accountId: JsonField<String> = JsonMissing.of()
                    private var classId: JsonField<String> = JsonMissing.of()
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
                    fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: Optional<String>) = accountId(accountId.orElse(null))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: JsonField<String>) = apply {
                        this.accountId = accountId
                    }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: String?) = classId(JsonField.ofNullable(classId))

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: Optional<String>) = classId(classId.orElse(null))

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: JsonField<String>) = apply { this.classId = classId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
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

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
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

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
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
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> =
                    JsonMissing.of(),
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
                @JsonProperty("ledgerable_id")
                @ExcludeMissing
                private val ledgerableId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                private val status: JsonField<Status> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** An array of ledger entry objects. */
                fun ledgerEntries(): List<LedgerEntryCreateRequest> =
                    ledgerEntries.getRequired("ledger_entries")

                /** An optional description for internal use. */
                fun description(): Optional<String> =
                    Optional.ofNullable(description.getNullable("description"))

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(): Optional<OffsetDateTime> =
                    Optional.ofNullable(effectiveAt.getNullable("effective_at"))

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(): Optional<LocalDate> =
                    Optional.ofNullable(effectiveDate.getNullable("effective_date"))

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(): Optional<String> =
                    Optional.ofNullable(externalId.getNullable("external_id"))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(): Optional<String> =
                    Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(): Optional<LedgerableType> =
                    Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                fun _ledgerEntries(): JsonField<List<LedgerEntryCreateRequest>> = ledgerEntries

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                @ExcludeMissing
                fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date")
                @ExcludeMissing
                fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id")
                @ExcludeMissing
                fun _externalId(): JsonField<String> = externalId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                @ExcludeMissing
                fun _ledgerableId(): JsonField<String> = ledgerableId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LedgerTransactionCreateRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    ledgerEntries().forEach { it.validate() }
                    description()
                    effectiveAt()
                    effectiveDate()
                    externalId()
                    ledgerableId()
                    ledgerableType()
                    metadata().ifPresent { it.validate() }
                    status()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var ledgerEntries: JsonField<MutableList<LedgerEntryCreateRequest>>? =
                        null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                    private var externalId: JsonField<String> = JsonMissing.of()
                    private var ledgerableId: JsonField<String> = JsonMissing.of()
                    private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        ledgerEntries =
                            ledgerTransactionCreateRequest.ledgerEntries.map { it.toMutableList() }
                        description = ledgerTransactionCreateRequest.description
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        metadata = ledgerTransactionCreateRequest.metadata
                        status = ledgerTransactionCreateRequest.status
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                        ledgerEntries(JsonField.of(ledgerEntries))

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                        apply {
                            this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                        }

                    /** An array of ledger entry objects. */
                    fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                        ledgerEntries =
                            (ledgerEntries ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(ledgerEntry)
                            }
                    }

                    /** An optional description for internal use. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /** An optional description for internal use. */
                    fun description(description: Optional<String>) =
                        description(description.orElse(null))

                    /** An optional description for internal use. */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: OffsetDateTime) =
                        effectiveAt(JsonField.of(effectiveAt))

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: LocalDate) =
                        effectiveDate(JsonField.of(effectiveDate))

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: JsonField<String>) = apply {
                        this.externalId = externalId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: String) =
                        ledgerableId(JsonField.of(ledgerableId))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    fun ledgerableType(ledgerableType: LedgerableType) =
                        ledgerableType(JsonField.of(ledgerableType))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: Status) = status(JsonField.of(status))

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                            description,
                            effectiveAt,
                            effectiveDate,
                            externalId,
                            ledgerableId,
                            ledgerableType,
                            metadata,
                            status,
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LedgerEntryCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("direction")
                    @ExcludeMissing
                    private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    private val availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                        JsonMissing.of(),
                    @JsonProperty("lock_version")
                    @ExcludeMissing
                    private val lockVersion: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    private val metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    private val pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                        JsonMissing.of(),
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    private val postedBalanceAmount: JsonField<PostedBalanceAmount> =
                        JsonMissing.of(),
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    private val showResultingLedgerAccountBalances: JsonField<Boolean> =
                        JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(): TransactionDirection = direction.getRequired("direction")

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                        Optional.ofNullable(
                            availableBalanceAmount.getNullable("available_balance_amount")
                        )

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(): Optional<Long> =
                        Optional.ofNullable(lockVersion.getNullable("lock_version"))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Optional<Metadata> =
                        Optional.ofNullable(metadata.getNullable("metadata"))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                        Optional.ofNullable(
                            pendingBalanceAmount.getNullable("pending_balance_amount")
                        )

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                        Optional.ofNullable(
                            postedBalanceAmount.getNullable("posted_balance_amount")
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                        Optional.ofNullable(
                            showResultingLedgerAccountBalances.getNullable(
                                "show_resulting_ledger_account_balances"
                            )
                        )

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction")
                    @ExcludeMissing
                    fun _direction(): JsonField<TransactionDirection> = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    fun _availableBalanceAmount(): JsonField<AvailableBalanceAmount> =
                        availableBalanceAmount

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    @ExcludeMissing
                    fun _lockVersion(): JsonField<Long> = lockVersion

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<Metadata> = metadata

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    fun _pendingBalanceAmount(): JsonField<PendingBalanceAmount> =
                        pendingBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    fun _postedBalanceAmount(): JsonField<PostedBalanceAmount> = postedBalanceAmount

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    fun _showResultingLedgerAccountBalances(): JsonField<Boolean> =
                        showResultingLedgerAccountBalances

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): LedgerEntryCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        direction()
                        ledgerAccountId()
                        availableBalanceAmount().ifPresent { it.validate() }
                        lockVersion()
                        metadata().ifPresent { it.validate() }
                        pendingBalanceAmount().ifPresent { it.validate() }
                        postedBalanceAmount().ifPresent { it.validate() }
                        showResultingLedgerAccountBalances()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var direction: JsonField<TransactionDirection>? = null
                        private var ledgerAccountId: JsonField<String>? = null
                        private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                            JsonMissing.of()
                        private var lockVersion: JsonField<Long> = JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                            JsonMissing.of()
                        private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                            JsonMissing.of()
                        private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                amount = ledgerEntryCreateRequest.amount
                                direction = ledgerEntryCreateRequest.direction
                                ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                lockVersion = ledgerEntryCreateRequest.lockVersion
                                metadata = ledgerEntryCreateRequest.metadata
                                pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                                postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                                showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                additionalProperties =
                                    ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: TransactionDirection) =
                            direction(JsonField.of(direction))

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: JsonField<TransactionDirection>) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: String) =
                            ledgerAccountId(JsonField.of(ledgerAccountId))

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: AvailableBalanceAmount?
                        ) = availableBalanceAmount(JsonField.ofNullable(availableBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: Optional<AvailableBalanceAmount>
                        ) = availableBalanceAmount(availableBalanceAmount.orElse(null))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: JsonField<AvailableBalanceAmount>
                        ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long?) =
                            lockVersion(JsonField.ofNullable(lockVersion))

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        @Suppress(
                            "USELESS_CAST"
                        ) // See https://youtrack.jetbrains.com/issue/KT-74228
                        fun lockVersion(lockVersion: Optional<Long>) =
                            lockVersion(lockVersion.orElse(null) as Long?)

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: JsonField<Long>) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                            pendingBalanceAmount(JsonField.ofNullable(pendingBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(
                            pendingBalanceAmount: Optional<PendingBalanceAmount>
                        ) = pendingBalanceAmount(pendingBalanceAmount.orElse(null))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(
                            pendingBalanceAmount: JsonField<PendingBalanceAmount>
                        ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) =
                            postedBalanceAmount(JsonField.ofNullable(postedBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(
                            postedBalanceAmount: Optional<PostedBalanceAmount>
                        ) = postedBalanceAmount(postedBalanceAmount.orElse(null))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(
                            postedBalanceAmount: JsonField<PostedBalanceAmount>
                        ) = apply { this.postedBalanceAmount = postedBalanceAmount }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean?
                        ) =
                            showResultingLedgerAccountBalances(
                                JsonField.ofNullable(showResultingLedgerAccountBalances)
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) =
                            showResultingLedgerAccountBalances(
                                showResultingLedgerAccountBalances as Boolean?
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        @Suppress(
                            "USELESS_CAST"
                        ) // See https://youtrack.jetbrains.com/issue/KT-74228
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Optional<Boolean>
                        ) =
                            showResultingLedgerAccountBalances(
                                showResultingLedgerAccountBalances.orElse(null) as Boolean?
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: JsonField<Boolean>
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("amount", amount),
                                checkRequired("direction", direction),
                                checkRequired("ledgerAccountId", ledgerAccountId),
                                availableBalanceAmount,
                                lockVersion,
                                metadata,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                showResultingLedgerAccountBalances,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): AvailableBalanceAmount = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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
                    @NoAutoDetect
                    class PendingBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): PendingBalanceAmount = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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
                    @NoAutoDetect
                    class PostedBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): PostedBalanceAmount = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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

                        return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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

                /** To post a ledger transaction at creation, use `posted`. */
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

                    return /* spotless:off */ other is LedgerTransactionCreateRequest && ledgerEntries == other.ledgerEntries && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(ledgerEntries, description, effectiveAt, effectiveDate, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerTransactionCreateRequest{ledgerEntries=$ledgerEntries, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class LineItemRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                private val accountingCategoryId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                private val description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(): Optional<String> =
                    Optional.ofNullable(accountingCategoryId.getNullable("accounting_category_id"))

                /** A free-form description of the line item. */
                fun description(): Optional<String> =
                    Optional.ofNullable(description.getNullable("description"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

                /** A free-form description of the line item. */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LineItemRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    accountingCategoryId()
                    description()
                    metadata().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        description = lineItemRequest.description
                        metadata = lineItemRequest.metadata
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) =
                        accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: Optional<String>) =
                        accountingCategoryId(accountingCategoryId.orElse(null))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /** A free-form description of the line item. */
                    fun description(description: Optional<String>) =
                        description(description.orElse(null))

                    /** A free-form description of the line item. */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            checkRequired("amount", amount),
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && accountingCategoryId == other.accountingCategoryId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
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
            @NoAutoDetect
            class ReceivingAccount
            @JsonCreator
            private constructor(
                @JsonProperty("account_details")
                @ExcludeMissing
                private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
                @JsonProperty("account_type")
                @ExcludeMissing
                private val accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
                @JsonProperty("contact_details")
                @ExcludeMissing
                private val contactDetails: JsonField<List<ContactDetailCreateRequest>> =
                    JsonMissing.of(),
                @JsonProperty("ledger_account")
                @ExcludeMissing
                private val ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("party_address")
                @ExcludeMissing
                private val partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
                @JsonProperty("party_identifier")
                @ExcludeMissing
                private val partyIdentifier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("party_name")
                @ExcludeMissing
                private val partyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("party_type")
                @ExcludeMissing
                private val partyType: JsonField<PartyType> = JsonMissing.of(),
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                private val plaidProcessorToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routing_details")
                @ExcludeMissing
                private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun accountDetails(): Optional<List<AccountDetail>> =
                    Optional.ofNullable(accountDetails.getNullable("account_details"))

                /** Can be `checking`, `savings` or `other`. */
                fun accountType(): Optional<ExternalAccountType> =
                    Optional.ofNullable(accountType.getNullable("account_type"))

                fun contactDetails(): Optional<List<ContactDetailCreateRequest>> =
                    Optional.ofNullable(contactDetails.getNullable("contact_details"))

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                fun ledgerAccount(): Optional<LedgerAccountCreateRequest> =
                    Optional.ofNullable(ledgerAccount.getNullable("ledger_account"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                /** Required if receiving wire payments. */
                fun partyAddress(): Optional<AddressRequest> =
                    Optional.ofNullable(partyAddress.getNullable("party_address"))

                fun partyIdentifier(): Optional<String> =
                    Optional.ofNullable(partyIdentifier.getNullable("party_identifier"))

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                fun partyName(): Optional<String> =
                    Optional.ofNullable(partyName.getNullable("party_name"))

                /** Either `individual` or `business`. */
                fun partyType(): Optional<PartyType> =
                    Optional.ofNullable(partyType.getNullable("party_type"))

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                fun plaidProcessorToken(): Optional<String> =
                    Optional.ofNullable(plaidProcessorToken.getNullable("plaid_processor_token"))

                fun routingDetails(): Optional<List<RoutingDetail>> =
                    Optional.ofNullable(routingDetails.getNullable("routing_details"))

                @JsonProperty("account_details")
                @ExcludeMissing
                fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type")
                @ExcludeMissing
                fun _accountType(): JsonField<ExternalAccountType> = accountType

                @JsonProperty("contact_details")
                @ExcludeMissing
                fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account")
                @ExcludeMissing
                fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /** Required if receiving wire payments. */
                @JsonProperty("party_address")
                @ExcludeMissing
                fun _partyAddress(): JsonField<AddressRequest> = partyAddress

                @JsonProperty("party_identifier")
                @ExcludeMissing
                fun _partyIdentifier(): JsonField<String> = partyIdentifier

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name")
                @ExcludeMissing
                fun _partyName(): JsonField<String> = partyName

                /** Either `individual` or `business`. */
                @JsonProperty("party_type")
                @ExcludeMissing
                fun _partyType(): JsonField<PartyType> = partyType

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

                @JsonProperty("routing_details")
                @ExcludeMissing
                fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ReceivingAccount = apply {
                    if (validated) {
                        return@apply
                    }

                    accountDetails().ifPresent { it.forEach { it.validate() } }
                    accountType()
                    contactDetails().ifPresent { it.forEach { it.validate() } }
                    ledgerAccount().ifPresent { it.validate() }
                    metadata().ifPresent { it.validate() }
                    name()
                    partyAddress().ifPresent { it.validate() }
                    partyIdentifier()
                    partyName()
                    partyType()
                    plaidProcessorToken()
                    routingDetails().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
                    private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
                    private var contactDetails:
                        JsonField<MutableList<ContactDetailCreateRequest>>? =
                        null
                    private var ledgerAccount: JsonField<LedgerAccountCreateRequest> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
                    private var partyIdentifier: JsonField<String> = JsonMissing.of()
                    private var partyName: JsonField<String> = JsonMissing.of()
                    private var partyType: JsonField<PartyType> = JsonMissing.of()
                    private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
                    private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountDetails = receivingAccount.accountDetails.map { it.toMutableList() }
                        accountType = receivingAccount.accountType
                        contactDetails = receivingAccount.contactDetails.map { it.toMutableList() }
                        ledgerAccount = receivingAccount.ledgerAccount
                        metadata = receivingAccount.metadata
                        name = receivingAccount.name
                        partyAddress = receivingAccount.partyAddress
                        partyIdentifier = receivingAccount.partyIdentifier
                        partyName = receivingAccount.partyName
                        partyType = receivingAccount.partyType
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        routingDetails = receivingAccount.routingDetails.map { it.toMutableList() }
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    fun accountDetails(accountDetails: List<AccountDetail>) =
                        accountDetails(JsonField.of(accountDetails))

                    fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                        this.accountDetails = accountDetails.map { it.toMutableList() }
                    }

                    fun addAccountDetail(accountDetail: AccountDetail) = apply {
                        accountDetails =
                            (accountDetails ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(accountDetail)
                            }
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType) =
                        accountType(JsonField.of(accountType))

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                        this.accountType = accountType
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                        contactDetails(JsonField.of(contactDetails))

                    fun contactDetails(
                        contactDetails: JsonField<List<ContactDetailCreateRequest>>
                    ) = apply { this.contactDetails = contactDetails.map { it.toMutableList() } }

                    fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                        contactDetails =
                            (contactDetails ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(contactDetail)
                            }
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                        ledgerAccount(JsonField.of(ledgerAccount))

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) =
                        apply {
                            this.ledgerAccount = ledgerAccount
                        }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: Optional<String>) = name(name.orElse(null))

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest) =
                        partyAddress(JsonField.of(partyAddress))

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                        this.partyAddress = partyAddress
                    }

                    fun partyIdentifier(partyIdentifier: String) =
                        partyIdentifier(JsonField.of(partyIdentifier))

                    fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String) = partyName(JsonField.of(partyName))

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: JsonField<String>) = apply {
                        this.partyName = partyName
                    }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType?) =
                        partyType(JsonField.ofNullable(partyType))

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: Optional<PartyType>) =
                        partyType(partyType.orElse(null))

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: JsonField<PartyType>) = apply {
                        this.partyType = partyType
                    }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String) =
                        plaidProcessorToken(JsonField.of(plaidProcessorToken))

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>) =
                        routingDetails(JsonField.of(routingDetails))

                    fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                        this.routingDetails = routingDetails.map { it.toMutableList() }
                    }

                    fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                        routingDetails =
                            (routingDetails ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(routingDetail)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            accountType,
                            (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            ledgerAccount,
                            metadata,
                            name,
                            partyAddress,
                            partyIdentifier,
                            partyName,
                            partyType,
                            plaidProcessorToken,
                            (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AccountDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("account_number")
                    @ExcludeMissing
                    private val accountNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    private val accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun accountNumber(): String = accountNumber.getRequired("account_number")

                    fun accountNumberType(): Optional<AccountNumberType> =
                        Optional.ofNullable(accountNumberType.getNullable("account_number_type"))

                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun _accountNumber(): JsonField<String> = accountNumber

                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AccountDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        accountNumber()
                        accountNumberType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var accountNumber: JsonField<String>? = null
                        private var accountNumberType: JsonField<AccountNumberType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        fun accountNumber(accountNumber: String) =
                            accountNumber(JsonField.of(accountNumber))

                        fun accountNumber(accountNumber: JsonField<String>) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType) =
                            accountNumberType(JsonField.of(accountNumberType))

                        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) =
                            apply {
                                this.accountNumberType = accountNumberType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("accountNumber", accountNumber),
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

                @NoAutoDetect
                class ContactDetailCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("contact_identifier")
                    @ExcludeMissing
                    private val contactIdentifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("contact_identifier_type")
                    @ExcludeMissing
                    private val contactIdentifierType: JsonField<ContactIdentifierType> =
                        JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun contactIdentifier(): Optional<String> =
                        Optional.ofNullable(contactIdentifier.getNullable("contact_identifier"))

                    fun contactIdentifierType(): Optional<ContactIdentifierType> =
                        Optional.ofNullable(
                            contactIdentifierType.getNullable("contact_identifier_type")
                        )

                    @JsonProperty("contact_identifier")
                    @ExcludeMissing
                    fun _contactIdentifier(): JsonField<String> = contactIdentifier

                    @JsonProperty("contact_identifier_type")
                    @ExcludeMissing
                    fun _contactIdentifierType(): JsonField<ContactIdentifierType> =
                        contactIdentifierType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): ContactDetailCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        contactIdentifier()
                        contactIdentifierType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var contactIdentifier: JsonField<String> = JsonMissing.of()
                        private var contactIdentifierType: JsonField<ContactIdentifierType> =
                            JsonMissing.of()
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

                        fun contactIdentifier(contactIdentifier: String) =
                            contactIdentifier(JsonField.of(contactIdentifier))

                        fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                            contactIdentifierType(JsonField.of(contactIdentifierType))

                        fun contactIdentifierType(
                            contactIdentifierType: JsonField<ContactIdentifierType>
                        ) = apply { this.contactIdentifierType = contactIdentifierType }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                @NoAutoDetect
                class LedgerAccountCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("currency")
                    @ExcludeMissing
                    private val currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ledger_id")
                    @ExcludeMissing
                    private val ledgerId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    private val name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("normal_balance")
                    @ExcludeMissing
                    private val normalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    private val currencyExponent: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    private val description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ledger_account_category_ids")
                    @ExcludeMissing
                    private val ledgerAccountCategoryIds: JsonField<List<String>> =
                        JsonMissing.of(),
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    private val ledgerableId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    private val metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The currency of the ledger account. */
                    fun currency(): String = currency.getRequired("currency")

                    /** The id of the ledger that this account belongs to. */
                    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

                    /** The name of the ledger account. */
                    fun name(): String = name.getRequired("name")

                    /** The normal balance of the ledger account. */
                    fun normalBalance(): TransactionDirection =
                        normalBalance.getRequired("normal_balance")

                    /** The currency exponent of the ledger account. */
                    fun currencyExponent(): Optional<Long> =
                        Optional.ofNullable(currencyExponent.getNullable("currency_exponent"))

                    /** The description of the ledger account. */
                    fun description(): Optional<String> =
                        Optional.ofNullable(description.getNullable("description"))

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    fun ledgerAccountCategoryIds(): Optional<List<String>> =
                        Optional.ofNullable(
                            ledgerAccountCategoryIds.getNullable("ledger_account_category_ids")
                        )

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    fun ledgerableId(): Optional<String> =
                        Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    fun ledgerableType(): Optional<LedgerableType> =
                        Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Optional<Metadata> =
                        Optional.ofNullable(metadata.getNullable("metadata"))

                    /** The currency of the ledger account. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id")
                    @ExcludeMissing
                    fun _ledgerId(): JsonField<String> = ledgerId

                    /** The name of the ledger account. */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    @ExcludeMissing
                    fun _normalBalance(): JsonField<TransactionDirection> = normalBalance

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    fun _currencyExponent(): JsonField<Long> = currencyExponent

                    /** The description of the ledger account. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    @ExcludeMissing
                    fun _ledgerAccountCategoryIds(): JsonField<List<String>> =
                        ledgerAccountCategoryIds

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    fun _ledgerableId(): JsonField<String> = ledgerableId

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<Metadata> = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): LedgerAccountCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        currency()
                        ledgerId()
                        name()
                        normalBalance()
                        currencyExponent()
                        description()
                        ledgerAccountCategoryIds()
                        ledgerableId()
                        ledgerableType()
                        metadata().ifPresent { it.validate() }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var currency: JsonField<String>? = null
                        private var ledgerId: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var normalBalance: JsonField<TransactionDirection>? = null
                        private var currencyExponent: JsonField<Long> = JsonMissing.of()
                        private var description: JsonField<String> = JsonMissing.of()
                        private var ledgerAccountCategoryIds: JsonField<MutableList<String>>? = null
                        private var ledgerableId: JsonField<String> = JsonMissing.of()
                        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                currency = ledgerAccountCreateRequest.currency
                                ledgerId = ledgerAccountCreateRequest.ledgerId
                                name = ledgerAccountCreateRequest.name
                                normalBalance = ledgerAccountCreateRequest.normalBalance
                                currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                description = ledgerAccountCreateRequest.description
                                ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds.map {
                                        it.toMutableList()
                                    }
                                ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties =
                                    ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                            }

                        /** The currency of the ledger account. */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /** The currency of the ledger account. */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: JsonField<String>) = apply {
                            this.ledgerId = ledgerId
                        }

                        /** The name of the ledger account. */
                        fun name(name: String) = name(JsonField.of(name))

                        /** The name of the ledger account. */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: TransactionDirection) =
                            normalBalance(JsonField.of(normalBalance))

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long?) =
                            currencyExponent(JsonField.ofNullable(currencyExponent))

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long) =
                            currencyExponent(currencyExponent as Long?)

                        /** The currency exponent of the ledger account. */
                        @Suppress(
                            "USELESS_CAST"
                        ) // See https://youtrack.jetbrains.com/issue/KT-74228
                        fun currencyExponent(currencyExponent: Optional<Long>) =
                            currencyExponent(currencyExponent.orElse(null) as Long?)

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /** The description of the ledger account. */
                        fun description(description: String?) =
                            description(JsonField.ofNullable(description))

                        /** The description of the ledger account. */
                        fun description(description: Optional<String>) =
                            description(description.orElse(null))

                        /** The description of the ledger account. */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                            ledgerAccountCategoryIds(JsonField.of(ledgerAccountCategoryIds))

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(
                            ledgerAccountCategoryIds: JsonField<List<String>>
                        ) = apply {
                            this.ledgerAccountCategoryIds =
                                ledgerAccountCategoryIds.map { it.toMutableList() }
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                            ledgerAccountCategoryIds =
                                (ledgerAccountCategoryIds ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(ledgerAccountCategoryId)
                                }
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: String) =
                            ledgerableId(JsonField.of(ledgerableId))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: LedgerableType) =
                            ledgerableType(JsonField.of(ledgerableType))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("currency", currency),
                                checkRequired("ledgerId", ledgerId),
                                checkRequired("name", name),
                                checkRequired("normalBalance", normalBalance),
                                currencyExponent,
                                description,
                                (ledgerAccountCategoryIds ?: JsonMissing.of()).map {
                                    it.toImmutable()
                                },
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
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
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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

                        return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                @NoAutoDetect
                class AddressRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("locality")
                    @ExcludeMissing
                    private val locality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    private val postalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    private val region: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    fun country(): Optional<String> =
                        Optional.ofNullable(country.getNullable("country"))

                    fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /** Locality or City. */
                    fun locality(): Optional<String> =
                        Optional.ofNullable(locality.getNullable("locality"))

                    /** The postal code of the address. */
                    fun postalCode(): Optional<String> =
                        Optional.ofNullable(postalCode.getNullable("postal_code"))

                    /** Region or State. */
                    fun region(): Optional<String> =
                        Optional.ofNullable(region.getNullable("region"))

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /** Locality or City. */
                    @JsonProperty("locality")
                    @ExcludeMissing
                    fun _locality(): JsonField<String> = locality

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /** Region or State. */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddressRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        country()
                        line1()
                        line2()
                        locality()
                        postalCode()
                        region()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var country: JsonField<String> = JsonMissing.of()
                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var locality: JsonField<String> = JsonMissing.of()
                        private var postalCode: JsonField<String> = JsonMissing.of()
                        private var region: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addressRequest: AddressRequest) = apply {
                            country = addressRequest.country
                            line1 = addressRequest.line1
                            line2 = addressRequest.line2
                            locality = addressRequest.locality
                            postalCode = addressRequest.postalCode
                            region = addressRequest.region
                            additionalProperties =
                                addressRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String?) = country(JsonField.ofNullable(country))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: Optional<String>) = country(country.orElse(null))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                        fun line1(line1: Optional<String>) = line1(line1.orElse(null))

                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

                        /** Locality or City. */
                        fun locality(locality: Optional<String>) = locality(locality.orElse(null))

                        /** Locality or City. */
                        fun locality(locality: JsonField<String>) = apply {
                            this.locality = locality
                        }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String?) =
                            postalCode(JsonField.ofNullable(postalCode))

                        /** The postal code of the address. */
                        fun postalCode(postalCode: Optional<String>) =
                            postalCode(postalCode.orElse(null))

                        /** The postal code of the address. */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** Region or State. */
                        fun region(region: String?) = region(JsonField.ofNullable(region))

                        /** Region or State. */
                        fun region(region: Optional<String>) = region(region.orElse(null))

                        /** Region or State. */
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                country,
                                line1,
                                line2,
                                locality,
                                postalCode,
                                region,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
                }

                /** Either `individual` or `business`. */
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

                @NoAutoDetect
                class RoutingDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    private val routingNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    private val routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
                    @JsonProperty("payment_type")
                    @ExcludeMissing
                    private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun routingNumber(): String = routingNumber.getRequired("routing_number")

                    fun routingNumberType(): RoutingNumberType =
                        routingNumberType.getRequired("routing_number_type")

                    fun paymentType(): Optional<PaymentType> =
                        Optional.ofNullable(paymentType.getNullable("payment_type"))

                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun _routingNumber(): JsonField<String> = routingNumber

                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

                    @JsonProperty("payment_type")
                    @ExcludeMissing
                    fun _paymentType(): JsonField<PaymentType> = paymentType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RoutingDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        routingNumber()
                        routingNumberType()
                        paymentType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var routingNumber: JsonField<String>? = null
                        private var routingNumberType: JsonField<RoutingNumberType>? = null
                        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        fun routingNumber(routingNumber: String) =
                            routingNumber(JsonField.of(routingNumber))

                        fun routingNumber(routingNumber: JsonField<String>) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) =
                            routingNumberType(JsonField.of(routingNumberType))

                        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) =
                            apply {
                                this.routingNumberType = routingNumberType
                            }

                        fun paymentType(paymentType: PaymentType) =
                            paymentType(JsonField.of(paymentType))

                        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("routingNumber", routingNumber),
                                checkRequired("routingNumberType", routingNumberType),
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

                            @JvmField
                            val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

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
                            SG_INTERBANK_CLEARING_CODE,
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
                            SG_INTERBANK_CLEARING_CODE,
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
                                SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
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
                                SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
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

                    return /* spotless:off */ other is ReceivingAccount && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ReceivingAccount{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentOrderAsyncCreateRequest && amount == other.amount && direction == other.direction && originatingAccountId == other.originatingAccountId && type == other.type && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && chargeBearer == other.chargeBearer && currency == other.currency && description == other.description && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && fallbackType == other.fallbackType && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && lineItems == other.lineItems && metadata == other.metadata && nsfProtected == other.nsfProtected && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccount == other.receivingAccount && receivingAccountId == other.receivingAccountId && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && subtype == other.subtype && transactionMonitoringEnabled == other.transactionMonitoringEnabled && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, direction, originatingAccountId, type, accounting, accountingCategoryId, accountingLedgerClassId, chargeBearer, currency, description, effectiveDate, expiresAt, fallbackType, foreignExchangeContract, foreignExchangeIndicator, ledgerTransaction, ledgerTransactionId, lineItems, metadata, nsfProtected, originatingPartyName, priority, processAfter, purpose, receivingAccount, receivingAccountId, remittanceInformation, sendRemittanceAdvice, statementDescriptor, subtype, transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderAsyncCreateRequest{amount=$amount, direction=$direction, originatingAccountId=$originatingAccountId, type=$type, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, chargeBearer=$chargeBearer, currency=$currency, description=$description, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, subtype=$subtype, transactionMonitoringEnabled=$transactionMonitoringEnabled, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ExpectedPaymentCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            private val amountLowerBound: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            private val amountUpperBound: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            private val counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("date_lower_bound")
            @ExcludeMissing
            private val dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("date_upper_bound")
            @ExcludeMissing
            private val dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            private val internalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            private val ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                JsonMissing.of(),
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            private val ledgerTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line_items")
            @ExcludeMissing
            private val lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            private val reconciliationFilters: JsonValue = JsonMissing.of(),
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            private val reconciliationGroups: JsonValue = JsonMissing.of(),
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>> =
                JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            private val remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            private val statementDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(): Optional<Long> =
                Optional.ofNullable(amountLowerBound.getNullable("amount_lower_bound"))

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(): Optional<Long> =
                Optional.ofNullable(amountUpperBound.getNullable("amount_upper_bound"))

            /** The ID of the counterparty you expect for this payment. */
            fun counterpartyId(): Optional<String> =
                Optional.ofNullable(counterpartyId.getNullable("counterparty_id"))

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            fun currency(): Optional<Currency> =
                Optional.ofNullable(currency.getNullable("currency"))

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            fun dateLowerBound(): Optional<LocalDate> =
                Optional.ofNullable(dateLowerBound.getNullable("date_lower_bound"))

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            fun dateUpperBound(): Optional<LocalDate> =
                Optional.ofNullable(dateUpperBound.getNullable("date_upper_bound"))

            /** An optional description for internal use. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            fun direction(): Optional<Direction> =
                Optional.ofNullable(direction.getNullable("direction"))

            /** The ID of the Internal Account for the expected payment. */
            fun internalAccountId(): Optional<String> =
                Optional.ofNullable(internalAccountId.getNullable("internal_account_id"))

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            fun ledgerTransaction(): Optional<LedgerTransactionCreateRequest> =
                Optional.ofNullable(ledgerTransaction.getNullable("ledger_transaction"))

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            fun ledgerTransactionId(): Optional<String> =
                Optional.ofNullable(ledgerTransactionId.getNullable("ledger_transaction_id"))

            fun lineItems(): Optional<List<LineItemRequest>> =
                Optional.ofNullable(lineItems.getNullable("line_items"))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            fun _reconciliationFilters(): JsonValue = reconciliationFilters

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            fun _reconciliationGroups(): JsonValue = reconciliationGroups

            /** An array of reconciliation rule variables for this payment. */
            fun reconciliationRuleVariables(): Optional<List<ReconciliationRule>> =
                Optional.ofNullable(
                    reconciliationRuleVariables.getNullable("reconciliation_rule_variables")
                )

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            fun statementDescriptor(): Optional<String> =
                Optional.ofNullable(statementDescriptor.getNullable("statement_descriptor"))

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            fun type(): Optional<ExpectedPaymentType> =
                Optional.ofNullable(type.getNullable("type"))

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            fun _amountLowerBound(): JsonField<Long> = amountLowerBound

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            fun _amountUpperBound(): JsonField<Long> = amountUpperBound

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound")
            @ExcludeMissing
            fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound")
            @ExcludeMissing
            fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

            /** An optional description for internal use. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId(): JsonField<String> = internalAccountId

            /**
             * Specifies a ledger transaction object that will be created with the expected payment.
             * If the ledger transaction cannot be created, then the expected payment creation will
             * fail. The resulting ledger transaction will mirror the status of the expected
             * payment.
             */
            @JsonProperty("ledger_transaction")
            @ExcludeMissing
            fun _ledgerTransaction(): JsonField<LedgerTransactionCreateRequest> = ledgerTransaction

            /**
             * Either ledger_transaction or ledger_transaction_id can be provided. Only a pending
             * ledger transaction can be attached upon expected payment creation. Once the expected
             * payment is created, the status of the ledger transaction tracks the expected payment
             * automatically.
             */
            @JsonProperty("ledger_transaction_id")
            @ExcludeMissing
            fun _ledgerTransactionId(): JsonField<String> = ledgerTransactionId

            @JsonProperty("line_items")
            @ExcludeMissing
            fun _lineItems(): JsonField<List<LineItemRequest>> = lineItems

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
                reconciliationRuleVariables

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ExpectedPaymentCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amountLowerBound()
                amountUpperBound()
                counterpartyId()
                currency()
                dateLowerBound()
                dateUpperBound()
                description()
                direction()
                internalAccountId()
                ledgerTransaction().ifPresent { it.validate() }
                ledgerTransactionId()
                lineItems().ifPresent { it.forEach { it.validate() } }
                metadata().ifPresent { it.validate() }
                reconciliationRuleVariables().ifPresent { it.forEach { it.validate() } }
                remittanceInformation()
                statementDescriptor()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amountLowerBound: JsonField<Long> = JsonMissing.of()
                private var amountUpperBound: JsonField<Long> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
                private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var ledgerTransaction: JsonField<LedgerTransactionCreateRequest> =
                    JsonMissing.of()
                private var ledgerTransactionId: JsonField<String> = JsonMissing.of()
                private var lineItems: JsonField<MutableList<LineItemRequest>>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var reconciliationFilters: JsonValue = JsonMissing.of()
                private var reconciliationGroups: JsonValue = JsonMissing.of()
                private var reconciliationRuleVariables:
                    JsonField<MutableList<ReconciliationRule>>? =
                    null
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(expectedPaymentCreateRequest: ExpectedPaymentCreateRequest) =
                    apply {
                        amountLowerBound = expectedPaymentCreateRequest.amountLowerBound
                        amountUpperBound = expectedPaymentCreateRequest.amountUpperBound
                        counterpartyId = expectedPaymentCreateRequest.counterpartyId
                        currency = expectedPaymentCreateRequest.currency
                        dateLowerBound = expectedPaymentCreateRequest.dateLowerBound
                        dateUpperBound = expectedPaymentCreateRequest.dateUpperBound
                        description = expectedPaymentCreateRequest.description
                        direction = expectedPaymentCreateRequest.direction
                        internalAccountId = expectedPaymentCreateRequest.internalAccountId
                        ledgerTransaction = expectedPaymentCreateRequest.ledgerTransaction
                        ledgerTransactionId = expectedPaymentCreateRequest.ledgerTransactionId
                        lineItems =
                            expectedPaymentCreateRequest.lineItems.map { it.toMutableList() }
                        metadata = expectedPaymentCreateRequest.metadata
                        reconciliationFilters = expectedPaymentCreateRequest.reconciliationFilters
                        reconciliationGroups = expectedPaymentCreateRequest.reconciliationGroups
                        reconciliationRuleVariables =
                            expectedPaymentCreateRequest.reconciliationRuleVariables.map {
                                it.toMutableList()
                            }
                        remittanceInformation = expectedPaymentCreateRequest.remittanceInformation
                        statementDescriptor = expectedPaymentCreateRequest.statementDescriptor
                        type = expectedPaymentCreateRequest.type
                        additionalProperties =
                            expectedPaymentCreateRequest.additionalProperties.toMutableMap()
                    }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long?) =
                    amountLowerBound(JsonField.ofNullable(amountLowerBound))

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(amountLowerBound as Long?)

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun amountLowerBound(amountLowerBound: Optional<Long>) =
                    amountLowerBound(amountLowerBound.orElse(null) as Long?)

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long?) =
                    amountUpperBound(JsonField.ofNullable(amountUpperBound))

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(amountUpperBound as Long?)

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun amountUpperBound(amountUpperBound: Optional<Long>) =
                    amountUpperBound(amountUpperBound.orElse(null) as Long?)

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: Optional<String>) =
                    counterpartyId(counterpartyId.orElse(null))

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Optional<Currency>) = currency(currency.orElse(null))

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate?) =
                    dateLowerBound(JsonField.ofNullable(dateLowerBound))

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: Optional<LocalDate>) =
                    dateLowerBound(dateLowerBound.orElse(null))

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate?) =
                    dateUpperBound(JsonField.ofNullable(dateUpperBound))

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: Optional<LocalDate>) =
                    dateUpperBound(dateUpperBound.orElse(null))

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** An optional description for internal use. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /** An optional description for internal use. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Direction?) = direction(JsonField.ofNullable(direction))

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Optional<Direction>) = direction(direction.orElse(null))

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String?) =
                    internalAccountId(JsonField.ofNullable(internalAccountId))

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: Optional<String>) =
                    internalAccountId(internalAccountId.orElse(null))

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Specifies a ledger transaction object that will be created with the expected
                 * payment. If the ledger transaction cannot be created, then the expected payment
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the expected payment.
                 */
                fun ledgerTransaction(ledgerTransaction: LedgerTransactionCreateRequest) =
                    ledgerTransaction(JsonField.of(ledgerTransaction))

                /**
                 * Specifies a ledger transaction object that will be created with the expected
                 * payment. If the ledger transaction cannot be created, then the expected payment
                 * creation will fail. The resulting ledger transaction will mirror the status of
                 * the expected payment.
                 */
                fun ledgerTransaction(
                    ledgerTransaction: JsonField<LedgerTransactionCreateRequest>
                ) = apply { this.ledgerTransaction = ledgerTransaction }

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon expected payment creation. Once
                 * the expected payment is created, the status of the ledger transaction tracks the
                 * expected payment automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: String) =
                    ledgerTransactionId(JsonField.of(ledgerTransactionId))

                /**
                 * Either ledger_transaction or ledger_transaction_id can be provided. Only a
                 * pending ledger transaction can be attached upon expected payment creation. Once
                 * the expected payment is created, the status of the ledger transaction tracks the
                 * expected payment automatically.
                 */
                fun ledgerTransactionId(ledgerTransactionId: JsonField<String>) = apply {
                    this.ledgerTransactionId = ledgerTransactionId
                }

                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems.map { it.toMutableList() }
                }

                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems =
                        (lineItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(lineItem)
                        }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The reconciliation filters you have for this payment. */
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** The reconciliation groups you have for this payment. */
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>?
                ) = reconciliationRuleVariables(JsonField.ofNullable(reconciliationRuleVariables))

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: Optional<List<ReconciliationRule>>
                ) = reconciliationRuleVariables(reconciliationRuleVariables.orElse(null))

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
                ) = apply {
                    this.reconciliationRuleVariables =
                        reconciliationRuleVariables.map { it.toMutableList() }
                }

                /** An array of reconciliation rule variables for this payment. */
                fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                    apply {
                        reconciliationRuleVariables =
                            (reconciliationRuleVariables ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(reconciliationRuleVariable)
                            }
                    }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: Optional<String>) =
                    remittanceInformation(remittanceInformation.orElse(null))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: Optional<String>) =
                    statementDescriptor(statementDescriptor.orElse(null))

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType?) = type(JsonField.ofNullable(type))

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: Optional<ExpectedPaymentType>) = type(type.orElse(null))

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        amountLowerBound,
                        amountUpperBound,
                        counterpartyId,
                        currency,
                        dateLowerBound,
                        dateUpperBound,
                        description,
                        direction,
                        internalAccountId,
                        ledgerTransaction,
                        ledgerTransactionId,
                        (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                        metadata,
                        reconciliationFilters,
                        reconciliationGroups,
                        (reconciliationRuleVariables ?: JsonMissing.of()).map { it.toImmutable() },
                        remittanceInformation,
                        statementDescriptor,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
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
            @NoAutoDetect
            class LedgerTransactionCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> =
                    JsonMissing.of(),
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
                @JsonProperty("ledgerable_id")
                @ExcludeMissing
                private val ledgerableId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("status")
                @ExcludeMissing
                private val status: JsonField<Status> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** An array of ledger entry objects. */
                fun ledgerEntries(): List<LedgerEntryCreateRequest> =
                    ledgerEntries.getRequired("ledger_entries")

                /** An optional description for internal use. */
                fun description(): Optional<String> =
                    Optional.ofNullable(description.getNullable("description"))

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(): Optional<OffsetDateTime> =
                    Optional.ofNullable(effectiveAt.getNullable("effective_at"))

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(): Optional<LocalDate> =
                    Optional.ofNullable(effectiveDate.getNullable("effective_date"))

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(): Optional<String> =
                    Optional.ofNullable(externalId.getNullable("external_id"))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(): Optional<String> =
                    Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(): Optional<LedgerableType> =
                    Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

                /** An array of ledger entry objects. */
                @JsonProperty("ledger_entries")
                @ExcludeMissing
                fun _ledgerEntries(): JsonField<List<LedgerEntryCreateRequest>> = ledgerEntries

                /** An optional description for internal use. */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                @JsonProperty("effective_at")
                @ExcludeMissing
                fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                @JsonProperty("effective_date")
                @ExcludeMissing
                fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                @JsonProperty("external_id")
                @ExcludeMissing
                fun _externalId(): JsonField<String> = externalId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                @JsonProperty("ledgerable_id")
                @ExcludeMissing
                fun _ledgerableId(): JsonField<String> = ledgerableId

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                @JsonProperty("ledgerable_type")
                @ExcludeMissing
                fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /** To post a ledger transaction at creation, use `posted`. */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LedgerTransactionCreateRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    ledgerEntries().forEach { it.validate() }
                    description()
                    effectiveAt()
                    effectiveDate()
                    externalId()
                    ledgerableId()
                    ledgerableType()
                    metadata().ifPresent { it.validate() }
                    status()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var ledgerEntries: JsonField<MutableList<LedgerEntryCreateRequest>>? =
                        null
                    private var description: JsonField<String> = JsonMissing.of()
                    private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                    private var externalId: JsonField<String> = JsonMissing.of()
                    private var ledgerableId: JsonField<String> = JsonMissing.of()
                    private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest
                    ) = apply {
                        ledgerEntries =
                            ledgerTransactionCreateRequest.ledgerEntries.map { it.toMutableList() }
                        description = ledgerTransactionCreateRequest.description
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        metadata = ledgerTransactionCreateRequest.metadata
                        status = ledgerTransactionCreateRequest.status
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                        ledgerEntries(JsonField.of(ledgerEntries))

                    /** An array of ledger entry objects. */
                    fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                        apply {
                            this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                        }

                    /** An array of ledger entry objects. */
                    fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                        ledgerEntries =
                            (ledgerEntries ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(ledgerEntry)
                            }
                    }

                    /** An optional description for internal use. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /** An optional description for internal use. */
                    fun description(description: Optional<String>) =
                        description(description.orElse(null))

                    /** An optional description for internal use. */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: OffsetDateTime) =
                        effectiveAt(JsonField.of(effectiveAt))

                    /**
                     * The timestamp (ISO8601 format) at which the ledger transaction happened for
                     * reporting purposes.
                     */
                    fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                        this.effectiveAt = effectiveAt
                    }

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: LocalDate) =
                        effectiveDate(JsonField.of(effectiveDate))

                    /**
                     * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                     * purposes.
                     */
                    fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                        this.effectiveDate = effectiveDate
                    }

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                    /**
                     * A unique string to represent the ledger transaction. Only one pending or
                     * posted ledger transaction may have this ID in the ledger.
                     */
                    fun externalId(externalId: JsonField<String>) = apply {
                        this.externalId = externalId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: String) =
                        ledgerableId(JsonField.of(ledgerableId))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the id will be populated here, otherwise null.
                     */
                    fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                        this.ledgerableId = ledgerableId
                    }

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    fun ledgerableType(ledgerableType: LedgerableType) =
                        ledgerableType(JsonField.of(ledgerableType))

                    /**
                     * If the ledger transaction can be reconciled to another object in Modern
                     * Treasury, the type will be populated here, otherwise null. This can be one of
                     * payment_order, incoming_payment_detail, expected_payment, return, paper_item,
                     * or reversal.
                     */
                    fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                        this.ledgerableType = ledgerableType
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: Status) = status(JsonField.of(status))

                    /** To post a ledger transaction at creation, use `posted`. */
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                            description,
                            effectiveAt,
                            effectiveDate,
                            externalId,
                            ledgerableId,
                            ledgerableType,
                            metadata,
                            status,
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class LedgerEntryCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("direction")
                    @ExcludeMissing
                    private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    private val availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                        JsonMissing.of(),
                    @JsonProperty("lock_version")
                    @ExcludeMissing
                    private val lockVersion: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    private val metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    private val pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                        JsonMissing.of(),
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    private val postedBalanceAmount: JsonField<PostedBalanceAmount> =
                        JsonMissing.of(),
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    private val showResultingLedgerAccountBalances: JsonField<Boolean> =
                        JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(): Long = amount.getRequired("amount")

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(): TransactionDirection = direction.getRequired("direction")

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                        Optional.ofNullable(
                            availableBalanceAmount.getNullable("available_balance_amount")
                        )

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(): Optional<Long> =
                        Optional.ofNullable(lockVersion.getNullable("lock_version"))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Optional<Metadata> =
                        Optional.ofNullable(metadata.getNullable("metadata"))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                        Optional.ofNullable(
                            pendingBalanceAmount.getNullable("pending_balance_amount")
                        )

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                        Optional.ofNullable(
                            postedBalanceAmount.getNullable("posted_balance_amount")
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                        Optional.ofNullable(
                            showResultingLedgerAccountBalances.getNullable(
                                "show_resulting_ledger_account_balances"
                            )
                        )

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    @JsonProperty("direction")
                    @ExcludeMissing
                    fun _direction(): JsonField<TransactionDirection> = direction

                    /** The ledger account that this ledger entry is associated with. */
                    @JsonProperty("ledger_account_id")
                    @ExcludeMissing
                    fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("available_balance_amount")
                    @ExcludeMissing
                    fun _availableBalanceAmount(): JsonField<AvailableBalanceAmount> =
                        availableBalanceAmount

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @JsonProperty("lock_version")
                    @ExcludeMissing
                    fun _lockVersion(): JsonField<Long> = lockVersion

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<Metadata> = metadata

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("pending_balance_amount")
                    @ExcludeMissing
                    fun _pendingBalanceAmount(): JsonField<PendingBalanceAmount> =
                        pendingBalanceAmount

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    @JsonProperty("posted_balance_amount")
                    @ExcludeMissing
                    fun _postedBalanceAmount(): JsonField<PostedBalanceAmount> = postedBalanceAmount

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @JsonProperty("show_resulting_ledger_account_balances")
                    @ExcludeMissing
                    fun _showResultingLedgerAccountBalances(): JsonField<Boolean> =
                        showResultingLedgerAccountBalances

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): LedgerEntryCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        direction()
                        ledgerAccountId()
                        availableBalanceAmount().ifPresent { it.validate() }
                        lockVersion()
                        metadata().ifPresent { it.validate() }
                        pendingBalanceAmount().ifPresent { it.validate() }
                        postedBalanceAmount().ifPresent { it.validate() }
                        showResultingLedgerAccountBalances()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var amount: JsonField<Long>? = null
                        private var direction: JsonField<TransactionDirection>? = null
                        private var ledgerAccountId: JsonField<String>? = null
                        private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                            JsonMissing.of()
                        private var lockVersion: JsonField<Long> = JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                            JsonMissing.of()
                        private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                            JsonMissing.of()
                        private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) =
                            apply {
                                amount = ledgerEntryCreateRequest.amount
                                direction = ledgerEntryCreateRequest.direction
                                ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                                availableBalanceAmount =
                                    ledgerEntryCreateRequest.availableBalanceAmount
                                lockVersion = ledgerEntryCreateRequest.lockVersion
                                metadata = ledgerEntryCreateRequest.metadata
                                pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                                postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                                showResultingLedgerAccountBalances =
                                    ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                                additionalProperties =
                                    ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                            }

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: Long) = amount(JsonField.of(amount))

                        /**
                         * Value in specified currency's smallest unit. e.g. $10 would be
                         * represented as 1000. Can be any integer up to 36 digits.
                         */
                        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: TransactionDirection) =
                            direction(JsonField.of(direction))

                        /**
                         * One of `credit`, `debit`. Describes the direction money is flowing in the
                         * transaction. A `credit` moves money from your account to someone else's.
                         * A `debit` pulls money from someone else's account to your own. Note that
                         * wire, rtp, and check payments will always be `credit`.
                         */
                        fun direction(direction: JsonField<TransactionDirection>) = apply {
                            this.direction = direction
                        }

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: String) =
                            ledgerAccountId(JsonField.of(ledgerAccountId))

                        /** The ledger account that this ledger entry is associated with. */
                        fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                            this.ledgerAccountId = ledgerAccountId
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: AvailableBalanceAmount?
                        ) = availableBalanceAmount(JsonField.ofNullable(availableBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: Optional<AvailableBalanceAmount>
                        ) = availableBalanceAmount(availableBalanceAmount.orElse(null))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s available balance. If any of these conditions would be
                         * false after the transaction is created, the entire call will fail with
                         * error code 422.
                         */
                        fun availableBalanceAmount(
                            availableBalanceAmount: JsonField<AvailableBalanceAmount>
                        ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long?) =
                            lockVersion(JsonField.ofNullable(lockVersion))

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        @Suppress(
                            "USELESS_CAST"
                        ) // See https://youtrack.jetbrains.com/issue/KT-74228
                        fun lockVersion(lockVersion: Optional<Long>) =
                            lockVersion(lockVersion.orElse(null) as Long?)

                        /**
                         * Lock version of the ledger account. This can be passed when creating a
                         * ledger transaction to only succeed if no ledger transactions have posted
                         * since the given version. See our post about Designing the Ledgers API
                         * with Optimistic Locking for more details.
                         */
                        fun lockVersion(lockVersion: JsonField<Long>) = apply {
                            this.lockVersion = lockVersion
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                            pendingBalanceAmount(JsonField.ofNullable(pendingBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(
                            pendingBalanceAmount: Optional<PendingBalanceAmount>
                        ) = pendingBalanceAmount(pendingBalanceAmount.orElse(null))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s pending balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun pendingBalanceAmount(
                            pendingBalanceAmount: JsonField<PendingBalanceAmount>
                        ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) =
                            postedBalanceAmount(JsonField.ofNullable(postedBalanceAmount))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(
                            postedBalanceAmount: Optional<PostedBalanceAmount>
                        ) = postedBalanceAmount(postedBalanceAmount.orElse(null))

                        /**
                         * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on
                         * the account’s posted balance. If any of these conditions would be false
                         * after the transaction is created, the entire call will fail with error
                         * code 422.
                         */
                        fun postedBalanceAmount(
                            postedBalanceAmount: JsonField<PostedBalanceAmount>
                        ) = apply { this.postedBalanceAmount = postedBalanceAmount }

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean?
                        ) =
                            showResultingLedgerAccountBalances(
                                JsonField.ofNullable(showResultingLedgerAccountBalances)
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Boolean
                        ) =
                            showResultingLedgerAccountBalances(
                                showResultingLedgerAccountBalances as Boolean?
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        @Suppress(
                            "USELESS_CAST"
                        ) // See https://youtrack.jetbrains.com/issue/KT-74228
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: Optional<Boolean>
                        ) =
                            showResultingLedgerAccountBalances(
                                showResultingLedgerAccountBalances.orElse(null) as Boolean?
                            )

                        /**
                         * If true, response will include the balance of the associated ledger
                         * account for the entry.
                         */
                        fun showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances: JsonField<Boolean>
                        ) = apply {
                            this.showResultingLedgerAccountBalances =
                                showResultingLedgerAccountBalances
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("amount", amount),
                                checkRequired("direction", direction),
                                checkRequired("ledgerAccountId", ledgerAccountId),
                                availableBalanceAmount,
                                lockVersion,
                                metadata,
                                pendingBalanceAmount,
                                postedBalanceAmount,
                                showResultingLedgerAccountBalances,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    @NoAutoDetect
                    class AvailableBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): AvailableBalanceAmount = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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
                    @NoAutoDetect
                    class PendingBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): PendingBalanceAmount = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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
                    @NoAutoDetect
                    class PostedBalanceAmount
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): PostedBalanceAmount = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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

                        return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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

                /** To post a ledger transaction at creation, use `posted`. */
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

                    return /* spotless:off */ other is LedgerTransactionCreateRequest && ledgerEntries == other.ledgerEntries && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(ledgerEntries, description, effectiveAt, effectiveDate, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerTransactionCreateRequest{ledgerEntries=$ledgerEntries, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class LineItemRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                private val accountingCategoryId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                private val description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(): Optional<String> =
                    Optional.ofNullable(accountingCategoryId.getNullable("accounting_category_id"))

                /** A free-form description of the line item. */
                fun description(): Optional<String> =
                    Optional.ofNullable(description.getNullable("description"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

                /** A free-form description of the line item. */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LineItemRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    accountingCategoryId()
                    description()
                    metadata().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        description = lineItemRequest.description
                        metadata = lineItemRequest.metadata
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) =
                        accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: Optional<String>) =
                        accountingCategoryId(accountingCategoryId.orElse(null))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /** A free-form description of the line item. */
                    fun description(description: Optional<String>) =
                        description(description.orElse(null))

                    /** A free-form description of the line item. */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            checkRequired("amount", amount),
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && accountingCategoryId == other.accountingCategoryId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

                return /* spotless:off */ other is ExpectedPaymentCreateRequest && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && ledgerTransaction == other.ledgerTransaction && ledgerTransactionId == other.ledgerTransactionId && lineItems == other.lineItems && metadata == other.metadata && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, ledgerTransaction, ledgerTransactionId, lineItems, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedPaymentCreateRequest{amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, ledgerTransaction=$ledgerTransaction, ledgerTransactionId=$ledgerTransactionId, lineItems=$lineItems, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class LedgerTransactionCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> = JsonMissing.of(),
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
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            private val ledgerableId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<Status> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** An array of ledger entry objects. */
            fun ledgerEntries(): List<LedgerEntryCreateRequest> =
                ledgerEntries.getRequired("ledger_entries")

            /** An optional description for internal use. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(effectiveAt.getNullable("effective_at"))

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveDate(): Optional<LocalDate> =
                Optional.ofNullable(effectiveDate.getNullable("effective_date"))

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            fun externalId(): Optional<String> =
                Optional.ofNullable(externalId.getNullable("external_id"))

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            fun ledgerableId(): Optional<String> =
                Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            fun ledgerableType(): Optional<LedgerableType> =
                Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            fun _ledgerEntries(): JsonField<List<LedgerEntryCreateRequest>> = ledgerEntries

            /** An optional description for internal use. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

            /**
             * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

            /**
             * A unique string to represent the ledger transaction. Only one pending or posted
             * ledger transaction may have this ID in the ledger.
             */
            @JsonProperty("external_id")
            @ExcludeMissing
            fun _externalId(): JsonField<String> = externalId

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            fun _ledgerableId(): JsonField<String> = ledgerableId

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LedgerTransactionCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                ledgerEntries().forEach { it.validate() }
                description()
                effectiveAt()
                effectiveDate()
                externalId()
                ledgerableId()
                ledgerableType()
                metadata().ifPresent { it.validate() }
                status()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var ledgerEntries: JsonField<MutableList<LedgerEntryCreateRequest>>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var externalId: JsonField<String> = JsonMissing.of()
                private var ledgerableId: JsonField<String> = JsonMissing.of()
                private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ledgerTransactionCreateRequest: LedgerTransactionCreateRequest) =
                    apply {
                        ledgerEntries =
                            ledgerTransactionCreateRequest.ledgerEntries.map { it.toMutableList() }
                        description = ledgerTransactionCreateRequest.description
                        effectiveAt = ledgerTransactionCreateRequest.effectiveAt
                        effectiveDate = ledgerTransactionCreateRequest.effectiveDate
                        externalId = ledgerTransactionCreateRequest.externalId
                        ledgerableId = ledgerTransactionCreateRequest.ledgerableId
                        ledgerableType = ledgerTransactionCreateRequest.ledgerableType
                        metadata = ledgerTransactionCreateRequest.metadata
                        status = ledgerTransactionCreateRequest.status
                        additionalProperties =
                            ledgerTransactionCreateRequest.additionalProperties.toMutableMap()
                    }

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                    ledgerEntries(JsonField.of(ledgerEntries))

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                    apply {
                        this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                    }

                /** An array of ledger entry objects. */
                fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                    ledgerEntries =
                        (ledgerEntries ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(ledgerEntry)
                        }
                }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** An optional description for internal use. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /** An optional description for internal use. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * The date (YYYY-MM-DD) on which the ledger transaction happened for reporting
                 * purposes.
                 */
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(externalId: String) = externalId(JsonField.of(externalId))

                /**
                 * A unique string to represent the ledger transaction. Only one pending or posted
                 * ledger transaction may have this ID in the ledger.
                 */
                fun externalId(externalId: JsonField<String>) = apply {
                    this.externalId = externalId
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                    this.ledgerableId = ledgerableId
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(ledgerableType: LedgerableType) =
                    ledgerableType(JsonField.of(ledgerableType))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: Status) = status(JsonField.of(status))

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        checkRequired("ledgerEntries", ledgerEntries).map { it.toImmutable() },
                        description,
                        effectiveAt,
                        effectiveDate,
                        externalId,
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        status,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class LedgerEntryCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
                @JsonProperty("ledger_account_id")
                @ExcludeMissing
                private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("available_balance_amount")
                @ExcludeMissing
                private val availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                    JsonMissing.of(),
                @JsonProperty("lock_version")
                @ExcludeMissing
                private val lockVersion: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("pending_balance_amount")
                @ExcludeMissing
                private val pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                    JsonMissing.of(),
                @JsonProperty("posted_balance_amount")
                @ExcludeMissing
                private val postedBalanceAmount: JsonField<PostedBalanceAmount> = JsonMissing.of(),
                @JsonProperty("show_resulting_ledger_account_balances")
                @ExcludeMissing
                private val showResultingLedgerAccountBalances: JsonField<Boolean> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(): TransactionDirection = direction.getRequired("direction")

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                    Optional.ofNullable(
                        availableBalanceAmount.getNullable("available_balance_amount")
                    )

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(): Optional<Long> =
                    Optional.ofNullable(lockVersion.getNullable("lock_version"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                    Optional.ofNullable(pendingBalanceAmount.getNullable("pending_balance_amount"))

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                    Optional.ofNullable(postedBalanceAmount.getNullable("posted_balance_amount"))

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                    Optional.ofNullable(
                        showResultingLedgerAccountBalances.getNullable(
                            "show_resulting_ledger_account_balances"
                        )
                    )

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun _direction(): JsonField<TransactionDirection> = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id")
                @ExcludeMissing
                fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                @ExcludeMissing
                fun _availableBalanceAmount(): JsonField<AvailableBalanceAmount> =
                    availableBalanceAmount

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version")
                @ExcludeMissing
                fun _lockVersion(): JsonField<Long> = lockVersion

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                @ExcludeMissing
                fun _pendingBalanceAmount(): JsonField<PendingBalanceAmount> = pendingBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                @ExcludeMissing
                fun _postedBalanceAmount(): JsonField<PostedBalanceAmount> = postedBalanceAmount

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                @ExcludeMissing
                fun _showResultingLedgerAccountBalances(): JsonField<Boolean> =
                    showResultingLedgerAccountBalances

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LedgerEntryCreateRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    direction()
                    ledgerAccountId()
                    availableBalanceAmount().ifPresent { it.validate() }
                    lockVersion()
                    metadata().ifPresent { it.validate() }
                    pendingBalanceAmount().ifPresent { it.validate() }
                    postedBalanceAmount().ifPresent { it.validate() }
                    showResultingLedgerAccountBalances()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var direction: JsonField<TransactionDirection>? = null
                    private var ledgerAccountId: JsonField<String>? = null
                    private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                        JsonMissing.of()
                    private var lockVersion: JsonField<Long> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                        JsonMissing.of()
                    private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                        JsonMissing.of()
                    private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        amount = ledgerEntryCreateRequest.amount
                        direction = ledgerEntryCreateRequest.direction
                        ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                        lockVersion = ledgerEntryCreateRequest.lockVersion
                        metadata = ledgerEntryCreateRequest.metadata
                        pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        additionalProperties =
                            ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: TransactionDirection) =
                        direction(JsonField.of(direction))

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: JsonField<TransactionDirection>) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: String) =
                        ledgerAccountId(JsonField.of(ledgerAccountId))

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
                        availableBalanceAmount(JsonField.ofNullable(availableBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(
                        availableBalanceAmount: Optional<AvailableBalanceAmount>
                    ) = availableBalanceAmount(availableBalanceAmount.orElse(null))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(
                        availableBalanceAmount: JsonField<AvailableBalanceAmount>
                    ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long?) =
                        lockVersion(JsonField.ofNullable(lockVersion))

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun lockVersion(lockVersion: Optional<Long>) =
                        lockVersion(lockVersion.orElse(null) as Long?)

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: JsonField<Long>) = apply {
                        this.lockVersion = lockVersion
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                        pendingBalanceAmount(JsonField.ofNullable(pendingBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: Optional<PendingBalanceAmount>) =
                        pendingBalanceAmount(pendingBalanceAmount.orElse(null))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(
                        pendingBalanceAmount: JsonField<PendingBalanceAmount>
                    ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) =
                        postedBalanceAmount(JsonField.ofNullable(postedBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: Optional<PostedBalanceAmount>) =
                        postedBalanceAmount(postedBalanceAmount.orElse(null))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: JsonField<PostedBalanceAmount>) =
                        apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean?
                    ) =
                        showResultingLedgerAccountBalances(
                            JsonField.ofNullable(showResultingLedgerAccountBalances)
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) =
                        showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances as Boolean?
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Optional<Boolean>
                    ) =
                        showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances.orElse(null) as Boolean?
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: JsonField<Boolean>
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            checkRequired("amount", amount),
                            checkRequired("direction", direction),
                            checkRequired("ledgerAccountId", ledgerAccountId),
                            availableBalanceAmount,
                            lockVersion,
                            metadata,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            showResultingLedgerAccountBalances,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class AvailableBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AvailableBalanceAmount = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                @NoAutoDetect
                class PendingBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): PendingBalanceAmount = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                @NoAutoDetect
                class PostedBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): PostedBalanceAmount = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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

                    return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
            }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

            /** To post a ledger transaction at creation, use `posted`. */
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

                return /* spotless:off */ other is LedgerTransactionCreateRequest && ledgerEntries == other.ledgerEntries && description == other.description && effectiveAt == other.effectiveAt && effectiveDate == other.effectiveDate && externalId == other.externalId && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(ledgerEntries, description, effectiveAt, effectiveDate, externalId, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerTransactionCreateRequest{ledgerEntries=$ledgerEntries, description=$description, effectiveAt=$effectiveAt, effectiveDate=$effectiveDate, externalId=$externalId, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TransactionCreateRequest
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("as_of_date")
            @ExcludeMissing
            private val asOfDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            private val internalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor_code")
            @ExcludeMissing
            private val vendorCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("vendor_code_type")
            @ExcludeMissing
            private val vendorCodeType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("posted")
            @ExcludeMissing
            private val posted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("vendor_description")
            @ExcludeMissing
            private val vendorDescription: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The date on which the transaction occurred. */
            fun asOfDate(): Optional<LocalDate> =
                Optional.ofNullable(asOfDate.getNullable("as_of_date"))

            /** Either `credit` or `debit`. */
            fun direction(): String = direction.getRequired("direction")

            /** The ID of the relevant Internal Account. */
            fun internalAccountId(): String = internalAccountId.getRequired("internal_account_id")

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            fun vendorCode(): Optional<String> =
                Optional.ofNullable(vendorCode.getNullable("vendor_code"))

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            fun vendorCodeType(): Optional<String> =
                Optional.ofNullable(vendorCodeType.getNullable("vendor_code_type"))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /** This field will be `true` if the transaction has posted to the account. */
            fun posted(): Optional<Boolean> = Optional.ofNullable(posted.getNullable("posted"))

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            fun vendorDescription(): Optional<String> =
                Optional.ofNullable(vendorDescription.getNullable("vendor_description"))

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The date on which the transaction occurred. */
            @JsonProperty("as_of_date")
            @ExcludeMissing
            fun _asOfDate(): JsonField<LocalDate> = asOfDate

            /** Either `credit` or `debit`. */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<String> = direction

            /** The ID of the relevant Internal Account. */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId(): JsonField<String> = internalAccountId

            /**
             * When applicable, the bank-given code that determines the transaction's category. For
             * most banks this is the BAI2/BTRS transaction code.
             */
            @JsonProperty("vendor_code")
            @ExcludeMissing
            fun _vendorCode(): JsonField<String> = vendorCode

            /**
             * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
             * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
             * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`, `swift`,
             * `us_bank`, or others.
             */
            @JsonProperty("vendor_code_type")
            @ExcludeMissing
            fun _vendorCodeType(): JsonField<String> = vendorCodeType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /** This field will be `true` if the transaction has posted to the account. */
            @JsonProperty("posted") @ExcludeMissing fun _posted(): JsonField<Boolean> = posted

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * The transaction detail text that often appears in on your bank statement and in your
             * banking portal.
             */
            @JsonProperty("vendor_description")
            @ExcludeMissing
            fun _vendorDescription(): JsonField<String> = vendorDescription

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TransactionCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                amount()
                asOfDate()
                direction()
                internalAccountId()
                vendorCode()
                vendorCodeType()
                metadata().ifPresent { it.validate() }
                posted()
                type()
                vendorDescription()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var asOfDate: JsonField<LocalDate>? = null
                private var direction: JsonField<String>? = null
                private var internalAccountId: JsonField<String>? = null
                private var vendorCode: JsonField<String>? = null
                private var vendorCodeType: JsonField<String>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var posted: JsonField<Boolean> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var vendorDescription: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transactionCreateRequest: TransactionCreateRequest) = apply {
                    amount = transactionCreateRequest.amount
                    asOfDate = transactionCreateRequest.asOfDate
                    direction = transactionCreateRequest.direction
                    internalAccountId = transactionCreateRequest.internalAccountId
                    vendorCode = transactionCreateRequest.vendorCode
                    vendorCodeType = transactionCreateRequest.vendorCodeType
                    metadata = transactionCreateRequest.metadata
                    posted = transactionCreateRequest.posted
                    type = transactionCreateRequest.type
                    vendorDescription = transactionCreateRequest.vendorDescription
                    additionalProperties =
                        transactionCreateRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The date on which the transaction occurred. */
                fun asOfDate(asOfDate: LocalDate?) = asOfDate(JsonField.ofNullable(asOfDate))

                /** The date on which the transaction occurred. */
                fun asOfDate(asOfDate: Optional<LocalDate>) = asOfDate(asOfDate.orElse(null))

                /** The date on which the transaction occurred. */
                fun asOfDate(asOfDate: JsonField<LocalDate>) = apply { this.asOfDate = asOfDate }

                /** Either `credit` or `debit`. */
                fun direction(direction: String) = direction(JsonField.of(direction))

                /** Either `credit` or `debit`. */
                fun direction(direction: JsonField<String>) = apply { this.direction = direction }

                /** The ID of the relevant Internal Account. */
                fun internalAccountId(internalAccountId: String) =
                    internalAccountId(JsonField.of(internalAccountId))

                /** The ID of the relevant Internal Account. */
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                fun vendorCode(vendorCode: String?) = vendorCode(JsonField.ofNullable(vendorCode))

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                fun vendorCode(vendorCode: Optional<String>) = vendorCode(vendorCode.orElse(null))

                /**
                 * When applicable, the bank-given code that determines the transaction's category.
                 * For most banks this is the BAI2/BTRS transaction code.
                 */
                fun vendorCode(vendorCode: JsonField<String>) = apply {
                    this.vendorCode = vendorCode
                }

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                fun vendorCodeType(vendorCodeType: String?) =
                    vendorCodeType(JsonField.ofNullable(vendorCodeType))

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                fun vendorCodeType(vendorCodeType: Optional<String>) =
                    vendorCodeType(vendorCodeType.orElse(null))

                /**
                 * The type of `vendor_code` being reported. Can be one of `bai2`, `bankprov`,
                 * `bnk_dev`, `cleartouch`, `currencycloud`, `cross_river`, `dc_bank`, `dwolla`,
                 * `evolve`, `goldman_sachs`, `iso20022`, `jpmc`, `mx`, `signet`, `silvergate`,
                 * `swift`, `us_bank`, or others.
                 */
                fun vendorCodeType(vendorCodeType: JsonField<String>) = apply {
                    this.vendorCodeType = vendorCodeType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** This field will be `true` if the transaction has posted to the account. */
                fun posted(posted: Boolean) = posted(JsonField.of(posted))

                /** This field will be `true` if the transaction has posted to the account. */
                fun posted(posted: JsonField<Boolean>) = apply { this.posted = posted }

                /**
                 * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`,
                 * `rtp`, `book`, or `sen`.
                 */
                fun type(type: Type?) = type(JsonField.ofNullable(type))

                /**
                 * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`,
                 * `rtp`, `book`, or `sen`.
                 */
                fun type(type: Optional<Type>) = type(type.orElse(null))

                /**
                 * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`,
                 * `rtp`, `book`, or `sen`.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                fun vendorDescription(vendorDescription: String?) =
                    vendorDescription(JsonField.ofNullable(vendorDescription))

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                fun vendorDescription(vendorDescription: Optional<String>) =
                    vendorDescription(vendorDescription.orElse(null))

                /**
                 * The transaction detail text that often appears in on your bank statement and in
                 * your banking portal.
                 */
                fun vendorDescription(vendorDescription: JsonField<String>) = apply {
                    this.vendorDescription = vendorDescription
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        checkRequired("amount", amount),
                        checkRequired("asOfDate", asOfDate),
                        checkRequired("direction", direction),
                        checkRequired("internalAccountId", internalAccountId),
                        checkRequired("vendorCode", vendorCode),
                        checkRequired("vendorCodeType", vendorCodeType),
                        metadata,
                        posted,
                        type,
                        vendorDescription,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

            /**
             * The type of the transaction. Examples could be `card, `ach`, `wire`, `check`, `rtp`,
             * `book`, or `sen`.
             */
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

                return /* spotless:off */ other is TransactionCreateRequest && amount == other.amount && asOfDate == other.asOfDate && direction == other.direction && internalAccountId == other.internalAccountId && vendorCode == other.vendorCode && vendorCodeType == other.vendorCodeType && metadata == other.metadata && posted == other.posted && type == other.type && vendorDescription == other.vendorDescription && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, asOfDate, direction, internalAccountId, vendorCode, vendorCodeType, metadata, posted, type, vendorDescription, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionCreateRequest{amount=$amount, asOfDate=$asOfDate, direction=$direction, internalAccountId=$internalAccountId, vendorCode=$vendorCode, vendorCodeType=$vendorCodeType, metadata=$metadata, posted=$posted, type=$type, vendorDescription=$vendorDescription, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Id
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Id = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(id: Id) = apply {
                    this.id = id.id
                    additionalProperties = id.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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

        @NoAutoDetect
        class PaymentOrderUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accounting")
            @ExcludeMissing
            private val accounting: JsonField<Accounting> = JsonMissing.of(),
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            private val accountingCategoryId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            private val accountingLedgerClassId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("charge_bearer")
            @ExcludeMissing
            private val chargeBearer: JsonField<ChargeBearer> = JsonMissing.of(),
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            private val counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("fallback_type")
            @ExcludeMissing
            private val fallbackType: JsonField<FallbackType> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            private val foreignExchangeContract: JsonField<String> = JsonMissing.of(),
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            private val foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                JsonMissing.of(),
            @JsonProperty("line_items")
            @ExcludeMissing
            private val lineItems: JsonField<List<LineItemRequest>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("nsf_protected")
            @ExcludeMissing
            private val nsfProtected: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            private val originatingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            private val originatingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Priority> = JsonMissing.of(),
            @JsonProperty("process_after")
            @ExcludeMissing
            private val processAfter: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("purpose")
            @ExcludeMissing
            private val purpose: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receiving_account")
            @ExcludeMissing
            private val receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of(),
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            private val receivingAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            private val remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            private val sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            private val statementDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("subtype")
            @ExcludeMissing
            private val subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<PaymentOrderType> = JsonMissing.of(),
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            private val ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            private val ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            private val ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            private val ultimateReceivingPartyName: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            fun accounting(): Optional<Accounting> =
                Optional.ofNullable(accounting.getNullable("accounting"))

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingCategoryId(): Optional<String> =
                Optional.ofNullable(accountingCategoryId.getNullable("accounting_category_id"))

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            fun accountingLedgerClassId(): Optional<String> =
                Optional.ofNullable(
                    accountingLedgerClassId.getNullable("accounting_ledger_class_id")
                )

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            fun amount(): Optional<Long> = Optional.ofNullable(amount.getNullable("amount"))

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            fun chargeBearer(): Optional<ChargeBearer> =
                Optional.ofNullable(chargeBearer.getNullable("charge_bearer"))

            /** Required when receiving_account_id is passed the ID of an external account. */
            fun counterpartyId(): Optional<String> =
                Optional.ofNullable(counterpartyId.getNullable("counterparty_id"))

            /** Defaults to the currency of the originating account. */
            fun currency(): Optional<Currency> =
                Optional.ofNullable(currency.getNullable("currency"))

            /** An optional description for internal use. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            fun direction(): Optional<Direction> =
                Optional.ofNullable(direction.getNullable("direction"))

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            fun effectiveDate(): Optional<LocalDate> =
                Optional.ofNullable(effectiveDate.getNullable("effective_date"))

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            fun expiresAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(expiresAt.getNullable("expires_at"))

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            fun fallbackType(): Optional<FallbackType> =
                Optional.ofNullable(fallbackType.getNullable("fallback_type"))

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            fun foreignExchangeContract(): Optional<String> =
                Optional.ofNullable(
                    foreignExchangeContract.getNullable("foreign_exchange_contract")
                )

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            fun foreignExchangeIndicator(): Optional<ForeignExchangeIndicator> =
                Optional.ofNullable(
                    foreignExchangeIndicator.getNullable("foreign_exchange_indicator")
                )

            /** An array of line items that must sum up to the amount of the payment order. */
            fun lineItems(): Optional<List<LineItemRequest>> =
                Optional.ofNullable(lineItems.getNullable("line_items"))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            fun nsfProtected(): Optional<Boolean> =
                Optional.ofNullable(nsfProtected.getNullable("nsf_protected"))

            /** The ID of one of your organization's internal accounts. */
            fun originatingAccountId(): Optional<String> =
                Optional.ofNullable(originatingAccountId.getNullable("originating_account_id"))

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            fun originatingPartyName(): Optional<String> =
                Optional.ofNullable(originatingPartyName.getNullable("originating_party_name"))

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            fun priority(): Optional<Priority> =
                Optional.ofNullable(priority.getNullable("priority"))

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            fun processAfter(): Optional<OffsetDateTime> =
                Optional.ofNullable(processAfter.getNullable("process_after"))

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            fun purpose(): Optional<String> = Optional.ofNullable(purpose.getNullable("purpose"))

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccount(): Optional<ReceivingAccount> =
                Optional.ofNullable(receivingAccount.getNullable("receiving_account"))

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            fun receivingAccountId(): Optional<String> =
                Optional.ofNullable(receivingAccountId.getNullable("receiving_account_id"))

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            fun sendRemittanceAdvice(): Optional<Boolean> =
                Optional.ofNullable(sendRemittanceAdvice.getNullable("send_remittance_advice"))

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            fun statementDescriptor(): Optional<String> =
                Optional.ofNullable(statementDescriptor.getNullable("statement_descriptor"))

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            fun subtype(): Optional<PaymentOrderSubtype> =
                Optional.ofNullable(subtype.getNullable("subtype"))

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            fun type(): Optional<PaymentOrderType> = Optional.ofNullable(type.getNullable("type"))

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(
                    ultimateOriginatingPartyIdentifier.getNullable(
                        "ultimate_originating_party_identifier"
                    )
                )

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateOriginatingPartyName(): Optional<String> =
                Optional.ofNullable(
                    ultimateOriginatingPartyName.getNullable("ultimate_originating_party_name")
                )

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyIdentifier(): Optional<String> =
                Optional.ofNullable(
                    ultimateReceivingPartyIdentifier.getNullable(
                        "ultimate_receiving_party_identifier"
                    )
                )

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            fun ultimateReceivingPartyName(): Optional<String> =
                Optional.ofNullable(
                    ultimateReceivingPartyName.getNullable("ultimate_receiving_party_name")
                )

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("accounting")
            @ExcludeMissing
            fun _accounting(): JsonField<Accounting> = accounting

            /**
             * The ID of one of your accounting categories. Note that these will only be accessible
             * if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_category_id")
            @ExcludeMissing
            fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

            /**
             * The ID of one of your accounting ledger classes. Note that these will only be
             * accessible if your accounting system has been connected.
             */
            @Deprecated("deprecated")
            @JsonProperty("accounting_ledger_class_id")
            @ExcludeMissing
            fun _accountingLedgerClassId(): JsonField<String> = accountingLedgerClassId

            /**
             * Value in specified currency's smallest unit. e.g. $10 would be represented as 1000
             * (cents). For RTP, the maximum amount allowed by the network is $100,000.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
            @JsonProperty("charge_bearer")
            @ExcludeMissing
            fun _chargeBearer(): JsonField<ChargeBearer> = chargeBearer

            /** Required when receiving_account_id is passed the ID of an external account. */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /** Defaults to the currency of the originating account. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** An optional description for internal use. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Date transactions are to be posted to the participants' account. Defaults to the
             * current business day or the next business day if the current day is a bank holiday or
             * weekend. Format: yyyy-mm-dd.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

            /** RFP payments require an expires_at. This value must be past the effective_date. */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
            @JsonProperty("fallback_type")
            @ExcludeMissing
            fun _fallbackType(): JsonField<FallbackType> = fallbackType

            /**
             * If present, indicates a specific foreign exchange contract number that has been
             * generated by your financial institution.
             */
            @JsonProperty("foreign_exchange_contract")
            @ExcludeMissing
            fun _foreignExchangeContract(): JsonField<String> = foreignExchangeContract

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator(): JsonField<ForeignExchangeIndicator> =
                foreignExchangeIndicator

            /** An array of line items that must sum up to the amount of the payment order. */
            @JsonProperty("line_items")
            @ExcludeMissing
            fun _lineItems(): JsonField<List<LineItemRequest>> = lineItems

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * A boolean to determine if NSF Protection is enabled for this payment order. Note that
             * this setting must also be turned on in your organization settings page.
             */
            @JsonProperty("nsf_protected")
            @ExcludeMissing
            fun _nsfProtected(): JsonField<Boolean> = nsfProtected

            /** The ID of one of your organization's internal accounts. */
            @JsonProperty("originating_account_id")
            @ExcludeMissing
            fun _originatingAccountId(): JsonField<String> = originatingAccountId

            /**
             * If present, this will replace your default company name on receiver's bank statement.
             * This field can only be used for ACH payments currently. For ACH, only the first 16
             * characters of this string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("originating_party_name")
            @ExcludeMissing
            fun _originatingPartyName(): JsonField<String> = originatingPartyName

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
            @JsonProperty("priority")
            @ExcludeMissing
            fun _priority(): JsonField<Priority> = priority

            /**
             * If present, Modern Treasury will not process the payment until after this time. If
             * `process_after` is past the cutoff for `effective_date`, `process_after` will take
             * precedence and `effective_date` will automatically update to reflect the earliest
             * possible sending date after `process_after`. Format is ISO8601 timestamp.
             */
            @JsonProperty("process_after")
            @ExcludeMissing
            fun _processAfter(): JsonField<OffsetDateTime> = processAfter

            /**
             * For `wire`, this is usually the purpose which is transmitted via the
             * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3 digit
             * CPA Code that will be attached to the payment.
             */
            @JsonProperty("purpose") @ExcludeMissing fun _purpose(): JsonField<String> = purpose

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account")
            @ExcludeMissing
            fun _receivingAccount(): JsonField<ReceivingAccount> = receivingAccount

            /**
             * Either `receiving_account` or `receiving_account_id` must be present. When using
             * `receiving_account_id`, you may pass the id of an external account or an internal
             * account.
             */
            @JsonProperty("receiving_account_id")
            @ExcludeMissing
            fun _receivingAccountId(): JsonField<String> = receivingAccountId

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * Send an email to the counterparty when the payment order is sent to the bank. If
             * `null`, `send_remittance_advice` on the Counterparty is used.
             */
            @JsonProperty("send_remittance_advice")
            @ExcludeMissing
            fun _sendRemittanceAdvice(): JsonField<Boolean> = sendRemittanceAdvice

            /**
             * An optional descriptor which will appear in the receiver's statement. For `check`
             * payments this field will be used as the memo line. For `ach` the maximum length is 10
             * characters. Note that for ACH payments, the name on your bank account will be
             * included automatically by the bank, so you can use the characters for other useful
             * information. For `eft` the maximum length is 15 characters.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * An additional layer of classification for the type of payment order you are doing.
             * This field is only used for `ach` payment orders currently. For `ach` payment orders,
             * the `subtype` represents the SEC code. We currently support `CCD`, `PPD`, `IAT`,
             * `CTX`, `WEB`, `CIE`, and `TEL`.
             */
            @JsonProperty("subtype")
            @ExcludeMissing
            fun _subtype(): JsonField<PaymentOrderSubtype> = subtype

            /**
             * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`, `sepa`,
             * `bacs`, `au_becs`, `interac`, `neft`, `nics`, `nz_national_clearing_code`, `sic`,
             * `signet`, `provexchange`, `zengin`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<PaymentOrderType> = type

            /**
             * This represents the identifier by which the person is known to the receiver when
             * using the CIE subtype for ACH payments. Only the first 22 characters of this string
             * will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_identifier")
            @ExcludeMissing
            fun _ultimateOriginatingPartyIdentifier(): JsonField<String> =
                ultimateOriginatingPartyIdentifier

            /**
             * This represents the name of the person that the payment is on behalf of when using
             * the CIE subtype for ACH payments. Only the first 15 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_originating_party_name")
            @ExcludeMissing
            fun _ultimateOriginatingPartyName(): JsonField<String> = ultimateOriginatingPartyName

            /**
             * This represents the name of the merchant that the payment is being sent to when using
             * the CIE subtype for ACH payments. Only the first 22 characters of this string will be
             * used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_identifier")
            @ExcludeMissing
            fun _ultimateReceivingPartyIdentifier(): JsonField<String> =
                ultimateReceivingPartyIdentifier

            /**
             * This represents the identifier by which the merchant is known to the person
             * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
             * string will be used. Any additional characters will be truncated.
             */
            @JsonProperty("ultimate_receiving_party_name")
            @ExcludeMissing
            fun _ultimateReceivingPartyName(): JsonField<String> = ultimateReceivingPartyName

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PaymentOrderUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                accounting().ifPresent { it.validate() }
                accountingCategoryId()
                accountingLedgerClassId()
                amount()
                chargeBearer()
                counterpartyId()
                currency()
                description()
                direction()
                effectiveDate()
                expiresAt()
                fallbackType()
                foreignExchangeContract()
                foreignExchangeIndicator()
                lineItems().ifPresent { it.forEach { it.validate() } }
                metadata().ifPresent { it.validate() }
                nsfProtected()
                originatingAccountId()
                originatingPartyName()
                priority()
                processAfter()
                purpose()
                receivingAccount().ifPresent { it.validate() }
                receivingAccountId()
                remittanceInformation()
                sendRemittanceAdvice()
                statementDescriptor()
                status()
                subtype()
                type()
                ultimateOriginatingPartyIdentifier()
                ultimateOriginatingPartyName()
                ultimateReceivingPartyIdentifier()
                ultimateReceivingPartyName()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var accounting: JsonField<Accounting> = JsonMissing.of()
                private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                private var accountingLedgerClassId: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var chargeBearer: JsonField<ChargeBearer> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var fallbackType: JsonField<FallbackType> = JsonMissing.of()
                private var foreignExchangeContract: JsonField<String> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<ForeignExchangeIndicator> =
                    JsonMissing.of()
                private var lineItems: JsonField<MutableList<LineItemRequest>>? = null
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var nsfProtected: JsonField<Boolean> = JsonMissing.of()
                private var originatingAccountId: JsonField<String> = JsonMissing.of()
                private var originatingPartyName: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Priority> = JsonMissing.of()
                private var processAfter: JsonField<OffsetDateTime> = JsonMissing.of()
                private var purpose: JsonField<String> = JsonMissing.of()
                private var receivingAccount: JsonField<ReceivingAccount> = JsonMissing.of()
                private var receivingAccountId: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var sendRemittanceAdvice: JsonField<Boolean> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var subtype: JsonField<PaymentOrderSubtype> = JsonMissing.of()
                private var type: JsonField<PaymentOrderType> = JsonMissing.of()
                private var ultimateOriginatingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateOriginatingPartyName: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyIdentifier: JsonField<String> = JsonMissing.of()
                private var ultimateReceivingPartyName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    paymentOrderUpdateRequestWithId: PaymentOrderUpdateRequestWithId
                ) = apply {
                    id = paymentOrderUpdateRequestWithId.id
                    accounting = paymentOrderUpdateRequestWithId.accounting
                    accountingCategoryId = paymentOrderUpdateRequestWithId.accountingCategoryId
                    accountingLedgerClassId =
                        paymentOrderUpdateRequestWithId.accountingLedgerClassId
                    amount = paymentOrderUpdateRequestWithId.amount
                    chargeBearer = paymentOrderUpdateRequestWithId.chargeBearer
                    counterpartyId = paymentOrderUpdateRequestWithId.counterpartyId
                    currency = paymentOrderUpdateRequestWithId.currency
                    description = paymentOrderUpdateRequestWithId.description
                    direction = paymentOrderUpdateRequestWithId.direction
                    effectiveDate = paymentOrderUpdateRequestWithId.effectiveDate
                    expiresAt = paymentOrderUpdateRequestWithId.expiresAt
                    fallbackType = paymentOrderUpdateRequestWithId.fallbackType
                    foreignExchangeContract =
                        paymentOrderUpdateRequestWithId.foreignExchangeContract
                    foreignExchangeIndicator =
                        paymentOrderUpdateRequestWithId.foreignExchangeIndicator
                    lineItems = paymentOrderUpdateRequestWithId.lineItems.map { it.toMutableList() }
                    metadata = paymentOrderUpdateRequestWithId.metadata
                    nsfProtected = paymentOrderUpdateRequestWithId.nsfProtected
                    originatingAccountId = paymentOrderUpdateRequestWithId.originatingAccountId
                    originatingPartyName = paymentOrderUpdateRequestWithId.originatingPartyName
                    priority = paymentOrderUpdateRequestWithId.priority
                    processAfter = paymentOrderUpdateRequestWithId.processAfter
                    purpose = paymentOrderUpdateRequestWithId.purpose
                    receivingAccount = paymentOrderUpdateRequestWithId.receivingAccount
                    receivingAccountId = paymentOrderUpdateRequestWithId.receivingAccountId
                    remittanceInformation = paymentOrderUpdateRequestWithId.remittanceInformation
                    sendRemittanceAdvice = paymentOrderUpdateRequestWithId.sendRemittanceAdvice
                    statementDescriptor = paymentOrderUpdateRequestWithId.statementDescriptor
                    status = paymentOrderUpdateRequestWithId.status
                    subtype = paymentOrderUpdateRequestWithId.subtype
                    type = paymentOrderUpdateRequestWithId.type
                    ultimateOriginatingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyIdentifier
                    ultimateOriginatingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateOriginatingPartyName
                    ultimateReceivingPartyIdentifier =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyIdentifier
                    ultimateReceivingPartyName =
                        paymentOrderUpdateRequestWithId.ultimateReceivingPartyName
                    additionalProperties =
                        paymentOrderUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun accounting(accounting: Accounting) = accounting(JsonField.of(accounting))

                fun accounting(accounting: JsonField<Accounting>) = apply {
                    this.accounting = accounting
                }

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: String?) =
                    accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: Optional<String>) =
                    accountingCategoryId(accountingCategoryId.orElse(null))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                    this.accountingCategoryId = accountingCategoryId
                }

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: String?) =
                    accountingLedgerClassId(JsonField.ofNullable(accountingLedgerClassId))

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: Optional<String>) =
                    accountingLedgerClassId(accountingLedgerClassId.orElse(null))

                /**
                 * The ID of one of your accounting ledger classes. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @Deprecated("deprecated")
                fun accountingLedgerClassId(accountingLedgerClassId: JsonField<String>) = apply {
                    this.accountingLedgerClassId = accountingLedgerClassId
                }

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented as
                 * 1000 (cents). For RTP, the maximum amount allowed by the network is $100,000.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: ChargeBearer?) =
                    chargeBearer(JsonField.ofNullable(chargeBearer))

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: Optional<ChargeBearer>) =
                    chargeBearer(chargeBearer.orElse(null))

                /**
                 * The party that will pay the fees for the payment order. Only applies to wire
                 * payment orders. Can be one of shared, sender, or receiver, which correspond
                 * respectively with the SWIFT 71A values `SHA`, `OUR`, `BEN`.
                 */
                fun chargeBearer(chargeBearer: JsonField<ChargeBearer>) = apply {
                    this.chargeBearer = chargeBearer
                }

                /** Required when receiving_account_id is passed the ID of an external account. */
                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /** Required when receiving_account_id is passed the ID of an external account. */
                fun counterpartyId(counterpartyId: Optional<String>) =
                    counterpartyId(counterpartyId.orElse(null))

                /** Required when receiving_account_id is passed the ID of an external account. */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Defaults to the currency of the originating account. */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /** Defaults to the currency of the originating account. */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** An optional description for internal use. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /** An optional description for internal use. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: LocalDate) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Date transactions are to be posted to the participants' account. Defaults to the
                 * current business day or the next business day if the current day is a bank
                 * holiday or weekend. Format: yyyy-mm-dd.
                 */
                fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: Optional<OffsetDateTime>) =
                    expiresAt(expiresAt.orElse(null))

                /**
                 * RFP payments require an expires_at. This value must be past the effective_date.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: FallbackType) =
                    fallbackType(JsonField.of(fallbackType))

                /**
                 * A payment type to fallback to if the original type is not valid for the receiving
                 * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
                 * fallback_type=ach)
                 */
                fun fallbackType(fallbackType: JsonField<FallbackType>) = apply {
                    this.fallbackType = fallbackType
                }

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: String?) =
                    foreignExchangeContract(JsonField.ofNullable(foreignExchangeContract))

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: Optional<String>) =
                    foreignExchangeContract(foreignExchangeContract.orElse(null))

                /**
                 * If present, indicates a specific foreign exchange contract number that has been
                 * generated by your financial institution.
                 */
                fun foreignExchangeContract(foreignExchangeContract: JsonField<String>) = apply {
                    this.foreignExchangeContract = foreignExchangeContract
                }

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(foreignExchangeIndicator: ForeignExchangeIndicator?) =
                    foreignExchangeIndicator(JsonField.ofNullable(foreignExchangeIndicator))

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: Optional<ForeignExchangeIndicator>
                ) = foreignExchangeIndicator(foreignExchangeIndicator.orElse(null))

                /**
                 * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
                 * `fixed_to_variable`, or `null` if the payment order currency matches the
                 * originating account currency.
                 */
                fun foreignExchangeIndicator(
                    foreignExchangeIndicator: JsonField<ForeignExchangeIndicator>
                ) = apply { this.foreignExchangeIndicator = foreignExchangeIndicator }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: List<LineItemRequest>) = lineItems(JsonField.of(lineItems))

                /** An array of line items that must sum up to the amount of the payment order. */
                fun lineItems(lineItems: JsonField<List<LineItemRequest>>) = apply {
                    this.lineItems = lineItems.map { it.toMutableList() }
                }

                /** An array of line items that must sum up to the amount of the payment order. */
                fun addLineItem(lineItem: LineItemRequest) = apply {
                    lineItems =
                        (lineItems ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(lineItem)
                        }
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: Boolean) = nsfProtected(JsonField.of(nsfProtected))

                /**
                 * A boolean to determine if NSF Protection is enabled for this payment order. Note
                 * that this setting must also be turned on in your organization settings page.
                 */
                fun nsfProtected(nsfProtected: JsonField<Boolean>) = apply {
                    this.nsfProtected = nsfProtected
                }

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: String) =
                    originatingAccountId(JsonField.of(originatingAccountId))

                /** The ID of one of your organization's internal accounts. */
                fun originatingAccountId(originatingAccountId: JsonField<String>) = apply {
                    this.originatingAccountId = originatingAccountId
                }

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: String?) =
                    originatingPartyName(JsonField.ofNullable(originatingPartyName))

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: Optional<String>) =
                    originatingPartyName(originatingPartyName.orElse(null))

                /**
                 * If present, this will replace your default company name on receiver's bank
                 * statement. This field can only be used for ACH payments currently. For ACH, only
                 * the first 16 characters of this string will be used. Any additional characters
                 * will be truncated.
                 */
                fun originatingPartyName(originatingPartyName: JsonField<String>) = apply {
                    this.originatingPartyName = originatingPartyName
                }

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: Priority) = priority(JsonField.of(priority))

                /**
                 * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day
                 * ACH or EFT transfer, respectively. For check payments, `high` can mean an
                 * overnight check rather than standard mail.
                 */
                fun priority(priority: JsonField<Priority>) = apply { this.priority = priority }

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: OffsetDateTime?) =
                    processAfter(JsonField.ofNullable(processAfter))

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: Optional<OffsetDateTime>) =
                    processAfter(processAfter.orElse(null))

                /**
                 * If present, Modern Treasury will not process the payment until after this time.
                 * If `process_after` is past the cutoff for `effective_date`, `process_after` will
                 * take precedence and `effective_date` will automatically update to reflect the
                 * earliest possible sending date after `process_after`. Format is ISO8601
                 * timestamp.
                 */
                fun processAfter(processAfter: JsonField<OffsetDateTime>) = apply {
                    this.processAfter = processAfter
                }

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: String?) = purpose(JsonField.ofNullable(purpose))

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: Optional<String>) = purpose(purpose.orElse(null))

                /**
                 * For `wire`, this is usually the purpose which is transmitted via the
                 * "InstrForDbtrAgt" field in the ISO20022 file. For `eft`, this field is the 3
                 * digit CPA Code that will be attached to the payment.
                 */
                fun purpose(purpose: JsonField<String>) = apply { this.purpose = purpose }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: ReceivingAccount) =
                    receivingAccount(JsonField.of(receivingAccount))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccount(receivingAccount: JsonField<ReceivingAccount>) = apply {
                    this.receivingAccount = receivingAccount
                }

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: String) =
                    receivingAccountId(JsonField.of(receivingAccountId))

                /**
                 * Either `receiving_account` or `receiving_account_id` must be present. When using
                 * `receiving_account_id`, you may pass the id of an external account or an internal
                 * account.
                 */
                fun receivingAccountId(receivingAccountId: JsonField<String>) = apply {
                    this.receivingAccountId = receivingAccountId
                }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: Optional<String>) =
                    remittanceInformation(remittanceInformation.orElse(null))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean?) =
                    sendRemittanceAdvice(JsonField.ofNullable(sendRemittanceAdvice))

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: Boolean) =
                    sendRemittanceAdvice(sendRemittanceAdvice as Boolean?)

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun sendRemittanceAdvice(sendRemittanceAdvice: Optional<Boolean>) =
                    sendRemittanceAdvice(sendRemittanceAdvice.orElse(null) as Boolean?)

                /**
                 * Send an email to the counterparty when the payment order is sent to the bank. If
                 * `null`, `send_remittance_advice` on the Counterparty is used.
                 */
                fun sendRemittanceAdvice(sendRemittanceAdvice: JsonField<Boolean>) = apply {
                    this.sendRemittanceAdvice = sendRemittanceAdvice
                }

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: Optional<String>) =
                    statementDescriptor(statementDescriptor.orElse(null))

                /**
                 * An optional descriptor which will appear in the receiver's statement. For `check`
                 * payments this field will be used as the memo line. For `ach` the maximum length
                 * is 10 characters. Note that for ACH payments, the name on your bank account will
                 * be included automatically by the bank, so you can use the characters for other
                 * useful information. For `eft` the maximum length is 15 characters.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * To cancel a payment order, use `cancelled`. To redraft a returned payment order,
                 * use `approved`. To undo approval on a denied or approved payment order, use
                 * `needs_approval`.
                 */
                fun status(status: Status) = status(JsonField.of(status))

                /**
                 * To cancel a payment order, use `cancelled`. To redraft a returned payment order,
                 * use `approved`. To undo approval on a denied or approved payment order, use
                 * `needs_approval`.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: PaymentOrderSubtype?) = subtype(JsonField.ofNullable(subtype))

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: Optional<PaymentOrderSubtype>) = subtype(subtype.orElse(null))

                /**
                 * An additional layer of classification for the type of payment order you are
                 * doing. This field is only used for `ach` payment orders currently. For `ach`
                 * payment orders, the `subtype` represents the SEC code. We currently support
                 * `CCD`, `PPD`, `IAT`, `CTX`, `WEB`, `CIE`, and `TEL`.
                 */
                fun subtype(subtype: JsonField<PaymentOrderSubtype>) = apply {
                    this.subtype = subtype
                }

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: PaymentOrderType) = type(JsonField.of(type))

                /**
                 * One of `ach`, `se_bankgirot`, `eft`, `wire`, `check`, `sen`, `book`, `rtp`,
                 * `sepa`, `bacs`, `au_becs`, `interac`, `neft`, `nics`,
                 * `nz_national_clearing_code`, `sic`, `signet`, `provexchange`, `zengin`.
                 */
                fun type(type: JsonField<PaymentOrderType>) = apply { this.type = type }

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: String?
                ) =
                    ultimateOriginatingPartyIdentifier(
                        JsonField.ofNullable(ultimateOriginatingPartyIdentifier)
                    )

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: Optional<String>
                ) =
                    ultimateOriginatingPartyIdentifier(
                        ultimateOriginatingPartyIdentifier.orElse(null)
                    )

                /**
                 * This represents the identifier by which the person is known to the receiver when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyIdentifier(
                    ultimateOriginatingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateOriginatingPartyIdentifier = ultimateOriginatingPartyIdentifier
                }

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: String?) =
                    ultimateOriginatingPartyName(JsonField.ofNullable(ultimateOriginatingPartyName))

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: Optional<String>) =
                    ultimateOriginatingPartyName(ultimateOriginatingPartyName.orElse(null))

                /**
                 * This represents the name of the person that the payment is on behalf of when
                 * using the CIE subtype for ACH payments. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateOriginatingPartyName(ultimateOriginatingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateOriginatingPartyName = ultimateOriginatingPartyName
                    }

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier: String?) =
                    ultimateReceivingPartyIdentifier(
                        JsonField.ofNullable(ultimateReceivingPartyIdentifier)
                    )

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: Optional<String>
                ) = ultimateReceivingPartyIdentifier(ultimateReceivingPartyIdentifier.orElse(null))

                /**
                 * This represents the name of the merchant that the payment is being sent to when
                 * using the CIE subtype for ACH payments. Only the first 22 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyIdentifier(
                    ultimateReceivingPartyIdentifier: JsonField<String>
                ) = apply {
                    this.ultimateReceivingPartyIdentifier = ultimateReceivingPartyIdentifier
                }

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: String?) =
                    ultimateReceivingPartyName(JsonField.ofNullable(ultimateReceivingPartyName))

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: Optional<String>) =
                    ultimateReceivingPartyName(ultimateReceivingPartyName.orElse(null))

                /**
                 * This represents the identifier by which the merchant is known to the person
                 * initiating an ACH payment with CIE subtype. Only the first 15 characters of this
                 * string will be used. Any additional characters will be truncated.
                 */
                fun ultimateReceivingPartyName(ultimateReceivingPartyName: JsonField<String>) =
                    apply {
                        this.ultimateReceivingPartyName = ultimateReceivingPartyName
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        id,
                        accounting,
                        accountingCategoryId,
                        accountingLedgerClassId,
                        amount,
                        chargeBearer,
                        counterpartyId,
                        currency,
                        description,
                        direction,
                        effectiveDate,
                        expiresAt,
                        fallbackType,
                        foreignExchangeContract,
                        foreignExchangeIndicator,
                        (lineItems ?: JsonMissing.of()).map { it.toImmutable() },
                        metadata,
                        nsfProtected,
                        originatingAccountId,
                        originatingPartyName,
                        priority,
                        processAfter,
                        purpose,
                        receivingAccount,
                        receivingAccountId,
                        remittanceInformation,
                        sendRemittanceAdvice,
                        statementDescriptor,
                        status,
                        subtype,
                        type,
                        ultimateOriginatingPartyIdentifier,
                        ultimateOriginatingPartyName,
                        ultimateReceivingPartyIdentifier,
                        ultimateReceivingPartyName,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Accounting
            @JsonCreator
            private constructor(
                @JsonProperty("account_id")
                @ExcludeMissing
                private val accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("class_id")
                @ExcludeMissing
                private val classId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountId(): Optional<String> =
                    Optional.ofNullable(accountId.getNullable("account_id"))

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                fun classId(): Optional<String> =
                    Optional.ofNullable(classId.getNullable("class_id"))

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("account_id")
                @ExcludeMissing
                fun _accountId(): JsonField<String> = accountId

                /**
                 * The ID of one of the class objects in your accounting system. Class objects track
                 * segments of your business independent of client or project. Note that these will
                 * only be accessible if your accounting system has been connected.
                 */
                @JsonProperty("class_id")
                @ExcludeMissing
                fun _classId(): JsonField<String> = classId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Accounting = apply {
                    if (validated) {
                        return@apply
                    }

                    accountId()
                    classId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var accountId: JsonField<String> = JsonMissing.of()
                    private var classId: JsonField<String> = JsonMissing.of()
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
                    fun accountId(accountId: String?) = accountId(JsonField.ofNullable(accountId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: Optional<String>) = accountId(accountId.orElse(null))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountId(accountId: JsonField<String>) = apply {
                        this.accountId = accountId
                    }

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: String?) = classId(JsonField.ofNullable(classId))

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: Optional<String>) = classId(classId.orElse(null))

                    /**
                     * The ID of one of the class objects in your accounting system. Class objects
                     * track segments of your business independent of client or project. Note that
                     * these will only be accessible if your accounting system has been connected.
                     */
                    fun classId(classId: JsonField<String>) = apply { this.classId = classId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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

            /**
             * The party that will pay the fees for the payment order. Only applies to wire payment
             * orders. Can be one of shared, sender, or receiver, which correspond respectively with
             * the SWIFT 71A values `SHA`, `OUR`, `BEN`.
             */
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

            /**
             * One of `credit`, `debit`. Describes the direction money is flowing in the
             * transaction. A `credit` moves money from your account to someone else's. A `debit`
             * pulls money from someone else's account to your own. Note that wire, rtp, and check
             * payments will always be `credit`.
             */
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
             * A payment type to fallback to if the original type is not valid for the receiving
             * account. Currently, this only supports falling back from RTP to ACH (type=rtp and
             * fallback_type=ach)
             */
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

            /**
             * Indicates the type of FX transfer to initiate, can be either `variable_to_fixed`,
             * `fixed_to_variable`, or `null` if the payment order currency matches the originating
             * account currency.
             */
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

            @NoAutoDetect
            class LineItemRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                private val accountingCategoryId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("description")
                @ExcludeMissing
                private val description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                fun accountingCategoryId(): Optional<String> =
                    Optional.ofNullable(accountingCategoryId.getNullable("accounting_category_id"))

                /** A free-form description of the line item. */
                fun description(): Optional<String> =
                    Optional.ofNullable(description.getNullable("description"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * The ID of one of your accounting categories. Note that these will only be
                 * accessible if your accounting system has been connected.
                 */
                @JsonProperty("accounting_category_id")
                @ExcludeMissing
                fun _accountingCategoryId(): JsonField<String> = accountingCategoryId

                /** A free-form description of the line item. */
                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LineItemRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    accountingCategoryId()
                    description()
                    metadata().ifPresent { it.validate() }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var accountingCategoryId: JsonField<String> = JsonMissing.of()
                    private var description: JsonField<String> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(lineItemRequest: LineItemRequest) = apply {
                        amount = lineItemRequest.amount
                        accountingCategoryId = lineItemRequest.accountingCategoryId
                        description = lineItemRequest.description
                        metadata = lineItemRequest.metadata
                        additionalProperties = lineItemRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: String?) =
                        accountingCategoryId(JsonField.ofNullable(accountingCategoryId))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: Optional<String>) =
                        accountingCategoryId(accountingCategoryId.orElse(null))

                    /**
                     * The ID of one of your accounting categories. Note that these will only be
                     * accessible if your accounting system has been connected.
                     */
                    fun accountingCategoryId(accountingCategoryId: JsonField<String>) = apply {
                        this.accountingCategoryId = accountingCategoryId
                    }

                    /** A free-form description of the line item. */
                    fun description(description: String?) =
                        description(JsonField.ofNullable(description))

                    /** A free-form description of the line item. */
                    fun description(description: Optional<String>) =
                        description(description.orElse(null))

                    /** A free-form description of the line item. */
                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            checkRequired("amount", amount),
                            accountingCategoryId,
                            description,
                            metadata,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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

                    return /* spotless:off */ other is LineItemRequest && amount == other.amount && accountingCategoryId == other.accountingCategoryId && description == other.description && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, accountingCategoryId, description, metadata, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LineItemRequest{amount=$amount, accountingCategoryId=$accountingCategoryId, description=$description, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

            /**
             * Either `normal` or `high`. For ACH and EFT payments, `high` represents a same-day ACH
             * or EFT transfer, respectively. For check payments, `high` can mean an overnight check
             * rather than standard mail.
             */
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
            @NoAutoDetect
            class ReceivingAccount
            @JsonCreator
            private constructor(
                @JsonProperty("account_details")
                @ExcludeMissing
                private val accountDetails: JsonField<List<AccountDetail>> = JsonMissing.of(),
                @JsonProperty("account_type")
                @ExcludeMissing
                private val accountType: JsonField<ExternalAccountType> = JsonMissing.of(),
                @JsonProperty("contact_details")
                @ExcludeMissing
                private val contactDetails: JsonField<List<ContactDetailCreateRequest>> =
                    JsonMissing.of(),
                @JsonProperty("ledger_account")
                @ExcludeMissing
                private val ledgerAccount: JsonField<LedgerAccountCreateRequest> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("party_address")
                @ExcludeMissing
                private val partyAddress: JsonField<AddressRequest> = JsonMissing.of(),
                @JsonProperty("party_identifier")
                @ExcludeMissing
                private val partyIdentifier: JsonField<String> = JsonMissing.of(),
                @JsonProperty("party_name")
                @ExcludeMissing
                private val partyName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("party_type")
                @ExcludeMissing
                private val partyType: JsonField<PartyType> = JsonMissing.of(),
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                private val plaidProcessorToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("routing_details")
                @ExcludeMissing
                private val routingDetails: JsonField<List<RoutingDetail>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun accountDetails(): Optional<List<AccountDetail>> =
                    Optional.ofNullable(accountDetails.getNullable("account_details"))

                /** Can be `checking`, `savings` or `other`. */
                fun accountType(): Optional<ExternalAccountType> =
                    Optional.ofNullable(accountType.getNullable("account_type"))

                fun contactDetails(): Optional<List<ContactDetailCreateRequest>> =
                    Optional.ofNullable(contactDetails.getNullable("contact_details"))

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                fun ledgerAccount(): Optional<LedgerAccountCreateRequest> =
                    Optional.ofNullable(ledgerAccount.getNullable("ledger_account"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                /** Required if receiving wire payments. */
                fun partyAddress(): Optional<AddressRequest> =
                    Optional.ofNullable(partyAddress.getNullable("party_address"))

                fun partyIdentifier(): Optional<String> =
                    Optional.ofNullable(partyIdentifier.getNullable("party_identifier"))

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                fun partyName(): Optional<String> =
                    Optional.ofNullable(partyName.getNullable("party_name"))

                /** Either `individual` or `business`. */
                fun partyType(): Optional<PartyType> =
                    Optional.ofNullable(partyType.getNullable("party_type"))

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                fun plaidProcessorToken(): Optional<String> =
                    Optional.ofNullable(plaidProcessorToken.getNullable("plaid_processor_token"))

                fun routingDetails(): Optional<List<RoutingDetail>> =
                    Optional.ofNullable(routingDetails.getNullable("routing_details"))

                @JsonProperty("account_details")
                @ExcludeMissing
                fun _accountDetails(): JsonField<List<AccountDetail>> = accountDetails

                /** Can be `checking`, `savings` or `other`. */
                @JsonProperty("account_type")
                @ExcludeMissing
                fun _accountType(): JsonField<ExternalAccountType> = accountType

                @JsonProperty("contact_details")
                @ExcludeMissing
                fun _contactDetails(): JsonField<List<ContactDetailCreateRequest>> = contactDetails

                /**
                 * Specifies a ledger account object that will be created with the external account.
                 * The resulting ledger account is linked to the external account for auto-ledgering
                 * Payment objects. See
                 * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects for
                 * more details.
                 */
                @JsonProperty("ledger_account")
                @ExcludeMissing
                fun _ledgerAccount(): JsonField<LedgerAccountCreateRequest> = ledgerAccount

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * A nickname for the external account. This is only for internal usage and won't
                 * affect any payments
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /** Required if receiving wire payments. */
                @JsonProperty("party_address")
                @ExcludeMissing
                fun _partyAddress(): JsonField<AddressRequest> = partyAddress

                @JsonProperty("party_identifier")
                @ExcludeMissing
                fun _partyIdentifier(): JsonField<String> = partyIdentifier

                /**
                 * If this value isn't provided, it will be inherited from the counterparty's name.
                 */
                @JsonProperty("party_name")
                @ExcludeMissing
                fun _partyName(): JsonField<String> = partyName

                /** Either `individual` or `business`. */
                @JsonProperty("party_type")
                @ExcludeMissing
                fun _partyType(): JsonField<PartyType> = partyType

                /**
                 * If you've enabled the Modern Treasury + Plaid integration in your Plaid account,
                 * you can pass the processor token in this field.
                 */
                @JsonProperty("plaid_processor_token")
                @ExcludeMissing
                fun _plaidProcessorToken(): JsonField<String> = plaidProcessorToken

                @JsonProperty("routing_details")
                @ExcludeMissing
                fun _routingDetails(): JsonField<List<RoutingDetail>> = routingDetails

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ReceivingAccount = apply {
                    if (validated) {
                        return@apply
                    }

                    accountDetails().ifPresent { it.forEach { it.validate() } }
                    accountType()
                    contactDetails().ifPresent { it.forEach { it.validate() } }
                    ledgerAccount().ifPresent { it.validate() }
                    metadata().ifPresent { it.validate() }
                    name()
                    partyAddress().ifPresent { it.validate() }
                    partyIdentifier()
                    partyName()
                    partyType()
                    plaidProcessorToken()
                    routingDetails().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var accountDetails: JsonField<MutableList<AccountDetail>>? = null
                    private var accountType: JsonField<ExternalAccountType> = JsonMissing.of()
                    private var contactDetails:
                        JsonField<MutableList<ContactDetailCreateRequest>>? =
                        null
                    private var ledgerAccount: JsonField<LedgerAccountCreateRequest> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var partyAddress: JsonField<AddressRequest> = JsonMissing.of()
                    private var partyIdentifier: JsonField<String> = JsonMissing.of()
                    private var partyName: JsonField<String> = JsonMissing.of()
                    private var partyType: JsonField<PartyType> = JsonMissing.of()
                    private var plaidProcessorToken: JsonField<String> = JsonMissing.of()
                    private var routingDetails: JsonField<MutableList<RoutingDetail>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(receivingAccount: ReceivingAccount) = apply {
                        accountDetails = receivingAccount.accountDetails.map { it.toMutableList() }
                        accountType = receivingAccount.accountType
                        contactDetails = receivingAccount.contactDetails.map { it.toMutableList() }
                        ledgerAccount = receivingAccount.ledgerAccount
                        metadata = receivingAccount.metadata
                        name = receivingAccount.name
                        partyAddress = receivingAccount.partyAddress
                        partyIdentifier = receivingAccount.partyIdentifier
                        partyName = receivingAccount.partyName
                        partyType = receivingAccount.partyType
                        plaidProcessorToken = receivingAccount.plaidProcessorToken
                        routingDetails = receivingAccount.routingDetails.map { it.toMutableList() }
                        additionalProperties = receivingAccount.additionalProperties.toMutableMap()
                    }

                    fun accountDetails(accountDetails: List<AccountDetail>) =
                        accountDetails(JsonField.of(accountDetails))

                    fun accountDetails(accountDetails: JsonField<List<AccountDetail>>) = apply {
                        this.accountDetails = accountDetails.map { it.toMutableList() }
                    }

                    fun addAccountDetail(accountDetail: AccountDetail) = apply {
                        accountDetails =
                            (accountDetails ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(accountDetail)
                            }
                    }

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: ExternalAccountType) =
                        accountType(JsonField.of(accountType))

                    /** Can be `checking`, `savings` or `other`. */
                    fun accountType(accountType: JsonField<ExternalAccountType>) = apply {
                        this.accountType = accountType
                    }

                    fun contactDetails(contactDetails: List<ContactDetailCreateRequest>) =
                        contactDetails(JsonField.of(contactDetails))

                    fun contactDetails(
                        contactDetails: JsonField<List<ContactDetailCreateRequest>>
                    ) = apply { this.contactDetails = contactDetails.map { it.toMutableList() } }

                    fun addContactDetail(contactDetail: ContactDetailCreateRequest) = apply {
                        contactDetails =
                            (contactDetails ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(contactDetail)
                            }
                    }

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: LedgerAccountCreateRequest) =
                        ledgerAccount(JsonField.of(ledgerAccount))

                    /**
                     * Specifies a ledger account object that will be created with the external
                     * account. The resulting ledger account is linked to the external account for
                     * auto-ledgering Payment objects. See
                     * https://docs.moderntreasury.com/docs/linking-to-other-modern-treasury-objects
                     * for more details.
                     */
                    fun ledgerAccount(ledgerAccount: JsonField<LedgerAccountCreateRequest>) =
                        apply {
                            this.ledgerAccount = ledgerAccount
                        }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: Optional<String>) = name(name.orElse(null))

                    /**
                     * A nickname for the external account. This is only for internal usage and
                     * won't affect any payments
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: AddressRequest) =
                        partyAddress(JsonField.of(partyAddress))

                    /** Required if receiving wire payments. */
                    fun partyAddress(partyAddress: JsonField<AddressRequest>) = apply {
                        this.partyAddress = partyAddress
                    }

                    fun partyIdentifier(partyIdentifier: String) =
                        partyIdentifier(JsonField.of(partyIdentifier))

                    fun partyIdentifier(partyIdentifier: JsonField<String>) = apply {
                        this.partyIdentifier = partyIdentifier
                    }

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: String) = partyName(JsonField.of(partyName))

                    /**
                     * If this value isn't provided, it will be inherited from the counterparty's
                     * name.
                     */
                    fun partyName(partyName: JsonField<String>) = apply {
                        this.partyName = partyName
                    }

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: PartyType?) =
                        partyType(JsonField.ofNullable(partyType))

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: Optional<PartyType>) =
                        partyType(partyType.orElse(null))

                    /** Either `individual` or `business`. */
                    fun partyType(partyType: JsonField<PartyType>) = apply {
                        this.partyType = partyType
                    }

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: String) =
                        plaidProcessorToken(JsonField.of(plaidProcessorToken))

                    /**
                     * If you've enabled the Modern Treasury + Plaid integration in your Plaid
                     * account, you can pass the processor token in this field.
                     */
                    fun plaidProcessorToken(plaidProcessorToken: JsonField<String>) = apply {
                        this.plaidProcessorToken = plaidProcessorToken
                    }

                    fun routingDetails(routingDetails: List<RoutingDetail>) =
                        routingDetails(JsonField.of(routingDetails))

                    fun routingDetails(routingDetails: JsonField<List<RoutingDetail>>) = apply {
                        this.routingDetails = routingDetails.map { it.toMutableList() }
                    }

                    fun addRoutingDetail(routingDetail: RoutingDetail) = apply {
                        routingDetails =
                            (routingDetails ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(routingDetail)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            (accountDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            accountType,
                            (contactDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            ledgerAccount,
                            metadata,
                            name,
                            partyAddress,
                            partyIdentifier,
                            partyName,
                            partyType,
                            plaidProcessorToken,
                            (routingDetails ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AccountDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("account_number")
                    @ExcludeMissing
                    private val accountNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    private val accountNumberType: JsonField<AccountNumberType> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun accountNumber(): String = accountNumber.getRequired("account_number")

                    fun accountNumberType(): Optional<AccountNumberType> =
                        Optional.ofNullable(accountNumberType.getNullable("account_number_type"))

                    @JsonProperty("account_number")
                    @ExcludeMissing
                    fun _accountNumber(): JsonField<String> = accountNumber

                    @JsonProperty("account_number_type")
                    @ExcludeMissing
                    fun _accountNumberType(): JsonField<AccountNumberType> = accountNumberType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AccountDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        accountNumber()
                        accountNumberType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var accountNumber: JsonField<String>? = null
                        private var accountNumberType: JsonField<AccountNumberType> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(accountDetail: AccountDetail) = apply {
                            accountNumber = accountDetail.accountNumber
                            accountNumberType = accountDetail.accountNumberType
                            additionalProperties = accountDetail.additionalProperties.toMutableMap()
                        }

                        fun accountNumber(accountNumber: String) =
                            accountNumber(JsonField.of(accountNumber))

                        fun accountNumber(accountNumber: JsonField<String>) = apply {
                            this.accountNumber = accountNumber
                        }

                        fun accountNumberType(accountNumberType: AccountNumberType) =
                            accountNumberType(JsonField.of(accountNumberType))

                        fun accountNumberType(accountNumberType: JsonField<AccountNumberType>) =
                            apply {
                                this.accountNumberType = accountNumberType
                            }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("accountNumber", accountNumber),
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

                @NoAutoDetect
                class ContactDetailCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("contact_identifier")
                    @ExcludeMissing
                    private val contactIdentifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("contact_identifier_type")
                    @ExcludeMissing
                    private val contactIdentifierType: JsonField<ContactIdentifierType> =
                        JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun contactIdentifier(): Optional<String> =
                        Optional.ofNullable(contactIdentifier.getNullable("contact_identifier"))

                    fun contactIdentifierType(): Optional<ContactIdentifierType> =
                        Optional.ofNullable(
                            contactIdentifierType.getNullable("contact_identifier_type")
                        )

                    @JsonProperty("contact_identifier")
                    @ExcludeMissing
                    fun _contactIdentifier(): JsonField<String> = contactIdentifier

                    @JsonProperty("contact_identifier_type")
                    @ExcludeMissing
                    fun _contactIdentifierType(): JsonField<ContactIdentifierType> =
                        contactIdentifierType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): ContactDetailCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        contactIdentifier()
                        contactIdentifierType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var contactIdentifier: JsonField<String> = JsonMissing.of()
                        private var contactIdentifierType: JsonField<ContactIdentifierType> =
                            JsonMissing.of()
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

                        fun contactIdentifier(contactIdentifier: String) =
                            contactIdentifier(JsonField.of(contactIdentifier))

                        fun contactIdentifier(contactIdentifier: JsonField<String>) = apply {
                            this.contactIdentifier = contactIdentifier
                        }

                        fun contactIdentifierType(contactIdentifierType: ContactIdentifierType) =
                            contactIdentifierType(JsonField.of(contactIdentifierType))

                        fun contactIdentifierType(
                            contactIdentifierType: JsonField<ContactIdentifierType>
                        ) = apply { this.contactIdentifierType = contactIdentifierType }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                @NoAutoDetect
                class LedgerAccountCreateRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("currency")
                    @ExcludeMissing
                    private val currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ledger_id")
                    @ExcludeMissing
                    private val ledgerId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    private val name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("normal_balance")
                    @ExcludeMissing
                    private val normalBalance: JsonField<TransactionDirection> = JsonMissing.of(),
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    private val currencyExponent: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("description")
                    @ExcludeMissing
                    private val description: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ledger_account_category_ids")
                    @ExcludeMissing
                    private val ledgerAccountCategoryIds: JsonField<List<String>> =
                        JsonMissing.of(),
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    private val ledgerableId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    private val metadata: JsonField<Metadata> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The currency of the ledger account. */
                    fun currency(): String = currency.getRequired("currency")

                    /** The id of the ledger that this account belongs to. */
                    fun ledgerId(): String = ledgerId.getRequired("ledger_id")

                    /** The name of the ledger account. */
                    fun name(): String = name.getRequired("name")

                    /** The normal balance of the ledger account. */
                    fun normalBalance(): TransactionDirection =
                        normalBalance.getRequired("normal_balance")

                    /** The currency exponent of the ledger account. */
                    fun currencyExponent(): Optional<Long> =
                        Optional.ofNullable(currencyExponent.getNullable("currency_exponent"))

                    /** The description of the ledger account. */
                    fun description(): Optional<String> =
                        Optional.ofNullable(description.getNullable("description"))

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    fun ledgerAccountCategoryIds(): Optional<List<String>> =
                        Optional.ofNullable(
                            ledgerAccountCategoryIds.getNullable("ledger_account_category_ids")
                        )

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    fun ledgerableId(): Optional<String> =
                        Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    fun ledgerableType(): Optional<LedgerableType> =
                        Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(): Optional<Metadata> =
                        Optional.ofNullable(metadata.getNullable("metadata"))

                    /** The currency of the ledger account. */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun _currency(): JsonField<String> = currency

                    /** The id of the ledger that this account belongs to. */
                    @JsonProperty("ledger_id")
                    @ExcludeMissing
                    fun _ledgerId(): JsonField<String> = ledgerId

                    /** The name of the ledger account. */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /** The normal balance of the ledger account. */
                    @JsonProperty("normal_balance")
                    @ExcludeMissing
                    fun _normalBalance(): JsonField<TransactionDirection> = normalBalance

                    /** The currency exponent of the ledger account. */
                    @JsonProperty("currency_exponent")
                    @ExcludeMissing
                    fun _currencyExponent(): JsonField<Long> = currencyExponent

                    /** The description of the ledger account. */
                    @JsonProperty("description")
                    @ExcludeMissing
                    fun _description(): JsonField<String> = description

                    /**
                     * The array of ledger account category ids that this ledger account should be a
                     * child of.
                     */
                    @JsonProperty("ledger_account_category_ids")
                    @ExcludeMissing
                    fun _ledgerAccountCategoryIds(): JsonField<List<String>> =
                        ledgerAccountCategoryIds

                    /**
                     * If the ledger account links to another object in Modern Treasury, the id will
                     * be populated here, otherwise null.
                     */
                    @JsonProperty("ledgerable_id")
                    @ExcludeMissing
                    fun _ledgerableId(): JsonField<String> = ledgerableId

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
                    @JsonProperty("ledgerable_type")
                    @ExcludeMissing
                    fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    fun _metadata(): JsonField<Metadata> = metadata

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): LedgerAccountCreateRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        currency()
                        ledgerId()
                        name()
                        normalBalance()
                        currencyExponent()
                        description()
                        ledgerAccountCategoryIds()
                        ledgerableId()
                        ledgerableType()
                        metadata().ifPresent { it.validate() }
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var currency: JsonField<String>? = null
                        private var ledgerId: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var normalBalance: JsonField<TransactionDirection>? = null
                        private var currencyExponent: JsonField<Long> = JsonMissing.of()
                        private var description: JsonField<String> = JsonMissing.of()
                        private var ledgerAccountCategoryIds: JsonField<MutableList<String>>? = null
                        private var ledgerableId: JsonField<String> = JsonMissing.of()
                        private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                        private var metadata: JsonField<Metadata> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(ledgerAccountCreateRequest: LedgerAccountCreateRequest) =
                            apply {
                                currency = ledgerAccountCreateRequest.currency
                                ledgerId = ledgerAccountCreateRequest.ledgerId
                                name = ledgerAccountCreateRequest.name
                                normalBalance = ledgerAccountCreateRequest.normalBalance
                                currencyExponent = ledgerAccountCreateRequest.currencyExponent
                                description = ledgerAccountCreateRequest.description
                                ledgerAccountCategoryIds =
                                    ledgerAccountCreateRequest.ledgerAccountCategoryIds.map {
                                        it.toMutableList()
                                    }
                                ledgerableId = ledgerAccountCreateRequest.ledgerableId
                                ledgerableType = ledgerAccountCreateRequest.ledgerableType
                                metadata = ledgerAccountCreateRequest.metadata
                                additionalProperties =
                                    ledgerAccountCreateRequest.additionalProperties.toMutableMap()
                            }

                        /** The currency of the ledger account. */
                        fun currency(currency: String) = currency(JsonField.of(currency))

                        /** The currency of the ledger account. */
                        fun currency(currency: JsonField<String>) = apply {
                            this.currency = currency
                        }

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: String) = ledgerId(JsonField.of(ledgerId))

                        /** The id of the ledger that this account belongs to. */
                        fun ledgerId(ledgerId: JsonField<String>) = apply {
                            this.ledgerId = ledgerId
                        }

                        /** The name of the ledger account. */
                        fun name(name: String) = name(JsonField.of(name))

                        /** The name of the ledger account. */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: TransactionDirection) =
                            normalBalance(JsonField.of(normalBalance))

                        /** The normal balance of the ledger account. */
                        fun normalBalance(normalBalance: JsonField<TransactionDirection>) = apply {
                            this.normalBalance = normalBalance
                        }

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long?) =
                            currencyExponent(JsonField.ofNullable(currencyExponent))

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: Long) =
                            currencyExponent(currencyExponent as Long?)

                        /** The currency exponent of the ledger account. */
                        @Suppress(
                            "USELESS_CAST"
                        ) // See https://youtrack.jetbrains.com/issue/KT-74228
                        fun currencyExponent(currencyExponent: Optional<Long>) =
                            currencyExponent(currencyExponent.orElse(null) as Long?)

                        /** The currency exponent of the ledger account. */
                        fun currencyExponent(currencyExponent: JsonField<Long>) = apply {
                            this.currencyExponent = currencyExponent
                        }

                        /** The description of the ledger account. */
                        fun description(description: String?) =
                            description(JsonField.ofNullable(description))

                        /** The description of the ledger account. */
                        fun description(description: Optional<String>) =
                            description(description.orElse(null))

                        /** The description of the ledger account. */
                        fun description(description: JsonField<String>) = apply {
                            this.description = description
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(ledgerAccountCategoryIds: List<String>) =
                            ledgerAccountCategoryIds(JsonField.of(ledgerAccountCategoryIds))

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun ledgerAccountCategoryIds(
                            ledgerAccountCategoryIds: JsonField<List<String>>
                        ) = apply {
                            this.ledgerAccountCategoryIds =
                                ledgerAccountCategoryIds.map { it.toMutableList() }
                        }

                        /**
                         * The array of ledger account category ids that this ledger account should
                         * be a child of.
                         */
                        fun addLedgerAccountCategoryId(ledgerAccountCategoryId: String) = apply {
                            ledgerAccountCategoryIds =
                                (ledgerAccountCategoryIds ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(ledgerAccountCategoryId)
                                }
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: String) =
                            ledgerableId(JsonField.of(ledgerableId))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the id
                         * will be populated here, otherwise null.
                         */
                        fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                            this.ledgerableId = ledgerableId
                        }

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: LedgerableType) =
                            ledgerableType(JsonField.of(ledgerableType))

                        /**
                         * If the ledger account links to another object in Modern Treasury, the
                         * type will be populated here, otherwise null. The value is one of
                         * internal_account or external_account.
                         */
                        fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                            this.ledgerableType = ledgerableType
                        }

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                        /**
                         * Additional data represented as key-value pairs. Both the key and value
                         * must be strings.
                         */
                        fun metadata(metadata: JsonField<Metadata>) = apply {
                            this.metadata = metadata
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("currency", currency),
                                checkRequired("ledgerId", ledgerId),
                                checkRequired("name", name),
                                checkRequired("normalBalance", normalBalance),
                                currencyExponent,
                                description,
                                (ledgerAccountCategoryIds ?: JsonMissing.of()).map {
                                    it.toImmutable()
                                },
                                ledgerableId,
                                ledgerableType,
                                metadata,
                                additionalProperties.toImmutable(),
                            )
                    }

                    /**
                     * If the ledger account links to another object in Modern Treasury, the type
                     * will be populated here, otherwise null. The value is one of internal_account
                     * or external_account.
                     */
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
                    @NoAutoDetect
                    class Metadata
                    @JsonCreator
                    private constructor(
                        @JsonAnySetter
                        private val additionalProperties: Map<String, JsonValue> =
                            immutableEmptyMap(),
                    ) {

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        private var validated: Boolean = false

                        fun validate(): Metadata = apply {
                            if (validated) {
                                return@apply
                            }

                            validated = true
                        }

                        fun toBuilder() = Builder().from(this)

                        companion object {

                            @JvmStatic fun builder() = Builder()
                        }

                        class Builder internal constructor() {

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

                        return /* spotless:off */ other is LedgerAccountCreateRequest && currency == other.currency && ledgerId == other.ledgerId && name == other.name && normalBalance == other.normalBalance && currencyExponent == other.currencyExponent && description == other.description && ledgerAccountCategoryIds == other.ledgerAccountCategoryIds && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(currency, ledgerId, name, normalBalance, currencyExponent, description, ledgerAccountCategoryIds, ledgerableId, ledgerableType, metadata, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "LedgerAccountCreateRequest{currency=$currency, ledgerId=$ledgerId, name=$name, normalBalance=$normalBalance, currencyExponent=$currencyExponent, description=$description, ledgerAccountCategoryIds=$ledgerAccountCategoryIds, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, additionalProperties=$additionalProperties}"
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                @NoAutoDetect
                class AddressRequest
                @JsonCreator
                private constructor(
                    @JsonProperty("country")
                    @ExcludeMissing
                    private val country: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line1")
                    @ExcludeMissing
                    private val line1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("line2")
                    @ExcludeMissing
                    private val line2: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("locality")
                    @ExcludeMissing
                    private val locality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    private val postalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("region")
                    @ExcludeMissing
                    private val region: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    fun country(): Optional<String> =
                        Optional.ofNullable(country.getNullable("country"))

                    fun line1(): Optional<String> = Optional.ofNullable(line1.getNullable("line1"))

                    fun line2(): Optional<String> = Optional.ofNullable(line2.getNullable("line2"))

                    /** Locality or City. */
                    fun locality(): Optional<String> =
                        Optional.ofNullable(locality.getNullable("locality"))

                    /** The postal code of the address. */
                    fun postalCode(): Optional<String> =
                        Optional.ofNullable(postalCode.getNullable("postal_code"))

                    /** Region or State. */
                    fun region(): Optional<String> =
                        Optional.ofNullable(region.getNullable("region"))

                    /** Country code conforms to [ISO 3166-1 alpha-2] */
                    @JsonProperty("country")
                    @ExcludeMissing
                    fun _country(): JsonField<String> = country

                    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

                    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

                    /** Locality or City. */
                    @JsonProperty("locality")
                    @ExcludeMissing
                    fun _locality(): JsonField<String> = locality

                    /** The postal code of the address. */
                    @JsonProperty("postal_code")
                    @ExcludeMissing
                    fun _postalCode(): JsonField<String> = postalCode

                    /** Region or State. */
                    @JsonProperty("region")
                    @ExcludeMissing
                    fun _region(): JsonField<String> = region

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddressRequest = apply {
                        if (validated) {
                            return@apply
                        }

                        country()
                        line1()
                        line2()
                        locality()
                        postalCode()
                        region()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var country: JsonField<String> = JsonMissing.of()
                        private var line1: JsonField<String> = JsonMissing.of()
                        private var line2: JsonField<String> = JsonMissing.of()
                        private var locality: JsonField<String> = JsonMissing.of()
                        private var postalCode: JsonField<String> = JsonMissing.of()
                        private var region: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addressRequest: AddressRequest) = apply {
                            country = addressRequest.country
                            line1 = addressRequest.line1
                            line2 = addressRequest.line2
                            locality = addressRequest.locality
                            postalCode = addressRequest.postalCode
                            region = addressRequest.region
                            additionalProperties =
                                addressRequest.additionalProperties.toMutableMap()
                        }

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: String?) = country(JsonField.ofNullable(country))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: Optional<String>) = country(country.orElse(null))

                        /** Country code conforms to [ISO 3166-1 alpha-2] */
                        fun country(country: JsonField<String>) = apply { this.country = country }

                        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                        fun line1(line1: Optional<String>) = line1(line1.orElse(null))

                        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                        fun line2(line2: Optional<String>) = line2(line2.orElse(null))

                        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                        /** Locality or City. */
                        fun locality(locality: String?) = locality(JsonField.ofNullable(locality))

                        /** Locality or City. */
                        fun locality(locality: Optional<String>) = locality(locality.orElse(null))

                        /** Locality or City. */
                        fun locality(locality: JsonField<String>) = apply {
                            this.locality = locality
                        }

                        /** The postal code of the address. */
                        fun postalCode(postalCode: String?) =
                            postalCode(JsonField.ofNullable(postalCode))

                        /** The postal code of the address. */
                        fun postalCode(postalCode: Optional<String>) =
                            postalCode(postalCode.orElse(null))

                        /** The postal code of the address. */
                        fun postalCode(postalCode: JsonField<String>) = apply {
                            this.postalCode = postalCode
                        }

                        /** Region or State. */
                        fun region(region: String?) = region(JsonField.ofNullable(region))

                        /** Region or State. */
                        fun region(region: Optional<String>) = region(region.orElse(null))

                        /** Region or State. */
                        fun region(region: JsonField<String>) = apply { this.region = region }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                country,
                                line1,
                                line2,
                                locality,
                                postalCode,
                                region,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddressRequest && country == other.country && line1 == other.line1 && line2 == other.line2 && locality == other.locality && postalCode == other.postalCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(country, line1, line2, locality, postalCode, region, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddressRequest{country=$country, line1=$line1, line2=$line2, locality=$locality, postalCode=$postalCode, region=$region, additionalProperties=$additionalProperties}"
                }

                /** Either `individual` or `business`. */
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

                @NoAutoDetect
                class RoutingDetail
                @JsonCreator
                private constructor(
                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    private val routingNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    private val routingNumberType: JsonField<RoutingNumberType> = JsonMissing.of(),
                    @JsonProperty("payment_type")
                    @ExcludeMissing
                    private val paymentType: JsonField<PaymentType> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun routingNumber(): String = routingNumber.getRequired("routing_number")

                    fun routingNumberType(): RoutingNumberType =
                        routingNumberType.getRequired("routing_number_type")

                    fun paymentType(): Optional<PaymentType> =
                        Optional.ofNullable(paymentType.getNullable("payment_type"))

                    @JsonProperty("routing_number")
                    @ExcludeMissing
                    fun _routingNumber(): JsonField<String> = routingNumber

                    @JsonProperty("routing_number_type")
                    @ExcludeMissing
                    fun _routingNumberType(): JsonField<RoutingNumberType> = routingNumberType

                    @JsonProperty("payment_type")
                    @ExcludeMissing
                    fun _paymentType(): JsonField<PaymentType> = paymentType

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RoutingDetail = apply {
                        if (validated) {
                            return@apply
                        }

                        routingNumber()
                        routingNumberType()
                        paymentType()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

                        private var routingNumber: JsonField<String>? = null
                        private var routingNumberType: JsonField<RoutingNumberType>? = null
                        private var paymentType: JsonField<PaymentType> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(routingDetail: RoutingDetail) = apply {
                            routingNumber = routingDetail.routingNumber
                            routingNumberType = routingDetail.routingNumberType
                            paymentType = routingDetail.paymentType
                            additionalProperties = routingDetail.additionalProperties.toMutableMap()
                        }

                        fun routingNumber(routingNumber: String) =
                            routingNumber(JsonField.of(routingNumber))

                        fun routingNumber(routingNumber: JsonField<String>) = apply {
                            this.routingNumber = routingNumber
                        }

                        fun routingNumberType(routingNumberType: RoutingNumberType) =
                            routingNumberType(JsonField.of(routingNumberType))

                        fun routingNumberType(routingNumberType: JsonField<RoutingNumberType>) =
                            apply {
                                this.routingNumberType = routingNumberType
                            }

                        fun paymentType(paymentType: PaymentType) =
                            paymentType(JsonField.of(paymentType))

                        fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                            this.paymentType = paymentType
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                                checkRequired("routingNumber", routingNumber),
                                checkRequired("routingNumberType", routingNumberType),
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

                            @JvmField
                            val SG_INTERBANK_CLEARING_CODE = of("sg_interbank_clearing_code")

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
                            SG_INTERBANK_CLEARING_CODE,
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
                            SG_INTERBANK_CLEARING_CODE,
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
                                SG_INTERBANK_CLEARING_CODE -> Value.SG_INTERBANK_CLEARING_CODE
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
                                SG_INTERBANK_CLEARING_CODE -> Known.SG_INTERBANK_CLEARING_CODE
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

                    return /* spotless:off */ other is ReceivingAccount && accountDetails == other.accountDetails && accountType == other.accountType && contactDetails == other.contactDetails && ledgerAccount == other.ledgerAccount && metadata == other.metadata && name == other.name && partyAddress == other.partyAddress && partyIdentifier == other.partyIdentifier && partyName == other.partyName && partyType == other.partyType && plaidProcessorToken == other.plaidProcessorToken && routingDetails == other.routingDetails && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(accountDetails, accountType, contactDetails, ledgerAccount, metadata, name, partyAddress, partyIdentifier, partyName, partyType, plaidProcessorToken, routingDetails, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ReceivingAccount{accountDetails=$accountDetails, accountType=$accountType, contactDetails=$contactDetails, ledgerAccount=$ledgerAccount, metadata=$metadata, name=$name, partyAddress=$partyAddress, partyIdentifier=$partyIdentifier, partyName=$partyName, partyType=$partyType, plaidProcessorToken=$plaidProcessorToken, routingDetails=$routingDetails, additionalProperties=$additionalProperties}"
            }

            /**
             * To cancel a payment order, use `cancelled`. To redraft a returned payment order, use
             * `approved`. To undo approval on a denied or approved payment order, use
             * `needs_approval`.
             */
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

                return /* spotless:off */ other is PaymentOrderUpdateRequestWithId && id == other.id && accounting == other.accounting && accountingCategoryId == other.accountingCategoryId && accountingLedgerClassId == other.accountingLedgerClassId && amount == other.amount && chargeBearer == other.chargeBearer && counterpartyId == other.counterpartyId && currency == other.currency && description == other.description && direction == other.direction && effectiveDate == other.effectiveDate && expiresAt == other.expiresAt && fallbackType == other.fallbackType && foreignExchangeContract == other.foreignExchangeContract && foreignExchangeIndicator == other.foreignExchangeIndicator && lineItems == other.lineItems && metadata == other.metadata && nsfProtected == other.nsfProtected && originatingAccountId == other.originatingAccountId && originatingPartyName == other.originatingPartyName && priority == other.priority && processAfter == other.processAfter && purpose == other.purpose && receivingAccount == other.receivingAccount && receivingAccountId == other.receivingAccountId && remittanceInformation == other.remittanceInformation && sendRemittanceAdvice == other.sendRemittanceAdvice && statementDescriptor == other.statementDescriptor && status == other.status && subtype == other.subtype && type == other.type && ultimateOriginatingPartyIdentifier == other.ultimateOriginatingPartyIdentifier && ultimateOriginatingPartyName == other.ultimateOriginatingPartyName && ultimateReceivingPartyIdentifier == other.ultimateReceivingPartyIdentifier && ultimateReceivingPartyName == other.ultimateReceivingPartyName && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accounting, accountingCategoryId, accountingLedgerClassId, amount, chargeBearer, counterpartyId, currency, description, direction, effectiveDate, expiresAt, fallbackType, foreignExchangeContract, foreignExchangeIndicator, lineItems, metadata, nsfProtected, originatingAccountId, originatingPartyName, priority, processAfter, purpose, receivingAccount, receivingAccountId, remittanceInformation, sendRemittanceAdvice, statementDescriptor, status, subtype, type, ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier, ultimateReceivingPartyName, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderUpdateRequestWithId{id=$id, accounting=$accounting, accountingCategoryId=$accountingCategoryId, accountingLedgerClassId=$accountingLedgerClassId, amount=$amount, chargeBearer=$chargeBearer, counterpartyId=$counterpartyId, currency=$currency, description=$description, direction=$direction, effectiveDate=$effectiveDate, expiresAt=$expiresAt, fallbackType=$fallbackType, foreignExchangeContract=$foreignExchangeContract, foreignExchangeIndicator=$foreignExchangeIndicator, lineItems=$lineItems, metadata=$metadata, nsfProtected=$nsfProtected, originatingAccountId=$originatingAccountId, originatingPartyName=$originatingPartyName, priority=$priority, processAfter=$processAfter, purpose=$purpose, receivingAccount=$receivingAccount, receivingAccountId=$receivingAccountId, remittanceInformation=$remittanceInformation, sendRemittanceAdvice=$sendRemittanceAdvice, statementDescriptor=$statementDescriptor, status=$status, subtype=$subtype, type=$type, ultimateOriginatingPartyIdentifier=$ultimateOriginatingPartyIdentifier, ultimateOriginatingPartyName=$ultimateOriginatingPartyName, ultimateReceivingPartyIdentifier=$ultimateReceivingPartyIdentifier, ultimateReceivingPartyName=$ultimateReceivingPartyName, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ExpectedPaymentUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            private val amountLowerBound: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            private val amountUpperBound: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            private val counterpartyId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("date_lower_bound")
            @ExcludeMissing
            private val dateLowerBound: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("date_upper_bound")
            @ExcludeMissing
            private val dateUpperBound: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            private val internalAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            private val reconciliationFilters: JsonValue = JsonMissing.of(),
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            private val reconciliationGroups: JsonValue = JsonMissing.of(),
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            private val reconciliationRuleVariables: JsonField<List<ReconciliationRule>> =
                JsonMissing.of(),
            @JsonProperty("remittance_information")
            @ExcludeMissing
            private val remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            private val statementDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<ExpectedPaymentType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountLowerBound(): Optional<Long> =
                Optional.ofNullable(amountLowerBound.getNullable("amount_lower_bound"))

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            fun amountUpperBound(): Optional<Long> =
                Optional.ofNullable(amountUpperBound.getNullable("amount_upper_bound"))

            /** The ID of the counterparty you expect for this payment. */
            fun counterpartyId(): Optional<String> =
                Optional.ofNullable(counterpartyId.getNullable("counterparty_id"))

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            fun currency(): Optional<Currency> =
                Optional.ofNullable(currency.getNullable("currency"))

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            fun dateLowerBound(): Optional<LocalDate> =
                Optional.ofNullable(dateLowerBound.getNullable("date_lower_bound"))

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            fun dateUpperBound(): Optional<LocalDate> =
                Optional.ofNullable(dateUpperBound.getNullable("date_upper_bound"))

            /** An optional description for internal use. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            fun direction(): Optional<Direction> =
                Optional.ofNullable(direction.getNullable("direction"))

            /** The ID of the Internal Account for the expected payment. */
            fun internalAccountId(): Optional<String> =
                Optional.ofNullable(internalAccountId.getNullable("internal_account_id"))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /** The reconciliation filters you have for this payment. */
            @JsonProperty("reconciliation_filters")
            @ExcludeMissing
            fun _reconciliationFilters(): JsonValue = reconciliationFilters

            /** The reconciliation groups you have for this payment. */
            @JsonProperty("reconciliation_groups")
            @ExcludeMissing
            fun _reconciliationGroups(): JsonValue = reconciliationGroups

            /** An array of reconciliation rule variables for this payment. */
            fun reconciliationRuleVariables(): Optional<List<ReconciliationRule>> =
                Optional.ofNullable(
                    reconciliationRuleVariables.getNullable("reconciliation_rule_variables")
                )

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            fun remittanceInformation(): Optional<String> =
                Optional.ofNullable(remittanceInformation.getNullable("remittance_information"))

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            fun statementDescriptor(): Optional<String> =
                Optional.ofNullable(statementDescriptor.getNullable("statement_descriptor"))

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            fun type(): Optional<ExpectedPaymentType> =
                Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * The lowest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_lower_bound")
            @ExcludeMissing
            fun _amountLowerBound(): JsonField<Long> = amountLowerBound

            /**
             * The highest amount this expected payment may be equal to. Value in specified
             * currency's smallest unit. e.g. $10 would be represented as 1000.
             */
            @JsonProperty("amount_upper_bound")
            @ExcludeMissing
            fun _amountUpperBound(): JsonField<Long> = amountUpperBound

            /** The ID of the counterparty you expect for this payment. */
            @JsonProperty("counterparty_id")
            @ExcludeMissing
            fun _counterpartyId(): JsonField<String> = counterpartyId

            /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The earliest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_lower_bound")
            @ExcludeMissing
            fun _dateLowerBound(): JsonField<LocalDate> = dateLowerBound

            /** The latest date the payment may come in. Format: yyyy-mm-dd */
            @JsonProperty("date_upper_bound")
            @ExcludeMissing
            fun _dateUpperBound(): JsonField<LocalDate> = dateUpperBound

            /** An optional description for internal use. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /** The ID of the Internal Account for the expected payment. */
            @JsonProperty("internal_account_id")
            @ExcludeMissing
            fun _internalAccountId(): JsonField<String> = internalAccountId

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /** An array of reconciliation rule variables for this payment. */
            @JsonProperty("reconciliation_rule_variables")
            @ExcludeMissing
            fun _reconciliationRuleVariables(): JsonField<List<ReconciliationRule>> =
                reconciliationRuleVariables

            /**
             * For `ach`, this field will be passed through on an addenda record. For `wire`
             * payments the field will be passed through as the "Originator to Beneficiary
             * Information", also known as OBI or Fedwire tag 6000.
             */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation(): JsonField<String> = remittanceInformation

            /**
             * The statement description you expect to see on the transaction. For ACH payments,
             * this will be the full line item passed from the bank. For wire payments, this will be
             * the OBI field on the wire. For check payments, this will be the memo field.
             */
            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor(): JsonField<String> = statementDescriptor

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen, sepa,
             * signet, wire.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<ExpectedPaymentType> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ExpectedPaymentUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                amountLowerBound()
                amountUpperBound()
                counterpartyId()
                currency()
                dateLowerBound()
                dateUpperBound()
                description()
                direction()
                internalAccountId()
                metadata().ifPresent { it.validate() }
                reconciliationRuleVariables().ifPresent { it.forEach { it.validate() } }
                remittanceInformation()
                statementDescriptor()
                status()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var amountLowerBound: JsonField<Long> = JsonMissing.of()
                private var amountUpperBound: JsonField<Long> = JsonMissing.of()
                private var counterpartyId: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var dateLowerBound: JsonField<LocalDate> = JsonMissing.of()
                private var dateUpperBound: JsonField<LocalDate> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var direction: JsonField<Direction> = JsonMissing.of()
                private var internalAccountId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var reconciliationFilters: JsonValue = JsonMissing.of()
                private var reconciliationGroups: JsonValue = JsonMissing.of()
                private var reconciliationRuleVariables:
                    JsonField<MutableList<ReconciliationRule>>? =
                    null
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var type: JsonField<ExpectedPaymentType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    expectedPaymentUpdateRequestWithId: ExpectedPaymentUpdateRequestWithId
                ) = apply {
                    id = expectedPaymentUpdateRequestWithId.id
                    amountLowerBound = expectedPaymentUpdateRequestWithId.amountLowerBound
                    amountUpperBound = expectedPaymentUpdateRequestWithId.amountUpperBound
                    counterpartyId = expectedPaymentUpdateRequestWithId.counterpartyId
                    currency = expectedPaymentUpdateRequestWithId.currency
                    dateLowerBound = expectedPaymentUpdateRequestWithId.dateLowerBound
                    dateUpperBound = expectedPaymentUpdateRequestWithId.dateUpperBound
                    description = expectedPaymentUpdateRequestWithId.description
                    direction = expectedPaymentUpdateRequestWithId.direction
                    internalAccountId = expectedPaymentUpdateRequestWithId.internalAccountId
                    metadata = expectedPaymentUpdateRequestWithId.metadata
                    reconciliationFilters = expectedPaymentUpdateRequestWithId.reconciliationFilters
                    reconciliationGroups = expectedPaymentUpdateRequestWithId.reconciliationGroups
                    reconciliationRuleVariables =
                        expectedPaymentUpdateRequestWithId.reconciliationRuleVariables.map {
                            it.toMutableList()
                        }
                    remittanceInformation = expectedPaymentUpdateRequestWithId.remittanceInformation
                    statementDescriptor = expectedPaymentUpdateRequestWithId.statementDescriptor
                    status = expectedPaymentUpdateRequestWithId.status
                    type = expectedPaymentUpdateRequestWithId.type
                    additionalProperties =
                        expectedPaymentUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long?) =
                    amountLowerBound(JsonField.ofNullable(amountLowerBound))

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: Long) =
                    amountLowerBound(amountLowerBound as Long?)

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun amountLowerBound(amountLowerBound: Optional<Long>) =
                    amountLowerBound(amountLowerBound.orElse(null) as Long?)

                /**
                 * The lowest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountLowerBound(amountLowerBound: JsonField<Long>) = apply {
                    this.amountLowerBound = amountLowerBound
                }

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long?) =
                    amountUpperBound(JsonField.ofNullable(amountUpperBound))

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: Long) =
                    amountUpperBound(amountUpperBound as Long?)

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun amountUpperBound(amountUpperBound: Optional<Long>) =
                    amountUpperBound(amountUpperBound.orElse(null) as Long?)

                /**
                 * The highest amount this expected payment may be equal to. Value in specified
                 * currency's smallest unit. e.g. $10 would be represented as 1000.
                 */
                fun amountUpperBound(amountUpperBound: JsonField<Long>) = apply {
                    this.amountUpperBound = amountUpperBound
                }

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: String?) =
                    counterpartyId(JsonField.ofNullable(counterpartyId))

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: Optional<String>) =
                    counterpartyId(counterpartyId.orElse(null))

                /** The ID of the counterparty you expect for this payment. */
                fun counterpartyId(counterpartyId: JsonField<String>) = apply {
                    this.counterpartyId = counterpartyId
                }

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: Optional<Currency>) = currency(currency.orElse(null))

                /** Must conform to ISO 4217. Defaults to the currency of the internal account. */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: LocalDate?) =
                    dateLowerBound(JsonField.ofNullable(dateLowerBound))

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: Optional<LocalDate>) =
                    dateLowerBound(dateLowerBound.orElse(null))

                /** The earliest date the payment may come in. Format: yyyy-mm-dd */
                fun dateLowerBound(dateLowerBound: JsonField<LocalDate>) = apply {
                    this.dateLowerBound = dateLowerBound
                }

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: LocalDate?) =
                    dateUpperBound(JsonField.ofNullable(dateUpperBound))

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: Optional<LocalDate>) =
                    dateUpperBound(dateUpperBound.orElse(null))

                /** The latest date the payment may come in. Format: yyyy-mm-dd */
                fun dateUpperBound(dateUpperBound: JsonField<LocalDate>) = apply {
                    this.dateUpperBound = dateUpperBound
                }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** An optional description for internal use. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /** An optional description for internal use. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Direction?) = direction(JsonField.ofNullable(direction))

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: Optional<Direction>) = direction(direction.orElse(null))

                /**
                 * One of credit or debit. When you are receiving money, use credit. When you are
                 * being charged, use debit.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: String?) =
                    internalAccountId(JsonField.ofNullable(internalAccountId))

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: Optional<String>) =
                    internalAccountId(internalAccountId.orElse(null))

                /** The ID of the Internal Account for the expected payment. */
                fun internalAccountId(internalAccountId: JsonField<String>) = apply {
                    this.internalAccountId = internalAccountId
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** The reconciliation filters you have for this payment. */
                fun reconciliationFilters(reconciliationFilters: JsonValue) = apply {
                    this.reconciliationFilters = reconciliationFilters
                }

                /** The reconciliation groups you have for this payment. */
                fun reconciliationGroups(reconciliationGroups: JsonValue) = apply {
                    this.reconciliationGroups = reconciliationGroups
                }

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: List<ReconciliationRule>?
                ) = reconciliationRuleVariables(JsonField.ofNullable(reconciliationRuleVariables))

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: Optional<List<ReconciliationRule>>
                ) = reconciliationRuleVariables(reconciliationRuleVariables.orElse(null))

                /** An array of reconciliation rule variables for this payment. */
                fun reconciliationRuleVariables(
                    reconciliationRuleVariables: JsonField<List<ReconciliationRule>>
                ) = apply {
                    this.reconciliationRuleVariables =
                        reconciliationRuleVariables.map { it.toMutableList() }
                }

                /** An array of reconciliation rule variables for this payment. */
                fun addReconciliationRuleVariable(reconciliationRuleVariable: ReconciliationRule) =
                    apply {
                        reconciliationRuleVariables =
                            (reconciliationRuleVariables ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(reconciliationRuleVariable)
                            }
                    }

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: String?) =
                    remittanceInformation(JsonField.ofNullable(remittanceInformation))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: Optional<String>) =
                    remittanceInformation(remittanceInformation.orElse(null))

                /**
                 * For `ach`, this field will be passed through on an addenda record. For `wire`
                 * payments the field will be passed through as the "Originator to Beneficiary
                 * Information", also known as OBI or Fedwire tag 6000.
                 */
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: String?) =
                    statementDescriptor(JsonField.ofNullable(statementDescriptor))

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: Optional<String>) =
                    statementDescriptor(statementDescriptor.orElse(null))

                /**
                 * The statement description you expect to see on the transaction. For ACH payments,
                 * this will be the full line item passed from the bank. For wire payments, this
                 * will be the OBI field on the wire. For check payments, this will be the memo
                 * field.
                 */
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /**
                 * The Expected Payment's status can be updated from partially_reconciled to
                 * reconciled.
                 */
                fun status(status: Status?) = status(JsonField.ofNullable(status))

                /**
                 * The Expected Payment's status can be updated from partially_reconciled to
                 * reconciled.
                 */
                fun status(status: Optional<Status>) = status(status.orElse(null))

                /**
                 * The Expected Payment's status can be updated from partially_reconciled to
                 * reconciled.
                 */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: ExpectedPaymentType?) = type(JsonField.ofNullable(type))

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: Optional<ExpectedPaymentType>) = type(type.orElse(null))

                /**
                 * One of: ach, au_becs, bacs, book, check, eft, interac, provxchange, rtp, sen,
                 * sepa, signet, wire.
                 */
                fun type(type: JsonField<ExpectedPaymentType>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        id,
                        amountLowerBound,
                        amountUpperBound,
                        counterpartyId,
                        currency,
                        dateLowerBound,
                        dateUpperBound,
                        description,
                        direction,
                        internalAccountId,
                        metadata,
                        reconciliationFilters,
                        reconciliationGroups,
                        (reconciliationRuleVariables ?: JsonMissing.of()).map { it.toImmutable() },
                        remittanceInformation,
                        statementDescriptor,
                        status,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * One of credit or debit. When you are receiving money, use credit. When you are being
             * charged, use debit.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

            /**
             * The Expected Payment's status can be updated from partially_reconciled to reconciled.
             */
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

                return /* spotless:off */ other is ExpectedPaymentUpdateRequestWithId && id == other.id && amountLowerBound == other.amountLowerBound && amountUpperBound == other.amountUpperBound && counterpartyId == other.counterpartyId && currency == other.currency && dateLowerBound == other.dateLowerBound && dateUpperBound == other.dateUpperBound && description == other.description && direction == other.direction && internalAccountId == other.internalAccountId && metadata == other.metadata && reconciliationFilters == other.reconciliationFilters && reconciliationGroups == other.reconciliationGroups && reconciliationRuleVariables == other.reconciliationRuleVariables && remittanceInformation == other.remittanceInformation && statementDescriptor == other.statementDescriptor && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, amountLowerBound, amountUpperBound, counterpartyId, currency, dateLowerBound, dateUpperBound, description, direction, internalAccountId, metadata, reconciliationFilters, reconciliationGroups, reconciliationRuleVariables, remittanceInformation, statementDescriptor, status, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ExpectedPaymentUpdateRequestWithId{id=$id, amountLowerBound=$amountLowerBound, amountUpperBound=$amountUpperBound, counterpartyId=$counterpartyId, currency=$currency, dateLowerBound=$dateLowerBound, dateUpperBound=$dateUpperBound, description=$description, direction=$direction, internalAccountId=$internalAccountId, metadata=$metadata, reconciliationFilters=$reconciliationFilters, reconciliationGroups=$reconciliationGroups, reconciliationRuleVariables=$reconciliationRuleVariables, remittanceInformation=$remittanceInformation, statementDescriptor=$statementDescriptor, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class TransactionUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TransactionUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                metadata().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transactionUpdateRequestWithId: TransactionUpdateRequestWithId) =
                    apply {
                        id = transactionUpdateRequestWithId.id
                        metadata = transactionUpdateRequestWithId.metadata
                        additionalProperties =
                            transactionUpdateRequestWithId.additionalProperties.toMutableMap()
                    }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data in the form of key-value pairs. Pairs can be removed by passing
                 * an empty string or `null` as the value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        id,
                        metadata,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Additional data in the form of key-value pairs. Pairs can be removed by passing an
             * empty string or `null` as the value.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

                return /* spotless:off */ other is TransactionUpdateRequestWithId && id == other.id && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, metadata, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionUpdateRequestWithId{id=$id, metadata=$metadata, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class LedgerTransactionUpdateRequestWithId
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("effective_at")
            @ExcludeMissing
            private val effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            private val ledgerEntries: JsonField<List<LedgerEntryCreateRequest>> = JsonMissing.of(),
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            private val ledgerableId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            private val ledgerableType: JsonField<LedgerableType> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            private val metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<Status> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

            /** An optional description for internal use. */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            fun effectiveAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(effectiveAt.getNullable("effective_at"))

            /** An array of ledger entry objects. */
            fun ledgerEntries(): Optional<List<LedgerEntryCreateRequest>> =
                Optional.ofNullable(ledgerEntries.getNullable("ledger_entries"))

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            fun ledgerableId(): Optional<String> =
                Optional.ofNullable(ledgerableId.getNullable("ledgerable_id"))

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            fun ledgerableType(): Optional<LedgerableType> =
                Optional.ofNullable(ledgerableType.getNullable("ledgerable_type"))

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            fun metadata(): Optional<Metadata> =
                Optional.ofNullable(metadata.getNullable("metadata"))

            /** To post a ledger transaction at creation, use `posted`. */
            fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /** An optional description for internal use. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /**
             * The timestamp (ISO8601 format) at which the ledger transaction happened for reporting
             * purposes.
             */
            @JsonProperty("effective_at")
            @ExcludeMissing
            fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

            /** An array of ledger entry objects. */
            @JsonProperty("ledger_entries")
            @ExcludeMissing
            fun _ledgerEntries(): JsonField<List<LedgerEntryCreateRequest>> = ledgerEntries

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * id will be populated here, otherwise null.
             */
            @JsonProperty("ledgerable_id")
            @ExcludeMissing
            fun _ledgerableId(): JsonField<String> = ledgerableId

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
            @JsonProperty("ledgerable_type")
            @ExcludeMissing
            fun _ledgerableType(): JsonField<LedgerableType> = ledgerableType

            /**
             * Additional data represented as key-value pairs. Both the key and value must be
             * strings.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /** To post a ledger transaction at creation, use `posted`. */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): LedgerTransactionUpdateRequestWithId = apply {
                if (validated) {
                    return@apply
                }

                id()
                description()
                effectiveAt()
                ledgerEntries().ifPresent { it.forEach { it.validate() } }
                ledgerableId()
                ledgerableType()
                metadata().ifPresent { it.validate() }
                status()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder internal constructor() {

                private var id: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var ledgerEntries: JsonField<MutableList<LedgerEntryCreateRequest>>? = null
                private var ledgerableId: JsonField<String> = JsonMissing.of()
                private var ledgerableType: JsonField<LedgerableType> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var status: JsonField<Status> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    ledgerTransactionUpdateRequestWithId: LedgerTransactionUpdateRequestWithId
                ) = apply {
                    id = ledgerTransactionUpdateRequestWithId.id
                    description = ledgerTransactionUpdateRequestWithId.description
                    effectiveAt = ledgerTransactionUpdateRequestWithId.effectiveAt
                    ledgerEntries =
                        ledgerTransactionUpdateRequestWithId.ledgerEntries.map {
                            it.toMutableList()
                        }
                    ledgerableId = ledgerTransactionUpdateRequestWithId.ledgerableId
                    ledgerableType = ledgerTransactionUpdateRequestWithId.ledgerableType
                    metadata = ledgerTransactionUpdateRequestWithId.metadata
                    status = ledgerTransactionUpdateRequestWithId.status
                    additionalProperties =
                        ledgerTransactionUpdateRequestWithId.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                /** An optional description for internal use. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /** An optional description for internal use. */
                fun description(description: Optional<String>) =
                    description(description.orElse(null))

                /** An optional description for internal use. */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: OffsetDateTime) =
                    effectiveAt(JsonField.of(effectiveAt))

                /**
                 * The timestamp (ISO8601 format) at which the ledger transaction happened for
                 * reporting purposes.
                 */
                fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                    this.effectiveAt = effectiveAt
                }

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: List<LedgerEntryCreateRequest>) =
                    ledgerEntries(JsonField.of(ledgerEntries))

                /** An array of ledger entry objects. */
                fun ledgerEntries(ledgerEntries: JsonField<List<LedgerEntryCreateRequest>>) =
                    apply {
                        this.ledgerEntries = ledgerEntries.map { it.toMutableList() }
                    }

                /** An array of ledger entry objects. */
                fun addLedgerEntry(ledgerEntry: LedgerEntryCreateRequest) = apply {
                    ledgerEntries =
                        (ledgerEntries ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(ledgerEntry)
                        }
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: String) = ledgerableId(JsonField.of(ledgerableId))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the id will be populated here, otherwise null.
                 */
                fun ledgerableId(ledgerableId: JsonField<String>) = apply {
                    this.ledgerableId = ledgerableId
                }

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(ledgerableType: LedgerableType) =
                    ledgerableType(JsonField.of(ledgerableType))

                /**
                 * If the ledger transaction can be reconciled to another object in Modern Treasury,
                 * the type will be populated here, otherwise null. This can be one of
                 * payment_order, incoming_payment_detail, expected_payment, return, paper_item, or
                 * reversal.
                 */
                fun ledgerableType(ledgerableType: JsonField<LedgerableType>) = apply {
                    this.ledgerableType = ledgerableType
                }

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: Status) = status(JsonField.of(status))

                /** To post a ledger transaction at creation, use `posted`. */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

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
                        id,
                        description,
                        effectiveAt,
                        (ledgerEntries ?: JsonMissing.of()).map { it.toImmutable() },
                        ledgerableId,
                        ledgerableType,
                        metadata,
                        status,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class LedgerEntryCreateRequest
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("direction")
                @ExcludeMissing
                private val direction: JsonField<TransactionDirection> = JsonMissing.of(),
                @JsonProperty("ledger_account_id")
                @ExcludeMissing
                private val ledgerAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("available_balance_amount")
                @ExcludeMissing
                private val availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                    JsonMissing.of(),
                @JsonProperty("lock_version")
                @ExcludeMissing
                private val lockVersion: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                private val metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("pending_balance_amount")
                @ExcludeMissing
                private val pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                    JsonMissing.of(),
                @JsonProperty("posted_balance_amount")
                @ExcludeMissing
                private val postedBalanceAmount: JsonField<PostedBalanceAmount> = JsonMissing.of(),
                @JsonProperty("show_resulting_ledger_account_balances")
                @ExcludeMissing
                private val showResultingLedgerAccountBalances: JsonField<Boolean> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                fun direction(): TransactionDirection = direction.getRequired("direction")

                /** The ledger account that this ledger entry is associated with. */
                fun ledgerAccountId(): String = ledgerAccountId.getRequired("ledger_account_id")

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun availableBalanceAmount(): Optional<AvailableBalanceAmount> =
                    Optional.ofNullable(
                        availableBalanceAmount.getNullable("available_balance_amount")
                    )

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                fun lockVersion(): Optional<Long> =
                    Optional.ofNullable(lockVersion.getNullable("lock_version"))

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                fun metadata(): Optional<Metadata> =
                    Optional.ofNullable(metadata.getNullable("metadata"))

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun pendingBalanceAmount(): Optional<PendingBalanceAmount> =
                    Optional.ofNullable(pendingBalanceAmount.getNullable("pending_balance_amount"))

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                fun postedBalanceAmount(): Optional<PostedBalanceAmount> =
                    Optional.ofNullable(postedBalanceAmount.getNullable("posted_balance_amount"))

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                fun showResultingLedgerAccountBalances(): Optional<Boolean> =
                    Optional.ofNullable(
                        showResultingLedgerAccountBalances.getNullable(
                            "show_resulting_ledger_account_balances"
                        )
                    )

                /**
                 * Value in specified currency's smallest unit. e.g. $10 would be represented
                 * as 1000. Can be any integer up to 36 digits.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * One of `credit`, `debit`. Describes the direction money is flowing in the
                 * transaction. A `credit` moves money from your account to someone else's. A
                 * `debit` pulls money from someone else's account to your own. Note that wire, rtp,
                 * and check payments will always be `credit`.
                 */
                @JsonProperty("direction")
                @ExcludeMissing
                fun _direction(): JsonField<TransactionDirection> = direction

                /** The ledger account that this ledger entry is associated with. */
                @JsonProperty("ledger_account_id")
                @ExcludeMissing
                fun _ledgerAccountId(): JsonField<String> = ledgerAccountId

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("available_balance_amount")
                @ExcludeMissing
                fun _availableBalanceAmount(): JsonField<AvailableBalanceAmount> =
                    availableBalanceAmount

                /**
                 * Lock version of the ledger account. This can be passed when creating a ledger
                 * transaction to only succeed if no ledger transactions have posted since the given
                 * version. See our post about Designing the Ledgers API with Optimistic Locking for
                 * more details.
                 */
                @JsonProperty("lock_version")
                @ExcludeMissing
                fun _lockVersion(): JsonField<Long> = lockVersion

                /**
                 * Additional data represented as key-value pairs. Both the key and value must be
                 * strings.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s pending balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("pending_balance_amount")
                @ExcludeMissing
                fun _pendingBalanceAmount(): JsonField<PendingBalanceAmount> = pendingBalanceAmount

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s posted balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @JsonProperty("posted_balance_amount")
                @ExcludeMissing
                fun _postedBalanceAmount(): JsonField<PostedBalanceAmount> = postedBalanceAmount

                /**
                 * If true, response will include the balance of the associated ledger account for
                 * the entry.
                 */
                @JsonProperty("show_resulting_ledger_account_balances")
                @ExcludeMissing
                fun _showResultingLedgerAccountBalances(): JsonField<Boolean> =
                    showResultingLedgerAccountBalances

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): LedgerEntryCreateRequest = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    direction()
                    ledgerAccountId()
                    availableBalanceAmount().ifPresent { it.validate() }
                    lockVersion()
                    metadata().ifPresent { it.validate() }
                    pendingBalanceAmount().ifPresent { it.validate() }
                    postedBalanceAmount().ifPresent { it.validate() }
                    showResultingLedgerAccountBalances()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var direction: JsonField<TransactionDirection>? = null
                    private var ledgerAccountId: JsonField<String>? = null
                    private var availableBalanceAmount: JsonField<AvailableBalanceAmount> =
                        JsonMissing.of()
                    private var lockVersion: JsonField<Long> = JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var pendingBalanceAmount: JsonField<PendingBalanceAmount> =
                        JsonMissing.of()
                    private var postedBalanceAmount: JsonField<PostedBalanceAmount> =
                        JsonMissing.of()
                    private var showResultingLedgerAccountBalances: JsonField<Boolean> =
                        JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(ledgerEntryCreateRequest: LedgerEntryCreateRequest) = apply {
                        amount = ledgerEntryCreateRequest.amount
                        direction = ledgerEntryCreateRequest.direction
                        ledgerAccountId = ledgerEntryCreateRequest.ledgerAccountId
                        availableBalanceAmount = ledgerEntryCreateRequest.availableBalanceAmount
                        lockVersion = ledgerEntryCreateRequest.lockVersion
                        metadata = ledgerEntryCreateRequest.metadata
                        pendingBalanceAmount = ledgerEntryCreateRequest.pendingBalanceAmount
                        postedBalanceAmount = ledgerEntryCreateRequest.postedBalanceAmount
                        showResultingLedgerAccountBalances =
                            ledgerEntryCreateRequest.showResultingLedgerAccountBalances
                        additionalProperties =
                            ledgerEntryCreateRequest.additionalProperties.toMutableMap()
                    }

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Value in specified currency's smallest unit. e.g. $10 would be represented
                     * as 1000. Can be any integer up to 36 digits.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: TransactionDirection) =
                        direction(JsonField.of(direction))

                    /**
                     * One of `credit`, `debit`. Describes the direction money is flowing in the
                     * transaction. A `credit` moves money from your account to someone else's. A
                     * `debit` pulls money from someone else's account to your own. Note that wire,
                     * rtp, and check payments will always be `credit`.
                     */
                    fun direction(direction: JsonField<TransactionDirection>) = apply {
                        this.direction = direction
                    }

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: String) =
                        ledgerAccountId(JsonField.of(ledgerAccountId))

                    /** The ledger account that this ledger entry is associated with. */
                    fun ledgerAccountId(ledgerAccountId: JsonField<String>) = apply {
                        this.ledgerAccountId = ledgerAccountId
                    }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(availableBalanceAmount: AvailableBalanceAmount?) =
                        availableBalanceAmount(JsonField.ofNullable(availableBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(
                        availableBalanceAmount: Optional<AvailableBalanceAmount>
                    ) = availableBalanceAmount(availableBalanceAmount.orElse(null))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s available balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun availableBalanceAmount(
                        availableBalanceAmount: JsonField<AvailableBalanceAmount>
                    ) = apply { this.availableBalanceAmount = availableBalanceAmount }

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long?) =
                        lockVersion(JsonField.ofNullable(lockVersion))

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: Long) = lockVersion(lockVersion as Long?)

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun lockVersion(lockVersion: Optional<Long>) =
                        lockVersion(lockVersion.orElse(null) as Long?)

                    /**
                     * Lock version of the ledger account. This can be passed when creating a ledger
                     * transaction to only succeed if no ledger transactions have posted since the
                     * given version. See our post about Designing the Ledgers API with Optimistic
                     * Locking for more details.
                     */
                    fun lockVersion(lockVersion: JsonField<Long>) = apply {
                        this.lockVersion = lockVersion
                    }

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

                    /**
                     * Additional data represented as key-value pairs. Both the key and value must
                     * be strings.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: PendingBalanceAmount?) =
                        pendingBalanceAmount(JsonField.ofNullable(pendingBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(pendingBalanceAmount: Optional<PendingBalanceAmount>) =
                        pendingBalanceAmount(pendingBalanceAmount.orElse(null))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s pending balance. If any of these conditions would be false after
                     * the transaction is created, the entire call will fail with error code 422.
                     */
                    fun pendingBalanceAmount(
                        pendingBalanceAmount: JsonField<PendingBalanceAmount>
                    ) = apply { this.pendingBalanceAmount = pendingBalanceAmount }

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: PostedBalanceAmount?) =
                        postedBalanceAmount(JsonField.ofNullable(postedBalanceAmount))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: Optional<PostedBalanceAmount>) =
                        postedBalanceAmount(postedBalanceAmount.orElse(null))

                    /**
                     * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                     * account’s posted balance. If any of these conditions would be false after the
                     * transaction is created, the entire call will fail with error code 422.
                     */
                    fun postedBalanceAmount(postedBalanceAmount: JsonField<PostedBalanceAmount>) =
                        apply {
                            this.postedBalanceAmount = postedBalanceAmount
                        }

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean?
                    ) =
                        showResultingLedgerAccountBalances(
                            JsonField.ofNullable(showResultingLedgerAccountBalances)
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Boolean
                    ) =
                        showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances as Boolean?
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: Optional<Boolean>
                    ) =
                        showResultingLedgerAccountBalances(
                            showResultingLedgerAccountBalances.orElse(null) as Boolean?
                        )

                    /**
                     * If true, response will include the balance of the associated ledger account
                     * for the entry.
                     */
                    fun showResultingLedgerAccountBalances(
                        showResultingLedgerAccountBalances: JsonField<Boolean>
                    ) = apply {
                        this.showResultingLedgerAccountBalances = showResultingLedgerAccountBalances
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

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
                            checkRequired("amount", amount),
                            checkRequired("direction", direction),
                            checkRequired("ledgerAccountId", ledgerAccountId),
                            availableBalanceAmount,
                            lockVersion,
                            metadata,
                            pendingBalanceAmount,
                            postedBalanceAmount,
                            showResultingLedgerAccountBalances,
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Use `gt` (>), `gte` (>=), `lt` (<), `lte` (<=), or `eq` (=) to lock on the
                 * account’s available balance. If any of these conditions would be false after the
                 * transaction is created, the entire call will fail with error code 422.
                 */
                @NoAutoDetect
                class AvailableBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AvailableBalanceAmount = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                @NoAutoDetect
                class PendingBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): PendingBalanceAmount = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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
                @NoAutoDetect
                class PostedBalanceAmount
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): PostedBalanceAmount = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    class Builder internal constructor() {

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

                    return /* spotless:off */ other is LedgerEntryCreateRequest && amount == other.amount && direction == other.direction && ledgerAccountId == other.ledgerAccountId && availableBalanceAmount == other.availableBalanceAmount && lockVersion == other.lockVersion && metadata == other.metadata && pendingBalanceAmount == other.pendingBalanceAmount && postedBalanceAmount == other.postedBalanceAmount && showResultingLedgerAccountBalances == other.showResultingLedgerAccountBalances && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, direction, ledgerAccountId, availableBalanceAmount, lockVersion, metadata, pendingBalanceAmount, postedBalanceAmount, showResultingLedgerAccountBalances, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LedgerEntryCreateRequest{amount=$amount, direction=$direction, ledgerAccountId=$ledgerAccountId, availableBalanceAmount=$availableBalanceAmount, lockVersion=$lockVersion, metadata=$metadata, pendingBalanceAmount=$pendingBalanceAmount, postedBalanceAmount=$postedBalanceAmount, showResultingLedgerAccountBalances=$showResultingLedgerAccountBalances, additionalProperties=$additionalProperties}"
            }

            /**
             * If the ledger transaction can be reconciled to another object in Modern Treasury, the
             * type will be populated here, otherwise null. This can be one of payment_order,
             * incoming_payment_detail, expected_payment, return, paper_item, or reversal.
             */
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
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder internal constructor() {

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

            /** To post a ledger transaction at creation, use `posted`. */
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

                return /* spotless:off */ other is LedgerTransactionUpdateRequestWithId && id == other.id && description == other.description && effectiveAt == other.effectiveAt && ledgerEntries == other.ledgerEntries && ledgerableId == other.ledgerableId && ledgerableType == other.ledgerableType && metadata == other.metadata && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, description, effectiveAt, ledgerEntries, ledgerableId, ledgerableType, metadata, status, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "LedgerTransactionUpdateRequestWithId{id=$id, description=$description, effectiveAt=$effectiveAt, ledgerEntries=$ledgerEntries, ledgerableId=$ledgerableId, ledgerableType=$ledgerableType, metadata=$metadata, status=$status, additionalProperties=$additionalProperties}"
        }
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
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BulkRequestCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BulkRequestCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
