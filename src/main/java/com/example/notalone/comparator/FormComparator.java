package com.example.notalone.comparator;

import com.example.notalone.entity.form.Form;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FormComparator {
    public Map<Integer, Form> getRelevants(int id, List<Form> list) {
        Map<Integer, Form> results,ratings = new TreeMap<>();
        QuestionComparator questionComparator = new QuestionComparator();
        Form targetForm = list.get(id);
        for (Form currentForm:list) {
            int rating = questionComparator.compareAll(currentForm.getQuestions(),targetForm.getQuestions());
            ratings.put(rating,currentForm);
        }

        return null;
    }
}
