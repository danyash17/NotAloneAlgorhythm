package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private Label textform;

    public void setData(Form form){
        textform.setText(form.getName());// тут на самом деле должен быть текст всей анкеты , но пока только имя
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //setData();
    }
}
