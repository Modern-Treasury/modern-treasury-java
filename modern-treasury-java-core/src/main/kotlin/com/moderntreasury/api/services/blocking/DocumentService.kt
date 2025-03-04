// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Document
import com.moderntreasury.api.models.DocumentCreateParams
import com.moderntreasury.api.models.DocumentListPage
import com.moderntreasury.api.models.DocumentListParams
import com.moderntreasury.api.models.DocumentRetrieveParams

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a document. */
    @JvmOverloads
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** Get an existing document. */
    @JvmOverloads
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** Get a list of documents. */
    @JvmOverloads
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPage

    /** Get a list of documents. */
    fun list(requestOptions: RequestOptions): DocumentListPage =
        list(DocumentListParams.none(), requestOptions)

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/documents`, but is otherwise the same as
         * [DocumentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `get /api/documents/{id}`, but is otherwise the same as
         * [DocumentService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `get /api/documents`, but is otherwise the same as
         * [DocumentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPage>

        /**
         * Returns a raw HTTP response for `get /api/documents`, but is otherwise the same as
         * [DocumentService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListPage> =
            list(DocumentListParams.none(), requestOptions)
    }
}
