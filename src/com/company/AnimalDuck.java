package com.company;

import java.time.LocalDate;

public class AnimalDuck extends Animals {
    public boolean fly;

    public AnimalDuck(String name, float weight, LocalDate birthday) {
        this.name = name;
        this.weight = weight;
        this.birthday = birthday;
    }

    public void canFly() {
        if (weight >= 1.6); setFly(false);
        if (weight <= 1.6); setFly(true);
    }

    public void setFly(boolean fly) {
        this.fly = fly;
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
