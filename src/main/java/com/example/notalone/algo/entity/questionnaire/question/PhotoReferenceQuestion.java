package com.example.notalone.algo.entity.questionnaire.question;

public class PhotoReferenceQuestion implements Question{
    private String photoReference;

    public PhotoReferenceQuestion(String photoReference) {
        this.photoReference = photoReference;
    }

    public PhotoReferenceQuestion() {
    }

    public String getPhotoReference() {
        return photoReference;
    }

    public void setPhotoReference(String photoReference) {
        this.photoReference = photoReference;
    }

    @Override
    public String toString() {
        return "PhotoReferenceQuestion{" +
                "photoReference='" + photoReference + '\'' +
                '}';
    }
}
