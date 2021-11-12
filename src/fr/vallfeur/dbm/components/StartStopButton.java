package fr.vallfeur.dbm.components;

import fr.vallfeur.dbm.bot.Launcher;
import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class StartStopButton {

	protected static Button btn = new Button();
	
	public static Node load(){
		if(!Launcher.running){
			btn.getStylesheets().add(Resources.get("startbtn"));
			btn.setText("Start");
		}
		else{
			btn.getStylesheets().add(Resources.get("stopbtn"));
			btn.setText("Stop");
		}
		
		btn.setFont(Resources.font(17));
		btn.setLayoutX(20);
		btn.setLayoutY(80);
		
		btn.setOnMouseClicked(event -> {
			if(btn.getText() == "Start"){
				if(!TokenBar.isEmpty()){
					if(Launcher.launch(TokenBar.getToken())){
						btn.getStylesheets().clear();
						btn.getStylesheets().add(Resources.get("stopbtn"));
						btn.setText("Stop");
						Launcher.running = true;
						TokenBar.setEditable(false);
					}
					else{
						Resources.popup("Token invalid or bot error", "please put a valid token, if a valid token don't work launch this app in your cmd to see the error", AlertType.ERROR);
					}
				}
				else{
					Resources.popup("Token bar is empty", "please but your bot token in the bar !", AlertType.ERROR);
				}
			}
			else{
				Launcher.client.shutdown();
				System.err.println("[JDA MainWS-ReadThread] INFO JDA - Bot off!");
				btn.getStylesheets().clear();
				btn.getStylesheets().add(Resources.get("startbtn"));
				btn.setText("Start");
				Launcher.running = false;
				TokenBar.setEditable(true);
			}
		});
		
		return btn;
	}
	
}
