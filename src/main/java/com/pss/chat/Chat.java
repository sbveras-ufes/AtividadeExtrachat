package com.pss.chat;

public class Chat {

    public static void main(String[] args) {
        
        Mediator chatRoom = new ChatRoom();

        Colleague pablo = chatRoom.createColleague("Pablo", "HUMANO");
        Colleague andre = chatRoom.createColleague("André", "HUMANO");
        Colleague romulo = chatRoom.createColleague("Rômulo", "HUMANO");
        Colleague vinicius = chatRoom.createColleague("Vinicius", "HUMANO");
        Colleague bot=chatRoom.createColleague("Robô 1", "BOT");
        
        pablo.send("Como criar um chat ?");
        andre.send("Utilize o design pattern Mediator, é a solução para seu problema");
        andre.send("Utilize o design pattern Mediator, é a solução para seu problema<img");
        romulo.send("A IBM foi apelidada de ‘Big Blue’ por adotar o azul como sua cor corporativa oficial.");
        andre.send("Utilize o design pattern Mediator, é a solução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problemasolução para seu problema");
    }
}