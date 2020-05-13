package com.github.onsdigital.dp.publishing.client;

import java.util.Set;

public class PublishingClientImpl implements PublishingClient {

    public PublishingTransactions createTransactions(Set<String> publishingHostIPs) {
        if (publishingHostIPs == null) {
            throw new IllegalArgumentException("hosts null");
        }

        if (publishingHostIPs.isEmpty()) {
            throw new IllegalArgumentException("hosts empty");
        }

        return new PublishingTransactions(new PublishingTransaction("", ""));
    }
}
