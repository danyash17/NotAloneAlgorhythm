package com.example.notalone.entity.question;

import com.example.notalone.enums.Location;

public class LocationQuestion implements Question{
    private Location location;

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
