package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {

    @FXML
    private Label aboutmetext;

    @FXML
    private Label nameandagetext;

    @FXML
    private Label ordercommenttext;

    @FXML
    private ImageView profileimage;

    @FXML
    private Button showtheformbutton;

    private Form form;

    @FXML
    void showtheform(ActionEvent event) throws IOException {

        Stage window= new Stage();
        FormController formController =new FormController();
        formController.setData(form);
        Parent root = FXMLLoader.load(getClass().getResource("fxml/Form.fxml"));
        window.setTitle("(Не)один");
        window.setScene(new Scene(root, 300, 435));
        window.show();
        window.setResizable(false);

    }

    public void setData(Form form){
        this.form = form;
        aboutmetext.setText("Я ищу "+ form.getPurpose()+" "+ form.getAboutme());
        nameandagetext.setText(form.getName()+", "+ form.getFaculty());
        Image image =new Image(getClass().getResourceAsStream(form.getPhoto_link()));// 100,100,false,false
        profileimage.setImage(image);
        ordercommenttext.setText(form.getOrdercomment());
    }

}
