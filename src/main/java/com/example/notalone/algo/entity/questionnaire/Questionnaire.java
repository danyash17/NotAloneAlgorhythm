package com.example.notalone.algo.entity.questionnaire;

import com.example.notalone.algo.entity.questionnaire.question.Question;

import java.util.ArrayList;
import java.util.List;

public class Questionnaire {
    private List<Question> questions;

    public Questionnaire(List<Question> questions) {
        this.questions = questions;
    }

    public Questionnaire() {
        questions = new ArrayList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
