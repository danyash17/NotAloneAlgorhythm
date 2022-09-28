package com.example.notalone.algo.enums;

public enum Location {
    MINSK,
    DORMITORY;

    public static String getStringValue(Location location) {
        switch (location) {
            case MINSK:
                return "Минск";
            case DORMITORY:
                return "Общага";
            default:
                return "Undefined";
        }
    }
}
