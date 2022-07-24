package com.pss.chat;

import java.io.File;

public interface Mediator {

    public void send(Colleague colleague, String message);

    public Colleague createColleague(String name, String type);
}