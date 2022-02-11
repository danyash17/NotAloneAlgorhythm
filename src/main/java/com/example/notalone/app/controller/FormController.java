package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {
    @FXML
    public Label nameText;
    @FXML
    public Label aboutMeText;
    @FXML
    public Label commentText;
    @FXML
    public ImageView imageView;
    @FXML
    public Label ownGenderText;
    @FXML
    public Label ownNegativesText;
    @FXML
    public Label ownPositivesText;
    @FXML
    public Label musicText;
    @FXML
    public Label partnerNegativesText;
    @FXML
    public Label locationText;
    @FXML
    public Label facultyText;
    @FXML
    public Label zodiacText;
    @FXML
    public Label heightText;
    @FXML
    public Label extraverseText;
    @FXML
    public Label blindDateText;
    @FXML
    public Label mailText;
    @FXML
    public Label partnerGenderText;
    @FXML
    public Label aimText;
    @FXML
    public Label hobbyText;

    public void setData(Form form) {
        nameText.setText(form.getName());
        aboutMeText.setText(form.getMessage());
        commentText.setText(form.getComment());
        //
        String path = form.getGender().equals("Мужчина") ? "/man.png" : "/woman.png";
        Image image = new Image(getClass().getResourceAsStream(path));
        imageView.setImage(image);
        imageView.setPickOnBounds(true);
        imageView.setOnMouseClicked(e -> {
            openLink(form.getPhotoReference());
        });
        //
        ownGenderText.setText(form.getGender());
        ownNegativesText.setText(form.getOwnNegatives());
        ownPositivesText.setText(form.getOwnPositives());
        musicText.setText(form.getMusic());
        partnerNegativesText.setText(form.getPartnerNegatives());
        locationText.setText(form.getLocation());
        facultyText.setText(form.getFaculty());
        zodiacText.setText(form.getZodiac());
        heightText.setText(form.getHeight());
        extraverseText.setText(form.getExtraverse());
        blindDateText.setText(String.valueOf(form.isBlindDate()));
        mailText.setText(form.getEmail());
        partnerGenderText.setText(form.getPartnerGender());
        aimText.setText(form.getAim());
        hobbyText.setText(form.getHobbies());
    }

    public void openLink(String uri) {
        try {
            Desktop.getDesktop().browse(new URI(uri));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
