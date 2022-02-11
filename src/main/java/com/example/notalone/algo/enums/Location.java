package com.example.notalone.algo.enums;

public enum Location {
    MINSK,
    DORMITORY;
    public static String getViewValue(Location location){
        return switch (location) {
            case MINSK -> "Минск";
            case DORMITORY -> "Общага";
        };
    }
}
