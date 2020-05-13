package com.github.onsdigital.dp.publishing.client;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class PublishingTransaction {

    private String transactionID;
    private String publishingAPIIPAddress;

    public PublishingTransaction(final String transactionID, final String publishingAPIIPAddress) {
        this.transactionID = transactionID;
        this.publishingAPIIPAddress = publishingAPIIPAddress;
    }

    public String getTransactionID() {
        return this.transactionID;
    }

    public String getPublishingAPIIPAddress() {
        return this.publishingAPIIPAddress;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        final PublishingTransaction that = (PublishingTransaction) o;

        return new EqualsBuilder()
                .append(this.getTransactionID(), that.getTransactionID())
                .append(this.getPublishingAPIIPAddress(), that.getPublishingAPIIPAddress())
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(this.getTransactionID())
                .append(this.getPublishingAPIIPAddress())
                .toHashCode();
    }
}
