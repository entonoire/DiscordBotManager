package fr.vallfeur.dbm.bot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Launcher {

	public static JDA client;
	
	public void launch(String token){
		try{
			client = JDABuilder.createDefault(token).build();
		}catch(LoginException e){
			e.printStackTrace();
		}
	}
	
}
