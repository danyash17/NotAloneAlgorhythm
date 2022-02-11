package com.example.notalone.algo.mapper;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.algo.entity.questionnaire.Questionnaire;
import com.example.notalone.algo.entity.questionnaire.question.*;
import com.example.notalone.algo.enums.*;

import java.util.List;

public class FormMapper {
    public Form map(Questionnaire questionnaire) {
        Form form = new Form();
        List<Question> questions = questionnaire.getQuestions();
        //
        IdQuestion idQuestion = (IdQuestion) questions.get(0);
        form.setId((int) Double.parseDouble(idQuestion.getId()));
        //
        EmailQuestion emailQuestion = (EmailQuestion) questions.get(1);
        form.setEmail(emailQuestion.getEmail());
        //
        NameQuestion nameQuestion = (NameQuestion) questions.get(2);
        form.setName(nameQuestion.getName());
        //
        AimQuestion aimQuestion = (AimQuestion) questions.get(3);
        form.setAim(Aim.getViewValue(aimQuestion.getAim()));
        //
        ReferenceQuestion referenceQuestion = (ReferenceQuestion) questions.get(4);
        form.setReference(referenceQuestion.getReference());
        //
        OwnGenderQuestion ownGenderQuestion = (OwnGenderQuestion) questions.get(5);
        form.setGender(Gender.getViewValue(ownGenderQuestion.getGender()));
        //
        PartnerGenderQuestion partnerGenderQuestion = (PartnerGenderQuestion) questions.get(6);
        form.setPartnerGender(Gender.getViewValue(partnerGenderQuestion.getGender()));
        //
        FacultyQuestion facultyQuestion = (FacultyQuestion) questions.get(7);
        form.setFaculty(Faculty.getViewValue(facultyQuestion.getFaculty()));
        //
        LocationQuestion locationQuestion = (LocationQuestion) questions.get(8);
        form.setLocation(Location.getViewValue(locationQuestion.getLocation()));
        //
        ExtraverseQuestion extraverseQuestion = (ExtraverseQuestion) questions.get(9);
        form.setExtraverse(Extraverse.getViewValue(extraverseQuestion.getExtraverse()));
        //
        ZodiacQuestion zodiacQuestion = (ZodiacQuestion) questions.get(10);
        form.setZodiac(Zodiac.getViewValue(zodiacQuestion.getZodiac()));
        //
        HeightQuestion heightQuestion = (HeightQuestion) questions.get(11);
        form.setHeight(heightQuestion.getHeight());
        //
        MusicQuestion musicQuestion = (MusicQuestion) questions.get(12);
        StringBuilder stringBuilder = new StringBuilder();
        for (Music music : musicQuestion.getMusic()) {
            stringBuilder.append(Music.getViewValue(music));
        }
        form.setMusic(String.valueOf(stringBuilder));
        //
        HobbyQuestion hobbyQuestion = (HobbyQuestion) questions.get(13);
        stringBuilder = new StringBuilder();
        for (Hobby hobby : hobbyQuestion.getHobby()) {
            stringBuilder.append(Hobby.getViewValue(hobby));
        }
        form.setHobbies(String.valueOf(stringBuilder));
        //
        AlcoholQuestion alcoholQuestion = (AlcoholQuestion) questions.get(14);
        form.setAlchoholOpinion(Opinion.getViewValue(alcoholQuestion.getOpinion()));
        //
        SmokingQuestion smokingQuestion = (SmokingQuestion) questions.get(15);
        form.setSmokingOpinion(Opinion.getViewValue(smokingQuestion.getOpinion()));
        //
        OwnNegativesQuestion ownNegativesQuestion = (OwnNegativesQuestion) questions.get(16);
        stringBuilder = new StringBuilder();
        for (Negatives negative : ownNegativesQuestion.getNegatives()) {
            stringBuilder.append(Negatives.getViewValue(negative));
        }
        form.setOwnNegatives(String.valueOf(stringBuilder));
        //
        PartnerNegativesQuestion partnerNegativesQuestion = (PartnerNegativesQuestion) questions.get(17);
        stringBuilder = new StringBuilder();
        for (Negatives negative : partnerNegativesQuestion.getNegatives()) {
            stringBuilder.append(Negatives.getViewValue(negative));
        }
        form.setPartnerNegatives(String.valueOf(stringBuilder));
        //
        OwnPositivesQuestion ownPositivesQuestion = (OwnPositivesQuestion) questions.get(18);
        stringBuilder = new StringBuilder();
        for (Positives positive : ownPositivesQuestion.getPositives()) {
            stringBuilder.append(Positives.getViewValue(positive));
        }
        form.setOwnPositives(String.valueOf(stringBuilder));
        //
        MessageQuestion messageQuestion = (MessageQuestion) questions.get(19);
        form.setMessage(messageQuestion.getMessage());
        //
        BlindDateQuestion blindDateQuestion = (BlindDateQuestion) questions.get(20);
        form.setBlindDate(blindDateQuestion.isBlindDate());
        //
        CommentQuestion commentQuestion = (CommentQuestion) questions.get(21);
        form.setComment(commentQuestion.getComment());
        //
        PhotoReferenceQuestion photoReferenceQuestion = (PhotoReferenceQuestion) questions.get(22);
        form.setPhotoReference(photoReferenceQuestion.getPhotoReference());
        return form;
    }
}
