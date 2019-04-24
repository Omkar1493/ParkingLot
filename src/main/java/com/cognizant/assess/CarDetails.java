package com.cognizant.assess;

import java.time.Duration;
import java.util.Date;
import java.util.Timer;

public class CarDetails {
    String name;
    int duration;
    public CarDetails(String name,
                      int duration){
        this.name=name;
        this.duration=duration;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
