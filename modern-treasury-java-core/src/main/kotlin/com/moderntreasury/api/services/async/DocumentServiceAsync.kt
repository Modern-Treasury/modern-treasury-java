// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import com.moderntreasury.api.models.DocumentListPageAsync
import com.moderntreasury.api.models.DocumentListParams
import com.moderntreasury.api.models.DocumentRetrieveParams
import java.util.concurrent.CompletableFuture

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a document. */
    fun create(params: DocumentCreateParams): CompletableFuture<Document> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Document>

    /** Get an existing document. */
    fun retrieve(id: String): CompletableFuture<Document> =
        retrieve(id, DocumentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Document> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
    ): CompletableFuture<Document> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Document>

    /** @see [retrieve] */
    fun retrieve(params: DocumentRetrieveParams): CompletableFuture<Document> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Document> =
        retrieve(id, DocumentRetrieveParams.none(), requestOptions)

    /** Get a list of documents. */
    fun list(): CompletableFuture<DocumentListPageAsync> = list(DocumentListParams.none())

    /** @see [list] */
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DocumentListPageAsync>

    /** @see [list] */
    fun list(
        params: DocumentListParams = DocumentListParams.none()
    ): CompletableFuture<DocumentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DocumentListPageAsync> =
        list(DocumentListParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/documents`, but is otherwise the same as
         * [DocumentServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: DocumentCreateParams): CompletableFuture<HttpResponseFor<Document>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Document>>

        /**
         * Returns a raw HTTP response for `get /api/documents/{id}`, but is otherwise the same as
         * [DocumentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(id, DocumentRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Document>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: DocumentRetrieveParams): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Document>> =
            retrieve(id, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(DocumentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none()
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DocumentListPageAsync>> =
            list(DocumentListParams.none(), requestOptions)
    }
}
