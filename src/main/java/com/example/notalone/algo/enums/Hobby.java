package com.example.notalone.algo.enums;

public enum Hobby {
    TOURISM,
    FISHING,
    DANCE,
    THEATRE,
    COLLECT,
    GARDENING,
    COMPUTER_GAMES,
    SPORT,
    PAINTING,
    COOKING,
    CRAFTS,
    CHESS,
    TABLE_GAMES,
    PROGRAMMING,
    SINGING,
    MUSIC_INSTRUMENTS,
    TATOO;

    public static String getStringValue(Hobby hobby) {
        switch (hobby) {
            case TOURISM:
                return " Туризм ";
            case FISHING:
                return " Рыбалка ";
            case DANCE:
                return " Танцы ";
            case THEATRE:
                return " Театр ";
            case COLLECT:
                return " Коллекционирование ";
            case GARDENING:
                return " Садоводство ";
            case COMPUTER_GAMES:
                return " Компьютерные игры ";
            case SPORT:
                return " Спорт ";
            case PAINTING:
                return  " Рисование ";
            case COOKING:
                return " Кулинария ";
            case CRAFTS:
                return " Рукоделие ";
            case CHESS:
                return " Шахматы ";
            case TABLE_GAMES:
                return " Настольные игры ";
            case PROGRAMMING:
                return " Программирование ";
            case SINGING:
                return " Пение ";
            case MUSIC_INSTRUMENTS:
                return " Музыкальные иструменты ";
            case TATOO:
                return  " Тату ";
            default: return "Undefined";
        }
    }
}
