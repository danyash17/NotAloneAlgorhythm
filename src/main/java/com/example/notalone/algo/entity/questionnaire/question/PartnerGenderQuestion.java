package com.example.notalone.algo.entity.questionnaire.question;

import com.example.notalone.algo.enums.Gender;

import java.util.Map;
import java.util.TreeMap;

public class PartnerGenderQuestion implements Question {
    private Gender gender;
    public static final Map<Gender, Integer> order = new TreeMap<>() {{
        put(Gender.MALE, 0);
        put(Gender.FEMALE, 1);
        put(Gender.NONBINARY, 2);
        put(Gender.ANYONE, 3);
    }};
    public static final int[][] matrix = {
            {10, 0, 0, 10},
            {0, 10, 0, 10},
            {0, 0, 10, 10},
            {10, 10, 10, 10},
    };

    public PartnerGenderQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string) {
            case "Мужчина":
                gender = Gender.MALE;
                break;
            case "Женщина":
                gender = Gender.FEMALE;
                break;
            case "Небинарный":
                gender = Gender.NONBINARY;
                break;
            case "Без разницы":
                gender = Gender.ANYONE;
                break;
        }
    }

    public PartnerGenderQuestion() {
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "PartnerGenderQuestion{" +
                "gender=" + gender +
                '}';
    }
}
