package com.example.notalone.algo.entity.questionnaire.question;

public class CommentQuestion implements Question{
    private String comment;

    public CommentQuestion(String comment) {
        this.comment = comment;
    }

    public CommentQuestion() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CommentQuestion{" +
                "comment='" + comment + '\'' +
                '}';
    }
}
