package fr.vallfeur.dbm.components.menu;

import fr.vallfeur.dbm.resources.Colors;
import fr.vallfeur.dbm.resources.ColorsEnum;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;

public class MenuBox {

	protected static Rectangle box = new Rectangle(100, 720);
	
	public static Node load(){
		box.setFill(javafx.scene.paint.Color.valueOf(Colors.get(ColorsEnum.HEX, ColorsEnum.SEMIGRAY)));
		box.setX(895);
		
		return box;
	}
	
	public static void open(){
		box.setX(845);
	}
	
	public static void close(){
		box.setX(895);
	}
}
