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
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import com.moderntreasury.api.services.blocking.PaymentFlowService
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** list payment_flows */
class PaymentFlowListPage
private constructor(
    private val paymentFlowsService: PaymentFlowService,
    private val params: PaymentFlowListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<PaymentFlow> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentFlowListPage && paymentFlowsService == other.paymentFlowsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentFlowsService, params, response) /* spotless:on */

    override fun toString() =
        "PaymentFlowListPage{paymentFlowsService=$paymentFlowsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<PaymentFlowListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            PaymentFlowListParams.builder().from(params).afterCursor(afterCursor()).build()
        )
    }

    fun getNextPage(): Optional<PaymentFlowListPage> {
        return getNextPageParams().map { paymentFlowsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentFlowsService: PaymentFlowService,
            params: PaymentFlowListParams,
            response: Response,
        ) = PaymentFlowListPage(paymentFlowsService, params, response)
    }

    class Response(
        private val items: JsonField<List<PaymentFlow>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("items") items: JsonField<List<PaymentFlow>> = JsonMissing.of()
        ) : this(items, "", "", mutableMapOf())

        fun items(): List<PaymentFlow> = items.getOptional("items").getOrNull() ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<PaymentFlow>>> = Optional.ofNullable(items)

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ModernTreasuryInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && perPage == other.perPage && afterCursor == other.afterCursor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, perPage, afterCursor, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, perPage=$perPage, afterCursor=$afterCursor, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [PaymentFlowListPage]. */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<PaymentFlow>> = JsonMissing.of()
            private var perPage: String? = null
            private var afterCursor: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.items = page.items
                this.perPage = page.perPage
                this.afterCursor = page.afterCursor
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<PaymentFlow>) = items(JsonField.of(items))

            fun items(items: JsonField<List<PaymentFlow>>) = apply { this.items = items }

            fun perPage(perPage: String) = apply { this.perPage = perPage }

            fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response =
                Response(items, perPage!!, afterCursor!!, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: PaymentFlowListPage) : Iterable<PaymentFlow> {

        override fun iterator(): Iterator<PaymentFlow> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<PaymentFlow> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
