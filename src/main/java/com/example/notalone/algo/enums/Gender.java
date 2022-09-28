package com.example.notalone.algo.enums;

public enum Gender{
    MALE,
    FEMALE,
    NONBINARY,
    ANYONE;
    public static String getStringValue(Gender gender){
        switch (gender) {
            case MALE :
                return "Мужчина";
            case FEMALE :
                return "Женщина";
            case NONBINARY :
                return "Небинарн.";
            case ANYONE :
                return "Не важно";
            default: return "Undefined";
        }
    }
}
