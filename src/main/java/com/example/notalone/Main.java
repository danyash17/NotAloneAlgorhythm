package com.example.notalone;

import java.io.File;
import java.io.IOException;
import java.util.*;

import com.example.notalone.comparator.FormComparator;
import com.example.notalone.comparator.QuestionComparator;
import com.example.notalone.entity.form.Form;
import com.example.notalone.entity.pair.Pair;
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
        System.out.println("\nParsing was successful\n\n\n");
        List<Form> forms = new ArrayList<>();
        FormParser formParser = new FormParser();
        QuestionComparator questionComparator = new QuestionComparator();
        for (List<String> row : table) {
            forms.add(formParser.parseForm(row));
        }
        int testId = 256;
        Form testForm = forms.get(testId-2);
        List<Question> testFormQuestions = testForm.getQuestions();
//        for (int i = 1; i < forms.size(); i++) {
//            List<Question> currentList = forms.get(i).getQuestions();
//            int result = questionComparator.compareAll(testFormQuestions, currentList);
//            System.out.println("_______________");
//            System.out.println("Email\t" + testFormQuestions.get(0) + "\t" + currentList.get(0) + "\n");
//            System.out.println("Name\t" + testFormQuestions.get(1) + "\t" + currentList.get(1) + "\n");
//            System.out.println("Aim\t" + testFormQuestions.get(2) + "\t" + currentList.get(2) + "\n");
//            System.out.println("OwnGender\t" + testFormQuestions.get(4) + "\t" + currentList.get(4) + "\n");
//            System.out.println("PartnerGender\t" + testFormQuestions.get(5) + "\t" + currentList.get(5) + "\n");
//            System.out.println("Location\t" + testFormQuestions.get(7) + "\t" + currentList.get(7) + "\n");
//            System.out.println("Extraverse\t" + testFormQuestions.get(8) + "\t" + currentList.get(8) + "\n");
//            System.out.println("Zodiac\t" + testFormQuestions.get(9) + "\t" + currentList.get(9) + "\n");
//            System.out.println("Music\t" + testFormQuestions.get(11) + "\t" + currentList.get(11) + "\n");
//            System.out.println("Hobby\t" + testFormQuestions.get(12) + "\t" + currentList.get(12) + "\n");
//            System.out.println("Alcohol\t" + testFormQuestions.get(13) + "\t" + currentList.get(13) + "\n");
//            System.out.println("Smoking\t" + testFormQuestions.get(14) + "\t" + currentList.get(14) + "\n");
//            System.out.println("OwnNegatives\t" + testFormQuestions.get(15) + "\t" + currentList.get(15) + "\n");
//            System.out.println("PartnerNegatives\t" + testFormQuestions.get(16) + "\t" + currentList.get(16) + "\n");
//            System.out.println("BlindDate\t" + testFormQuestions.get(19) + "\t" + currentList.get(19) + "\n");
//            System.out.println("\t" + result + " points");
//            System.out.println("_______________");
//
//        }

        ///////////////////////////

        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m\t";
        String ANSI_WHITE = "\u001B[37m";
        System.out.println(ANSI_BLUE + "\t\tSmart algorhythm NotAlone 1.0");
        System.out.println(ANSI_GREEN + "\t\tBest couples for " + testForm.getQuestions().get(1) + "\n" + ANSI_WHITE);
        FormComparator formComparator = new FormComparator();
        List<Pair> pairs = formComparator.getRelevants(testId-2, forms);
        for (Pair pair:pairs){
            System.out.println("\t" + pair.getCurrent().getQuestions().get(1) + "[" + (forms.indexOf(pair.getCurrent())+2) + "]" + " — " + pair.getRelevance() + " points");
        }
    }
}

