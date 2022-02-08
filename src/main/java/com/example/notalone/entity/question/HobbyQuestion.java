package com.example.notalone.entity.question;

import com.example.notalone.enums.Hobby;

import java.util.ArrayList;
import java.util.List;

public class HobbyQuestion implements Question {
    private List<Hobby> hobby;

    public HobbyQuestion(String string) {
        hobby = new ArrayList<>();
        init(string);
    }

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
