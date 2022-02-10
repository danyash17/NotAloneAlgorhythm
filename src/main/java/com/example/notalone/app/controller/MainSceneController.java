package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.app.logic.ProfileSelection;
import com.example.notalone.app.session.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainSceneController implements Initializable {

    @FXML
    public Menu menu;
    @FXML
    public MenuItem openMenuButton;
    @FXML
    public MenuItem closeMenuButton;
    @FXML
    public MenuItem quitMenuButton;
    @FXML
    private GridPane leftanchorpane;
    @FXML
    private GridPane rightanchorpane;
    @FXML
    private Button applybutton;
    @FXML
    private RadioButton blinddatebutton;
    @FXML
    private RadioButton difsexbutton;
    @FXML
    private Button findbutton;
    @FXML
    private TextField idtextfieid;
    @FXML
    private RadioButton incompatiblegoalsrbutton;
    @FXML
    private AnchorPane profilescrollpane;
    @FXML
    private RadioButton samesexrbutton;
    @FXML
    private TextField starttext;
    @FXML
    private TextField endtext;
    @FXML
    private GridPane grid;
    @FXML
    private CheckBox relationshipcheck;
    @FXML
    private CheckBox friendshipcheck;
    private Session session;

    private List<Form> forms = new ArrayList<>();
    private ProfileSelection profileSelection;

    @FXML
    void findbuttonaction(ActionEvent event) {
        for (int i = 0; i < forms.size(); i++) {
            if (Integer.parseInt(idtextfieid.getText()) == (forms.get(i)).getID()) {
                this.showLeftProfile(forms.get(i), rightanchorpane);
            }
        }
    }

    public List<Form> getData() {
        List<Form> vForms = new ArrayList<>();
        return forms;
    } // тут заполняется вся фигня, которая нам нужна для отображения анкет

    public void showLeftProfile(Form forms, GridPane gride) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("fxml/Profile.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            ProfileController imageController = fxmlLoader.getController();
            imageController.setData(forms);
            gride.add(anchorPane, 1, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean filter() {
        return true;
    }// еще не готово

    @FXML
    void showRightProfile(ActionEvent event) {
        try {
            for (int i = Integer.parseInt(starttext.getText()); i < forms.size() && i < Integer.parseInt(endtext.getText()); i++) {
                if (filter()) {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("fxml/MiniProfile.fxml"));
                    AnchorPane anchorPane = fxmlLoader.load();
                    MiniProfileController imageController = fxmlLoader.getController();
                    imageController.setData(forms.get(i), profileSelection);
                    grid.add(anchorPane, 0, i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        forms.addAll(getData());
        profileSelection = new ProfileSelection() {
            @Override
            public void onClickProfile(Form form) {
                showLeftProfile(form, leftanchorpane);
            }
        };

        ToggleGroup checkGender = new ToggleGroup();
        samesexrbutton.setToggleGroup(checkGender);
        difsexbutton.setToggleGroup(checkGender);
        menu.setStyle("-fx-background-color: #DD371D");
    }

    public void chooseFile(ActionEvent actionEvent) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Выберите Excel файл");
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Excel файл", "*.xlsx"));
        File file = chooser.showOpenDialog(new Stage());
        session = new Session(file);
        menu.setStyle("-fx-background-color: #17A226");
        findbutton.setDisable(false);
        applybutton.setDisable(false);
    }

    public void closeFile(ActionEvent actionEvent) {
        session.setFile(null);
        menu.setStyle("-fx-background-color: #DD371D");
        findbutton.setDisable(true);
        applybutton.setDisable(true);
    }

    public void quit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
