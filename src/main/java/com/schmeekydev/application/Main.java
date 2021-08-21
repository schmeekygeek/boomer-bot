package com.schmeekydev.application;

import com.schmeekydev.application.throw_Command.joke;
import com.schmeekydev.application.throw_Command.advice;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static void main(String[] args) {
        String token = "NzU4Mzc3NTE2MTg3NjQ4MDcz.X2uEGQ.jPrFGFVOd8coiNOMZZxpBwVyplc";
        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        api.addListener(new greet());
        api.addListener(new joke());
        api.addListener(new advice());
    }
}