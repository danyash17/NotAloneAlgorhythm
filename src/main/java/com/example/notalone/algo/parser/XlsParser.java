package com.example.notalone.algo.parser;

import com.example.notalone.algo.entity.questionnaire.Questionnaire;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class XlsParser {
    public List<List<String>> parse(File file) throws IOException {
        List<List<String>> table = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            Iterator<Row> itr = sheet.iterator();
            boolean first = true;

            while (itr.hasNext()) {
                Row current = itr.next();
                Iterator<Cell> cellIterator = current.cellIterator();
                Questionnaire questionnaire = new Questionnaire();
                List<String> row = new ArrayList<>();
                if (first) {
                    first = false;
                    continue;
                }
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case STRING:
                            row.add(cell.getStringCellValue());
                            break;
                        case NUMERIC:
                            row.add(String.valueOf(cell.getNumericCellValue()));
                            break;
                    }
                }
                table.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return table;
    }
}
