package com.example.notalone.entity.question;

import com.example.notalone.enums.Extraverse;

import java.util.Map;
import java.util.TreeMap;

public class ExtraverseQuestion implements Question {
    private Extraverse extraverse;
    public static final Map<Extraverse, Integer> order = new TreeMap<>() {{
        put(Extraverse.EXTRAVERT, 0);
        put(Extraverse.INTROVERT, 1);
        put(Extraverse.AMBIVERT, 2);
    }};
    public static final int[][] matrix = {
            {10, 3, 10},
            {3, 10, 10},
            {10, 10, 10}
    };

    public ExtraverseQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string) {
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
