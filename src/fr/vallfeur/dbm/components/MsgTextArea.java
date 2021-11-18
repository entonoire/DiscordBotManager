package fr.vallfeur.dbm.components;

import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextFormatter;

public class MsgTextArea {

	protected static TextArea ta = new TextArea();
	
	public static Node load(){
		ta.setLayoutX(20);
		ta.setLayoutY(70);
		ta.getStylesheets().add(Resources.get("area"));
		ta.setFont(Resources.font(20));
		ta.setMaxWidth(780);
		
		//set max lenght to 2000
		ta.setTextFormatter(new TextFormatter<String>(change -> 
        change.getControlNewText().length() <= 2000 ? change : null));
		
		return ta;
	}
	
	public static void update(boolean status){
		if(!status){
			ta.setText("please start the bot");
		}
		ta.setDisable(!status);
	}
	
}
