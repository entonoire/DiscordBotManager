package fr.vallfeur.dbm.resources;

public class Colors {
	
	
	public static String get(ColorsEnum type, ColorsEnum color){
		
		if(type == ColorsEnum.HEX){
			switch (color) {
			case BLACK:
				return "#000000";
			case WHITE:
				return "#FFFFFF";
			case RED:
				return "#ED4245";
			case FUCHSIA:
				return "#EB459E";
			case YELLOW:
				return "#FEE75C";
			case GREEN:
				return "#57F287";
			case BLURPLE:
				return "#5865F2";
			case GRAY:
				return "#2C2F33";
			default:
				//return an error color code
				return "#cc0000";
			}
		}
		if(type == ColorsEnum.RGB){
			switch (color) {
			case BLACK:
				return "0,0,0";
			case WHITE:
				return "255,255,255";
			case RED:
				return "237,66,69";
			case FUCHSIA:
				return "235,69,158";
			case YELLOW:
				return "254,231,92";
			case GREEN:
				return "87,242,135";
			case BLURPLE:
				return "88,101,242";
			case GRAY:
				return "44,47,51";
			default:
				//return an error color code
				return "204,0,0";
			}
		}
		if(type == ColorsEnum.STRING){
			switch (color) {
			case BLACK:
				return "black";
			case WHITE:
				return "white";
			case RED:
				return "red";
			case FUCHSIA:
				return "fuchsia";
			case YELLOW:
				return "yellow";
			case GREEN:
				return "green";
			case BLURPLE:
				return "blurple";
			case GRAY:
				return "gray";
			default:
				//return an error color code
				return "error";
			}
		}
		
		return null;
	}
	
}
