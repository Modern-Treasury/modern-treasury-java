// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.moderntreasury.api.core.http.HttpClient
import com.moderntreasury.api.core.http.PhantomReachableClosingHttpClient
import com.moderntreasury.api.core.http.RetryingHttpClient
import java.time.Clock
import java.util.Base64

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    @get:JvmName("httpClient") val httpClient: HttpClient,
    @get:JvmName("jsonMapper") val jsonMapper: JsonMapper,
    @get:JvmName("clock") val clock: Clock,
    @get:JvmName("baseUrl") val baseUrl: String,
    @get:JvmName("apiKey") val apiKey: String,
    @get:JvmName("organizationId") val organizationId: String,
    @get:JvmName("webhookKey") val webhookKey: String?,
    @get:JvmName("headers") val headers: ListMultimap<String, String>,
    @get:JvmName("queryParams") val queryParams: ListMultimap<String, String>,
    @get:JvmName("responseValidation") val responseValidation: Boolean,
    @get:JvmName("maxRetries") val maxRetries: Int,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://app.moderntreasury.com"

        @JvmStatic fun builder() = Builder()

        @JvmStatic fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper? = null
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var queryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var organizationId: String? = null
        private var webhookKey: String? = null

        @JvmSynthetic
        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers =
                clientOptions.headers.asMap().mapValuesTo(mutableMapOf()) { (_, value) ->
                    value.toMutableList()
                }
            queryParams =
                clientOptions.queryParams.asMap().mapValuesTo(mutableMapOf()) { (_, value) ->
                    value.toMutableList()
                }
            responseValidation = clientOptions.responseValidation
            maxRetries = clientOptions.maxRetries
            apiKey = clientOptions.apiKey
            organizationId = clientOptions.organizationId
            webhookKey = clientOptions.webhookKey
        }

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.headers.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.headers.put(name, mutableListOf()) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.queryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.queryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply { this.queryParams.put(name, mutableListOf()) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun organizationId(organizationId: String) = apply { this.organizationId = organizationId }

        fun webhookKey(webhookKey: String?) = apply { this.webhookKey = webhookKey }

        fun fromEnv() = apply {
            System.getenv("MODERN_TREASURY_API_KEY")?.let { apiKey(it) }
            System.getenv("MODERN_TREASURY_ORGANIZATION_ID")?.let { organizationId(it) }
            System.getenv("MODERN_TREASURY_WEBHOOK_KEY")?.let { webhookKey(it) }
        }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }
            checkNotNull(apiKey) { "`apiKey` is required but was not set" }
            checkNotNull(organizationId) { "`organizationId` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
            val queryParams = ArrayListMultimap.create<String, String>()
            headers.put("X-Stainless-Lang", "java")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            if (!organizationId.isNullOrEmpty() && !apiKey.isNullOrEmpty()) {
                headers.put(
                    "Authorization",
                    "Basic ${Base64.getEncoder().encodeToString("${organizationId}:${apiKey}".toByteArray())}"
                )
            }
            this.headers.forEach(headers::replaceValues)
            this.queryParams.forEach(queryParams::replaceValues)

            return ClientOptions(
                httpClient!!,
                PhantomReachableClosingHttpClient(
                    RetryingHttpClient.builder()
                        .httpClient(httpClient!!)
                        .clock(clock)
                        .maxRetries(maxRetries)
                        .idempotencyHeader("Idempotency-Key")
                        .build()
                ),
                jsonMapper ?: jsonMapper(),
                clock,
                baseUrl,
                apiKey!!,
                organizationId!!,
                webhookKey,
                headers.toImmutable(),
                queryParams.toImmutable(),
                responseValidation,
                maxRetries,
            )
        }
    }
}
