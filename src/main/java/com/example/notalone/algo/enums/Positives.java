package com.example.notalone.algo.enums;

public enum Positives {
    ISKRENNOST,
    STRESSOUSTOUCHIVOST,
    ORGANIZOVANNOST,
    VNIMATELNOST,
    SCHEDROST,
    TRUDOLUBIE,
    ZHIZNERADOSTNOST,
    SPOSOBNOST_BLAGODARIT,
    ZDRAVOMYSLIE,
    TERPELIVOST,
    BEREZHLIVOST,
    MUDROST,
    OTZUVCHIVOST,
    SMELOST,
    CREATIVNOST,
    CHUVSTVO_YOUMORA,
    INICIATIVNOST,
    PUNKTUALNOST,
    SKROMNOST,
    UVERENNOST;

    public static String getStringValue(Positives positives) {
        switch (positives) {
            case ISKRENNOST:
                return " Искренность ";
            case STRESSOUSTOUCHIVOST:
                return" Стрессоустойчивость ";
            case ORGANIZOVANNOST:
                return" Организованность ";
            case VNIMATELNOST:
                return" Внимательность ";
            case SCHEDROST:
                return" Щедрость ";
            case TRUDOLUBIE:
                return " Трудолюбие ";
            case ZHIZNERADOSTNOST:
                return " Жизнерадостность ";
            case SPOSOBNOST_BLAGODARIT:
                return " Способность благодарить ";
            case ZDRAVOMYSLIE:
                return " Здравомыслие ";
            case TERPELIVOST:
                return " Терпеливость ";
            case BEREZHLIVOST:
                return " Бережливость ";
            case MUDROST:
                return " Мудрость ";
            case OTZUVCHIVOST:
                return " Отзывчивость ";
            case SMELOST:
                return " Смелость ";
            case CREATIVNOST:
                return  " Креативность ";
            case CHUVSTVO_YOUMORA:
                return  " Чувство юмора ";
            case INICIATIVNOST:
                return  " Инициативность ";
            case PUNKTUALNOST:
                return  " Пунктуальность ";
            case SKROMNOST:
                return  " Скромность ";
            case UVERENNOST:
                return  " Уверенность ";
            default: return "Undefined";
        }
    }
}
