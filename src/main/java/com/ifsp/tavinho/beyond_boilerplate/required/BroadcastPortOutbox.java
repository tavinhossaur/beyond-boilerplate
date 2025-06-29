package com.ifsp.tavinho.beyond_boilerplate.required;

import java.util.List;

import com.ifsp.tavinho.beyond_boilerplate.provided.InterfacePort;

public abstract class BroadcastPortOutbox extends PortOutbox {

    protected List<InterfacePort> externalPorts;
    
    public void connect(InterfacePort externalPort) { }

    public void disconnect(InterfacePort externalPort) { }
    
    public void disconnect() { }
    
}
