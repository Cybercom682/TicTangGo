package com.projects.tictanggo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //Hier sind die zwei verschiedenen Ansichten
        // InGameScene wird gerade nicht benutzt, kann aber in Zeile 18 getauscht werden
        var inGameScene = HelloApplication.class.getResource("inGame.fxml");
        var mainMenuScene = HelloApplication.class.getResource("mainMenu.fxml");

        FXMLLoader fxmlLoader = new FXMLLoader(mainMenuScene); // mainMenuScene kann mit InGameScene getauscht werden ;)
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("TicTangGo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}