package com.example.notalone.algo.mapper;

import com.example.notalone.algo.entity.Form;
import com.example.notalone.algo.entity.questionnaire.Questionnaire;
import com.example.notalone.algo.entity.questionnaire.question.*;
import com.example.notalone.algo.enums.*;

import java.util.ArrayList;
import java.util.List;

public class FormMapper {
    public List<Form> map(List<Questionnaire> questionnaires) {
        List<Form> forms = new ArrayList<>();
        int id = 2;
        for (Questionnaire questionnaire:questionnaires) {
            Form form = new Form();
            List<Question> questions = questionnaire.getQuestions();
            //
            EmailQuestion emailQuestion = (EmailQuestion) questions.get(0);
            form.setEmail(emailQuestion.getEmail());
            //
            NameQuestion nameQuestion = (NameQuestion) questions.get(1);
            form.setName(nameQuestion.getName());
            //
            AimQuestion aimQuestion = (AimQuestion) questions.get(2);
            form.setAim(Aim.getViewValue(aimQuestion.getAim()));
            //
            ReferenceQuestion referenceQuestion = (ReferenceQuestion) questions.get(3);
            form.setReference(referenceQuestion.getReference());
            //
            OwnGenderQuestion ownGenderQuestion = (OwnGenderQuestion) questions.get(4);
            form.setGender(Gender.getViewValue(ownGenderQuestion.getGender()));
            //
            PartnerGenderQuestion partnerGenderQuestion = (PartnerGenderQuestion) questions.get(5);
            form.setPartnerGender(Gender.getViewValue(partnerGenderQuestion.getGender()));
            //
            FacultyQuestion facultyQuestion = (FacultyQuestion) questions.get(6);
            form.setFaculty(Faculty.getViewValue(facultyQuestion.getFaculty()));
            //
            LocationQuestion locationQuestion = (LocationQuestion) questions.get(7);
            form.setLocation(Location.getViewValue(locationQuestion.getLocation()));
            //
            ExtraverseQuestion extraverseQuestion = (ExtraverseQuestion) questions.get(8);
            form.setExtraverse(Extraverse.getViewValue(extraverseQuestion.getExtraverse()));
            //
            ZodiacQuestion zodiacQuestion = (ZodiacQuestion) questions.get(9);
            form.setZodiac(Zodiac.getViewValue(zodiacQuestion.getZodiac()));
            //
            HeightQuestion heightQuestion = (HeightQuestion) questions.get(10);
            form.setHeight(heightQuestion.getHeight());
            //
            MusicQuestion musicQuestion = (MusicQuestion) questions.get(11);
            StringBuilder stringBuilder = new StringBuilder();
            for (Music music : musicQuestion.getMusic()) {
                stringBuilder.append(Music.getViewValue(music));
            }
            form.setMusic(String.valueOf(stringBuilder));
            //
            HobbyQuestion hobbyQuestion = (HobbyQuestion) questions.get(12);
            stringBuilder = new StringBuilder();
            for (Hobby hobby : hobbyQuestion.getHobby()) {
                stringBuilder.append(Hobby.getViewValue(hobby));
            }
            form.setHobbies(String.valueOf(stringBuilder));
            //
            AlcoholQuestion alcoholQuestion = (AlcoholQuestion) questions.get(13);
            form.setAlchoholOpinion(Opinion.getViewValue(alcoholQuestion.getOpinion()));
            //
            SmokingQuestion smokingQuestion = (SmokingQuestion) questions.get(14);
            form.setSmokingOpinion(Opinion.getViewValue(smokingQuestion.getOpinion()));
            //
            OwnNegativesQuestion ownNegativesQuestion = (OwnNegativesQuestion) questions.get(15);
            stringBuilder = new StringBuilder();
            for (Negatives negative : ownNegativesQuestion.getNegatives()) {
                stringBuilder.append(Negatives.getViewValue(negative));
            }
            form.setOwnNegatives(String.valueOf(stringBuilder));
            //
            PartnerNegativesQuestion partnerNegativesQuestion = (PartnerNegativesQuestion) questions.get(16);
            stringBuilder = new StringBuilder();
            for (Negatives negative : partnerNegativesQuestion.getNegatives()) {
                stringBuilder.append(Negatives.getViewValue(negative));
            }
            form.setPartnerNegatives(String.valueOf(stringBuilder));
            //
            OwnPositivesQuestion ownPositivesQuestion = (OwnPositivesQuestion) questions.get(17);
            stringBuilder = new StringBuilder();
            for (Positives positive : ownPositivesQuestion.getPositives()) {
                stringBuilder.append(Positives.getViewValue(positive));
            }
            form.setOwnPositives(String.valueOf(stringBuilder));
            //
            MessageQuestion messageQuestion = (MessageQuestion) questions.get(18);
            form.setMessage(messageQuestion.getMessage());
            //
            BlindDateQuestion blindDateQuestion = (BlindDateQuestion) questions.get(19);
            form.setBlindDate(blindDateQuestion.isBlindDate());
            //
            CommentQuestion commentQuestion = (CommentQuestion) questions.get(20);
            form.setComment(commentQuestion.getComment());
            //
            PhotoReferenceQuestion photoReferenceQuestion = (PhotoReferenceQuestion) questions.get(21);
            form.setPhotoReference(photoReferenceQuestion.getPhotoReference());
            //
            form.setId(id++);
            forms.add(form);
        }
        return forms;
    }
}
