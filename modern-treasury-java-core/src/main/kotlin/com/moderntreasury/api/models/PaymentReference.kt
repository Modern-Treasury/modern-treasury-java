// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.moderntreasury.api.core.Enum
import com.moderntreasury.api.core.ExcludeMissing
import com.moderntreasury.api.core.JsonField
import com.moderntreasury.api.core.JsonMissing
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.NoAutoDetect
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.immutableEmptyMap
import com.moderntreasury.api.core.toImmutable
import com.moderntreasury.api.errors.ModernTreasuryInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class PaymentReference
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("live_mode")
    @ExcludeMissing
    private val liveMode: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("object")
    @ExcludeMissing
    private val object_: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reference_number")
    @ExcludeMissing
    private val referenceNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reference_number_type")
    @ExcludeMissing
    private val referenceNumberType: JsonField<ReferenceNumberType> = JsonMissing.of(),
    @JsonProperty("referenceable_id")
    @ExcludeMissing
    private val referenceableId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("referenceable_type")
    @ExcludeMissing
    private val referenceableType: JsonField<ReferenceableType> = JsonMissing.of(),
    @JsonProperty("updated_at")
    @ExcludeMissing
    private val updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * This field will be true if this object exists in the live environment or false if it exists
     * in the test environment.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liveMode(): Boolean = liveMode.getRequired("live_mode")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun object_(): String = object_.getRequired("object")

    /**
     * The actual reference number assigned by the bank.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceNumber(): String = referenceNumber.getRequired("reference_number")

    /**
     * The type of reference number.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceNumberType(): ReferenceNumberType =
        referenceNumberType.getRequired("reference_number_type")

    /**
     * The id of the referenceable to search for. Must be accompanied by the referenceable_type or
     * will return an error.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceableId(): String = referenceableId.getRequired("referenceable_id")

    /**
     * One of the referenceable types. This must be accompanied by the id of the referenceable or
     * will return an error.
     *
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referenceableType(): ReferenceableType = referenceableType.getRequired("referenceable_type")

    /**
     * @throws ModernTreasuryInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [liveMode].
     *
     * Unlike [liveMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("live_mode") @ExcludeMissing fun _liveMode(): JsonField<Boolean> = liveMode

    /**
     * Returns the raw JSON value of [object_].
     *
     * Unlike [object_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("object") @ExcludeMissing fun _object_(): JsonField<String> = object_

    /**
     * Returns the raw JSON value of [referenceNumber].
     *
     * Unlike [referenceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference_number")
    @ExcludeMissing
    fun _referenceNumber(): JsonField<String> = referenceNumber

    /**
     * Returns the raw JSON value of [referenceNumberType].
     *
     * Unlike [referenceNumberType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_number_type")
    @ExcludeMissing
    fun _referenceNumberType(): JsonField<ReferenceNumberType> = referenceNumberType

    /**
     * Returns the raw JSON value of [referenceableId].
     *
     * Unlike [referenceableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("referenceable_id")
    @ExcludeMissing
    fun _referenceableId(): JsonField<String> = referenceableId

    /**
     * Returns the raw JSON value of [referenceableType].
     *
     * Unlike [referenceableType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referenceable_type")
    @ExcludeMissing
    fun _referenceableType(): JsonField<ReferenceableType> = referenceableType

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentReference = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        liveMode()
        object_()
        referenceNumber()
        referenceNumberType()
        referenceableId()
        referenceableType()
        updatedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentReference].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .liveMode()
         * .object_()
         * .referenceNumber()
         * .referenceNumberType()
         * .referenceableId()
         * .referenceableType()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentReference]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var liveMode: JsonField<Boolean>? = null
        private var object_: JsonField<String>? = null
        private var referenceNumber: JsonField<String>? = null
        private var referenceNumberType: JsonField<ReferenceNumberType>? = null
        private var referenceableId: JsonField<String>? = null
        private var referenceableType: JsonField<ReferenceableType>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentReference: PaymentReference) = apply {
            id = paymentReference.id
            createdAt = paymentReference.createdAt
            liveMode = paymentReference.liveMode
            object_ = paymentReference.object_
            referenceNumber = paymentReference.referenceNumber
            referenceNumberType = paymentReference.referenceNumberType
            referenceableId = paymentReference.referenceableId
            referenceableType = paymentReference.referenceableType
            updatedAt = paymentReference.updatedAt
            additionalProperties = paymentReference.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * This field will be true if this object exists in the live environment or false if it
         * exists in the test environment.
         */
        fun liveMode(liveMode: Boolean) = liveMode(JsonField.of(liveMode))

        /**
         * Sets [Builder.liveMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liveMode] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun liveMode(liveMode: JsonField<Boolean>) = apply { this.liveMode = liveMode }

        fun object_(object_: String) = object_(JsonField.of(object_))

        /**
         * Sets [Builder.object_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.object_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun object_(object_: JsonField<String>) = apply { this.object_ = object_ }

        /** The actual reference number assigned by the bank. */
        fun referenceNumber(referenceNumber: String) =
            referenceNumber(JsonField.of(referenceNumber))

        /**
         * Sets [Builder.referenceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceNumber(referenceNumber: JsonField<String>) = apply {
            this.referenceNumber = referenceNumber
        }

        /** The type of reference number. */
        fun referenceNumberType(referenceNumberType: ReferenceNumberType) =
            referenceNumberType(JsonField.of(referenceNumberType))

        /**
         * Sets [Builder.referenceNumberType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceNumberType] with a well-typed
         * [ReferenceNumberType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun referenceNumberType(referenceNumberType: JsonField<ReferenceNumberType>) = apply {
            this.referenceNumberType = referenceNumberType
        }

        /**
         * The id of the referenceable to search for. Must be accompanied by the referenceable_type
         * or will return an error.
         */
        fun referenceableId(referenceableId: String) =
            referenceableId(JsonField.of(referenceableId))

        /**
         * Sets [Builder.referenceableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceableId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceableId(referenceableId: JsonField<String>) = apply {
            this.referenceableId = referenceableId
        }

        /**
         * One of the referenceable types. This must be accompanied by the id of the referenceable
         * or will return an error.
         */
        fun referenceableType(referenceableType: ReferenceableType) =
            referenceableType(JsonField.of(referenceableType))

        /**
         * Sets [Builder.referenceableType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceableType] with a well-typed [ReferenceableType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun referenceableType(referenceableType: JsonField<ReferenceableType>) = apply {
            this.referenceableType = referenceableType
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): PaymentReference =
            PaymentReference(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("liveMode", liveMode),
                checkRequired("object_", object_),
                checkRequired("referenceNumber", referenceNumber),
                checkRequired("referenceNumberType", referenceNumberType),
                checkRequired("referenceableId", referenceableId),
                checkRequired("referenceableType", referenceableType),
                checkRequired("updatedAt", updatedAt),
                additionalProperties.toImmutable(),
            )
    }

    /** The type of reference number. */
    class ReferenceNumberType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH_ORIGINAL_TRACE_NUMBER = of("ach_original_trace_number")

            @JvmField val ACH_TRACE_NUMBER = of("ach_trace_number")

            @JvmField val BANKPROV_PAYMENT_ACTIVITY_DATE = of("bankprov_payment_activity_date")

            @JvmField val BANKPROV_PAYMENT_ID = of("bankprov_payment_id")

            @JvmField val BNK_DEV_PRENOTIFICATION_ID = of("bnk_dev_prenotification_id")

            @JvmField val BNK_DEV_TRANSFER_ID = of("bnk_dev_transfer_id")

            @JvmField val BOFA_END_TO_END_ID = of("bofa_end_to_end_id")

            @JvmField val BOFA_TRANSACTION_ID = of("bofa_transaction_id")

            @JvmField val CHECK_NUMBER = of("check_number")

            @JvmField val CITIBANK_REFERENCE_NUMBER = of("citibank_reference_number")

            @JvmField
            val CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER =
                of("citibank_worldlink_clearing_system_reference_number")

            @JvmField val COLUMN_FX_QUOTE_ID = of("column_fx_quote_id")

            @JvmField val COLUMN_REVERSAL_PAIR_TRANSFER_ID = of("column_reversal_pair_transfer_id")

            @JvmField val COLUMN_TRANSFER_ID = of("column_transfer_id")

            @JvmField val CROSS_RIVER_PAYMENT_ID = of("cross_river_payment_id")

            @JvmField val CROSS_RIVER_SERVICE_MESSAGE = of("cross_river_service_message")

            @JvmField val CROSS_RIVER_TRANSACTION_ID = of("cross_river_transaction_id")

            @JvmField val CURRENCYCLOUD_CONVERSION_ID = of("currencycloud_conversion_id")

            @JvmField val CURRENCYCLOUD_PAYMENT_ID = of("currencycloud_payment_id")

            @JvmField val DC_BANK_TRANSACTION_ID = of("dc_bank_transaction_id")

            @JvmField val DWOLLA_TRANSACTION_ID = of("dwolla_transaction_id")

            @JvmField val EFT_TRACE_NUMBER = of("eft_trace_number")

            @JvmField val EVOLVE_TRANSACTION_ID = of("evolve_transaction_id")

            @JvmField val FEDWIRE_IMAD = of("fedwire_imad")

            @JvmField val FEDWIRE_OMAD = of("fedwire_omad")

            @JvmField val FIRST_REPUBLIC_INTERNAL_ID = of("first_republic_internal_id")

            @JvmField
            val GOLDMAN_SACHS_COLLECTION_REQUEST_ID = of("goldman_sachs_collection_request_id")

            @JvmField val GOLDMAN_SACHS_END_TO_END_ID = of("goldman_sachs_end_to_end_id")

            @JvmField val GOLDMAN_SACHS_PAYMENT_REQUEST_ID = of("goldman_sachs_payment_request_id")

            @JvmField val GOLDMAN_SACHS_REQUEST_ID = of("goldman_sachs_request_id")

            @JvmField val GOLDMAN_SACHS_UNIQUE_PAYMENT_ID = of("goldman_sachs_unique_payment_id")

            @JvmField val INTERAC_MESSAGE_ID = of("interac_message_id")

            @JvmField val JPMC_CCN = of("jpmc_ccn")

            @JvmField val JPMC_CLEARING_SYSTEM_REFERENCE = of("jpmc_clearing_system_reference")

            @JvmField val JPMC_CUSTOMER_REFERENCE_ID = of("jpmc_customer_reference_id")

            @JvmField val JPMC_END_TO_END_ID = of("jpmc_end_to_end_id")

            @JvmField val JPMC_FIRM_ROOT_ID = of("jpmc_firm_root_id")

            @JvmField val JPMC_FX_TRN_ID = of("jpmc_fx_trn_id")

            @JvmField val JPMC_P3_ID = of("jpmc_p3_id")

            @JvmField val JPMC_PAYMENT_BATCH_ID = of("jpmc_payment_batch_id")

            @JvmField val JPMC_PAYMENT_INFORMATION_ID = of("jpmc_payment_information_id")

            @JvmField val JPMC_PAYMENT_RETURNED_DATETIME = of("jpmc_payment_returned_datetime")

            @JvmField val LOB_CHECK_ID = of("lob_check_id")

            @JvmField val OTHER = of("other")

            @JvmField val PARTIAL_SWIFT_MIR = of("partial_swift_mir")

            @JvmField val PNC_CLEARING_REFERENCE = of("pnc_clearing_reference")

            @JvmField val PNC_INSTRUCTION_ID = of("pnc_instruction_id")

            @JvmField val PNC_MULTIPAYMENT_ID = of("pnc_multipayment_id")

            @JvmField val PNC_PAYMENT_TRACE_ID = of("pnc_payment_trace_id")

            @JvmField val PNC_TRANSACTION_REFERENCE_NUMBER = of("pnc_transaction_reference_number")

            @JvmField val RSPEC_VENDOR_PAYMENT_ID = of("rspec_vendor_payment_id")

            @JvmField val RTP_INSTRUCTION_ID = of("rtp_instruction_id")

            @JvmField val SIGNET_API_REFERENCE_ID = of("signet_api_reference_id")

            @JvmField val SIGNET_CONFIRMATION_ID = of("signet_confirmation_id")

            @JvmField val SIGNET_REQUEST_ID = of("signet_request_id")

            @JvmField val SILVERGATE_PAYMENT_ID = of("silvergate_payment_id")

            @JvmField val SVB_END_TO_END_ID = of("svb_end_to_end_id")

            @JvmField val SVB_PAYMENT_ID = of("svb_payment_id")

            @JvmField
            val SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW =
                of("svb_transaction_cleared_for_sanctions_review")

            @JvmField
            val SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW =
                of("svb_transaction_held_for_sanctions_review")

            @JvmField val SWIFT_MIR = of("swift_mir")

            @JvmField val SWIFT_UETR = of("swift_uetr")

            @JvmField
            val UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER = of("umb_product_partner_account_number")

            @JvmField
            val USBANK_PAYMENT_APPLICATION_REFERENCE_ID =
                of("usbank_payment_application_reference_id")

            @JvmField val USBANK_PAYMENT_ID = of("usbank_payment_id")

            @JvmField val USBANK_PENDING_RTP_PAYMENT_ID = of("usbank_pending_rtp_payment_id")

            @JvmField val USBANK_POSTED_RTP_PAYMENT_ID = of("usbank_posted_rtp_payment_id")

            @JvmField val WELLS_FARGO_END_TO_END_ID = of("wells_fargo_end_to_end_id")

            @JvmField val WELLS_FARGO_PAYMENT_ID = of("wells_fargo_payment_id")

            @JvmField val WELLS_FARGO_TRACE_NUMBER = of("wells_fargo_trace_number")

            @JvmField val WELLS_FARGO_UETR = of("wells_fargo_uetr")

            @JvmStatic fun of(value: String) = ReferenceNumberType(JsonField.of(value))
        }

        /** An enum containing [ReferenceNumberType]'s known values. */
        enum class Known {
            ACH_ORIGINAL_TRACE_NUMBER,
            ACH_TRACE_NUMBER,
            BANKPROV_PAYMENT_ACTIVITY_DATE,
            BANKPROV_PAYMENT_ID,
            BNK_DEV_PRENOTIFICATION_ID,
            BNK_DEV_TRANSFER_ID,
            BOFA_END_TO_END_ID,
            BOFA_TRANSACTION_ID,
            CHECK_NUMBER,
            CITIBANK_REFERENCE_NUMBER,
            CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
            COLUMN_FX_QUOTE_ID,
            COLUMN_REVERSAL_PAIR_TRANSFER_ID,
            COLUMN_TRANSFER_ID,
            CROSS_RIVER_PAYMENT_ID,
            CROSS_RIVER_SERVICE_MESSAGE,
            CROSS_RIVER_TRANSACTION_ID,
            CURRENCYCLOUD_CONVERSION_ID,
            CURRENCYCLOUD_PAYMENT_ID,
            DC_BANK_TRANSACTION_ID,
            DWOLLA_TRANSACTION_ID,
            EFT_TRACE_NUMBER,
            EVOLVE_TRANSACTION_ID,
            FEDWIRE_IMAD,
            FEDWIRE_OMAD,
            FIRST_REPUBLIC_INTERNAL_ID,
            GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
            GOLDMAN_SACHS_END_TO_END_ID,
            GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
            GOLDMAN_SACHS_REQUEST_ID,
            GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
            INTERAC_MESSAGE_ID,
            JPMC_CCN,
            JPMC_CLEARING_SYSTEM_REFERENCE,
            JPMC_CUSTOMER_REFERENCE_ID,
            JPMC_END_TO_END_ID,
            JPMC_FIRM_ROOT_ID,
            JPMC_FX_TRN_ID,
            JPMC_P3_ID,
            JPMC_PAYMENT_BATCH_ID,
            JPMC_PAYMENT_INFORMATION_ID,
            JPMC_PAYMENT_RETURNED_DATETIME,
            LOB_CHECK_ID,
            OTHER,
            PARTIAL_SWIFT_MIR,
            PNC_CLEARING_REFERENCE,
            PNC_INSTRUCTION_ID,
            PNC_MULTIPAYMENT_ID,
            PNC_PAYMENT_TRACE_ID,
            PNC_TRANSACTION_REFERENCE_NUMBER,
            RSPEC_VENDOR_PAYMENT_ID,
            RTP_INSTRUCTION_ID,
            SIGNET_API_REFERENCE_ID,
            SIGNET_CONFIRMATION_ID,
            SIGNET_REQUEST_ID,
            SILVERGATE_PAYMENT_ID,
            SVB_END_TO_END_ID,
            SVB_PAYMENT_ID,
            SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
            SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
            SWIFT_MIR,
            SWIFT_UETR,
            UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
            USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
            USBANK_PAYMENT_ID,
            USBANK_PENDING_RTP_PAYMENT_ID,
            USBANK_POSTED_RTP_PAYMENT_ID,
            WELLS_FARGO_END_TO_END_ID,
            WELLS_FARGO_PAYMENT_ID,
            WELLS_FARGO_TRACE_NUMBER,
            WELLS_FARGO_UETR,
        }

        /**
         * An enum containing [ReferenceNumberType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferenceNumberType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH_ORIGINAL_TRACE_NUMBER,
            ACH_TRACE_NUMBER,
            BANKPROV_PAYMENT_ACTIVITY_DATE,
            BANKPROV_PAYMENT_ID,
            BNK_DEV_PRENOTIFICATION_ID,
            BNK_DEV_TRANSFER_ID,
            BOFA_END_TO_END_ID,
            BOFA_TRANSACTION_ID,
            CHECK_NUMBER,
            CITIBANK_REFERENCE_NUMBER,
            CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER,
            COLUMN_FX_QUOTE_ID,
            COLUMN_REVERSAL_PAIR_TRANSFER_ID,
            COLUMN_TRANSFER_ID,
            CROSS_RIVER_PAYMENT_ID,
            CROSS_RIVER_SERVICE_MESSAGE,
            CROSS_RIVER_TRANSACTION_ID,
            CURRENCYCLOUD_CONVERSION_ID,
            CURRENCYCLOUD_PAYMENT_ID,
            DC_BANK_TRANSACTION_ID,
            DWOLLA_TRANSACTION_ID,
            EFT_TRACE_NUMBER,
            EVOLVE_TRANSACTION_ID,
            FEDWIRE_IMAD,
            FEDWIRE_OMAD,
            FIRST_REPUBLIC_INTERNAL_ID,
            GOLDMAN_SACHS_COLLECTION_REQUEST_ID,
            GOLDMAN_SACHS_END_TO_END_ID,
            GOLDMAN_SACHS_PAYMENT_REQUEST_ID,
            GOLDMAN_SACHS_REQUEST_ID,
            GOLDMAN_SACHS_UNIQUE_PAYMENT_ID,
            INTERAC_MESSAGE_ID,
            JPMC_CCN,
            JPMC_CLEARING_SYSTEM_REFERENCE,
            JPMC_CUSTOMER_REFERENCE_ID,
            JPMC_END_TO_END_ID,
            JPMC_FIRM_ROOT_ID,
            JPMC_FX_TRN_ID,
            JPMC_P3_ID,
            JPMC_PAYMENT_BATCH_ID,
            JPMC_PAYMENT_INFORMATION_ID,
            JPMC_PAYMENT_RETURNED_DATETIME,
            LOB_CHECK_ID,
            OTHER,
            PARTIAL_SWIFT_MIR,
            PNC_CLEARING_REFERENCE,
            PNC_INSTRUCTION_ID,
            PNC_MULTIPAYMENT_ID,
            PNC_PAYMENT_TRACE_ID,
            PNC_TRANSACTION_REFERENCE_NUMBER,
            RSPEC_VENDOR_PAYMENT_ID,
            RTP_INSTRUCTION_ID,
            SIGNET_API_REFERENCE_ID,
            SIGNET_CONFIRMATION_ID,
            SIGNET_REQUEST_ID,
            SILVERGATE_PAYMENT_ID,
            SVB_END_TO_END_ID,
            SVB_PAYMENT_ID,
            SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW,
            SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW,
            SWIFT_MIR,
            SWIFT_UETR,
            UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER,
            USBANK_PAYMENT_APPLICATION_REFERENCE_ID,
            USBANK_PAYMENT_ID,
            USBANK_PENDING_RTP_PAYMENT_ID,
            USBANK_POSTED_RTP_PAYMENT_ID,
            WELLS_FARGO_END_TO_END_ID,
            WELLS_FARGO_PAYMENT_ID,
            WELLS_FARGO_TRACE_NUMBER,
            WELLS_FARGO_UETR,
            /**
             * An enum member indicating that [ReferenceNumberType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACH_ORIGINAL_TRACE_NUMBER -> Value.ACH_ORIGINAL_TRACE_NUMBER
                ACH_TRACE_NUMBER -> Value.ACH_TRACE_NUMBER
                BANKPROV_PAYMENT_ACTIVITY_DATE -> Value.BANKPROV_PAYMENT_ACTIVITY_DATE
                BANKPROV_PAYMENT_ID -> Value.BANKPROV_PAYMENT_ID
                BNK_DEV_PRENOTIFICATION_ID -> Value.BNK_DEV_PRENOTIFICATION_ID
                BNK_DEV_TRANSFER_ID -> Value.BNK_DEV_TRANSFER_ID
                BOFA_END_TO_END_ID -> Value.BOFA_END_TO_END_ID
                BOFA_TRANSACTION_ID -> Value.BOFA_TRANSACTION_ID
                CHECK_NUMBER -> Value.CHECK_NUMBER
                CITIBANK_REFERENCE_NUMBER -> Value.CITIBANK_REFERENCE_NUMBER
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                    Value.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                COLUMN_FX_QUOTE_ID -> Value.COLUMN_FX_QUOTE_ID
                COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Value.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                COLUMN_TRANSFER_ID -> Value.COLUMN_TRANSFER_ID
                CROSS_RIVER_PAYMENT_ID -> Value.CROSS_RIVER_PAYMENT_ID
                CROSS_RIVER_SERVICE_MESSAGE -> Value.CROSS_RIVER_SERVICE_MESSAGE
                CROSS_RIVER_TRANSACTION_ID -> Value.CROSS_RIVER_TRANSACTION_ID
                CURRENCYCLOUD_CONVERSION_ID -> Value.CURRENCYCLOUD_CONVERSION_ID
                CURRENCYCLOUD_PAYMENT_ID -> Value.CURRENCYCLOUD_PAYMENT_ID
                DC_BANK_TRANSACTION_ID -> Value.DC_BANK_TRANSACTION_ID
                DWOLLA_TRANSACTION_ID -> Value.DWOLLA_TRANSACTION_ID
                EFT_TRACE_NUMBER -> Value.EFT_TRACE_NUMBER
                EVOLVE_TRANSACTION_ID -> Value.EVOLVE_TRANSACTION_ID
                FEDWIRE_IMAD -> Value.FEDWIRE_IMAD
                FEDWIRE_OMAD -> Value.FEDWIRE_OMAD
                FIRST_REPUBLIC_INTERNAL_ID -> Value.FIRST_REPUBLIC_INTERNAL_ID
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Value.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                GOLDMAN_SACHS_END_TO_END_ID -> Value.GOLDMAN_SACHS_END_TO_END_ID
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Value.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                GOLDMAN_SACHS_REQUEST_ID -> Value.GOLDMAN_SACHS_REQUEST_ID
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Value.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                INTERAC_MESSAGE_ID -> Value.INTERAC_MESSAGE_ID
                JPMC_CCN -> Value.JPMC_CCN
                JPMC_CLEARING_SYSTEM_REFERENCE -> Value.JPMC_CLEARING_SYSTEM_REFERENCE
                JPMC_CUSTOMER_REFERENCE_ID -> Value.JPMC_CUSTOMER_REFERENCE_ID
                JPMC_END_TO_END_ID -> Value.JPMC_END_TO_END_ID
                JPMC_FIRM_ROOT_ID -> Value.JPMC_FIRM_ROOT_ID
                JPMC_FX_TRN_ID -> Value.JPMC_FX_TRN_ID
                JPMC_P3_ID -> Value.JPMC_P3_ID
                JPMC_PAYMENT_BATCH_ID -> Value.JPMC_PAYMENT_BATCH_ID
                JPMC_PAYMENT_INFORMATION_ID -> Value.JPMC_PAYMENT_INFORMATION_ID
                JPMC_PAYMENT_RETURNED_DATETIME -> Value.JPMC_PAYMENT_RETURNED_DATETIME
                LOB_CHECK_ID -> Value.LOB_CHECK_ID
                OTHER -> Value.OTHER
                PARTIAL_SWIFT_MIR -> Value.PARTIAL_SWIFT_MIR
                PNC_CLEARING_REFERENCE -> Value.PNC_CLEARING_REFERENCE
                PNC_INSTRUCTION_ID -> Value.PNC_INSTRUCTION_ID
                PNC_MULTIPAYMENT_ID -> Value.PNC_MULTIPAYMENT_ID
                PNC_PAYMENT_TRACE_ID -> Value.PNC_PAYMENT_TRACE_ID
                PNC_TRANSACTION_REFERENCE_NUMBER -> Value.PNC_TRANSACTION_REFERENCE_NUMBER
                RSPEC_VENDOR_PAYMENT_ID -> Value.RSPEC_VENDOR_PAYMENT_ID
                RTP_INSTRUCTION_ID -> Value.RTP_INSTRUCTION_ID
                SIGNET_API_REFERENCE_ID -> Value.SIGNET_API_REFERENCE_ID
                SIGNET_CONFIRMATION_ID -> Value.SIGNET_CONFIRMATION_ID
                SIGNET_REQUEST_ID -> Value.SIGNET_REQUEST_ID
                SILVERGATE_PAYMENT_ID -> Value.SILVERGATE_PAYMENT_ID
                SVB_END_TO_END_ID -> Value.SVB_END_TO_END_ID
                SVB_PAYMENT_ID -> Value.SVB_PAYMENT_ID
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                    Value.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                    Value.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                SWIFT_MIR -> Value.SWIFT_MIR
                SWIFT_UETR -> Value.SWIFT_UETR
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Value.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                    Value.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                USBANK_PAYMENT_ID -> Value.USBANK_PAYMENT_ID
                USBANK_PENDING_RTP_PAYMENT_ID -> Value.USBANK_PENDING_RTP_PAYMENT_ID
                USBANK_POSTED_RTP_PAYMENT_ID -> Value.USBANK_POSTED_RTP_PAYMENT_ID
                WELLS_FARGO_END_TO_END_ID -> Value.WELLS_FARGO_END_TO_END_ID
                WELLS_FARGO_PAYMENT_ID -> Value.WELLS_FARGO_PAYMENT_ID
                WELLS_FARGO_TRACE_NUMBER -> Value.WELLS_FARGO_TRACE_NUMBER
                WELLS_FARGO_UETR -> Value.WELLS_FARGO_UETR
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                ACH_ORIGINAL_TRACE_NUMBER -> Known.ACH_ORIGINAL_TRACE_NUMBER
                ACH_TRACE_NUMBER -> Known.ACH_TRACE_NUMBER
                BANKPROV_PAYMENT_ACTIVITY_DATE -> Known.BANKPROV_PAYMENT_ACTIVITY_DATE
                BANKPROV_PAYMENT_ID -> Known.BANKPROV_PAYMENT_ID
                BNK_DEV_PRENOTIFICATION_ID -> Known.BNK_DEV_PRENOTIFICATION_ID
                BNK_DEV_TRANSFER_ID -> Known.BNK_DEV_TRANSFER_ID
                BOFA_END_TO_END_ID -> Known.BOFA_END_TO_END_ID
                BOFA_TRANSACTION_ID -> Known.BOFA_TRANSACTION_ID
                CHECK_NUMBER -> Known.CHECK_NUMBER
                CITIBANK_REFERENCE_NUMBER -> Known.CITIBANK_REFERENCE_NUMBER
                CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER ->
                    Known.CITIBANK_WORLDLINK_CLEARING_SYSTEM_REFERENCE_NUMBER
                COLUMN_FX_QUOTE_ID -> Known.COLUMN_FX_QUOTE_ID
                COLUMN_REVERSAL_PAIR_TRANSFER_ID -> Known.COLUMN_REVERSAL_PAIR_TRANSFER_ID
                COLUMN_TRANSFER_ID -> Known.COLUMN_TRANSFER_ID
                CROSS_RIVER_PAYMENT_ID -> Known.CROSS_RIVER_PAYMENT_ID
                CROSS_RIVER_SERVICE_MESSAGE -> Known.CROSS_RIVER_SERVICE_MESSAGE
                CROSS_RIVER_TRANSACTION_ID -> Known.CROSS_RIVER_TRANSACTION_ID
                CURRENCYCLOUD_CONVERSION_ID -> Known.CURRENCYCLOUD_CONVERSION_ID
                CURRENCYCLOUD_PAYMENT_ID -> Known.CURRENCYCLOUD_PAYMENT_ID
                DC_BANK_TRANSACTION_ID -> Known.DC_BANK_TRANSACTION_ID
                DWOLLA_TRANSACTION_ID -> Known.DWOLLA_TRANSACTION_ID
                EFT_TRACE_NUMBER -> Known.EFT_TRACE_NUMBER
                EVOLVE_TRANSACTION_ID -> Known.EVOLVE_TRANSACTION_ID
                FEDWIRE_IMAD -> Known.FEDWIRE_IMAD
                FEDWIRE_OMAD -> Known.FEDWIRE_OMAD
                FIRST_REPUBLIC_INTERNAL_ID -> Known.FIRST_REPUBLIC_INTERNAL_ID
                GOLDMAN_SACHS_COLLECTION_REQUEST_ID -> Known.GOLDMAN_SACHS_COLLECTION_REQUEST_ID
                GOLDMAN_SACHS_END_TO_END_ID -> Known.GOLDMAN_SACHS_END_TO_END_ID
                GOLDMAN_SACHS_PAYMENT_REQUEST_ID -> Known.GOLDMAN_SACHS_PAYMENT_REQUEST_ID
                GOLDMAN_SACHS_REQUEST_ID -> Known.GOLDMAN_SACHS_REQUEST_ID
                GOLDMAN_SACHS_UNIQUE_PAYMENT_ID -> Known.GOLDMAN_SACHS_UNIQUE_PAYMENT_ID
                INTERAC_MESSAGE_ID -> Known.INTERAC_MESSAGE_ID
                JPMC_CCN -> Known.JPMC_CCN
                JPMC_CLEARING_SYSTEM_REFERENCE -> Known.JPMC_CLEARING_SYSTEM_REFERENCE
                JPMC_CUSTOMER_REFERENCE_ID -> Known.JPMC_CUSTOMER_REFERENCE_ID
                JPMC_END_TO_END_ID -> Known.JPMC_END_TO_END_ID
                JPMC_FIRM_ROOT_ID -> Known.JPMC_FIRM_ROOT_ID
                JPMC_FX_TRN_ID -> Known.JPMC_FX_TRN_ID
                JPMC_P3_ID -> Known.JPMC_P3_ID
                JPMC_PAYMENT_BATCH_ID -> Known.JPMC_PAYMENT_BATCH_ID
                JPMC_PAYMENT_INFORMATION_ID -> Known.JPMC_PAYMENT_INFORMATION_ID
                JPMC_PAYMENT_RETURNED_DATETIME -> Known.JPMC_PAYMENT_RETURNED_DATETIME
                LOB_CHECK_ID -> Known.LOB_CHECK_ID
                OTHER -> Known.OTHER
                PARTIAL_SWIFT_MIR -> Known.PARTIAL_SWIFT_MIR
                PNC_CLEARING_REFERENCE -> Known.PNC_CLEARING_REFERENCE
                PNC_INSTRUCTION_ID -> Known.PNC_INSTRUCTION_ID
                PNC_MULTIPAYMENT_ID -> Known.PNC_MULTIPAYMENT_ID
                PNC_PAYMENT_TRACE_ID -> Known.PNC_PAYMENT_TRACE_ID
                PNC_TRANSACTION_REFERENCE_NUMBER -> Known.PNC_TRANSACTION_REFERENCE_NUMBER
                RSPEC_VENDOR_PAYMENT_ID -> Known.RSPEC_VENDOR_PAYMENT_ID
                RTP_INSTRUCTION_ID -> Known.RTP_INSTRUCTION_ID
                SIGNET_API_REFERENCE_ID -> Known.SIGNET_API_REFERENCE_ID
                SIGNET_CONFIRMATION_ID -> Known.SIGNET_CONFIRMATION_ID
                SIGNET_REQUEST_ID -> Known.SIGNET_REQUEST_ID
                SILVERGATE_PAYMENT_ID -> Known.SILVERGATE_PAYMENT_ID
                SVB_END_TO_END_ID -> Known.SVB_END_TO_END_ID
                SVB_PAYMENT_ID -> Known.SVB_PAYMENT_ID
                SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW ->
                    Known.SVB_TRANSACTION_CLEARED_FOR_SANCTIONS_REVIEW
                SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW ->
                    Known.SVB_TRANSACTION_HELD_FOR_SANCTIONS_REVIEW
                SWIFT_MIR -> Known.SWIFT_MIR
                SWIFT_UETR -> Known.SWIFT_UETR
                UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER -> Known.UMB_PRODUCT_PARTNER_ACCOUNT_NUMBER
                USBANK_PAYMENT_APPLICATION_REFERENCE_ID ->
                    Known.USBANK_PAYMENT_APPLICATION_REFERENCE_ID
                USBANK_PAYMENT_ID -> Known.USBANK_PAYMENT_ID
                USBANK_PENDING_RTP_PAYMENT_ID -> Known.USBANK_PENDING_RTP_PAYMENT_ID
                USBANK_POSTED_RTP_PAYMENT_ID -> Known.USBANK_POSTED_RTP_PAYMENT_ID
                WELLS_FARGO_END_TO_END_ID -> Known.WELLS_FARGO_END_TO_END_ID
                WELLS_FARGO_PAYMENT_ID -> Known.WELLS_FARGO_PAYMENT_ID
                WELLS_FARGO_TRACE_NUMBER -> Known.WELLS_FARGO_TRACE_NUMBER
                WELLS_FARGO_UETR -> Known.WELLS_FARGO_UETR
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReferenceNumberType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ModernTreasuryInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReferenceNumberType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * One of the referenceable types. This must be accompanied by the id of the referenceable or
     * will return an error.
     */
    class ReferenceableType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PAYMENT_ORDER = of("payment_order")

            @JvmField val REVERSAL = of("reversal")

            @JvmField val RETURN = of("return")

            @JvmStatic fun of(value: String) = ReferenceableType(JsonField.of(value))
        }

        /** An enum containing [ReferenceableType]'s known values. */
        enum class Known {
            PAYMENT_ORDER,
            REVERSAL,
            RETURN,
        }

        /**
         * An enum containing [ReferenceableType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ReferenceableType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT_ORDER,
            REVERSAL,
            RETURN,
            /**
             * An enum member indicating that [ReferenceableType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PAYMENT_ORDER -> Value.PAYMENT_ORDER
                REVERSAL -> Value.REVERSAL
                RETURN -> Value.RETURN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                PAYMENT_ORDER -> Known.PAYMENT_ORDER
                REVERSAL -> Known.REVERSAL
                RETURN -> Known.RETURN
                else ->
                    throw ModernTreasuryInvalidDataException("Unknown ReferenceableType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ModernTreasuryInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ModernTreasuryInvalidDataException("Value is not a String")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReferenceableType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentReference && id == other.id && createdAt == other.createdAt && liveMode == other.liveMode && object_ == other.object_ && referenceNumber == other.referenceNumber && referenceNumberType == other.referenceNumberType && referenceableId == other.referenceableId && referenceableType == other.referenceableType && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, liveMode, object_, referenceNumber, referenceNumberType, referenceableId, referenceableType, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentReference{id=$id, createdAt=$createdAt, liveMode=$liveMode, object_=$object_, referenceNumber=$referenceNumber, referenceNumberType=$referenceNumberType, referenceableId=$referenceableId, referenceableType=$referenceableType, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
