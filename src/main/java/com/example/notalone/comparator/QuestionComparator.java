package com.example.notalone.comparator;

import com.example.notalone.entity.question.AimQuestion;
import com.example.notalone.entity.question.Question;
import com.example.notalone.enums.Aim;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class QuestionComparator {
    public static final List<Class> indexingQuestions = new ArrayList<>() {{
        add(AimQuestion.class);
    }};

    public int compareAll(List<Question> current, List<Question> target) {
        int sum = 0;
        for (int i = 0; i < 21; i++) {
            sum += invoke(current.get(i), target.get(i));
        }
        return sum;
    }

    private int invoke(Question current, Question target) {
        int result = 0;
        QuestionComparator obj = new QuestionComparator();
        Class objClass = obj.getClass();
        Method[] allMethods = objClass.getDeclaredMethods();
        for (Method method : allMethods) {
            String methodName = method.getName();
            if (methodName.equals("compare") && indexingQuestions.contains(current.getClass())
                    && indexingQuestions.contains(target.getClass())) {
                try {
                    result = (int) method.invoke(obj, current, target);
                } catch (InvocationTargetException | IllegalAccessException ignored) {
                }
            }
        }
        return result;
    }

    public int compare(AimQuestion current, AimQuestion target) {
        Map<Aim, Integer> map = AimQuestion.order;
        return AimQuestion.matrix[map.get(current.getAim())][map.get(target.getAim())];
    }
}
