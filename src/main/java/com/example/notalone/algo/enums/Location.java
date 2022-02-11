package com.example.notalone.algo.enums;

public enum Location {
    MINSK,
    DORMITORY;
    public static String getStringValue(Location location){
        return switch (location) {
            case MINSK -> "Минск";
            case DORMITORY -> "Общага";
        };
    }
}
