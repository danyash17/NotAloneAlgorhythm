package com.example.notalone.app.session;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.algo.entity.questionnaire.Questionnaire;

import java.io.File;
import java.util.List;

public class Session {
    private File base;
    private File saveMatchesFile;
    private List<List<String>> table;
    private List<Questionnaire> questionnaires;
    private Form selectedLeftForm;
    private Form selectedRightForm;

    public Session(File base) {
        this.base = base;
    }

    public File getBase() {
        return base;
    }

    public void setBase(File base) {
        this.base = base;
    }

    public List<List<String>> getTable() {
        return table;
    }

    public void setTable(List<List<String>> table) {
        this.table = table;
    }

    public List<Questionnaire> getQuestionnaires() {
        return questionnaires;
    }

    public void setQuestionnaires(List<Questionnaire> questionnaires) {
        this.questionnaires = questionnaires;
    }

    public Form getSelectedLeftForm() {
        return selectedLeftForm;
    }

    public void setSelectedLeftForm(Form selectedLeftForm) {
        this.selectedLeftForm = selectedLeftForm;
    }

    public Form getSelectedRightForm() {
        return selectedRightForm;
    }

    public void setSelectedRightForm(Form selectedRightForm) {
        this.selectedRightForm = selectedRightForm;
    }

    public File getSaveMatchesFile() {
        return saveMatchesFile;
    }

    public void setSaveMatchesFile(File saveMatchesFile) {
        this.saveMatchesFile = saveMatchesFile;
    }
}
