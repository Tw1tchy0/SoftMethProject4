package com.example.testproject4;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TabPane;


public class MainMenuController {
    @FXML
    private ImageView donutImg, coffeeImg, sandwichImg;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab donutTab, sandwichTab, coffeeTab;

    @FXML
    void donutImgClicked(MouseEvent event) {
        System.out.println("Donut image clicked!");
        tabPane.getSelectionModel().select(donutTab);
    }

    @FXML
    void coffeeImgClicked(MouseEvent event) {
        System.out.println("Coffee image clicked!");
        tabPane.getSelectionModel().select(coffeeTab);
    }

    @FXML
    void sandwichImgClicked(MouseEvent event) {
        System.out.println("Sandwich image clicked!");
        tabPane.getSelectionModel().select(sandwichTab);
    }

}