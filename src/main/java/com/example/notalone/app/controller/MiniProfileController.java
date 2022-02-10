package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.app.logic.ProfileSelection;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MiniProfileController{

    @FXML
    private Label compatibilitytext;

    @FXML
    private Label facultetext;

    @FXML
    private Label idtext;

    @FXML
    private Label nametext;

    @FXML
    private ImageView profileimage;

    private ProfileSelection profile_selection;

    private Form form;

    public void setData(Form form, ProfileSelection profile_selection){
        this.form = form;
        this.profile_selection=profile_selection;
        compatibilitytext.setText(" "+ form.getCompatibility());
        nametext.setText(form.getName());
        idtext.setText(" "+ form.getID());
        facultetext.setText(form.getFaculty());
        Image image =new Image(getClass().getResourceAsStream(form.getPhoto_link()));// 100,100,false,false
        profileimage.setImage(image);

    }

    @FXML
    public void click(javafx.scene.input.MouseEvent mouseEvent) {
        profile_selection.onClickProfile(form);
    }
}
