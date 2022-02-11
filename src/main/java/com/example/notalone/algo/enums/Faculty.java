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
    public static String getStringValue(Faculty faculty){
        return switch (faculty) {
            case BIO -> "Биофак";
            case MILITARY -> "Военный";
            case GEO -> "Геофак";
            case JOURNALISTIC -> "Журфак";
            case HISTORICAL -> "Истфак";
            case MECHMAT -> "Мехмат";
            case FPM -> "ФПМИ";
            case RPACT -> "Раф ";
            case FSC -> "ФСК";
            case PHILOSOFIC -> "ФФСН";
            case PHYSICAL -> "Физфак";
            case PHILOLOGICAL -> "Филфак";
            case CHEMICAL -> "Химфак";
            case ECONOMIC -> "Экономфак";
            case LAW -> "Юрфак";
            case BUSINESS -> "ИБ";
            case INTERNATIONAL_RELATIONSHIPS -> "ФМО";
            case LYCEUM -> "Лицей БГУ";
            case MSEU -> "Сахарова";
            case NON_BSU -> "Не из БГУ";
        };
    }
}
