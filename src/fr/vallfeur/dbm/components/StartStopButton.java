package fr.vallfeur.dbm.components;

import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class StartStopButton {

	protected static Button btn = new Button();
	
	public static Node load(){
		btn.getStylesheets().add(Resources.get("ssbtn"));
		btn.setText("Start");
		btn.setFont(Resources.font(17));
		btn.setLayoutX(20);
		btn.setLayoutY(80);
		
		return btn;
	}
	
}
