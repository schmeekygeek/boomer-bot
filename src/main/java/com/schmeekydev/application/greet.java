package com.schmeekydev.application;

import java.util.Random;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class greet implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Random randomGenerator = new Random();
        String[] greetings = { "Marhaba", "Namaskar", "Hola", "Bonjour", "Guten Tag", "Shalom", "Salve",
                "Konnichiwa, Senpai >~<\"\"", "Assalamualaikum", "Namaste", "Wadakkam, anna" };

        Message message = event.getMessage();
        String[] textArray = message.getContent().split(" ");

        try {
            if (textArray[0].equalsIgnoreCase("hi") || textArray[0].equals("hello")) {
                event.getChannel().sendMessage(greetings[randomGenerator.nextInt(greetings.length)]);
            }
        } catch (Exception exception) {

        }
    }
}