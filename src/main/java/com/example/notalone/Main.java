package com.example.notalone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.notalone.comparator.QuestionComparator;
import com.example.notalone.entity.form.Form;
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
        for(int i=1;i<forms.size();i++){
            int result = questionComparator.compareAll(testForm.getQuestions(),forms.get(i).getQuestions());
            System.out.println("[" + testForm.getQuestions().get(1)+", "+testForm.getQuestions().get(2)+
                    "] имеет " + result +" баллов совместимости с [" + forms.get(i).getQuestions().get(1)+
                    ", " + forms.get(i).getQuestions().get(2)+ "]\n");
        }
    }
}

