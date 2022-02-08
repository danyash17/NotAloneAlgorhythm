package com.example.notalone.entity.question;

import com.example.notalone.enums.Hobby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HobbyQuestion implements Question {
    private List<Hobby> hobby;

    public HobbyQuestion(String string) {
        hobby = new ArrayList<>();
        init(string);
    }

    public static final Map<Hobby, Integer> order = new TreeMap<>() {{
        put(Hobby.TOURISM, 0);
        put(Hobby.FISHING, 1);
        put(Hobby.DANCE, 2);
        put(Hobby.THEATRE, 3);
        put(Hobby.COLLECT, 4);
        put(Hobby.GARDENING, 5);
        put(Hobby.COMPUTER_GAMES, 6);
        put(Hobby.SPORT, 7);
        put(Hobby.PAINTING, 8);
        put(Hobby.COOKING, 9);
        put(Hobby.CRAFTS, 10);
        put(Hobby.CHESS, 11);
        put(Hobby.TABLE_GAMES, 12);
        put(Hobby.PROGRAMMING, 13);
        put(Hobby.SINGING, 14);
        put(Hobby.MUSIC_INSTRUMENTS, 15);
        put(Hobby.TATOO, 16);
    }};
    public static final int[][] matrix = {
            {10, 9, 1, 0, 3, 6, 4, 7, 2, 3, 5, 2, 4, 0, 4, 4, 0},
            {9, 10, 0, 0, 0, 1, 0, 4, 1, 8, 5, 1, 2, 0, 1, 5, 0},
            {1, 0, 10, 9, 1, 0, 0, 9, 3, 1, 2, 0, 1, 0, 8, 9, 1},
            {0, 0, 9, 10, 0, 0, 0, 0, 4, 1, 1, 1, 3, 0, 10, 9, 0},
            {3, 0, 1, 0, 10, 5, 3, 0, 3, 5, 3, 0, 8, 0, 0, 7, 3},
            {6, 1, 0, 0, 5, 10, 0, 0, 4, 6, 8, 7, 7, 0, 0, 2, 0},
            {4, 0, 0, 0, 3, 0, 10, 0, 2, 2, 0, 5, 7, 9, 0, 8, 0},
            {7, 4, 9, 0, 0, 0, 0, 10, 0, 1, 0, 7, 4, 2, 1, 6, 0},
            {2, 1, 3, 4, 3, 4, 2, 0, 10, 4, 8, 0, 6, 1, 1, 1, 10},
            {3, 8, 1, 1, 5, 6, 2, 1, 4, 10, 8, 0, 3, 0, 0, 5, 0},
            {5, 5, 2, 1, 3, 8, 0, 0, 8, 8, 10, 0, 3, 0, 3, 4, 8},
            {2, 1, 0, 1, 0, 7, 5, 7, 0, 0, 0, 10, 10, 3, 0, 0, 0},
            {4, 2, 1, 3, 8, 7, 7, 4, 6, 3, 3, 10, 10, 4, 5, 7, 2},
            {0, 0, 0, 0, 0, 0, 9, 2, 1, 0, 0, 3, 4, 10, 4, 5, 0},
            {4, 1, 8, 10, 0, 0, 0, 1, 1, 0, 3, 0, 5, 4, 10, 9, 4},
            {4, 5, 9, 9, 7, 2, 8, 6, 1, 5, 4, 0, 7, 5, 9, 10, 6},
            {0, 0, 1, 0, 3, 0, 0, 0, 10, 0, 8, 0, 2, 0, 4, 6, 10}
    };

    private void init(String string) {
        List<String> list = List.of(string.split(","));
        for (String current : list) {
            current = current.trim();
            switch (current) {
                case "Туризм":
                    hobby.add(Hobby.TOURISM);
                    break;
                case "Рыбалка":
                    hobby.add(Hobby.FISHING);
                    break;
                case "Танцы":
                    hobby.add(Hobby.DANCE);
                    break;
                case "Театр":
                    hobby.add(Hobby.THEATRE);
                    break;
                case "Коллекционирование":
                    hobby.add(Hobby.COLLECT);
                    break;
                case "Цвето-, садоводство и огородничество":
                    hobby.add(Hobby.GARDENING);
                    break;
                case "Компьютерные игры":
                    hobby.add(Hobby.COMPUTER_GAMES);
                    break;
                case "Спорт":
                    hobby.add(Hobby.SPORT);
                    break;
                case "Рисование":
                    hobby.add(Hobby.PAINTING);
                    break;
                case "Кулинария":
                    hobby.add(Hobby.COOKING);
                    break;
                case "Рукоделие":
                    hobby.add(Hobby.CRAFTS);
                    break;
                case "Шахматы":
                    hobby.add(Hobby.CHESS);
                    break;
                case "Настольные игры":
                    hobby.add(Hobby.TABLE_GAMES);
                    break;
                case "Программирование":
                    hobby.add(Hobby.PROGRAMMING);
                    break;
                case "Пение":
                    hobby.add(Hobby.SINGING);
                    break;
                case "Игра на музыкальных инструментах":
                    hobby.add(Hobby.MUSIC_INSTRUMENTS);
                    break;
                case "Тату":
                    hobby.add(Hobby.TATOO);
                    break;
            }
        }
    }

    public HobbyQuestion() {
    }

    public List<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(List<Hobby> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "HobbyQuestion{" +
                "hobby=" + hobby +
                '}';
    }
}
