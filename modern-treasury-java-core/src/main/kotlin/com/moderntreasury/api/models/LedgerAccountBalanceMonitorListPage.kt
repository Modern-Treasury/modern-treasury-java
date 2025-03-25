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
import com.moderntreasury.api.services.blocking.LedgerAccountBalanceMonitorService
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of ledger account balance monitors. */
class LedgerAccountBalanceMonitorListPage
private constructor(
    private val ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorService,
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

        return /* spotless:off */ other is LedgerAccountBalanceMonitorListPage && ledgerAccountBalanceMonitorsService == other.ledgerAccountBalanceMonitorsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ledgerAccountBalanceMonitorsService, params, response) /* spotless:on */

    override fun toString() =
        "LedgerAccountBalanceMonitorListPage{ledgerAccountBalanceMonitorsService=$ledgerAccountBalanceMonitorsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
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

    fun getNextPage(): Optional<LedgerAccountBalanceMonitorListPage> {
        return getNextPageParams().map { ledgerAccountBalanceMonitorsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            ledgerAccountBalanceMonitorsService: LedgerAccountBalanceMonitorService,
            params: LedgerAccountBalanceMonitorListParams,
            response: Response,
        ) =
            LedgerAccountBalanceMonitorListPage(
                ledgerAccountBalanceMonitorsService,
                params,
                response,
            )
    }

    class Response(
        private val items: JsonField<List<LedgerAccountBalanceMonitor>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("items")
            items: JsonField<List<LedgerAccountBalanceMonitor>> = JsonMissing.of()
        ) : this(items, "", "", mutableMapOf())

        fun items(): List<LedgerAccountBalanceMonitor> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<LedgerAccountBalanceMonitor>>> =
            Optional.ofNullable(items)

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
             * Returns a mutable builder for constructing an instance of
             * [LedgerAccountBalanceMonitorListPage].
             */
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

            fun items(items: JsonField<List<LedgerAccountBalanceMonitor>>) = apply {
                this.items = items
            }

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

    class AutoPager(private val firstPage: LedgerAccountBalanceMonitorListPage) :
        Iterable<LedgerAccountBalanceMonitor> {

        override fun iterator(): Iterator<LedgerAccountBalanceMonitor> = iterator {
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

        fun stream(): Stream<LedgerAccountBalanceMonitor> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
