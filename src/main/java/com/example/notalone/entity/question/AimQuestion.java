package com.example.notalone.entity.question;

public class AimQuestion implements Question {
    public enum Aim {
        FRIENDSHIP,
        RELATIONSHIPS,
        ANYTHING
    }

    private Aim aim;

    public AimQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string) {
            case "Дружба":
                aim = Aim.FRIENDSHIP;
                break;
            case "Отношения":
                aim = Aim.RELATIONSHIPS;
                break;
            case "Оба варианта":
                aim = Aim.ANYTHING;
                break;
        }
    }

    public Aim getAim() {
        return aim;
    }

    public void setAim(Aim aim) {
        this.aim = aim;
    }

    @Override
    public String toString() {
        return "AimQuestion{" +
                "aim=" + aim +
                '}';
    }
}
