package com.example.notalone.entity.question;

import com.example.notalone.enums.Opinion;

import java.util.Map;
import java.util.TreeMap;

public class SmokingQuestion implements Question {
    private Opinion opinion;
    public static final Map<Opinion, Integer> order = new TreeMap<>() {{
        put(Opinion.POSITIVE, 0);
        put(Opinion.NEGATIVE, 1);
        put(Opinion.NEUTRAL, 2);
    }};
    public static final int[][] matrix = {
            {10, 0, 10},
            {0, 10, 10},
            {10, 10, 10}
    };

    public SmokingQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string) {
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
