package com.github.onsdigital.dp.publishing.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PublishingTransactions implements Iterable<PublishingTransaction> {

    private List<PublishingTransaction> list;

    public PublishingTransactions() {
        this.list = new ArrayList<PublishingTransaction>();
    }

    public PublishingTransactions(PublishingTransaction... transactions) {
        this.list = new ArrayList<PublishingTransaction>();

        for (PublishingTransaction transaction : transactions) {
            add(transaction);
        }
    }

    public PublishingTransactions add(PublishingTransaction transaction) {
        this.list.add(transaction);
        return this;
    }

    public Iterator<PublishingTransaction> iterator() {
        return list.iterator();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }
}
