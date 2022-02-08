package com.example.notalone.entity.question;

import com.example.notalone.enums.Zodiac;

public class ZodiacQuestion implements Question{
    private Zodiac zodiac;

    public ZodiacQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string){
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
