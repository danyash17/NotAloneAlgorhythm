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
    public static String getStringValue(Hobby hobby){
        return switch (hobby) {
            case TOURISM -> " Туризм ";
            case FISHING -> " Рыбалка ";
            case DANCE -> " Танцы ";
            case THEATRE -> " Театр ";
            case COLLECT -> " Коллекционирование ";
            case GARDENING -> " Садоводство ";
            case COMPUTER_GAMES -> " Компьютерные игры ";
            case SPORT -> " Спорт ";
            case PAINTING -> " Рисование ";
            case COOKING -> " Кулинария ";
            case CRAFTS -> " Рукоделие ";
            case CHESS -> " Шахматы ";
            case TABLE_GAMES -> " Настольные игры ";
            case PROGRAMMING -> " Программирование ";
            case SINGING -> " Пение ";
            case MUSIC_INSTRUMENTS -> " Музыкальные иструменты ";
            case TATOO -> " Тату ";
        };
    }
}
