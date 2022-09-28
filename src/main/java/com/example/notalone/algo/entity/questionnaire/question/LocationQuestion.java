package com.example.notalone.algo.entity.questionnaire.question;

import com.example.notalone.algo.enums.Location;

import java.util.Map;
import java.util.TreeMap;

public class LocationQuestion implements Question{
    private Location location;
    public static final Map<Location, Integer> order = new TreeMap<>() {{
        put(Location.MINSK, 0);
        put(Location.DORMITORY, 1);
    }};
    public static final int[][] matrix = {
            {10, 8},
            {8, 0},
    };

    public LocationQuestion(String string) {
        init(string);
    }

    private void init(String string) {
        switch (string){
            case "Минск":
                location=Location.MINSK;
                break;
            case "Общежитие":
                location=Location.DORMITORY;
                break;
        }
    }

    public LocationQuestion() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LocationQuestion{" +
                "location=" + location +
                '}';
    }
}
