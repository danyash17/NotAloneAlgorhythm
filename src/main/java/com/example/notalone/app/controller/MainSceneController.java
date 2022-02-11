package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.algo.entity.Pair;
import com.example.notalone.algo.factory.RelevantsFactory;
import com.example.notalone.algo.mapper.FormMapper;
import com.example.notalone.algo.mapper.QuestionnaireMapper;
import com.example.notalone.algo.parser.XlsParser;
import com.example.notalone.app.logic.ProfileSelection;
import com.example.notalone.app.session.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
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
    public MenuItem loadPhotos;
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
    private ProfileSelection profileSelection;

    @FXML
    void findbuttonaction(ActionEvent event) {
        List<Form> forms = session.getForms();
        for (Form form : forms) {
            if (Integer.parseInt(idtextfieid.getText()) == form.getId()) {
                this.showLeftProfile(form, rightanchorpane);
            }
        }
    }

    public void showLeftProfile(Form form, GridPane gride) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("fxml/Profile.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            ProfileController imageController = fxmlLoader.getController();
            imageController.setData(form);
            gride.add(anchorPane, 1, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean filter() {
        return true;
    }// еще не готово

    @FXML
    void showRelevants(ActionEvent event) {
        RelevantsFactory factory = new RelevantsFactory();
        List<Pair> pairs = factory.getRelevants(Integer.parseInt(idtextfieid.getText()),session.getForms(),session.getQuestionnaires());
        try {
            for (int i = Integer.parseInt(starttext.getText()); i < pairs.size() && i < Integer.parseInt(endtext.getText()); i++) {
                if (filter()) {
                    Pair pair = pairs.get(i);
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("fxml/MiniProfile.fxml"));
                    AnchorPane anchorPane = fxmlLoader.load();
                    MiniProfileController imageController = fxmlLoader.getController();
                    imageController.setData(pair.getCurrent(), profileSelection, pair.getRelevance());
                    grid.add(anchorPane, 0, i);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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

    public void openFile(ActionEvent actionEvent) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Выберите Excel файл");
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Excel файл", "*.xlsx"));
        File file = chooser.showOpenDialog(new Stage());
        session = new Session(file);
        try {
            session.setTable(new XlsParser().parse(file));
            session.setQuestionnaires(new QuestionnaireMapper().map(session.getTable()));;
            session.setForms(new FormMapper().map(session.getQuestionnaires()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        menu.setStyle("-fx-background-color: #17A226");
        findbutton.setDisable(false);
        applybutton.setDisable(false);
    }

    public void closeFile(ActionEvent actionEvent) {
        session = null;
        menu.setStyle("-fx-background-color: #DD371D");
        findbutton.setDisable(true);
        applybutton.setDisable(true);
    }

    public void quit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
