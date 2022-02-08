package com.example.notalone.entity.question;

import com.example.notalone.enums.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicQuestion implements Question {
    private List<Music> music;

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
                case "Шансон,романс,авторская песня":
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
                    music.add(Music.COUTRY);
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
