package com.schmeekydev.application;

import com.schmeekydev.application.throw_Command.joke;
import com.schmeekydev.application.throw_Command.advice;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    public static void main(String[] args) {
        String token = "ODc5NzI3MDY4ODIzMzAyMjM0.YST7rQ.ws0794nflfJX_Qu_m6qPjxx1H1Y";
        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        api.addListener(new greet());
        api.addListener(new joke());
        api.addListener(new advice());
    }
}