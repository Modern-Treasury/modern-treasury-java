package com.moderntreasury.api.example;

import com.moderntreasury.api.client.ModernTreasuryClient;
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient;
import com.moderntreasury.api.models.*;

public class Main {
    static final String TEST_API_KEY = System.getenv("MODERN_TREASURY_API_KEY");
    static final String ORG_ID = System.getenv("MODERN_TREASURY_ORGANIZATION_ID");

    static final ModernTreasuryClient client = ModernTreasuryOkHttpClient.builder()
            .apiKey(TEST_API_KEY)
            .organizationId(ORG_ID)
            .build();

    public static void main(String[] args) {
        CounterpartyCreateParams params =
                CounterpartyCreateParams.builder().name("My test counterparty").build();
        Counterparty counterparty = client.counterparties().create(params);
        System.out.format("Created counterparty: %s\n", counterparty);

        CounterpartyListParams page1Params =
                CounterpartyListParams.builder().perPage(2).build();
        CounterpartyListPage page1 = client.counterparties().list(page1Params);
        System.out.format(
                "First page of counterparties has %s items\n", page1.items().size());

        CounterpartyListParams page2Params = CounterpartyListParams.builder()
                .perPage(2)
                .afterCursor(page1.afterCursor())
                .build();
        CounterpartyListPage page2 = client.counterparties().list(page2Params);
        System.out.format(
                "Second page of counterparties has %s items\n", page2.items().size());
    }
}
