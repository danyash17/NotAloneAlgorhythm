package com.example.notalone.algo.factory;

import com.example.notalone.algo.comparator.QuestionComparator;
import com.example.notalone.algo.entity.questionnaire.Questionnaire;
import com.example.notalone.algo.entity.Pair;

import java.util.*;

public class RelevantsFactory {
    public List<Pair> getRelevants(int id, List<Questionnaire> list) {
        QuestionComparator questionComparator = new QuestionComparator();
        List<Pair> pairs = new ArrayList<>();
        Questionnaire targetQuestionnaire = list.get(id);
        for (Questionnaire currentQuestionnaire :list) {
            int rating = questionComparator.compareAll(currentQuestionnaire.getQuestions(), targetQuestionnaire.getQuestions());
            pairs.add(new Pair(currentQuestionnaire, targetQuestionnaire, rating));
        }
        pairs.sort(Comparator.comparing(Pair::getRelevance).reversed());
        return pairs;
    }
}
