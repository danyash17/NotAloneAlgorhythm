package com.example.notalone.algo.entity.questionnaire.question;

import com.example.notalone.algo.enums.Negatives;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OwnNegativesQuestion implements Question {
    private List<Negatives> negatives;
    public static final Map<Negatives, Integer> order = new TreeMap<>() {{
        put(Negatives.GORDOST, 0);
        put(Negatives.EGOISM, 1);
        put(Negatives.REVNOST, 2);
        put(Negatives.OBIDCHIVOST, 3);
        put(Negatives.ZAVIST, 4);
        put(Negatives.MSTITELNOST, 5);
        put(Negatives.ZHESTOKOST, 6);
        put(Negatives.GLUPOST, 7);
        put(Negatives.NERIASHLIVOST, 8);
        put(Negatives.LOZH, 9);
        put(Negatives.LICEMERIE, 10);
        put(Negatives.ZHADNOST, 11);
        put(Negatives.LEN, 12);
        put(Negatives.PESSIMISM, 13);
        put(Negatives.NAGLOST, 14);
    }};
    public static final int[][] matrix = {
            {0, 5, 1, 0, 6, 5, 5, 5, 5, 6, 0, 5, 8, 5, 0},
            {5, 0, 2, 0, 3, 0, 0, 5, 5, 5, 0, 5, 0, 1, 0},
            {1, 2, 6, 0, 5, 0, 5, 5, 5, 0, 0, 5, 5, 5, 5},
            {0, 0, 0, 0, 5, 0, 0, 5, 5, 3, 3, 5, 0, 5, 3},
            {6, 3, 5, 5, 0, 0, 0, 4, 1, 0, 0, 0, 5, 5, 8},
            {5, 0, 0, 0, 0, 0, 2, 8, 5, 3, 2, 5, 0, 3, 4},
            {5, 0, 5, 0, 0, 2, 0, 4, 3, 6, 4, 4, 0, 7, 4},
            {5, 5, 5, 5, 4, 8, 4, 10, 9, 7, 8, 3, 7, 5, 8},
            {5, 5, 5, 5, 1, 5, 3, 9, 10, 5, 5, 6, 9, 5, 7},
            {6, 5, 0, 3, 0, 3, 6, 7, 5, 5, 6, 5, 5, 7, 1},
            {0, 0, 0, 3, 0, 2, 4, 8, 5, 6, 5, 5, 5, 5, 0},
            {5, 5, 5, 5, 0, 5, 4, 3, 6, 5, 5, 0, 5, 7, 2},
            {8, 0, 5, 0, 5, 0, 0, 7, 9, 5, 5, 5, 10, 1, 0},
            {5, 1, 5, 5, 5, 3, 7, 5, 5, 7, 5, 7, 1, 9, 1},
            {0, 0, 5, 3, 8, 4, 4, 8, 7, 1, 0, 2, 0, 1, 8},
    };

    public OwnNegativesQuestion(String string) {
        negatives = new ArrayList<>();
        init(string);
    }

    private void init(String string) {
        List<String> list = List.of(string.split(","));
        for (String current : list) {
            current = current.trim();
            switch (current) {
                case "Гордость":
                    negatives.add(Negatives.GORDOST);
                    break;
                case "Эгоизм":
                    negatives.add(Negatives.EGOISM);
                    break;
                case "Ревность":
                    negatives.add(Negatives.REVNOST);
                    break;
                case "Обидчивость":
                    negatives.add(Negatives.OBIDCHIVOST);
                    break;
                case "Зависть":
                    negatives.add(Negatives.ZAVIST);
                    break;
                case "Мстительность":
                    negatives.add(Negatives.MSTITELNOST);
                    break;
                case "Жестокость":
                    negatives.add(Negatives.ZHESTOKOST);
                    break;
                case "Глупость":
                    negatives.add(Negatives.GLUPOST);
                    break;
                case "Неряшливость":
                    negatives.add(Negatives.NERIASHLIVOST);
                    break;
                case "Ложь":
                    negatives.add(Negatives.LOZH);
                    break;
                case "Лицемерие":
                    negatives.add(Negatives.LICEMERIE);
                    break;
                case "Жадность":
                    negatives.add(Negatives.ZHADNOST);
                    break;
                case "Лень":
                    negatives.add(Negatives.LEN);
                    break;
                case "Пессимизм":
                    negatives.add(Negatives.PESSIMISM);
                    break;
                case "Наглость":
                    negatives.add(Negatives.NAGLOST);
                    break;
            }
        }
    }

    public OwnNegativesQuestion() {
    }

    public List<Negatives> getNegatives() {
        return negatives;
    }

    public void setNegatives(List<Negatives> negatives) {
        this.negatives = negatives;
    }

    @Override
    public String toString() {
        return "OwnNegativesQuestion{" +
                "negatives=" + negatives +
                '}';
    }
}
