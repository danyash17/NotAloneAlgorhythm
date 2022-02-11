package com.example.notalone.algo.entity.questionnaire.question;

public class EmailQuestion implements Question {
    private String email;

    public EmailQuestion() {
    }

    public EmailQuestion(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmailQuestion{" +
                "email='" + email + '\'' +
                '}';
    }
}
