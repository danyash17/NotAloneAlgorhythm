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
        return switch (positives) {
            case ISKRENNOST -> " Искренность ";
            case STRESSOUSTOUCHIVOST -> " Стрессоустойчивость ";
            case ORGANIZOVANNOST -> " Организованность ";
            case VNIMATELNOST -> " Внимательность ";
            case SCHEDROST -> " Щедрость ";
            case TRUDOLUBIE -> " Трудолюбие ";
            case ZHIZNERADOSTNOST -> " Жизнерадостность ";
            case SPOSOBNOST_BLAGODARIT -> " Способность благодарить ";
            case ZDRAVOMYSLIE -> " Здравомыслие ";
            case TERPELIVOST -> " Терпеливость ";
            case BEREZHLIVOST -> " Бережливость ";
            case MUDROST -> " Мудрость ";
            case OTZUVCHIVOST -> " Отзывчивость ";
            case SMELOST -> " Смелость ";
            case CREATIVNOST -> " Креативность ";
            case CHUVSTVO_YOUMORA -> " Чувство юмора ";
            case INICIATIVNOST -> " Инициативность ";
            case PUNKTUALNOST -> " Пунктуальность ";
            case SKROMNOST -> " Скромность ";
            case UVERENNOST -> " Уверенность ";
        };
    }
}
