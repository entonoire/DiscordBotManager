package fr.vallfeur.dbm.components.menu;

import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class OpenClose {

	protected static Button btn = new Button();
	public static boolean open = false;
	
	public static Node load(){
		btn.setGraphic(new ImageView(new Image(Resources.get("menu"))));
		btn.setLayoutX(895);
		btn.setLayoutY(0);
		btn.setPrefWidth(50);
		btn.getStylesheets().add(Resources.get("ocmenu"));
		btn.setRotate(180);
		
		btn.setOnMouseClicked(event -> {
			if(!open){
				MenuBox.open();
				btn.setLayoutX(845);
				btn.setPrefWidth(100);
				open = true;
			}
			else{
				MenuBox.close();
				btn.setLayoutX(895);
				btn.setPrefWidth(50);
				open = false;
			}
		});
		
		return btn;
	}
	
	
}
