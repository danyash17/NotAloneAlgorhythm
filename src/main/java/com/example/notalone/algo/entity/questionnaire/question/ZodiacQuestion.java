package com.example.notalone.algo.entity.questionnaire.question;

import com.example.notalone.algo.enums.Zodiac;

import java.util.Map;
import java.util.TreeMap;

public class ZodiacQuestion implements Question {
    private Zodiac zodiac;

    public ZodiacQuestion(String string) {
        init(string);
    }

    public static final Map<Zodiac, Integer> order = new TreeMap<>() {{
        put(Zodiac.OVEN, 0);
        put(Zodiac.TELEC, 1);
        put(Zodiac.BLIZNETS, 2);
        put(Zodiac.RAK, 3);
        put(Zodiac.LEV, 4);
        put(Zodiac.DEVA, 5);
        put(Zodiac.VESY, 6);
        put(Zodiac.SCORPION, 7);
        put(Zodiac.ZMEENOSEC, 8);
        put(Zodiac.STRELEC, 9);
        put(Zodiac.KOZEROG, 10);
        put(Zodiac.VODOLEY, 11);
        put(Zodiac.RYBY, 12);
    }};
    public static final int[][] matrix = {
            {5, 4, 8, 6, 8, 4, 9, 6, 0, 7, 0, 10, 5},
            {4, 5, 2, 7, 6, 9, 4, 8, 0, 6, 9, 3, 10},
            {8, 2, 5, 6, 8, 7, 8, 4, 0, 9, 5, 9, 9},
            {6, 7, 6, 5, 7, 10, 6, 4, 5, 3, 2, 8, 7},
            {8, 6, 8, 7, 5, 6, 9, 8, 5, 8, 7, 9, 4},
            {4, 9, 7, 10, 6, 5, 4, 7, 0, 6, 9, 8, 2},
            {9, 4, 8, 6, 9, 4, 5, 2, 0, 7, 5, 8, 10},
            {6, 8, 4, 4, 8, 7, 2, 5, 5, 8, 10, 4, 7},
            {0, 0, 0, 5, 5, 0, 0, 5, 5, 0, 0, 4, 8},
            {7, 6, 9, 3, 8, 6, 7, 8, 4, 5, 7, 9, 6},
            {0, 9, 5, 2, 7, 9, 5, 10, 10, 7, 5, 2, 10},
            {10, 3, 9, 8, 9, 8, 8, 4, 4, 9, 2, 5, 6},
            {5, 10, 9, 7, 4, 2, 10, 7, 8, 6, 10, 6, 5},
    };

    private void init(String string) {
        switch (string) {
            case "Овен":
                zodiac = Zodiac.OVEN;
                break;
            case "Телец":
                zodiac = Zodiac.TELEC;
                break;
            case "Близнецы":
                zodiac = Zodiac.BLIZNETS;
                break;
            case "Рак":
                zodiac = Zodiac.RAK;
                break;
            case "Лев":
                zodiac = Zodiac.LEV;
                break;
            case "Дева":
                zodiac = Zodiac.DEVA;
                break;
            case "Весы":
                zodiac = Zodiac.VESY;
                break;
            case "Скорпион":
                zodiac = Zodiac.SCORPION;
                break;
            case "Змееносец":
                zodiac = Zodiac.ZMEENOSEC;
                break;
            case "Стрелец":
                zodiac = Zodiac.STRELEC;
                break;
            case "Козерог":
                zodiac = Zodiac.KOZEROG;
                break;
            case "Водолей":
                zodiac = Zodiac.VODOLEY;
                break;
            case "Рыбы":
                zodiac = Zodiac.RYBY;
                break;
        }
    }

    public ZodiacQuestion() {
    }

    public Zodiac getZodiac() {
        return zodiac;
    }

    public void setZodiac(Zodiac zodiac) {
        this.zodiac = zodiac;
    }

    @Override
    public String toString() {
        return "ZodiacQuestion{" +
                "zodiac=" + zodiac +
                '}';
    }
}
