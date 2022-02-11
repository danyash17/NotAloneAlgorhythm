package com.example.notalone.algo.enums;

public enum Extraverse {
    EXTRAVERT,
    INTROVERT,
    AMBIVERT;
    public static String getViewValue(Extraverse extraverse){
        return switch (extraverse) {
            case EXTRAVERT -> "Экстраверт";
            case INTROVERT -> "Интроверт";
            case AMBIVERT -> "Амбиверт";
        };
    }
}
