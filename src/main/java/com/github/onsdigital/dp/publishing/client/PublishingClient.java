package com.github.onsdigital.dp.publishing.client;

import java.util.Set;

public interface PublishingClient {

    PublishingTransactions createTransactions(Set<String> publishingHostIPs);
}
