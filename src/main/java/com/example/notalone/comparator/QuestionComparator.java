package com.example.notalone.comparator;

import com.example.notalone.entity.question.AimQuestion;
import com.example.notalone.entity.question.OwnGenderQuestion;
import com.example.notalone.entity.question.PartnerGenderQuestion;
import com.example.notalone.entity.question.Question;
import com.example.notalone.enums.Aim;
import com.example.notalone.enums.Gender;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class QuestionComparator {
    private Gender[] sourceGenders;

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
                    if (current.getClass() != OwnGenderQuestion.class) {
                        result = (int) method.invoke(this, current, target);
                        break;
                    } else if (method.getReturnType().isArray()) {
                        this.sourceGenders = (Gender[]) method.invoke(this, current, target);
                        return 0;
                    }
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

    public int compare(PartnerGenderQuestion current, PartnerGenderQuestion target) {
        int result = 0;
        int temp = 0;
        boolean dismatch = false;
        Map<Gender, Integer> map = PartnerGenderQuestion.order;
        if (current.getGender() != Gender.ANYONE) {
            temp = PartnerGenderQuestion.matrix[map.get(current.getGender())][map.get(sourceGenders[1])];
            dismatch = temp==0;
            result+=temp;
        } else result += 10;
        if (target.getGender() != Gender.ANYONE) {
            temp = PartnerGenderQuestion.matrix[map.get(target.getGender())][map.get(sourceGenders[0])];
            dismatch = temp==0;
            result+=temp;
        } else result += 10;
        result -= dismatch ? result : 0;
        return 10 * result;
    }

    public Gender[] compare(OwnGenderQuestion current, OwnGenderQuestion target) {
        return new Gender[]{current.getGender(), target.getGender()};
    }

}
