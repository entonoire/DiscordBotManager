package fr.vallfeur.dbm.components.menu;

import fr.vallfeur.dbm.resources.Colors;
import fr.vallfeur.dbm.resources.ColorsEnum;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;

public class MenuBox {

	public static int pos = 825;
	public static int size = 120;
	public static Rectangle box = new Rectangle(size, 720);
	
	
	public static Node load(){
		box.setFill(javafx.scene.paint.Color.valueOf(Colors.get(ColorsEnum.HEX, ColorsEnum.SEMIGRAY)));
		box.setX(895);
		
		return box;
	}
	
	public static void open(){
		box.setX(pos);
	}
	
	public static void close(){
		box.setX(895);
	}
}
