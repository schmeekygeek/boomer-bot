package com.schmeekydev.application;

import java.util.Random;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class greet implements MessageCreateListener {
    public static String sayHello() {
        Random randomGenerator = new Random();
        String[] greetings = { "Marhaba", "Namaskar", "Hola", "Bonjour", "Guten Tag", "Shalom", "Salve",
                "Konnichiwa, Senpai >~<\"\"", "Assalamualaikum", "Namaste", "Wadakkam, anna" };
        return greetings[randomGenerator.nextInt(greetings.length)];
    }

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Message message = event.getMessage();
        String[] textArray = message.getContent().split(" ");
        try {
            if (textArray[0].equalsIgnoreCase("hi") || textArray[0].equals("hello")) {
                event.getChannel().sendMessage(sayHello());
            }
        } catch (Exception exception) {

        }
    }
}