package com.example.notalone.entity.question;

import com.example.notalone.enums.Opinion;

public class SmokingQuestion implements Question{
    private Opinion opinion;

    public SmokingQuestion(String  string) {
        init(string);
    }

    private void init(String string) {
        switch (string){
            case "Негативное":
                opinion = Opinion.NEGATIVE;
                break;
            case "Нейтральное":
                opinion = Opinion.NEUTRAL;
                break;
            case "Положительное":
                opinion = Opinion.POSITIVE;
                break;
        }
    }

    public SmokingQuestion() {
    }

    public Opinion getOpinion() {
        return opinion;
    }

    public void setOpinion(Opinion opinion) {
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "SmokingQuestion{" +
                "opinion=" + opinion +
                '}';
    }
}
