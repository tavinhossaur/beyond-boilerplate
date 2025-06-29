package com.ifsp.tavinho.beyond_boilerplate.required;

import com.ifsp.tavinho.beyond_boilerplate.provided.InterfacePort;

public abstract class StandardPortOutbox extends PortOutbox {

    protected InterfacePort externalPort;

    public void connect(InterfacePort externalPort){
        this.externalPort = externalPort;
    }
    
    public void disconnect(){
        this.externalPort = null;
    }
}
