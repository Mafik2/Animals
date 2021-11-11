package com.company;

import java.time.LocalDate;

public class Animals {
    protected String name;
    protected float weight;
    protected LocalDate birthday;
    protected String yell;


    public void eat(float food) {
        setWeight(weight + food);
    }

    public void wc(float poo){
        setWeight(weight - 1);
    }
    public void sound( String yell){
        setYell(this.yell = yell);
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public void setYell(String yell) {
        this.yell = yell;
    }

    public String getYell() {
        return yell;
    }
}
