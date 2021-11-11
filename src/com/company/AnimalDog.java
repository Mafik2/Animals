package com.company;

import java.time.LocalDate;

public class AnimalDog extends Animals {
    public boolean collar;

    public AnimalDog(String name, float weight, LocalDate birthday, boolean collar) {
        this.name = name;
        this.weight = weight;
        this.birthday = birthday;
        this.collar = collar;
    }


    public void collarPutOn() {
        setCollar(collar == true);
    }

    public void collarPutOff() {
        setCollar(collar == false);
    }

    public void setCollar(boolean collar) {
        this.collar = collar;
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
