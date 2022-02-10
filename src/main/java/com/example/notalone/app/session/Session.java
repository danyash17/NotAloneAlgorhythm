package com.example.notalone.app.session;

import com.example.notalone.algo.entity.questionnaire.Questionnaire;

import java.io.File;
import java.util.List;

public class Session {
    private File file;
    private List<List<String>> table;
    private List<Questionnaire> questionnaires;

    public Session(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<List<String>> getTable() {
        return table;
    }

    public void setTable(List<List<String>> table) {
        this.table = table;
    }

    public List<Questionnaire> getForms() {
        return questionnaires;
    }

    public void setForms(List<Questionnaire> questionnaires) {
        this.questionnaires = questionnaires;
    }

    @Override
    public String toString() {
        return "Session{" +
                "file=" + file +
                ", table=" + table +
                ", questionnaires=" + questionnaires +
                '}';
    }
}
