package com.ifsp.tavinho.beyond_boilerplate.provided;

import com.ifsp.tavinho.beyond_boilerplate.required.PortOutbox;
import com.ifsp.tavinho.beyond_boilerplate.required.StandardPortOutbox;

public abstract class InterfacePort {

    protected String id;
    protected PortOutbox outbox;

    public abstract void initialize();
    
    public String getId() {
        return this.id;
    }

    public PortOutbox getOutbox() {
        return this.outbox;
    }

    public void connect(InterfacePort externalPort) {
        StandardPortOutbox standardOutbox = (StandardPortOutbox) this.outbox;
        standardOutbox.connect(externalPort);
    }

    public void disconnect() {
        if (this.outbox != null) ((StandardPortOutbox) this.outbox).disconnect();
    }

    public void connectNonComponent(Object externalReference) { }

    public void disconnect(InterfacePort externalPort) { }

}
