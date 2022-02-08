package com.example.notalone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.notalone.comparator.QuestionComparator;
import com.example.notalone.entity.form.Form;
import com.example.notalone.entity.question.Question;
import com.example.notalone.parser.FormParser;
import com.example.notalone.parser.XlsParser;

public class Main {
    public static void main(String[] args) {
        XlsParser parser = new XlsParser();
        List<List<String>> table = null;
        try {
            System.out.println("Parsing xls file...");
            table = parser.parse(new File("C:\\notAlone.xlsx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nParsing was successful");
        List<Form> forms = new ArrayList<>();
        FormParser formParser = new FormParser();
        QuestionComparator questionComparator = new QuestionComparator();
        for(List<String> row: table){
        forms.add(formParser.parseForm(row));
        }
        Form testForm = forms.get(0);
        List<Question> testFormQuestions = testForm.getQuestions();
        for(int i=1;i<forms.size();i++){
            List<Question> currentList = forms.get(i).getQuestions();
            int result = questionComparator.compareAll(testFormQuestions,currentList);
            System.out.println("_______________");
            System.out.println("Name\t"+testFormQuestions.get(1)+"\t"+currentList.get(1)+"\n");
            System.out.println("Aim\t"+testFormQuestions.get(2)+"\t"+currentList.get(2)+"\n");
            System.out.println("OwnGender\t"+testFormQuestions.get(4)+"\t"+currentList.get(4)+"\n");
            System.out.println("PartnerGender\t"+testFormQuestions.get(5)+"\t"+currentList.get(5)+"\n");
            System.out.println("\t"+result+" points");
            System.out.println("_______________");

        }
    }
}

