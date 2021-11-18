package fr.vallfeur.dbm;

import fr.vallfeur.dbm.bot.Launcher;
import fr.vallfeur.dbm.components.ChoiceBoxMessage;
import fr.vallfeur.dbm.components.MsgTextArea;
import fr.vallfeur.dbm.components.SendMsgBtn;
import fr.vallfeur.dbm.components.StartStopButton;
import fr.vallfeur.dbm.components.TokenBar;
import fr.vallfeur.dbm.components.menu.MenuBox;
import fr.vallfeur.dbm.components.menu.OpenClose;
import fr.vallfeur.dbm.components.menu.SendMessage;
import fr.vallfeur.dbm.components.menu.Setting;
import fr.vallfeur.dbm.resources.Colors;
import fr.vallfeur.dbm.resources.ColorsEnum;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application{
	
	public static Pane pane = new Pane();
	public static Pane msgpane = new Pane();
    public static ObservableList<Node> children = pane.getChildren();
    protected static Stage stage;
    
	public static void main(String[] str){
		Application.launch(str);
	}
	

	@Override
	public void start(Stage stage) throws Exception {
		
//		-- init stage parameter --
		stage.show();
		stage.setTitle("Discord Bot Manager");
		stage.setScene(new Scene(pane));
		stage.setHeight(540);
		stage.setWidth(960);
		stage.setResizable(false);
		stage.centerOnScreen();
//		*waiting for an icon* stage.getIcons().add(new Image());
		stage.setOnCloseRequest(event -> {
			System.exit(0);
		});
//		-- set background color --
		pane.setStyle("-fx-background-color: rgb("+Colors.get(ColorsEnum.RGB, ColorsEnum.DARKGRAY)+");");
		msgpane.setStyle(pane.getStyle());
		
		Main.stage = stage;
		setPane("msg");
		globalLoop();
	}
	
	public static void setPane(String name){
		switch (name) {
		case "default":
			children.clear();
			children.addAll(MenuBox.load(), TokenBar.load_field(), TokenBar.load_eye(), StartStopButton.load(), OpenClose.load(), SendMessage.load(),
							Setting.load());
			stage.getScene().setRoot(pane);
			break;
		case "msg":
			msgpane.getChildren().clear();
			msgpane.getChildren().addAll(MenuBox.load(), OpenClose.load(), SendMessage.load(), Setting.load(), ChoiceBoxMessage.load_GuildSelect(),
										 ChoiceBoxMessage.load_ChannelSelect(), MsgTextArea.load(), SendMsgBtn.load());
			stage.getScene().setRoot(msgpane);
			break;
		}
	}
	
	
	
	public static void globalLoop(){
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(200), event -> {
			//update send message button
			SendMsgBtn.update(Launcher.running);
			//update text area for message
			MsgTextArea.update(Launcher.running);
		}));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}
}
