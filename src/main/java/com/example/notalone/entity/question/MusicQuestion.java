package com.example.notalone.entity.question;

import com.example.notalone.enums.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MusicQuestion implements Question {
    private List<Music> music;
    public static final Map<Music, Integer> order = new TreeMap<>() {{
        put(Music.POP, 0);
        put(Music.ROCK, 1);
        put(Music.SHANSON, 2);
        put(Music.CLASSIC, 3);
        put(Music.ELECTRO, 4);
        put(Music.TRADITIONAL, 5);
        put(Music.JAZZ, 6);
        put(Music.BLUES, 7);
        put(Music.RAP, 8);
        put(Music.LATINO, 9);
        put(Music.HIP_HOP, 10);
        put(Music.RITMNBLUES, 11);
        put(Music.AMBIENT, 12);
        put(Music.COUNTRY, 13);
    }};
    public static final int[][] matrix = {
            {10, 5, 0, 2, 7, 1, 3, 4, 7, 8, 8, 5, 2, 9},
            {5, 10, 4, 7, 6, 1, 2, 5, 4, 1, 7, 8, 6, 7},
            {0, 4, 10, 8, 3, 8, 8, 8, 1, 6, 1, 7, 2, 9},
            {2, 7, 8, 10, 0, 7, 7, 6, 0, 7, 1, 4, 9, 5},
            {7, 6, 3, 0, 10, 0, 1, 2, 6, 7, 9, 1, 1, 6},
            {1, 1, 8, 7, 0, 10, 7, 5, 1, 10, 1, 4, 8, 9},
            {3, 2, 8, 7, 1, 7, 10, 8, 3, 5, 2, 8, 3, 6},
            {4, 5, 8, 6, 2, 5, 8, 10, 3, 8, 3, 9, 4, 7},
            {7, 4, 1, 0, 6, 1, 3, 3, 10, 7, 10, 6, 0, 5},
            {8, 1, 6, 7, 7, 10, 5, 8, 7, 10, 4, 5, 7, 7},
            {8, 7, 1, 1, 9, 1, 2, 3, 10, 4, 10, 4, 0, 4},
            {5, 8, 7, 4, 1, 4, 8, 9, 6, 5, 4, 10, 2, 7},
            {2, 6, 2, 9, 1, 8, 3, 4, 0, 7, 0, 2, 10, 3},
            {9, 7, 9, 5, 6, 9, 6, 7, 5, 7, 4, 7, 3, 10}
    };

    public MusicQuestion(String string) {
        music = new ArrayList<>();
        init(string);
    }

    private void init(String string) {
        List<String> list = List.of(string.split(","));
        for (String current : list) {
            current = current.trim();
            switch (current) {
                case "Популярная музыка":
                    music.add(Music.POP);
                    break;
                case "Рок":
                    music.add(Music.ROCK);
                    break;
                case "Шансон(романс/авторская песня)":
                    music.add(Music.SHANSON);
                    break;
                case "Классическая музыка":
                    music.add(Music.CLASSIC);
                    break;
                case "Электронная музыка":
                    music.add(Music.ELECTRO);
                    break;
                case "Народная музыка":
                    music.add(Music.TRADITIONAL);
                    break;
                case "Джаз":
                    music.add(Music.JAZZ);
                    break;
                case "Блюз":
                    music.add(Music.BLUES);
                    break;
                case "Рэп":
                    music.add(Music.RAP);
                    break;
                case "Латиноамериканская музыка":
                    music.add(Music.LATINO);
                    break;
                case "Хип-хоп":
                    music.add(Music.HIP_HOP);
                    break;
                case "Ритм-н-блюз":
                    music.add(Music.RITMNBLUES);
                    break;
                case "Духовная музыка":
                    music.add(Music.AMBIENT);
                    break;
                case "Кантри":
                    music.add(Music.COUNTRY);
                    break;
            }
        }

    }

    public MusicQuestion() {
        music = new ArrayList<>();
    }

    public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "MusicQuestion{" +
                "music=" + music +
                '}';
    }
}
