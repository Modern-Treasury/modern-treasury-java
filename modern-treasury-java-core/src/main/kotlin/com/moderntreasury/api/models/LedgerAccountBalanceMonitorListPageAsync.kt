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
import com.moderntreasury.api.services.async.LedgerAccountBalanceMonitorServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class LedgerAccountBalanceMonitorListPageAsync
private constructor(
    private val ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorServiceAsync,
    private val params: LedgerAccountBalanceMonitorListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<LedgerAccountBalanceMonitor> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerAccountBalanceMonitorListPageAsync &&
            this.ledgerAccountBalanceMonitorsService == other.ledgerAccountBalanceMonitorsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            ledgerAccountBalanceMonitorsService,
            params,
            response,
        )
    }

    override fun toString() =
        "LedgerAccountBalanceMonitorListPageAsync{ledgerAccountBalanceMonitorsService=$ledgerAccountBalanceMonitorsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (items().isEmpty()) {
            return false
        }

        return true
    }

    fun getNextPageParams(): Optional<LedgerAccountBalanceMonitorListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            LedgerAccountBalanceMonitorListParams.builder()
                .from(params)
                .afterCursor(afterCursor())
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerAccountBalanceMonitorListPageAsync>> {
        return getNextPageParams()
            .map { ledgerAccountBalanceMonitorsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorServiceAsync,
            params: LedgerAccountBalanceMonitorListParams,
            response: Response
        ) =
            LedgerAccountBalanceMonitorListPageAsync(
                ledgerAccountBalanceMonitorsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val items: JsonField<List<LedgerAccountBalanceMonitor>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun items(): List<LedgerAccountBalanceMonitor> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<LedgerAccountBalanceMonitor>>> =
            Optional.ofNullable(items)

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

            return other is Response &&
                this.items == other.items &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(items, additionalProperties)
        }

        override fun toString() =
            "LedgerAccountBalanceMonitorListPageAsync.Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<LedgerAccountBalanceMonitor>> = JsonMissing.of()
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

            fun items(items: List<LedgerAccountBalanceMonitor>) = items(JsonField.of(items))

            @JsonProperty("items")
            fun items(items: JsonField<List<LedgerAccountBalanceMonitor>>) = apply {
                this.items = items
            }

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
        private val firstPage: LedgerAccountBalanceMonitorListPageAsync,
    ) {

        fun forEach(
            action: Predicate<LedgerAccountBalanceMonitor>,
            executor: Executor
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerAccountBalanceMonitorListPageAsync>>.forEach(
                action: (LedgerAccountBalanceMonitor) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerAccountBalanceMonitor>> {
            val values = mutableListOf<LedgerAccountBalanceMonitor>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
