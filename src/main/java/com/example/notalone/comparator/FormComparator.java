package com.example.notalone.comparator;

import com.example.notalone.entity.form.Form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FormComparator {
    public Map<Integer, Form> getRelevants(int id, List<Form> list) {
        Map<Integer, Form> ratings = new HashMap<>();
        QuestionComparator questionComparator = new QuestionComparator();
        Form targetForm = list.get(id);
        for (Form currentForm:list) {
            int rating = questionComparator.compareAll(currentForm.getQuestions(),targetForm.getQuestions());
            ratings.put(rating,currentForm);
        }
        Map<Integer, Form> results = new TreeMap<>(ratings).descendingMap();
        return results;
    }
}
