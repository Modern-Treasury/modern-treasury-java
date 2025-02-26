// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.Params
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import java.util.Objects
import java.util.Optional

/** update invoice_line_item */
class InvoiceLineItemUpdateParams
private constructor(
    private val invoiceId: String,
    private val id: String,
    private val body: InvoiceLineItemUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun invoiceId(): String = invoiceId

    fun id(): String = id

    /** An optional free-form description of the line item. */
    fun description(): Optional<String> = body.description()

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     */
    fun direction(): Optional<String> = body.direction()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** The name of the line item, typically a product or SKU name. */
    fun name(): Optional<String> = body.name()

    /**
     * The number of units of a product or service that this line item is for. Must be a whole
     * number. Defaults to 1 if not provided.
     */
    fun quantity(): Optional<Long> = body.quantity()

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit.
     */
    fun unitAmount(): Optional<Long> = body.unitAmount()

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
     */
    fun unitAmountDecimal(): Optional<String> = body.unitAmountDecimal()

    /** An optional free-form description of the line item. */
    fun _description(): JsonField<String> = body._description()

    /**
     * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
     * increases the invoice's `total_amount` due. `credit` has the opposite intention and effect.
     */
    fun _direction(): JsonField<String> = body._direction()

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** The name of the line item, typically a product or SKU name. */
    fun _name(): JsonField<String> = body._name()

    /**
     * The number of units of a product or service that this line item is for. Must be a whole
     * number. Defaults to 1 if not provided.
     */
    fun _quantity(): JsonField<Long> = body._quantity()

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit.
     */
    fun _unitAmount(): JsonField<Long> = body._unitAmount()

    /**
     * The cost per unit of the product or service that this line item is for, specified in the
     * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
     */
    fun _unitAmountDecimal(): JsonField<String> = body._unitAmountDecimal()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): InvoiceLineItemUpdateRequest = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> invoiceId
            1 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class InvoiceLineItemUpdateRequest
    @JsonCreator
    private constructor(
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("direction")
        @ExcludeMissing
        private val direction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unit_amount")
        @ExcludeMissing
        private val unitAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("unit_amount_decimal")
        @ExcludeMissing
        private val unitAmountDecimal: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** An optional free-form description of the line item. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(): Optional<String> = Optional.ofNullable(direction.getNullable("direction"))

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** The name of the line item, typically a product or SKU name. */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(): Optional<Long> = Optional.ofNullable(quantity.getNullable("quantity"))

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(): Optional<Long> =
            Optional.ofNullable(unitAmount.getNullable("unit_amount"))

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(): Optional<String> =
            Optional.ofNullable(unitAmountDecimal.getNullable("unit_amount_decimal"))

        /** An optional free-form description of the line item. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        @JsonProperty("direction") @ExcludeMissing fun _direction(): JsonField<String> = direction

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** The name of the line item, typically a product or SKU name. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount(): JsonField<Long> = unitAmount

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        @JsonProperty("unit_amount_decimal")
        @ExcludeMissing
        fun _unitAmountDecimal(): JsonField<String> = unitAmountDecimal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceLineItemUpdateRequest = apply {
            if (validated) {
                return@apply
            }

            description()
            direction()
            metadata().ifPresent { it.validate() }
            name()
            quantity()
            unitAmount()
            unitAmountDecimal()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InvoiceLineItemUpdateRequest]. */
        class Builder internal constructor() {

            private var description: JsonField<String> = JsonMissing.of()
            private var direction: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Long> = JsonMissing.of()
            private var unitAmount: JsonField<Long> = JsonMissing.of()
            private var unitAmountDecimal: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceLineItemUpdateRequest: InvoiceLineItemUpdateRequest) = apply {
                description = invoiceLineItemUpdateRequest.description
                direction = invoiceLineItemUpdateRequest.direction
                metadata = invoiceLineItemUpdateRequest.metadata
                name = invoiceLineItemUpdateRequest.name
                quantity = invoiceLineItemUpdateRequest.quantity
                unitAmount = invoiceLineItemUpdateRequest.unitAmount
                unitAmountDecimal = invoiceLineItemUpdateRequest.unitAmountDecimal
                additionalProperties =
                    invoiceLineItemUpdateRequest.additionalProperties.toMutableMap()
            }

            /** An optional free-form description of the line item. */
            fun description(description: String) = description(JsonField.of(description))

            /** An optional free-form description of the line item. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            fun direction(direction: String) = direction(JsonField.of(direction))

            /**
             * Either `debit` or `credit`. `debit` indicates that a client owes the business money
             * and increases the invoice's `total_amount` due. `credit` has the opposite intention
             * and effect.
             */
            fun direction(direction: JsonField<String>) = apply { this.direction = direction }

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

            /** The name of the line item, typically a product or SKU name. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the line item, typically a product or SKU name. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * The number of units of a product or service that this line item is for. Must be a
             * whole number. Defaults to 1 if not provided.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: Long) = unitAmount(JsonField.of(unitAmount))

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit.
             */
            fun unitAmount(unitAmount: JsonField<Long>) = apply { this.unitAmount = unitAmount }

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: String) =
                unitAmountDecimal(JsonField.of(unitAmountDecimal))

            /**
             * The cost per unit of the product or service that this line item is for, specified in
             * the invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
             */
            fun unitAmountDecimal(unitAmountDecimal: JsonField<String>) = apply {
                this.unitAmountDecimal = unitAmountDecimal
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

            fun build(): InvoiceLineItemUpdateRequest =
                InvoiceLineItemUpdateRequest(
                    description,
                    direction,
                    metadata,
                    name,
                    quantity,
                    unitAmount,
                    unitAmountDecimal,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceLineItemUpdateRequest && description == other.description && direction == other.direction && metadata == other.metadata && name == other.name && quantity == other.quantity && unitAmount == other.unitAmount && unitAmountDecimal == other.unitAmountDecimal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, direction, metadata, name, quantity, unitAmount, unitAmountDecimal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceLineItemUpdateRequest{description=$description, direction=$direction, metadata=$metadata, name=$name, quantity=$quantity, unitAmount=$unitAmount, unitAmountDecimal=$unitAmountDecimal, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceLineItemUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var invoiceId: String? = null
        private var id: String? = null
        private var body: InvoiceLineItemUpdateRequest.Builder =
            InvoiceLineItemUpdateRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(invoiceLineItemUpdateParams: InvoiceLineItemUpdateParams) = apply {
            invoiceId = invoiceLineItemUpdateParams.invoiceId
            id = invoiceLineItemUpdateParams.id
            body = invoiceLineItemUpdateParams.body.toBuilder()
            additionalHeaders = invoiceLineItemUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceLineItemUpdateParams.additionalQueryParams.toBuilder()
        }

        fun invoiceId(invoiceId: String) = apply { this.invoiceId = invoiceId }

        fun id(id: String) = apply { this.id = id }

        /** An optional free-form description of the line item. */
        fun description(description: String) = apply { body.description(description) }

        /** An optional free-form description of the line item. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(direction: String) = apply { body.direction(direction) }

        /**
         * Either `debit` or `credit`. `debit` indicates that a client owes the business money and
         * increases the invoice's `total_amount` due. `credit` has the opposite intention and
         * effect.
         */
        fun direction(direction: JsonField<String>) = apply { body.direction(direction) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Additional data represented as key-value pairs. Both the key and value must be strings.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: String) = apply { body.name(name) }

        /** The name of the line item, typically a product or SKU name. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(quantity: Long) = apply { body.quantity(quantity) }

        /**
         * The number of units of a product or service that this line item is for. Must be a whole
         * number. Defaults to 1 if not provided.
         */
        fun quantity(quantity: JsonField<Long>) = apply { body.quantity(quantity) }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(unitAmount: Long) = apply { body.unitAmount(unitAmount) }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit.
         */
        fun unitAmount(unitAmount: JsonField<Long>) = apply { body.unitAmount(unitAmount) }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(unitAmountDecimal: String) = apply {
            body.unitAmountDecimal(unitAmountDecimal)
        }

        /**
         * The cost per unit of the product or service that this line item is for, specified in the
         * invoice currency's smallest unit. Accepts decimal strings with up to 12 decimals
         */
        fun unitAmountDecimal(unitAmountDecimal: JsonField<String>) = apply {
            body.unitAmountDecimal(unitAmountDecimal)
        }

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

        fun build(): InvoiceLineItemUpdateParams =
            InvoiceLineItemUpdateParams(
                checkRequired("invoiceId", invoiceId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Additional data represented as key-value pairs. Both the key and value must be strings. */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

        /** A builder for [Metadata]. */
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

        return /* spotless:off */ other is InvoiceLineItemUpdateParams && invoiceId == other.invoiceId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invoiceId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InvoiceLineItemUpdateParams{invoiceId=$invoiceId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
