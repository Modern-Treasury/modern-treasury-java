// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.toUnmodifiable
import com.moderntreasury.api.services.async.IncomingPaymentDetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class IncomingPaymentDetailListPageAsync
private constructor(
    private val incomingPaymentDetailsService: IncomingPaymentDetailServiceAsync,
    private val params: IncomingPaymentDetailListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<IncomingPaymentDetail> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IncomingPaymentDetailListPageAsync && this.incomingPaymentDetailsService == other.incomingPaymentDetailsService && this.params == other.params && this.response == other.response /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(incomingPaymentDetailsService, params, response) /* spotless:on */
    }

    override fun toString() =
        "IncomingPaymentDetailListPageAsync{incomingPaymentDetailsService=$incomingPaymentDetailsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<IncomingPaymentDetailListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            IncomingPaymentDetailListParams.builder()
                .from(params)
                .afterCursor(afterCursor())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<IncomingPaymentDetailListPageAsync>> {
        return getNextPageParams()
            .map { incomingPaymentDetailsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            incomingPaymentDetailsService: IncomingPaymentDetailServiceAsync,
            params: IncomingPaymentDetailListParams,
            response: Response
        ) =
            IncomingPaymentDetailListPageAsync(
                incomingPaymentDetailsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<IncomingPaymentDetail>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<IncomingPaymentDetail> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<IncomingPaymentDetail>>> = Optional.ofNullable(items)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                items().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && this.items == other.items && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */
        }

        override fun toString() =
            "IncomingPaymentDetailListPageAsync.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<IncomingPaymentDetail>> = JsonMissing.of()
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

            fun items(items: List<IncomingPaymentDetail>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<IncomingPaymentDetail>>) = apply { this.items = items }

            fun perPage(perPage: String) = apply { this.perPage = perPage }

            fun afterCursor(afterCursor: String) = apply { this.afterCursor = afterCursor }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    items,
                    perPage!!,
                    afterCursor!!,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: IncomingPaymentDetailListPageAsync,
    ) {

        fun forEach(
            action: Predicate<IncomingPaymentDetail>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<IncomingPaymentDetailListPageAsync>>.forEach(
                action: (IncomingPaymentDetail) -> Boolean,
                executor: Executor
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<IncomingPaymentDetail>> {
            val values = mutableListOf<IncomingPaymentDetail>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
