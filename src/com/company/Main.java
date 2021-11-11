package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        AnimalCat karel = new AnimalCat("Karel", 10, LocalDate.of(2018, 12, 12), 1);
        AnimalDog hozna = new AnimalDog("Honza", 15, LocalDate.of(2014, 8, 1), true);
        AnimalDuck anicka = new AnimalDuck("Anicka", 1, LocalDate.of(2005, 8, 8));
        karel.sound("Meow");
        hozna.sound("Haff");
        anicka.sound("Kvák");
        System.out.println("Jak dělá Karel?! Karel dělá: " + karel.getYell());
        System.out.println("Kocour " + karel.getName() + " váží: " + karel.getWeight() + ", narodil se: " + karel.getBirthday() + " a životů má jen: " + karel.getLives());
        karel.IsAlive();
        karel.eat(2);
        karel.wc(1);
        System.out.println("Kocour " + karel.getName() + " váží: " + karel.getWeight() + ", narodil se: " + karel.getBirthday() + " a životů má jen: " + karel.getLives());
        karel.IsAlive();
        System.out.println();
        System.out.println("Jak dělá Honzík?! Honzík dělá: " + hozna.getYell());
        System.out.println("Pes " + hozna.getName() + " váží: " + hozna.getWeight() + " a narodil se: " + hozna.getBirthday() + ". Má obojek? " + hozna.collar);
        hozna.collarPutOff();
        hozna.eat(1);
        hozna.wc(2);
        System.out.println("Pes " + hozna.getName() + " váží: " + hozna.getWeight() + " a narodil se: " + hozna.getBirthday() + ". Má obojek? " + hozna.collar);
        System.out.println();
        System.out.println("Jak dělá Anička, Anička dělá: " + anicka.getYell());
        System.out.println("Kachna " + anicka.getName() + " váží: " + anicka.getWeight() + " a narodila se: " + anicka.getBirthday() + ". Může létat? " + anicka.fly);
        anicka.eat(2);
        anicka.wc(1);
        System.out.println("Kachna " + anicka.getName() + " váží: " + anicka.getWeight() + " a narodila se: " + anicka.getBirthday() + ". Může létat? " + anicka.fly);

    }
}
