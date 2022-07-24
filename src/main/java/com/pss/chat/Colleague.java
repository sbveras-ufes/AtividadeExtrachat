package com.pss.chat;

import java.io.File;

public abstract class Colleague {

    protected Mediator mediator;

    public abstract String getName();

    public abstract void send(String message);


    public abstract void receive(String message, Colleague colleague);
    

}