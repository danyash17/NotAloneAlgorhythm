package com.example.notalone.algo.enums;

public enum Gender{
    MALE,
    FEMALE,
    NONBINARY,
    ANYONE;
    public static String getViewValue(Gender gender){
        return switch (gender) {
            case MALE -> "Мужчина";
            case FEMALE -> "Женщина";
            case NONBINARY -> "Небинарн.";
            case ANYONE -> "Не важно";
        };
    }
}
