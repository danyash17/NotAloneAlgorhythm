package com.example.notalone.algo.entity.questionnaire.question;

public class HeightQuestion implements Question{
    private String height;

    public HeightQuestion(String height) {
        this.height = height;
    }

    public HeightQuestion() {
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "HeightQuestion{" +
                "height='" + height + '\'' +
                '}';
    }
}
