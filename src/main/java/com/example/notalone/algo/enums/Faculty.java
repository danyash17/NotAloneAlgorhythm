package com.example.notalone.algo.enums;

public enum Faculty {
    BIO,
    MILITARY,
    GEO,
    JOURNALISTIC,
    HISTORICAL,
    MECHMAT,
    FPM,
    RPACT,
    FSC,
    PHILOSOFIC,
    PHYSICAL,
    PHILOLOGICAL,
    CHEMICAL,
    ECONOMIC,
    LAW,
    BUSINESS,
    INTERNATIONAL_RELATIONSHIPS,
    LYCEUM,
    MSEU,
    NON_BSU;

    public static String getStringValue(Faculty faculty) {
        switch (faculty) {
            case BIO:
                return "Биофак";
            case MILITARY:
                return "Военный";
            case GEO:
                return "Геофак";
            case JOURNALISTIC:
                return "Журфак";
            case HISTORICAL:
                return "Истфак";
            case MECHMAT:
                return "Мехмат";
            case FPM:
                return "ФПМИ";
            case RPACT:
                return "Раф ";
            case FSC:
                return "ФСК";
            case PHILOSOFIC:
                return "ФФСН";
            case PHYSICAL:
                return "Физфак";
            case PHILOLOGICAL:
                return "Филфак";
            case CHEMICAL:
                return  "Химфак";
            case ECONOMIC:
                return "Экономфак";
            case LAW:
                return "Юрфак";
            case BUSINESS:
                return "ИБ";
            case INTERNATIONAL_RELATIONSHIPS:
                return  "ФМО";
            case LYCEUM:
                return  "Лицей БГУ";
            case MSEU:
                return  "Сахарова";
            case NON_BSU:
                return  "Не из БГУ";
            default:
                return "Undefined";
        }
    }
}
