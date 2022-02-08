package com.example.notalone.entity.question;

public class ReferenceQuestion implements Question{
    private String reference;

    public ReferenceQuestion(String reference) {
        this.reference = reference;
    }

    public ReferenceQuestion() {
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "ReferenceQuestion{" +
                "reference='" + reference + '\'' +
                '}';
    }
}
