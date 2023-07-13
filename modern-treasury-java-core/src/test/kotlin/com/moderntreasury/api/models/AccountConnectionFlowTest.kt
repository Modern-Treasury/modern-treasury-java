package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountConnectionFlowTest {

    @Test
    fun createAccountConnectionFlow() {
        val accountConnectionFlow =
            AccountConnectionFlow.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .clientToken("string")
                .status(AccountConnectionFlow.Status.CANCELLED)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentTypes(listOf(AccountConnectionFlow.PaymentType.ACH))
                .build()
        assertThat(accountConnectionFlow).isNotNull
        assertThat(accountConnectionFlow.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountConnectionFlow.object_()).contains("string")
        assertThat(accountConnectionFlow.liveMode()).contains(true)
        assertThat(accountConnectionFlow.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountConnectionFlow.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountConnectionFlow.clientToken()).contains("string")
        assertThat(accountConnectionFlow.status()).contains(AccountConnectionFlow.Status.CANCELLED)
        assertThat(accountConnectionFlow.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountConnectionFlow.externalAccountId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountConnectionFlow.paymentTypes())
            .containsExactly(AccountConnectionFlow.PaymentType.ACH)
    }
}
