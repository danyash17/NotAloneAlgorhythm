package com.example.notalone.entity.question;

import com.example.notalone.enums.Aim;

import java.util.Map;
import java.util.TreeMap;

public class AimQuestion implements Question {
    public static final Map<Aim, Integer> order = new TreeMap<>() {{
        put(Aim.FRIENDSHIP, 0);
        put(Aim.RELATIONSHIPS, 1);
        put(Aim.ANYTHING, 2);
    }};
    public static final int[][] matrix = {
            {10, 0, 10},
            {0, 10, 10},
            {10, 10, 10}
    };
    private Aim aim;


    public AimQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string) {
            case "Дружба":
                aim = Aim.FRIENDSHIP;
                break;
            case "Отношения":
                aim = Aim.RELATIONSHIPS;
                break;
            case "Оба варианта":
                aim = Aim.ANYTHING;
                break;
        }
    }

    public Aim getAim() {
        return aim;
    }

    public void setAim(Aim aim) {
        this.aim = aim;
    }


    @Override
    public String toString() {
        return "AimQuestion{" +
                "aim=" + aim +
                '}';
    }
}
