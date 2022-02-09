package com.example.notalone.comparator;

import com.example.notalone.entity.form.Form;
import com.example.notalone.entity.pair.Pair;

import java.util.*;

public class FormComparator {
    public List<Pair> getRelevants(int id, List<Form> list) {
        QuestionComparator questionComparator = new QuestionComparator();
        List<Pair> pairs = new ArrayList<>();
        Form targetForm = list.get(id);
        for (Form currentForm:list) {
            int rating = questionComparator.compareAll(currentForm.getQuestions(), targetForm.getQuestions());
            pairs.add(new Pair(currentForm, targetForm, rating));
        }
        pairs.sort(Comparator.comparing(Pair::getRelevance).reversed());
        return pairs;
    }
}
