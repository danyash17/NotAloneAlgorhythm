package com.example.notalone.algo.entity.questionnaire.question;

import com.example.notalone.algo.enums.Faculty;

public class FacultyQuestion implements Question {
    private Faculty faculty;

    public FacultyQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string) {
            case "Биологический":
                faculty = Faculty.BIO;
                break;
            case "Военный":
                faculty = Faculty.MILITARY;
                break;
            case "Географии и геоинформатики":
                faculty = Faculty.GEO;
                break;
            case "Журналистики":
                faculty = Faculty.JOURNALISTIC;
                break;
            case "Исторический":
                faculty = Faculty.HISTORICAL;
                break;
            case "Механико-математический":
                faculty = Faculty.MECHMAT;
                break;
            case "Прикладной математики и информатики":
                faculty = Faculty.FPM;
                break;
            case "Радиофизики и компьютерных технологий":
                faculty = Faculty.RPACT;
                break;
            case "Социокультурных комуникаций":
                faculty = Faculty.FSC;
                break;
            case "Философии и социальных наук":
                faculty = Faculty.PHILOSOFIC;
                break;
            case "Физический":
                faculty = Faculty.PHYSICAL;
                break;
            case "Филологический":
                faculty = Faculty.PHILOLOGICAL;
                break;
            case "Химический":
                faculty = Faculty.CHEMICAL;
                break;
            case "Экономический":
                faculty = Faculty.ECONOMIC;
                break;
            case "Юридический":
                faculty = Faculty.LAW;
                break;
            case "Институт Бизнеса":
                faculty = Faculty.BUSINESS;
                break;
            case "Международных отношений":
                faculty = Faculty.INTERNATIONAL_RELATIONSHIPS;
                break;
            case "Лицей БГУ":
                faculty = Faculty.LYCEUM;
                break;
            case "МГЭИ им.А.Д.Сахарово":
                faculty = Faculty.MSEU;
                break;
            case "Не БГУ":
                faculty = Faculty.NON_BSU;
                break;
        }
    }


    public FacultyQuestion() {
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "FacultyQuestion{" +
                "faculty=" + faculty +
                '}';
    }
}
