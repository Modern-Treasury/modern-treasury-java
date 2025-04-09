// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.async.LedgerAccountCategoryServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

/** @see [LedgerAccountCategoryServiceAsync.list] */
class LedgerAccountCategoryListPageAsync
private constructor(
    private val service: LedgerAccountCategoryServiceAsync,
    private val params: LedgerAccountCategoryListParams,
    private val headers: Headers,
    private val items: List<LedgerAccountCategory>,
) {

    fun perPage(): Optional<String> = Optional.ofNullable(headers.values("per_page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("after_cursor").firstOrNull())

    fun hasNextPage(): Boolean = items.isNotEmpty() && afterCursor().isPresent

    fun getNextPageParams(): Optional<LedgerAccountCategoryListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { afterCursor().ifPresent { afterCursor(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<LedgerAccountCategoryListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LedgerAccountCategoryListParams = params

    /** The response that this page was parsed from. */
    fun items(): List<LedgerAccountCategory> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LedgerAccountCategoryListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerAccountCategoryListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerAccountCategoryServiceAsync? = null
        private var params: LedgerAccountCategoryListParams? = null
        private var headers: Headers? = null
        private var items: List<LedgerAccountCategory>? = null

        @JvmSynthetic
        internal fun from(ledgerAccountCategoryListPageAsync: LedgerAccountCategoryListPageAsync) =
            apply {
                service = ledgerAccountCategoryListPageAsync.service
                params = ledgerAccountCategoryListPageAsync.params
                headers = ledgerAccountCategoryListPageAsync.headers
                items = ledgerAccountCategoryListPageAsync.items
            }

        fun service(service: LedgerAccountCategoryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerAccountCategoryListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<LedgerAccountCategory>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [LedgerAccountCategoryListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .headers()
         * .items()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerAccountCategoryListPageAsync =
            LedgerAccountCategoryListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    class AutoPager(private val firstPage: LedgerAccountCategoryListPageAsync) {

        fun forEach(
            action: Predicate<LedgerAccountCategory>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LedgerAccountCategoryListPageAsync>>.forEach(
                action: (LedgerAccountCategory) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LedgerAccountCategory>> {
            val values = mutableListOf<LedgerAccountCategory>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LedgerAccountCategoryListPageAsync && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "LedgerAccountCategoryListPageAsync{service=$service, params=$params, headers=$headers, items=$items}"
}
