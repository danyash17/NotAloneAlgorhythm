package com.example.notalone.entity.question;

import com.example.notalone.enums.Extraverse;

public class ExtraverseQuestion implements Question{
    private Extraverse extraverse;

    public ExtraverseQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string){
            case "Экстраверт":
                extraverse = Extraverse.EXTRAVERT;
                break;
            case "Интроверт":
                extraverse = Extraverse.INTROVERT;
                break;
            case "Амбиверт":
                extraverse = Extraverse.AMBIVERT;
                break;
        }
    }

    public Extraverse getExtraverse() {
        return extraverse;
    }

    public void setExtraverse(Extraverse extraverse) {
        this.extraverse = extraverse;
    }

    @Override
    public String toString() {
        return "ExtraverseQuestion{" +
                "extraverse=" + extraverse +
                '}';
    }
}
