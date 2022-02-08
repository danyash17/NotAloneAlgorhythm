package com.example.notalone;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        for(List<String> row: table){
        forms.add(formParser.parseForm(row));
        }
        for(Form form:forms){
            System.out.println(form.getQuestions()+"\n");
        }
    }
}

