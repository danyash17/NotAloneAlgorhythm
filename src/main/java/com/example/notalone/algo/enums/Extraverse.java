package com.example.notalone.algo.enums;

public enum Extraverse {
    EXTRAVERT,
    INTROVERT,
    AMBIVERT;

    public static String getStringValue(Extraverse extraverse) {
        switch (extraverse) {
            case EXTRAVERT:
                return "Экстраверт";
            case INTROVERT:
                return "Интроверт";
            case AMBIVERT:
                return "Амбиверт";
            default:
                return "Undefined";
        }
    }
}
