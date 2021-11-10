package fr.vallfeur.dbm.components;


import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TokenBar {

//where you will put your bot token
	protected static TextField field = new TextField();
	protected static ImageView eye = new ImageView(new Image(Resources.get("eye")));
	private static String savedtoken;
	private static boolean password = true; //true: show ; false hide
	
	public static Node load_field() {
		field.setFont(Resources.font(12.5));
		
		field.setText("NTAwNzQxMzA1NDYzMjEwMDE5.W8I9rg.GHcUw8Njq45R4tsMO3bsZQHl-y0");
		field.setPrefSize(477, 20);
		field.setLayoutX(20);
		field.setLayoutY(20);
		field.getStylesheets().add(Resources.get("tbar"));
		
		return field;
		
	}
	
	public static Node load_eye(){
		eye.setLayoutX(field.getLayoutX()+field.getPrefWidth()+5);
		eye.setLayoutY(field.getPrefHeight()-7);
		eye.setStyle("-fx-cursor: hand;");
		
		eye.setOnMouseClicked(event ->{
			if(password){//if password is show
				savedtoken = field.getText();
				StringBuilder builder = new StringBuilder();
				for(int i = 0; i < savedtoken.length() ; i++){
					builder.append("•");
				}
				field.setText(builder.toString());
				field.setEditable(false);
				password = false;
			}else{
				field.setText(savedtoken);
				field.setEditable(true);
				password = true;
			}
		});
		
		return eye;
	}
	
	public static String getToken(){
		if(password){
			return field.getText();
		}
		else{
			return savedtoken;
		}
	}
	
}
