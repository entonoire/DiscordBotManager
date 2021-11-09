package fr.vallfeur.dbm.resources;

public class Resources {

	public static void get(String name){
		Class<Resources> res = Resources.class;
		
		switch (name) {
		case "tbar":
			res.getResource("tokenbar.css");
			break;

		default:
			break;
		}
	}
	
}
