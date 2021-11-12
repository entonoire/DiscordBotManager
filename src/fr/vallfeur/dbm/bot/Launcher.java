package fr.vallfeur.dbm.bot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Launcher {

	public static boolean running = false;
	public static JDA client;
	
	//true : bot launch ; false : invalid token or another error
	public static boolean launch(String token){
		try{
			client = JDABuilder.createDefault(token).build();
			return true;
		}catch(LoginException e){
			e.printStackTrace();
			return false;
		}
	}
	
}
