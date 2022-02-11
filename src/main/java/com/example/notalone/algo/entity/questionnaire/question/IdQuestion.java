package com.example.notalone.algo.entity.questionnaire.question;

public class IdQuestion implements Question{
    private String id;

    public IdQuestion(String id) {
        this.id = id;
    }

    public IdQuestion() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdQuestion{" +
                "id='" + id + '\'' +
                '}';
    }
}
