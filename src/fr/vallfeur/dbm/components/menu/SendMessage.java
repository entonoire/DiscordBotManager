package fr.vallfeur.dbm.components.menu;

import fr.vallfeur.dbm.Main;
import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SendMessage {

	public static Button btn = new Button();
	
	public static Node load(){
		btn.setGraphic(new ImageView(new Image(Resources.get("smsg"))));
		btn.setLayoutX(895);
		btn.setLayoutY(40);
		btn.setPrefWidth(50);
		btn.getStylesheets().add(Resources.get("ocmenu"));
		btn.setStyle("-fx-text-fill: white;");
		btn.setFont(Resources.font(10));
		
		btn.setOnMouseClicked(event -> {
			Main.setPane("msg");
		});
		
		return btn;
	}
	
	public static void open(){
		btn.setText("send message");
		btn.setLayoutX(MenuBox.pos);
		btn.setPrefWidth(MenuBox.size);
	}
	
	public static void close(){
		btn.setText("");
		btn.setLayoutX(895);
		btn.setPrefWidth(50);
	}
	
}
