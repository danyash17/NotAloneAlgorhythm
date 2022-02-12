package com.example.notalone.algo.enums;

public enum Music {
    POP,
    ROCK,
    SHANSON,
    CLASSIC,
    ELECTRO,
    TRADITIONAL,
    JAZZ,
    BLUES,
    RAP,
    LATINO,
    HIP_HOP,
    RITMNBLUES,
    AMBIENT,
    COUNTRY;

    public static String getStringValue(Music music) {
        switch (music) {
            case POP:
                return " Поп ";
            case ROCK:
                return " Рок ";
            case SHANSON:
                return " Шансон ";
            case CLASSIC:
                return " Классическая ";
            case ELECTRO:
                return " Электро ";
            case TRADITIONAL:
                return " Народная ";
            case JAZZ:
                return " Джаз ";
            case BLUES:
                return " Блюз ";
            case RAP:
                return " Рэп ";
            case LATINO:
                return " Латино ";
            case HIP_HOP:
                return " Хип-хоп ";
            case RITMNBLUES:
                return " Ритм-н-блюз ";
            case AMBIENT:
                return " Духовная ";
            case COUNTRY:
                return " Кантри ";
            default:
                return "Undefined";
        }
    }
}
