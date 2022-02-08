package com.example.notalone.entity.question;

import com.example.notalone.enums.Negatives;

import java.util.ArrayList;
import java.util.List;

public class PartnerNegativesQuestion implements Question{
    private List<Negatives> negatives;

    public PartnerNegativesQuestion(String string) {
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

    public PartnerNegativesQuestion() {
    }

    public List<Negatives> getNegatives() {
        return negatives;
    }

    public void setNegatives(List<Negatives> negatives) {
        this.negatives = negatives;
    }

    @Override
    public String toString() {
        return "PartnerNegativesQuestion{" +
                "negatives=" + negatives +
                '}';
    }
}
