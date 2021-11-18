package fr.vallfeur.dbm.components;

import fr.vallfeur.dbm.bot.MessageManager;
import fr.vallfeur.dbm.resources.Resources;
import javafx.scene.Node;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SendMsgBtn {

	protected static Button btn = new Button();
	
	public static Node load(){
		btn.setLayoutX(750);
		btn.setLayoutY(380);
		btn.setGraphic(new ImageView(new Image(Resources.get("send"))));
		btn.getStylesheets().add(Resources.get("startbtn"));
		
		btn.setOnMouseClicked(event -> {
			if(ChoiceBoxMessage.getGuild() != ChoiceBoxMessage.defaultGuild){
				if(ChoiceBoxMessage.getChannel() != ChoiceBoxMessage.defaultChannel1){
					if(MsgTextArea.ta.getText().length() > 0){
						MessageManager.sendMessage(ChoiceBoxMessage.getChannel(), ChoiceBoxMessage.getGuild(), MsgTextArea.ta.getText());
						MsgTextArea.ta.setText("");
						MsgTextArea.ta.requestFocus();
					}
					else{
						Resources.popup("Message error", "Please add text to send a message!", AlertType.ERROR);
					}
				}
				else{
					Resources.popup("Message error", "Please choose a channel to send a message!", AlertType.ERROR);
				}
			}
			else{
				Resources.popup("Message error", "Please choose a guild to send a message!", AlertType.ERROR);
			}
		});
		
		
		return btn;
	}
	
	public static void update(boolean status){
		btn.setDisable(!status);
	}
	
}
