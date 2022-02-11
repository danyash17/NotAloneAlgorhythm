package com.example.notalone.algo.enums;

public enum Opinion {
    POSITIVE,
    NEGATIVE,
    NEUTRAL;

    public static String getViewValue(Opinion opinion) {
        return switch (opinion) {
            case POSITIVE -> "Положительное";
            case NEGATIVE -> "Отрицательное";
            case NEUTRAL -> "Нейтральное";
        };
    }
}
