package com.example.notalone.algo.entity;

import com.example.notalone.algo.entity.questionnaire.Questionnaire;

public class Pair {
    private Form current;
    private Form target;
    private int relevance;

    public Pair() {
    }

    public Pair(Form current, Form target, int relevance) {
        this.current = current;
        this.target = target;
        this.relevance = relevance;
    }

    public Form getCurrent() {
        return current;
    }

    public void setCurrent(Form current) {
        this.current = current;
    }

    public Form getTarget() {
        return target;
    }

    public void setTarget(Form target) {
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
