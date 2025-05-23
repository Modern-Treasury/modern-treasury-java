// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingNumberLookupRequestTest {

    @Test
    fun create() {
        val routingNumberLookupRequest =
            RoutingNumberLookupRequest.builder()
                .bankAddress(
                    RoutingNumberLookupRequest.AddressRequest.builder()
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .bankName("bank_name")
                .routingNumber("routing_number")
                .routingNumberType(RoutingNumberLookupRequest.RoutingNumberType.ABA)
                .sanctions(
                    RoutingNumberLookupRequest.Sanctions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .supportedPaymentTypes(
                    listOf(
                        RoutingNumberLookupRequest.SupportedPaymentType.ACH,
                        RoutingNumberLookupRequest.SupportedPaymentType.AU_BECS,
                        RoutingNumberLookupRequest.SupportedPaymentType.BACS,
                        RoutingNumberLookupRequest.SupportedPaymentType.BASE,
                        RoutingNumberLookupRequest.SupportedPaymentType.BOOK,
                        RoutingNumberLookupRequest.SupportedPaymentType.CARD,
                        RoutingNumberLookupRequest.SupportedPaymentType.CHATS,
                        RoutingNumberLookupRequest.SupportedPaymentType.CHECK,
                        RoutingNumberLookupRequest.SupportedPaymentType.CROSS_BORDER,
                        RoutingNumberLookupRequest.SupportedPaymentType.DK_NETS,
                        RoutingNumberLookupRequest.SupportedPaymentType.EFT,
                        RoutingNumberLookupRequest.SupportedPaymentType.ETHEREUM,
                        RoutingNumberLookupRequest.SupportedPaymentType.HU_ICS,
                        RoutingNumberLookupRequest.SupportedPaymentType.INTERAC,
                        RoutingNumberLookupRequest.SupportedPaymentType.MASAV,
                        RoutingNumberLookupRequest.SupportedPaymentType.MX_CCEN,
                        RoutingNumberLookupRequest.SupportedPaymentType.NEFT,
                        RoutingNumberLookupRequest.SupportedPaymentType.NICS,
                        RoutingNumberLookupRequest.SupportedPaymentType.NZ_BECS,
                        RoutingNumberLookupRequest.SupportedPaymentType.PL_ELIXIR,
                        RoutingNumberLookupRequest.SupportedPaymentType.POLYGON,
                        RoutingNumberLookupRequest.SupportedPaymentType.PROVXCHANGE,
                        RoutingNumberLookupRequest.SupportedPaymentType.RO_SENT,
                        RoutingNumberLookupRequest.SupportedPaymentType.RTP,
                        RoutingNumberLookupRequest.SupportedPaymentType.SE_BANKGIROT,
                        RoutingNumberLookupRequest.SupportedPaymentType.SEN,
                        RoutingNumberLookupRequest.SupportedPaymentType.SEPA,
                        RoutingNumberLookupRequest.SupportedPaymentType.SG_GIRO,
                        RoutingNumberLookupRequest.SupportedPaymentType.SIC,
                        RoutingNumberLookupRequest.SupportedPaymentType.SIGNET,
                        RoutingNumberLookupRequest.SupportedPaymentType.SKNBI,
                        RoutingNumberLookupRequest.SupportedPaymentType.SOLANA,
                        RoutingNumberLookupRequest.SupportedPaymentType.WIRE,
                        RoutingNumberLookupRequest.SupportedPaymentType.ZENGIN,
                    )
                )
                .build()

        assertThat(routingNumberLookupRequest.bankAddress())
            .contains(
                RoutingNumberLookupRequest.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
        assertThat(routingNumberLookupRequest.bankName()).contains("bank_name")
        assertThat(routingNumberLookupRequest.routingNumber()).contains("routing_number")
        assertThat(routingNumberLookupRequest.routingNumberType())
            .contains(RoutingNumberLookupRequest.RoutingNumberType.ABA)
        assertThat(routingNumberLookupRequest.sanctions())
            .contains(
                RoutingNumberLookupRequest.Sanctions.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(routingNumberLookupRequest.supportedPaymentTypes().getOrNull())
            .containsExactly(
                RoutingNumberLookupRequest.SupportedPaymentType.ACH,
                RoutingNumberLookupRequest.SupportedPaymentType.AU_BECS,
                RoutingNumberLookupRequest.SupportedPaymentType.BACS,
                RoutingNumberLookupRequest.SupportedPaymentType.BASE,
                RoutingNumberLookupRequest.SupportedPaymentType.BOOK,
                RoutingNumberLookupRequest.SupportedPaymentType.CARD,
                RoutingNumberLookupRequest.SupportedPaymentType.CHATS,
                RoutingNumberLookupRequest.SupportedPaymentType.CHECK,
                RoutingNumberLookupRequest.SupportedPaymentType.CROSS_BORDER,
                RoutingNumberLookupRequest.SupportedPaymentType.DK_NETS,
                RoutingNumberLookupRequest.SupportedPaymentType.EFT,
                RoutingNumberLookupRequest.SupportedPaymentType.ETHEREUM,
                RoutingNumberLookupRequest.SupportedPaymentType.HU_ICS,
                RoutingNumberLookupRequest.SupportedPaymentType.INTERAC,
                RoutingNumberLookupRequest.SupportedPaymentType.MASAV,
                RoutingNumberLookupRequest.SupportedPaymentType.MX_CCEN,
                RoutingNumberLookupRequest.SupportedPaymentType.NEFT,
                RoutingNumberLookupRequest.SupportedPaymentType.NICS,
                RoutingNumberLookupRequest.SupportedPaymentType.NZ_BECS,
                RoutingNumberLookupRequest.SupportedPaymentType.PL_ELIXIR,
                RoutingNumberLookupRequest.SupportedPaymentType.POLYGON,
                RoutingNumberLookupRequest.SupportedPaymentType.PROVXCHANGE,
                RoutingNumberLookupRequest.SupportedPaymentType.RO_SENT,
                RoutingNumberLookupRequest.SupportedPaymentType.RTP,
                RoutingNumberLookupRequest.SupportedPaymentType.SE_BANKGIROT,
                RoutingNumberLookupRequest.SupportedPaymentType.SEN,
                RoutingNumberLookupRequest.SupportedPaymentType.SEPA,
                RoutingNumberLookupRequest.SupportedPaymentType.SG_GIRO,
                RoutingNumberLookupRequest.SupportedPaymentType.SIC,
                RoutingNumberLookupRequest.SupportedPaymentType.SIGNET,
                RoutingNumberLookupRequest.SupportedPaymentType.SKNBI,
                RoutingNumberLookupRequest.SupportedPaymentType.SOLANA,
                RoutingNumberLookupRequest.SupportedPaymentType.WIRE,
                RoutingNumberLookupRequest.SupportedPaymentType.ZENGIN,
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val routingNumberLookupRequest =
            RoutingNumberLookupRequest.builder()
                .bankAddress(
                    RoutingNumberLookupRequest.AddressRequest.builder()
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .bankName("bank_name")
                .routingNumber("routing_number")
                .routingNumberType(RoutingNumberLookupRequest.RoutingNumberType.ABA)
                .sanctions(
                    RoutingNumberLookupRequest.Sanctions.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .supportedPaymentTypes(
                    listOf(
                        RoutingNumberLookupRequest.SupportedPaymentType.ACH,
                        RoutingNumberLookupRequest.SupportedPaymentType.AU_BECS,
                        RoutingNumberLookupRequest.SupportedPaymentType.BACS,
                        RoutingNumberLookupRequest.SupportedPaymentType.BASE,
                        RoutingNumberLookupRequest.SupportedPaymentType.BOOK,
                        RoutingNumberLookupRequest.SupportedPaymentType.CARD,
                        RoutingNumberLookupRequest.SupportedPaymentType.CHATS,
                        RoutingNumberLookupRequest.SupportedPaymentType.CHECK,
                        RoutingNumberLookupRequest.SupportedPaymentType.CROSS_BORDER,
                        RoutingNumberLookupRequest.SupportedPaymentType.DK_NETS,
                        RoutingNumberLookupRequest.SupportedPaymentType.EFT,
                        RoutingNumberLookupRequest.SupportedPaymentType.ETHEREUM,
                        RoutingNumberLookupRequest.SupportedPaymentType.HU_ICS,
                        RoutingNumberLookupRequest.SupportedPaymentType.INTERAC,
                        RoutingNumberLookupRequest.SupportedPaymentType.MASAV,
                        RoutingNumberLookupRequest.SupportedPaymentType.MX_CCEN,
                        RoutingNumberLookupRequest.SupportedPaymentType.NEFT,
                        RoutingNumberLookupRequest.SupportedPaymentType.NICS,
                        RoutingNumberLookupRequest.SupportedPaymentType.NZ_BECS,
                        RoutingNumberLookupRequest.SupportedPaymentType.PL_ELIXIR,
                        RoutingNumberLookupRequest.SupportedPaymentType.POLYGON,
                        RoutingNumberLookupRequest.SupportedPaymentType.PROVXCHANGE,
                        RoutingNumberLookupRequest.SupportedPaymentType.RO_SENT,
                        RoutingNumberLookupRequest.SupportedPaymentType.RTP,
                        RoutingNumberLookupRequest.SupportedPaymentType.SE_BANKGIROT,
                        RoutingNumberLookupRequest.SupportedPaymentType.SEN,
                        RoutingNumberLookupRequest.SupportedPaymentType.SEPA,
                        RoutingNumberLookupRequest.SupportedPaymentType.SG_GIRO,
                        RoutingNumberLookupRequest.SupportedPaymentType.SIC,
                        RoutingNumberLookupRequest.SupportedPaymentType.SIGNET,
                        RoutingNumberLookupRequest.SupportedPaymentType.SKNBI,
                        RoutingNumberLookupRequest.SupportedPaymentType.SOLANA,
                        RoutingNumberLookupRequest.SupportedPaymentType.WIRE,
                        RoutingNumberLookupRequest.SupportedPaymentType.ZENGIN,
                    )
                )
                .build()

        val roundtrippedRoutingNumberLookupRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(routingNumberLookupRequest),
                jacksonTypeRef<RoutingNumberLookupRequest>(),
            )

        assertThat(roundtrippedRoutingNumberLookupRequest).isEqualTo(routingNumberLookupRequest)
    }
}
