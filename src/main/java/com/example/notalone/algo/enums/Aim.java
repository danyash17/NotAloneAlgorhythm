package com.example.notalone.algo.enums;

public enum Aim {
    FRIENDSHIP,
    RELATIONSHIPS,
    ANYTHING;
    public static String getStringValue(Aim aim){
        return switch (aim) {
            case FRIENDSHIP -> "Дружба";
            case RELATIONSHIPS -> "Отношения";
            case ANYTHING -> "Не важно";
        };
    }
    public static Aim getAimValue(String string){
        return switch (string) {
            case "Дружба" -> FRIENDSHIP;
            case "Отношения" -> RELATIONSHIPS;
            default -> ANYTHING;
        };
    }
}