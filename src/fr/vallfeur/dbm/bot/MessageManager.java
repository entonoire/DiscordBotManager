package fr.vallfeur.dbm.bot;

import java.util.ArrayList;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.TextChannel;

public class MessageManager {

	protected static JDA client = Launcher.client;
	
	public static ArrayList<String> getGuilds(){
		ArrayList<String> list = new ArrayList<>();

		for(Guild guild : client.getGuilds()){
			list.add(guild.getName());
		}
		return list;
	}
	
	public static ArrayList<String> getChannels(String guild){
		ArrayList<String> list = new ArrayList<>();
		
		
		for(Guild g : client.getGuilds()){
			if(g.getName().equalsIgnoreCase(guild)){
				for(TextChannel chan : g.getTextChannels()){
					list.add(chan.getName());
				}
			}
		}
		return list;
	}
	
	public static void sendMessage(String channel, String guild, String message){
		for(Guild g : client.getGuilds()){
			if(g.getName() == guild){
				for(TextChannel chan : g.getTextChannels()){
					if(chan.getName() == channel){
						chan.sendMessage(message).queue();
					}
				}
			}
		}
	}
	
}
