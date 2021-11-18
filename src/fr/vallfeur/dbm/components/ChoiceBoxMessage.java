package fr.vallfeur.dbm.components;

import fr.vallfeur.dbm.bot.Launcher;
import fr.vallfeur.dbm.bot.MessageManager;
import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;

public class ChoiceBoxMessage {

	protected static ChoiceBox<String> gs = new ChoiceBox<>();
	protected static ChoiceBox<String> cs = new ChoiceBox<>();
	
	public static String defaultGuild = "- choose a guild -";
	public static String defaultChannel1 = "- choose a channel -";
	public static String defaultChannel2 = "- please choose a guild -";
	
	public static Node load_GuildSelect(){
		gs.setLayoutX(20);
		gs.setLayoutY(20);
		gs.getStylesheets().add(Resources.get("cb"));
		gs.getItems().clear();
		
		if(Launcher.running){
			gs.getItems().add(defaultGuild);
			gs.getSelectionModel().selectFirst();
			for(String str : MessageManager.getGuilds()){
				gs.getItems().add(str);
			}
			gs.getSelectionModel().selectedItemProperty().addListener(event ->{
				update_cs();
			});
		}
		else{
			gs.getItems().add("- please turn the bot on -");
			gs.getSelectionModel().selectFirst();
		}

		return gs;
	}
	
	public static String getGuild(){
		return gs.getSelectionModel().getSelectedItem();
	}
	
	
	
	public static Node load_ChannelSelect(){
		cs.setLayoutX(200);
		cs.setLayoutY(20);
		cs.getStylesheets().add(Resources.get("cb"));
		update_cs();
		return cs;
	}
	
	protected static void update_cs(){
		cs.getItems().clear();
		
		if(Launcher.running){
			if(getGuild() == null || !getGuild().equalsIgnoreCase(defaultGuild)){
				cs.getItems().add(defaultChannel1);
				cs.getSelectionModel().selectFirst();
				for(String str : MessageManager.getChannels(getGuild())){
					cs.getItems().add(str);
				}
			}
			else{
				cs.getItems().add(defaultChannel2);
				cs.getSelectionModel().selectFirst();
			}
		}
		else{
			cs.getItems().add("- please turn the bot on -");
			cs.getSelectionModel().selectFirst();
		}
		
	}
	
	protected static String getChannel(){
		return cs.getSelectionModel().getSelectedItem();
	}
	
	
	
	
	
}
