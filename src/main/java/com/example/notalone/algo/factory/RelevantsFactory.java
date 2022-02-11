package com.example.notalone.algo.factory;

import com.example.notalone.algo.comparator.QuestionComparator;
import com.example.notalone.algo.entity.Form;
import com.example.notalone.algo.entity.questionnaire.Questionnaire;
import com.example.notalone.algo.entity.Pair;

import java.util.*;

public class RelevantsFactory {
    public List<Pair> getRelevants(int id, List<Form> forms, List<Questionnaire> questionnaires) {
        QuestionComparator questionComparator = new QuestionComparator();
        List<Pair> pairs = new ArrayList<>();
        Questionnaire targetQuestionnaire = questionnaires.get(id);
        Form targetForm = forms.get(id);
        for (int i=0; i<questionnaires.size();i++) {
            Questionnaire currentQuestionnaire = questionnaires.get(i);
            int rating = questionComparator.compareAll(currentQuestionnaire.getQuestions(), targetQuestionnaire.getQuestions());
            pairs.add(new Pair(forms.get(i), targetForm, rating));
        }
        pairs.sort(Comparator.comparing(Pair::getRelevance).reversed());
        return pairs;
    }
}
