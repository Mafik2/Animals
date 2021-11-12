package com.company;

import java.time.LocalDate;

public class AnimalDuck extends Animals {

    public AnimalDuck(String name, float weight, LocalDate birthday) {
        this.name = name;
        this.weight = weight;
        this.birthday = birthday;
    }

    public boolean fly() {
        if (weight >= 1.6){
            return false ;
        }
        return true;
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public LocalDate getBirthday() {
        return super.getBirthday();
    }
}
