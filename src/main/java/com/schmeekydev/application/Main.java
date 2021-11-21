//////////////////////////////////////////////////////////////////////////////
//      Abdul Samad Shaikh                                                  //
//==========================================================================//
//                                                                          //
//      GENERAL PUBLIC LICENSE                                              //
//      Version 1.0.1, August 2021                                          //
//      CopyRight (C) 2021, 2021 schmeekydev Productions, Inc.              //
//      All Rights Reserved                                                 //
//                                                                          //
//////////////////////////////////////////////////////////////////////////////

package com.schmeekydev.application;

import com.schmeekydev.application.throw_Command.Advice;
import com.schmeekydev.application.throw_Command.Joke;
import com.schmeekydev.application.throw_Command.Meme;
import org.javacord.api.DiscordApi;
import org       .javacord.api.DiscordApiBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger clog = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        String token = "ODc5NzI3MDY4ODIzMzAyMjM0.YST7rQ.XfijhlT1y8o4zc8gNGly9URJXTA";
        clog.info("Application initialized");
        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
        api.addListener(new Greet());
        api.addListener(new Joke());
        api.addListener(new Advice());
        api.addListener(new Meme());
    }
}
