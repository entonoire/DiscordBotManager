package fr.vallfeur.dbm.resources;

public class Resources {

	public static String get(String name){
		Class<Resources> res = Resources.class;
		String value = null;
		
		switch (name) {
		case "tbar":
			value = res.getResource("tokenbar.css").toString();
			break;
		case "eye":
			value = res.getResource("eye2.png").toString();
			break;
		default:
			break;
		}
		return value;
	}
	
}
