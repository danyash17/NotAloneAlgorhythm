package com.example.notalone.algo.enums;

public enum Negatives {
    GORDOST,
    EGOISM,
    REVNOST,
    OBIDCHIVOST,
    ZAVIST,
    MSTITELNOST,
    ZHESTOKOST,
    GLUPOST,
    NERIASHLIVOST,
    LOZH,
    LICEMERIE,
    ZHADNOST,
    LEN,
    PESSIMISM,
    NAGLOST;
    public static String getStringValue(Negatives negatives){
        return switch (negatives) {
            case GORDOST -> " Гордость ";
            case EGOISM -> " Эгоизм ";
            case REVNOST -> " Ревность ";
            case OBIDCHIVOST -> " Обидчивость ";
            case ZAVIST -> " Зависть ";
            case MSTITELNOST -> " Мстительность ";
            case ZHESTOKOST -> " Жестокость ";
            case GLUPOST -> " Глупость ";
            case NERIASHLIVOST -> " Неряшливость ";
            case LOZH -> " Ложь ";
            case LICEMERIE -> " Лицемерие ";
            case ZHADNOST -> " Жадность ";
            case LEN -> " Лень ";
            case PESSIMISM -> " Пессимизм ";
            case NAGLOST -> " Наглость ";
        };
    }
}
