package fr.vallfeur.dbm;

import java.util.HashMap;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class SceneController {
    private static HashMap<String, Pane> sceneMap = new HashMap<>();
    private static Scene main;

    public SceneController(Scene main) {
        SceneController.main = main;
    }

    protected void add(String name, Pane pane){
    	sceneMap.put(name, pane);
    }

    protected void remove(String name){
    	sceneMap.remove(name);
    }

    public static void activate(String name){
        main.setRoot(sceneMap.get(name));
    }
}