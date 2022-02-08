package com.example.notalone.entity.question;

import com.example.notalone.enums.Gender;

public class PartnerGenderQuestion implements Question{
    private Gender gender;

    public PartnerGenderQuestion(String string) {
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
