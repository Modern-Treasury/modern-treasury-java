// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.AutoPager
import com.moderntreasury.api.core.Page
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.http.Headers
import com.moderntreasury.api.services.blocking.ConnectionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [ConnectionService.list] */
class ConnectionListPage
private constructor(
    private val service: ConnectionService,
    private val params: ConnectionListParams,
    private val headers: Headers,
    private val items: List<Connection>,
) : Page<Connection> {

    fun perPage(): Optional<String> =
        Optional.ofNullable(headers.values("X-Per-Page").firstOrNull())

    fun afterCursor(): Optional<String> =
        Optional.ofNullable(headers.values("X-After-Cursor").firstOrNull())

    override fun hasNextPage(): Boolean = items().isNotEmpty() && afterCursor().isPresent

    fun nextPageParams(): ConnectionListParams {
        val nextCursor =
            afterCursor().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().afterCursor(nextCursor).build()
    }

    override fun nextPage(): ConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Connection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ConnectionListParams = params

    /** The response that this page was parsed from. */
    override fun items(): List<Connection> = items

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ConnectionListPage].
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

    /** A builder for [ConnectionListPage]. */
    class Builder internal constructor() {

        private var service: ConnectionService? = null
        private var params: ConnectionListParams? = null
        private var headers: Headers? = null
        private var items: List<Connection>? = null

        @JvmSynthetic
        internal fun from(connectionListPage: ConnectionListPage) = apply {
            service = connectionListPage.service
            params = connectionListPage.params
            headers = connectionListPage.headers
            items = connectionListPage.items
        }

        fun service(service: ConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ConnectionListParams) = apply { this.params = params }

        fun headers(headers: Headers) = apply { this.headers = headers }

        /** The response that this page was parsed from. */
        fun items(items: List<Connection>) = apply { this.items = items }

        /**
         * Returns an immutable instance of [ConnectionListPage].
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
        fun build(): ConnectionListPage =
            ConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("headers", headers),
                checkRequired("items", items),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ConnectionListPage && service == other.service && params == other.params && headers == other.headers && items == other.items /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, headers, items) /* spotless:on */

    override fun toString() =
        "ConnectionListPage{service=$service, params=$params, headers=$headers, items=$items}"
}
