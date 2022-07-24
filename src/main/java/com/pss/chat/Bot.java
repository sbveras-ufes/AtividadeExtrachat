package com.pss.chat;

import java.io.File;

public class Bot extends Colleague {

    private String name;

    public Bot(Mediator chatMediator, String participantName) {
        name = participantName;
        mediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        mediator.send(this, message);
    }

    public void receive(String message, Colleague colleague) {
        System.out.printf("*** %s para %s: %s\n ****", colleague.getName(), this.getName(), message);
    }


}