package fr.vallfeur.dbm;

import fr.vallfeur.dbm.components.StartStopButton;
import fr.vallfeur.dbm.components.TokenBar;
import fr.vallfeur.dbm.components.menu.MenuBox;
import fr.vallfeur.dbm.components.menu.OpenClose;
import fr.vallfeur.dbm.components.menu.SendMessage;
import fr.vallfeur.dbm.components.menu.Setting;
import fr.vallfeur.dbm.resources.Colors;
import fr.vallfeur.dbm.resources.ColorsEnum;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public static Pane pane = new Pane();
	public static Pane msgpane = new Pane();
    public static ObservableList<Node> children = pane.getChildren();
    protected static Stage stage;
    public static SceneController sceneController;
    
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
		sceneController = new SceneController(stage.getScene());
//		-- set background color --
		pane.setStyle("-fx-background-color: rgb("+Colors.get(ColorsEnum.RGB, ColorsEnum.DARKGRAY)+");");
		
		
//		-- load all components for pane --

//		et là j'aimerais bien ajouté les éléments pour msgpane mais ça les affiches pas sur pane après
		children.addAll(MenuBox.load(), TokenBar.load_field(), TokenBar.load_eye(), StartStopButton.load(), OpenClose.load(), SendMessage.load(), Setting.load());

		
//		-- load all components for msgpane --
		msgpane.setStyle(pane.getStyle());
		
		
		sceneController.add("default", pane);
		sceneController.add("msg", msgpane);
		SceneController.activate("default");
		
		Main.stage = stage;
	}
	
}
