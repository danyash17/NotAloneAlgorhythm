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

    public static String getStringValue(Negatives negatives) {
        switch (negatives) {
            case GORDOST:
                return " Гордость ";
            case EGOISM:
                return " Эгоизм ";
            case REVNOST:
                return " Ревность ";
            case OBIDCHIVOST:
                return " Обидчивость ";
            case ZAVIST:
                return  " Зависть ";
            case MSTITELNOST:
                return " Мстительность ";
            case ZHESTOKOST:
                return " Жестокость ";
            case GLUPOST:
                return  " Глупость ";
            case NERIASHLIVOST:
                return  " Неряшливость ";
            case LOZH:
                return " Ложь ";
            case LICEMERIE:
                return  " Лицемерие ";
            case ZHADNOST:
                return  " Жадность ";
            case LEN:
                return   " Лень ";
            case PESSIMISM:
                return  " Пессимизм ";
            case NAGLOST:
                return  " Наглость ";
            default: return "Undefined";
        }
    }
}
