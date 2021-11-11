package com.company;

import java.time.LocalDate;

public class AnimalCat extends Animals {
    public int lives;

    public AnimalCat(String name, float weight, LocalDate birthday, int lives) {
        this.name = name;
        this.weight = weight;
        this.birthday = birthday;
        this.lives = lives;

    }
    public void fall(){
        setLives(lives - 1);
    }

    public void IsAlive() {
        if (lives == 0) System.out.println("Cat pass out :(");
    }


    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public LocalDate getBirthday() {
        return super.getBirthday();
    }

    public int getLives() {
        return lives;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }
}
