package com.example.notalone.entity.question;

public class BlindDateQuestion implements Question{
    private boolean blindDate;

    public BlindDateQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string){
            case "Нет":
                blindDate = false;
                break;
            case "Да":
                blindDate = true;
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
