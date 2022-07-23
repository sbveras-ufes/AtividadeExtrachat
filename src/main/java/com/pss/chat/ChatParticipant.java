package com.pss.chat;

import java.util.Arrays;
import java.util.List;



public class ChatParticipant extends Colleague {

    private String name;
    private final List<String> blackList = Arrays.asList("IBM", "Microsoft", "Apple");

    public ChatParticipant(Mediator chatMediator, String participantName) {
        name = participantName;
        mediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public void send(String message) {
        String Fmessage= message.replaceAll("IBM", "***");
//        Fmessage= message.replaceAll("Apple", "*****");
//        Fmessage= message.replaceAll("Microsoft", "*********");
        if (message.contains("<img")){
            System.out.println("HTML proibido");
            return;
    }
        if (message.length()<= 280)
        mediator.send(this, Fmessage);
        else    
        System.out.println("Mensagem muito grande! Limite: 280c");
    } 
        

    public void receive(String message, Colleague colleague) {
        System.out.printf("%s para %s: %s\n", colleague.getName(), this.getName(), message);
    }
}