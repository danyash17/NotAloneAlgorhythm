package com.example.notalone.algo.enums;

public enum Aim {
    FRIENDSHIP,
    RELATIONSHIPS,
    ANYTHING;

    public static String getStringValue(Aim aim) {
        switch (aim) {
            case FRIENDSHIP:
                return "Дружба";
            case RELATIONSHIPS:
                return "Отношения";
            case ANYTHING:
                return "Не важно";
            default:
                return "Undefined";
        }
    }

    public static Aim getAimValue(String string) {
        switch (string) {
            case "Дружба":
                return FRIENDSHIP;
            case "Отношения":
                return RELATIONSHIPS;
            default:
                return ANYTHING;
        }
    }
}