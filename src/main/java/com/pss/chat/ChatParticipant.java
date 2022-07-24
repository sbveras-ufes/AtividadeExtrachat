package com.pss.chat;

import Proxy.MessageFilter;



public class ChatParticipant extends Colleague {

    private String name;
   

    public ChatParticipant(Mediator chatMediator, String participantName) {
        name = participantName;
        mediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        MessageFilter regras=new MessageFilter();
        mediator.send(this, regras.filter(message));
    } 
        

    public void receive(String message, Colleague colleague) {
        if(message !=null)
        System.out.printf("%s para %s: %s\n", colleague.getName(), this.getName(), message);
    }
}