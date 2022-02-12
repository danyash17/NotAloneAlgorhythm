package com.example.notalone.app.controller;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.algo.entity.Pair;
import com.example.notalone.algo.entity.questionnaire.Questionnaire;
import com.example.notalone.algo.enums.Aim;
import com.example.notalone.algo.factory.RelevantsFactory;
import com.example.notalone.algo.mapper.FormMapper;
import com.example.notalone.algo.mapper.QuestionnaireMapper;
import com.example.notalone.algo.parser.TxtSaver;
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
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
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
    public Button matchButton;
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
    private ProfileSelection leftProfileSelection;
    private String matchButtonInitialStyle;
    private final FormMapper formMapper = new FormMapper();

    @FXML
    void findbuttonaction(ActionEvent event) {

        List<Questionnaire> questionnaires = session.getQuestionnaires();
        for (int i = 0; i < questionnaires.size(); i++) {
            Form form = formMapper.map(questionnaires.get(i));
            if (Integer.parseInt(idtextfieid.getText()) == form.getId()) {
                this.setProfile(form, rightanchorpane);
                session.setSelectedLeftForm(form);
                break;
            }
        }
        grid.getChildren().clear();
        leftanchorpane.getChildren().clear();
    }

    public void setProfile(Form form, GridPane grid) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("fxml/Profile.fxml"));
            AnchorPane anchorPane = fxmlLoader.load();
            ProfileController imageController = fxmlLoader.getController();
            imageController.setData(form);
            grid.add(anchorPane, 1, 1);
            matchButton.setStyle(matchButtonInitialStyle + "-fx-background-image: url(broken-heart.png)");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Pair> filter(List<Pair> pairs) {
        boolean relationships = relationshipcheck.isSelected();
        boolean friendship = friendshipcheck.isSelected();
        Aim selectedAim = relationships ? friendship ? Aim.ANYTHING : Aim.RELATIONSHIPS : friendship ? Aim.FRIENDSHIP : Aim.ANYTHING;
        boolean sameSex = samesexrbutton.isSelected();
        boolean diffSex = difsexbutton.isSelected();
        boolean blindDate = blinddatebutton.isSelected();
        for (Iterator<Pair> iterator = pairs.iterator(); iterator.hasNext(); ) {
            boolean delete = false;
            Pair pair = iterator.next();
            Form current = formMapper.map(pair.getCurrent());
            Form target = formMapper.map(pair.getTarget());
            if (selectedAim != Aim.ANYTHING) {
                Aim aim = Aim.getAimValue(current.getAim());
                delete = !aim.equals(selectedAim);
            }
            if (sameSex || diffSex) {
                if (sameSex) delete = !current.getGender().equals(target.getGender());
                if (diffSex) delete = current.getGender().equals(target.getGender());
            }
            if (blindDate) delete = !current.isBlindDate();
            if (delete) iterator.remove();
        }
        return pairs;
    }

    @FXML
    public void setRelevants(ActionEvent event) {
        RelevantsFactory factory = new RelevantsFactory();
        List<Pair> pairs = factory.getRelevants(Integer.parseInt(idtextfieid.getText()) - 2, session.getQuestionnaires());
        pairs = filter(pairs);
        grid.getChildren().clear();
        try {
            for (int i = Integer.parseInt(starttext.getText()); i < pairs.size() && i < Integer.parseInt(endtext.getText()); i++) {
                Pair pair = pairs.get(i);
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("fxml/MiniProfile.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();
                MiniProfileController imageController = fxmlLoader.getController();
                imageController.setSession(session);
                Form form = formMapper.map(pair.getCurrent());
                imageController.setData(form, leftProfileSelection, pair.getRelevance(), form.getId(), i + 1);
                grid.add(anchorPane, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        leftProfileSelection = new ProfileSelection() {
            @Override
            public void onClickProfile(Form form) {
                setProfile(form, leftanchorpane);
            }
        };

        ToggleGroup checkGender = new ToggleGroup();
        samesexrbutton.setToggleGroup(checkGender);
        difsexbutton.setToggleGroup(checkGender);
        menu.setStyle("-fx-background-color: #DD371D");
        matchButtonInitialStyle = matchButton.getStyle();
        matchButton.setStyle(matchButtonInitialStyle +"-fx-background-image: url(broken-heart.png)");
    }

    public void openFile(ActionEvent actionEvent) {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Выберите Excel файл");
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Excel файл", "*.xlsx"));
        File file = null;
        session = new Session(file);
        try {
            file = chooser.showOpenDialog(new Stage());
            session.setBase(file);
            session.setTable(new XlsParser().parse(file));
            session.setQuestionnaires(new QuestionnaireMapper().map(session.getTable()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (file != null) {
            menu.setStyle("-fx-background-color: #17A226");
            findbutton.setDisable(false);
            applybutton.setDisable(false);
            matchButton.setDisable(false);
        }
    }

    public void closeFile(ActionEvent actionEvent) {
        session = null;
        menu.setStyle("-fx-background-color: #DD371D");
        findbutton.setDisable(true);
        applybutton.setDisable(true);
        matchButton.setDisable(true);
        grid.getChildren().clear();
        leftanchorpane.getChildren().clear();
        rightanchorpane.getChildren().clear();
    }

    public void quit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void doMatch(ActionEvent actionEvent) {
        TxtSaver saver = new TxtSaver();
        if (session.getSaveMatchesFile() == null && session.getBase() != null) {
            File file = new File(session.getBase().getParent() + "matches " + System.currentTimeMillis() + ".txt");
            try {
                if (!file.createNewFile()) throw new NoSuchFileException(file.toString());
                session.setSaveMatchesFile(file);
            } catch (IOException e) {
                e.printStackTrace();
                matchButton.setStyle("-fx-background-color: #ea0a0a");
            }
        }
        if (session.getSelectedRightForm() != null && session.getSelectedLeftForm() != null) {
            saver.save(session.getSaveMatchesFile(), session.getSelectedRightForm(), session.getSelectedLeftForm());
            matchButton.setStyle(matchButtonInitialStyle + "-fx-background-image: url(heart.png)");
        }
    }
}
