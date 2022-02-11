package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.awt.Desktop;


import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ProfileController {
    @FXML
    public ImageView imageView;

    @FXML
    private Label aboutmetext;

    @FXML
    private Label nameandagetext;

    @FXML
    private Label ordercommenttext;

    @FXML
    private Button showtheformbutton;

    private Form form;

    @FXML
    void showtheform(ActionEvent event) throws IOException {

        Stage window = new Stage();
        FormController formController = new FormController();
        formController.setData(form);
        Parent root = FXMLLoader.load(getClass().getResource("fxml/Form.fxml"));
        window.setTitle("(Не)один");
        window.setScene(new Scene(root, 300, 435));
        window.show();
        window.setResizable(false);

    }

    public void setData(Form form) {
        this.form = form;
        aboutmetext.setText("Цель: [" + form.getAim() + "] \n" + form.getMessage());
        nameandagetext.setText(form.getName() + ", " + form.getFaculty());
        String path = form.getGender().equals("Мужчина")? "/man.png" : "/woman.png";
        Image image =new Image(getClass().getResourceAsStream(path));
        imageView.setImage(image);
        imageView.setPickOnBounds(true);
        imageView.setOnMouseClicked(e -> {
            openLink(form.getPhotoReference());
        });
        ordercommenttext.setText(form.getComment());
    }

    public void openLink(String uri) {
        try {
            Desktop.getDesktop().browse(new URI(uri));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
