package com.ifsp.tavinho.beyond_boilerplate.required;

public abstract class NonComponentPortOutbox extends PortOutbox {
    
    protected Object externalPort;

    public void connect(Object externalReference) { }
    
    public void disconnect() { }
    
}
