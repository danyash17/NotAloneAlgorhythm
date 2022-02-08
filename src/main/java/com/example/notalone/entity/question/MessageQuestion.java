package com.example.notalone.entity.question;

public class MessageQuestion implements Question{
    private String message;

    public MessageQuestion(String message) {
        this.message = message;
    }

    public MessageQuestion() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageQuestion{" +
                "message='" + message + '\'' +
                '}';
    }
}
