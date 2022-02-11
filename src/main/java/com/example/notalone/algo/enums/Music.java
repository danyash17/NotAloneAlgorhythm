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
    public static String getViewValue(Music music){
        return switch (music) {
            case POP -> " Поп ";
            case ROCK -> " Рок ";
            case SHANSON -> " Шансон ";
            case CLASSIC -> " Классическая ";
            case ELECTRO -> " Электро ";
            case TRADITIONAL -> " Народная ";
            case JAZZ -> " Джаз ";
            case BLUES -> " Блюз ";
            case RAP -> " Рэп ";
            case LATINO -> " Латино ";
            case HIP_HOP -> " Хип-хоп ";
            case RITMNBLUES -> " Ритм-н-блюз ";
            case AMBIENT -> " Духовная ";
            case COUNTRY -> " Кантри ";
        };
    }
}
