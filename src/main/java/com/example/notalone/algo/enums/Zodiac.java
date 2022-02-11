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
    public static String getViewValue(Zodiac zodiac) {
        return switch (zodiac) {
            case OVEN -> "Овен";
            case TELEC -> "Телец";
            case BLIZNETS -> "Близнец";
            case RAK -> "Рак";
            case LEV -> "Лев";
            case DEVA -> "Дева";
            case VESY -> "Весы";
            case SCORPION -> "Скорпион";
            case ZMEENOSEC -> "Змееносец";
            case STRELEC -> "Стрелец";
            case KOZEROG -> "Козерог";
            case VODOLEY -> "Водолей";
            case RYBY -> "Рыбы";
        };
    }
}
