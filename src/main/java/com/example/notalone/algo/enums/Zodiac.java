package com.example.notalone.algo.enums;

public enum Zodiac {
    OVEN,
    TELEC,
    BLIZNETS,
    RAK,
    LEV,
    DEVA,
    VESY,
    SCORPION,
    ZMEENOSEC,
    STRELEC,
    KOZEROG,
    VODOLEY,
    RYBY;

    public static String getStringValue(Zodiac zodiac) {
        switch (zodiac) {
            case OVEN:
                return "Овен";
            case TELEC:
                return "Телец";
            case BLIZNETS:
                return"Близнец";
            case RAK:
                return "Рак";
            case LEV:
                return "Лев";
            case DEVA:
                return "Дева";
            case VESY:
                return "Весы";
            case SCORPION:
                return "Скорпион";
            case ZMEENOSEC:
                return "Змееносец";
            case STRELEC:
                return "Стрелец";
            case KOZEROG:
                return "Козерог";
            case VODOLEY:
                return "Водолей";
            case RYBY:
                return "Рыбы";
            default: return "Undefined";
        }
    }
}
