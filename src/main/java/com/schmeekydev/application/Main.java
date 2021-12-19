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
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {

	private static final Logger clog = LogManager.getLogger(Main.class);

	public static void main(String[] args) throws IOException {
		File file = new File("src/token.txt");
		BufferedReader bufRead = new BufferedReader(new FileReader(file));
		clog.info("Application initialized");
		DiscordApi api = new DiscordApiBuilder()
			.setToken(bufRead.readLine())
			.login()
			.join();
		api.addListener(new Greet());
		api.addListener(new Joke());
		api.addListener(new Advice());
		api.addListener(new Meme());
		bufRead.close();
	}
}
