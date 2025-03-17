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
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.services.async.PaymentFlowServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** list payment_flows */
class PaymentFlowListPageAsync
private constructor(
    private val paymentFlowsService: PaymentFlowServiceAsync,
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

        return /* spotless:off */ other is PaymentFlowListPageAsync && paymentFlowsService == other.paymentFlowsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentFlowsService, params, response) /* spotless:on */

    override fun toString() =
        "PaymentFlowListPageAsync{paymentFlowsService=$paymentFlowsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<PaymentFlowListPageAsync>> {
        return getNextPageParams()
            .map { paymentFlowsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentFlowsService: PaymentFlowServiceAsync,
            params: PaymentFlowListParams,
            response: Response,
        ) = PaymentFlowListPageAsync(paymentFlowsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items") private val items: JsonField<List<PaymentFlow>> = JsonMissing.of(),
        private val perPage: String,
        private val afterCursor: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<PaymentFlow> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<PaymentFlow>>> = Optional.ofNullable(items)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
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

            /**
             * Returns a mutable builder for constructing an instance of [PaymentFlowListPageAsync].
             */
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
                Response(items, perPage!!, afterCursor!!, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: PaymentFlowListPageAsync) {

        fun forEach(action: Predicate<PaymentFlow>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaymentFlowListPageAsync>>.forEach(
                action: (PaymentFlow) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<PaymentFlow>> {
            val values = mutableListOf<PaymentFlow>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
