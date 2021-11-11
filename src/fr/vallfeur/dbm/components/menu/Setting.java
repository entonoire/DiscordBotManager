package fr.vallfeur.dbm.components.menu;

import fr.vallfeur.dbm.SceneController;
import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Setting {

	public static Button btn = new Button();
	
	public static Node load(){
		btn.setGraphic(new ImageView(new Image(Resources.get("setting"))));
		btn.setLayoutX(895);
		btn.setLayoutY(80);
		btn.setPrefWidth(50);
		btn.getStylesheets().add(Resources.get("ocmenu"));
		btn.setStyle("-fx-text-fill: white;");
		btn.setFont(Resources.font(10));
		
		btn.setOnMouseClicked(event -> {
			SceneController.activate("default");
		});
		
		return btn;
	}
	
	public static void open(){
		btn.setText("setting");
		btn.setLayoutX(MenuBox.pos);
		btn.setPrefWidth(MenuBox.size);
	}
	
	public static void close(){
		btn.setText("");
		btn.setLayoutX(895);
		btn.setPrefWidth(50);
	}
	
}
