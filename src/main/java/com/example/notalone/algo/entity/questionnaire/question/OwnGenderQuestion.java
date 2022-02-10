package com.example.notalone.algo.entity.questionnaire.question;

import com.example.notalone.algo.enums.Gender;

public class OwnGenderQuestion implements Question{
    private Gender gender;

    public OwnGenderQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string){
            case "Мужчина":
                gender = Gender.MALE;
                break;
            case "Женщина":
                gender = Gender.FEMALE;
                break;
            case "Небинарный":
                gender = Gender.NONBINARY;
                break;
        }
    }

    public OwnGenderQuestion() {
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "OwnGenderQuestion{" +
                "gender=" + gender +
                '}';
    }
}
