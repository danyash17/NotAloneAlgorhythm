package com.example.notalone.comparator;

import com.example.notalone.entity.question.*;
import com.example.notalone.enums.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class QuestionComparator {
    private Gender[] sourceGenders;
    private List<Negatives>[] sourceNegatives;

    public int compareAll(List<Question> current, List<Question> target) {
        int sum = 0;
        for (int i = 0; i < 21; i++) {
            sum += invoke(current.get(i), target.get(i));
        }
        return sum;
    }

    private int invoke(Question current, Question target) {
        int result = 0;
        Class objClass = this.getClass();
        Method[] allMethods = objClass.getDeclaredMethods();
        for (Method method : allMethods) {
            String methodName = method.getName();
            if (Arrays.stream(method.getParameterTypes()).allMatch(type -> type.equals(current.getClass()))) {
                try {
                    result = (int) method.invoke(this, current, target);
                    break;
                } catch (InvocationTargetException | IllegalAccessException ignored) {
                }
            }
        }
        return result;
    }

    public int compare(AimQuestion current, AimQuestion target) {
        Map<Aim, Integer> map = AimQuestion.order;
        return 10 * AimQuestion.matrix[map.get(current.getAim())][map.get(target.getAim())];
    }

    public int compare(LocationQuestion current, LocationQuestion target) {
        Map<Location, Integer> map = LocationQuestion.order;
        return LocationQuestion.matrix[map.get(current.getLocation())][map.get(target.getLocation())];
    }

    public int compare(ExtraverseQuestion current, ExtraverseQuestion target) {
        Map<Extraverse, Integer> map = ExtraverseQuestion.order;
        return ExtraverseQuestion.matrix[map.get(current.getExtraverse())][map.get(target.getExtraverse())];
    }

    public int compare(ZodiacQuestion current, ZodiacQuestion target) {
        Map<Zodiac, Integer> map = ZodiacQuestion.order;
        return 2 * ZodiacQuestion.matrix[map.get(current.getZodiac())][map.get(target.getZodiac())];
    }

    public int compare(SmokingQuestion current, SmokingQuestion target) {
        Map<Opinion, Integer> map = SmokingQuestion.order;
        return 7 * SmokingQuestion.matrix[map.get(current.getOpinion())][map.get(target.getOpinion())];
    }
    public int compare(AlcoholQuestion current, AlcoholQuestion target) {
        Map<Opinion, Integer> map = AlcoholQuestion.order;
        return 7 * AlcoholQuestion.matrix[map.get(current.getOpinion())][map.get(target.getOpinion())];
    }
    public int compare(BlindDateQuestion current, BlindDateQuestion target) {
        Map<Boolean, Integer> map = BlindDateQuestion.order;
        return 10 * BlindDateQuestion.matrix[map.get(current.isBlindDate())][map.get(target.isBlindDate())];
    }

    public int compare(MusicQuestion current, MusicQuestion target) {
        int result = 0;
        Map<Music, Integer> map = MusicQuestion.order;
        List<Music> currentMusicList, targetMusicList;
        currentMusicList = current.getMusic();
        targetMusicList = target.getMusic();
        for (Music targetMusic : targetMusicList) {
            for (Music currentMusic : currentMusicList) {
                result += MusicQuestion.matrix[map.get(currentMusic)][map.get(targetMusic)];
            }
        }
        result /= currentMusicList.size() * targetMusicList.size();
        return 5 * result;
    }

    public int compare(HobbyQuestion current, HobbyQuestion target) {
        int result = 0;
        Map<Hobby, Integer> map = HobbyQuestion.order;
        List<Hobby> currentHobbyList, targetHobbyList;
        currentHobbyList = current.getHobby();
        targetHobbyList = target.getHobby();
        for (Hobby targetHobby : targetHobbyList) {
            for (Hobby currentHobby : currentHobbyList) {
                result += HobbyQuestion.matrix[map.get(currentHobby)][map.get(targetHobby)];
            }
        }
        result /= currentHobbyList.size() * targetHobbyList.size();
        return 5 * result;
    }

    public int compare(OwnNegativesQuestion current, OwnNegativesQuestion target) {
        int result = 0;
        Map<Negatives, Integer> map = OwnNegativesQuestion.order;
        List<Negatives> currentNegativesList, targetNegativesList;
        currentNegativesList = current.getNegatives();
        targetNegativesList = target.getNegatives();
        this.sourceNegatives = new List[]{currentNegativesList, targetNegativesList};
        for (Negatives targetNegative : targetNegativesList) {
            for (Negatives currentNegative : currentNegativesList) {
                result += OwnNegativesQuestion.matrix[map.get(currentNegative)][map.get(targetNegative)];
            }
        }
        result /= currentNegativesList.size() * targetNegativesList.size();
        return 8 * result;
    }

    public int compare(PartnerNegativesQuestion current, PartnerNegativesQuestion target) {
        int result = 0;
        Map<Negatives, Integer> map = PartnerNegativesQuestion.order;
        List<Negatives> currentNegativesList, targetNegativesList;
        currentNegativesList = current.getNegatives();
        targetNegativesList = target.getNegatives();
        this.sourceNegatives = new List[]{currentNegativesList, targetNegativesList};
        for (Negatives currentNegative : currentNegativesList) {
            for (Negatives sourceTargetNegative : sourceNegatives[1]) {
                result += PartnerNegativesQuestion.matrix[map.get(currentNegative)][map.get(sourceTargetNegative)];
            }
        }
        for (Negatives targetNegative : targetNegativesList) {
            for (Negatives sourceCurrentNegative : sourceNegatives[0]) {
                result += PartnerNegativesQuestion.matrix[map.get(targetNegative)][map.get(sourceCurrentNegative)];
            }
        }
        result /= currentNegativesList.size() * targetNegativesList.size();
        return 10 * result;
    }

    public int compare(PartnerGenderQuestion current, PartnerGenderQuestion target) {
        int result = 0;
        int temp = 0;
        boolean dismatch = false;
        Map<Gender, Integer> map = PartnerGenderQuestion.order;
        if (current.getGender() != Gender.ANYONE) {
            temp = PartnerGenderQuestion.matrix[map.get(current.getGender())][map.get(sourceGenders[1])];
            dismatch = temp == 0;
            result += temp;
        } else result += 10;
        if (target.getGender() != Gender.ANYONE) {
            temp = PartnerGenderQuestion.matrix[map.get(target.getGender())][map.get(sourceGenders[0])];
            dismatch = temp == 0;
            result += temp;
        } else result += 10;
        result -= dismatch ? result : 0;
        return 50 * result;
    }

    public int compare(OwnGenderQuestion current, OwnGenderQuestion target) {
        this.sourceGenders = new Gender[]{current.getGender(), target.getGender()};
        return 0;
    }

}
