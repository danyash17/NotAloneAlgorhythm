package com.example.notalone.algo.enums;

public enum Opinion {
    POSITIVE,
    NEGATIVE,
    NEUTRAL;

    public static String getStringValue(Opinion opinion) {
        switch (opinion) {
            case POSITIVE :
                return "Положительное";
            case NEGATIVE :
                return "Отрицательное";
            case NEUTRAL :
                return "Нейтральное";
            default: return "Undefined";
        }
    }
}
