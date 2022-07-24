package com.pss.chat;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;

public class ChatRoom implements Mediator {

    private ArrayList<Colleague> participants;

    public ChatRoom() {
        participants = new ArrayList<Colleague>();

    }

    @Override
    public void send(Colleague colleague, String message) {
        for (int i = 0, t = participants.size(); i < t; ++i) {
            
            Colleague participant = participants.get(i);
            if (!participant.equals(colleague) && !(participant instanceof Bot)) {
                
                participant.receive(message, colleague);
                
            }
            if ((participant instanceof Bot) && !participant.equals(colleague) && System.currentTimeMillis() % 2 == 0) {
                Calendar h = Calendar.getInstance();
                int horas = h.get(Calendar.HOUR);
                int minutos = h.get(Calendar.MINUTE);
                int segundos = h.get(Calendar.SECOND);
                participant.send("Hora Atual: " + horas + ":" + minutos + ":" + segundos);
            }
        }
    }

    @Override
    public Colleague createColleague(String name, String type) {
        Colleague participant = null;
        if (type.equals("HUMANO")) {

            participant = new ChatParticipant(this, name);
        } else if (type.equals("BOT")) {
            participant = new Bot(this, name);
        }

        participants.add(participant);

        return participant;
    }
}