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
import org.javacord.api.DiscordApiBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;

public class Main {
    private static final Logger clog = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException{
        BufferedReader bufRead = new BufferedReader(new FileReader("token.txt"));
        clog.info("Application initialized");
        DiscordApi api = new DiscordApiBuilder().setToken(bufRead.readLine()).login().join();
        api.addListener(new Greet());
        api.addListener(new Joke());
        api.addListener(new Advice());
        api.addListener(new Meme());
        bufRead.close();
    }
}
