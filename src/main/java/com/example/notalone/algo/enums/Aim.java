package com.example.notalone.algo.enums;

public enum Aim {
    FRIENDSHIP,
    RELATIONSHIPS,
    ANYTHING;
    public static String getViewValue(Aim aim){
        return switch (aim) {
            case FRIENDSHIP -> "Дружба";
            case RELATIONSHIPS -> "Отношения";
            case ANYTHING -> "Не важно";
        };
    }
}