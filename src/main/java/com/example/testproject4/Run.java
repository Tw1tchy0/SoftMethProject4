package com.example.testproject4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.io.IOException;

/**
 The class used to start / create GUI.
 @author Aviv Bitton
 @author Helen Ma
 */
public class Run extends Application {

    /**
     * Method to start the GUI
     */
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = (Parent)FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
            Scene scene = new Scene(root, 500, 500);
            stage.setScene(scene);
            stage.setTitle("Cafe");
            stage.show();
            stage.show();
            stage.setMinWidth(500);
            stage.setMinHeight(500);
            stage.setMaxWidth(500);
            stage.setMaxHeight(500);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to launch the GUI
     */
    public static void main(String[] args) {
        launch(args);
    }
}
