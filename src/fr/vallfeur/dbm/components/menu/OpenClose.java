package fr.vallfeur.dbm.components.menu;

import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OpenClose {

	public static Button btn = new Button();
	public static boolean open = false;
	
	public static Node load(){
		btn.setGraphic(new ImageView(new Image(Resources.get("menu"))));
		btn.setLayoutX(895);
		btn.setLayoutY(0);
		btn.setPrefWidth(50);
		btn.getStylesheets().add(Resources.get("ocmenu"));
		
		btn.setOnMouseClicked(event -> {
			if(!open){
				MenuBox.open();
				SendMessage.open();
				Setting.close();
				btn.setLayoutX(MenuBox.pos);
				btn.setPrefWidth(MenuBox.size);
				open = true;
			}
			else{
				close();
			}
		});
		
		if(open){
			close();
		}
		
		return btn;
	}
	
	protected static void close(){
		MenuBox.close();
		SendMessage.close();
		Setting.close();
		btn.setLayoutX(895);
		btn.setPrefWidth(50);
		open = false;
	}
	
}
