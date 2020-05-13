package com.github.onsdigital.dp.publishing.client;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertFalse;

public class PublishingClientImplTest {

    private PublishingClient client;
    private Set<String> hostIPs;

    @Before
    public void setUp() {
        client = new PublishingClientImpl();
    }

    @Test(expected = IllegalArgumentException.class)
    public void createTransactions_hostsNull_shouldThrowEx() {
        client.createTransactions(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createTransactions_hostsEmpty_shouldThrowEx() {
        client.createTransactions(new HashSet<String>());
    }

    @Test
    public void createTransactions_hostsValid_shouldReturnTransactions() {
        PublishingTransactions result = client.createTransactions(withValidHosts());

        assertFalse(result == null);
        assertFalse(result.isEmpty());
    }

    private Set<String> withValidHosts() {
        return new HashSet<String>() {{
            add("http://localhost:8080");
        }};
    }
}
