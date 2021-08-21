package com.schmeekydev.application.throw_Command;

import java.util.Random;

import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class advice implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message message = event.getMessage();
        String[] text = message.getContent().split(" ");
        Random randomGenerator = new Random();

    }
}