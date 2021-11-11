package fr.vallfeur.dbm;

import fr.vallfeur.dbm.components.StartStopButton;
import fr.vallfeur.dbm.components.TokenBar;
import fr.vallfeur.dbm.components.menu.MenuBox;
import fr.vallfeur.dbm.components.menu.OpenClose;
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
    public static ObservableList<Node> children = pane.getChildren();
    
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
		stage.setResizable(true);
		stage.centerOnScreen();
//		*waiting for an icon* stage.getIcons().add(new Image());
		stage.setOnCloseRequest(event -> {
			System.exit(0);
		});
		
//		-- set background color --
		pane.setStyle("-fx-background-color: rgb("+Colors.get(ColorsEnum.RGB, ColorsEnum.DARKGRAY)+");");
		
		
//		-- load all components --
		children.addAll(
				MenuBox.load(), TokenBar.load_field(), TokenBar.load_eye(), StartStopButton.load(), OpenClose.load());
	}
	
}
