package com.example.notalone.entity.question;

import java.util.Map;
import java.util.TreeMap;

public class BlindDateQuestion implements Question{
    private Boolean blindDate;
    public static final Map<Boolean, Integer> order = new TreeMap<>() {{
        put(Boolean.TRUE, 0);
        put(Boolean.FALSE, 1);
    }};
    public static final int[][] matrix = {
            {10, -5},
            {-5, 10},
    };
    public BlindDateQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string){
            case "Нет":
                blindDate = Boolean.FALSE;
                break;
            case "Да":
                blindDate = Boolean.TRUE;
                break;
        }
    }

    public BlindDateQuestion() {
    }

    public boolean isBlindDate() {
        return blindDate;
    }

    public void setBlindDate(boolean blindDate) {
        this.blindDate = blindDate;
    }

    @Override
    public String toString() {
        return "BlindDateQuestion{" +
                "blindDate=" + blindDate +
                '}';
    }
}
