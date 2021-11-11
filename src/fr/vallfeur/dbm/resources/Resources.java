package fr.vallfeur.dbm.resources;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

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
		case "startbtn":
			value = res.getResource("startbutton.css").toString();
			break;
		case "stopbtn":
			value = res.getResource("stopbutton.css").toString();
			break;
		case "menu":
			value = res.getResource("menu.png").toString();
			break;
		case "smsg":
			value = res.getResource("sendmsg.png").toString();
			break;
		case "ocmenu":
			value = res.getResource("openclosemenu.css").toString();
			break;
		case "setting":
			value = res.getResource("setting.png").toString();
			break;
		default:
			break;
		}
		return value;
	}
	
	public static Font font(double size){
		return Font.font("ArialBlack", FontWeight.BOLD, FontPosture.REGULAR, size);
	}
	
	
	public static void popup(String title, String text){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle(title);
		alert.setHeaderText(text);
		alert.showAndWait();
	}	
	public static void popup(String title, String text, AlertType type){
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(text);
		alert.showAndWait();
	}
	public static void popup(String title, String text, AlertType type, Image icon){
		Alert alert = new Alert(type);
		alert.setTitle(title);
		alert.setHeaderText(text);
		((Stage)alert.getDialogPane().getScene().getWindow()).getIcons().add(icon);
		alert.showAndWait();
	}	
	public static void popup(String title, String text, Image icon){
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle(title);
		alert.setHeaderText(text);
		((Stage)alert.getDialogPane().getScene().getWindow()).getIcons().add(icon);
		alert.showAndWait();
	}
	
}
