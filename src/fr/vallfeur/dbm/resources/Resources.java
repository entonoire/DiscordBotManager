package fr.vallfeur.dbm.resources;

import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Resources {

	public static String get(String name){
		Class<Resources> res = Resources.class;
		String value = null;
		
		switch (name) {
		case "tbar":
			value = res.getResource("tokenbar.css").toString();
			break;
		case "eye":
			value = res.getResource("eye2.png").toString();
			break;
		case "ssbtn":
			value = res.getResource("startstopbutton.css").toString();
			break;
		default:
			break;
		}
		return value;
	}
	
	public static Font font(double size){
		return Font.font("ArialBlack", FontWeight.BOLD, FontPosture.REGULAR, size);
	}
	
}
