package com.pss.chat;

import Chain.CharacterLimitCheck;
import Chain.Check;
import Chain.CopyrightCheck;
import Chain.HTMLCheck;
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
        Check chain = Check.set(new CharacterLimitCheck(),new HTMLCheck(),new CopyrightCheck());
       
        mediator.send(this,  chain.handle(message));
    } 
        

    public void receive(String message, Colleague colleague) {
        System.out.printf("%s para %s: %s\n", colleague.getName(), this.getName(), message);
    }
}