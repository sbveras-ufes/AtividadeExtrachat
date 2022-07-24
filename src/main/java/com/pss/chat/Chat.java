package com.pss.chat;

public class Chat {

    public static void main(String[] args) {
        
        Mediator chatRoom = new ChatRoom();

        Colleague a = chatRoom.createColleague("Fulano", "HUMANO");
        Colleague b = chatRoom.createColleague("Sicrano", "HUMANO");
        Colleague c = chatRoom.createColleague("Beltrano", "HUMANO");
        Colleague bot=chatRoom.createColleague("Robô 1", "BOT");

        
        a.send("Como criar um chat ?");

        b.send("Utilize o design pattern Mediator, é a solução para seu problema");
        b.send("Utilize o design pattern Mediator, é a solução para seu problema<img");
        c.send("A IBM foi apelidada de ‘Big Blue’ por adotar o azul como sua cor corporativa oficial.");
        b.send("Utilize o design pattern Mediator, é a solução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problema");
    }
}