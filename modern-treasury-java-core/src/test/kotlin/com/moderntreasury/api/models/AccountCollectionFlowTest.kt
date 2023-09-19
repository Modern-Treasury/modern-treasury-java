package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowTest {

    @Test
    fun createAccountCollectionFlow() {
        val accountCollectionFlow =
            AccountCollectionFlow.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentTypes(listOf(AccountCollectionFlow.PaymentType.ACH))
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientToken("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("string")
                .receivingCountries(listOf(AccountCollectionFlow.ReceivingCountry.USA))
                .status(AccountCollectionFlow.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(accountCollectionFlow).isNotNull
        assertThat(accountCollectionFlow.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCollectionFlow.paymentTypes())
            .containsExactly(AccountCollectionFlow.PaymentType.ACH)
        assertThat(accountCollectionFlow.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCollectionFlow.clientToken()).contains("string")
        assertThat(accountCollectionFlow.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountCollectionFlow.externalAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCollectionFlow.liveMode()).contains(true)
        assertThat(accountCollectionFlow.object_()).contains("string")
        assertThat(accountCollectionFlow.receivingCountries().get())
            .containsExactly(AccountCollectionFlow.ReceivingCountry.USA)
        assertThat(accountCollectionFlow.status()).contains(AccountCollectionFlow.Status.CANCELLED)
        assertThat(accountCollectionFlow.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
