package com.ifsp.tavinho.beyond_boilerplate.required;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import com.ifsp.tavinho.beyond_boilerplate.provided.InterfacePort;

import static org.junit.jupiter.api.Assertions.*;

class StandardPortOutboxTest {

    static class TestPort extends InterfacePort {

        @Override
        public void initialize() {}

    }

    static class TestOutbox extends StandardPortOutbox {}

    @Test
    void testConnectAndDisconnect() throws Exception {
        TestOutbox outbox = new TestOutbox();
        TestPort port = new TestPort();

        outbox.connect(port);

        Field field = StandardPortOutbox.class.getDeclaredField("externalPort");
        field.setAccessible(true);
        
        assertEquals(port, field.get(outbox));
        outbox.disconnect();
        assertNull(field.get(outbox));
    }
} 