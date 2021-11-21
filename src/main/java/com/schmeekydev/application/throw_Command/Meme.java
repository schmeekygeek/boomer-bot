package com.schmeekydev.application.throw_Command;

import java.awt.Color;
import java.io.File;
import java.util.Random;

import java.util.Random;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Meme implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
  Random randomGenerator = new Random();

String[] text = event.getMessage().getContent().split(" ");

        EmbedBuilder memeEmbed = new EmbedBuilder();
        memeEmbed.setTitle("Here, take a look at this meme.\nHahahaha so funnyy!!!!")
                .setDescription("I found this on facebook").setColor(Color.BLUE)
                .setImage(new File(
                        String.format("src/minionmemes/%s.jpg", Integer.toString(randomGenerator.nextInt(23)))))
                .setAuthor("My Profile", "https://rr.noordstar.me/ac85117e",
                        "https://cdn.discordapp.com/embed/avatars/0.png");

        if (text[0].equalsIgnoreCase("throw") && text[1].equalsIgnoreCase("meme")) {
            event.getChannel().sendMessage(memeEmbed);
        }
    }
}
