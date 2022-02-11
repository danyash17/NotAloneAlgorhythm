package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.app.logic.ProfileSelection;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MiniProfileController {
    @FXML
    public Label orderNumber;

    @FXML
    private Label points;

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

    public void setData(Form form, ProfileSelection profile_selection, int compability, int id, int orderNum) {
        this.form = form;
        this.profile_selection = profile_selection;
        points.setText(String.valueOf(compability));
        nametext.setText(form.getName());
        orderNumber.setText(String.valueOf(orderNum));
        idtext.setText(" " + form.getId());
        facultetext.setText(form.getFaculty());
        //
        String path = form.getGender().equals("Мужчина") ? "/man.png" : "/woman.png";
        Image image = new Image(getClass().getResourceAsStream(path));
        profileimage.setImage(image);
        profileimage.setPickOnBounds(true);

    }

    @FXML
    public void click(javafx.scene.input.MouseEvent mouseEvent) {
        profile_selection.onClickProfile(form);
    }
}
