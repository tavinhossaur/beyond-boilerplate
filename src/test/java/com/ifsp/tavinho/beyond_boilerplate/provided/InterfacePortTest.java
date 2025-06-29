package com.ifsp.tavinho.beyond_boilerplate.provided;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import com.ifsp.tavinho.beyond_boilerplate.required.StandardPortOutbox;

import static org.junit.jupiter.api.Assertions.*;

class InterfacePortTest {
    
    static class TestPort extends InterfacePort {

        @Override
        public void initialize() {}

    }

    static class TestOutbox extends StandardPortOutbox {}

    @Test
    void testConnectAndDisconnect() throws Exception {
        TestPort port = new TestPort();
        TestPort extPort = new TestPort();
        TestOutbox outbox = new TestOutbox();

        port.outbox = outbox;
        port.connect(extPort);

        Field field = StandardPortOutbox.class.getDeclaredField("externalPort");
        field.setAccessible(true);

        assertEquals(extPort, field.get(outbox));
        port.disconnect();
        assertNull(field.get(outbox));
    }
} 