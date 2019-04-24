package com.cognizant.assess;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<CarDetails> c1=new ArrayList<>();

    public int getCarCount() {
        return c1.size();
    }
    public int entry(CarDetails c){
        c1.add(c);
        return c1.size();
    }
    public int exit(CarDetails c){
        c1.remove(c);
        return c1.size();
    }

    public int getCarDetails(CarDetails c) {

        System.out.println(c.getName()+c.getDuration());
        return c1.size();
    }
}