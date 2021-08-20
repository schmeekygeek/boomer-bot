package com.schmeekydev.application.makeme;

import org.javacord.api.entity.message.Message;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;
import java.util.Random;

public class makemelaugh implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        Random randomGenerator = new Random();
        String[] jokes = { "I'm afraid for the calendar. Its days are numbered.",
                "My wife said I should do lunges to stay in shape. That would be a big step forward.",
                "Why do fathers take an extra pair of socks when they go golfing? In case they get a hole in one!",
                "Singing in the shower is fun until you get soap in your mouth. Then it's a soap opera.",
                "What do a tick and the Eiffel Tower have in common? They're both Paris sites.",
                "What do you call a fish wearing a bowtie? Sofishticated.",
                "How do you follow Will Smith in the snow? You follow the fresh prints.",
                "If April showers bring May flowers, what do May flowers bring? Pilgrims.",
                "I thought the dryer was shrinking my clothes. Turns out it was the refrigerator all along.",
                "What do you call a factory that makes okay products? A satisfactory.",
                "Dear Math, grow up and solve your own problems.",
                "What did the janitor say when he jumped out of the closet? Supplies!",
                "Have you heard about the chocolate record player? It sounds pretty sweet.",
                "What did the ocean say to the beach? Nothing, it just waved.",
                "Why do seagulls fly over the ocean? Because if they flew over the bay, we'd call them bagels." };
        Message mes = event.getMessage();
        if (mes.getContent().equals("-makemelaugh")) {
            event.getChannel().sendMessage(jokes[randomGenerator.nextInt(jokes.length)]);
        }
    }
}