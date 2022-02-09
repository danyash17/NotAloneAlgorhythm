package com.example.notalone.entity.form;

import com.example.notalone.entity.question.Question;

import java.util.ArrayList;
import java.util.List;

public class Form{
    private List<Question> questions;

    public Form(List<Question> questions) {
        this.questions = questions;
    }

    public Form() {
        questions = new ArrayList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
