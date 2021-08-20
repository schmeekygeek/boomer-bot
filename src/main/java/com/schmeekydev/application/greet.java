package com.schmeekydev.application;

import java.util.Random;
import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class greet implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Random rand = new Random();
        String[] greetings = { "Marhaba", "Namaskar", "Hola", "Bonjour", "Guten Tag", "Shalom", "Salve",
                "Konnichiwa, Senpai >~<\"\"", "Assalamualaikum", "Namaste", "Wadakkam, anna" };

        Message mes = event.getMessage();
        String[] str = mes.getContent().split(" ");

        try {
            if (str[0].equalsIgnoreCase("hi") || str[0].equals("hello")) {
                event.getChannel().sendMessage(greetings[rand.nextInt(greetings.length)]);
            }
        } catch (Exception exception) {

        }
    }
}