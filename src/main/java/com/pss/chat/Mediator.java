package com.pss.chat;

public interface Mediator {

    public void send(Colleague colleague, String message);

    public Colleague createColleague(String name, String type);
}