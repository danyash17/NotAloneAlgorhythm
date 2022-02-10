package com.example.notalone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


    public class AppView extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("app/controller/fxml/Mainscene.fxml"));
            primaryStage.setTitle(" (NOT)ALONE SmartMatcher 1.2");
            primaryStage.setScene(new Scene(root, 890, 660));
            primaryStage.setResizable(false);
            primaryStage.show();
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/give-love.png")));
        }


        public static void main(String[] args) {
            launch(args);
        }
    }

