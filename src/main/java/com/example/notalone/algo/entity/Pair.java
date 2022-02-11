package com.example.notalone.algo.entity;

import com.example.notalone.algo.entity.questionnaire.Questionnaire;

public class Pair {
    private Questionnaire current;
    private Questionnaire target;
    private int relevance;

    public Pair(Questionnaire current, Questionnaire target, int relevance) {
        this.current = current;
        this.target = target;
        this.relevance = relevance;
    }

    public Pair() {
    }

    public Questionnaire getCurrent() {
        return current;
    }

    public void setCurrent(Questionnaire current) {
        this.current = current;
    }

    public Questionnaire getTarget() {
        return target;
    }

    public void setTarget(Questionnaire target) {
        this.target = target;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "current=" + current +
                ", target=" + target +
                ", relevance=" + relevance +
                '}';
    }
}
