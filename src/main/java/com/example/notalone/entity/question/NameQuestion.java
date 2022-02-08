package com.example.notalone.entity.question;

public class NameQuestion implements Question{
    private String name;

    public NameQuestion(String name) {
        name = name.trim();
        this.name = name;
    }

    public NameQuestion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NameQuestion{" +
                "name='" + name + '\'' +
                '}';
    }
}
