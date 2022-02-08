package com.example.notalone.entity.question;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
