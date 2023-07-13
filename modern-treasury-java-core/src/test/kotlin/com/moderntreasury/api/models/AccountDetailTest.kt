package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountDetailTest {

    @Test
    fun createAccountDetail() {
        val accountDetail =
            AccountDetail.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountNumber("string")
                .accountNumberType(AccountDetail.AccountNumberType.CLABE)
                .accountNumberSafe("string")
                .build()
        assertThat(accountDetail).isNotNull
        assertThat(accountDetail.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountDetail.object_()).isEqualTo("string")
        assertThat(accountDetail.liveMode()).isEqualTo(true)
        assertThat(accountDetail.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountDetail.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountDetail.discardedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountDetail.accountNumber()).contains("string")
        assertThat(accountDetail.accountNumberType())
            .isEqualTo(AccountDetail.AccountNumberType.CLABE)
        assertThat(accountDetail.accountNumberSafe()).isEqualTo("string")
    }
}
