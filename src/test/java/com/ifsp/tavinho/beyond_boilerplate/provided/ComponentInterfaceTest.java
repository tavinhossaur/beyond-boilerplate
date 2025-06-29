package com.ifsp.tavinho.beyond_boilerplate.provided;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponentInterfaceTest {

    static class TestPort extends InterfacePort {
        boolean connected = false;
        boolean disconnected = false;

        @Override
        public void initialize() {}

        @Override
        public void connect(InterfacePort externalPort) { connected = true; }

        @Override
        public void disconnect() { disconnected = true; }
    }

    static class TestComponent extends ComponentInterface {
        public TestComponent() {
            this.id = "comp1";
            TestPort port = new TestPort();
            port.id = "p1";
            this.ports = List.of(port);
        }

        @Override
        public void initialize() {}
    }

    @Test
    void testGetPortAndConnectDisconnect() {
        TestComponent comp = new TestComponent();
        InterfacePort port = comp.getPort("p1");
        assertNotNull(port);
        TestPort extPort = new TestPort();
        comp.connect(extPort, "p1");
        assertTrue(((TestPort) port).connected);
        comp.disconnect("p1");
        assertTrue(((TestPort) port).disconnected);
    }
} 