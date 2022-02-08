package com.example.notalone.parser;

import com.example.notalone.entity.form.Form;
import com.example.notalone.entity.question.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FormParser {
    private static final Map<Integer, Class> questionMap = new TreeMap<Integer, Class>() {{
        put(1, EmailQuestion.class);
        put(2, NameQuestion.class);
        put(3, AimQuestion.class);
        put(4, ReferenceQuestion.class);
        put(5, OwnGenderQuestion.class);
        put(6, PartnerGenderQuestion.class);
        put(7, FacultyQuestion.class);
        put(8, LocationQuestion.class);
        put(9, ExtraverseQuestion.class);
        put(10,ZodiacQuestion.class);
        put(11,HeightQuestion.class);
        put(12,MusicQuestion.class);
        put(13,HobbyQuestion.class);
        put(14,AlcoholQuestion.class);
        put(15,SmokingQuestion.class);
        put(16,OwnNegativesQuestion.class);
        put(17,PartnerNegativesQuestion.class);
        put(18, OwnPositivesQuestion.class);
        put(19,MessageQuestion.class);
        put(20,BlindDateQuestion.class);
        put(21,CommentQuestion.class);
    }};

    public Form parseForm(List<String> list){
        Form form = new Form();
        for(int i=1;i<=21;i++) {
        Class aClass = questionMap.get(i);
        Question question = null;
            try {
                question =(Question) aClass.getConstructor(String.class).newInstance(list.get(i));
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        form.getQuestions().add(question);
        }
        return form;
    }
}