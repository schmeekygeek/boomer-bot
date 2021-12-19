package com.schmeekydev.application;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Greet implements MessageCreateListener {

	private static final Logger clog = LogManager.getLogger(Greet.class);

	@Override
	public void onMessageCreate(MessageCreateEvent event) {
		String[] text = event.getMessage().getContent().split(" ");
		try {
			if (
				text[0].equalsIgnoreCase("hi") ||
				text[0].equalsIgnoreCase("hello")
			) {
				event.getChannel().sendMessage(sayHello());
				System.out.println("Triggerrrrred");
				clog.fatal(String.format("Replied with "));
			}
		} catch (Exception exception) {
			System.out.println("Error");
			clog.fatal(
				"An error occured\nCannot print full stack trace for the error"
			);
		}
	}

	public static String sayHello() {
		Random randomGenerator = new Random();
		String[] greetings = {
			"Marhaba",
			"Namaskar",
			"Hola",
			"Bonjour",
			"Guten Tag",
			"Shalom",
			"Salve",
			"Konnichiwa, Senpai >~<\"\"",
			"Assalamualaikum",
			"Namaste",
			"Wadakkam",
		};
		return greetings[randomGenerator.nextInt(greetings.length)];
	}
}
