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
import com.moderntreasury.api.services.async.VirtualAccountServiceAsync
import java.util.Collections
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** Get a list of virtual accounts. */
class VirtualAccountListPageAsync
private constructor(
    private val virtualAccountsService: VirtualAccountServiceAsync,
    private val params: VirtualAccountListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<VirtualAccount> = response().items()

    fun perPage(): String = response().perPage()

    fun afterCursor(): String = response().afterCursor()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VirtualAccountListPageAsync && virtualAccountsService == other.virtualAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(virtualAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "VirtualAccountListPageAsync{virtualAccountsService=$virtualAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<VirtualAccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            VirtualAccountListParams.builder().from(params).afterCursor(afterCursor()).build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<VirtualAccountListPageAsync>> {
        return getNextPageParams()
            .map { virtualAccountsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            virtualAccountsService: VirtualAccountServiceAsync,
            params: VirtualAccountListParams,
            response: Response,
        ) = VirtualAccountListPageAsync(virtualAccountsService, params, response)
    }

    class Response(
        private val items: JsonField<List<VirtualAccount>>,
        private val perPage: String,
        private val afterCursor: String,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("items") items: JsonField<List<VirtualAccount>> = JsonMissing.of()
        ) : this(items, "", "", mutableMapOf())

        fun items(): List<VirtualAccount> = items.getNullable("items") ?: listOf()

        fun perPage(): String = perPage

        fun afterCursor(): String = afterCursor

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<VirtualAccount>>> = Optional.ofNullable(items)

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
             * [VirtualAccountListPageAsync].
             */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<VirtualAccount>> = JsonMissing.of()
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

            fun items(items: List<VirtualAccount>) = items(JsonField.of(items))

            fun items(items: JsonField<List<VirtualAccount>>) = apply { this.items = items }

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

    class AutoPager(private val firstPage: VirtualAccountListPageAsync) {

        fun forEach(
            action: Predicate<VirtualAccount>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<VirtualAccountListPageAsync>>.forEach(
                action: (VirtualAccount) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<VirtualAccount>> {
            val values = mutableListOf<VirtualAccount>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
