package com.example.notalone.algo.entity.questionnaire.question;

import com.example.notalone.algo.enums.Positives;

import java.util.ArrayList;
import java.util.List;

public class OwnPositivesQuestion implements Question{
    private List<Positives> positives;

    public OwnPositivesQuestion(String string) {
        positives = new ArrayList<>();
        init(string);
    }

    private void init(String string) {
        List<String> list = List.of(string.split(","));
        for (String current : list) {
            current = current.trim();
            switch (current) {
                case "Искренность":
                    positives.add(Positives.ISKRENNOST);
                    break;
                case "Стрессоустойчивость":
                    positives.add(Positives.STRESSOUSTOUCHIVOST);
                    break;
                case "Организованность":
                    positives.add(Positives.ORGANIZOVANNOST);
                    break;
                case "Внимательность":
                    positives.add(Positives.VNIMATELNOST);
                    break;
                case "Щедрость":
                    positives.add(Positives.SCHEDROST);
                    break;
                case "Трудолюбие":
                    positives.add(Positives.TRUDOLUBIE);
                    break;
                case "Жизнерадостность":
                    positives.add(Positives.ZHIZNERADOSTNOST);
                    break;
                case "Способность благодарить":
                    positives.add(Positives.SPOSOBNOST_BLAGODARIT);
                    break;
                case "Способность здраво мыслить":
                    positives.add(Positives.ZDRAVOMYSLIE);
                    break;
                case "Терпеливость":
                    positives.add(Positives.TERPELIVOST);
                    break;
                case "Бережливость":
                    positives.add(Positives.BEREZHLIVOST);
                    break;
                case "Мудрость":
                    positives.add(Positives.MUDROST);
                    break;
                case "Отзывчивость":
                    positives.add(Positives.OTZUVCHIVOST);
                    break;
                case "Смелость":
                    positives.add(Positives.SMELOST);
                    break;
                case "Креативность":
                    positives.add(Positives.CREATIVNOST);
                    break;
                case "Чувство юмора":
                    positives.add(Positives.CHUVSTVO_YOUMORA);
                    break;
                case "Инициативность":
                    positives.add(Positives.INICIATIVNOST);
                    break;
                case "Пунктуальность":
                    positives.add(Positives.PUNKTUALNOST);
                    break;
                case "Скромность":
                    positives.add(Positives.SKROMNOST);
                    break;
                case "Уверенность":
                    positives.add(Positives.UVERENNOST);
                    break;
            }
        }
    }

    public OwnPositivesQuestion() {
    }

    public List<Positives> getPositives() {
        return positives;
    }

    public void setPositives(List<Positives> positives) {
        this.positives = positives;
    }

    @Override
    public String toString() {
        return "OwnPositivesQuestion{" +
                "positives=" + positives +
                '}';
    }
}
