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
			case BLUEVIOLET:
				return "#7289DA";
			case DARKGRAY:
				return "#19272A";
			case GRAYVIOLET:
				return "#99AAB5";
			case SEMIGRAY:
				return "#2F3136";
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
			case BLUEVIOLET:
				return "114,137,218";
			case DARKGRAY:
				return "35,39,42";
			case GRAYVIOLET:
				return "153,170,181";
			case SEMIGRAY:
				return "47,49,54";
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
			case BLUEVIOLET:
				return "blueviolet";
			case DARKGRAY:
				return "darkgray";
			case GRAYVIOLET:
				return "grayviolet";
			case SEMIGRAY:
				return "semigray";
			default:
				//return an error color code
				return "error";
			}
		}
		
		return null;
	}
	
}
